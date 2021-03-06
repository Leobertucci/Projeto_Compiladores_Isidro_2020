package Commands;

import java.util.ArrayList;

public class CommandFacaEnquanto extends AbstractCommands {

    private String loopCondition;
    private ArrayList<AbstractCommands> loopCommands;

    public CommandFacaEnquanto(String loopCondition, ArrayList<AbstractCommands> loopCommands)
    {
        this.loopCondition = loopCondition;
        this.loopCommands = loopCommands;
    }

    @Override
    public String generateJavaCode() {

        StringBuilder str = new StringBuilder();



        str.append("do {\n");
        for(AbstractCommands cmd : loopCommands) {
            str.append(cmd.generateJavaCode());
        }
        str.append("\n} while ("+loopCondition+")");
        return str.toString();

    }

    @Override
    public String toString() {
        return "CommandEnquanto [fa�a=" + loopCommands + ", loopCondition " + loopCondition
                + "]";
    }

}