package Form;

import Konfigurasi.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

private DefaultTableModel DftTblModel_buku;
private String SQL; 

public void TampilData() {
        DftTblModel_buku = new DefaultTableModel();
        DftTblModel_buku.addColumn("Penerbit Buku");
        DftTblModel_buku.addColumn("Author Buku");
        DftTblModel_buku.addColumn("Jumlah Buku");
        DftTblModel_buku.addColumn("Desc Buku");
        jTable_buku.setModel(DftTblModel_buku);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from buku";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_buku.addRow(new Object[]{
                    res.getString("penerbit_buku"),
                    res.getString("author_buku"),
                    res.getString("jumlah_buku"),
                    res.getString("desc_buku"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 public form_buku() {
        initComponents();
        this.TampilData();
    }
