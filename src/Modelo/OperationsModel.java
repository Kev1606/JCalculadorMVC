package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Hewlett Packard
 */

public class OperationsModel {
    private Archivos bitacora = new Archivos();
    private String path = "Bitacora.txt";
    
    private String numero1 = "";
    private String numero2 = "";
    private boolean estaBinario = false;
    private boolean estaPrimo = false;
    private int counterMemoria = 0;
    
    
    private String signo = "";
    private Double resultado = 0.0;
    private String respuesta = "";
    private ArrayList<String> memoriaNumeros = new ArrayList<>();
    private Double promedio;
    
    // - GETTERS AND SETTERS - //
    public String getNumero1() {
        return numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public String getSigno() {
        return signo;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(Double numero1) {
        this.resultado = numero1;
    }

    public ArrayList<String> getMemoriaNumeros() {
        return memoriaNumeros;
    }

    public void setMemoriaNumeros(ArrayList<String> memoriaNumeros) {
        this.memoriaNumeros = memoriaNumeros;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public boolean isEstaBinario() {
        return estaBinario;
    }

    public void setEstaBinario(boolean estaBinario) {
        this.estaBinario = estaBinario;
    }

    public boolean isEstaPrimo() {
        return estaPrimo;
    }

    public void setEstaPrimo(boolean estaPrimo) {
        this.estaPrimo = estaPrimo;
    }
    
    // - OPERACIONES - // 
    public Double resultadoOperacion(){
        switch(signo) {
            case "+":
                resultado = Double.parseDouble(numero1)+Double.parseDouble(numero2);
                break;
            case "-":
                resultado = Double.parseDouble(numero1)-Double.parseDouble(numero2);
                break;
            case "*":
                resultado = Double.parseDouble(numero1)*Double.parseDouble(numero2);
                break;
            case "/":
                resultado = Double.parseDouble(numero1)/Double.parseDouble(numero2);
                break;
        }
        respuesta = resultado.toString();
        
        bitacora.writeToFile(path, numero1+getSigno()+numero2+" = "+respuesta+"\n");
        setNumero1(respuesta);
        return resultado;
    }
    
    public void leerNumero(String numeroViene){
        bitacora.writeToFile(path, numeroViene+" = "+numeroViene+"\n");
    }
    
    public double promNumeros(){
        double sumas = 0;
        for (int i = 0; i < memoriaNumeros.size(); i++) {
            double numero = Double.parseDouble(memoriaNumeros.get(i));
            sumas += numero;
        }
        setPromedio(sumas / memoriaNumeros.size());
        return getPromedio();
    }
    
    public Boolean esPrimo(String numero) {
        Boolean esPrimoActual = true;
        setEstaPrimo(true);
        Double numero1 = Double.parseDouble(numero);
        if(numero1<2) {
            esPrimoActual = false;
        } else {
            for(int x=2; x*x<=numero1; x++) {
                if( numero1%x==0 ){
                    esPrimoActual = false;
                    break;
                }
            }
        }
        
        if (esPrimoActual){
            bitacora.writeToFile(path, "Primo "+numero+" true\n");
        } else {
            bitacora.writeToFile(path, "Primo "+numero+" false\n");
        }
        setEstaPrimo(true);
        return esPrimoActual;
    }
    
    public void setBinarioArchivo(String binario){
        bitacora.writeToFile(path,"Binario: "+binario+" del Decimal: "+getNumero1()+"\n");
    }
    
    
    public void llenaMemoria(String numeroMemoria){
        bitacora.writeToFile(path, "M+ "+numeroMemoria+" > ");
        if (memoriaNumeros.size() < 10) {
            memoriaNumeros.add(numeroMemoria);
            for (int i = 0; i < memoriaNumeros.size(); i++) {
                bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
            }
            bitacora.writeToFile(path, "\n");
        } else{
            memoriaNumeros.remove(counterMemoria);
            memoriaNumeros.add(counterMemoria,numeroMemoria);
            counterMemoria++;
            if (counterMemoria==10) {
                counterMemoria=0;
            }
            for (int i = 0; i < memoriaNumeros.size(); i++) {
                bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
            }
            bitacora.writeToFile(path, "\n");
        } 
    }
    
    public String muestraPromedio() {
        if(memoriaNumeros.size() > 0){
            return String.valueOf(promNumeros());
        } else {
            return "0";
        }
    }
    
    public void llenaArchivoPromedio(String textoPantalla){
        bitacora.writeToFile(path, "Avg ");
        for (int i = 0; i < memoriaNumeros.size(); i++) {
            bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
        }
        bitacora.writeToFile(path, "= "+textoPantalla+"\n");
    }
    
    public String mostrarData(){
        return bitacora.readFile(path);
    }
    
    
    
    public void borrarJuego(){
        this.resultado = 0.0;
        this. numero1 = "";
        this.signo = "";
        this.respuesta = "";
        this.estaBinario = false;
        this.estaPrimo = false;
    }
}
