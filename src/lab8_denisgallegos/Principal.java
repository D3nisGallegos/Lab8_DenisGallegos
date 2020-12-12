/*
 */
package lab8_denisgallegos;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Principal extends javax.swing.JFrame {
    

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    ArrayList clasesguardadas = new ArrayList();
    ArrayList cuentas = new ArrayList();
    ArrayList maestros  = new ArrayList();
    ArrayList clases = new ArrayList();
    ArrayList estudiantes = new ArrayList();
    ArrayList carrera = new ArrayList();
    
    int indiceclases = 0;
    int indice = 0;
    
    
    public boolean validar(String n){ //metodo que valida si se ingreso un double.
        boolean v = true;
        try{
            double valor = Double.parseDouble(n);
            if (valor < 0){
                v = false;
                JOptionPane.showMessageDialog(null, "Entrada no valida", "ERROR DE ENTRADA", 0);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "entrada no valida.", "Error.", 0);
            v = false; 
        }
        return v; 
    }//Fin del metodo validar.
    
    public boolean validarint(String n){ //metodo que valida si se ingreso un entero.
        boolean v = true;
        try{
            int valor = Integer.parseInt(n);
            if (valor < 0){
                v = false;
                JOptionPane.showMessageDialog(null, "Entrada no valida", "ERROR DE ENTRADA", 0);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "entrada no valida.", "Error.", 0);
            v = false; 
        }
        return v; 
    }//Fin del metodo validar.
    
    public void llenarcombobox(){ //metodo que llena el combobox con las carreras segun la facultad elegida.
        ArrayList lic = new ArrayList();
        lic.add("Finanzas");
        lic.add("Derecho");
        lic.add("Admin. Empresas");
        lic.add("Disenio Grafico");
        lic.add("Mercadotecnia");
        ArrayList ing = new ArrayList();
        ing.add("Sistemas Comp.");
        ing.add("Industrial");
        ing.add("Mecatronica");
        ing.add("Biomedica");
        ing.add("Energia");
        ArrayList doc = new ArrayList();
        doc.add("Medicina");
        doc.add("Odontologia");
        doc.add("Nutricion");
        doc.add("Terapia");
        if (jComboBox7.getSelectedItem().equals("Licenciaturas")){
            for (int c = 0; c < lic.size();c++){
                jComboBox8.addItem(lic.get(c) +"");
            }
        }else if (jComboBox7.getSelectedItem().equals("Ingenierias")){
            for (int c = 0; c < ing.size();c++){
                jComboBox8.addItem(ing.get(c) +"");
            }
        }else {
            for (int c = 0; c < doc.size();c++){
                jComboBox8.addItem(doc.get(c) +"");
            }
        }
    }//Fin dl metodo llenar combobox.
    
    public int generarcenta(){ //metodo que genera el numero de cuenta de los estudiantes.
        boolean v = false; 
        String cuenta = "";
        while (v == false){
            cuenta = "";
            for (int c = 0; c < 5;c++){
                Random aleatorio = new Random();
                cuenta += 1+aleatorio.nextInt(9) + "";
            }
            int num = Integer.parseInt(cuenta);
            if (cuentas.contains(num)){
                v = false; 
            }else{
                v = true; 
            }
        }
        return Integer.parseInt(cuenta);
    }//Fin del metodo generar cuenta.
    
    public void llenartablamaestros(){  //Metodo que llena la tabla de maestros en menu clases.    
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        for (int j = 0; j < m.getRowCount();j++){
            m.removeRow(j);
        }
        for (int c = 0 ; c < maestros.size();c++){
            Maestros objeto = (Maestros) maestros.get(c);           
            Object[] row = {objeto.getNombre(), objeto.getApellido(), objeto.getEdad(), objeto.getSalario()};
            m.addRow(row);
        }
        jTable1.setModel(m);
    }//Fin del metodo llenar tabla de maestros.
    
    public void llenartablaclases(Maestros n){ //Metodo que llena la tabla de clases por maestros en menu maestros.
        DefaultTableModel m = (DefaultTableModel) jTable2.getModel();
        for (int j = 0; j < m.getRowCount();j++){
            m.removeRow(j);
        }
        for (int c = 0; c < n.getClases().size();c++){
            Clases objeto = (Clases) n.getClases().get(c);
            Object [] row = {objeto.getNombre(), objeto.getSeccion(), objeto.getEdificio(), objeto.getSalon()}; 
            m.addRow(row);
        }   
    }//Fin del metodo llenar tabla maestros.

    public void llenartablaestudiantes(Estudiantes n){ //Metodo que llena la tabla academica.
        DefaultTableModel m = (DefaultTableModel) jTable3.getModel();
        for (int j = 0; j < m.getRowCount();j++){
            m.removeRow(j);
        }
        Carreras objeto = (Carreras) n.getCarrera();
        Object [] row = {objeto.getFacultad(), objeto.getNombre(), objeto.getJefe()}; 
        m.addRow(row);
    }
    
    public void llenartablatodas(){ //Metodo que llena la tabla de todas las carreras.
        DefaultTableModel m = (DefaultTableModel) jTable4.getModel();
        for (int j = 0; j < m.getRowCount();j++){
            m.removeRow(j);
        }
        for (int c = 0; c < carrera.size();c++){
            Carreras objeto = (Carreras) carrera.get(c);
            Object [] row = {objeto.getNombre(), objeto.getNombre(), objeto.getJefe(), objeto.getCosto()}; 
            m.addRow(row);
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        panel2 = new java.awt.Panel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Mostrar datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jPopupMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu2MouseClicked(evt);
            }
        });

        jMenuItem3.setText("Mostrar datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese maestro: ");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido: ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Edad: ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Salario: ");

        jButton1.setText("Agregar profesor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 18, 130, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Genero: ");

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Todos los maestros:");

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre:", "Seccion:", "Edificio:", "Salon:"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Clases por maestro:");

        jButton6.setText("Eliminar clase al maestro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(262, 262, 262)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6))))
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(jTextField2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(237, 237, 237))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Menu Maestros", jPanel1);

        panel3.setBackground(new java.awt.Color(102, 153, 255));
        panel3.setMaximumSize(new java.awt.Dimension(690, 32767));
        panel3.setPreferredSize(new java.awt.Dimension(670, 591));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Agregar una clase:");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Nombre:");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Seccion: ");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Edificio:");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Salon: ");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Aire: ");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        jButton7.setText("Agregar clase");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Todas las clases:");

        jList5.setModel(new DefaultListModel());
        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jList5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre:", "Apellido:", "Edad: ", "Salario:"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tabla de maestros:");

        jButton2.setText("Asignar clase a maestro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addGap(20, 20, 20)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(jTextField10)))
                            .addComponent(jLabel21)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox6, 0, 130, Short.MAX_VALUE)
                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(186, 186, 186)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Menu clases", panel3);

        panel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ingrese estudiante: ");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nombre: ");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Apellido: ");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Edad: ");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(15, 15, 130, 1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Genero: ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jButton3.setText("Agregar Estudiante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Estudiantes: ");

        jList3.setModel(new DefaultListModel());
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facultad:", "Carrera:", "Jefe: "
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tabla de informacion academica por estudiante:");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facultad:", "Carrera:", "Jefe: ", "Costo:"
            }
        ));
        jScrollPane9.setViewportView(jTable4);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Todas las carreras:");

        jButton4.setText("Asignar a carrera");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)))
                                .addGap(22, 22, 22)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(16, 16, 16)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Menu Estudiantes", panel1);

        panel4.setBackground(new java.awt.Color(51, 255, 102));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Agregar carrera: ");

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Facultad: ");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciaturas", "Ingenierias", "Ciencias de la Salud" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Carrera:");

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Costo: ");

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Jefe");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jButton9.setText("Agregar Carrera");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Todas las carreras: ");

        jList6.setModel(new DefaultListModel());
        jList6.setEnabled(false);
        jScrollPane8.setViewportView(jList6);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel34))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField15))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addGap(37, 37, 37)
                                    .addComponent(jTextField14)))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(19, 19, 19)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton9)
                .addGap(28, 28, 28)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Menu carrera", panel4);

        panel2.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Facultades");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ingenieria");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Sistemas. comp");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Energia");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Industrial");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mecatronica");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Biomedica");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Licenciatura");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Derecho");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Finanzas");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Admin.Empresas");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Mercadotecnia");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Disenio Grafico");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Salud");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medicina");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Odontologia");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Terapia");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Nutricion");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTree1);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbol", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n = jTextField3.getText(); 
        boolean v = validar(n);
        String nombre = jTextField1.getText();
        String apellido = jTextField2.getText();
        if (v == true && (nombre.isEmpty() == false && apellido.isEmpty() == false && n.isEmpty() == false)){           
            int edad = Integer.parseInt(jSpinner1.getValue().toString());
            double salario = Double.parseDouble(n);
            String genero = jComboBox1.getSelectedItem()+ "";
            Maestros maestro = new Maestros(salario, nombre, apellido, edad, genero);
            maestros.add(maestro);
            indice = maestros.indexOf(maestro);
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            modelo.addElement(maestro.toStringMaestros());
            jList1.setModel(modelo);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jComboBox1.setSelectedIndex(0);
        }else {
            JOptionPane.showMessageDialog(null, "Entradas no validas o campos vacios.");
        }
        llenartablamaestros();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (jList1.getSelectedIndex() >= 0){
            if (evt.isMetaDown() == true){
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
            for (int c = 0; c < maestros.size();c++){
                Maestros objeto = (Maestros) maestros.get(c);
                if (objeto.toStringMaestros().equals(jList1.getSelectedValue())){
                    llenartablaclases(objeto);
                }
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            Maestros objeto2 = new Maestros();
            for (int c = 0; c < maestros.size();c++){
                Maestros objeto = (Maestros) maestros.get(c);              
                if (objeto.toStringMaestros().equals(modelo.getElementAt(jList1.getSelectedIndex()))){
                    objeto2 = objeto; 
                }
            }
            jTextField1.setText(objeto2.getNombre() +"");
            jTextField2.setText(objeto2.getApellido()+"");
            jTextField3.setText(objeto2.getSalario()+"");
            jSpinner1.setValue(objeto2.getEdad());
            jComboBox1.setSelectedItem(objeto2.getGenero());
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un maestro.");
        }
        llenartablamaestros();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked
        
    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
    
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            ArrayList temp = maestros; 
            for (int c = 0; c < maestros.size();c++){
                Maestros objeto = (Maestros) maestros.get(c);
                if (objeto.toStringMaestros().equals(jList1.getSelectedValue())){
                    temp.remove(objeto);
                }
            }
            maestros = temp; 
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            modelo.removeElementAt(jList1.getSelectedIndex());
            jList1.setModel(modelo);
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un maestro.");
        }
        llenartablamaestros();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jPopupMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu2MouseClicked
     
    }//GEN-LAST:event_jPopupMenu2MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (jList5.getSelectedIndex() >= 0){
            DefaultListModel modelo = (DefaultListModel) jList5.getModel();
            Clases objeto2 = new Clases();
            for (int c = 0; c < clases.size();c++){
                Clases objeto = (Clases) clases.get(c);              
                if (objeto.toStringClases().equals(modelo.getElementAt(jList5.getSelectedIndex()))){
                    objeto2 = objeto; 
                }
            }
            jTextField10.setText(objeto2.getNombre() +"");
            jTextField13.setText(objeto2.getSeccion()+"");
            jSpinner4.setValue(objeto2.getEdificio());
            jSpinner4.setValue(objeto2.getSalon());
            jComboBox6.setSelectedItem(objeto2.getAire());
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una clase.");
        }       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (jList5.getSelectedIndex() >= 0){
            DefaultListModel modelo = (DefaultListModel) jList5.getModel();
            modelo.removeElementAt(jList5.getSelectedIndex());
            jList5.setModel(modelo);
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una clase.");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            if (jList6.isEnabled() ){           
                String nombre = jTextField8.getText();
                String apellido = jTextField9.getText();
                if (nombre.isEmpty() == false && apellido.isEmpty() == false){
                    int edad = Integer.parseInt(jSpinner2.getValue()+"");
                    int numcuenta = generarcenta();
                    String genero = jComboBox3.getSelectedItem().toString();
                    Estudiantes objeto = new Estudiantes(numcuenta, nombre, apellido, edad, genero);
                    estudiantes.add(objeto);
                    DefaultListModel mode = (DefaultListModel) jList3.getModel();
                    mode.addElement(objeto.toStringEstudiantes2());
                    jList3.setModel(mode);
                    jTextField8.setText("");
                    jTextField9.setText("");
                    jComboBox3.setSelectedIndex(0);
                }else {
                    JOptionPane.showMessageDialog(null, "Campos vacios, error.");
                }
            }else {
                JOptionPane.showMessageDialog(null, "No hay carreras ingresadas aun.", "Error", 0);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String n = jTextField3.getText(); 
        boolean v = validar(n);
        String nombre = jTextField1.getText();
        String apellido = jTextField2.getText();
        if (jList1.getSelectedIndex() >=0){
            if (v == true && (nombre.isEmpty() == false && apellido.isEmpty() == false && n.isEmpty() == false)){        
                int edad = Integer.parseInt(jSpinner1.getValue().toString());
                double salario = Double.parseDouble(n);
                String genero = jComboBox1.getSelectedItem()+ "";
                Maestros maestro = new Maestros(salario, nombre, apellido, edad, genero);
                for (int c = 0; c < maestros.size();c++){
                    Maestros objeto = (Maestros) maestros.get(c);
                    if (objeto.toStringMaestros().equals(jList1.getSelectedValue())){
                        maestros.set(c, maestro);
                        indice = c; 
                    }
                }
                DefaultListModel modelo = (DefaultListModel) jList1.getModel();
                modelo.setElementAt(maestro.toStringMaestros(), indice);
                jList1.setModel(modelo);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jComboBox1.setSelectedIndex(0);  
            }else {
                JOptionPane.showMessageDialog(null, "Entradas no validas o campos vacios.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error. Seleccione un maestro.");
        } 
        llenartablamaestros();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String nombre = jTextField10.getText();
            String seccion = jTextField13.getText();
            if (nombre.isEmpty() == false && seccion.isEmpty()== false){
                String aire = jComboBox6.getSelectedItem() + "";
                int edificio = Integer.parseInt(jSpinner4.getValue()+"");
                int salon = Integer.parseInt(jSpinner3.getValue()+"");
                Clases clase = new Clases(nombre, seccion, edificio, salon, aire);
                clases.add(clase);
                indiceclases = clases.indexOf(clase);
                DefaultListModel modelo = (DefaultListModel) jList5.getModel();
                modelo.addElement(clase.toStringClases());
                jList5.setModel(modelo);
                jTextField10.setText("");
                jTextField13.setText("");
                jSpinner4.setValue(0);
                jSpinner3.setValue(0);
                jComboBox6.setSelectedIndex(0);
            }else {
                JOptionPane.showMessageDialog(null, "Error, campos vacios.");
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String nombre = jTextField10.getText();
        String seccion = jTextField13.getText();
        if (jList5.getSelectedIndex() >= 0){
            if (nombre.isEmpty() == false && seccion.isEmpty()== false){           
                String aire = jComboBox6.getSelectedItem() + "";
                int edificio = Integer.parseInt(jSpinner4.getValue()+"");
                int salon = Integer.parseInt(jSpinner3.getValue()+"");
                Clases clase = new Clases(nombre, seccion, edificio, salon, aire);
                for (int c = 0; c < clases.size();c++){
                   Clases objeto = (Clases) clases.get(c);
                   if (objeto.toStringClases().equals(jList5.getSelectedValue())){
                       clases.set(c, clase);
                       indiceclases = c; 
                   }
                }
                DefaultListModel modelo = (DefaultListModel) jList5.getModel();
                modelo.setElementAt(clase.toStringClases(), indiceclases);
                jList5.setModel(modelo);
                jTextField10.setText("");
                jTextField13.setText("");
                jSpinner4.setValue(0);
                jSpinner3.setValue(0);
                jComboBox6.setSelectedIndex(0);
            }else {
               JOptionPane.showMessageDialog(null, "Error, campos vacios.");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Error, seleccione una clase.");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        if (jList5.getSelectedIndex() >= 0){
            if (evt.isMetaDown() == true){
                jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jList5MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        llenartablatodas();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jList5.getSelectedIndex() >= 0 && jTable1.getSelectedRow() >= 0){
            for(int c = 0; c < clases.size();c++){
                Clases objeto = (Clases) clases.get(c);
                if (objeto.toStringClases().equals(jList5.getSelectedValue())){
                    for (int j = 0; j < maestros.size();j++){
                        Maestros maestro = (Maestros) maestros.get(j);
                        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                        String n = (String)modelo.getValueAt(jTable1.getSelectedRow(), 0);
                        String a = (String) modelo.getValueAt(jTable1.getSelectedRow(), 1);
                        int ed = (int) modelo.getValueAt(jTable1.getSelectedRow(), 2);
                        double sal = (double) modelo.getValueAt(jTable1.getSelectedRow(), 3);
                        if (maestro.getNombre().equals(n) && maestro.getApellido().equals(a) && maestro.getEdad() == ed
                                && maestro.getSalario() == sal){
                            maestro.getClases().add(objeto);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Clase agregada correctamente.");
        }else {
            JOptionPane.showMessageDialog(null, "Error, seleccione una clase y un maestro.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jList1.getSelectedIndex() >= 0 && jTable2.getSelectedRow() >= 0){
            for (int c = 0; c < maestros.size();c++){
                Maestros objeto = (Maestros) maestros.get(c);
                if (objeto.toStringMaestros().equals(jList1.getSelectedValue())){
                    ArrayList lista = objeto.getClases();
                    for (int j = 0; j < objeto.getClases().size();j++){
                        Clases clase = (Clases) objeto.getClases().get(j);
                        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
                        if (clase.getNombre().equals(modelo.getValueAt(jTable2.getSelectedRow(), 0))&& 
                                clase.getSeccion().equals(modelo.getValueAt(jTable2.getSelectedRow(), 1)) && 
                                clase.getEdificio() == Integer.parseInt(modelo.getValueAt(jTable2.getSelectedRow(), 2)+"") && 
                                clase.getSalon() == Integer.parseInt(modelo.getValueAt(jTable2.getSelectedRow(), 3)+"")){
                                lista.remove(clase);
                        }
                    }
                    objeto.setClases(lista);
                }
            }
            JOptionPane.showMessageDialog(null, "Clase eliminada correctamente.");
        }else {
            JOptionPane.showMessageDialog(null, "Error, seleccione una clase y un maestro.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        jComboBox8.removeAllItems();
        llenarcombobox();
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String n = jTextField14.getText()+"";
        String facultad = jComboBox7.getSelectedItem().toString();
        String carrera2 = jComboBox8.getSelectedItem().toString();
        String jefe = jTextField15.getText()+"";   
        boolean v = validar(n);
        if (v == true && (jefe.isEmpty() == false && facultad.isEmpty() == false && 
                carrera2.isEmpty() == false && n.isEmpty() == false)){
            jList6.setEnabled(true);           
            double num = Double.parseDouble(n);
            Carreras lic = new Carreras(carrera2, facultad, num, jefe);
            carrera.add(lic);
            DefaultListModel mode = (DefaultListModel) jList6.getModel();
            mode.addElement(lic.toStringCarreras());
            jList6.setModel(mode);
            jTextField15.setText("");
            jTextField14.setText("");
            jComboBox7.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "Carrera creada correctamente.");
        }else {
            JOptionPane.showMessageDialog(null, "Error de entrada o campos vacios.");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        if (jList3.getSelectedIndex()>= 0){
            for (int c = 0;c < estudiantes.size();c++){
                Estudiantes objeto = (Estudiantes) estudiantes.get(c);
                if (objeto.toStringEstudiantes2().equals(jList3.getSelectedValue())){
                    llenartablaestudiantes(objeto);
                }
            }
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTree jTree1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
