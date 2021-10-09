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
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.custom.Customer;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.execute("INSERT INTO Customer VALUES(?,?,?,?)",
                customer.getCustomerID(),
                customer.getCustomerName(),
                customer.getCustomerMobile(),
                customer.getCustomerSalary()
        );
    }
}
