/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindevelop.view.menu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author zequi
 */
public class MenuProjectController implements Initializable {

    
    @FXML
    private TreeView<?> treeViewProjct;
    /**     
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        setTreeProjct();
    }    
    
    
    public void setTreeProjct(){
    
        TreeItem  rootItem = new TreeItem("Tutorials");

        TreeItem webItem = new TreeItem("Web Tutorials");
        webItem.getChildren().add(new TreeItem("HTML  Tutorial"));
        webItem.getChildren().add(new TreeItem("HTML5 Tutorial"));
        webItem.getChildren().add(new TreeItem("CSS Tutorial"));
        webItem.getChildren().add(new TreeItem("SVG Tutorial"));
        rootItem.getChildren().add(webItem);

        TreeItem javaItem = new TreeItem("Java Tutorials");
        javaItem.getChildren().add(new TreeItem("Java Language"));
        javaItem.getChildren().add(new TreeItem("Java Collections"));
        javaItem.getChildren().add(new TreeItem("Java Concurrency"));
        rootItem.getChildren().add(javaItem);

       
        treeViewProjct.setRoot(rootItem);
    }
    
    
}
