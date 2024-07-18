package com.mycompany;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;


public class MaquinaCoxinha extends Estoque{
    public int quant;
    
    @FXML
    private TextField campoQuantCoxinha;
    @FXML
    private TextField campoSaida;
    @FXML
    private TextField campoQuantVenda;
    
    @FXML
    private void Abastecer(){
        quant = Integer.parseInt(campoQuantCoxinha.getText());
        abastecer(quant);
        campoSaida.setText(String.valueOf(getCoxinha()));
        campoQuantCoxinha.setText("");
    }
    
    @FXML
    private void ComprarUnid(){
        if(getCoxinha() > 0){
        venderCoxinha();
        quant = getCoxinha();
        campoSaida.setText(String.valueOf(quant));
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para vender");
            alert.show();
        }
    }
    
    @FXML
    private void Comprar(){
        if(getCoxinha() >= Integer.parseInt(campoQuantVenda.getText())){
        quant = Integer.parseInt(campoQuantVenda.getText());
        venderCoxinha(quant);
        quant = getCoxinha();
        campoSaida.setText(String.valueOf(quant));
        campoQuantVenda.setText("");
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para vender");
            alert.show();
        }
    }
    
}