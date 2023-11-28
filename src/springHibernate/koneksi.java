package springHibernate;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;

import java.sql.SQLException;

/**
 *
 * @author fikry
 */
public class koneksi {
    static Connection c;
    
    public static Connection connection(){
        if(c == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("belajar");
            data.setUser("root");
            data.setPassword("");
            try{
                    c = data.getConnection();
                    }catch(SQLException ex){
                        ex.printStackTrace();
                    }
        }
        return c;
        }
    
}
