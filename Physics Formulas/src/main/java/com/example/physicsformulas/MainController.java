package com.example.physicsformulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController
{
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    public void switchToMainScene(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Main.class.getResource("Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.setTitle("Physics Formulas");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToPowerLawScene(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Main.class.getResource("PowerLaw.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.setTitle("Power Law");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToOHMsLawScene(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Main.class.getResource("OHMsLaw.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.setTitle("OHM's Law");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TextField txtCurrent1, txtCurrent2, txtCurrent3;
    @FXML
    private TextField txtVoltage1, txtVoltage2, txtVoltage3;
    @FXML
    private TextField txtResistance1, txtResistance2, txtResistance3;
    @FXML
    private TextField txtPower1, txtPower2, txtPower3;
    @FXML
    private double Power1, Power2, Power3, Current1, Current2, Current3, Voltage1, Voltage2, Voltage3
            , Resistance1, Resistance2, Resistance3;
    @FXML
    public void btnCalculatePowerLaw()
    {
        // FOR POWER
        try{
            Current1 = Double.parseDouble(txtCurrent1.getText());
            Voltage1 = Double.parseDouble(txtVoltage1.getText());
            Power1 = Current1 * Voltage1;
            txtPower1.setText(Double.toString(Power1));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }

        // FOR VOLTAGE
        try{
            Current2 = Double.parseDouble(txtCurrent2.getText());
            Power2 = Double.parseDouble(txtPower2.getText());
            Voltage2 = Power2 / Current2;
            txtVoltage2.setText(Double.toString(Voltage2));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }
        // FOR CURRENT
        try{
            Voltage3 = Double.parseDouble(txtVoltage3.getText());
            Power3 = Double.parseDouble(txtPower3.getText());
            Current3 = Power3 / Voltage3;
            txtCurrent3.setText(Double.toString(Current3));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }
    }

    public void btnCalculateOHMsLaw()
    {
        // FOR VOLTAGE
        try{
            Current1 = Double.parseDouble(txtCurrent1.getText());
            Resistance1 = Double.parseDouble(txtResistance1.getText());
            Voltage1 = Current1 * Resistance1;
            txtVoltage1.setText(Double.toString(Voltage1));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }

        // FOR CURRENT
        try{
            Voltage2 = Double.parseDouble(txtVoltage2.getText());
            Resistance2 = Double.parseDouble(txtResistance2.getText());
            Current2 = Voltage2 / Resistance2;
            txtCurrent2.setText(Double.toString(Current2));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }
        // FOR CURRENT
        try{
            Voltage3 = Double.parseDouble(txtVoltage3.getText());
            Current3 = Double.parseDouble(txtCurrent3.getText());
            Resistance3 = Voltage3 / Current3;
            txtResistance3.setText(Double.toString(Resistance3));
        }
        catch (NumberFormatException e)
        {
            System.out.println("\n" + e + " Error\nNo input was given!!!");
        }
    }
}

