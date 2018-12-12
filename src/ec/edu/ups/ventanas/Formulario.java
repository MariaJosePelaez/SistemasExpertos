/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanas;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.sf.clipsrules.jni.Environment;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author María José
 */
public class Formulario extends javax.swing.JFrame {

    Environment clips;
    int p1;
    int p2;
    int p3;
    int p4;
    int p5;
    int p6;
    int p7;
    int p8;
    int p9;
    int p10;
    int p11;
    int p12;
    int p13;
    int p14;
    int p15;
    int p16;
    int p17;
    int p18;
    int p19;
    int p20;
    int p21;
    int p22;
    int p23;
    int p24;
    int p25;
    int p26;
    int p27;
    int p28;
    int p29;
    int p30;
    String genero;
    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();

        clips = new Environment();
        
        clips.load("Template-TestAsertividad.clp");
        clips.load("Reglas-TestAsertividad.clp");

        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;
        p5 = 0;
        p6 = 0;
        p7 = 0;
        p8 = 0;
        p9 = 0;
        p10 = 0;
        p11 = 0;
        p12 = 0;
        p13 = 0;
        p14 = 0;
        p15 = 0;
        p16 = 0;
        p17 = 0;
        p18 = 0;
        p19 = 0;
        p20 = 0;
        p21 = 0;
        p22 = 0;
        p23 = 0;
        p24 = 0;
        p25 = 0;
        p26 = 0;
        p27 = 0;
        p28 = 0;
        p29 = 0;
        p30 = 0;
        genero="";
                                
                            
        
    }
    
    public void elegirOpcion(){
        if(cbxPregunta1.getSelectedItem().equals("Elegir una opción.") || cbxPregunta2.getSelectedItem().equals("Elegir una opción.") ||cbxPregunta3.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta4.getSelectedItem().equals("Elegir una opción.")||cbxPregunta5.getSelectedItem().equals("Elegir una opción.")||cbxPregunta6.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta7.getSelectedItem().equals("Elegir una opción.")||cbxPregunta8.getSelectedItem().equals("Elegir una opción.")||cbxPregunta9.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta10.getSelectedItem().equals("Elegir una opción.")||cbxPregunta11.getSelectedItem().equals("Elegir una opción.")||cbxPregunta12.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta13.getSelectedItem().equals("Elegir una opción.")||cbxPregunta14.getSelectedItem().equals("Elegir una opción.")||cbxPregunta15.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta16.getSelectedItem().equals("Elegir una opción.")||cbxPregunta17.getSelectedItem().equals("Elegir una opción.")||cbxPregunta18.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta19.getSelectedItem().equals("Elegir una opción.")||cbxPregunta20.getSelectedItem().equals("Elegir una opción.")||cbxPregunta21.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta22.getSelectedItem().equals("Elegir una opción.")||cbxPregunta23.getSelectedItem().equals("Elegir una opción.")||cbxPregunta24.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta25.getSelectedItem().equals("Elegir una opción.")||cbxPregunta26.getSelectedItem().equals("Elegir una opción.")||cbxPregunta27.getSelectedItem().equals("Elegir una opción.")
                ||cbxPregunta28.getSelectedItem().equals("Elegir una opción.")||cbxPregunta29.getSelectedItem().equals("Elegir una opción.")||cbxPregunta30.getSelectedItem().equals("Elegir una opción.")){
            JOptionPane.showMessageDialog(rootPane, "Error", "No ha sido respondias todas las preguntas", JOptionPane.ERROR_MESSAGE);
        }else{
            p1=elegir(cbxPregunta1);
            System.out.println("p  "+p1);
            p2=elegir(cbxPregunta2);
            System.out.println("p  "+p2);
            p3=elegir(cbxPregunta3);
            System.out.println("p  "+p3);
            p4=elegir(cbxPregunta4);
            System.out.println("p  "+p4);
            p5=elegir(cbxPregunta5);
            System.out.println("p  "+p5);
            p6=elegir(cbxPregunta6);
            System.out.println("p  "+p6);
            p7=elegir(cbxPregunta7);
            System.out.println("p  "+p7);
            p8=elegir(cbxPregunta8);
            System.out.println("p  "+p8);
            p9=elegir(cbxPregunta9);
            System.out.println("p  "+p9);
            p10=elegir(cbxPregunta10);
            System.out.println("p  "+p10);
            p11=elegir(cbxPregunta11);
            System.out.println("p  "+p11);
            p12=elegir(cbxPregunta12);
            System.out.println("p  "+p12);
            p13=elegir(cbxPregunta13);
            System.out.println("p  "+p13);
            p14=elegir(cbxPregunta14);
            System.out.println("p  "+p14);
            p15=elegir(cbxPregunta15);
            System.out.println("p  "+p15);
            p16=elegir(cbxPregunta16);
            System.out.println("p  "+p16);
            p17=elegir(cbxPregunta17);
            System.out.println("p  "+p17);
            p18=elegir(cbxPregunta18);
            System.out.println("p  "+p18);
            p19=elegir(cbxPregunta19);
            System.out.println("p  "+p19);
            p20=elegir(cbxPregunta20);
            System.out.println("p  "+p20);
            p21=elegir(cbxPregunta21);
            System.out.println("p  "+p21);
            p22=elegir(cbxPregunta22);
            System.out.println("p  "+p22);
            p23=elegir(cbxPregunta23);
            System.out.println("p  "+p23);
            p24=elegir(cbxPregunta24);
            System.out.println("p  "+p24);
            p25=elegir(cbxPregunta25);
            System.out.println("p  "+p25);
            p26=elegir(cbxPregunta26);
            System.out.println("p  "+p26);
            p27=elegir(cbxPregunta27);
            System.out.println("p  "+p27);
            p28=elegir(cbxPregunta28);
            System.out.println("p  "+p28);
            p29=elegir(cbxPregunta29);
            System.out.println("p  "+p29);
            p30=elegir(cbxPregunta30);
            System.out.println("p  "+p30);
            
            if (rbtnFemenino.isSelected() == true) {
            genero = "F";
        } else if (rbtnMasculino.isSelected() == true) {
            genero = "M";
        }
        }
    }
    
    
    public int elegir(JComboBox p) {

        if (p.getSelectedItem().equals("Muy característico de mí, extremadamente descriptivo.")) {
            return 3;
        } else if (p.getSelectedItem().equals("Bastante característico de mí, bastante descriptivo.")) {
            return 2;
        } else if (p.getSelectedItem().equals("Algo característico de mí, ligeramente descriptivo.")) {
            return 1;
            
        } else if (p.getSelectedItem().equals("Algo no característico de mí, ligeramente no descriptivo.")) {
            return -1;
        } else if (p.getSelectedItem().equals("Bastante poco característico de mí, no descriptivo.")) {
            return -2;
        } else if (p.getSelectedItem().equals("Muy poco característico de mí, extremadamente no descriptivo.")) {
            return -3;
        }
        return 0;
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        btnFinalizar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        cbxPregunta1 = new javax.swing.JComboBox<>();
        cbxPregunta2 = new javax.swing.JComboBox<>();
        cbxPregunta4 = new javax.swing.JComboBox<>();
        cbxPregunta5 = new javax.swing.JComboBox<>();
        cbxPregunta6 = new javax.swing.JComboBox<>();
        cbxPregunta7 = new javax.swing.JComboBox<>();
        cbxPregunta8 = new javax.swing.JComboBox<>();
        cbxPregunta9 = new javax.swing.JComboBox<>();
        cbxPregunta10 = new javax.swing.JComboBox<>();
        cbxPregunta11 = new javax.swing.JComboBox<>();
        cbxPregunta12 = new javax.swing.JComboBox<>();
        cbxPregunta13 = new javax.swing.JComboBox<>();
        cbxPregunta14 = new javax.swing.JComboBox<>();
        cbxPregunta15 = new javax.swing.JComboBox<>();
        cbxPregunta3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        cbxPregunta16 = new javax.swing.JComboBox<>();
        cbxPregunta17 = new javax.swing.JComboBox<>();
        cbxPregunta19 = new javax.swing.JComboBox<>();
        cbxPregunta20 = new javax.swing.JComboBox<>();
        cbxPregunta21 = new javax.swing.JComboBox<>();
        cbxPregunta22 = new javax.swing.JComboBox<>();
        cbxPregunta23 = new javax.swing.JComboBox<>();
        cbxPregunta24 = new javax.swing.JComboBox<>();
        cbxPregunta25 = new javax.swing.JComboBox<>();
        cbxPregunta26 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jComboBox29 = new javax.swing.JComboBox<>();
        cbxPregunta18 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        cbxPregunta27 = new javax.swing.JComboBox<>();
        cbxPregunta28 = new javax.swing.JComboBox<>();
        cbxPregunta29 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cbxPregunta30 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EDAD:");

        buttonGroup1.add(rbtnFemenino);
        rbtnFemenino.setText("FEMENINO");

        buttonGroup1.add(rbtnMasculino);
        rbtnMasculino.setText("MASCULINO");

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("GENERO:");

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("TEST ASERTIVIDAD DE RATHUS");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("1. Mucha gente parece ser más agresiva que yo.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("2. He dudado en solicitar o aceptar citas por timidez.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("7. Hay veces en que provoco abiertamente una discusión.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("8. Lucho, como la mayoría de la gente, por mantener mi posición.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("9. En realidad, la gente se aprovecha con frecuencia de mí.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("10. Disfruto entablando conversación con conocidos y extraños.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("11. Con frecuencia no sé qué decir a personas atractivas del otro sexo.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("12. Rehúyo telefonear a instituciones y empresas.");

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("3. Cuando la comida que me han servido en un restaurante \n   no está hecha a mi gusto me quejo al camarero/a.\n\n\n4. Me esfuerzo en evitar ofender los sentimientos de otras \n   personas aun cuando me hayan molestado.");
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(null);

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("13. En caso de solicitar un trabajo o la admisión en una institución \n      preferiría escribir cartas a realizar entrevistas personales.\n\n\n14. Me resulta embarazoso devolver un artículo comprado.\n\n\n15. Si un pariente cercano o respetable me molesta, prefiero ocultar \n      mis sentimientos antes que expresar mi disgusto");
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane3.setBorder(null);

        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("5. Cuando un vendedor se ha molestado mucho mostrándome un \n    producto que luego no me agrada, paso un mal rato al decir \"no\".\n\n\n6. Cuando me dicen que haga algo, insisto en saber por qué.");
        jScrollPane3.setViewportView(jTextArea3);

        cbxPregunta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(90, 90, 90)
                                .addComponent(cbxPregunta7, 0, 436, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxPregunta11, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPregunta12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPregunta10, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPregunta9, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPregunta8, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxPregunta2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxPregunta1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPregunta4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPregunta3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPregunta6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPregunta5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPregunta15, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPregunta14, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPregunta13, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbxPregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbxPregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxPregunta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cbxPregunta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxPregunta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxPregunta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxPregunta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxPregunta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbxPregunta11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxPregunta12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cbxPregunta13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cbxPregunta14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbxPregunta15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("16. He evitado hacer preguntas por miedo a parecer tonto/a.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("19. Evito discutir sobre precios con dependientes o vendedores.");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("23. Con frecuencia paso un mal rato al decir \"no\".");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("24. Suelo reprimir mis emociones antes de hacer una escena.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("28. Si alguien se me cuela en una fila, le llamo abiertamente la atención.");

        jScrollPane5.setBorder(null);

        jTextArea5.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("25. En el restaurante o en cualquier sitio semejante, protesto por un \n      mal servicio.\n\n\n26. Cuando me alaban con frecuencia, no sé qué responder.\n\n\n27. Si dos personas en el teatro o en una conferencia están hablando \n      demasiado alto, les digo que se callen o que se vayan a hablar a \n      otra parte.");
        jScrollPane5.setViewportView(jTextArea5);

        jScrollPane6.setBorder(null);

        jTextArea6.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("20. Cuando he hecho algo importante o meritorio, trato de que los \n      demás se enteren de ello.\n\n\n21. Soy abierto y franco en lo que respecta a mis sentimientos.\n\n\n22. Si alguien ha hablado mal de mí o me ha atribuido hechos falsos, \n      o la busco cuanto antes para dejar las cosas claras.");
        jScrollPane6.setViewportView(jTextArea6);

        cbxPregunta16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jComboBox26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.\t", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jComboBox27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.\t", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jComboBox28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.\t", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jComboBox29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.\t", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jScrollPane4.setBorder(null);

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("17. Durante una discusión, con frecuencia temo alterarme tanto como \n      para ponerme a temblar.\n\n\n18. Si un eminente conferenciante hiciera una afirmación que considero \n     incorrecta, yo expondría públicamente mi punto de vista.");
        jScrollPane4.setViewportView(jTextArea4);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("29. Expreso mis opiniones con facilidad.");

        cbxPregunta27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        cbxPregunta29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("30. Hay ocasiones en que soy incapaz de decir nada.");

        cbxPregunta30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxPregunta30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción.", "Muy característico de mí, extremadamente descriptivo.", "Bastante característico de mí, bastante descriptivo.", "Algo característico de mí, ligeramente descriptivo.", "Algo no característico de mí, ligeramente no descriptivo.", "Bastante poco característico de mí, no descriptivo.", "Muy poco característico de mí, extremadamente no descriptivo." }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox29, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox28, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox27, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jComboBox26, 0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxPregunta20, 0, 425, Short.MAX_VALUE)
                                .addComponent(cbxPregunta19, 0, 425, Short.MAX_VALUE)
                                .addComponent(cbxPregunta18, 0, 425, Short.MAX_VALUE)
                                .addComponent(cbxPregunta17, 0, 425, Short.MAX_VALUE)
                                .addComponent(cbxPregunta16, 0, 425, Short.MAX_VALUE)
                                .addComponent(cbxPregunta27, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta26, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta25, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta24, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta23, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta22, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta21, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta28, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPregunta29, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbxPregunta30, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxPregunta16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbxPregunta17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cbxPregunta18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPregunta19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbxPregunta20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cbxPregunta21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbxPregunta22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPregunta23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPregunta24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbxPregunta25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cbxPregunta26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbxPregunta27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cbxPregunta28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbxPregunta29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxPregunta30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169)
                .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(160, 160, 160)
                                        .addComponent(rbtnFemenino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnMasculino)))
                                .addGap(1116, 1116, 1116)
                                .addComponent(btnFinalizar)
                                .addGap(49, 49, 49)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(763, 763, 763))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rbtnFemenino)
                                            .addComponent(rbtnMasculino)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFinalizar)
                                    .addComponent(btnCancelar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       clips.reset();
        elegirOpcion();

        String asert = ("(assert(persona(nombre \"" + txtNombre.getText() + "\")" + "(edad " + txtEdad.getText() + ")"+ "(genero " + genero + ")"
                + "(pregunta1 " + p1 + ")"
                + "(pregunta2 " + p2 + ")"
                + "(pregunta3 " + p3 + ")"
                + "(pregunta4 " + p4 + ")"
                + "(pregunta5 " + p5 + ")"
                + "(pregunta6 " + p6 + ")"
                + "(pregunta7 " + p7 + ")"
                + "(pregunta8 " + p8 + ")"
                + "(pregunta9 " + p9 + ")"
                + "(pregunta10 " + p10 + ")" 
                + "(pregunta11 " + p11 + ")"
                + "(pregunta12 " + p12 + ")"
                + "(pregunta13 " + p13 + ")"
                + "(pregunta14 " + p14 + ")"
                + "(pregunta15 " + p15 + ")"
                + "(pregunta16 " + p16 + ")"
                + "(pregunta17 " + p17 + ")"
                + "(pregunta18 " + p18 + ")"
                + "(pregunta19 " + p19 + ")"
                + "(pregunta20 " + p20 + ")"
                + "(pregunta21 " + p21 + ")"
                + "(pregunta22 " + p22 + ")"
                + "(pregunta23 " + p23 + ")"
                + "(pregunta24 " + p24 + ")"
                + "(pregunta25 " + p25 + ")"
                + "(pregunta26 " + p26 + ")"
                + "(pregunta27 " + p27 + ")"
                + "(pregunta28 " + p28 + ")"
                + "(pregunta29 " + p29 + ")"
                + "(pregunta30 " + p30 + ")"
                + ")" + ")");

        System.out.println(asert);

        clips.eval(asert);

        clips.run();
        
        
        XYSeries series = new XYSeries("Test Asertividad");
        
        series.add(p1,1);
        series.add(p2,2);
        series.add(p3,3);
        series.add(p4,4);
        series.add(p5,5);
        series.add(p6,6);
        series.add(p7,8);
        series.add(p8,8);
        series.add(p9,9);
        series.add(p10,10);
        series.add(p11,11);
        series.add(p12,12);
        series.add(p13,13);
        series.add(p14,14);
        series.add(p15,15);
        series.add(p16,16);
        series.add(p17,17);
        series.add(p18,18);
        series.add(p19,19);
        series.add(p20,20);
        series.add(p21,21);
        series.add(p22,22);
        series.add(p23,23);
        series.add(p24,24);
        series.add(p25,25);
        series.add(p26,26);
        series.add(p27,27);
        series.add(p28,28);
        series.add(p29,29);
        series.add(p30,30);
        
        XYSeriesCollection dataset =new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Test Asertividad", "Respuesta preguntas", "Preguntas", dataset,PlotOrientation.VERTICAL,true,false,false);
        
        
        ChartFrame frame = new ChartFrame("Test de Asertividad",chart);
        frame.pack();
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNombre.setText("");
        txtEdad.setText("");
        cbxPregunta1.setSelectedIndex(0);
        cbxPregunta2.setSelectedIndex(0);
        cbxPregunta3.setSelectedIndex(0);
        cbxPregunta4.setSelectedIndex(0);
        cbxPregunta5.setSelectedIndex(0);
        cbxPregunta6.setSelectedIndex(0);
        cbxPregunta7.setSelectedIndex(0);
        cbxPregunta8.setSelectedIndex(0);
        cbxPregunta9.setSelectedIndex(0);
        cbxPregunta10.setSelectedIndex(0);
        cbxPregunta11.setSelectedIndex(0);
        cbxPregunta12.setSelectedIndex(0);
        cbxPregunta13.setSelectedIndex(0);
        cbxPregunta14.setSelectedIndex(0);
        cbxPregunta15.setSelectedIndex(0);
        cbxPregunta16.setSelectedIndex(0);
        cbxPregunta17.setSelectedIndex(0);
        cbxPregunta18.setSelectedIndex(0);
        cbxPregunta19.setSelectedIndex(0);
        cbxPregunta20.setSelectedIndex(0);
        cbxPregunta21.setSelectedIndex(0);
        cbxPregunta22.setSelectedIndex(0);
        cbxPregunta23.setSelectedIndex(0);
        cbxPregunta24.setSelectedIndex(0);
        cbxPregunta25.setSelectedIndex(0);
        cbxPregunta26.setSelectedIndex(0);
        cbxPregunta27.setSelectedIndex(0);
        cbxPregunta28.setSelectedIndex(0);
        cbxPregunta29.setSelectedIndex(0);
        cbxPregunta30.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxPregunta1;
    private javax.swing.JComboBox<String> cbxPregunta10;
    private javax.swing.JComboBox<String> cbxPregunta11;
    private javax.swing.JComboBox<String> cbxPregunta12;
    private javax.swing.JComboBox<String> cbxPregunta13;
    private javax.swing.JComboBox<String> cbxPregunta14;
    private javax.swing.JComboBox<String> cbxPregunta15;
    private javax.swing.JComboBox<String> cbxPregunta16;
    private javax.swing.JComboBox<String> cbxPregunta17;
    private javax.swing.JComboBox<String> cbxPregunta18;
    private javax.swing.JComboBox<String> cbxPregunta19;
    private javax.swing.JComboBox<String> cbxPregunta2;
    private javax.swing.JComboBox<String> cbxPregunta20;
    private javax.swing.JComboBox<String> cbxPregunta21;
    private javax.swing.JComboBox<String> cbxPregunta22;
    private javax.swing.JComboBox<String> cbxPregunta23;
    private javax.swing.JComboBox<String> cbxPregunta24;
    private javax.swing.JComboBox<String> cbxPregunta25;
    private javax.swing.JComboBox<String> cbxPregunta26;
    private javax.swing.JComboBox<String> cbxPregunta27;
    private javax.swing.JComboBox<String> cbxPregunta28;
    private javax.swing.JComboBox<String> cbxPregunta29;
    private javax.swing.JComboBox<String> cbxPregunta3;
    private javax.swing.JComboBox<String> cbxPregunta30;
    private javax.swing.JComboBox<String> cbxPregunta4;
    private javax.swing.JComboBox<String> cbxPregunta5;
    private javax.swing.JComboBox<String> cbxPregunta6;
    private javax.swing.JComboBox<String> cbxPregunta7;
    private javax.swing.JComboBox<String> cbxPregunta8;
    private javax.swing.JComboBox<String> cbxPregunta9;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
