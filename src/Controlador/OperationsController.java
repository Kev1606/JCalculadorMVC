package Controlador;

import Modelo.OperationsModel;
import Vista.VentanaData;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Hewlett Packard
 */

public class OperationsController implements ActionListener, KeyListener {
    private OperationsModel modelo;
    private VentanaPrincipal vista;
    private VentanaData data;

    public OperationsController(OperationsModel modelo, VentanaPrincipal vista, VentanaData data) {
        this.modelo = modelo;
        this.vista = vista;
        this.data = data;
        _init_();
    }
    
    // inicia el binding con la vista
    private void _init_ (){
        this.vista.btnPromedio.addActionListener(this);
        this.vista.btnPunto.addActionListener(this);
        this.vista.btnBinario.addActionListener(this);
        this.vista.btnPrimo.addActionListener(this);
        this.vista.btnBorrar.addActionListener(this);
        this.vista.btnData.addActionListener(this);
        this.vista.btnDivision.addActionListener(this);
        this.vista.btnMultiplicacion.addActionListener(this);
        this.vista.btnResta.addActionListener(this);
        this.vista.btnSuma.addActionListener(this);
        this.vista.btnGuardaMemoria.addActionListener(this);
        this.vista.btnIgual.addActionListener(this);
        this.vista.btnNumber0.addActionListener(this);
        this.vista.btnNumber1.addActionListener(this);
        this.vista.btnNumber2.addActionListener(this);
        this.vista.btnNumber3.addActionListener(this);
        this.vista.btnNumber4.addActionListener(this);
        this.vista.btnNumber5.addActionListener(this);
        this.vista.btnNumber6.addActionListener(this);
        this.vista.btnNumber7.addActionListener(this);
        this.vista.btnNumber8.addActionListener(this);
        this.vista.btnNumber9.addActionListener(this);
        
        this.vista.txfNumeros.addKeyListener(this);
        
        this.vista.setTitle("JCalculator_with_MVC");
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        
        //se añaden los actionListener (.addActionListener(this)) a todos los botones de la ventana (vista)
        //se setea el titulo de la ventana, el setResizable(false)y setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //se pregunta si e.getSource() == vista.-nombreBoton- y se edita el codigo correspondiente al boton
        if (e.getSource() == this.vista.btnNumber0) {
            addNumber("0");
        }
        if (e.getSource() == this.vista.btnNumber1) {
            addNumber("1");
        }
        if (e.getSource() == this.vista.btnNumber2) {
            addNumber("2");
        }
        if (e.getSource() == this.vista.btnNumber3) {
            addNumber("3");            
        }
        if (e.getSource() == this.vista.btnNumber4) {            
            addNumber("4");
        }
        if (e.getSource() == this.vista.btnNumber5) {
            addNumber("5");
        }
        if (e.getSource() == this.vista.btnNumber6) {
            addNumber("6");
        }
        if (e.getSource() == this.vista.btnNumber7) {
            addNumber("7");
        }
        if (e.getSource() == this.vista.btnNumber8) {
            addNumber("8");
        }
        if (e.getSource() == this.vista.btnNumber9) {
            addNumber("9");
        }
        if (e.getSource() == this.vista.btnDivision) {
            addSigno("/");
        }
        if (e.getSource() == this.vista.btnSuma) {
            addSigno("+");
        }
        if (e.getSource() == this.vista.btnResta) {
            if (vista.txfNumeros.getText().equals("")) {
                addNumber("-");
            } else{
                addSigno("-");
            }      
        }
        if (e.getSource() == this.vista.btnMultiplicacion) {
            addSigno("*");
        }        
        if (e.getSource() == this.vista.btnPunto) {
            String cadena = vista.txfNumeros.getText();    
            if (cadena.length() <= 0){
                vista.txfNumeros.setText("0.");
            } else {
                if(!existePunto(vista.txfNumeros.getText())){
                    addNumber(".");
                }
            }
        }
        if (e.getSource() == this.vista.btnIgual) {
            if (modelo.isEstaBinario() == true | modelo.isEstaPrimo() == true) {
            } else {
                modelo.setNumero2(vista.txfNumeros.getText());
                if (modelo.getNumero1() != null | !modelo.getNumero1().equals("")){
                    if (modelo.getNumero2().equals("0") & modelo.getSigno().equals("/")) {
                        JOptionPane.showMessageDialog(vista,"La division entre 0 no esta permitido","Error",0);
                    } else {
                        if (modelo.getNumero1().equals("")) {
                            modelo.leerNumero(vista.txfNumeros.getText());
                            vista.txfNumeros.setText(vista.txfNumeros.getText());
                        } else {                      
                            //System.out.println("model    "+);
                            vista.txfNumeros.setText(modelo.resultadoOperacion().toString());
                        }
                    }
                }else {
                    System.out.println("AQUI EN EL LEER");
                }
                modelo.setSigno("");
            }
        }        
        if (e.getSource() == this.vista.btnBorrar) {
            vista.txfNumeros.setText("");
            modelo.borrarJuego();
        }        
        if (e.getSource() == this.vista.btnGuardaMemoria) {
            if (!modelo.isEstaPrimo()) {
                if(!modelo.isEstaBinario()){
                    if (!vista.txfNumeros.getText().equals("")) {
                        modelo.llenaMemoria(vista.txfNumeros.getText());
                    } else{
                        JOptionPane.showMessageDialog(vista, "No se puede añadir, digite un numero","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "No se puede añadir un binario, digite otro numero","Error: Numero Binario",JOptionPane.ERROR_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(vista, "No se puede añadir un booleano, digite un numero","Error: Valor Booleano",JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == this.vista.btnPromedio) {
            vista.txfNumeros.setText(modelo.muestraPromedio());
            modelo.llenaArchivoPromedio(vista.txfNumeros.getText());
        }
        if (e.getSource() == this.vista.btnPrimo) {
            if (!modelo.isEstaBinario()) {
                modelo.setEstaPrimo(true);
                if (!vista.txfNumeros.getText().equals("")){
                    modelo.setNumero1(vista.txfNumeros.getText());
                    if (modelo.esPrimo(vista.txfNumeros.getText())) {
                        vista.txfNumeros.setText("True");
                    } else{
                        vista.txfNumeros.setText("False");
                    }              
                } else{
                    JOptionPane.showMessageDialog(vista, "No se puede calcular, digite un numero","Error",0);
                }
            }else {
                JOptionPane.showMessageDialog(vista, "No se puede calcular un binario, digite otro numero","Error: Numero Binario",0);
            }
        }
        if (e.getSource() == this.vista.btnBinario) {
            modelo.setEstaBinario(true);
            try {           
                modelo.setNumero1(vista.txfNumeros.getText());
                Double numero = Double.parseDouble(vista.txfNumeros.getText());
                int numeroAConvertir = numero.intValue();
                vista.txfNumeros.setText(Integer.toBinaryString(numeroAConvertir));
                modelo.setBinarioArchivo(vista.txfNumeros.getText());
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(vista, "No se puede ejecutar la conversion a binario","Error de Conversion",0);
            }
        }
        if (e.getSource() == this.vista.btnData) {
            data.setVisible(true);
            data.txaBitacora.setText(modelo.mostrarData());
            data.setLocationRelativeTo(vista);
        }
    }
    
    public void showView (){ 
        vista.setVisible(true);
    }
    
    

    private boolean existePunto(String cadena){
        boolean resultado = false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i,i+1).equals(".")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    
    private void addNumber(String memoria1){
        if (modelo.isEstaBinario() == true | modelo.isEstaPrimo() == true) {
            modelo.setEstaBinario(false);
            modelo.setEstaPrimo(false);
            vista.txfNumeros.setText(memoria1);
        } else {
            vista.txfNumeros.setText(vista.txfNumeros.getText()+memoria1);
        }
    }
    
    
    private void addSigno(String signo){
        try {
            double evitaLetras = Double.parseDouble(vista.txfNumeros.getText());           
            if (modelo.isEstaBinario() == true | modelo.isEstaPrimo() == true) {
                //modelo.setNumero1(vista.txfNumeros.getText());
                vista.txfNumeros.setText(modelo.getNumero1());
                modelo.setEstaBinario(false);
                modelo.setEstaPrimo(false);
            }
            if (!vista.txfNumeros.getText().equals("")) {
                modelo.setNumero1(vista.txfNumeros.getText());        
                vista.txfNumeros.setText(signo);
                modelo.setSigno(signo);
                vista.txfNumeros.setText("");  
            }else {
                modelo.setNumero1(vista.txfNumeros.getText());
                vista.txfNumeros.setText(signo);
                modelo.setSigno(signo);  
                vista.txfNumeros.setText("");
            }    
        }catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "No se pueden digitar letras","Error",0);
            vista.txfNumeros.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (modelo.isEstaBinario() == true | modelo.isEstaPrimo() == true) {
            vista.txfNumeros.setText(modelo.getNumero1());
            modelo.setEstaBinario(false);
            modelo.setEstaPrimo(false);
        }
        
        if (e.getKeyChar()=='C' | e.getKeyChar()=='c') {
            vista.btnBorrar.doClick();
        } else {
            }if (e.getKeyChar()=='+') {
                String digitoFuera = vista.txfNumeros.getText();
                vista.txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                vista.btnSuma.doClick();
            }else {
                }if (e.getKeyChar()=='-') {
                    String digitoFuera = vista.txfNumeros.getText();
                    vista.txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                    vista.btnResta.doClick();
                }else {
                    }if (e.getKeyChar()=='*') {
                        String digitoFuera = vista.txfNumeros.getText();
                        vista.txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                        vista.btnMultiplicacion.doClick();
                    }else {
                        }if (e.getKeyChar()=='/') {
                            String digitoFuera = vista.txfNumeros.getText();
                            vista.txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                            vista.btnDivision.doClick();
                        }else {
                            }if (e.getKeyChar()=='\n'){                           
                                vista.btnIgual.doClick();
                            } else{
                                }if (e.getKeyChar()=='.'){
                                    String digitoFuera = vista.txfNumeros.getText();
                                    vista.txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                                    vista.btnPunto.doClick();
                                }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }
}
