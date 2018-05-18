package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    private static final String uname = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_sql";

    public static void main(String[] args) {
        try {
            Connection koneksi = DriverManager.getConnection(url, uname, pass);
            System.out.println("Databse di temukan");

//            Statement st = koneksi.createStatement();
//            ResultSet hasil = st.executeQuery("select * from mahasiswa");
//            while (hasil.next()) {
//                System.out.print("Id : " + hasil.getString(1));
//                System.out.print("Nim : " + hasil.getString(2));
//                System.out.print("Nama : " + hasil.getString("nama"));
//                System.out.println("");
//            }
//            koneksi.close();


            String sql="insert into mahasiswa(nim,nama) values (?,?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, "1234");
            ps.setString(2, "Muhamad Hanif");
            ps.executeUpdate();
            ps.close();
            koneksi.close();


//            String sql="update mahasiswa set nama=? where nim= ?";
//            PreparedStatement ps = koneksi.prepareStatement(sql);
//            ps.setString(2, "1023455");
//            ps.setString(1, "Muhamad Hanif");
//            ps.executeUpdate();
//            ps.close();
//            koneksi.close();

//                String sql="delete from mahasiswa  where nim= ?";
//            PreparedStatement ps = koneksi.prepareStatement(sql);
//            ps.setString(1, "1023455");
//            ps.executeUpdate();
//            ps.close();
//            koneksi.close();

            

        } catch (SQLException ex) {
            System.err.println("Data bese tidak di temuakn");
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
