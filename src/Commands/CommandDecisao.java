package Commands;

import java.util.ArrayList;

public class CommandDecisao extends AbstractCommands {

	private String condition;
	private ArrayList<AbstractCommands> listaTrue;
	private ArrayList<AbstractCommands> listaFalse;
	
	public CommandDecisao(String condition, ArrayList<AbstractCommands> lt, ArrayList<AbstractCommands> lf) {
		this.condition = condition;
		this.listaTrue = lt;
		this.listaFalse = lf;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("if ("+condition+") {\n");
		for (AbstractCommands cmd: listaTrue) {
			str.append(cmd.generateJavaCode());
		}
		str.append("}");
		if (listaFalse.size() > 0) {
			str.append("else {\n");
			for (AbstractCommands cmd: listaFalse) {
				str.append(cmd.generateJavaCode());
			}
			str.append("}\n");
		
		}
		return str.toString();
	}
	@Override
	public String toString() {
		return "CommandDecisao [condition=" + condition + ", listaTrue=" + listaTrue + ", listaFalse=" + listaFalse
				+ "]";
	}
	
}
