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
package entity.custom;

import entity.SuperEntity;

public class Customer implements SuperEntity {
    private String customerID;
    private String customerName;
    private double customerMobile;
    private String customerSalary;

    public Customer() {
    }

    public Customer(String customerID, String customerName, double customerMobile, String customerSalary) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerSalary = customerSalary;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(double customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(String customerSalary) {
        this.customerSalary = customerSalary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerMobile=" + customerMobile +
                ", customerSalary='" + customerSalary + '\'' +
                '}';
    }
}
