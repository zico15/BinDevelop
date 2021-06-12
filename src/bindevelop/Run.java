/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindevelop;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author zequi
 */
public class Run extends Application {
    
    
    public static final String VERSAO = "Pre-alpha: 0.01";
    public static Run system;
    @Override
    public void start(Stage stage) throws Exception {
        system = this;
        stage.setTitle("BinDevelop - "+VERSAO);
        Parent root = FXMLLoader.load(getClass().getResource("view/main2/MainView.fxml"));    
        Scene scene = new Scene(root);                  
        stage.setScene(scene);
        //WindowsView.setViewController(stage); 
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public Parent getPanet(String url){
    
        try {
            return  FXMLLoader.load(getClass().getResource(url));
        } catch (IOException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
