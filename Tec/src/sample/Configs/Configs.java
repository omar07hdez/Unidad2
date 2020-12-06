package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "Puerta", "Puertas", "Llanta", "Llantas", "Parabrisa"
            , "Parabrisas", "Rin", "Rines", "Amortiguador", "Amortiguadores",
            "de","Negro", "Negros","Negra","Negras", "Naranja", "Naranjas", "Rojo", "Rojos", "Roja", "Rojas", "Azul" , "Azules",
            "y","1","2","3","4","5","6","7","8","9","Nueva", "nuevo", "Nuevas",
            "Nuevos", "seminueva", "seminuevo","Ford150","Mustang", "Sentra","Altima"

            /*"abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "public", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"*/
    };

    public static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    public static final String PAREN_PATTERN = "\\(|\\)";
    public static final String BRACE_PATTERN = "\\{|\\}";
    public static final String BRACKET_PATTERN = "\\[|\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    public static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    public static final String sampleCode = String.join("\n", new String[] {

            "4 Llantas de Y",
            "2 X de Ford150",
            "4 X de Y",
            "3 Puertas de Y",
            "1 Rin de Altima",
            "2 Puertas Nuevas de Y",
            "1 X Nueva de Sentra",
            "4 Rines de X",
            "4 X de Y",
            "2 Puerta de Mustang y Y"
//            "package com.example;",
//            "",
//            "import java.util.*;",
//            "",
//            "public class Foo extends Bar implements Baz {",
//            "",
//            "    /*",
//            "     * multi-line comment",
//            "     */",
//            "    public static void main(String[] args) {",
//            "        // single-line comment",
//            "        for(String arg: args) {",
//            "            if(arg.length() != 0)",
//            "                System.out.println(arg);",
//            "            else",
//            "                System.err.println(\"Warning: empty string as argument\");",
//            "        }",
//            "    }",
//            "",
//            "}"
    });




    public static String[] expresiones={
            "[2-9] Llantas de [A-Za-z]+",
            "2 [A-Za-z]+ de Ford150",
            "4 [A-Za-z]+ de [A-Za-z]+",
            "[2-9] Puertas de [A-Za-z]+",
            "1 [A-Za-z]+ de Altima",
            "2 Puertas (Nuevas|Seminuevos) de [A-Za-z]+",
            "1 [A-Za-z]+ Nueva de Sentra",
            "4 Rines de [A-Za-z]+",
            "[2-9] [A-Za-z]+ de [A-Za-z]+",
            "2 [A-Za-z]+ de Mustang y [A-Za-z]+"

    };
}
