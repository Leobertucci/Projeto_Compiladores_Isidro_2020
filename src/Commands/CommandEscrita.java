package Commands;

public class CommandEscrita extends AbstractCommands {

	private String id;
	
	public CommandEscrita(String id) {
		this.id = id;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		return "System.out.println("+id+");";
	}
	@Override
	public String toString() {
		return "CommandEscrita [id=" + id + "]";
	}
	
}
