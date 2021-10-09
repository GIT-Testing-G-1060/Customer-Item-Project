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
package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class CustomerFormController {
    public JFXTextField txtName;
    public JFXTextField txtMobile;
    public JFXTextField txtSalary;
    public JFXTextField txtId;
    public JFXButton btnSave;


    CustomerBO customerBO = BOFactory.getInstance().getBO(BOFactory.BOType.CUSTOMER);

    public void btnSaveOnAction(ActionEvent actionEvent) {
        try {
            boolean isSaved = customerBO.saveCustomer(
                    new CustomerDTO(
                            txtId.getText(),
                            txtName.getText(),
                            Double.parseDouble(txtMobile.getText()),
                            txtSalary.getText()
                    )
            );
            if (isSaved) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Customer Save Success..!");
                alert.setHeaderText(null);
                alert.setContentText(txtId.getText()+"Save Success");
                alert.showAndWait();
                clearTextFields();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Customer Not Save..!");
                alert.setHeaderText(null);
                alert.showAndWait();
            }
        } catch (Exception e) {
        }
    }
    private void  clearTextFields(){
        txtId.setText(null);
        txtMobile.setText(null);
        txtName.setText(null);
        txtSalary.setText(null);
    }
}
