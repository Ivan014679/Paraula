
package paraula.pkg0.pkg1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.util.Map;

public class Main extends javax.swing.JFrame {
    
    int tamano = 12;
    Font fuente, isSubrayado, copearfuente;
    Color copearcolor;
    int estiloletra;
    String tipoletra;
    String copear;
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        letra = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        mayus = new javax.swing.JToggleButton();
        panelestilo = new javax.swing.JPanel();
        negrita = new javax.swing.JCheckBox();
        cursiva = new javax.swing.JCheckBox();
        subrayado = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        tamano2 = new javax.swing.JSlider();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        rojo = new javax.swing.JSpinner();
        verde = new javax.swing.JSpinner();
        azul = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        tamano1 = new javax.swing.JSpinner();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        news = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paraula 0.1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(182, 194, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jPanel1.add(jScrollPane1);

        text.setColumns(20);
        text.setRows(5);
        jScrollPane2.setViewportView(text);

        jPanel1.add(jScrollPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(182, 194, 226));
        jPanel2.setForeground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setForeground(new java.awt.Color(153, 255, 204));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leoncio.png"))); // NOI18N
        jPanel10.add(icono, java.awt.BorderLayout.CENTER);

        logo.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 0, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("PARAULA");
        jPanel10.add(logo, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(jPanel10);

        jPanel5.setBackground(new java.awt.Color(182, 194, 226));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(182, 194, 226));
        jPanel11.setLayout(new java.awt.GridLayout(2, 0));

        jPanel6.setBackground(new java.awt.Color(182, 194, 226));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de fuente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(153, 255, 204));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        letra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        letra.setForeground(new java.awt.Color(0, 0, 255));
        letra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Comic Sans MS", "Elephant", "Impact", "Tahoma", "Times New Roman" }));
        letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraActionPerformed(evt);
            }
        });
        jPanel6.add(letra, new java.awt.GridBagConstraints());

        jPanel11.add(jPanel6);

        jPanel12.setBackground(new java.awt.Color(182, 194, 226));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mayúsculas y minúsculas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        mayus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mayus.setForeground(new java.awt.Color(0, 0, 255));
        mayus.setText("minúsculas");
        mayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayusActionPerformed(evt);
            }
        });
        jPanel12.add(mayus);

        jPanel11.add(jPanel12);

        jPanel5.add(jPanel11);

        panelestilo.setBackground(new java.awt.Color(182, 194, 226));
        panelestilo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estilo de fuente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        panelestilo.setForeground(new java.awt.Color(153, 255, 204));
        panelestilo.setLayout(new java.awt.GridLayout(3, 0));

        negrita.setBackground(new java.awt.Color(182, 194, 226));
        negrita.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        negrita.setForeground(new java.awt.Color(0, 0, 255));
        negrita.setText("Negrita");
        negrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritaActionPerformed(evt);
            }
        });
        panelestilo.add(negrita);

        cursiva.setBackground(new java.awt.Color(182, 194, 226));
        cursiva.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        cursiva.setForeground(new java.awt.Color(0, 0, 255));
        cursiva.setText("Cursiva");
        cursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursivaActionPerformed(evt);
            }
        });
        panelestilo.add(cursiva);

        subrayado.setBackground(new java.awt.Color(182, 194, 226));
        Font font = new Font("Arial", Font.PLAIN, 12);
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        subrayado.setFont(font.deriveFont(attributes));
        subrayado.setForeground(new java.awt.Color(0, 0, 255));
        subrayado.setText("Subrayado");
        subrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrayadoActionPerformed(evt);
            }
        });
        panelestilo.add(subrayado);

        jPanel5.add(panelestilo);

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(182, 194, 226));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño de fuente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(153, 255, 204));
        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        tamano2.setBackground(new java.awt.Color(182, 194, 226));
        tamano2.setForeground(new java.awt.Color(0, 0, 255));
        tamano2.setMajorTickSpacing(10);
        tamano2.setMinorTickSpacing(1);
        tamano2.setPaintLabels(true);
        tamano2.setPaintTicks(true);
        tamano2.setValue(12);
        tamano2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamano2StateChanged(evt);
            }
        });
        jPanel4.add(tamano2);

        jPanel9.setBackground(new java.awt.Color(182, 194, 226));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(182, 194, 226));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Color de fuente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        rojo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        rojo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        rojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rojoStateChanged(evt);
            }
        });
        jPanel7.add(rojo);

        verde.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        verde.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "G", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                verdeStateChanged(evt);
            }
        });
        jPanel7.add(verde);

        azul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        azul.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(5, 88, 167))); // NOI18N
        azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                azulStateChanged(evt);
            }
        });
        jPanel7.add(azul);

        jPanel9.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(182, 194, 226));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        tamano1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamano1.setModel(new javax.swing.SpinnerNumberModel(12, 0, 100, 1));
        tamano1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamano1StateChanged(evt);
            }
        });
        jPanel8.add(tamano1);

        jPanel9.add(jPanel8);

        jPanel4.add(jPanel9);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        file.setText("Archivo");

        news.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        news.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        news.setText("Nuevo");
        news.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsActionPerformed(evt);
            }
        });
        file.add(news);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        open.setText("Abrir");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);
        file.add(jSeparator1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menu.add(file);

        edit.setText("Editar");

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copy.png"))); // NOI18N
        copy.setText("Copiar");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        edit.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Paste.png"))); // NOI18N
        paste.setText("Pegar");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        edit.add(paste);

        menu.add(edit);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamano1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamano1StateChanged
        tamano2.setValue(Integer.parseInt(tamano1.getValue().toString()));
        tamano = Integer.parseInt(tamano1.getValue().toString());
        cambiarLetra();
    }//GEN-LAST:event_tamano1StateChanged

    private void tamano2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamano2StateChanged
        tamano1.setValue(tamano2.getValue());
        tamano = tamano2.getValue();
        cambiarLetra();
    }//GEN-LAST:event_tamano2StateChanged

    private void letraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraActionPerformed
        if(letra.getSelectedItem() == "Arial"){
            tipoletra = "Arial";
        }else if(letra.getSelectedItem() == "Comic Sans MS"){
            tipoletra = "Comic Sans MS";
        }else if(letra.getSelectedItem() == "Elephant"){
            tipoletra = "Elephant";
        }else if(letra.getSelectedItem() == "Impact"){
            tipoletra = "Impact";
        }else if(letra.getSelectedItem() == "Tahoma"){
            tipoletra = "Tahoma";
        }else if(letra.getSelectedItem() == "Times New Roman"){
            tipoletra = "Times New Roman";
        }
        cambiarLetra();
    }//GEN-LAST:event_letraActionPerformed

    private void negritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negritaActionPerformed
        if(negrita.isSelected() && cursiva.isSelected()){
            estiloletra = 3;
        }else{
            if(cursiva.isSelected()){
                estiloletra = Font.ITALIC;
            }else{
                if(negrita.isSelected()){
                    estiloletra = Font.BOLD;
                }else if(!negrita.isSelected()){
                    estiloletra = Font.PLAIN;
                }
            }
        }
        cambiarLetra();
    }//GEN-LAST:event_negritaActionPerformed

    private void cursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursivaActionPerformed
        if(negrita.isSelected() && cursiva.isSelected()){
            estiloletra = 3;
        }else{
            if(negrita.isSelected()){
                estiloletra = Font.BOLD;
            }else{
                if(cursiva.isSelected()){
                    estiloletra = Font.ITALIC;
                }else if(!cursiva.isSelected()){
                    estiloletra = Font.PLAIN;
                }
            }
        }
        cambiarLetra();
    }//GEN-LAST:event_cursivaActionPerformed

    private void subrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrayadoActionPerformed
        isSubrayado = texto.getFont();
        Map attributes = isSubrayado.getAttributes();
        if(subrayado.isSelected()){
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);            
        }else if(!subrayado.isSelected()){
            attributes.put(TextAttribute.UNDERLINE, -1);
        }
        texto.setFont(isSubrayado.deriveFont(attributes));
    }//GEN-LAST:event_subrayadoActionPerformed

    private void rojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rojoStateChanged
        texto.setForeground(new java.awt.Color(Integer.parseInt(rojo.getValue().toString()), Integer.parseInt(verde.getValue().toString()), Integer.parseInt(azul.getValue().toString())));
    }//GEN-LAST:event_rojoStateChanged

    private void verdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_verdeStateChanged
        texto.setForeground(new java.awt.Color(Integer.parseInt(rojo.getValue().toString()), Integer.parseInt(verde.getValue().toString()), Integer.parseInt(azul.getValue().toString())));
    }//GEN-LAST:event_verdeStateChanged

    private void azulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_azulStateChanged
        texto.setForeground(new java.awt.Color(Integer.parseInt(rojo.getValue().toString()), Integer.parseInt(verde.getValue().toString()), Integer.parseInt(azul.getValue().toString())));
    }//GEN-LAST:event_azulStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/leon.png"));
            setIconImage(icon);
            setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void mayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayusActionPerformed
        if(mayus.isSelected()){
            texto.setText(texto.getText().toUpperCase());
            mayus.setText("MAYÚSCULAS");
        }else{
            texto.setText(texto.getText().toLowerCase());
            mayus.setText("minúsculas");
        }
    }//GEN-LAST:event_mayusActionPerformed

    private void newsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_newsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        copear = texto.getText();
        copearfuente = texto.getFont();
        copearcolor = texto.getForeground();
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        text.setText(text.getText()+copear);
        text.setFont(copearfuente);
        text.setForeground(copearcolor);
    }//GEN-LAST:event_pasteActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        new Messages().setVisible(true);
    }//GEN-LAST:event_openActionPerformed
    
    private void cambiarLetra(){
        fuente = new Font(tipoletra, estiloletra, tamano);
        texto.setFont(fuente);
        if(subrayado.isSelected()){
            isSubrayado = texto.getFont();
            Map attributes = isSubrayado.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            texto.setFont(isSubrayado.deriveFont(attributes));
        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner azul;
    private javax.swing.JMenuItem copy;
    private javax.swing.JCheckBox cursiva;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JComboBox<String> letra;
    private javax.swing.JLabel logo;
    private javax.swing.JToggleButton mayus;
    private javax.swing.JMenuBar menu;
    private javax.swing.JCheckBox negrita;
    private javax.swing.JMenuItem news;
    private javax.swing.JMenuItem open;
    private javax.swing.JPanel panelestilo;
    private javax.swing.JMenuItem paste;
    private javax.swing.JSpinner rojo;
    private javax.swing.JCheckBox subrayado;
    private javax.swing.JSpinner tamano1;
    private javax.swing.JSlider tamano2;
    private javax.swing.JTextArea text;
    private javax.swing.JTextArea texto;
    private javax.swing.JSpinner verde;
    // End of variables declaration//GEN-END:variables
}
