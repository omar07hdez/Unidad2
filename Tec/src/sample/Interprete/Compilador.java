package sample.Interprete;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import static sample.Interprete.TiposToken.*;

public class Compilador {
//    String texto="";
    private TextArea consola;
    private VBox pane;
    public Compilador(TextArea tx,VBox pane){
        this.consola=tx;
        this.pane=pane;

    }
    public boolean compilar(String renglon){
        boolean error=false;
//        if (renglon.contains("print")) {
//            int i1 = renglon.indexOf('(') + 1;
//            int i2 = renglon.length() - 1;
//            String texto = renglon.substring(i1,i2);
//            this.consola.appendText("\n "+texto);
//        }else if (renglon.contains("declarar")){
//            String[] arreglo=renglon.split(" ");
//            if (!validar(arreglo[1].trim())){
//                String tipoToken="";
//                if (arreglo[3].equals("sarten")){
//                    tipoToken = SARTEN;
//
//                }else {
//                    tipoToken = CEBOLLA;
//                }
//                Token token=new Token(tipoToken,"100",arreglo[1].trim());
//                arrayToken.add(token);
//
//            }else {
//                this.consola.appendText("\n la variable con el nombre "+arreglo[1]+" ya esta delarada");
//            }
//        }else if (renglon.contains("cocinar")){
//            int i1 = renglon.indexOf('(') + 1;
//            int i2 = renglon.length() - 1;
//            String texto = renglon.substring(i1,i2).trim();
//            if (validar(texto)){
//
//                Token t1=buscarToken(texto);
//                System.out.println(t1.getNombre);
//                System.out.println(t1.getTipo());
//                System.out.println(t1.getValor());
//                Label label=new Label("Cocinando las "+t1.getValor()+" cebollas");
//                pane.getChildren().add(label);
//
//            }else {
//                this.consola.appendText("\n el ingrediente con el nombre "+texto+" no esta delarado");
//            }
//            this.consola.appendText("\n "+texto);
//        }







       /* if (renglon.contains("print")) {
            int i1 = renglon.indexOf('(') + 1;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1,i2);
            this.consola.appendText("\n "+texto);
//        }else */


        if (renglon.contains("declarar")){
            String[] arreglo=renglon.split(" ");
            if (!validar(arreglo[1].trim())){
                String tipoToken="";
                if (arreglo[2].equals("Llantas")){
                    if (arreglo[4].equals("Altima")){
                        tipoToken = ALTIMA;

                    }

                }else if (arreglo[2].equals("Puertas")){
                    if (arreglo[4].equals("Ford150")){
                        tipoToken = FORD150;
                    }else {
                        tipoToken = SENTRA;
                    }
                }else if (arreglo[2].equals("Puerta")){
                    if (arreglo[3].equals("Roja")) {
                        tipoToken =ROJA;
                    }else {
                        tipoToken=AZUL;
                    }

                }else if (arreglo[2].equals("Rines")){
                    if (arreglo[4].equals("Mustang")){
                        tipoToken = MUSTANG;
                    }
                }else if (arreglo[2].equals("Parabrisas")){
                    if (arreglo[4].equals("Sentra")){
                        tipoToken= SENTRA;
                    }
                }
                Token token=new Token(tipoToken,"2",arreglo[1].trim());
                arrayToken.add(token);


            }else {
                this.consola.appendText("\n la variable con el nombre "+arreglo[1]+" ya esta delarada");
            }
        }else if (renglon.contains("Puertas")){
            int i1 = renglon.indexOf('(') + 1;
            int i2 = renglon.length() - 1;
            String texto = renglon.substring(i1,i2).trim();
            if (validar(texto)){

                Token t1=buscarToken(texto);
                System.out.println(t1.getNombre);
                System.out.println(t1.getTipo());
                System.out.println(t1.getValor());
                Label label=new Label("Cotizando las "+t1.getValor()+" Puertas");
                pane.getChildren().add(label);

            }else {
                this.consola.appendText("\n el objeto con el nombre "+texto+" no esta delarado");
            }
            this.consola.appendText("\n "+texto);
        }

        return error;
    }
    public boolean validar(String nombre){
        boolean existe=false;
        for (int x=0;  x<arrayToken.size();x++){
            if (arrayToken.get(x).getNombre().equals(nombre)){
                existe=true;
            }
//
        }
        return existe;
    }
    public Token buscarToken(String nombre){
        Token existe=null;
        for (int x=0;  x<arrayToken.size();x++){
            if (arrayToken.get(x).getNombre().equals(nombre)){
                return  arrayToken.get(x);
            }
//
        }
        return existe;
    }
}
