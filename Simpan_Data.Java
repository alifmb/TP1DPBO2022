try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into buku(penerbit_buku, author_buku, jumlah_buku, desc_buku) values(?,?,?,?)");
            stmt.setString(1, jTextField_penerbit_buku.getText());
            stmt.setString(2, jTextField_author_buku.getText());
            stmt.setString(3, jTextField_jumlah_buku.getText());
            stmt.setString(4, jTextField_desc_buku.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
