/*
 *  * ------------------------------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer Item Project. All rights reserved.
 *  *  *  Licensed under the SriLankan Information License. See License.txt in the project root for license information.
 *  * ------------------------------------------------------------------------------------------------------------------
 */
/*
 * @author Mindula Dilthushan <minduladilthushan1@gmail.com>
 * @since 10/09/2021
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CustomerItemProject","root","1023");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if (dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
