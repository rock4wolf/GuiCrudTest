/*
EI BASE DE DATOS I 5°B
    PROFESORA MTRA.SANDRA ELIZABETH LEON SOSA
EQUIPO:5 

INTEGRANTES: 
    CHAVEZ ROMERO MIGUEL            (CRMO150535)     
    MARTINEZ CASTELLANOS EDUARDO    (MCEO161237)   
    REYES SALGADO ERICK EDUARDO     (RSEO160683)
   
DESCRIPCION DE CLASE:
    En esta clase se controla el acceso a la base de datos, para proporcionar  la conexion al servidor con las clase y metodos.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Amairani
 */
public class Conexion {
        public Connection con = null;
        private static String usuarioDB;
        private static String passwordDB;
    //metodo conectar: Crea la conexion con el servidor de la base de datos.
    public Connection conectar() 
    {
        //System.out.print(passwordDB + usuarioDB);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/TM9";//se utiliza un host local, de momento.
            con = (Connection) DriverManager.getConnection(servidor,usuarioDB, passwordDB);//Para accesar se requiere el previo registro de usuarios
            return con;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null,"Error en la Conexión con la BD ");
        }  
        return null;
    }
    //Esta clase cierra la conexion con la base de datos.
    public void desconectar() throws SQLException{
        if(con != null){
            con.close();    
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public static String getUsuarioDB() {
        return usuarioDB;
    }

    public static void setUsuarioDB(String usuarioDB) {
        Conexion.usuarioDB = usuarioDB;
    }

    public static String getPasswordDB() {
        return passwordDB;
    }

    public static void setPasswordDB(String passwordDB) {
        Conexion.passwordDB = passwordDB;
    }
    
}
