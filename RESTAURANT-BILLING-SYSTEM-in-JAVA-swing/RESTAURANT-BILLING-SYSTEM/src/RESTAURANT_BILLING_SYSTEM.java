import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class RESTAURANT_BILLING_SYSTEM extends javax.swing.JFrame {

  
    public RESTAURANT_BILLING_SYSTEM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        qt1 = new javax.swing.JTextField();
        qt2 = new javax.swing.JTextField();
        qt3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        qt4 = new javax.swing.JTextField();
        qt5 = new javax.swing.JTextField();
        qt6 = new javax.swing.JTextField();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Phone No:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        tf1.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 30));

        tf2.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("1. Bangla ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("2. Chiness ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("3. Fast Food");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Bill Reciept");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, -1));

        ta1.setBackground(new java.awt.Color(255, 255, 204));
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane4.setViewportView(ta1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 310, 280));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("Cost Of Meal");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setText("Cost Of Drinks");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        tf4.setBackground(new java.awt.Color(255, 255, 204));
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 150, 30));

        tf5.setBackground(new java.awt.Color(255, 255, 204));
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 170, 30));

        tf8.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 210, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/place order.png"))); // NOI18N
        jButton4.setText("Generate Reciept");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, 180, 40));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Khichuri", "Chicken Birany", "Beef Tehari", "Mutton kacchi", "Beaf Kacchi" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 110, 30));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Mixed Chowmin", "Chicken fry with Fried rice", "Backed Pasta", "Nachos", "Pasta Basta" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 110, 30));

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Sandwich", "chicken Burger", "Koliza Shingara", "Chicken Chomocha", "Chicken Roll" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 110, 30));

        qt1.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(qt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 70, 30));

        qt2.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(qt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 30));

        qt3.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(qt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Food Items");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Qty.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, 190));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qt4.setBackground(new java.awt.Color(255, 255, 204));

        qt5.setBackground(new java.awt.Color(255, 255, 204));

        qt6.setBackground(new java.awt.Color(255, 255, 204));

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Pepsi", "Coca Cola", "Sprite", "Merinda", "Borhani" }));

        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Coffee", "Hot Chocolate", "Green Tea", "Tea" }));

        cb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Mango Juice", "Lemon Juice", "Orange Juice", "Red Grape Juice", "Pineapple Juice" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("2. Hot Drinks");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("3. Juice");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("1. Soft Drinks");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Drinks");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Qty.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb5, 0, 110, Short.MAX_VALUE)
                                    .addComponent(cb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qt4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(qt5)
                            .addComponent(qt6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 300, 190));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, -10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-calculate-48.png"))); // NOI18N
        jButton1.setText("Calculate Indivisual");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 210, 40));

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 210, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/View Bills & Order Placed Details.png"))); // NOI18N
        jButton3.setText("Calculate Total Amount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 210, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 100, 40));

        print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/generate bill & print.png"))); // NOI18N
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 650, 180, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled-2.jpg"))); // NOI18N
        jLabel3.setText("bg");
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_cb2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String Name=(String)tf1.getText();
        int Num=Integer.parseInt(""+tf2.getText());
        double com=Double.parseDouble(""+tf4.getText());
        double cod=Double.parseDouble(""+tf5.getText());
        double totalamt=Double.parseDouble(""+tf8.getText());
         ta1.append("------------------GUB RESTUARENT------------------------\n");
        ta1.append("-----------------------RECIEPT------------------------------\n");
        ta1.append("Name Of The Customer: " +Name+"\n");
        ta1.append("\n");
        ta1.append("Phone Number: "+Num+"\n");
        ta1.append("\n");
        ta1.append("Cost Of Meal: " +com+"\n");
        ta1.append("\n");
        ta1.append("Cost Of Drinks: "+cod+"\n");
        ta1.append("\n");
        ta1.append("Total Amount: " +totalamt+"\n");
        ta1.append("\n");
        ta1.append("-----------------------RECIEPT---------------------------");  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        tf1.setText("");
        tf2.setText("");
        tf4.setText("");
        tf5.setText("");
        tf8.setText("");
        cb1.setSelectedItem("SELECT");
        cb2.setSelectedItem("SELECT");
        cb3.setSelectedItem("SELECT");
        cb4.setSelectedItem("SELECT");
        cb5.setSelectedItem("SELECT");
        cb6.setSelectedItem("SELECT");
        ta1.append("");
        qt1.setText("");
        qt2.setText("");
        qt3.setText("");
        qt4.setText("");
        qt5.setText("");
        qt6.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        double cost=0.0,cost1=0.0,cost2=0.0,cost3=0.0,cost4=0.0,cost5=0.0;
        int qty1,qty2,qty3,qty4,qty5,qty6;
        String item=(String)cb1.getSelectedItem();
        if(item.equals("SELECT")){
            qty1=0;
            qt1.setText(""+qty1);
            cost=0.0;
        }
        else{
            qty1=Integer.parseInt(qt1.getText());
            if(item.equals("Khichuri")){
                cost=80.0;
            }
            else if(item.equals("Chicken Birany")){
                cost=120.0;
            }
            else if(item.equals("Beef Tehari")){
                cost=110.0;
            }
            else if(item.equals("Mutton kacchi")){
                cost=170.0;
            }
            else if(item.equals("Beaf Kacchi")){
                cost=140.0;
            }
        }
        String item1=(String)cb2.getSelectedItem();
        if(item1.equals("SELECT")){
            qty2=0;
            qt2.setText(""+qty2);
            cost1=0.0;
        }
        else{
            qty2=Integer.parseInt(qt2.getText());
            if(item1.equals("Mixed Chowmin")){
                cost1=180.0;
            }
            else if(item1.equals("Chicken fry with Fried rice")){
                cost1=150.0;
            }
            else if(item1.equals("Backed Pasta")){
                cost1=220.0;
            }
            else if(item1.equals("Nachos")){
                cost1 = 160.0;
            }
            else if(item1.equals("Pasta Basta")){
                cost1=250.0;
            }
        }
        String item3=(String)cb3.getSelectedItem();
        if(item3.equals("SELECT")){
            qty3=0;
            qt3.setText(""+qty3);
            cost2=0.0;
        }
        else{
            qty3=Integer.parseInt(qt3.getText());
            if(item3.equals(" Sandwich")){
                cost2=30.0;
            }
            else if(item3.equals("Chicken Burger")){
                cost2=80.0;
            }
            else if(item3.equals("Koliza Shingara")){
                cost2=20.0;
            }
            else if(item3.equals("Chicken Chomocha")){
                cost2 = 20.0;
            }
            else if(item3.equals("Chicken Roll")){
                cost2=25.0;
            }
        }
        //CODE FOR DRINKS-----------
        String item4=(String)cb4.getSelectedItem();

        if(item4.equals("SELECT")){
            qty4=0;
            qt4.setText(""+qty4);
            cost3=0.0;
        }
        else{
            qty4=Integer.parseInt(qt4.getText());
            if(item4.equals("Pepsi")){
                cost3=25.0;
            }
            else if(item4.equals("Coca Cola")){
                cost3=25.0;
            }
            else if(item4.equals("Sprite")){
                cost3=25.0;
            }
            else if(item4.equals("Merinda")){
                cost3= 25.0;
            }
            else if(item4.equals("Borhani")){
                cost3=40.0;
            }
        }
        String item5=(String)cb5.getSelectedItem();
        if(item5.equals("SELECT")){
            qty5=0;
            qt5.setText(""+qty5);
            cost4=0.0;
        }
        else{
            qty5=Integer.parseInt(qt5.getText());
            if(item5.equals("Coffee")){
                cost4=20.0;
            }
            else if(item5.equals("Hot Chocolate")){
                cost4=100.0;
            }
            else if(item5.equals("Green Tea")){
                cost4=15.0;
            }
            else if(item5.equals("Tea")){
                cost4= 10.0;
            }
        }
        String item6=(String)cb6.getSelectedItem();

        if(item6.equals("SELECT")){
            qty6=0;
            qt6.setText(""+qty6);
            cost5=0.0;
        }
        else{
            qty6=Integer.parseInt(qt6.getText());
            if(item6.equals("Mango Juice")){
                cost5=50.0;
            }
            else if(item6.equals("Lemon Juice")){
                cost5=30.0;
            }
            else if(item6.equals("Orange Juice")){
                cost5=50.0;
            }
            else if(item6.equals("Red Grape Juice")){
                cost5= 70.0;
            }
            else if(item6.equals("Pineapple Juice")){
                cost5= 50.0;
            }
        }
        double totalmeal=cost*qty1 + cost1*qty2 + cost2*qty3;
        double totaldrinks=cost3*qty4 + cost4*qty5 + cost5*qty6;
        tf4.setText(""+totalmeal);
        tf5.setText(""+totaldrinks);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double amt1=Double.parseDouble(""+tf4.getText());
        double amt2=Double.parseDouble(""+tf5.getText());
        double totalamount=amt1+amt2;
        int totalamount1=(int)(totalamount);
        tf8.setText(""+totalamount1);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked


PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                ta1.print(g2);
                
                
                return Printable.PAGE_EXISTS;
});
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseClicked

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
            java.util.logging.Logger.getLogger(RESTAURANT_BILLING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESTAURANT_BILLING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESTAURANT_BILLING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESTAURANT_BILLING_SYSTEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESTAURANT_BILLING_SYSTEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton print;
    private javax.swing.JTextField qt1;
    private javax.swing.JTextField qt2;
    private javax.swing.JTextField qt3;
    private javax.swing.JTextField qt4;
    private javax.swing.JTextField qt5;
    private javax.swing.JTextField qt6;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf8;
    // End of variables declaration//GEN-END:variables

    private void Referesh() {
        tf1.setText("");  
        tf2.setText("");  
        tf4.setText("");  
        tf5.setText("");  
        tf8.setText(""); 
        qt1.setText("");
        qt2.setText("");
        qt3.setText("");
        qt4.setText("");
        qt5.setText("");
        qt6.setText("");
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
