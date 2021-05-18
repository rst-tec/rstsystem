package br.com.rst.dal;
import java.sql.*;

/**
 *
 * @author Raphael.Silva
 */
public class ModuloConexao {
    //Metodo responsavel por estabelece a conexão com o banco
    
    public static Connection conector() {
        Connection conexao = null;
        //Chamando o drive
        String driver = "com.mysql.cj.jdbc.Driver";

        //Informações do banco de dados        
        String url = "jdbc:mysql://127.0.0.1:3306/rst";
        String user = "root";
        String password = "adm102030";
        
        //Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;          
        } catch (Exception e) {
            //Exibe as informações sobre erro de conexão
            System.out.println(e); 
            return null;
        }

    }

}
