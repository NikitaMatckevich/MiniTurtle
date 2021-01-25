package mini_turtle;

import java_cup.runtime.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String file = args.length > 0 ? args[0] : "test.logo";
		java.io.Reader reader = new java.io.FileReader(file);
		lexer lexer = new lexer(reader);
		parser parser = new parser(lexer);
		File f = (File) parser.parse().value;
		for (Def d: f.l) {
			Interp.functions.put(d.f, d);
		}
		Interp.turtle = new Turtle();
		try {
			f.s.accept(new Interp());
		} catch (Error e) {
			System.out.println("error: " + e.toString());
			System.exit(1);
		}
	}
}