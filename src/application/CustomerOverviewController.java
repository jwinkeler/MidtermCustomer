package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class CustomerOverviewController {

	@FXML
	private TextField FirstName;
	@FXML
	private TextField MiddleInit;
	@FXML
	private TextField LastName;
	@FXML
	private TextField Address;
	@FXML
	private TextField City;
	@FXML
	private TextField Zipcode;
	@FXML
	private ComboBox<String> StatesComboBox;
	ObservableList<String> StatesComboBoxData = FXCollections.observableArrayList();
			


	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public CustomerOverviewController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */

	@FXML
	private void initialize() {
		StatesComboBoxData.add("Ohio");
		StatesComboBoxData.add("Delaware");
		StatesComboBoxData.add("Alaska");
		StatesComboBoxData.add("Kansas");
		StatesComboBoxData.add("Wyoming");

		StatesComboBox.setItems(StatesComboBoxData);
		
	}
}


