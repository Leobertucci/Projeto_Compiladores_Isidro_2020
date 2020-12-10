package Main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import DataStructures.*;
import Exeptions.*;
import Parser.*;

public class Main {

	public static void main(String[] args) {
		try {
			GrammarLexer lexer;
			GrammarParser parser;
			
			// leio o arquivo "input.isi" e isso é entrada para o Analisador Lexico
			lexer = new GrammarLexer(CharStreams.fromFileName("input.isi"));
			
			// crio um "fluxo de tokens" para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// crio meu parser a partir desse tokenStream
			parser = new GrammarParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
			parser.exibeComandos();
			
			parser.generateCode();
			
		}
		catch(IsiExceptions ex) {
			System.err.println("Semantic error - "+ex.getMessage());
		}
		catch(Exception ex) {
			System.err.println("ERROR "+ex.getMessage());
		}
		
	}
	
}
