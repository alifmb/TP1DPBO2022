package Form;

import Konfigurasi.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

private DefaultTableModel DftTblModel_barang;
private String SQL; 

public void TampilData() {
        DftTblModel_barang = new DefaultTableModel();
        DftTblModel_barang.addColumn("Penerbit Buku");
        DftTblModel_barang.addColumn("Author Buku");
        DftTblModel_barang.addColumn("Jumlah Buku");
        DftTblModel_barang.addColumn("Desc Buku");
        jTable_barang.setModel(DftTblModel_barang);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from barang";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_barang.addRow(new Object[]{
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
