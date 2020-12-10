package Commands;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import DataStructures.IsiVariable;
import DataStructures.IsiSymbol;
import DataStructures.IsiSymbolTable;

public class IsiProgram {
	
	private IsiSymbolTable varTable;
	private ArrayList<AbstractCommands> comandos;
	private String programName;

	public void generateTarget() {
		StringBuilder str = new StringBuilder();
		str.append("import java.util.Scanner;\n");
		str.append("public class MainClass{ \n");
		str.append("  public static void main(String args[]){\n ");
		str.append("      Scanner _key = new Scanner(System.in);\n");
		for (IsiSymbol symbol: varTable.getAll()) {
			str.append(symbol.generateJavaCode()+"\n");
		}
		for (AbstractCommands command: comandos) {
			str.append(command.generateJavaCode()+"\n");
		}
		str.append("  }");
		str.append("}");
		
		try {
			FileWriter fr = new FileWriter(new File("MainClass.java"));
			fr.write(str.toString());
			fr.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	public IsiSymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(IsiSymbolTable varTable) {
		this.varTable = varTable;
	}

	public ArrayList<AbstractCommands> getComandos() {
		return comandos;
	}

	public void setComandos(ArrayList<AbstractCommands> comandos) {
		this.comandos = comandos;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}
	
}
