/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitortable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author anjan
 */
public class VisitorTableController implements Initializable {
    
    @FXML
    private TableView<Visitor> tableId;
    @FXML
    private TableColumn<Visitor, Integer> id;
    @FXML
    private TableColumn<Visitor, String> name;
    @FXML
    private TableColumn<Visitor, String> city;
    @FXML
    private TableColumn<Visitor, String> country;
    
    private int count = 1; 
    
    ObservableList<Visitor> data = FXCollections.observableArrayList(
    new Visitor (count++, "James", "Dallas", "United States"),
            new Visitor (count++, "Joy", "San Jose", "United States"),
            new Visitor (count++, "Anjan", "Monroe", "United States"),
            new Visitor (count++, "Anjan", "Kathmandu", "Nepal"),
            new Visitor (count++, "Kaith", "Boston", "United States"),
            new Visitor (count++, "Jeniffer", "London", "England")       
    ); 
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        id.setCellValueFactory(new PropertyValueFactory<Visitor, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Visitor, String>("name"));
        city.setCellValueFactory(new PropertyValueFactory<Visitor, String>("city"));
        country.setCellValueFactory(new PropertyValueFactory<Visitor, String>("country"));
        tableId.setItems(data);
        
    }    
    
}
