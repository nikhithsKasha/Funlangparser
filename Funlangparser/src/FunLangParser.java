/**
 * Recursive descent parser for the FunLang language and below is the implementation of the parser
 */
class FunLangParser implements FunlangTokens{

    private FunLangLexer lexer;


    public FunLangParser(FunLangLexer lexer) {
        this.lexer = lexer;
    }

    //it will parse the program
    public void parse() {
        // call the start symbol
        program();
    }


    /** 
     * Parse a program.
     */
    private void program() {

        while(lexer.next() != EOF) {
            stmnt();
        }


    }


    /**
     * Parse a stmnt.
     */
    private void stmnt()
    {
        // check for refOrExpr
        if(has(REF) || has(LPAREN)|| has(RPAREN) || has(INTEGER) || has(FLOAT)||has(LBRACK)||has(RBRACK)||has(CHARACTER)) {
            refOrExpr();
        } else {
            mustBe(PRINT);
            print();
        }
    }


    /** 
     * Parse ref-or-expr
     */
    private void refOrExpr()
    {
        if(has(REF)) {
            //consume the reference
            lexer.next();
            refOrExpr2();
            refOrExpr3();
        } else {
            expr();
        }
    }


    /**
     * Parse ref-or-expr'
     */
    private void refOrExpr2()
    {
        if(has(ASSIGN)) {
            //consume the assign
            lexer.next();
            expr();
        } else {
            expr2();
        }
    }

    /**
     * Parse ref-or-expr'
     */
    private void refOrExpr3()
    {
        if(has(SWAP)){
            //consume the swap
            lexer.next();
            expr();
        }
    }
    /**
     * Parse expr
     */
    private void expr()
    {
        term();
        expr2();
    }


    /**
     * Parse expr'
     */
    private void expr2()
    {
        if(has(PLUS)) {
            //addition
            lexer.next();
            term();
            expr2();
        } else if(has(MINUS)){
            //subtraction
            lexer.next();
            term();
            expr2();
        }

        //empty (no mustBe())
    }


    /**
     * Parse term
     */
    private void term()
    {
        factor();
        term2();
    }


    /**
     * Parse term'
     */
    private void term2()
    {
        if(has(TIMES)) {
            //multiplication
            lexer.next();
            factor();
            term2();
        }else if(has(DIVIDE)){
            //division
            lexer.next();
            factor();
            term2();
        }
    }

    /**
     * Parse Exponent
     */
    private void exponent()
    {
        if(has(LPAREN)) {
            //consume (
            lexer.next();

            //consume expr
            expr();

            //consume )
            mustBe(RPAREN);
            lexer.next();
        } else if(has(REF)) {
            //reference
            lexer.next();
        } else if(has(INTEGER)) {
            // integer literal
            lexer.next();
        } else {
            // float literal is all that is left
            mustBe(FLOAT);
            lexer.next();
        }
    }

    /**
     * Parse factor
     */
    private void factor()
    {
        exponent();
        factor2();
    }


    /** 
     * Parse factor2
     */
    private void factor2() 
    {
        if(has(EXPONENT)) {
            //exponent
            lexer.next();
            factor();
        }
    }




    /** 
     * Parse for the print statemnt.
     */
    private void print() {
        //consume print
        mustBe(PRINT);
        lexer.next();

        argList();
    }


    /** 
     * Parse arg-list.
     */
    private void argList() {
        arg();
        argList2();
    }

   
    /**
     * Parse arg-list'
     */
    private void argList2() {
        if(has(COMMA)) {
            lexer.next();
            arg();
            argList2();
        }
    }

    /** 
     * Parse arg
     */
    private void arg() {
        if(has(STRING)) {
            //consume the string
            lexer.next();
        } else {
            expr();
        }
    }


    /**
     * Only returns if the current token is the specified token.
     * Terminates the program otherwise.
     */
    private void mustBe(int token) {
        if(token != lexer.token()) {
            System.out.printf("Parser error at line %d, column %d.",
            lexer.lineNumber(), lexer.columnNumber());
            System.exit(-1); //terminate the program
        }

        return;
    }


    /**
     * Return true if the current token is the specified token.
     */
    private boolean has(int token) {
        return lexer.token() == token;
    }


    public static void main(String [] args) {
        FunLangParser parser = new FunLangParser(new FunLangLexer(System.in));
        parser.parse();
        System.out.println("Success!");
    }
}
