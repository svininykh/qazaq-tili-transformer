/**
 *
 * Copyright (C) 2018 Nord Trading Network Ltd. <http://www.nordpos.mobi>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package mobi.nordpos.qazaqtili;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToolbar;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class QazaqTiliApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.UILocales");

        JFXToolbar jfxToolbar = new JFXToolbar();
        jfxToolbar.setCenter(new Label(bundle.getString("key.toolbar.title")));
        BorderPane main = new BorderPane();
        main.setTop(jfxToolbar);
        JFXTextField jfxTextFieldCyr = new JFXTextField();
        JFXTextField jfxTextFieldLat = new JFXTextField();
        jfxTextFieldCyr.setPromptText(bundle.getString("key.field.cyr"));
        jfxTextFieldLat.setPromptText(bundle.getString("key.field.lat"));

        jfxTextFieldCyr.setLabelFloat(true);
        jfxTextFieldLat.setLabelFloat(true);

        jfxTextFieldLat.setEditable(false);

        JFXButton jfxButton = new JFXButton(bundle.getString("key.button.transform"));
        jfxButton.setOnAction((ActionPushButton) -> {
            
            jfxTextFieldLat.setText(new CyrToLatConverter(jfxTextFieldCyr.getText()).getText());
        });

        AnchorPane anchorPane = new AnchorPane(jfxTextFieldCyr, jfxTextFieldLat, jfxButton);
        anchorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        AnchorPane.setLeftAnchor(jfxTextFieldCyr, 16.0);
        AnchorPane.setTopAnchor(jfxTextFieldCyr, 24.0);
        AnchorPane.setRightAnchor(jfxTextFieldCyr, 16.0);

        AnchorPane.setLeftAnchor(jfxTextFieldLat, 16.0);
        AnchorPane.setTopAnchor(jfxTextFieldLat, 64.0);
        AnchorPane.setRightAnchor(jfxTextFieldLat, 16.0);

        AnchorPane.setLeftAnchor(jfxButton, 16.0);
        AnchorPane.setTopAnchor(jfxButton, 104.0);
        AnchorPane.setRightAnchor(jfxButton, 16.0);

        main.setCenter(anchorPane);

        Scene scene = new Scene(main, 400, 600);
        scene.getStylesheets().add(QazaqTiliApp.class.getResource("/styles/jfoenix-components.css").toExternalForm());
        stage.setTitle(bundle.getString("key.app.title"));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
