int baris = jTable_buku.getSelectedRow();
jTextField_kode_buku.setText(DftTblModel_buku.getValueAt(baris, 0).toString());
jTextField_nama_buku.setText(DftTblModel_buku.getValueAt(baris, 1).toString());
jTextField_harga.setText(DftTblModel_buku.getValueAt(baris, 2).toString());
jTextField_satuan.setText(DftTblModel_buku.getValueAt(baris, 3).toString());
jTextField_stok.setText(DftTblModel_buku.getValueAt(baris, 4).toString());


try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update buku set nama_buku=?, harga=?, satuan=?, stok=? where kode_buku=?");
            stmt.setString(1, jTextField_penerbit_buku.getText());
            stmt.setString(2, jTextField_author_buku.getText());
            stmt.setString(3, jTextField_jumlah_buku.getText());
            stmt.setString(4, jTextField_desc_buku.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
