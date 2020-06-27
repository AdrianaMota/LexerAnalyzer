package com.actividad1.ejercicio3;
import static com.actividad1.ejercicio3.Tokens.*;

%%
%class Lexer
%type Tokens
A=1{1}0{1}[0-9]{5}

%{
    public String lexeme;
%}
%%

{A} {lexeme=yytext(); return Tokens.Verdadero;}