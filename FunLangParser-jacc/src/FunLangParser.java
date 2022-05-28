// Output created by jacc on Thu 14 Oct 21 21:24:29 CDT 2021


class FunLangParser implements FunlangTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public void parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.token()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case PRINT:
                            yyn = 12;
                            continue;
                        case REF:
                            yyn = 13;
                            continue;
                        case READ:
                            yyn = 14;
                            continue;
                        case END:
                            yyn = 15;
                            continue;
                        case BEGIN:
                            yyn = 16;
                            continue;
                        case IF:
                            yyn = 17;
                            continue;
                        case ELSE:
                            yyn = 18;
                            continue;
                        case WHILE:
                            yyn = 19;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 72;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                        case STRING:
                            yyn = 25;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case MINUS:
                            yyn = 14;
                            continue;
                        case PLUS:
                            yyn = 15;
                            continue;
                        case RPAREN:
                            yyn = 32;
                            continue;
                        case RBRACK:
                            yyn = 79;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case LBRACK:
                            yyn = 78;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.value()
                                 );
                    yytok = (lexer.next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 9;
                            continue;
                        case INTEGER:
                            yyn = 10;
                            continue;
                        case LPAREN:
                            yyn = 11;
                            continue;
                        case REF:
                            yyn = 21;
                            continue;
                        case STRING:
                            yyn = 25;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys35();
                    continue;

                case 72:
                    return;
                case 73:
                    yyERROR("stack overflow");
                case 74:
                    return;
                case 75:
                    yyERROR("syntax ERROR");
                    return;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys2() {
        switch (yytok) {
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
                return yyr3();
        }
        return 75;
    }

    private int yys3() {
        switch (yytok) {
            case EOF:
            case ASSIGN:
            case ERROR:
            case STRING:
            case EQUAL:
            case INVALID:
                return 75;
        }
        return yyr13();
    }

    private int yys4() {
        switch (yytok) {
            case MINUS:
                return 14;
            case PLUS:
                return 15;
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
            case READ:
            case END:
            case BEGIN:
            case IF:
            case ELSE:
            case WHILE:


                return yyr4();
        }
        return 75;
    }

    private int yys5() {
        switch (yytok) {
            case ASSIGN:
            case INVALID:
            case ERROR:
            case STRING:
            case EOF:
            case EQUAL:
                return 75;
            case EXPONENT:
                return 16;
        }
        return yyr10();
    }

    private int yys6() {
        switch (yytok) {
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
            case READ:
            case END:
            case BEGIN:
            case IF:
            case ELSE:
            case WHILE:
                return yyr5();
        }
        return 75;
    }

    private int yys7() {
        switch (yytok) {
            case FLOAT:
                return 9;
            case INTEGER:
                return 10;
            case LPAREN:
                return 11;
            case LBRACK:
                return 78;
            case PRINT:
                return 12;
            case REF:
                return 13;
            case READ:
               return 14;

            case END:
                return 15;
            case BEGIN:
                return 16;
            case IF:
                return 17;

            case ELSE:
                return 18;

            case WHILE:
                return 19;

            case ENDINPUT:
                return yyr1();
        }
        return 75;
    }

    private int yys8() {
        switch (yytok) {
            case EQUAL:
            case ASSIGN:
            case STRING:
            case EOF:
            case ERROR:
            case EXPONENT:
            case INVALID:
                return 75;
            case DIVIDE:
                return 18;
            case TIMES:
                return 19;
        }
        return yyr7();
    }

    private int yys9() {
        switch (yytok) {
            case EOF:
            case ASSIGN:
            case ERROR:
            case STRING:
            case EQUAL:
            case INVALID:
                return 75;
        }
        return yyr18();
    }

    private int yys10() {
        switch (yytok) {
            case EOF:
            case ASSIGN:
            case ERROR:
            case STRING:
            case EQUAL:
            case INVALID:
                return 75;
        }
        return yyr17();
    }

    private int yys13() {
        switch (yytok) {
            case INVALID:
            case EQUAL:
            case STRING:
            case EOF:
            case RPAREN:
            case RBRACK:
            case ERROR:
            case COMMA:
                return 75;
            case ASSIGN:
                return 26;
        }
        return yyr16();
    }

    private int yys21() {
        switch (yytok) {
            case EOF:
            case ASSIGN:
            case ERROR:
            case STRING:
            case EQUAL:
            case INVALID:
                return 75;
        }
        return yyr16();
    }

    private int yys22() {
        switch (yytok) {
            case COMMA:
                return 33;
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
                return yyr19();
        }
        return 75;
    }

    private int yys23() {
        switch (yytok) {
            case MINUS:
                return 14;
            case PLUS:
                return 15;
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
            case COMMA:
            case READ:
            case END:
            case BEGIN:
            case IF:
            case ELSE:
            case WHILE:
                return yyr22();
        }
        return 75;
    }

    private int yys24() {
        switch (yytok) {
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case END:
            case BEGIN:
            case IF:
            case ELSE:
            case WHILE:
            case INTEGER:
            case COMMA:
            case READ:

                return yyr20();
        }
        return 75;
    }

    private int yys25() {
        switch (yytok) {
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case LBRACK:
            case ENDINPUT:
            case INTEGER:
            case BEGIN:
            case IF:
            case ELSE:
            case WHILE:
            case COMMA:
            case READ:
            case END:

                return yyr23();
        }
        return 75;
    }

    private int yys27() {
        switch (yytok) {
            case EQUAL:
            case ASSIGN:
            case STRING:
            case EOF:
            case ERROR:
            case EXPONENT:
            case INVALID:
                return 75;
            case DIVIDE:
                return 18;
            case TIMES:
                return 19;
        }
        return yyr9();
    }

    private int yys28() {
        switch (yytok) {
            case EQUAL:
            case ASSIGN:
            case STRING:
            case EOF:
            case ERROR:
            case EXPONENT:
            case INVALID:
                return 75;
            case DIVIDE:
                return 18;
            case TIMES:
                return 19;
        }
        return yyr8();
    }

    private int yys29() {
        switch (yytok) {
            case ASSIGN:
            case INVALID:
            case ERROR:
            case STRING:
            case EOF:
            case EQUAL:
                return 75;
            case EXPONENT:
                return 16;
        }
        return yyr14();
    }

    private int yys30() {
        switch (yytok) {
            case ASSIGN:
            case INVALID:
            case ERROR:
            case STRING:
            case EOF:
            case EQUAL:
                return 75;
            case EXPONENT:
                return 16;
        }
        return yyr12();
    }

    private int yys31() {
        switch (yytok) {
            case ASSIGN:
            case INVALID:
            case ERROR:
            case STRING:
            case EOF:
            case EQUAL:
                return 75;
            case EXPONENT:
                return 16;
        }
        return yyr11();
    }

    private int yys32() {
        switch (yytok) {
            case EOF:
            case ASSIGN:
            case ERROR:
            case STRING:
            case EQUAL:
            case INVALID:
                return 75;
        }
        return yyr15();
    }

    private int yys34() {
        switch (yytok) {
            case MINUS:
                return 14;
            case PLUS:
                return 15;
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case ENDINPUT:
            case INTEGER:
                return yyr6();
        }
        return 75;
    }

    private int yys35() {
        switch (yytok) {
            case REF:
            case FLOAT:
            case PRINT:
            case LPAREN:
            case ENDINPUT:
            case INTEGER:
            case COMMA:
            case READ:
            case END:
            case BEGIN:
            case LBRACK:


                return yyr21();
        }
        return 75;
    }

    private int yyr1() { // program : stmnt
        yysp -= 1;
        return yypprogram();
    }

    private int yyr2() { // program : stmnt program
        yysp -= 2;
        return yypprogram();
    }

    private int yypprogram() {
        switch (yyst[yysp-1]) {
            case 0: return 1;
            default: return 17;
        }
    }

    private int yyr20() { // argList : arg
        yysp -= 1;
        return 22;
    }

    private int yyr21() { // argList : argList COMMA arg
        yysp -= 3;
        return 22;
    }

    private int yyr6() { // assign : REF ASSIGN expr
        yysp -= 3;
        return 2;
    }

    private int yyr15() { // exponent : LPAREN expr RPAREN
        yysp -= 3;
        return 3;
    }

    private int yyr16() { // exponent : REF
        yysp -= 1;
        return 3;
    }

    private int yyr17() { // exponent : INTEGER
        yysp -= 1;
        return 3;
    }

    private int yyr18() { // exponent : FLOAT
        yysp -= 1;
        return 3;
    }

    private int yyr7() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr8() { // expr : expr PLUS term
        yysp -= 3;
        return yypexpr();
    }

    private int yyr9() { // expr : expr MINUS term
        yysp -= 3;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 26: return 34;
            case 11: return 20;
            case 7: return 4;
            case 0: return 4;
            default: return 23;
        }
    }

    private int yyr13() { // factor : exponent
        yysp -= 1;
        return yypfactor();
    }

    private int yyr14() { // factor : factor EXPONENT factor
        yysp -= 3;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 19: return 31;
            case 18: return 30;
            case 16: return 29;
            default: return 5;
        }
    }

    private int yyr19() { // print : PRINT argList
        yysp -= 2;
        return 6;
    }

    private int yyr22() { // arg : expr
        yysp -= 1;
        return yyparg();
    }

    private int yyr23() { // arg : STRING
        yysp -= 1;
        return yyparg();
    }

    private int yyparg() {
        switch (yyst[yysp-1]) {
            case 12: return 24;
            default: return 35;
        }
    }

    private int yyr3() { // stmnt : assign
        yysp -= 1;
        return 7;
    }

    private int yyr4() { // stmnt : expr
        yysp -= 1;
        return 7;
    }

    private int yyr5() { // stmnt : print
        yysp -= 1;
        return 7;
    }

    private int yyr10() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr11() { // term : term TIMES factor
        yysp -= 3;
        return yypterm();
    }

    private int yyr12() { // term : term DIVIDE factor
        yysp -= 3;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 15: return 28;
            case 14: return 27;
            default: return 8;
        }
    }

    protected String[] yyerrmsgs = {
    };


    private FunLangLexer lexer;

    public FunLangParser()
    {
        lexer = new FunLangLexer(System.in);
        lexer.next();
    }


    public void yyERROR(String msg) {
        System.out.printf("Parse ERROR line: %d column: %d %s", lexer.lineNumber(), lexer.columnNumber(), msg);
    }


    public static void main(String [] args) {
        FunLangParser parser = new FunLangParser();
        parser.parse();
    }

}
