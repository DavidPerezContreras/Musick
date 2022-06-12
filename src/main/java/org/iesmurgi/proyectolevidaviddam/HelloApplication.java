package org.iesmurgi.proyectolevidaviddam;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.iesmurgi.proyectolevidaviddam.Controllers.HelloController;
import org.iesmurgi.proyectolevidaviddam.Middleware.Requester;
import org.kordamp.bootstrapfx.BootstrapFX;

import javax.swing.text.PlainDocument;
import java.io.File;
import java.io.IOException;

/**
 * Punto de entrada para nuestra aplicación. TrickLauncher contiene el método main que llama al método main de esta clase.
 * Es para que javaFX no detecte que se está llamando a launch en el main y nos deje compilar el programa.
 *
 * @version 1.0
 * @author David Pérez Contreras
 * @author Leví Vicente Navarro
 *
 */

public class HelloApplication extends Application {
    public static Stage mainStage;
    public static boolean session_started = false;

    /**
     * Método llamado por la libreria JavaFX como punto de entrada para la aplicación.
     * @param stage
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        mainStage = stage;
        
        //Para gestionar el estado "en línea de un usuario"
        stage.setOnCloseRequest(event -> {
            if(session_started){
                Platform.runLater(()->{
                    try {
                        Requester<String> set_online = null;
                        System.out.println("Cerrando sesión ...");
                        set_online = new Requester<>("http://tux.iesmurgi.org:11230/set-online", Requester.Method.POST, String.class);
                        set_online.addParam("token", HelloController.log_out_token);
                        set_online.addParam("online", "false");
                        set_online.addParam("username", HelloController.log_out_username);
                        set_online.execute();
                    }catch (IOException e) {
                        System.exit(0);
                        Platform.exit();
                        e.printStackTrace();
                    }
                });
            }

            System.exit(0);
            Platform.exit();
        });

        //Carga la vista inicial, que es para iniciar sesión e incluye un botón para ir a register
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("log_in.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MuSick");
//        File file = new File("src/main/resources/org/iesmurgi/proyectolevidaviddam/images/musick_ico.png");
//        Image img = new Image(file.toURI().toString());
//        System.out.println(img.getUrl());
//        stage.getIcons().add(img);
        stage.setMaximized(true);
        stage.setMinWidth(1200);
        stage.setMinHeight(850);
        stage.setScene(scene);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        stage.show();
        Thread.sleep(500);
        stage.toFront();
    }

    //Método de entrada para la aplicación. Llamado por TrickLauncher.
    public static void main(String[] args) {
        launch();
    }
}
