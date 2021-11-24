package Vista;

public class VentanaPrincipal extends javax.swing.JFrame {
    
//    private String memoria1;
//    private String memoria2;
//    private String signo;
//    private int counter=0;
//    private Operaciones resultado;
//    private Archivos bitacora;
//    private String path = "Bitacora.txt";
//    private ArrayList<String> memoriaNumeros = new ArrayList<>();
    
    public VentanaPrincipal() {
        initComponents();
//        setResizable(false);
//        setLocationRelativeTo(null);
        
//        this.resultado = new Operaciones();
//        this.bitacora = new Archivos();
//        this.bitacora.createFile(path);
    }
//
//    public String getMemoria2() {
//        return memoria2;
//    }
//
//    public void setMemoria2(String memoria2) {
//        this.memoria2 = memoria2;
//    }
//
//    public String getMemoria1() {
//        return memoria1;
//    }
//
//    public void setMemoria1(String memoria1) {
//        this.memoria1 = memoria1;
//    }
//
//    public String getSigno() {
//        return signo;
//    }
//
//    public void setSigno(String signo) {
//        this.signo = signo;
//    }
//
//    public boolean isEstaBinario() {
//        return estaBinario;
//    }
//    
//    public void setEstaBinario(boolean estaBinario){
//        this.estaBinario = estaBinario;
//    }
//
//    public boolean isEstaPrimo() {
//        return estaPrimo;
//    }
//
//    public void setEstaPrimo(boolean estaPrimo) {
//        this.estaPrimo = estaPrimo;
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        btnNumber4 = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber1 = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();
        btnGuardaMemoria = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        btnPrimo = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        pnlTexto = new javax.swing.JPanel();
        txfNumeros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBotones.setBackground(new java.awt.Color(51, 51, 51));
        pnlBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber4.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber4.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber4.setText("4");
        btnNumber4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber7.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber7.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber7.setText("7");
        btnNumber7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber1.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber1.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber1.setText("1");
        btnNumber1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber0.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber0.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber0.setText("0");
        btnNumber0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber8.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber8.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber8.setText("8");
        btnNumber8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber5.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber5.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber5.setText("5");
        btnNumber5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber2.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber2.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber2.setText("2");
        btnNumber2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("C");
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPunto.setBackground(new java.awt.Color(51, 51, 51));
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber3.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber3.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber3.setText("3");
        btnNumber3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber6.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber6.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber6.setText("6");
        btnNumber6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber9.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber9.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber9.setText("9");
        btnNumber9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDivision.setBackground(new java.awt.Color(51, 51, 51));
        btnDivision.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 51, 204));
        btnDivision.setText("/");
        btnDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMultiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        btnMultiplicacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 51, 204));
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnResta.setBackground(new java.awt.Color(51, 51, 51));
        btnResta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 51, 204));
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 51, 204));
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPromedio.setBackground(new java.awt.Color(51, 51, 51));
        btnPromedio.setForeground(new java.awt.Color(255, 255, 255));
        btnPromedio.setText("Avg");
        btnPromedio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardaMemoria.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardaMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardaMemoria.setText("M+");
        btnGuardaMemoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnData.setBackground(new java.awt.Color(51, 51, 51));
        btnData.setForeground(new java.awt.Color(255, 255, 255));
        btnData.setText("Data");
        btnData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBinario.setBackground(new java.awt.Color(51, 51, 51));
        btnBinario.setForeground(new java.awt.Color(255, 255, 255));
        btnBinario.setText("Binario");
        btnBinario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPrimo.setBackground(new java.awt.Color(51, 51, 51));
        btnPrimo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimo.setText("Primo");
        btnPrimo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIgual.setBackground(new java.awt.Color(0, 51, 204));
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnData, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNumber4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btnNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumber7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumber0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNumber2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNumber5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnNumber9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(btnNumber6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btnGuardaMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardaMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlTexto.setBackground(new java.awt.Color(51, 51, 51));
        pnlTexto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txfNumeros.setBackground(new java.awt.Color(255, 255, 255));
        txfNumeros.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txfNumeros.setForeground(new java.awt.Color(0, 0, 102));
        txfNumeros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout pnlTextoLayout = new javax.swing.GroupLayout(pnlTexto);
        pnlTexto.setLayout(pnlTextoLayout);
        pnlTextoLayout.setHorizontalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTextoLayout.setVerticalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txfNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    boolean existePunto(String cadena){
//        boolean resultado = false;
//        
//        for (int i = 0; i < cadena.length(); i++) {
//            if (cadena.substring(i,i+1).equals(".")) {
//                resultado = true;
//                break;
//            }
//        }
//        return resultado;
//    }
//    
//    void addNumber(String memoria1){
//        if (estaBinario == true | estaPrimo == true) {
//            txfNumeros.setText(getMemoria1());
//            setEstaBinario(false);
//        }
//        txfNumeros.setText(txfNumeros.getText()+ memoria1);
//    }
//    
//    void addSigno(String signo1){
//        try {
//            double evitaLetras = Double.parseDouble(txfNumeros.getText());           
//            if (estaBinario == true | estaPrimo == true) {
//                setMemoria1(txfNumeros.getText());
//                txfNumeros.setText(getMemoria1());
//                setEstaBinario(false);
//                setEstaPrimo(false);
//            }
//            if (!txfNumeros.getText().equals("")) {
//                setMemoria1(txfNumeros.getText());
//                if (getMemoria1() == null | getMemoria1().equals("")){
//                    setMemoria1(txfNumeros.getText());
//                    resultado.setNumero1(getMemoria1());
//                    setSigno(signo1);
//                    resultado.setSigno(getSigno());
//                    txfNumeros.setText("");
//                } else {
//                    setSigno(signo1);
//                    setMemoria1(txfNumeros.getText());
//                    resultado.setNumero1(getMemoria1());
//                    resultado.setSigno(getSigno());
//                    txfNumeros.setText("");
//                }
//            }
//        }catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "No se pueden digitar letras","Error",JOptionPane.ERROR_MESSAGE);
//            txfNumeros.setText("");
//        } 
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBinario;
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnData;
    public javax.swing.JButton btnDivision;
    public javax.swing.JButton btnGuardaMemoria;
    public javax.swing.JButton btnIgual;
    public javax.swing.JButton btnMultiplicacion;
    public javax.swing.JButton btnNumber0;
    public javax.swing.JButton btnNumber1;
    public javax.swing.JButton btnNumber2;
    public javax.swing.JButton btnNumber3;
    public javax.swing.JButton btnNumber4;
    public javax.swing.JButton btnNumber5;
    public javax.swing.JButton btnNumber6;
    public javax.swing.JButton btnNumber7;
    public javax.swing.JButton btnNumber8;
    public javax.swing.JButton btnNumber9;
    public javax.swing.JButton btnPrimo;
    public javax.swing.JButton btnPromedio;
    public javax.swing.JButton btnPunto;
    public javax.swing.JButton btnResta;
    public javax.swing.JButton btnSuma;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlTexto;
    public javax.swing.JTextField txfNumeros;
    // End of variables declaration//GEN-END:variables
}