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

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {
    public AnchorPane MainForm;
    public JFXButton btnCustomer;

    public void btnCustomerOnAction(ActionEvent actionEvent) {
        try {
            MainForm.getChildren().clear();
            AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/CustomerForm.fxml"));
            MainForm.getChildren().addAll(load.getChildren());
        } catch (Exception e) {

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            MainForm.getChildren().clear();
            AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/CustomerForm.fxml"));
            MainForm.getChildren().addAll(load.getChildren());
        } catch (Exception e) {

        }
    }
}
