package Commands;

import java.util.ArrayList;

public class CommandEnquanto extends AbstractCommands{

    private String loopCondition;
    private ArrayList<AbstractCommands> loopCommands;

    public CommandEnquanto(String loopCondition, ArrayList<AbstractCommands> loopCommands)
    {
        this.loopCondition = loopCondition;
        this.loopCommands = loopCommands;
    }

    @Override
    public String generateJavaCode() {

        StringBuilder str = new StringBuilder();
        str.append("while ("+loopCondition+") {\n");
        for(AbstractCommands cmd : loopCommands) {
            str.append(cmd.generateJavaCode());
        }
        str.append("}\n");
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandEnquanto [condition=" + loopCondition + ", loopCommands" + loopCommands
                + "]";
    }

}