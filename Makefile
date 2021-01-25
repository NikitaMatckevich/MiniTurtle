# path to sources

SRCPATH := src/mini_turtle

# integrate auto-generated java files into project via jar file

JAVAC := javac -cp lib/java-cup-11a-runtime.jar -d bin

all: $(SRCPATH)/lexer.java $(SRCPATH)/parser.java
	$(JAVAC) $(SRCPATH)/*.java

# cup and flex compilation into .java files

JAVACUP := java -jar ../../lib/java-cup-11a.jar 

$(SRCPATH)/parser.java $(SRCPATH)/sym.java: $(SRCPATH)/Parser.cup
	rm -f $@
	cd $(SRCPATH) && $(JAVACUP) -package mini_turtle Parser.cup

JAVAFLEX := jflex 

$(SRCPATH)/lexer.java: $(SRCPATH)/Lexer.flex
	rm -f $@
	$(JAVAFLEX) $<
