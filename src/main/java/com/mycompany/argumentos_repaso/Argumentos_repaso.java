package com.mycompany.argumentos_repaso;
import java.util.Scanner;

//CREA UN PROGRAMA QUE POR ARGUMENTOS DE CONSOLA MUESTRE LAS SIGUIENTES OPCIONES:
// -L MUESTRE "LINUX"
// -W MUESTRE "WINDOWS"
// -M MUESTRE "MAC"

// PASAREMOS UN SEGUNDO ARGUMENTO QUE INDICARÁ CUANTAS VECES DEBE MOSTRAR LA PALABRA CORRESPONDIENTE.
public class Argumentos_repaso {

    public static void main(String[] args) {
        
        String opcion = args[0];
        int num;
        num=Integer.parseInt(args[1]);
        
        switch (opcion){
            case "-L":{
                for(int i=0;i<=num;i++){
                System.out.println("Linux");
                }
                break;
            }
            case "-W":{
                for(int i=0;i<=num;i++){
                System.out.println("Windows");
                }
                break;
            }
            case "-M":{
                for(int i=0;i<=num;i++){
                System.out.println("MAC");
                }
                break;
            }
        }
            
    }
}
