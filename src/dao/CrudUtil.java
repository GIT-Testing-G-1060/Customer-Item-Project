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
package dao;

import db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {
    public static <T> T execute(String sql,Object...args) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm= DBConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            pstm.setObject((i+1),args[i]);
        }
        if (sql.startsWith("SELECT")){
            return (T)pstm.executeQuery();
        }
        return ((T)(Boolean)(pstm.executeUpdate()>0));
    }
}
