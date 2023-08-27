package edu.joas.metodos;

public class SmartTv {
    // Atributos
    boolean ligado=true;
    int canal=1;
    int volume=25;

    // Métodos
    public void ligar(){
        if (!ligado){
            ligado = true;
        }
    }

    public void desligar(){
        if (ligado){
            ligado = false;
        }
    }

    public void aumentarVolume(){
        if (volume + 1 < 100){
            volume++;
        }
    }

    public void diminuirVolume(){
        if (volume - 1 > 0){
            volume--;
        }
    }

    public void mudarCanal(){
        canal++;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
