package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    @FXML
    TextField txtTexto;
    @FXML
    ListView lista;

    @FXML
    Label lblResultado;

    @FXML protected void initialize(){
        lista.getItems().addAll("Ejercicio 1",
                "Ejercicio 2",
                "Validad password",
                "Grupo",
                "Una palabra que no comience con db-",
                "Una palabra termine con cout",
                "Validar que hayan escrito dos nombres ejemplo villa",
                "Validar una MAC address",
                "Validar palabra que comience y termine en mayúscula",
                "Validar un numero binario de 8 digitos",
                "Validar que se haya escrito correctamente un numero Hezadecimal",
                "Validar que una operacion de 1 digito por ejemplo 1+2,2-3,5*5, etc",
                "Validar que se ingrese correctamente el numero de control de ITSNCG",
                "Validar que se registre correctamente el numero CURP",
                "Validar que haya insertado x cantidad de pesos(Ejemplo: $34.00mxn)",
                "Validar ek numero de una tarjeta de cradito",
                "Validar una etiqueta HTML",
                "Validar un color Hexadecimal",
                "Validar un link(ejemplo: http//novoyapasar.com)",
                "Validar el Query Insert into de SQL",
                "valiadr Sentencia if de x variable con x condicion(ejemplo:if(nopaso==true){",
                "Validar que se haya ecrito na frase con salto de linea(ejemplo:hola /n mundo",
                "Validar que se haya escrito una url con un video de youtube(ejemplo: http://www.youtube.com/watch?v=jNQXAC9IVRw ",
                "^[a-z0-9_-]{3,16}$",
                "^[a-z0-9-]+$",
                "Validar correo ",
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}",
                "[Rr][Gg][Bb][(](((([\\\\d]{1,3})[1,]{0,1})[\\\\s]*){3})[)]",
                "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$",
                "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$",
                "(?=.*[a-z])");


    }
    public void procesar (ActionEvent event){
        int seleccion = lista.getSelectionModel().getSelectedIndex();
        String texto =txtTexto.getText();
        String expresion="";

        switch (seleccion){
            case 0: {
                expresion="^[^_][^p]([a-zA-Z0-9]{3,})[q|w]$";

                break;
            }
            case 1:{
                expresion="^\\\\n([a-zA-Z]+)";
                break;
            }
            case 2:{

                expresion="^[@]([a-zA-Z0-9]{6,8})";
                break;

            }
            //ISC-3B
            case 3:{
                expresion="^(ISC)-([1-9])[A|B]$";
                break;
            }
            case 4:{
                expresion="^([^d|b|-]{1,})([a-zA-Z]{1,})";
                break;
            }
            case 5:{
                expresion="^([a-zA-Z]{1,})[(cout)]$";

                break;
            }
            case 6:{
                expresion="^([a-zA-Z]{1,})[ ]([a-zA-Z]{1,})";
                break;
            }
            case 7:{
                expresion="^([a-zA-Z0-9]{2})[-]([a-zA-Z0-9]{2})[-]([a-zA-Z0-9]{2})[-]([a-zA-Z0-9]{2})";
                break;
            }
            case 8:{
                expresion="^([a-zA-Z]{1,}[A-Z]$)";
                break;
            }
            case 9:{
                expresion="^([0-9]{1,8})";
                break;
            }
            case 10:{
                expresion="^[0-9A-F]+$";
                break;
            }
            case 11:{
                expresion="^([0-9]{1})[-|+|*]([0-9]{1})";
                break;
            }
            case 12:{
                expresion="^([0-9]{2})(CG|cg)([0-9]{4})$";
                break;
            }
            case 13:{
                expresion="^([A-Z][AEIOUX][A-Z]{2}\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[12]\\d|3[01])[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[B-DF-HJ-NP-TV-Z]{3}[A-Z\\d])(\\d)$";
                break;
            }
            case 14:{
                expresion="^[$][0-9]+(mxn)";
                break;
            }
            case 15:{
                expresion="^[0-9]{4}[0-9]{4}[0-9]{4}[0-9]{4}";
                break;
            }
            case 16:{
                expresion="^(<p>)[a-zA-Z0-9 ]+(<p/>)$";
                break;
            }
            case 17:{
                expresion="^#[0-9A-F]{6}$";
                break;
            }
            case 18:{
                expresion="^(http://)[0-9A-Fa-z]+(.com)$";
                break;
            }
            case 19:{
                expresion="^(INSERT INTO |insert into )[0-9A-Fa-z ]+\\([0-9A-Fa-z ,]+\\) (VALUES |values )\\([0-9A-Fa-z ,]+\\)";
                break;
            }
            case 20:{
                expresion="^(if)\\([a-zA-Z0-9]+(==)(true|false)\\)\\{[ a-zA-Z0-9]+\\}";
                break;
            }
            case 21:{
                expresion="^[a-zA-Z0-9 \n]+";
                break;
            }
            case 22:{
                expresion="^(https://|http://)(www.youtube.com/watch\\?v=)[a-zA-Z0-9]+";
                break;
            }
            case 23:{
                expresion="^[a-z0-9_-]{3,16}$";
                break;
            }
            case 24:{
                expresion="^[a-z0-9-]+$";
                break;
            }
            case 25:{
                expresion="^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
                break;
            }
            case 26:{
                expresion="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}";
                break;
            }
            case 27:{
                expresion="[Rr][Gg][Bb][(](((([\\\\d]{1,3})[1,]{0,1})[\\\\s]*){3})[)]";
                break;
            }
            case 28:{
                expresion="^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
                break;
            }
            case 29:{
                expresion="^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
                break;
            }
            case 30:{
                expresion="^(?=.*[a-z])";
                break;
            }
        }
        Pattern patron =Pattern.compile(expresion);
        Matcher matcher=patron.matcher(texto);
        if (matcher.matches()){
            lblResultado.setText("Si Cumple");

        }else{

            lblResultado.setText("No Cumple");

        }
    }

}

