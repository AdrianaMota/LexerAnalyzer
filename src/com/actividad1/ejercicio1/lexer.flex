package com.actividad1.ejercicio1;
import static com.actividad1.ejercicio1.Tokens.*;

%%
%class Lexer
%type Tokens
LETRAS=[a-zA-Z_]
DIGITO=[0-9]
IDENTIFICADOR={LETRAS}+({DIGITO}|{LETRAS})+({DIGITO}|{LETRAS})

%{
    public String lexeme;
%}

%%

{IDENTIFICADOR} {lexeme=yytext(); return Tokens.IDENTIFIER; }