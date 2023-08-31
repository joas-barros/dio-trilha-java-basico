package edu.joas.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv samsung = new SmartTv();

        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.diminuirVolume();
        
        System.out.println("A TV está ligada? " + samsung.ligado);
        System.out.println("Canal atual: " + samsung.canal);
        System.out.println("Volume atual: " + samsung.volume);

        samsung.ligar();
        System.out.println("Novo status -> A TV está ligada? " + samsung.ligado);

        samsung.desligar();
        System.out.println("Novo status -> A TV está ligada? " + samsung.ligado);

        samsung.desligar();
        System.out.println("Novo status -> A TV está ligada? " + samsung.ligado);

        samsung.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + samsung.volume);

        samsung.diminuirVolume();
        System.out.println("Novo status -> Volume atual: " + samsung.volume);

        samsung.mudarCanal(50);
        samsung.mudarCanal();
        samsung.mudarCanal();
        samsung.mudarCanal();
        samsung.mudarCanal();
        samsung.mudarCanal();

        System.out.println("Novo canal: " + samsung.canal);
    }
}
