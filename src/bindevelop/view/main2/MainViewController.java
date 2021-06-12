/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindevelop.view.main2;

import bindevelop.Run;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author zequi
 */
public class MainViewController implements Initializable {
    
    
    @FXML
    private MenuBar menuBar;
    @FXML
    private Button button_menu_4;

    @FXML
    private Button button_menu_3;

    @FXML
    private Button button_menu_5;

    @FXML
    private Button button_menu_2;

    @FXML
    private Button button_menu_1;
    
    @FXML
    private AnchorPane menu_panel;
    
    private String menuUrl;
    
    private final HashMap<String,Parent> menu_lateral = new HashMap<>();
    /**     
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO      
        final String os = System.getProperty("os.name");
        System.out.println("os: "+os);
        if (os != null && os.startsWith("Mac")){ 
        menuBar.useSystemMenuBarProperty().set(true);
        }
        initButtonsEvents();
    }    
    
    private void initButtonsEvents(){
        
        button_menu_1.setOnAction((ActionEvent e) -> {         
          setMenuView("view/menu/MenuProject.fxml");
        });
        button_menu_2.setOnAction((ActionEvent e) -> {          
          setMenuView("view/menu/MenuOpcoes.fxml");
        });
         button_menu_3.setOnAction((ActionEvent e) -> {
          setMenuView(null);
        });
        button_menu_4.setOnAction((ActionEvent e) -> {
          setMenuView(null);
        });
        button_menu_5.setOnAction((ActionEvent e) -> {
          setMenuView(null);
        });
        
    }
    
    private void setMenuView(String menu){
        
        
       if(menu!= null){
         
            if(!menu_lateral.containsKey(menu)){

              Parent view =  Run.system.getPanet(menu);
              menu_lateral.put(menu, view);
              AnchorPane.setTopAnchor(view, 0.0);
              AnchorPane.setBottomAnchor(view, 0.0);
              AnchorPane.setLeftAnchor(view, 0.0);
              AnchorPane.setRightAnchor(view, 0.0);
                         

            }
            
            if(!menu.equals(menuUrl)){
              menu_panel.setPrefWidth(200);
              menu_panel.setMaxWidth(200);
              menu_panel.getChildren().setAll(menu_lateral.get(menu));    
            }else {
              menu_panel.setPrefWidth(50);
             
              menu_panel.getChildren().setAll();
              menu = null;
            }
              menuUrl = menu;

           
       }else {
              menu_panel.setPrefWidth(0);
              menu_panel.getChildren().setAll();
              menuUrl = null;
       }
    }
    
}
