package com.shoothzj.filesherlock;

import com.shoothzj.filesherlock.ui.FileSherlockMenuBar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {
    private Stage stage;

    private BorderPane root;

    @Override
    public void start(Stage stage) {
        this.stage = stage;

        this.root = new BorderPane();
        this.root.setTop(new FileSherlockMenuBar());

        Scene scene = new Scene(root, PixelConst.HEIGHT, PixelConst.WEIGHT);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
