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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppInitializer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/DashBoardForm.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

