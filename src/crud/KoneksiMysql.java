package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMysql {
    private Connection connect;
    private String driverName = "com.mysql.jdbc.Driver"; // driver untuk koneksi ke mysql
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:"; // Bisa menggunakan IP anda
    private String port = "3306/"; // port ini port Mysql
    private String database = "crud0072532469"; // ini database yang di gunakan
    private String url = jdbc + host + port + database;
    private String username = "root"; // username default mysql
    private String password = "";
    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            try {
                 Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                try {
                    connect = DriverManager.getConnection(url, username, password);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal : " + se);
                    System.exit(0);
                }
            }catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);
                System.exit(0);
            }
    }return connect;
        
    }
 }
        
