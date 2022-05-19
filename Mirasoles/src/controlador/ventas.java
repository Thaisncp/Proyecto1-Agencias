package controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.agencia;

/**
 *
 * @author Thais Cartuche
 */
public class ventas {
    //Permite ingresar un matriz
    public void ingresar_ventas(double matriz[][], String mensaje) {
        agencia newAgencia = new agencia();
        int k = 0;
        String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i <= newAgencia.getColumnas(); i++) {
            for (int j = 0; j <= newAgencia.getFilas(); j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(mensaje + "\nIngrese la venta de " + mes[k] + ", posicion [" + i + "] [" + j + "]: "));
                k++;
            }
        }
    }
    //Muestra una en un cuadro de texto la matriz señalada por el comboBox
    public void matriz(double matriz[][], JTextArea AtxtMatriz) {
        agencia newAgencia = new agencia();
        AtxtMatriz.setText(null);
        for (int i = 0; i <= newAgencia.getColumnas(); i++) {
            for (int j = 0; j <= newAgencia.getFilas(); j++) {
                AtxtMatriz.append(String.valueOf("    " + matriz[i][j]));
            }
            AtxtMatriz.append(String.valueOf("\n"));
        }
    }
    //Suma todas las ventas de una agencia
    public void ventasAnuales(double matriz[][], JTextArea AtxtMatriz, double suma) {
        agencia newAgencia = new agencia();
        AtxtMatriz.setText(null);
        for (int i = 0; i <= newAgencia.getColumnas(); i++) {
            for (int j = 0; j <= newAgencia.getFilas(); j++) {
                suma += matriz[i][j];
            }
        }
        AtxtMatriz.append(String.valueOf(suma));
    }
    //Saca el prodio de ventas segun el mes por todas las agencias
    public void promedio(int fila, int columna, double matriz1[][], double matriz2[][], double matriz3[][], double matriz4[][], double matriz5[][], JTextArea AtxtMatriz, double suma, double promedio) {
        AtxtMatriz.setText(null);
        suma = matriz1[columna][fila] + matriz2[columna][fila] + matriz3[columna][fila] + matriz4[columna][fila] + matriz5[columna][fila];
        AtxtMatriz.append(String.valueOf(suma / 5));
    }
    //Calcula a agecia con mayores ventas en el mes
    public void ventaMayor(int fila, int columna, double matriz1[][], double matriz2[][], double matriz3[][], double matriz4[][], double matriz5[][], JTextArea AtxtMatriz) {
        AtxtMatriz.setText(null);
        if (matriz1[columna][fila] >= matriz2[columna][fila] && matriz1[columna][fila] >= matriz3[columna][fila] && matriz1[columna][fila] >= matriz4[columna][fila] && matriz1[columna][fila] >= matriz5[columna][fila]) {
            AtxtMatriz.append(String.valueOf("AGENCIA  1\n   VENTAS: " + matriz1[columna][fila] + "\n"));
        }
        if (matriz2[columna][fila] >= matriz1[columna][fila] && matriz2[columna][fila] >= matriz3[columna][fila] && matriz2[columna][fila] >= matriz4[columna][fila] && matriz2[columna][fila] >= matriz5[columna][fila]) {
            AtxtMatriz.append(String.valueOf("AGENCIA  2\n   VENTAS: " + matriz2[columna][fila] + "\n"));
        }
        if (matriz3[columna][fila] >= matriz1[columna][fila] && matriz3[columna][fila] >= matriz2[columna][fila] && matriz3[columna][fila] >= matriz4[columna][fila] && matriz3[columna][fila] >= matriz5[columna][fila]) {
            AtxtMatriz.append(String.valueOf("AGENCIA  3\n   VENTAS: " + matriz3[columna][fila] + "\n"));
        }
        if (matriz4[columna][fila] >= matriz1[columna][fila] && matriz4[columna][fila] >= matriz2[columna][fila] && matriz4[columna][fila] >= matriz3[columna][fila] && matriz4[columna][fila] >= matriz5[columna][fila]) {
            AtxtMatriz.append(String.valueOf("AGENCIA  4\n   VENTAS: " + matriz4[columna][fila] + "\n"));
        }
        if (matriz5[columna][fila] >= matriz1[columna][fila] && matriz5[columna][fila] >= matriz2[columna][fila] && matriz5[columna][fila] >= matriz3[columna][fila] && matriz5[columna][fila] >= matriz4[columna][fila]) {
            AtxtMatriz.append(String.valueOf("AGENCIA  5\n   VENTAS: " + matriz5[columna][fila] + "\n"));
        }
    }
    //calcula el mes con menores ventas de las agencias
    public void ventaMenor(double matriz1[][], double matriz2[][], double matriz3[][], double matriz4[][], double matriz5[][], JTextArea AtxtMatriz, JTextArea txtMenor) {
        agencia newAgencia = new agencia();
        AtxtMatriz.setText(null);
        double matrizSuma[][] = new double[3][4];
        for (int i = 0; i <= newAgencia.getColumnas(); i++) {
            for (int j = 0; j <= newAgencia.getFilas(); j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j] + matriz3[i][j] + matriz4[i][j] + matriz5[i][j];
                AtxtMatriz.append(String.valueOf(matrizSuma[i][j] + "   "));
            }
            AtxtMatriz.append("\n");
        }
        double menor = matrizSuma[0][0];
        txtMenor.setText(null);
        int k = 0;
        String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[0].length; j++) {
                if (matrizSuma[i][j] <= menor) {
                    menor = matrizSuma[i][j];
                    k++;
                }
            }
        }
        
        
        if(matrizSuma[0][0] == menor){
            txtMenor.append(String.valueOf(""+ mes [0]+"  "+menor+"\n"));
        }
        if(matrizSuma[0][1] == menor){
            txtMenor.append(String.valueOf(""+ mes [1]+"  "+menor+"\n"));
        }
        if(matrizSuma[0][2] == menor){
            txtMenor.append(String.valueOf(""+ mes [2]+"  "+menor+"\n"));
        }
        if(matrizSuma[0][3] == menor){
            txtMenor.append(String.valueOf(""+ mes [3]+"  "+menor+"\n"));
        }
        if(matrizSuma[1][0] == menor){
            txtMenor.append(String.valueOf(""+ mes [4]+"  "+menor+"\n"));
        }
        if(matrizSuma[1][1] == menor){
            txtMenor.append(String.valueOf(""+ mes [5]+"  "+menor+"\n"));
        }
        if(matrizSuma[1][2] == menor){
            txtMenor.append(String.valueOf(""+ mes [6]+"  "+menor+"\n"));
        }
        if(matrizSuma[1][3] == menor){
            txtMenor.append(String.valueOf(""+ mes [7]+"  "+menor+"\n"));
        }
        if(matrizSuma[2][0] == menor){
            txtMenor.append(String.valueOf(""+ mes [8]+"  "+menor+"\n"));
        }
        if(matrizSuma[2][1] == menor){
            txtMenor.append(String.valueOf(""+ mes [9]+"  "+menor+"\n"));
        }
        if(matrizSuma[2][2] == menor){
            txtMenor.append(String.valueOf(""+ mes [10]+"  "+menor+"\n"));
        }
        if(matrizSuma[2][3] == menor){
            txtMenor.append(String.valueOf(""+ mes [11]+"  "+menor+"\n"));
        }     
    }
    //Permite guardar las matrices ingresadas en formato Json
    public void Json(double matriz [][], String mesaje) {
        try {
            Gson json = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = json.toJson(matriz);
            FileWriter jsonGenerado = new FileWriter(mesaje + ".json");
            jsonGenerado.write(jsonString);
            jsonGenerado.flush();
            JOptionPane.showMessageDialog(null, "ARCHIVO GENERADO CON EXITO <3");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GENERAR ARCHIVO :c");
        }
    }
}
