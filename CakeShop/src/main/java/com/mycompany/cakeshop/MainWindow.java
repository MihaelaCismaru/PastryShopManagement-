package com.mycompany.cakeshop;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static java.lang.Double.parseDouble;

public final class MainWindow extends javax.swing.JFrame {

    ArrayList<CakeModel> cakes;
    ArrayList<CakeModel> cakesInCart;
    ArrayList<CakeModel> cakesAux;
    
    String cakeListHeader[] = new String[]{"Numar", "Denumire", "Cantitate (g)", "Pret(lei/100g)"};
    String shopListHeader[] = new String[]{"Denumire", "Cantitate (g)", "Cost in lei"};
    
    DefaultTableModel productsTableModel;
    DefaultTableModel cartTableModel;
    
    int index = 0;

    //Constructor
    public MainWindow() {
        //initializare componenta si grafica
        initComponents();
        this.setLocationRelativeTo(null);
        CustomDesign();
        
        //initializare vectori de torturi, cakesAux e un array
        //auxiliar ce ajuta la stergea torturilor
        cakes = new ArrayList<>();
        cakesInCart = new ArrayList<>();
        cakesAux = new ArrayList();
        
        //initializarea modelelor ce vor fi folosite de tabelele din aplicatie
        productsTableModel = new DefaultTableModel(cakeListHeader,0);
        cartTableModel = new DefaultTableModel(shopListHeader,0);
        
        //Setarea pentru fiecare tabel a modelului folosit
        BakeryTable.setModel(productsTableModel);
        ShopTable.setModel(productsTableModel);
        CartTable.setModel(cartTableModel);
        
        //Citim datele din fisier pentru a le avea in aplicatie din prima
        ReadFile();
    }

    //Cateva proprietati de GUI pe care le-am setat manual aici deoarece window builder
    //nu-mi dadea acces la toate proprietatile
    private void CustomDesign() {
        BakeryTable.setFillsViewportHeight(true);
        ShopTable.setFillsViewportHeight(true);
        CartTable.setFillsViewportHeight(true);
        BakeryTable.getTableHeader().setBackground(new java.awt.Color(255, 224, 224));
        ShopTable.getTableHeader().setBackground(Color.getHSBColor(100, 100, 100));
        CartTable.getTableHeader().setBackground(Color.getHSBColor(100, 100, 100));
        BakeryTable.getTableHeader().setFont(new java.awt.Font("Georgia", 2, 14));
        ShopTable.getTableHeader().setFont(new java.awt.Font("Georgia", 2, 14));
        CartTable.getTableHeader().setFont(new java.awt.Font("Georgia", 2, 14));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabsContainer = new javax.swing.JTabbedPane();
        Shop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShopTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SelectQuantityLabel = new javax.swing.JLabel();
        SelectQuantityTextBox = new javax.swing.JTextField();
        AddToCartButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        CartLabel = new javax.swing.JLabel();
        BuyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TotalText = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        Bakery = new javax.swing.JPanel();
        BakeryScrollPanel = new javax.swing.JScrollPane();
        BakeryTable = new javax.swing.JTable();
        NameTextBox = new javax.swing.JTextField();
        QuantityTextBox = new javax.swing.JTextField();
        PriceTextBox = new javax.swing.JTextField();
        NameBakeryLabel = new javax.swing.JLabel();
        PriceBakeryLabel = new javax.swing.JLabel();
        QuantityBakeryLabel = new javax.swing.JLabel();
        AddCakeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CakeShop");
        setBackground(new java.awt.Color(204, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        TabsContainer.setBackground(new java.awt.Color(204, 153, 255));
        TabsContainer.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        TabsContainer.setMaximumSize(new java.awt.Dimension(1000, 700));
        TabsContainer.setMinimumSize(new java.awt.Dimension(1000, 700));

        Shop.setBackground(new java.awt.Color(255, 228, 240));
        Shop.setMaximumSize(new java.awt.Dimension(1000, 700));
        Shop.setMinimumSize(new java.awt.Dimension(1000, 700));
        Shop.setName(""); // NOI18N
        Shop.setPreferredSize(new java.awt.Dimension(1000, 700));

        jScrollPane1.setToolTipText("");

        ShopTable.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        ShopTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ShopTable.setGridColor(new java.awt.Color(102, 0, 102));
        ShopTable.setRowHeight(30);
        ShopTable.setRowMargin(2);
        ShopTable.setSelectionBackground(new java.awt.Color(255, 0, 102));
        ShopTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ShopTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ShopTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ShopTable);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel1.setText("Selecteaza un produs");

        SelectQuantityLabel.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        SelectQuantityLabel.setText("Alege cantitatea in grame:");

        SelectQuantityTextBox.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        SelectQuantityTextBox.setToolTipText("");

        AddToCartButton.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        AddToCartButton.setText("Adauga in cos");
        AddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartButtonActionPerformed(evt);
            }
        });

        CartTable.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CartTable.setEnabled(false);
        CartTable.setRowHeight(30);
        CartTable.setRowMargin(2);
        CartTable.setSelectionBackground(new java.awt.Color(255, 0, 102));
        CartTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(CartTable);
        CartTable.getAccessibleContext().setAccessibleName("");

        CartLabel.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        CartLabel.setText("Cos de cumparaturi");

        BuyButton.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        BuyButton.setText("Vinde");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setText("Total:");

        TotalText.setEditable(false);
        TotalText.setBackground(new java.awt.Color(255, 228, 240));
        TotalText.setBorder(null);
        TotalText.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jScrollPane3.setViewportView(TotalText);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("LEI");

        javax.swing.GroupLayout ShopLayout = new javax.swing.GroupLayout(Shop);
        Shop.setLayout(ShopLayout);
        ShopLayout.setHorizontalGroup(
            ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShopLayout.createSequentialGroup()
                        .addComponent(SelectQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelectQuantityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(AddToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(CartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addGroup(ShopLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        ShopLayout.setVerticalGroup(
            ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(CartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelectQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SelectQuantityTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(AddToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        TabsContainer.addTab("Magazin", Shop);

        Bakery.setBackground(new java.awt.Color(255, 255, 204));
        Bakery.setForeground(new java.awt.Color(255, 255, 255));
        Bakery.setMaximumSize(new java.awt.Dimension(1000, 700));
        Bakery.setMinimumSize(new java.awt.Dimension(1000, 700));
        Bakery.setPreferredSize(new java.awt.Dimension(1000, 700));

        BakeryScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        BakeryScrollPanel.setEnabled(false);

        BakeryTable.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        BakeryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BakeryTable.setEnabled(false);
        BakeryTable.setGridColor(new java.awt.Color(102, 0, 102));
        BakeryTable.setRequestFocusEnabled(false);
        BakeryTable.setRowHeight(30);
        BakeryTable.setRowMargin(2);
        BakeryTable.setSelectionBackground(new java.awt.Color(255, 0, 102));
        BakeryTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BakeryTable.setShowGrid(true);
        BakeryScrollPanel.setViewportView(BakeryTable);

        NameTextBox.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N

        QuantityTextBox.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N

        PriceTextBox.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N

        NameBakeryLabel.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        NameBakeryLabel.setText("Denumire");

        PriceBakeryLabel.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        PriceBakeryLabel.setText("Pret (lei/100g)");

        QuantityBakeryLabel.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        QuantityBakeryLabel.setText("Cantitate (g)");

        AddCakeButton.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        AddCakeButton.setText("Adauga tort");
        AddCakeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCakeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BakeryLayout = new javax.swing.GroupLayout(Bakery);
        Bakery.setLayout(BakeryLayout);
        BakeryLayout.setHorizontalGroup(
            BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BakeryLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BakeryScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BakeryLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BakeryLayout.createSequentialGroup()
                                .addComponent(QuantityBakeryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(QuantityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BakeryLayout.createSequentialGroup()
                                .addComponent(NameBakeryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BakeryLayout.createSequentialGroup()
                                .addComponent(PriceBakeryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PriceTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(AddCakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BakeryLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        BakeryLayout.setVerticalGroup(
            BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BakeryLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BakeryScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BakeryLayout.createSequentialGroup()
                        .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameBakeryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityBakeryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BakeryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceBakeryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddCakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        TabsContainer.addTab("Cofetarie", Bakery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Actiunea cand butonul de "adauga tort" este apasat
    private void AddCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCakeButtonActionPerformed
        //Citim datele din cele 3 textboxuri si aplicam validari
        //Aici putea fi introdus doar text
        String nameValue = NameTextBox.getText();
        if (nameValue.isEmpty()){
            return;
        }
        
        //Aici puteau fi introduse doar cifre
        String quantityText = QuantityTextBox.getText();
        if (quantityText.isEmpty() || !quantityText.matches("[0-9]+")){ 
            return;
        }
        double quantityValue = parseDouble(quantityText);
        
        //Aici puteau fi introduse doar cifre
        String priceText = PriceTextBox.getText();
        if (priceText.isEmpty() || !quantityText.matches("[0-9]+")){ 
            return;
        }
        double priceValue = parseDouble(priceText);
        
        //adauga tortul in lista
        cakes.add(new CakeModel(nameValue,quantityValue,priceValue, ++index));
        
        //rescrie fisierul sa ramana sincronizat
        UpdateFile();
        //actualizaeaza modelul pentru tabelele cu produse
        UpdateProductsTable();
        //sterge textul din campuri
        ClearBakeryFields();
    }//GEN-LAST:event_AddCakeButtonActionPerformed

    //Actiunea cand butonul de adauga in cos este apasat
    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
        //Citim cantitatea ce trebuie vanduta
        //Aici puteau fi introduse doar cifre
        String quantityText = SelectQuantityTextBox.getText();
        if (quantityText.isEmpty() || !quantityText.matches("[0-9]+")){ 
            return;
        }
        double quantityValue = parseDouble(quantityText);
        
        //tinem minte indexul randului selectat din tabel 
        var rowIndex = ShopTable.getSelectedRow(); 
        if (rowIndex == -1) {
            return;
        }
        
        //extragem datele din acel rand din tabel
        Vector rowData = productsTableModel.getDataVector().elementAt(ShopTable.convertRowIndexToModel(rowIndex));
        
        int selectedIndex = (Integer)rowData.get(0);
        String selectedName = rowData.get(1).toString();
        double selectedQuantity = (Double)rowData.get(2);
        double selectedPrice = (Double)rowData.get(3);
        
        //Daca cantitatea aleasa depaseste cantitatea existenta
        //pe stoc actiunea nu va merge mai departe
        if (selectedQuantity < quantityValue || quantityValue <= 0) {
            return;
        }
        
        //calculam pretul acelei bucati de tort
        double price = (Double)(selectedPrice*quantityValue/100);
        
        //Adaugam in lista de torturi din cosul de cumparaturi bucata de tort dorita
        cakesInCart.add(new CakeModel(selectedName, quantityValue,price,selectedIndex));
        
        //Daca cantitea aleasa este mai mare decat 0 actualizam cantitatea tortului cu ce a ramas
        if (selectedQuantity-quantityValue > 0) {
            cakes.set(selectedIndex-1, new CakeModel(selectedName, selectedQuantity-quantityValue, selectedPrice, selectedIndex));
        }//altfel stergem complet tortul din lista de produse
        else {
            RemoveCake (selectedIndex-1);
        }
        
        //actualizam tabele si fisierul
        UpdateCartTable();
        UpdateFile();
        UpdateProductsTable();
        
        //Actualizam pretul total al produselor aflate in cos
        String totalString = TotalText.getText();
        double total = 0;
        if (!totalString.isEmpty()) {
            total = parseDouble(totalString);
        }
        total += price;
        TotalText.setText(total+"");
        
        //Stergem textul introdus pentru alegerea cantitatii
        SelectQuantityTextBox.setText("");
    }//GEN-LAST:event_AddToCartButtonActionPerformed

    //Actiunea cand butonul "Vinde" este apasat"
    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        //stergem toata lista de cumparaturi
        cakesInCart.clear();
        TotalText.setText("");
        UpdateCartTable();
    }//GEN-LAST:event_BuyButtonActionPerformed

    //Sterge un tort din lista de torturi pe baza id ului sau si updateaza restul id urilor
    private void RemoveCake (int id) {
        cakesAux.clear();
        index = 0;
        for (int i = 0; i < cakes.size(); i ++) {
            if (i == id) continue;
            cakesAux.add(new CakeModel(
                cakes.get(i).name,
                cakes.get(i).quantity,
                cakes.get(i).price,
                ++index));
        }
        cakes.clear();
        for (int i = 0; i < cakesAux.size(); i ++) {
            cakes.add(new CakeModel(
                cakesAux.get(i).name,
                cakesAux.get(i).quantity,
                cakesAux.get(i).price,
                cakesAux.get(i).index));
        }
        cakesAux.clear();
    }
    
    //Functie ce updateaza modelul folosit de tabelele ce reprezinta lista total de produse
    private void UpdateProductsTable() {
        productsTableModel.setRowCount(0);
        
        for (int i = 0; i < cakes.size(); i ++) {
            Object[] cake = {
                cakes.get(i).index, 
                cakes.get(i).name,
                cakes.get(i).quantity,
                cakes.get(i).price
            };
            productsTableModel.addRow(cake);
        }
    }
    
    //Functie ce updateaza modelul folosit de tabelul ce reprezinta cosul de cumparaturi
    private void UpdateCartTable() {
        cartTableModel.setRowCount(0);
        
        for (int i = 0; i < cakesInCart.size(); i ++) {
            Object[] cake = {
                cakesInCart.get(i).name,
                cakesInCart.get(i).quantity,
                cakesInCart.get(i).price
            };
            cartTableModel.addRow(cake);
        }
    }
    
    //Functie ce sterge textul de mai multe textbox uri dupa terminarea actiunii de
    // adaugare a unui tort
    private void ClearBakeryFields() {
        NameTextBox.requestFocus();
        NameTextBox.setText("");
        QuantityTextBox.setText("");
        PriceTextBox.setText("");
    }
    
    //Citirea fisierului text
    public void ReadFile() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/java/com/mycompany/cakeshop/produse.txt"));
            String line = reader.readLine();
            while (line != null) {
		String[] parts = line.split(",");
                cakes.add(new CakeModel(parts[0], parseDouble(parts[1]), parseDouble(parts[2]), ++index));
                line = reader.readLine();
            }
            reader.close();
            UpdateProductsTable();
        } 
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
    //Rescrierea fisierului text pentru a ramane sincronizat cu datele din aplicatie
    private void UpdateFile() {
        FileWriter myFile;
        try
        {
            myFile = new FileWriter("src/main/java/com/mycompany/cakeshop/produse.txt");
             
            BufferedWriter myWriter = new BufferedWriter(myFile);
             
            for (int i = 0; i < cakes.size(); i ++) {
                myWriter.write(cakes.get(i).name + ",");
                myWriter.write(cakes.get(i).quantity + ",");
                myWriter.write(cakes.get(i).price+"");
                myWriter.newLine();
            }
 
            myWriter.close();
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCakeButton;
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JPanel Bakery;
    private javax.swing.JScrollPane BakeryScrollPanel;
    private javax.swing.JTable BakeryTable;
    private javax.swing.JButton BuyButton;
    private javax.swing.JLabel CartLabel;
    private javax.swing.JTable CartTable;
    private javax.swing.JLabel NameBakeryLabel;
    javax.swing.JTextField NameTextBox;
    private javax.swing.JLabel PriceBakeryLabel;
    private javax.swing.JTextField PriceTextBox;
    private javax.swing.JLabel QuantityBakeryLabel;
    private javax.swing.JTextField QuantityTextBox;
    private javax.swing.JLabel SelectQuantityLabel;
    private javax.swing.JTextField SelectQuantityTextBox;
    private javax.swing.JPanel Shop;
    private javax.swing.JTable ShopTable;
    private javax.swing.JTabbedPane TabsContainer;
    private javax.swing.JTextPane TotalText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
