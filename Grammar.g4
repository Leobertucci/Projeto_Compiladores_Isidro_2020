grammar Grammar;

@header{
	import DataStructures.*;
	import Exeptions.*;
	import Parser.*;
	import java.util.ArrayList;
	import Commands.*;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	private IsiProgram program = new IsiProgram();
	private ArrayList<AbstractCommands> curThread;
	private Stack<ArrayList<AbstractCommands>> stack = new Stack<ArrayList<AbstractCommands>>();
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private String _exprWhile;
	private ArrayList<AbstractCommands> listaTrue;
	private ArrayList<AbstractCommands> listaFalse;
	private ArrayList<AbstractCommands> listaLoop;
	public void verificaID(String id){
		if (!symbolTable.exists(id)){
			throw new IsiExceptions("Symbol "+id+" not declared");
		}
		if (!((IsiVariable)(symbolTable.get(id))).getAtrib()){
			throw new IsiExceptions("Symbol "+id+" not assigned");
		}	
	}
	public void exibeComandos(){
		for (AbstractCommands c: program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
	}
}


prog	: 	'programa' decl bloco  'fimprog;' 
			{  
				program.setVarTable(symbolTable);
           	  	program.setComandos(stack.pop());
           	 	
				ArrayList<IsiSymbol> lista = symbolTable.getAll();			
				for(int i=0;i<lista.size();i++)
                {
                    boolean t;
                    boolean j;
                    t=((IsiVariable)(lista.get(i))).getAtrib();
                   if(t)
                    {
                        j=((IsiVariable)(lista.get(i))).getUso();
                        if(j)
                        {

                        }
                        else
                        {
                			System.out.println("Variavel "+ lista.get(i).getName()+" Foi atribhida mas não foi usada");
                        }
                    }
                else
                    {
                        System.out.println("Variavel "+ lista.get(i).getName()+" Foi declarada mas não foi Atribuida");

                    }
               }			
           }
		;

decl    :  (declaravar)+
        ;
        
        
declaravar :  tipo ID  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiExceptions("Symbol "+_varName+" already declared");
	                  }
                    } 
              (  VIR 
              	 ID {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiExceptions("Symbol "+_varName+" already declared");
	                  }
                    }
              )* 
               SC
           ;
		
tipo	: 'numero' { _tipo = IsiVariable.NUMBER;}
		| 'texto'  { _tipo = IsiVariable.TEXT;}
		;
		
bloco	: 	{ curThread = new ArrayList<AbstractCommands>(); 
	        stack.push(curThread);  
          	}
			(cmd)+
		;
		

cmd		:  cmdleitura 
 		|  cmdescrita 
 		|  cmdattrib  
		|  cmdif 	  
		|  cmdloop    
		;
		
cmdleitura	: 'leia' AP
                     ID 
                     { 	if (symbolTable.exists(_input.LT(-1).getText())){
                     		((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setAtrib(true);	
                     	}
                     	verificaID(_input.LT(-1).getText());
                     	_readID = _input.LT(-1).getText();
                     }  
                     FP 
                     SC 
                     {
              			IsiVariable var = (IsiVariable)symbolTable.get(_readID);
              			CommandLeitura cmd = new CommandLeitura(_readID, var);
              			stack.peek().add(cmd);
              		 }  
			;
			
cmdescrita	: 'escreva' AP
					 	ID 
						{ 	verificaID(_input.LT(-1).getText());
							((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
	                  		_writeID = _input.LT(-1).getText();
                     	}  
					 	FP 
					 	SC
					 	{
               	  			CommandEscrita cmd = new CommandEscrita(_writeID);
               	  			stack.peek().add(cmd);
               			}
               			
			;
			
cmdattrib	:  	ID 
				{ 	if (symbolTable.exists(_input.LT(-1).getText())){
                     	((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setAtrib(true);	
                    }
					verificaID(_input.LT(-1).getText());
                    _exprID = _input.LT(-1).getText();
                } 
			 	ATTR
			 	{ _exprContent = ""; } 
			 	expr 
			 	SC
			 	{

               	 	CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
               	 	stack.peek().add(cmd);
               	}
			;
cmdif       : 	'se' AP 
				ID 
				{
					verificaID(_input.LT(-1).getText());
					((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
					_exprDecision = _input.LT(-1).getText();
				}
				OPREL { _exprDecision += _input.LT(-1).getText(); }
				(ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
				FP 
				AC
				{ 	curThread = new ArrayList<AbstractCommands>(); 
                    stack.push(curThread);
                }
				(cmd)+ 
				FC 
				{
                  	listaTrue = stack.pop();	
                }
				('senao' 
					AC
                   	{
                   	 	curThread = new ArrayList<AbstractCommands>();
                   	 	stack.push(curThread);
                   	}
					(cmd)+ 
					FC
					{
                   		listaFalse = stack.pop();
                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
                   		stack.peek().add(cmd);
                   	}
				)?
			;
cmdloop     :     'enquanto' AP 
                expr {_exprWhile = _input.LT(-1).getText();} 
                OPREL {_exprWhile += _input.LT(-1).getText();}
                expr {_exprWhile += _input.LT(-1).getText();}
                FP 
                AC 
                {     curThread = new ArrayList<AbstractCommands>(); 
                    stack.push(curThread);
                }
                (cmd)+
                 FC
                 {
                      listaLoop = stack.pop();
                      CommandEnquanto cmd = new CommandEnquanto(_exprWhile, listaLoop);
                      stack.peek().add(cmd);
                }

            | 'faca' 
                AC
                {     curThread = new ArrayList<AbstractCommands>(); 
                    stack.push(curThread);
                }
             (cmd)+ 
             FC 
             'enquanto' AP
              expr {_exprWhile = _input.LT(-1).getText();}
              OPREL{_exprWhile += _input.LT(-1).getText();}
              expr {_exprWhile += _input.LT(-1).getText();}
              FP
                  {   listaLoop = stack.pop();
                      CommandFacaEnquanto cmd = new CommandFacaEnquanto(_exprWhile, listaLoop);
                      stack.peek().add(cmd);
                }
            ;
            
expr		:  	termo ( 
				OP { _exprContent += _input.LT(-1).getText();}
				termo
				)*
			;
			
termo		: ID { verificaID(_input.LT(-1).getText());
				   ((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
	               _exprContent += _input.LT(-1).getText();
                 } 
			| NUMBER
				{
              		_exprContent += _input.LT(-1).getText();
              	}
			;
	
OPREL		: '<' | '>' | '<=' | '>=' | '!=' | '=='
			;		
	
AP	: '('
	;
	
FP	: ')'
	;
	
AC	: '{'
	;
	
FC	: '}'
	;
	
VIR	: ','
	;
		
SC	: ';'
	;
	
OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : '='
	 ;
	 
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	| [A-Z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
		;
		
TEXT	: ASP ([a-z] | [A-Z] | [0-9])+ ASP 
		;
		
ASP		: '"'
		;
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip;
