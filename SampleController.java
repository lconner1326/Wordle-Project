package application;

import java.io.*;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class SampleController {
	@FXML private Label label_11 = new Label();	//row 1 labels
	@FXML private Label label_12 = new Label();
	@FXML private Label label_13 = new Label();
	@FXML private Label label_14 = new Label();
	@FXML private Label label_15 = new Label();
	
	@FXML private Label label_21 = new Label();	//row 2 labels
	@FXML private Label label_22 = new Label();
	@FXML private Label label_23 = new Label();
	@FXML private Label label_24 = new Label();
	@FXML private Label label_25 = new Label();
	
	@FXML private Label label_31 = new Label();	//row 3 labels
	@FXML private Label label_32 = new Label();
	@FXML private Label label_33 = new Label();
	@FXML private Label label_34 = new Label();
	@FXML private Label label_35 = new Label();
	
	@FXML private Label label_41 = new Label();	//row 4 labels
	@FXML private Label label_42 = new Label();
	@FXML private Label label_43 = new Label();
	@FXML private Label label_44 = new Label();
	@FXML private Label label_45 = new Label();
	
	@FXML private Label label_51 = new Label();	//row 5 labels
	@FXML private Label label_52 = new Label();
	@FXML private Label label_53 = new Label();
	@FXML private Label label_54 = new Label();
	@FXML private Label label_55 = new Label();
	
	@FXML private Label label_61 = new Label();	//row 6 labels
	@FXML private Label label_62 = new Label();
	@FXML private Label label_63 = new Label();
	@FXML private Label label_64 = new Label();
	@FXML private Label label_65 = new Label();
	
	@FXML private Button qButton = new Button("Q"); //keyboard buttons
	@FXML private Button wButton = new Button("W");
	@FXML private Button eButton = new Button("E");
	@FXML private Button rButton = new Button("R");
	@FXML private Button tButton = new Button("T");
	@FXML private Button yButton = new Button("Y");
	@FXML private Button uButton = new Button("U");
	@FXML private Button iButton = new Button("I");
	@FXML private Button oButton = new Button("O");
	@FXML private Button pButton = new Button("P");
	@FXML private Button aButton = new Button("A");
	@FXML private Button sButton = new Button("S");
	@FXML private Button dButton = new Button("D");
	@FXML private Button fButton = new Button("F");
	@FXML private Button gButton = new Button("G");
	@FXML private Button hButton = new Button("H");
	@FXML private Button jButton = new Button("J");
	@FXML private Button kButton = new Button("K");
	@FXML private Button lButton = new Button("L");
	@FXML private Button zButton = new Button("Z");
	@FXML private Button xButton = new Button("X");
	@FXML private Button cButton = new Button("C");
	@FXML private Button vButton = new Button("V");
	@FXML private Button bButton = new Button("B");
	@FXML private Button nButton = new Button("N");
	@FXML private Button mButton = new Button("M");
	@FXML private Button enterButton = new Button();
	@FXML private Button backspaceButton = new Button();
	@FXML private Button resetButton = new Button();
	@FXML private Button loadButton = new Button();
	@FXML private Button saveButton = new Button();
	
	private String randomWord;					//INITIALIZED VARIABLES HERE!!!!!!!!!!!!!!!!!!!!!!
	private String userGuess = "";
	private int guess_count = 0;
	private int letter_count = 0;
	private ArrayList<String> valid_words = new ArrayList<String>();
	private boolean hasWon;
	private int bestStreak = 0;
	
	@FXML public void initialize() { //constructor
		try {	//get random word
			File filename = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\wordle_words.txt");
			Scanner s = new Scanner(filename);
			String current;
			while (s.hasNext()) {
				current = s.next();
				valid_words.add(current.toUpperCase());
			}
			
			Random r = new Random();
			int number = r.nextInt(valid_words.size());
			randomWord = (String)valid_words.get(number).toUpperCase();
			System.out.println("Word is " + randomWord);
			s.close();
		} catch (FileNotFoundException except){
			System.out.println("File not found");
		}
	}
	
	@FXML protected void qButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},	//2D array data structure of game board to access/process data
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(qButton.getText());
		userGuess += qButton.getText();
		letter_count++;
	}
	@FXML protected void wButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(wButton.getText());
		userGuess += wButton.getText();
		letter_count++;
	}
	@FXML protected void eButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(eButton.getText());
		userGuess += eButton.getText();
		letter_count++;
	}
	@FXML protected void rButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(rButton.getText());
		userGuess += rButton.getText();
		letter_count++;
	}
	@FXML protected void tButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(tButton.getText());
		userGuess += tButton.getText();
		letter_count++;
	}
	@FXML protected void yButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(yButton.getText());
		userGuess += yButton.getText();
		letter_count++;
	}
	@FXML protected void uButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(uButton.getText());
		userGuess += uButton.getText();
		letter_count++;
	}
	@FXML protected void iButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(iButton.getText());
		userGuess += iButton.getText();
		letter_count++;
	}
	@FXML protected void oButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(oButton.getText());
		userGuess += oButton.getText();
		letter_count++;
	}
	@FXML protected void pButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(pButton.getText());
		userGuess += pButton.getText();
		letter_count++;
	}
	@FXML protected void aButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(aButton.getText());
		userGuess += aButton.getText();
		letter_count++;
	}
	@FXML protected void sButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(sButton.getText());
		userGuess += sButton.getText();
		letter_count++;
	}
	@FXML protected void dButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(dButton.getText());
		userGuess += dButton.getText();
		letter_count++;
	}
	@FXML protected void fButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(fButton.getText());
		userGuess += fButton.getText();
		letter_count++;
	}
	@FXML protected void gButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(gButton.getText());
		userGuess += gButton.getText();
		letter_count++;
	}
	@FXML protected void hButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(hButton.getText());
		userGuess += hButton.getText();
		letter_count++;
	}
	@FXML protected void jButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(jButton.getText());
		userGuess += jButton.getText();
		letter_count++;
	}
	@FXML protected void kButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(kButton.getText());
		userGuess += kButton.getText();
		letter_count++;
	}
	@FXML protected void lButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(lButton.getText());
		userGuess += lButton.getText();
		letter_count++;
	}
	@FXML protected void zButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(zButton.getText());
		userGuess += zButton.getText();
		letter_count++;
	}
	@FXML protected void xButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(xButton.getText());
		userGuess += xButton.getText();
		letter_count++;
	}
	@FXML protected void cButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(cButton.getText());
		userGuess += cButton.getText();
		letter_count++;
	}
	@FXML protected void vButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(vButton.getText());
		userGuess += vButton.getText();
		letter_count++;
	}
	@FXML protected void bButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(bButton.getText());
		userGuess += bButton.getText();
		letter_count++;
	}
	@FXML protected void nButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(nButton.getText());
		userGuess += nButton.getText();
		letter_count++;
	}
	@FXML protected void mButtonClicked() {
		if (letter_count == 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Guess Too Large!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count].setText(mButton.getText());
		userGuess += mButton.getText();
		letter_count++;
	}
	
	@FXML protected void backspaceClicked() {
		if (letter_count == 0) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Nothing To Delete!");
			alert.showAndWait();
			return;
		}
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		label_array[guess_count][letter_count - 1].setText("");
		userGuess = userGuess.substring(0, letter_count - 1);
		letter_count--;
	}
	@FXML protected void enterClicked() {
		if (letter_count != 5) {
			Alert alert = new Alert(Alert.AlertType.ERROR);	 //5 letter words only
			alert.setHeaderText("Must Be 5 Letter Word!");
			alert.showAndWait();
			return;
		}
		
		boolean isValid = false;
		for (int i = 0; i < valid_words.size(); i++) {	//in valid word list check
			if (valid_words.get(i).equals(userGuess)) {
				isValid = true;
				break;
			}
		}
		if (isValid == false) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Not A Valid Word!");
			alert.showAndWait();
			return;
		}
		
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		Button[] button_array = {qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton
								,aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton
								,zButton,xButton,cButton,vButton,bButton,nButton,mButton};
		
		for (int j = 0; j < 5; j++) {	//change label colors
			String letter = userGuess.substring(j, j + 1);
			if (letter.equals(randomWord.substring(j, j + 1))) {
				label_array[guess_count][j].setStyle("-fx-background-color: #6CA965");	//green
				for (int k = 0; k < 26; k++) {	//change keyboard color
					if (letter.equals(button_array[k].getText())) {
						button_array[k].setStyle("-fx-background-color: #6CA965");
						break;
					}
				}
			} else if (randomWord.indexOf(letter) > -1) {
				label_array[guess_count][j].setStyle("-fx-background-color: #C8B653");	//yellow
				for (int k = 0; k < 26; k++) {	//change keyboard color
					if (letter.equals(button_array[k].getText())) {
						if (button_array[k].getStyle().contains("-fx-background-color: #6CA965")) { //so green isn't overwritten
							break;
						}
						button_array[k].setStyle("-fx-background-color: #C8B653");
						break;
					}
				}
			} else {
				label_array[guess_count][j].setStyle("-fx-background-color: #787C7F");	//gray
				for (int k = 0; k < 26; k++) {	//change keyboard color
					if (letter.equals(button_array[k].getText())) {
						button_array[k].setStyle("-fx-background-color: #787C7F");
						break;
					}
				}
			}
		}
		
		hasWon = true;		//check if winner here
		for (int i = 0; i < 5; i++) {	
			if (label_array[guess_count][i].getStyle().contains("-fx-background-color: #6CA965")) {
				continue;
			} else {
				hasWon = false;
				break;
			}
		}
		if (hasWon) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setHeaderText("You Won!");
			alert.showAndWait();
			
			String stats = "";	//read and display stats on win
			try {	
				File filename2 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\stats_tracker.txt");
				Scanner reader = new Scanner(filename2);
				while (reader.hasNextLine()) {
					stats = reader.nextLine();
				}
				String[] data = stats.split(" ");		//[Games, Wins, Streak,	Best]
				int games = Integer.parseInt(data[0]);
				int wins = Integer.parseInt(data[1]);
				int streak = Integer.parseInt(data[2]);
				int best = Integer.parseInt(data[3]);
				games++;
				wins++;
				streak++;
				bestStreak = best;
				if (streak > bestStreak) {
					bestStreak = streak;
					best++;
				}
				stats = Integer.toString(games) + " " + Integer.toString(wins) + " " + Integer.toString(streak) + " " + Integer.toString(best);
				reader.close();
				
				FileWriter writer = new FileWriter(filename2);	//update stats by writing to file
				writer.write(stats);
				writer.close();
				
				Alert gameComplete = new Alert(Alert.AlertType.INFORMATION);	//show stats to user
				gameComplete.setHeaderText("Statistics:");
				gameComplete.setContentText("Games Played: " + games + "\nWin %: " + Math.round(((double)wins / games) * 100) + "\nCurrent Streak: " + streak + "\nMax Streak: " + bestStreak);
				gameComplete.showAndWait();
				
			} catch (FileNotFoundException except){
				System.out.println("File not found");
			} catch (IOException except2){
				System.out.println("Error occured");
			}
			
			for (int k = 0; k < 26; k++) {	//disable all keys
				button_array[k].setDisable(true);
			}
			enterButton.setDisable(true);
			backspaceButton.setDisable(true);
			saveButton.setDisable(true);
			loadButton.setDisable(true);
			return;
		} else if (guess_count == 5) { //checks if you lost (no more guesses available)
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setHeaderText("You Lost!");
			alert.setContentText("The word was: " + randomWord);
			alert.showAndWait();
			
			String stats = "";	//read and display stats on loss
			try {	
				File filename2 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\stats_tracker.txt");
				Scanner reader = new Scanner(filename2);
				while (reader.hasNextLine()) {
					stats = reader.nextLine();
				}
				String[] data = stats.split(" ");		//[Games, Wins, Streak,	Best]
				int games = Integer.parseInt(data[0]);
				int wins = Integer.parseInt(data[1]);
				int streak = Integer.parseInt(data[2]);
				int best = Integer.parseInt(data[3]);
				games++;
				//wins++;
				streak = 0;
				//best++;
//				if (best > bestStreak) {
//					bestStreak = best;
//				}
				stats = Integer.toString(games) + " " + Integer.toString(wins) + " " + Integer.toString(streak) + " " + Integer.toString(best);
				reader.close();
				
				FileWriter writer = new FileWriter(filename2);	//update stats by writing to file
				writer.write(stats);
				writer.close();
				
				Alert gameComplete = new Alert(Alert.AlertType.INFORMATION);	//show stats to user
				gameComplete.setHeaderText("Statistics:");
				gameComplete.setContentText("Games Played: " + games + "\nWin %: " + Math.round(((double)wins / games) * 100) + "\nCurrent Streak: " + streak + "\nMax Streak: " + bestStreak);
				gameComplete.showAndWait();
				
			} catch (FileNotFoundException except){
				System.out.println("File not found");
			} catch (IOException except2){
				System.out.println("Error occured");
			}
			
			for (int k = 0; k < 26; k++) {	//disable all keys
				button_array[k].setDisable(true);
			}
			enterButton.setDisable(true);
			backspaceButton.setDisable(true);
			saveButton.setDisable(true);
			loadButton.setDisable(true);
			return;
		}
		
		guess_count++;
		letter_count = 0;
		userGuess = "";
	}
	
	@FXML protected void resetClicked() {	//resetButton clicked
		Alert resetCon = new Alert(Alert.AlertType.CONFIRMATION);	//asks if user wants to or not
		resetCon.setHeaderText("Are you sure you want to start a new game?");
		resetCon.setContentText("Note: Stats are ongoing and will not be affected if you continue.");
		Optional<ButtonType> option = resetCon.showAndWait();
		if (option.isPresent() && option.get() == ButtonType.CANCEL) { //if cancel clicked, do nothing
			return;
		}
		
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		Button[] button_array = {qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton
								,aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton
								,zButton,xButton,cButton,vButton,bButton,nButton,mButton};
		
		for (int a = 0; a < 6; a++) {	//reset labels
			for (int b = 0; b < 5; b++) {
				label_array[a][b].setText("");
				label_array[a][b].setStyle("-fx-background-color: white");
				label_array[a][b].setStyle("-fx-border-color: black");
			}
		}
		for (int i = 0; i < 26; i++) {	//reset keyboard
			button_array[i].setStyle(null);
		}
		for (int k = 0; k < 26; k++) {	//enable all keys
			button_array[k].setDisable(false);
		}
		enterButton.setDisable(false);
		backspaceButton.setDisable(false);
		saveButton.setDisable(false);
		loadButton.setDisable(false);
		
		guess_count = 0;
		letter_count = 0;	//reset ALL in case reset w/out entering (or winning)?
		userGuess = "";
		
		try {	//get new random word
			File filename = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\wordle_words.txt");
			Scanner s = new Scanner(filename);
			ArrayList<String> valid_words = new ArrayList<String>();
			String current;
			while (s.hasNext()) {
				current = s.next();
				valid_words.add(current);
			}
		
			Random r = new Random();
			int number = r.nextInt(valid_words.size());
			randomWord = (String)valid_words.get(number).toUpperCase();
			System.out.println("Word is " + randomWord);
			s.close();
		} catch (FileNotFoundException except){
			System.out.println("File not found");
		}
	}
	
	private String savedBoard;	//save button clicked
	@FXML protected void saveClicked() {
		Alert saveCon = new Alert(Alert.AlertType.CONFIRMATION);	//asks if user wants to or not
		saveCon.setHeaderText("Save Current Game?");
		saveCon.setContentText("All current game data is saved and new game must be started. \nIf another game is already saved, it will be OVERWRITTEN."
									+ "\nClicking Load button will restore most recent saved game. \nOverall stats are not changed.");
		Optional<ButtonType> option = saveCon.showAndWait();
		if (option.isPresent() && option.get() == ButtonType.CANCEL) { //if cancel clicked, do nothing
			return;
		}
		
		
		letter_count = 0;	//reset so user can type in new guess with no error
		userGuess = "";
		
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		for (int i = 0; i < guess_count; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 && j == 0) {
					savedBoard = label_11.getText();
				} else {
					savedBoard += " " + label_array[i][j].getText();
				}
			}
		}
		Button[] button_array = {qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton
				,aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton
				,zButton,xButton,cButton,vButton,bButton,nButton,mButton};
		for (int a = 0; a < 6; a++) {	//reset labels
			for (int b = 0; b < 5; b++) {
				label_array[a][b].setText("");
				label_array[a][b].setStyle("-fx-background-color: white");
				label_array[a][b].setStyle("-fx-border-color: black");
			}
		}
		for (int i = 0; i < 26; i++) {	//reset keyboard
			button_array[i].setStyle(null);
		}
		
		try {	
		File filename3 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_game.txt");	//writes letters to corresponding file
		FileWriter writer = new FileWriter(filename3);
		writer.write(savedBoard);
		writer.close();
		
		File filename4 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_randomWord.txt");	//writes randomWord to corresponding file
		FileWriter wr = new FileWriter(filename4);
		wr.write(randomWord);
		wr.close();
		
		File filename5 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_guessCount.txt");	//writes guess_count to corresponding file
		FileWriter w = new FileWriter(filename5);
		w.write(Integer.toString(guess_count));
		w.close();
		
		} catch (IOException ex){
			System.out.println("Error occured");
		}
		
		for (int k = 0; k < 26; k++) {	//disable all keys
			button_array[k].setDisable(true);
		}
		enterButton.setDisable(true);
		backspaceButton.setDisable(true);
		saveButton.setDisable(true);
		loadButton.setDisable(false);	//enable load feature
		
		Alert gamesaved = new Alert(Alert.AlertType.INFORMATION);	//confirm game has been saved
		gamesaved.setHeaderText("Game Saved");
		gamesaved.showAndWait();
	}
	
	@FXML protected void loadClicked() {	//load button clicked
		Alert loadCon = new Alert(Alert.AlertType.CONFIRMATION);	//asks if user wants to or not
		loadCon.setHeaderText("Load Previous Game?");
		loadCon.setContentText("Latest previously saved game is loaded. \nThe current game will be OVERWRITTEN. \nOverall stats are not changed.");
		Optional<ButtonType> option = loadCon.showAndWait();
		if (option.isPresent() && option.get() == ButtonType.CANCEL) { //if cancel clicked, do nothing
			return;
		}
		loadButton.setDisable(true);
		
		String str = "";
		Label[][] label_array = {{label_11, label_12, label_13, label_14, label_15},
				 {label_21, label_22, label_23, label_24, label_25},
				 {label_31, label_32, label_33, label_34, label_35},
				 {label_41, label_42, label_43, label_44, label_45},
				 {label_51, label_52, label_53, label_54, label_55},
				 {label_61, label_62, label_63, label_64, label_65}};
		Button[] button_array = {qButton,wButton,eButton,rButton,tButton,yButton,uButton,iButton,oButton,pButton
				,aButton,sButton,dButton,fButton,gButton,hButton,jButton,kButton,lButton
				,zButton,xButton,cButton,vButton,bButton,nButton,mButton};
		
		try {
			File filename3 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_game.txt");	//grabs saved board
			Scanner reader = new Scanner(filename3);
			while (reader.hasNextLine()) {
				str = reader.nextLine();
			}
			reader.close();
			
			File filename4 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_randomWord.txt");	//grabs old randomWord
			Scanner read = new Scanner(filename4);
			while (read.hasNextLine()) {
				randomWord = read.nextLine();
			}
			read.close();
			
			File filename5 = new File("C:\\Users\\perio\\eclipse-workspace\\Wordle\\src\\application\\saved_guessCount.txt");	//grabs old guess_count
			Scanner r = new Scanner(filename5);
			while (r.hasNextLine()) {
				guess_count = Integer.parseInt(r.nextLine());
			}
			r.close();
		} catch (IOException except2){
			System.out.println("Error occured");
		}
		
		String[] readBoard = str.split(" ");
		int number = 0;
		for (int i = 0; i < guess_count; i++) {		//re-update game board
			
			for (int j = 0; j < 5; j++) {	//change label colors/text
				String letter = readBoard[number];
				label_array[i][j].setText(letter);
				if (letter.equals(randomWord.substring(j, j + 1))) {
					label_array[i][j].setStyle("-fx-background-color: #6CA965");	//green
					for (int k = 0; k < 26; k++) {	//change keyboard color
						if (letter.equals(button_array[k].getText())) {
							button_array[k].setStyle("-fx-background-color: #6CA965");
							break;
						}
					}
				} else if (randomWord.indexOf(letter) > -1) {
					label_array[i][j].setStyle("-fx-background-color: #C8B653");	//yellow
					for (int k = 0; k < 26; k++) {	//change keyboard color
						if (letter.equals(button_array[k].getText())) {
							if (button_array[k].getStyle().contains("-fx-background-color: #6CA965")) { //so green isn't overwritten
								break;
							}
							button_array[k].setStyle("-fx-background-color: #C8B653");
							break;
						}
					}
				} else {
					label_array[i][j].setStyle("-fx-background-color: #787C7F");	//gray
					for (int k = 0; k < 26; k++) {	//change keyboard color
						if (letter.equals(button_array[k].getText())) {
							button_array[k].setStyle("-fx-background-color: #787C7F");
							break;
						}
					}
				}
				number++;	//increments to next letter in array
			}
		}
		
		for (int k = 0; k < 26; k++) {	//enable all keys
			button_array[k].setDisable(false);
		}
		enterButton.setDisable(false);
		backspaceButton.setDisable(false);
		saveButton.setDisable(false);
	}
}
