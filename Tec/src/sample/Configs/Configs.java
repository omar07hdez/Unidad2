package sample.Configs;

import java.util.regex.Pattern;

public class Configs {
    public static final String[] KEYWORDS = new String[] {
            "Puerta", "Puertas", "Llanta", "Llantas", "Parabrisa"
            , "Parabrisas", "Rin", "Rines", "Amortiguador", "Amortiguadores",
            "de","Negro", "Negros","Negra","Negras", "Naranja", "Naranjas", "Rojo", "Rojos", "Roja", "Rojas", "Azul" , "Azules",
            "y","1","2","3","4","5","6","7","8","9","Nueva", "nuevo", "Nuevas",
            "Nuevos", "seminueva", "seminuevo","Ford150","Mustang", "Sentra","Altima","print","sarten","cebolla","declarar","como","cocinar"

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
//            "print(10)",
//            "declarar x como cebolla",
//            "cocinar(x)",

//
            "declarar x Llantas de Altima",
            "declarar y Puertas de Ford150",
            "declarar z Puerta Roja",
            "declarar e Rines de Mustang",
            "declarar v Parabrisa de Sentra",
            "Puertas(x)",


//            "1 X Nueva de Sentra",
//            "4 Rines de X",
//            "4 X de Y",
//            "2 Puerta de Mustang y Y"
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
//            "[2-9] Llantas de [A-Za-z]+",
//            "2 [A-Za-z]+ de Ford150",
//            "4 [A-Za-z]+ de [A-Za-z]+",
//            "[2-9] Puertas de [A-Za-z]+",
//            "1 [A-Za-z]+ de Altima",
//            "2 Puertas (Nuevas|Seminuevos) de [A-Za-z]+",
//            "1 [A-Za-z]+ Nueva de Sentra",
//            "4 Rines de [A-Za-z]+",
//            "[2-9] [A-Za-z]+ de [A-Za-z]+",
//            "2 [A-Za-z]+ de Mustang y [A-Za-z]+"



//            "sumar [a-z]{1,} mas [a-z]{1,}",

//            "declarar [a-z]{1,} como (sarten|cebolla)",
//            "print[(][a-z0-9]{1,}[)]",
//            "cocinar[(][a-z0-9]{1,}[)]"


            "declarar [0-9a-z]{1,} Llantas de Altima",
            "declarar [0-9a-z]{1,} Puertas de (Ford150|Sentra)",
            "declarar [0-9a-z]{1,} Puerta (Roja|Azul)",
            "declarar [0-9a-z]{1,} Rines de Mustang",
            "declarar [0-9a-z]{1,} Parabrisa de Sentra",
            "Puertas[(][a-z0-9]{1,}[)]",
    };
}
