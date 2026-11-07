package io.github.KiritoGrandePL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



    @FXML
    private ChoiceBox<String> hitLeftChoiceBox;
    @FXML
    private ChoiceBox<String> hitMiddleChoiceBox;
    @FXML
    private ChoiceBox<String> hitRightChoiceBox;
    @FXML
    private Rectangle hitLeftDisplayBox;
    @FXML
    private Rectangle hitMiddleDisplayBox;
    @FXML
    private Rectangle hitRightDisplayBox;
    @FXML
    private Label hitLeftDisplayLabel;
    @FXML
    private Label hitMiddleDisplayLabel;
    @FXML
    private Label hitRightDisplayLabel;

    private String[] anvilActions = {"NONE","-3","-6","-9","-15","+2","+7","+13","+16"}; // possible anvil selections

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        hitLeftChoiceBox.getItems().addAll(anvilActions); //anvil actions selection
        hitLeftChoiceBox.setOnAction(event ->{ //change left rectangle square based on number selection
            hitLeftColorDisplay(event);
            hitLeftLabelDisplay(event);
        });

        hitMiddleChoiceBox.getItems().addAll(anvilActions);
        hitMiddleChoiceBox.setOnAction(event ->{ //change middle rectangle square based on number selection
            hitMiddleColorDisplay(event);
            hitMiddleLabelDisplay(event);
        });

        hitRightChoiceBox.getItems().addAll(anvilActions);
        hitRightChoiceBox.setOnAction(event ->{ //change right rectangle square based on number selection
            hitRightColorDisplay(event);
            hitRightLabelDisplay(event);
        });

    }
    public void hitLeftColorDisplay(ActionEvent event) { //setting left rectangle color based on number selection
        String hitLeftSelect = hitLeftChoiceBox.getValue();
        hitLeftDisplayBox.setFill(ColorValues.getValueFxColor(hitLeftSelect));

    }
    public void hitLeftLabelDisplay(ActionEvent event) { //sets left display label based on number selected
        String hitLeftSelect = hitLeftChoiceBox.getValue();
        hitLeftDisplayLabel.setText(Filter.choiceBoxFilter(hitLeftSelect));
    }
    public void hitMiddleColorDisplay(ActionEvent event) { //setting middle rectangle color based on number selection
        String hitMiddleSelect = hitMiddleChoiceBox.getValue();
        hitMiddleDisplayBox.setFill(ColorValues.getValueFxColor(hitMiddleSelect));

    }
    public void hitMiddleLabelDisplay(ActionEvent event) {
        String hitMiddleSelect = hitMiddleChoiceBox.getValue();
        hitMiddleDisplayLabel.setText(Filter.choiceBoxFilter(hitMiddleSelect));
    }

    public void hitRightColorDisplay(ActionEvent event) { //setting right rectangle color based on number selection
        String hitRightSelect = hitRightChoiceBox.getValue();
        hitRightDisplayBox.setFill(ColorValues.getValueFxColor(hitRightSelect));

    }
    public void hitRightLabelDisplay(ActionEvent event) {
        String hitRightSelect = hitRightChoiceBox.getValue();
        hitRightDisplayLabel.setText(Filter.choiceBoxFilter(hitRightSelect));
    }

}