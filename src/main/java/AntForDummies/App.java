package AntForDummies;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

public class App {

    public static void main(String[] args) {
        System.out.println("This is a dummie project to demo how to write an Ant file");
        System.out.println("In this project, I am referencing a dependency in the lib directory.");
        System.out.println("I am using apache commons cli and created an option\n\n");

        Options o = new Options();
        o.addOption("p", "print", false, "Send print request to printer");

        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("AntForDummies", o);
    }

}