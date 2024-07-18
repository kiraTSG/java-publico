package com.mycompany;

public class Estoque {
    private int coxinha;
    
    public Estoque(){
        coxinha = 0;
    }
    public void setCoxinha(int coxinha){
        this.coxinha = coxinha;
    }
    public int getCoxinha(){
        return coxinha;
    }
    public void abastecer (int coxinha){
        this.coxinha = this.coxinha + coxinha;
    }
    public void venderCoxinha (){
        if(coxinha > 0){
        coxinha--;
        }
    }
    public void venderCoxinha (int quant){
        if(coxinha >= quant){
            coxinha = coxinha - quant; 
        }
    }
    
}