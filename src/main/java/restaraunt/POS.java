/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaraunt;

//import java.awt.CardLayout;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;


/**
 *
 * @author trims
 */
public class POS extends javax.swing.JFrame {

    public static final ArrayList<Food> emptyList = new ArrayList<Food>();
   
    public static double seat1Price = 0.0;
     public static double seat2Price = 0.0;
      public static double seat3Price = 0.0;
       public static double seat4Price = 0.0;
        public static double totalPrice = 0.0;
        public static String changeDueFinal = "";
        public static String creditDueFinal= "";
  
public static ArrayList<Food> appsList = initFoodList(1);
public static ArrayList<Food> saladsList = initFoodList(2);
public static ArrayList<Food> sandwhichesList = initFoodList(3);
public static ArrayList<Food> entreesList = initFoodList(4);
public static ArrayList<Food> dessertsList = initFoodList(5);
public static ArrayList<Food> drinksList  = initFoodList(10);

public static ArrayList<Food> addToOrderList = new ArrayList<Food>();

public  static DefaultListModel appModel = new DefaultListModel();
public static DefaultListModel saladModel = new DefaultListModel();
public static DefaultListModel sandModel = new DefaultListModel();
public static DefaultListModel entreeModel = new DefaultListModel();
public static DefaultListModel dessertModel = new DefaultListModel();
public static DefaultListModel drinkModel = new DefaultListModel();
public static DefaultListModel orderModel = new DefaultListModel();
public static DefaultListModel paymentModel = new DefaultListModel();
public static boolean paymentMethodChosen = false;
public static String paymentMethod= "";
//table 10 declarations
public static Table table10 = new Table(10,10,4);
public static Order table10Seat1Order = new Order(10, 1);
public static  Order table10Seat2Order = new Order(10, 2);
public  static Order table10Seat3Order = new Order(10, 3);
public static Order table10Seat4Order = new Order(10, 4);

public static Waiter currentWaiter = new Waiter(0101, "Temp");

public static String waiterName = "";
//table 20 declarations
public static Table table20 = new Table(20,20,4);
public static Order table20Seat1Order = new Order(20,1);
public static Order table20Seat2Order = new Order(20, 2);
public static Order table20Seat3Order = new Order(20, 3);
public static Order table20Seat4Order = new Order(20, 4);

//table 30 declarations
public  Table table30 = new Table(30,30,4);
public static Order table30Seat1Order = new Order(30, 1);
public static Order table30Seat2Order = new Order(30, 2);
public static Order table30Seat3Order = new Order(30, 3);
public static  Order table30Seat4Order = new Order(30, 4);

//table 40 declarations
public static Table table40 = new Table(40,40,4);
public static Order table40Seat1Order = new Order(40, 1);
public static Order table40Seat2Order = new Order(40,  2);
public static Order table40Seat3Order = new Order(40, 3);
public static Order table40Seat4Order = new Order(40,  4);
//table 50 declarations
public static Table table50 = new Table(50,50,4);
public static Order table50Seat1Order = new Order(50, 1);
public static Order table50Seat2Order = new Order(50,  2);
public static Order table50Seat3Order = new Order(50, 3);
public static Order table50Seat4Order = new Order(50,  4);

//table 60 declarations
public static Table table60 = new Table(60,60,4);
public static Order table60Seat1Order = new Order(60,  1);
public static Order table60Seat2Order = new Order(60, 2);
public static Order table60Seat3Order = new Order(60,  3);
public static Order table60Seat4Order = new Order(60,4);
//table 61 declarations
public static Table table61 = new Table(61,61,4);
public static Order table61Seat1Order = new Order(61, 1);
public static Order table61Seat2Order = new Order(61,  2);
public static Order table61Seat3Order = new Order(61, 3);
public static Order table61Seat4Order = new Order(61,  4);




public static int currentIndex = 100;
public static String type = "";
public static int currentSeat = 0;

public static Table currentTable = new Table(1,1,4);
public static Order currentOrderFinal = new Order(1,emptyList,1);



    /**
     * Creates new form POS
     */
    public POS() {
        initComponents();
    }
    
    //double ids[] = {1289, 1863, 8246};            //stores an array of acceptable id numbers for login
    Waiter steven = new Waiter(1289, "Steven");
    Waiter lietzy = new Waiter(0000, "Jacob");
    Waiter rafael = new Waiter(8246, "Raf");
    boolean stevenLog = false;                    //will flag which server is currently logged in
    boolean lietzyLog = false;                    //will flag which server is currently logged in
    boolean rafaelLog = false;                    //will flag which server is currently logged in
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Tables = new javax.swing.JPanel();
        tbl10 = new javax.swing.JButton();
        tbl20 = new javax.swing.JButton();
        tbl30 = new javax.swing.JButton();
        tbl40 = new javax.swing.JButton();
        tbl50 = new javax.swing.JButton();
        tbl60 = new javax.swing.JButton();
        tbl61 = new javax.swing.JButton();
        exitTables = new javax.swing.JButton();
        makeTable = new javax.swing.JButton();
        runReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        waiterNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Payment = new javax.swing.JPanel();
        seatPayment = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        paymentList = new javax.swing.JList<>();
        Pay = new javax.swing.JPanel();
        emptyCash = new javax.swing.JPanel();
        creditCard = new javax.swing.JPanel();
        cardPayment = new javax.swing.JLabel();
        tipLabel = new javax.swing.JLabel();
        tipIn = new javax.swing.JTextField();
        cardAccept = new javax.swing.JButton();
        cardCancel = new javax.swing.JButton();
        totalCardPayment = new javax.swing.JLabel();
        payInCash = new javax.swing.JPanel();
        totalPayment = new javax.swing.JLabel();
        changeDue = new javax.swing.JLabel();
        payIn = new javax.swing.JTextField();
        accept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        change = new javax.swing.JLabel();
        btnCard = new javax.swing.JButton();
        btnCash = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        seat1Payment = new javax.swing.JToggleButton();
        seat2 = new javax.swing.JToggleButton();
        seat3 = new javax.swing.JToggleButton();
        seat4 = new javax.swing.JToggleButton();
        allSeat = new javax.swing.JToggleButton();
        cashOutBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Order = new javax.swing.JPanel();
        dynamicPanel = new javax.swing.JPanel();
        orderPanel = new javax.swing.JPanel();
        currentOrder = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        appetizers = new javax.swing.JPanel();
        appList = new javax.swing.JScrollPane();
        appetizerList = new javax.swing.JList<>();
        salads = new javax.swing.JPanel();
        saladPane = new javax.swing.JScrollPane();
        saladList = new javax.swing.JList<>();
        sandwiches = new javax.swing.JPanel();
        sandwhichPane = new javax.swing.JScrollPane();
        sandwhichList = new javax.swing.JList<>();
        entrees = new javax.swing.JPanel();
        entreePane = new javax.swing.JScrollPane();
        entreeList = new javax.swing.JList<>();
        desserts = new javax.swing.JPanel();
        dessertPane = new javax.swing.JScrollPane();
        desserList = new javax.swing.JList<>();
        drinks = new javax.swing.JPanel();
        drinkPane = new javax.swing.JScrollPane();
        drinkList = new javax.swing.JList<>();
        allergies = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        upcharge = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList<>();
        noUpcharge = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList10 = new javax.swing.JList<>();
        btnApps = new javax.swing.JButton();
        btnSalad = new javax.swing.JButton();
        btnSandwich = new javax.swing.JButton();
        btnEntree = new javax.swing.JButton();
        btnDessert = new javax.swing.JButton();
        btnDrinks = new javax.swing.JButton();
        addToOderBtn = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnAddNoCharge = new javax.swing.JButton();
        btnAddCharge = new javax.swing.JButton();
        btnAllergy = new javax.swing.JButton();
        btnVoid = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        s1 = new javax.swing.JToggleButton();
        s2 = new javax.swing.JToggleButton();
        s3 = new javax.swing.JToggleButton();
        s4 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        tableNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Back Row Group POS");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(153, 153, 153));
        setName("POS"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setPreferredSize(new java.awt.Dimension(1300, 750));
        mainPanel.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setPreferredSize(new java.awt.Dimension(1300, 750));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOne.setBackground(new java.awt.Color(153, 153, 153));
        btnOne.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnOne.setText("1");
        btnOne.setBorder(null);
        btnOne.setPreferredSize(new java.awt.Dimension(55, 55));
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        login.add(btnOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        btnTwo.setBackground(new java.awt.Color(153, 153, 153));
        btnTwo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnTwo.setText("2");
        btnTwo.setBorder(null);
        btnTwo.setPreferredSize(new java.awt.Dimension(55, 55));
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        login.add(btnTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        btnThree.setBackground(new java.awt.Color(153, 153, 153));
        btnThree.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnThree.setText("3");
        btnThree.setBorder(null);
        btnThree.setPreferredSize(new java.awt.Dimension(55, 55));
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        login.add(btnThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        btnFour.setBackground(new java.awt.Color(153, 153, 153));
        btnFour.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnFour.setText("4");
        btnFour.setBorder(null);
        btnFour.setPreferredSize(new java.awt.Dimension(55, 55));
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        login.add(btnFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        btnFive.setBackground(new java.awt.Color(153, 153, 153));
        btnFive.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnFive.setText("5");
        btnFive.setBorder(null);
        btnFive.setPreferredSize(new java.awt.Dimension(55, 55));
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        login.add(btnFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        btnSix.setBackground(new java.awt.Color(153, 153, 153));
        btnSix.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSix.setText("6");
        btnSix.setPreferredSize(new java.awt.Dimension(55, 55));
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        login.add(btnSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        btnSeven.setBackground(new java.awt.Color(153, 153, 153));
        btnSeven.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSeven.setText("7");
        btnSeven.setBorder(null);
        btnSeven.setPreferredSize(new java.awt.Dimension(55, 55));
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        login.add(btnSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        btnEight.setBackground(new java.awt.Color(153, 153, 153));
        btnEight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnEight.setText("8");
        btnEight.setBorder(null);
        btnEight.setPreferredSize(new java.awt.Dimension(55, 55));
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        login.add(btnEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        btnNine.setBackground(new java.awt.Color(153, 153, 153));
        btnNine.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnNine.setText("9");
        btnNine.setBorder(null);
        btnNine.setPreferredSize(new java.awt.Dimension(55, 55));
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        login.add(btnNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));

        btnCancel.setBackground(new java.awt.Color(153, 153, 153));
        btnCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCancel.setText("X");
        btnCancel.setBorder(null);
        btnCancel.setPreferredSize(new java.awt.Dimension(55, 55));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        login.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        btnZero.setBackground(new java.awt.Color(153, 153, 153));
        btnZero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(null);
        btnZero.setPreferredSize(new java.awt.Dimension(55, 55));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        login.add(btnZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        btnOk.setBackground(new java.awt.Color(153, 153, 153));
        btnOk.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.setBorder(null);
        btnOk.setPreferredSize(new java.awt.Dimension(55, 55));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        login.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, -1));

        input.setBackground(new java.awt.Color(153, 153, 153));
        input.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        input.setBorder(null);
        login.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Welcome, Please Enter Employee ID");
        login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("ID:");
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setText("Exit Program");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        login.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 710, 170, -1));

        mainPanel.add(login, "card5");

        Tables.setBackground(new java.awt.Color(153, 153, 153));
        Tables.setPreferredSize(new java.awt.Dimension(1300, 750));
        Tables.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl10.setBackground(new java.awt.Color(153, 153, 153));
        tbl10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl10.setText("10");
        tbl10.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl10ActionPerformed(evt);
            }
        });
        Tables.add(tbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 110, 110));

        tbl20.setBackground(new java.awt.Color(153, 153, 153));
        tbl20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl20.setText("20");
        tbl20.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl20ActionPerformed(evt);
            }
        });
        Tables.add(tbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 110));

        tbl30.setBackground(new java.awt.Color(153, 153, 153));
        tbl30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl30.setText("30");
        tbl30.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl30ActionPerformed(evt);
            }
        });
        Tables.add(tbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 110, 110));

        tbl40.setBackground(new java.awt.Color(153, 153, 153));
        tbl40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl40.setText("40");
        tbl40.setToolTipText("");
        tbl40.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl40ActionPerformed(evt);
            }
        });
        Tables.add(tbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 110, 110));

        tbl50.setBackground(new java.awt.Color(153, 153, 153));
        tbl50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl50.setText("50");
        tbl50.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl50ActionPerformed(evt);
            }
        });
        Tables.add(tbl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 110, 110));

        tbl60.setBackground(new java.awt.Color(153, 153, 153));
        tbl60.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl60.setText("60");
        tbl60.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl60ActionPerformed(evt);
            }
        });
        Tables.add(tbl60, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, 110));

        tbl61.setBackground(new java.awt.Color(153, 153, 153));
        tbl61.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tbl61.setText("61");
        tbl61.setPreferredSize(new java.awt.Dimension(80, 30));
        tbl61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl61ActionPerformed(evt);
            }
        });
        Tables.add(tbl61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 110));

        exitTables.setBackground(new java.awt.Color(153, 153, 153));
        exitTables.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        exitTables.setText("Exit");
        exitTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitTablesActionPerformed(evt);
            }
        });
        Tables.add(exitTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 680, 140, 50));

        makeTable.setBackground(new java.awt.Color(153, 153, 153));
        makeTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        makeTable.setText("Make Table");
        Tables.add(makeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 140, 50));

        runReport.setBackground(new java.awt.Color(153, 153, 153));
        runReport.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        runReport.setText("Run Report");
        runReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runReportActionPerformed(evt);
            }
        });
        Tables.add(runReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 140, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Hello");
        Tables.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        waiterNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        waiterNameLabel.setText(waiterName);
        Tables.add(waiterNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Tables");
        Tables.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        mainPanel.add(Tables, "tables");

        Payment.setBackground(new java.awt.Color(153, 153, 153));
        Payment.setPreferredSize(new java.awt.Dimension(1300, 750));
        Payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seatPayment.setBackground(new java.awt.Color(204, 204, 204));
        seatPayment.setLayout(new java.awt.CardLayout());

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));

        paymentList.setBackground(new java.awt.Color(204, 204, 204));
        paymentList.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        paymentList.setModel(paymentModel);
        jScrollPane4.setViewportView(paymentList);

        seatPayment.add(jScrollPane4, "card2");

        Payment.add(seatPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 680, 420));

        Pay.setLayout(new java.awt.CardLayout());

        emptyCash.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout emptyCashLayout = new javax.swing.GroupLayout(emptyCash);
        emptyCash.setLayout(emptyCashLayout);
        emptyCashLayout.setHorizontalGroup(
            emptyCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emptyCashLayout.setVerticalGroup(
            emptyCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Pay.add(emptyCash, "card3");

        creditCard.setBackground(new java.awt.Color(204, 204, 204));
        creditCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardPayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cardPayment.setText("Total Card Payment:");
        creditCard.add(cardPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 40));

        tipLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tipLabel.setText("Tip:");
        creditCard.add(tipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 40));

        tipIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        creditCard.add(tipIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        cardAccept.setBackground(new java.awt.Color(204, 204, 204));
        cardAccept.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cardAccept.setText("Accept");
        cardAccept.setBorder(null);
        cardAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardAcceptActionPerformed(evt);
            }
        });
        creditCard.add(cardAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, 30));

        cardCancel.setBackground(new java.awt.Color(204, 204, 204));
        cardCancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cardCancel.setText("Cancel");
        cardCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardCancelActionPerformed(evt);
            }
        });
        creditCard.add(cardCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 140, 100, 30));

        totalCardPayment.setBackground(new java.awt.Color(255, 255, 255));
        totalCardPayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        totalCardPayment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalCardPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        creditCard.add(totalCardPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 230, 30));

        Pay.add(creditCard, "card4");

        payInCash.setBackground(new java.awt.Color(204, 204, 204));
        payInCash.setPreferredSize(new java.awt.Dimension(676, 176));
        payInCash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPayment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        totalPayment.setText("Total Cash Payment:");
        payInCash.add(totalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 40));

        changeDue.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        changeDue.setText("Change Due:");
        payInCash.add(changeDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 40));

        payIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        payInCash.add(payIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 230, 30));

        accept.setBackground(new java.awt.Color(204, 204, 204));
        accept.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        payInCash.add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, -1));

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        payInCash.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 140, 100, 30));

        change.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        change.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        payInCash.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, 30));

        Pay.add(payInCash, "card2");

        Payment.add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 680, 180));

        btnCard.setBackground(new java.awt.Color(153, 153, 153));
        btnCard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCard.setText("Credit Card");
        btnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardActionPerformed(evt);
            }
        });
        Payment.add(btnCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 250, 60));

        btnCash.setBackground(new java.awt.Color(153, 153, 153));
        btnCash.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnCash.setText("Cash");
        btnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashActionPerformed(evt);
            }
        });
        Payment.add(btnCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 250, 60));

        btnExit.setBackground(new java.awt.Color(153, 153, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        Payment.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 690, 200, 60));

        seat1Payment.setBackground(new java.awt.Color(153, 153, 153));
        seat1Payment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        seat1Payment.setText("Seat 1");
        seat1Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat1PaymentActionPerformed(evt);
            }
        });
        Payment.add(seat1Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        seat2.setBackground(new java.awt.Color(153, 153, 153));
        seat2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        seat2.setText("Seat 2");
        seat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat2ActionPerformed(evt);
            }
        });
        Payment.add(seat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, -1));

        seat3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        seat3.setText("Seat 3");
        seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat3ActionPerformed(evt);
            }
        });
        Payment.add(seat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, -1));

        seat4.setBackground(new java.awt.Color(153, 153, 153));
        seat4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        seat4.setText("Seat 4");
        seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat4ActionPerformed(evt);
            }
        });
        Payment.add(seat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 100, -1));

        allSeat.setBackground(new java.awt.Color(153, 153, 153));
        allSeat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        allSeat.setText("All Seats");
        allSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allSeatActionPerformed(evt);
            }
        });
        Payment.add(allSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 140, -1));

        cashOutBtn.setBackground(new java.awt.Color(153, 153, 153));
        cashOutBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cashOutBtn.setText("Confirm and Cash Out Order");
        cashOutBtn.setToolTipText("Caution: This will clear out whatever order you have selected please ensure the customer has paid");
        cashOutBtn.setEnabled(false);
        cashOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashOutBtnActionPerformed(evt);
            }
        });
        Payment.add(cashOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 350, 60));

        returnBtn.setBackground(new java.awt.Color(153, 153, 153));
        returnBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        returnBtn.setText("Go Back\n");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        Payment.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Select Payment Type");
        Payment.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        mainPanel.add(Payment, "payment");

        Order.setBackground(new java.awt.Color(153, 153, 153));
        Order.setPreferredSize(new java.awt.Dimension(1300, 750));
        Order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dynamicPanel.setBackground(new java.awt.Color(0, 204, 0));
        dynamicPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 51), new java.awt.Color(51, 51, 51)));
        dynamicPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dynamicPanel.setLayout(new java.awt.CardLayout());

        orderPanel.setBackground(new java.awt.Color(204, 204, 204));

        currentOrder.setBackground(new java.awt.Color(204, 204, 204));
        currentOrder.setBorder(null);

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jList1.setModel(orderModel);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        currentOrder.setViewportView(jList1);

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        dynamicPanel.add(orderPanel, "card8");

        appetizers.setBackground(new java.awt.Color(204, 204, 204));

        appList.setBackground(new java.awt.Color(153, 153, 153));
        appList.setBorder(null);

        appetizerList.setBackground(new java.awt.Color(204, 204, 204));
        appetizerList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        appetizerList.setModel(appModel);
        appetizerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appetizerListMouseClicked(evt);
            }
        });
        appList.setViewportView(appetizerList);

        javax.swing.GroupLayout appetizersLayout = new javax.swing.GroupLayout(appetizers);
        appetizers.setLayout(appetizersLayout);
        appetizersLayout.setHorizontalGroup(
            appetizersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appList, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        appetizersLayout.setVerticalGroup(
            appetizersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appList, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(appetizers, "card7");

        saladList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        saladList.setModel(saladModel);
        saladList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saladListMouseClicked(evt);
            }
        });
        saladPane.setViewportView(saladList);

        javax.swing.GroupLayout saladsLayout = new javax.swing.GroupLayout(salads);
        salads.setLayout(saladsLayout);
        saladsLayout.setHorizontalGroup(
            saladsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saladPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        saladsLayout.setVerticalGroup(
            saladsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saladPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(salads, "card6");

        sandwhichList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sandwhichList.setModel(sandModel);
        sandwhichList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sandwhichListMouseClicked(evt);
            }
        });
        sandwhichPane.setViewportView(sandwhichList);

        javax.swing.GroupLayout sandwichesLayout = new javax.swing.GroupLayout(sandwiches);
        sandwiches.setLayout(sandwichesLayout);
        sandwichesLayout.setHorizontalGroup(
            sandwichesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sandwhichPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        sandwichesLayout.setVerticalGroup(
            sandwichesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sandwhichPane, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(sandwiches, "card5");

        entreeList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        entreeList.setModel(entreeModel);
        entreeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entreeListMouseClicked(evt);
            }
        });
        entreePane.setViewportView(entreeList);

        javax.swing.GroupLayout entreesLayout = new javax.swing.GroupLayout(entrees);
        entrees.setLayout(entreesLayout);
        entreesLayout.setHorizontalGroup(
            entreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entreePane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        entreesLayout.setVerticalGroup(
            entreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entreePane, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(entrees, "card4");

        desserList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        desserList.setModel(dessertModel);
        desserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desserListMouseClicked(evt);
            }
        });
        dessertPane.setViewportView(desserList);

        javax.swing.GroupLayout dessertsLayout = new javax.swing.GroupLayout(desserts);
        desserts.setLayout(dessertsLayout);
        dessertsLayout.setHorizontalGroup(
            dessertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dessertPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        dessertsLayout.setVerticalGroup(
            dessertsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dessertPane, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(desserts, "card3");

        drinkList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        drinkList.setModel(drinkModel);
        drinkList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinkListMouseClicked(evt);
            }
        });
        drinkPane.setViewportView(drinkList);

        javax.swing.GroupLayout drinksLayout = new javax.swing.GroupLayout(drinks);
        drinks.setLayout(drinksLayout);
        drinksLayout.setHorizontalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinkPane, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        drinksLayout.setVerticalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drinkPane, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
        );

        dynamicPanel.add(drinks, "card2");

        jList8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jList8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "!PEANUT!", "!GLUTEN!", "!ONION!", "!GARLIC!", "!DAIRY!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList8);

        javax.swing.GroupLayout allergiesLayout = new javax.swing.GroupLayout(allergies);
        allergies.setLayout(allergiesLayout);
        allergiesLayout.setHorizontalGroup(
            allergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        allergiesLayout.setVerticalGroup(
            allergiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        dynamicPanel.add(allergies, "card11");

        jList9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jList9.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "$Bacon", "$Extra Meat", "$Extra Side", "$Double" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList9);

        javax.swing.GroupLayout upchargeLayout = new javax.swing.GroupLayout(upcharge);
        upcharge.setLayout(upchargeLayout);
        upchargeLayout.setHorizontalGroup(
            upchargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        upchargeLayout.setVerticalGroup(
            upchargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        dynamicPanel.add(upcharge, "card10");

        jList10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jList10.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No Cheese", "Rare", "Medium Rare", "Medium", "Medium Well", "Well", "No Onion", "No Tomato", "No Mayo", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList10);

        javax.swing.GroupLayout noUpchargeLayout = new javax.swing.GroupLayout(noUpcharge);
        noUpcharge.setLayout(noUpchargeLayout);
        noUpchargeLayout.setHorizontalGroup(
            noUpchargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        noUpchargeLayout.setVerticalGroup(
            noUpchargeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        dynamicPanel.add(noUpcharge, "card9");

        Order.add(dynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 690, 550));

        btnApps.setBackground(new java.awt.Color(153, 153, 153));
        btnApps.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnApps.setText("Appetizers");
        btnApps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppsActionPerformed(evt);
            }
        });
        Order.add(btnApps, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 170, 50));

        btnSalad.setBackground(new java.awt.Color(153, 153, 153));
        btnSalad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalad.setText("Salads");
        btnSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaladActionPerformed(evt);
            }
        });
        Order.add(btnSalad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, 170, 50));

        btnSandwich.setBackground(new java.awt.Color(153, 153, 153));
        btnSandwich.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSandwich.setText("Sandwiches");
        btnSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandwichActionPerformed(evt);
            }
        });
        Order.add(btnSandwich, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 150, 170, 50));

        btnEntree.setBackground(new java.awt.Color(153, 153, 153));
        btnEntree.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEntree.setText("Entrees");
        btnEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntreeActionPerformed(evt);
            }
        });
        Order.add(btnEntree, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 170, 50));

        btnDessert.setBackground(new java.awt.Color(153, 153, 153));
        btnDessert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDessert.setText("Desserts");
        btnDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDessertActionPerformed(evt);
            }
        });
        Order.add(btnDessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, 170, 50));

        btnDrinks.setBackground(new java.awt.Color(153, 153, 153));
        btnDrinks.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDrinks.setText("Drinks");
        btnDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinksActionPerformed(evt);
            }
        });
        Order.add(btnDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, 170, 50));

        addToOderBtn.setBackground(new java.awt.Color(153, 153, 153));
        addToOderBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        addToOderBtn.setText("Add");
        addToOderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOderBtnActionPerformed(evt);
            }
        });
        Order.add(addToOderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 170, 50));

        btnPay.setBackground(new java.awt.Color(153, 153, 153));
        btnPay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnPay.setText("Go To Payment");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        Order.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 170, 50));

        btnSend.setBackground(new java.awt.Color(153, 153, 153));
        btnSend.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSend.setText("Send/Exit");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        Order.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 690, 170, 50));

        btnAddNoCharge.setBackground(new java.awt.Color(153, 153, 153));
        btnAddNoCharge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAddNoCharge.setText("Add");
        btnAddNoCharge.setEnabled(false);
        btnAddNoCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNoChargeActionPerformed(evt);
            }
        });
        Order.add(btnAddNoCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 170, 60));

        btnAddCharge.setBackground(new java.awt.Color(153, 153, 153));
        btnAddCharge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAddCharge.setText("$Add");
        btnAddCharge.setEnabled(false);
        btnAddCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChargeActionPerformed(evt);
            }
        });
        Order.add(btnAddCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 170, 60));

        btnAllergy.setBackground(new java.awt.Color(153, 153, 153));
        btnAllergy.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAllergy.setText("!ALLERGY!");
        btnAllergy.setEnabled(false);
        btnAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllergyActionPerformed(evt);
            }
        });
        Order.add(btnAllergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 170, 60));

        btnVoid.setBackground(new java.awt.Color(153, 153, 153));
        btnVoid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnVoid.setText("Void");
        btnVoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoidActionPerformed(evt);
            }
        });
        Order.add(btnVoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 170, 50));

        btnOrder.setBackground(new java.awt.Color(153, 153, 153));
        btnOrder.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        Order.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 170, 50));

        s1.setBackground(new java.awt.Color(153, 153, 153));
        s1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s1.setText("Seat 1");
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        Order.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, -1));

        s2.setBackground(new java.awt.Color(153, 153, 153));
        s2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s2.setText("Seat 2");
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        Order.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, -1));

        s3.setBackground(new java.awt.Color(153, 153, 153));
        s3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s3.setText("Seat 3");
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        Order.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, -1));

        s4.setBackground(new java.awt.Color(153, 153, 153));
        s4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s4.setText("Seat 4");
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        Order.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Table:");
        Order.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, -1));

        tableNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tableNameLabel.setText("1");
        Order.add(tableNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 50, -1));

        mainPanel.add(Order, "order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String getPayIn() {
        return payIn.getText();
    }
    
    public String getTip(){
        return tipIn.getText();
    }
    
    private void disableButtons(){
        //disable the buttons on the order panel until a toggle button is enabled
        btnOrder.setEnabled(false);
        addToOderBtn.setEnabled(false);
        btnVoid.setEnabled(false);
        btnApps.setEnabled(false);
        btnSalad.setEnabled(false);
        btnSandwich.setEnabled(false);
        btnEntree.setEnabled(false);
        btnDrinks.setEnabled(false);
        btnDessert.setEnabled(false);
        btnAddNoCharge.setEnabled(false);
        btnAddCharge.setEnabled(false);
        btnAllergy.setEnabled(false);
    }
    
    private void enableButtons(){
        //enable the buttons on the order panel while a toggle button is enabled
         btnOrder.setEnabled(true);
        addToOderBtn.setEnabled(true);
        btnVoid.setEnabled(true);
        btnApps.setEnabled(true);
        btnSalad.setEnabled(true);
        btnSandwich.setEnabled(true);
        btnEntree.setEnabled(true);
        btnDrinks.setEnabled(true);
        btnDessert.setEnabled(true);
        btnAddNoCharge.setEnabled(true);
        btnAddCharge.setEnabled(true);
        btnAllergy.setEnabled(true);
    }
    
    private void tbl50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl50ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_tbl50ActionPerformed

    private void btnEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntreeActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(entrees);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnEntreeActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        String takeText;
        takeText = input.getText() + btnOne.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        String takeText;
        takeText = input.getText() + btnTwo.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        String takeText;
        takeText = input.getText() + btnThree.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        String takeText;
        takeText = input.getText() + btnFour.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        String takeText;
        takeText = input.getText() + btnFive.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        String takeText;
        takeText = input.getText() + btnSix.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        String takeText;
        takeText = input.getText() + btnSeven.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        String takeText;
        takeText = input.getText() + btnEight.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        String takeText;
        takeText = input.getText() + btnNine.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        String takeText;
        takeText = input.getText() + btnZero.getText();
        input.setText(takeText);
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        input.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        String inputID;                                         //insantiate an empty string
        //boolean isAuthorized = false;                           //this boolean will tell us if the user is authorized
        inputID = input.getText();                              //get the text from the text box
        double inputIDNum = Double.parseDouble(inputID);        //parse it to a double
        
        /*for(int i = 0; i < ids.length; i++){                    //iterate through the array of ID numbers
            if(inputIDNum == ids[i]){                           //if the entered ID number matches the current element in the array 
                isAuthorized = true;                            //set to true
            }    
        }*/
        
        if(inputIDNum == steven.getId()){
            currentWaiter = steven;
            
            stevenLog = true;
            lietzyLog = false;
            rafaelLog = false;
        }
        else if(inputIDNum == lietzy.getId()){
            currentWaiter = lietzy;
            lietzyLog = true;
            stevenLog = false;
            rafaelLog = false;
        }
        else if(inputIDNum == rafael.getId()){
            currentWaiter = rafael;
            rafaelLog = true;
            stevenLog = false;
            lietzyLog = false;
        }
        
        /*if(isAuthorized){                                       //if boolean is true
            mainPanel.removeAll();                              //move to the tables JPanel
            mainPanel.add(Tables);                              
            mainPanel.repaint();
            mainPanel.revalidate();
        }
        else{
            input.setText("");                                  //empty input text field
        }*/
        
        if(stevenLog || lietzyLog || rafaelLog){
            mainPanel.removeAll();                              //move to the tables JPanel
            mainPanel.add(Tables);                              
            mainPanel.repaint();
            mainPanel.revalidate();
            waiterNameLabel.setText(currentWaiter.getName());
        }
        else{
            input.setText("");
        }
        
        disableButtons();                                       //call method to disable order buttons
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void tbl40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl40ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table40;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
    }//GEN-LAST:event_tbl40ActionPerformed

    private void tbl30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl30ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table30;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
        
        
        
    }//GEN-LAST:event_tbl30ActionPerformed

    private void tbl20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl20ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table20;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
    }//GEN-LAST:event_tbl20ActionPerformed

    private void tbl10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl10ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table10;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
    }//GEN-LAST:event_tbl10ActionPerformed

    private void tbl60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl60ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table60;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
    }//GEN-LAST:event_tbl60ActionPerformed

    private void tbl61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl61ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        currentTable = table61;
        tableNameLabel.setText(Integer.toString(currentTable.getId()));
    }//GEN-LAST:event_tbl61ActionPerformed

    private void exitTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitTablesActionPerformed
        mainPanel.removeAll();
        mainPanel.add(login);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        dynamicPanel.removeAll();
        dynamicPanel.add(orderPanel);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_exitTablesActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Payment);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        mainPanel.removeAll();
        mainPanel.add(login);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        Pay.removeAll();
        Pay.add(emptyCash);
        Pay.repaint();
        Pay.revalidate();
        
        input.setText("");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashActionPerformed
        Pay.removeAll();
        Pay.add(payInCash);
        Pay.repaint();
        Pay.revalidate();
    }//GEN-LAST:event_btnCashActionPerformed

    private void btnAppsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppsActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(appetizers);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnAppsActionPerformed

    private void btnSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaladActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(salads);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnSaladActionPerformed

    private void btnSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandwichActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(sandwiches);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnSandwichActionPerformed

    private void btnDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDessertActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(desserts);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnDessertActionPerformed

    private void btnDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinksActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(drinks);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnDrinksActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(orderPanel);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
      
        orderModel.clear();
        ArrayList<Food> tempList = currentOrderFinal.getOrder();
       
        if(s1.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                tempList = table10Seat1Order.getOrder();
                break;
            }
            case 20:{
                tempList = table20Seat1Order.getOrder();
                break;
            }
            case 30:{
                 
              tempList = table30Seat1Order.getOrder();
                break;
            }
            case 40:{
                tempList = table40Seat1Order.getOrder();
                break;
            }
            case 50:{
                tempList = table50Seat1Order.getOrder();
                break;
            }
            case 60:{
                tempList = table60Seat1Order.getOrder();
                break;
            }
            case 61:{
                tempList = table61Seat1Order.getOrder();
                break;
            }
            
        }
        }
         if(s2.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                tempList = table10Seat2Order.getOrder();
                break;
            }
            case 20:{
                tempList = table20Seat2Order.getOrder();
                break;
            }
            case 30:{
                
               tempList = table30Seat2Order.getOrder();
                break;
            }
            case 40:{
                tempList = table40Seat2Order.getOrder();
                break;
            }
            case 50:{
                tempList = table50Seat2Order.getOrder();
                break;
            }
            case 60:{
                tempList = table60Seat2Order.getOrder();
                break;
            }
            case 61:{
                tempList = table61Seat2Order.getOrder();
                break;
            }
            
        }
        
        }
         if(s3.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                tempList = table10Seat3Order.getOrder();
                break;
            }
            case 20:{
                tempList = table20Seat3Order.getOrder();
                break;
            }
            case 30:{
    
               tempList = table30Seat3Order.getOrder();
                break;
            }
            case 40:{
                tempList = table40Seat3Order.getOrder();
                break;
            }
            case 50:{
                tempList = table50Seat3Order.getOrder();
                break;
            }
            case 60:{
                tempList = table60Seat3Order.getOrder();
                break;
            }
            case 61:{
                tempList = table61Seat3Order.getOrder();
                break;
            }
        }
        
        }
         if(s4.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                tempList = table10Seat4Order.getOrder();
                break;
            }
            case 20:{
                tempList = table20Seat4Order.getOrder();
                break;
            }
            case 30:{
                tempList = table30Seat4Order.getOrder();
               
                
                break;
            }
            case 40:{
                tempList = table40Seat4Order.getOrder();
                break;
            }
            case 50:{
                tempList = table50Seat4Order.getOrder();
                break;
            }
            case 60:{
                tempList = table60Seat4Order.getOrder();
                break;
            }
            case 61:{
                tempList = table61Seat4Order.getOrder();
                break;
            }
            
        }
        
        }
         for(int i = 0; i < tempList.size(); i++){
            orderModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getPrice());
      
         }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardActionPerformed
        Pay.removeAll();
        Pay.add(creditCard);
        Pay.repaint();
        Pay.revalidate();
    }//GEN-LAST:event_btnCardActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        //let buttons be enabled when toggle button is pushed, and disable when it is no longer selected
       // orderModel.clear();
        currentSeat = 1;
        
    
        if(s1.isSelected()){
            enableButtons();  
            //enable menu buttons
            //disable other toggle buttons
            s2.setEnabled(false);
            s3.setEnabled(false);
            s4.setEnabled(false);
            
        
        }
        else{
            orderModel.clear();
            disableButtons();                       //disable menu buttons
            //enable other toggle buttons
            s2.setEnabled(true);
            s3.setEnabled(true);
            s4.setEnabled(true);
           
        }
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        //let buttons be enabled when toggle button is pushed, and disable when it is no longer selected
       //  orderModel.clear();
        currentSeat = 2;
        if(s2.isSelected()){
            enableButtons();                        //enable menu buttons
            //disable other toggle buttons
            s1.setEnabled(false);
            s3.setEnabled(false);
            s4.setEnabled(false);
            
            
           
        }
        else{
            orderModel.clear();
            disableButtons();                       //disable menu buttons
            //enable other toggle buttons
            s1.setEnabled(true);
            s3.setEnabled(true);
            s4.setEnabled(true);
             
          
        }
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        //let buttons be enabled when toggle button is pushed, and disable when it is no longer selected
        if(s3.isSelected()){
            enableButtons();                        //enable menu buttons
            //disable other toggle buttons
            s1.setEnabled(false);
            s2.setEnabled(false);
            s4.setEnabled(false);
        }
        else{
            disableButtons();                       //disable menu buttons
            //enable other toggle buttons
            s1.setEnabled(true);
            s2.setEnabled(true);
            s4.setEnabled(true);
        }
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        //let buttons be enabled when toggle button is pushed, and disable when it is no longer selected
        if(s4.isSelected()){
            enableButtons();                        //enable menu buttons
            //disable other toggle buttons
            s1.setEnabled(false);
            s2.setEnabled(false);
            s3.setEnabled(false);
        }
        else{
            disableButtons();                       //disable menu buttons
            //enable other toggle buttons
            s1.setEnabled(true);
            s2.setEnabled(true);
            s3.setEnabled(true);
        }
    }//GEN-LAST:event_s4ActionPerformed

    private void btnAddNoChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNoChargeActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(noUpcharge);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnAddNoChargeActionPerformed

    private void btnAddChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChargeActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(upcharge);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
        
      
        
        
    }//GEN-LAST:event_btnAddChargeActionPerformed

    private void btnAllergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllergyActionPerformed
        dynamicPanel.removeAll();
        dynamicPanel.add(allergies);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnAllergyActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Tables);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        dynamicPanel.removeAll();
        dynamicPanel.add(orderPanel);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_btnSendActionPerformed

    private void seat1PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat1PaymentActionPerformed
            paymentModel.clear();
        ArrayList<Food> tempList = new ArrayList<>();
         
        
        
        if(seat1Payment.isSelected()){
            allSeat.setEnabled(false);
            
            switch(currentTable.getId()){
                case 10 : {
                   tempList = table10Seat1Order.getOrder();
                    break;
                }
                case 20: {
                    tempList = table20Seat1Order.getOrder();
                    break;
                }
                case 30: {
                    tempList = table30Seat1Order.getOrder();
                    break;
                }
                case 40: {
                    tempList = table40Seat1Order.getOrder();
                    break;
                }
                case 50: {
                    tempList = table50Seat1Order.getOrder();
                    break;
                }
                case 60: {
                    tempList = table60Seat1Order.getOrder();
                    break;
                }
                case 61: {
                    tempList = table61Seat1Order.getOrder();
                    break;
                }
            }
            for(int i = 0; i < tempList.size(); i++){
                paymentModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getPrice());
                seat1Price += tempList.get(i).getPrice();
            }
             paymentModel.addElement("Total : " +seat1Price);
        }
        else{
            seat1Price = 0.0;
            allSeat.setEnabled(true);
        }
    }//GEN-LAST:event_seat1PaymentActionPerformed

    private void seat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat2ActionPerformed
          paymentModel.clear();
          
        ArrayList<Food> tempList = new ArrayList<>();
         
        if(seat2.isSelected()){
            allSeat.setEnabled(false);
            switch(currentTable.getId()){
                case 10 : {
                   tempList = table10Seat2Order.getOrder();
                    break;
                }
                case 20: {
                    tempList = table20Seat2Order.getOrder();
                    break;
                }
                case 30: {
                    tempList = table30Seat2Order.getOrder();
                    break;
                }
                case 40: {
                    tempList = table40Seat2Order.getOrder();
                    break;
                }
                case 50: {
                    tempList = table50Seat2Order.getOrder();
                    break;
                }
                case 60: {
                    tempList = table60Seat2Order.getOrder();
                    break;
                }
                case 61: {
                    tempList = table61Seat2Order.getOrder();
                    break;
                }
            }
            for(int i = 0; i < tempList.size(); i++){
                paymentModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getPrice());
                seat2Price += tempList.get(i).getPrice();
            }
             paymentModel.addElement("Total : " +seat2Price);
        }
        else{
            seat2Price = 0.0;
            allSeat.setEnabled(true);
        }
    }//GEN-LAST:event_seat2ActionPerformed

    private void seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat3ActionPerformed
         paymentModel.clear();
        ArrayList<Food> tempList = new ArrayList<>();
         
        if(seat3.isSelected()){
            allSeat.setEnabled(false);
            switch(currentTable.getId()){
                case 10 : {
                   tempList = table10Seat3Order.getOrder();
                    break;
                }
                case 20: {
                    tempList = table20Seat3Order.getOrder();
                    break;
                }
                case 30: {
                    tempList = table30Seat3Order.getOrder();
                    break;
                }
                case 40: {
                    tempList = table40Seat3Order.getOrder();
                    break;
                }
                case 50: {
                    tempList = table50Seat3Order.getOrder();
                    break;
                }
                case 60: {
                    tempList = table60Seat3Order.getOrder();
                    break;
                }
                case 61: {
                    tempList = table61Seat3Order.getOrder();
                    break;
                }
            }
            for(int i = 0; i < tempList.size(); i++){
                paymentModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getPrice());
                seat3Price += tempList.get(i).getPrice();
            }
             paymentModel.addElement("Total : " +seat3Price);
        }
        else{
            seat3Price = 0.0;
            allSeat.setEnabled(true);
        }
    }//GEN-LAST:event_seat3ActionPerformed

    private void seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat4ActionPerformed
         paymentModel.clear();
        ArrayList<Food> tempList = new ArrayList<>();
         
        if(seat4.isSelected()){
            allSeat.setEnabled(false);
            switch(currentTable.getId()){
                case 10 : {
                   tempList = table10Seat4Order.getOrder();
                    break;
                }
                case 20: {
                    tempList = table20Seat4Order.getOrder();
                    break;
                }
                case 30: {
                    tempList = table30Seat4Order.getOrder();
                    break;
                }
                case 40: {
                    tempList = table40Seat4Order.getOrder();
                    break;
                }
                case 50: {
                    tempList = table50Seat4Order.getOrder();
                    break;
                }
                case 60: {
                    tempList = table60Seat4Order.getOrder();
                    break;
                }
                case 61: {
                    tempList = table61Seat4Order.getOrder();
                    break;
                }
            }
            for(int i = 0; i < tempList.size(); i++){
                paymentModel.addElement(tempList.get(i).getName() + " " + tempList.get(i).getPrice());
                
                seat4Price += tempList.get(i).getPrice();
            }
            paymentModel.addElement("Total : " +seat4Price);
        }
        else{
            seat4Price = 0.0;
            allSeat.setEnabled(true);
        }
        
    }//GEN-LAST:event_seat4ActionPerformed

    private void allSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allSeatActionPerformed
         paymentModel.clear();
        ArrayList<ArrayList<Food>> wholeList = new ArrayList<>();
        if(allSeat.isSelected()){
            seat1Payment.setEnabled(false);
            seat2.setEnabled(false);
            seat3.setEnabled(false);
            seat4.setEnabled(false);
            
            switch(currentTable.getId()){
                case 10 : {
                    wholeList.add(table10Seat1Order.getOrder());
                    wholeList.add(table10Seat2Order.getOrder());
                    wholeList.add(table10Seat3Order.getOrder());
                    wholeList.add(table10Seat4Order.getOrder());
                   
                    break;
                }
                case 20: {
                    wholeList.add(table20Seat1Order.getOrder());
                    wholeList.add(table20Seat2Order.getOrder());
                    wholeList.add(table20Seat3Order.getOrder());
                    wholeList.add(table20Seat4Order.getOrder());
                    break;
                }
                case 30: {
                     wholeList.add(table30Seat1Order.getOrder());
                    wholeList.add(table30Seat2Order.getOrder());
                    wholeList.add(table30Seat3Order.getOrder());
                    wholeList.add(table30Seat4Order.getOrder());
                    break;
                }
                case 40: {
                     wholeList.add(table40Seat1Order.getOrder());
                    wholeList.add(table40Seat2Order.getOrder());
                    wholeList.add(table40Seat3Order.getOrder());
                    wholeList.add(table40Seat4Order.getOrder());
                    break;
                }
                case 50: {
                     wholeList.add(table50Seat1Order.getOrder());
                    wholeList.add(table50Seat2Order.getOrder());
                    wholeList.add(table50Seat3Order.getOrder());
                    wholeList.add(table50Seat4Order.getOrder());
                    break;
                }
                case 60: {
                     wholeList.add(table60Seat1Order.getOrder());
                    wholeList.add(table60Seat2Order.getOrder());
                    wholeList.add(table60Seat3Order.getOrder());
                    wholeList.add(table60Seat4Order.getOrder());
                    break;
                }
                case 61: {
                     wholeList.add(table61Seat1Order.getOrder());
                    wholeList.add(table61Seat2Order.getOrder());
                    wholeList.add(table61Seat3Order.getOrder());
                    wholeList.add(table61Seat4Order.getOrder());
                    break;
                }
            }
            for(int i = 0; i < wholeList.size(); i++){
                for(int d = 0; d < wholeList.get(i).size(); d++){
                    paymentModel.addElement(wholeList.get(i).get(d).getName() + " " + wholeList.get(i).get(d).getPrice());
                    totalPrice += wholeList.get(i).get(d).getPrice();
                }
            }
        }
        else{
            totalPrice = 0.0;
            seat1Payment.setEnabled(true);
            seat2.setEnabled(true);
            seat3.setEnabled(true);
            seat4.setEnabled(true);
        }
    }//GEN-LAST:event_allSeatActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        double totalCashPayment = Double.parseDouble(getPayIn());
        String catchCash;
        
        if(seat1Payment.isSelected()){
            changeDueFinal = String.valueOf(totalCashPayment - seat1Price);
            change.setText(changeDueFinal);
        }
         if(seat2.isSelected()){
            changeDueFinal = String.valueOf(totalCashPayment - seat2Price);
            change.setText(changeDueFinal);
        }
          if(seat3.isSelected()){
            changeDueFinal = String.valueOf(totalCashPayment - seat3Price);
            change.setText(changeDueFinal);
        }
           if(seat4.isSelected()){
            changeDueFinal = String.valueOf(totalCashPayment - seat4Price);
            change.setText(changeDueFinal);
        }
            if(allSeat.isSelected()){
            changeDueFinal = String.valueOf(totalCashPayment - totalPrice);
            change.setText(changeDueFinal);
        }
            cashOutBtn.setEnabled(true);
        /*
        
        if(stevenLog){
            catchCash = steven.handleCashPayment(totalCashPayment);
            change.setText(catchCash);
            steven.updateReportCash(totalCashPayment);
        }
        else if(lietzyLog){
            catchCash = lietzy.handleCashPayment(totalCashPayment);
            change.setText(catchCash);
            lietzy.updateReportCash(totalCashPayment);
        }
        else if(rafaelLog){
            catchCash = rafael.handleCashPayment(totalCashPayment);
            change.setText(catchCash);
            rafael.updateReportCash(totalCashPayment);
        }
        */
        
    }//GEN-LAST:event_acceptActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        change.setText("");
        payIn.setText("");
        cashOutBtn.setEnabled(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void cardAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardAcceptActionPerformed
        double totalCreditPayment = Double.parseDouble(getTip());
        String cardTotal;
        
        if(seat1Payment.isSelected()){
            creditDueFinal = String.valueOf(totalCreditPayment + seat1Price);
            totalCardPayment.setText(creditDueFinal);
        }
         if(seat2.isSelected()){
            creditDueFinal = String.valueOf(totalCreditPayment + seat2Price);
            totalCardPayment.setText(creditDueFinal);
        }
          if(seat3.isSelected()){
            creditDueFinal = String.valueOf(totalCreditPayment + seat3Price);
            totalCardPayment.setText(creditDueFinal);
        }
           if(seat4.isSelected()){
            changeDueFinal = String.valueOf(totalCreditPayment + seat4Price);
            totalCardPayment.setText(creditDueFinal);
        }
            if(allSeat.isSelected()){
            changeDueFinal = String.valueOf(totalCreditPayment + totalPrice);
            totalCardPayment.setText(creditDueFinal);
        }
            cashOutBtn.setEnabled(true);
        /*
        if(stevenLog){
            cardTotal = steven.handleCreditPayment(totalCreditPayment);
            totalCardPayment.setText(cardTotal);
            steven.updateReportCard(totalCreditPayment);
        }
        else if(lietzyLog){
            cardTotal = lietzy.handleCreditPayment(totalCreditPayment);
            totalCardPayment.setText(cardTotal);
            lietzy.updateReportCard(totalCreditPayment);
        }
        else if(rafaelLog){
            cardTotal = rafael.handleCreditPayment(totalCreditPayment);
            totalCardPayment.setText(cardTotal);
            rafael.updateReportCard(totalCreditPayment);
        }
        */
    }//GEN-LAST:event_cardAcceptActionPerformed

    private void cardCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardCancelActionPerformed
        totalCardPayment.setText("");
        tipIn.setText("");
      cashOutBtn.setEnabled(false);
    }//GEN-LAST:event_cardCancelActionPerformed

    private void runReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runReportActionPerformed
        String tempName;
        if(stevenLog){
            tempName = "Steven";
            steven.runReport(tempName);
        }
        else if(lietzyLog){
            tempName = "Jacob";
            lietzy.runReport(tempName);
        }
        else if(rafaelLog){
            tempName = "Rafael";
            rafael.runReport(tempName);
        }
    }//GEN-LAST:event_runReportActionPerformed

    private void appetizerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appetizerListMouseClicked
             currentIndex = appetizerList.getSelectedIndex();
             type = "app";
             
            
    }//GEN-LAST:event_appetizerListMouseClicked

    private void addToOderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOderBtnActionPerformed
        
        Food tempFood = new Food("Temp",0.0,"none");
        
        switch(type){
            case "app":
            {
                 tempFood = appsList.get(currentIndex);
                 break;
            }
            case "salad":
            {
                 tempFood = saladsList.get(currentIndex);
                 break;
            }
            case "sandwhich":
            {
                 tempFood = sandwhichesList.get(currentIndex);
                 break;
            }
            case "entree":
            {
                 tempFood = entreesList.get(currentIndex);
                 break;
            }
            case "dessert":
            {
                 tempFood = dessertsList.get(currentIndex);
                 break;
            }
            case "drink":
            {
                 tempFood = drinksList.get(currentIndex);
                 break;
            }
            
        }
       
             if(s1.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                 table10Seat1Order.addToOrder(tempFood);
                break;
            }
            case 20:{
                 table20Seat1Order.addToOrder(tempFood);
                break;
            }
            case 30:{
                
                table30Seat1Order.addToOrder(tempFood);   
                break;
            }
            case 40:{
                 table40Seat1Order.addToOrder(tempFood);
                break;
            }
            case 50:{
                table50Seat1Order.addToOrder(tempFood);
                break;
            }
            case 60:{
                table60Seat1Order.addToOrder(tempFood);
                break;
            }
            case 61:{
                table61Seat1Order.addToOrder(tempFood);
                break;
            }
            
        }
    }
             if(s2.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                 table10Seat2Order.addToOrder(tempFood);
                break;
            }
            case 20:{
                 table20Seat2Order.addToOrder(tempFood);
                break;
            }
            case 30:{
                table30Seat2Order.addToOrder(tempFood);
                break;
            }
            case 40:{
                 table40Seat2Order.addToOrder(tempFood);
                break;
            }
            case 50:{
                table50Seat2Order.addToOrder(tempFood);
                break;
            }
            case 60:{
                table60Seat2Order.addToOrder(tempFood);
                break;
            }
            case 61:{
                table61Seat2Order.addToOrder(tempFood);
                break;
            }
            
        }
        
    }
       if(s3.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                 table10Seat3Order.addToOrder(tempFood);
                break;
            }
            case 20:{
                 table20Seat3Order.addToOrder(tempFood);
                break;
            }
            case 30:{
                table30Seat3Order.addToOrder(tempFood);
                break;
            }
            case 40:{
                 table40Seat3Order.addToOrder(tempFood);
                break;
            }
            case 50:{
                table50Seat3Order.addToOrder(tempFood);
                break;
            }
            case 60:{
                table60Seat3Order.addToOrder(tempFood);
                break;
            }
            case 61:{
                table61Seat3Order.addToOrder(tempFood);
                break;
            }
            
        }
        
    }
        if(s4.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                 table10Seat4Order.addToOrder(tempFood);
                break;
            }
            case 20:{
                 table20Seat4Order.addToOrder(tempFood);
                break;
            }
            case 30:{
                table30Seat4Order.addToOrder(tempFood);
                break;
            }
            case 40:{
                 table40Seat4Order.addToOrder(tempFood);
                break;
            }
            case 50:{
                table50Seat4Order.addToOrder(tempFood);
                break;
            }
            case 60:{
                table60Seat4Order.addToOrder(tempFood);
                break;
            }
            case 61:{
                table61Seat4Order.addToOrder(tempFood);
                break;
            }
            
        }
        
    }
        
    }//GEN-LAST:event_addToOderBtnActionPerformed

    private void saladListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saladListMouseClicked
        currentIndex = saladList.getSelectedIndex();
             type = "salad";
    }//GEN-LAST:event_saladListMouseClicked

    private void sandwhichListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwhichListMouseClicked
        currentIndex = sandwhichList.getSelectedIndex();
             type = "sandwhich";
    }//GEN-LAST:event_sandwhichListMouseClicked

    private void entreeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entreeListMouseClicked
        currentIndex = entreeList.getSelectedIndex();
             type = "entree";
    }//GEN-LAST:event_entreeListMouseClicked

    private void desserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desserListMouseClicked
        currentIndex = desserList.getSelectedIndex();
             type = "dessert";
    }//GEN-LAST:event_desserListMouseClicked

    private void drinkListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkListMouseClicked
        currentIndex = drinkList.getSelectedIndex();
             type = "drink";
    }//GEN-LAST:event_drinkListMouseClicked

    private void btnVoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoidActionPerformed
           if(type.equals("order")){
               
               if(s1.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                
               table10Seat1Order.removeFromOrder(table10Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 20:{
                 table20Seat1Order.removeFromOrder(table20Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 30:{
                
                table30Seat1Order.removeFromOrder(table30Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 40:{
               table40Seat1Order.removeFromOrder(table40Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 50:{
               table50Seat1Order.removeFromOrder(table50Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 60:{
                table60Seat1Order.removeFromOrder(table60Seat1Order.getOrder().get(currentIndex));
                break;
            }
            case 61:{
               table61Seat1Order.removeFromOrder(table61Seat1Order.getOrder().get(currentIndex));
                break;
            }
            
        }
    }
               if(s2.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                
               table10Seat2Order.removeFromOrder(table10Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 20:{
                 table20Seat2Order.removeFromOrder(table20Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 30:{
                
                table30Seat2Order.removeFromOrder(table30Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 40:{
               table40Seat2Order.removeFromOrder(table40Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 50:{
               table50Seat2Order.removeFromOrder(table50Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 60:{
                table60Seat2Order.removeFromOrder(table60Seat2Order.getOrder().get(currentIndex));
                break;
            }
            case 61:{
               table61Seat2Order.removeFromOrder(table61Seat2Order.getOrder().get(currentIndex));
                break;
            }
            
        }
    }
               if(s3.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                
               table10Seat3Order.removeFromOrder(table10Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 20:{
                 table20Seat3Order.removeFromOrder(table20Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 30:{
                
                table30Seat3Order.removeFromOrder(table30Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 40:{
               table40Seat3Order.removeFromOrder(table40Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 50:{
               table50Seat3Order.removeFromOrder(table50Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 60:{
                table60Seat3Order.removeFromOrder(table60Seat3Order.getOrder().get(currentIndex));
                break;
            }
            case 61:{
               table61Seat3Order.removeFromOrder(table61Seat3Order.getOrder().get(currentIndex));
                break;
            }
            
        }
    }
               
               if(s4.isSelected()){
        switch(currentTable.getId()){
            case 10:{
                
               table10Seat4Order.removeFromOrder(table10Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 20:{
                 table20Seat4Order.removeFromOrder(table20Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 30:{
                
                table30Seat4Order.removeFromOrder(table30Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 40:{
               table40Seat4Order.removeFromOrder(table40Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 50:{
               table50Seat4Order.removeFromOrder(table50Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 60:{
                table60Seat4Order.removeFromOrder(table60Seat4Order.getOrder().get(currentIndex));
                break;
            }
            case 61:{
               table61Seat4Order.removeFromOrder(table61Seat4Order.getOrder().get(currentIndex));
                break;
            }
            
        }
    }
               
               
               
               
               
               
           }
                //currentOrderFinal.getOrder().remove(currentIndex);
        
                
            
            dynamicPanel.repaint();
            dynamicPanel.revalidate();
       
    }//GEN-LAST:event_btnVoidActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       currentIndex = jList1.getSelectedIndex();
       type = "order";
    }//GEN-LAST:event_jList1MouseClicked

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_returnBtnActionPerformed

    private void cashOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashOutBtnActionPerformed
          if(seat1Payment.isSelected()){
          switch(currentTable.getId()){
            case 10:{
                 table10Seat1Order.clearOrder();
                break;
            }
            case 20:{
                 table20Seat1Order.clearOrder();
                break;
            }
            case 30:{
                table30Seat1Order.clearOrder();
                break;
            }
            case 40:{
                 table40Seat1Order.clearOrder();
                break;
            }
            case 50:{
                table50Seat1Order.clearOrder();
                break;
            }
            case 60:{
                table60Seat1Order.clearOrder();
                break;
            }
            case 61:{
                table61Seat1Order.clearOrder();
                break;
            }
            
        }
        
          }
          if(seat2.isSelected()){
              switch(currentTable.getId()){
            case 10:{
                 table10Seat2Order.clearOrder();
                break;
            }
            case 20:{
                 table20Seat2Order.clearOrder();
                break;
            }
            case 30:{
                table30Seat2Order.clearOrder();
                break;
            }
            case 40:{
                 table40Seat2Order.clearOrder();
                break;
            }
            case 50:{
                table50Seat2Order.clearOrder();
                break;
            }
            case 60:{
                table60Seat2Order.clearOrder();
                break;
            }
            case 61:{
                table61Seat2Order.clearOrder();
                break;
            }
            
        }
          }
          if(seat3.isSelected()){
              switch(currentTable.getId()){
            case 10:{
                 table10Seat3Order.clearOrder();
                break;
            }
            case 20:{
                 table20Seat3Order.clearOrder();
                break;
            }
            case 30:{
                table30Seat3Order.clearOrder();
                break;
            }
            case 40:{
                 table40Seat3Order.clearOrder();
                break;
            }
            case 50:{
                table50Seat3Order.clearOrder();
                break;
            }
            case 60:{
                table60Seat3Order.clearOrder();
                break;
            }
            case 61:{
                table61Seat3Order.clearOrder();
                break;
            }
            
        }
          }
          if(seat4.isSelected()){
              switch(currentTable.getId()){
            case 10:{
                 table10Seat4Order.clearOrder();
                break;
            }
            case 20:{
                 table20Seat4Order.clearOrder();
                break;
            }
            case 30:{
                table30Seat4Order.clearOrder();
                break;
            }
            case 40:{
                 table40Seat4Order.clearOrder();
                break;
            }
            case 50:{
                table50Seat4Order.clearOrder();
                break;
            }
            case 60:{
                table60Seat4Order.clearOrder();
                break;
            }
            case 61:{
                table61Seat4Order.clearOrder();
                break;
            }
            
        }
          }
          if(allSeat.isSelected()){
              switch(currentTable.getId()){
            case 10:{
                 table10Seat1Order.clearOrder();
                 table10Seat2Order.clearOrder();
                 table10Seat3Order.clearOrder();
                 table10Seat4Order.clearOrder();
                break;
            }
            case 20:{
                 table20Seat1Order.clearOrder();
                 table20Seat2Order.clearOrder();
                 table20Seat3Order.clearOrder();
                 table20Seat4Order.clearOrder();
                break;
            }
            case 30:{
                table30Seat1Order.clearOrder();
                 table30Seat2Order.clearOrder();
                 table30Seat3Order.clearOrder();
                 table30Seat4Order.clearOrder();
                break;
            }
            case 40:{
                 table40Seat1Order.clearOrder();
                 table40Seat2Order.clearOrder();
                 table40Seat3Order.clearOrder();
                 table40Seat4Order.clearOrder();
                break;
            }
            case 50:{
                table50Seat1Order.clearOrder();
                 table50Seat2Order.clearOrder();
                 table50Seat3Order.clearOrder();
                 table50Seat4Order.clearOrder();
                break;
            }
            case 60:{
                table20Seat1Order.clearOrder();
                 table20Seat2Order.clearOrder();
                 table20Seat3Order.clearOrder();
                 table20Seat4Order.clearOrder();
                break;
            }
            case 61:{
                table61Seat1Order.clearOrder();
                 table61Seat2Order.clearOrder();
                 table61Seat3Order.clearOrder();
                 table61Seat4Order.clearOrder();
                break;
            }
            
        }
          }
        mainPanel.removeAll();
        mainPanel.add(Order);
        mainPanel.repaint();
        mainPanel.revalidate();
        orderModel.clear();
    }//GEN-LAST:event_cashOutBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static ArrayList<Food> initFoodList(int list){
        

    //appetizers section
    ArrayList<Food> apps = new ArrayList<Food>();
    Food cheeseBalls = new Food("CheeseBalls", 6.00, "app");
    Food mozzSticks = new Food("Mozzarella Sticks", 6.00, "app");
    Food friedPickles = new Food("Fried Pickles", 6.00, "app");
    Food chips = new Food("Chips and Queso", 4.00, "app");
    Food onionRings = new Food("Onion Rings", 6.00, "app");
    Food miniDogs = new Food("Mini Corn Dogs", 8.00, "app");
    Food wings = new Food("Boneless Wings ", 8.00, "app");
    apps.add(cheeseBalls);    
    apps.add(mozzSticks);
    apps.add(friedPickles);
    apps.add(chips);
    apps.add(onionRings);
    apps.add(miniDogs);
    apps.add(wings);
    
    //salads
    ArrayList<Food> salads = new ArrayList<Food>();
    Food cobb = new Food("Cobb Salad", 12.99, "salad");
    Food chef = new Food("Chef Salad", 12.99, "salad");
    Food chickenS = new Food("Grilled Chicken Salad", 14.99, "salad");
    Food steakS = new Food("Steak Salad", 14.99, "salad");
    
    salads.add(cobb);
    salads.add(chef);
    salads.add(chickenS);
    salads.add(steakS);
    
    
    //Sandwiches
    ArrayList<Food> sands = new ArrayList<Food>();
    Food dip = new Food("French Dip", 9.99, "sand");
    Food melt = new Food("Tuna Melt", 10.99, "sand");
    Food steakSand = new Food("Steak Sandwhich", 14.99, "sand");
    Food club = new Food("Club Sandwhich", 10.99, "sand");
    Food chickenSand = new Food("Chicken Sandwhich", 9.99, "sand");
    Food cheeseBurger = new Food("American Cheeseburger", 9.99, "sand");
    Food bbqBurger = new Food("BBQ Cheeseburger", 10.99, "sand");
    Food beanBurger = new Food("Bean Burger", 8.99, "sand");
    
    
    sands.add(dip);
    sands.add(melt);
    sands.add(steakSand);
    sands.add(club);
    sands.add(chickenSand);
    sands.add(cheeseBurger);
    sands.add(bbqBurger);
    sands.add(beanBurger);
    
    
    
    
    
    
    
    
    ArrayList<Food> entrees = new ArrayList<Food>();
    Food steak = new Food("Sirloin Steak", 20.00, "entree");
    Food chicken = new Food("Grilled Chicken", 18.00, "entree");
    Food alfredo = new Food("Chicken Alfredo", 16.00, "entree");
    Food spaghetti = new Food("Spaghetti and Meatballs", 12.00, "entree");
    Food burrito = new Food("Charred Chicken Burrito", 8.00, "entree");
    Food fish = new Food("Filet of Salmon", 23.00, "entree");
    
    entrees.add(steak);    
    entrees.add(chicken);
    entrees.add(alfredo);
    entrees.add(spaghetti);
    entrees.add(burrito);
    entrees.add(fish);
    
    
    ArrayList<Food> desserts = new ArrayList<Food>();
    Food lavaCake = new Food("Molten Lava Cake", 8.99, "dessert");
     Food cheeseCake = new Food("CheeseCake", 6.99, "dessert");
      Food alMode = new Food("Pie al Mode", 6.99, "dessert");
       Food expresso = new Food("Expresso", 4.99, "dessert");
    
       desserts.add(lavaCake);
       desserts.add(cheeseCake);
       desserts.add(alMode);
       desserts.add(expresso);
       
       
       ArrayList<Food> drinks = new ArrayList<Food>();
       Food dBeer = new Food("Domestic Beer", 3.99, "drink");
       Food iBeer = new Food("Import Beer", 4.99, "drink");
       Food draftBeer = new Food("Draft Beer", 5.99, "drink");
       Food wine = new Food("Glass of Wine", 7.99, "drink");
       Food soda = new Food("Soda", 1.99, "drink");
       Food water = new Food("Water", 0.00, "drink");
    
       drinks.add(dBeer);
       drinks.add(iBeer);
       drinks.add(draftBeer);
       drinks.add(wine);
       drinks.add(soda);
       drinks.add(water);
       
    
    
    if(list == 1){
        return apps;
    }
    else if(list == 2){
        return salads;
    }
    else if(list == 3)
        return sands;
    else if(list == 4){
        return entrees;
    }
    else if(list == 5){
        return desserts;
    }
    else
        return drinks;
   
    }
    
    
  
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
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            */
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //adding food to models
       for(int i = 0; i < appsList.size(); i++){
           appModel.addElement(appsList.get(i).getName() + "  " + appsList.get(i).getPrice());
       }
       for(int i = 0; i < saladsList.size(); i++){
           saladModel.addElement(saladsList.get(i).getName() + "  " + saladsList.get(i).getPrice());
       }
       for(int i = 0; i < sandwhichesList.size(); i++){
           sandModel.addElement(sandwhichesList.get(i).getName() + "  " + sandwhichesList.get(i).getPrice());
       }
       for(int i = 0; i < entreesList.size(); i++){
           entreeModel.addElement(entreesList.get(i).getName() + "  " + entreesList.get(i).getPrice());
       }
       for(int i = 0; i < dessertsList.size(); i++){
           dessertModel.addElement(dessertsList.get(i).getName() + "  " + dessertsList.get(i).getPrice());
       }
         for(int i = 0; i < drinksList.size(); i++){
           drinkModel.addElement(drinksList.get(i).getName() + "  " + drinksList.get(i).getPrice());
       }
       
         Order testOrder;
         Order testOrder2;
       
        POS restaurant = new POS();                         //instantiate the class
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                restaurant.setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Order;
    private javax.swing.JPanel Pay;
    private javax.swing.JPanel Payment;
    private javax.swing.JPanel Tables;
    private javax.swing.JButton accept;
    private javax.swing.JButton addToOderBtn;
    private javax.swing.JToggleButton allSeat;
    private javax.swing.JPanel allergies;
    private javax.swing.JScrollPane appList;
    private javax.swing.JList<String> appetizerList;
    private javax.swing.JPanel appetizers;
    private javax.swing.JButton btnAddCharge;
    private javax.swing.JButton btnAddNoCharge;
    private javax.swing.JButton btnAllergy;
    private javax.swing.JButton btnApps;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCard;
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnDessert;
    private javax.swing.JButton btnDrinks;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEntree;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSalad;
    private javax.swing.JButton btnSandwich;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnVoid;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cardAccept;
    private javax.swing.JButton cardCancel;
    private javax.swing.JLabel cardPayment;
    private javax.swing.JButton cashOutBtn;
    private javax.swing.JLabel change;
    private javax.swing.JLabel changeDue;
    private javax.swing.JPanel creditCard;
    private javax.swing.JScrollPane currentOrder;
    private javax.swing.JList<String> desserList;
    private javax.swing.JScrollPane dessertPane;
    private javax.swing.JPanel desserts;
    private javax.swing.JList<String> drinkList;
    private javax.swing.JScrollPane drinkPane;
    private javax.swing.JPanel drinks;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JPanel emptyCash;
    private javax.swing.JList<String> entreeList;
    private javax.swing.JScrollPane entreePane;
    private javax.swing.JPanel entrees;
    private javax.swing.JButton exitTables;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList10;
    private javax.swing.JList<String> jList8;
    private javax.swing.JList<String> jList9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton makeTable;
    private javax.swing.JPanel noUpcharge;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JTextField payIn;
    private javax.swing.JPanel payInCash;
    private javax.swing.JList<String> paymentList;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton runReport;
    private javax.swing.JToggleButton s1;
    private javax.swing.JToggleButton s2;
    private javax.swing.JToggleButton s3;
    private javax.swing.JToggleButton s4;
    private javax.swing.JList<String> saladList;
    private javax.swing.JScrollPane saladPane;
    private javax.swing.JPanel salads;
    private javax.swing.JList<String> sandwhichList;
    private javax.swing.JScrollPane sandwhichPane;
    private javax.swing.JPanel sandwiches;
    private javax.swing.JToggleButton seat1Payment;
    private javax.swing.JToggleButton seat2;
    private javax.swing.JToggleButton seat3;
    private javax.swing.JToggleButton seat4;
    private javax.swing.JPanel seatPayment;
    private javax.swing.JLabel tableNameLabel;
    private javax.swing.JButton tbl10;
    private javax.swing.JButton tbl20;
    private javax.swing.JButton tbl30;
    private javax.swing.JButton tbl40;
    private javax.swing.JButton tbl50;
    private javax.swing.JButton tbl60;
    private javax.swing.JButton tbl61;
    private javax.swing.JTextField tipIn;
    private javax.swing.JLabel tipLabel;
    private javax.swing.JLabel totalCardPayment;
    private javax.swing.JLabel totalPayment;
    private javax.swing.JPanel upcharge;
    private javax.swing.JLabel waiterNameLabel;
    // End of variables declaration//GEN-END:variables
 
}
