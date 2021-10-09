package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class DashBoardFormController {
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
}
