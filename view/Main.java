/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.NhanVien;
import model.SanPham;
import service.KhachHangService;
import service.NhanVienService;
import service.SanPhamService;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {
    private NhanVienService nhanVienServiceS = new NhanVienService();
    private KhachHangService kh = new KhachHangService();
    private SanPhamService sp = new SanPhamService();
    private List<NhanVien> list = new ArrayList<>();
    private List<KhachHang> lis = new ArrayList<>();
    private List<SanPham> listsp = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    
    
   
   
   
   

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.fillTable();
        this.fillTablekh();
        this.fillTablesp();
       
    }
    
    //Nhân Viên
      public void fillTable(){
        list = nhanVienServiceS.getAllNV();
        dtm = (DefaultTableModel) tblNV.getModel();
        dtm.setRowCount(0);
        for (NhanVien nhanVien : list) {
            dtm.addRow(nhanVien.toRowTable());
        }
    }
       public void fillForm(NhanVien nv){
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getHoTen());
        if(nv.getChucVu()== 0){
            rdoNhanVien.setSelected(true);
        }
        if(nv.getChucVu()== 1){
            rdoQuanLy.setSelected(true);
        }
        txtEmailNV.setText(nv.getEmail());
        txtSDTnv.setText(nv.getSDT());
        if(nv.getGioiTinh()== 0){
            rdoNu.setSelected(true);
        }
        if(nv.getGioiTinh()== 1){
            rdoNam.setSelected(true);
        }
        if(nv.getTrangThai()== 0){
            rdoNghi.setSelected(true);
        }
        if(nv.getTrangThai()== 1){
            rdoDang.setSelected(true);
        }
        txtDiaChi.setText(nv.getDiaChi());
        
        
    }
        public NhanVien readForm(){
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setHoTen(txtTenNV.getText());
        if(rdoQuanLy.isSelected()){
            nv.setChucVu(1);
        }
        if(rdoNhanVien.isSelected()){
            nv.setChucVu(0);
        }
        nv.setEmail(txtEmailNV.getText());
        nv.setSDT(txtSDTnv.getText());
        if(rdoNam.isSelected()){
            nv.setGioiTinh(1);
        }
        if(rdoNu.isSelected()){
            nv.setGioiTinh(0);
        }
        if(rdoDang.isSelected()){
            nv.setTrangThai(1);
        }
        if(rdoNghi.isSelected()){
            nv.setTrangThai(0);
        }
        nv.setDiaChi(txtDiaChi.getText());
       
        return nv;
    }
        
        
        //Khách Hàng
         public void fillTablekh(){
        lis = kh.getAllKH();
        dtm = (DefaultTableModel) tblKH.getModel();
        dtm.setRowCount(0);
        for (KhachHang khach : lis) {
            dtm.addRow(khach.toDataRow());
        }
    }
          public KhachHang readFormkh(){
        KhachHang hang = new KhachHang();
        hang.setMaKH(txtMaKH.getText());
        hang.setTenKH(txtTenKH.getText());
        hang.setEmail(txtEmailKH.getText());
        hang.setSDT(txtSDTkh.getText());
        return hang;
    }
          public void fillFormkh(KhachHang khachH){
        txtMaKH.setText(khachH.getMaKH());
        txtTenKH.setText(khachH.getTenKH());
        txtEmailKH.setText(khachH.getEmail());
        txtSDTkh.setText(khachH.getSDT());
     
     }
        
    
          
      /// Sản Phẩm
           public void fillTablesp(){
        listsp = sp.getAllSP();
        dtm = (DefaultTableModel) tblSP.getModel();
        dtm.setRowCount(0);
        for (SanPham san : listsp) {
            dtm.addRow(san.toRowTable());
        }
    }
           
            public void clearsp(){
       txtMaSP.setText("");
        txtTenSP.setText("");
        txtGia.setText("");
        txtSL.setText("");
        txtNha.setText("");
        cbbChat.setSelectedIndex(-1);
        cbbSize.setSelectedIndex(-1);
        cbbMau.setSelectedIndex(-1);
        
        
    }  
        public SanPham readFormsp(){
        SanPham ct = new SanPham();
        ct.setMaSP(txtMaSP.getText());
        ct.setTenSP(txtTenSP.getText());
        ct.setGia(Integer.parseInt(txtGia.getText()));
        ct.setNhaCC(txtNha.getText());
        ct.setSoLuong(Integer.parseInt(txtSL.getText()));
        ct.setChatLieu(cbbChat.getSelectedItem().toString());
        ct.setSize(cbbSize.getSelectedItem().toString());
        ct.setMauSac(cbbMau.getSelectedItem().toString());

        return ct;
    }
        public void fillFormsp(SanPham sp){
        txtMaSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        txtGia.setText(String.valueOf(sp.getGia()));
        txtSL.setText(String.valueOf(sp.getSoLuong()));
        txtNha.setText(sp.getNhaCC());
        cbbChat.setSelectedIndex(Integer.parseInt(cbbChat.getSelectedItem().toString()));
        cbbSize.setSelectedIndex(Integer.parseInt(cbbSize.getSelectedItem().toString()));
        cbbMau.setSelectedIndex(Integer.parseInt(cbbMau.getSelectedItem().toString()));

         
         
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabNV = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        tabKH = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        tabBH = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        tabDT = new javax.swing.JPanel();
        lblDoanhThu = new javax.swing.JLabel();
        tabKM = new javax.swing.JPanel();
        lblKhuyenMai = new javax.swing.JLabel();
        tabSP = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        tabHD = new javax.swing.JPanel();
        lblHoatDong = new javax.swing.JLabel();
        tabDX = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jp11DX = new javax.swing.JPanel();
        jp10HD = new javax.swing.JPanel();
        jp9SP = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lblMaSP = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThemSp = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnLamMoiSP = new javax.swing.JButton();
        lblSoLuong = new javax.swing.JLabel();
        lblNha = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        lblChatLieu = new javax.swing.JLabel();
        lblMau = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        txtNha = new javax.swing.JTextField();
        cbbChat = new javax.swing.JComboBox<>();
        cbbMau = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        lblTim = new javax.swing.JLabel();
        txtTimsp = new javax.swing.JTextField();
        btnTimsp = new javax.swing.JButton();
        jp8KM = new javax.swing.JPanel();
        jp7DT = new javax.swing.JPanel();
        jp4BH = new javax.swing.JPanel();
        jp5KH = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lblEmailKH = new javax.swing.JLabel();
        txtEmailKH = new javax.swing.JTextField();
        lblSDTkh = new javax.swing.JLabel();
        txtSDTkh = new javax.swing.JTextField();
        btnThemkh = new javax.swing.JButton();
        btnCapNhatkh = new javax.swing.JButton();
        btnLamMoikh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jp6NV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblTenNV = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        lblChucVu = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        lblEmailNV = new javax.swing.JLabel();
        txtEmailNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDTnv = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblTrangThai = new javax.swing.JLabel();
        rdoDang = new javax.swing.JRadioButton();
        rdoNghi = new javax.swing.JRadioButton();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblma = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\Admin\\Documents\\MOB1024\\project1-main\\src\\main\\java\\img\\shopping-cart-icon.png")); // NOI18N
        jLabel1.setText("Shop ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabNV.setBackground(new java.awt.Color(0, 204, 255));

        lblNhanVien.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(51, 51, 51));
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabNVLayout = new javax.swing.GroupLayout(tabNV);
        tabNV.setLayout(tabNVLayout);
        tabNVLayout.setHorizontalGroup(
            tabNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNVLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabNVLayout.setVerticalGroup(
            tabNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabKH.setBackground(new java.awt.Color(51, 204, 255));

        lblKhachHang.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        lblKhachHang.setText("Khách Hàng");
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabKHLayout = new javax.swing.GroupLayout(tabKH);
        tabKH.setLayout(tabKHLayout);
        tabKHLayout.setHorizontalGroup(
            tabKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabKHLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblKhachHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabKHLayout.setVerticalGroup(
            tabKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabBH.setBackground(new java.awt.Color(51, 204, 255));

        lblBanHang.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(51, 51, 51));
        lblBanHang.setText("Bán Hàng");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabBHLayout = new javax.swing.GroupLayout(tabBH);
        tabBH.setLayout(tabBHLayout);
        tabBHLayout.setHorizontalGroup(
            tabBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBHLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblBanHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabBHLayout.setVerticalGroup(
            tabBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabDT.setBackground(new java.awt.Color(51, 204, 255));

        lblDoanhThu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDoanhThu.setForeground(new java.awt.Color(51, 51, 51));
        lblDoanhThu.setText("Doanh Thu");
        lblDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoanhThuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabDTLayout = new javax.swing.GroupLayout(tabDT);
        tabDT.setLayout(tabDTLayout);
        tabDTLayout.setHorizontalGroup(
            tabDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDTLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblDoanhThu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabDTLayout.setVerticalGroup(
            tabDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabKM.setBackground(new java.awt.Color(51, 204, 255));

        lblKhuyenMai.setBackground(new java.awt.Color(51, 204, 255));
        lblKhuyenMai.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(51, 51, 51));
        lblKhuyenMai.setText("Khuyến Mại");
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabKMLayout = new javax.swing.GroupLayout(tabKM);
        tabKM.setLayout(tabKMLayout);
        tabKMLayout.setHorizontalGroup(
            tabKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabKMLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblKhuyenMai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabKMLayout.setVerticalGroup(
            tabKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabSP.setBackground(new java.awt.Color(51, 204, 255));
        tabSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSPMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(51, 51, 51));
        lblSanPham.setText("Sản Phẩm");

        javax.swing.GroupLayout tabSPLayout = new javax.swing.GroupLayout(tabSP);
        tabSP.setLayout(tabSPLayout);
        tabSPLayout.setHorizontalGroup(
            tabSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSPLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabSPLayout.setVerticalGroup(
            tabSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabHD.setBackground(new java.awt.Color(51, 204, 255));
        tabHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHDMouseClicked(evt);
            }
        });

        lblHoatDong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblHoatDong.setForeground(new java.awt.Color(51, 51, 51));
        lblHoatDong.setText("Lịch Sử Hoạt Động");

        javax.swing.GroupLayout tabHDLayout = new javax.swing.GroupLayout(tabHD);
        tabHD.setLayout(tabHDLayout);
        tabHDLayout.setHorizontalGroup(
            tabHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHDLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblHoatDong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabHDLayout.setVerticalGroup(
            tabHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoatDong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        tabDX.setBackground(new java.awt.Color(51, 204, 255));
        tabDX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDXMouseClicked(evt);
            }
        });

        lblDangXuat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(102, 102, 102));
        lblDangXuat.setText("Đăng Xuất");

        javax.swing.GroupLayout tabDXLayout = new javax.swing.GroupLayout(tabDX);
        tabDX.setLayout(tabDXLayout);
        tabDXLayout.setHorizontalGroup(
            tabDXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDXLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblDangXuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabDXLayout.setVerticalGroup(
            tabDXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addComponent(tabDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabDX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jp11DX.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jp11DXLayout = new javax.swing.GroupLayout(jp11DX);
        jp11DX.setLayout(jp11DXLayout);
        jp11DXLayout.setHorizontalGroup(
            jp11DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        jp11DXLayout.setVerticalGroup(
            jp11DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );

        jp10HD.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jp10HDLayout = new javax.swing.GroupLayout(jp10HD);
        jp10HD.setLayout(jp10HDLayout);
        jp10HDLayout.setHorizontalGroup(
            jp10HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        jp10HDLayout.setVerticalGroup(
            jp10HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );

        jp9SP.setBackground(new java.awt.Color(255, 255, 255));

        lblMaSP.setText("Mã SP");

        lblTenSP.setText("Tên SP");

        lblGia.setText("Giá");

        btnThemSp.setText("Thêm");
        btnThemSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSpActionPerformed(evt);
            }
        });

        btnSuaSP.setText("Cập nhật");
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        btnLamMoiSP.setText("Làm Mới");
        btnLamMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiSPActionPerformed(evt);
            }
        });

        lblSoLuong.setText("Số Lượng");

        lblNha.setText("Nhà Cung Cấp");

        lblChatLieu.setText("Chất liệu");

        lblMau.setText("Màu Sắc");

        lblSize.setText("Size");

        cbbChat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotton", "Nỉ", "Lụa", "Len" }));

        cbbMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Den", "Trang", "Xanh", "Hong", "Do" }));

        cbbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnThemSp)
                .addGap(130, 130, 130)
                .addComponent(btnSuaSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoiSP)
                .addGap(291, 291, 291))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMaSP)
                        .addComponent(lblTenSP))
                    .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong))
                .addGap(40, 40, 40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(txtGia, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(150, 150, 150)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblNha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtNha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(lblChatLieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbChat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbMau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSP)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNha)
                    .addComponent(txtNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSP)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChatLieu)
                    .addComponent(cbbChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMau)
                    .addComponent(cbbMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuong)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSize)
                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSp)
                    .addComponent(btnSuaSP)
                    .addComponent(btnLamMoiSP))
                .addGap(19, 19, 19))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Thông Tin Sản Phẩm");

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Giá", "Số Lượng", "Nhà Cung Cấp", "Chất Liệu", "Màu Sắc", "Size"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSP);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTim.setText("Mã SP");

        btnTimsp.setText("Tìm kiếm");
        btnTimsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblTim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimsp, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnTimsp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTim)
                    .addComponent(txtTimsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimsp))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp9SPLayout = new javax.swing.GroupLayout(jp9SP);
        jp9SP.setLayout(jp9SPLayout);
        jp9SPLayout.setHorizontalGroup(
            jp9SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp9SPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp9SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp9SPLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp9SPLayout.setVerticalGroup(
            jp9SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp9SPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jp8KM.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jp8KMLayout = new javax.swing.GroupLayout(jp8KM);
        jp8KM.setLayout(jp8KMLayout);
        jp8KMLayout.setHorizontalGroup(
            jp8KMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        jp8KMLayout.setVerticalGroup(
            jp8KMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );

        jp7DT.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jp7DTLayout = new javax.swing.GroupLayout(jp7DT);
        jp7DT.setLayout(jp7DTLayout);
        jp7DTLayout.setHorizontalGroup(
            jp7DTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        jp7DTLayout.setVerticalGroup(
            jp7DTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );

        jp4BH.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jp4BHLayout = new javax.swing.GroupLayout(jp4BH);
        jp4BH.setLayout(jp4BHLayout);
        jp4BHLayout.setHorizontalGroup(
            jp4BHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        jp4BHLayout.setVerticalGroup(
            jp4BHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jp5KH.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMaKH.setText("Mã KH");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        lblTenKH.setText("Họ Tên");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        lblEmailKH.setText("Email");

        lblSDTkh.setText("SĐT");

        btnThemkh.setText("Thêm");
        btnThemkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemkhActionPerformed(evt);
            }
        });

        btnCapNhatkh.setText("Cập nhật");
        btnCapNhatkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatkhActionPerformed(evt);
            }
        });

        btnLamMoikh.setText("Làm mới");
        btnLamMoikh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoikhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnThemkh))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKH)
                            .addComponent(lblTenKH)
                            .addComponent(lblEmailKH))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailKH, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSDTkh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDTkh, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnCapNhatkh)
                        .addGap(181, 181, 181)
                        .addComponent(btnLamMoikh)
                        .addGap(56, 56, 56))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSDTkh)
                    .addComponent(txtSDTkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenKH))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemkh)
                    .addComponent(btnCapNhatkh)
                    .addComponent(btnLamMoikh))
                .addContainerGap())
        );

        jLabel7.setText("Thiết lập thông tin");

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Họ và Tên", "Email", "SĐT"
            }
        ));
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKH);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Thông tin khách hàng");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Thông tin khách hàng");

        javax.swing.GroupLayout jp5KHLayout = new javax.swing.GroupLayout(jp5KH);
        jp5KH.setLayout(jp5KHLayout);
        jp5KHLayout.setHorizontalGroup(
            jp5KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5KHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp5KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp5KHLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp5KHLayout.setVerticalGroup(
            jp5KHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5KHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp6NV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Thông tin nhân viên");

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMaNV.setText("Mã NV");

        lblTenNV.setText("Họ Tên");

        lblChucVu.setText("Chức Vụ");

        buttonGroup1.add(rdoQuanLy);
        rdoQuanLy.setText("Quản Lý");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân Viên");

        lblEmailNV.setText("Email");

        jLabel4.setText("SĐT");

        lblGioiTinh.setText("Giới Tính");

        buttonGroup3.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup3.add(rdoNu);
        rdoNu.setText("Nữ");

        lblTrangThai.setText("Trạng Thái");

        buttonGroup2.add(rdoDang);
        rdoDang.setText("Đang làm việc");

        buttonGroup2.add(rdoNghi);
        rdoNghi.setText("Nghỉ việc");

        lblDiaChi.setText("Địa Chỉ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV)
                            .addComponent(lblTenNV)
                            .addComponent(lblChucVu)
                            .addComponent(lblEmailNV))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(rdoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 145, Short.MAX_VALUE))
                            .addComponent(txtMaNV)
                            .addComponent(txtTenNV)
                            .addComponent(txtEmailNV))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGioiTinh)
                            .addComponent(lblTrangThai)
                            .addComponent(lblDiaChi)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDTnv)
                            .addComponent(txtDiaChi)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(rdoDang)
                                        .addGap(15, 15, 15)
                                        .addComponent(rdoNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 102, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi)
                        .addGap(85, 85, 85))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNV)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSDTnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioiTinh)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChucVu)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoQuanLy)
                        .addComponent(rdoNhanVien)
                        .addComponent(lblTrangThai)
                        .addComponent(rdoDang)
                        .addComponent(rdoNghi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmailNV)
                        .addComponent(txtEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiaChi)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnLamMoi))
                .addContainerGap())
        );

        jLabel3.setText("Thiết lập thông tin");

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblma.setText("Mã NV");

        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblma)
                .addGap(64, 64, 64)
                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btnTim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblma)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ và Tên", "Chức Vụ", "Email", "SĐT", "Giới Tính ", "Trạng Thái", "Địa Chỉ"
            }
        ));
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNV);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp6NVLayout = new javax.swing.GroupLayout(jp6NV);
        jp6NV.setLayout(jp6NVLayout);
        jp6NVLayout.setHorizontalGroup(
            jp6NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp6NVLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp6NVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp6NVLayout.setVerticalGroup(
            jp6NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp6NVLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp5KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp4BH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp6NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp7DT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp8KM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp9SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp10HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp11DX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp5KH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp4BH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp6NV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp7DT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp8KM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp9SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp10HD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp11DX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        // TODO add your handling code here:
        jp6NV.setVisible(true);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        tabNV.setBackground(Color.white);
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
        this.fillTable();
        
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseClicked
        // TODO add your handling code here:
        jp5KH.setVisible(true);
        jp6NV.setVisible(false);
        
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        
        tabKH.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_lblKhachHangMouseClicked

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        // TODO add your handling code here:
        jp4BH.setVisible(true);
        jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        tabBH.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoanhThuMouseClicked
        // TODO add your handling code here:
        jp7DT.setVisible(true);
        jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        tabDT.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));   
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_lblDoanhThuMouseClicked

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        jp8KM.setVisible(true);
        jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        tabKM.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void tabSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSPMouseClicked
        // TODO add your handling code here:
        jp9SP.setVisible(true);
         jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        
        jp10HD.setVisible(false);
        jp11DX.setVisible(false);
        tabSP.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
      
    }//GEN-LAST:event_tabSPMouseClicked

    private void tabHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHDMouseClicked
        // TODO add your handling code here:
        jp10HD.setVisible(true);
        jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        
        jp11DX.setVisible(false);
        tabHD.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabDX.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_tabHDMouseClicked

    private void tabDXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDXMouseClicked
        // TODO add your handling code here: 
          jp11DX.setVisible(true);
        jp6NV.setVisible(false);
        jp5KH.setVisible(false);
        jp4BH.setVisible(false);
        jp7DT.setVisible(false);
        jp8KM.setVisible(false);
        jp9SP.setVisible(false);
        jp10HD.setVisible(false);
        tabDX.setBackground(Color.white);
        tabNV.setBackground(new Color(0,204,255));
        tabKH.setBackground(new Color(0,204,255));
        tabBH.setBackground(new Color(0,204,255));
        tabDT.setBackground(new Color(0,204,255));
        tabHD.setBackground(new Color(0,204,255));
        tabKM.setBackground(new Color(0,204,255));
        tabSP.setBackground(new Color(0,204,255));
       
    }//GEN-LAST:event_tabDXMouseClicked

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        // TODO add your handling code here:
       int index = tblNV.getSelectedRow();
//        fillForm(list.get(index));
         if (index != -1) {
        // Lấy mã nhân viên từ bảng
        String maNV = tblNV.getValueAt(index, 0).toString();
        
        // Tìm nhân viên trong danh sách theo mã
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                // Điền thông tin nhân viên lên form
                fillForm(nv);
                break;
            }
        }
    }
    }//GEN-LAST:event_tblNVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
          if(nhanVienServiceS.them(readForm()) == 1){
           JOptionPane.showMessageDialog(this, "Them thanh cong");
           fillTable();
       }else{
            JOptionPane.showMessageDialog(this, "Them that bai");
       }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(nhanVienServiceS.capnhat(readForm())==1){
        JOptionPane.showMessageDialog(this, "Sua thanh cong");
        fillTable();
    }else{
        JOptionPane.showMessageDialog(this, "Sua that bai");
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
         
        txtMaNV.setText("");
        txtTenNV.setText("");
        rdoQuanLy.setSelected(true);
        txtEmailNV.setText("");
        txtSDTnv.setText("");
        rdoNam.setSelected(true);
        rdoDang.setSelected(true);
        txtDiaChi.setText("");
       
    
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnCapNhatkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatkhActionPerformed
        // TODO add your handling code here:
        if(kh.capnhat(readFormkh())==1){
        JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
            fillTablekh();
    }else{
        JOptionPane.showMessageDialog(this, "Cap nhat that bai");
    }
    }//GEN-LAST:event_btnCapNhatkhActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void tblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMouseClicked
        // TODO add your handling code here:
        int index = tblKH.getSelectedRow();
        fillFormkh(lis.get(index));
    }//GEN-LAST:event_tblKHMouseClicked

    private void btnThemkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemkhActionPerformed
        // TODO add your handling code here:
         if(kh.them(readFormkh()) == 1){
           JOptionPane.showMessageDialog(this, "Them thanh cong");
             fillTablekh();
       }else{
            JOptionPane.showMessageDialog(this, "Them that bai");
       }
    }//GEN-LAST:event_btnThemkhActionPerformed

    private void btnLamMoikhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoikhActionPerformed
        // TODO add your handling code here:
         txtMaKH.setText("");
        txtTenKH.setText("");
        txtEmailKH.setText("");
        txtSDTkh.setText("");
    }//GEN-LAST:event_btnLamMoikhActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
         String maTimKiem = txtma.getText().trim();
    
    // Kiểm tra nếu ô tìm kiếm không rỗng
    if (!maTimKiem.isEmpty()) {
        // Tìm kiếm nhân viên theo mã
        List<NhanVien> ketQuaTimKiem = new ArrayList<>();
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maTimKiem)) {
                ketQuaTimKiem.add(nv);
                break; // Dừng tìm kiếm sau khi tìm thấy
            }
        }
        
        // Cập nhật bảng với kết quả tìm kiếm
        dtm.setRowCount(0);
        for (NhanVien nv : ketQuaTimKiem) {
            dtm.addRow(nv.toRowTable());
        }
    } else {
        // Nếu ô tìm kiếm rỗng, hiển thị lại toàn bộ danh sách
        fillTablesp();
    }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLamMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiSPActionPerformed
        // TODO add your handling code here:
        clearsp();
    }//GEN-LAST:event_btnLamMoiSPActionPerformed

    private void btnThemSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSpActionPerformed
        // TODO add your handling code here:
         if(sp.them(readFormsp()) == 1){
           JOptionPane.showMessageDialog(this, "Them thanh cong");
           fillTablesp();
       }else{
            JOptionPane.showMessageDialog(this, "Them that bai");
       }
    }//GEN-LAST:event_btnThemSpActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        // TODO add your handling code here:
        if(sp.capnhat(readFormsp())==1){
        JOptionPane.showMessageDialog(this, "Sua thanh cong");
        fillTablesp();
    }else{
        JOptionPane.showMessageDialog(this, "Sua that bai");
    }
    }//GEN-LAST:event_btnSuaSPActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
         int index = tblSP.getSelectedRow();
//        fillForm(list.get(index));
         if (index != -1) {
        // Lấy mã nhân viên từ bảng
        String maSP = tblSP.getValueAt(index, 0).toString();
        
        // Tìm nhân viên trong danh sách theo mã
        for (SanPham sp : listsp) {
            if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                // Điền thông tin nhân viên lên form
                fillFormsp(sp);
                break;
            }
        }
         }  
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnTimspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimspActionPerformed
        // TODO add your handling code here:
        String maTimKiem = txtTimsp.getText().trim();
    
    // Kiểm tra nếu ô tìm kiếm không rỗng
    if (!maTimKiem.isEmpty()) {
        // Tìm kiếm nhân viên theo mã
        List<SanPham> ketQuaTimKiem = new ArrayList<>();
        for (SanPham sp : listsp) {
            if (sp.getMaSP().equalsIgnoreCase(maTimKiem)) {
                ketQuaTimKiem.add(sp);
                break; // Dừng tìm kiếm sau khi tìm thấy
            }
        }
        
        // Cập nhật bảng với kết quả tìm kiếm
        dtm.setRowCount(0);
        for (SanPham sp : ketQuaTimKiem) {
            dtm.addRow(sp.toRowTable());
        }
    } else {
        // Nếu ô tìm kiếm rỗng, hiển thị lại toàn bộ danh sách
        fillTablesp();
    }
    }//GEN-LAST:event_btnTimspActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatkh;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLamMoiSP;
    private javax.swing.JButton btnLamMoikh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemSp;
    private javax.swing.JButton btnThemkh;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTimsp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbbChat;
    private javax.swing.JComboBox<String> cbbMau;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jp10HD;
    private javax.swing.JPanel jp11DX;
    private javax.swing.JPanel jp4BH;
    private javax.swing.JPanel jp5KH;
    private javax.swing.JPanel jp6NV;
    private javax.swing.JPanel jp7DT;
    private javax.swing.JPanel jp8KM;
    private javax.swing.JPanel jp9SP;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblChatLieu;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblEmailKH;
    private javax.swing.JLabel lblEmailNV;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoatDong;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMau;
    private javax.swing.JLabel lblNha;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSDTkh;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTim;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblma;
    private javax.swing.JRadioButton rdoDang;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNghi;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JPanel tabBH;
    private javax.swing.JPanel tabDT;
    private javax.swing.JPanel tabDX;
    private javax.swing.JPanel tabHD;
    private javax.swing.JPanel tabKH;
    private javax.swing.JPanel tabKM;
    private javax.swing.JPanel tabNV;
    private javax.swing.JPanel tabSP;
    private javax.swing.JTable tblKH;
    private javax.swing.JTable tblNV;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmailKH;
    private javax.swing.JTextField txtEmailNV;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNha;
    private javax.swing.JTextField txtSDTkh;
    private javax.swing.JTextField txtSDTnv;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimsp;
    private javax.swing.JTextField txtma;
    // End of variables declaration//GEN-END:variables
}
