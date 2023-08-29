package com.github.h3rmt.intellijyuck;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import static com.github.h3rmt.intellijyuck.psi.YuckTokenTypes.*;

%%

%{
  public _YuckLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _YuckLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

LINE_COMMENT = ";" [^\r\n]*
WHITE_SPACE=\s+

LETTER = [:letter:] | "_" | "-"
DIGIT =  [:digit:]

IDENT = {LETTER} ({LETTER} | {DIGIT} )*

INT_DIGIT = [0-9]
NUM_INT = ({INT_DIGIT} {INT_DIGIT}*) | {INT_DIGIT}
NUM_FLOAT = ({NUM_INT}? "." {INT_DIGIT} {NUM_INT})

STR_QUOTE =   "\""
ESCAPES = [abfnrtve] // check if supoprted
QUOTE_STRING = {STR_QUOTE} ([^\"\\] | "\\" ("\\" | {STR_QUOTE} | {ESCAPES} | [0-8xuU] ) )* {STR_QUOTE}

%%

<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }
  {LINE_COMMENT}         { return LINE_COMMENT; }
  {QUOTE_STRING}         { return STRING; }

  "("                    { return LPAREN; }
  ")"                    { return RPAREN; }
  "["                    { return LBRACKET; }
  "]"                    { return RBRACKET; }
  "'"                    { return SINGLE_QUOTE; }
  "\""                   { return DOUBLE_QUOTE; }
  ":monitor"             { return MONITORPROP; }
  ":wm-ignore"           { return WMIGNOREPROP; }
  ":class"               { return CLASSPROP; }
  ":valign"              { return VALIGNPROP; }
  ":halign"              { return HALIGNPROP; }
  ":vexpand"             { return VEXPANDPROP; }
  ":hexpand"             { return HEXPANDPROP; }
  ":width"               { return WIDTHPROP; }
  ":height"              { return HEIGHTPROP; }
  ":active"              { return ACTIVEPROP; }
  ":tooltip"             { return TOOLTIPPROP; }
  ":visible"             { return VISIBLEPROP; }
  ":style"               { return STYLEPROP; }
  ":css"                 { return CSSPROP; }
  ":timeout"             { return TIMEOUTPROP; }
  ":onchange"            { return ONCHANGEPROP; }
  ":name"                { return NAMEPROP; }
  ":expanded"            { return EXPANDEDPROP; }
  ":spacing"             { return SPACINGPROP; }
  ":orientation"         { return ORIENTATIONPROP; }
  ":space-evenly"        { return SPACEEVENLYPROP; }

  "defwindow"            { return DEFWINDOW; }
  "defwidget"            { return DEFWIDGET; }

  "combo-box-text"       { return COMBOBOXTEXT; }
  "expander"             { return EXPANDER; }
  "box"                  { return BOX; }
  "true"                 { return TRUE; }
  "false"                { return FALSE; }

  {NUM_FLOAT}            { return FLOAT; }
  {NUM_INT}              { return INT; }
  {IDENT}                { return IDENTIFIER; }
}


[^] { return BAD_CHARACTER; }
