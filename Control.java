import java.util.*;
public class Control {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Control cont = new Control();
        cont.numeroIf();
        cont.whiles();
        cont.switchc();



    }

    public void numeroIf(){
        int numeroif = scan.nextInt();

        if(numeroif < 0){
            System.out.println("El numero es positivo");

        }
        else if (numeroif > 0){
            System.out.println("El numero es positivo");
        }

        else{
            System.out.println("Es numero es 0");
        }
    }

    public void whiles (){

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println("numero es: "+ (numeroWhile+1));
            numeroWhile+=1;
        }
        numeroWhile = 0;
        do{
            System.out.println("El numero es, dentro de Do: " + (numeroWhile+1));
            numeroWhile+=1;

        }while(numeroWhile<=0);

        for(int numeroFor =0; numeroFor<=3; numeroFor++){
            System.out.println("El numero dentro del for: " + numeroFor);
        }
    }

    public void switchc(){
        int estacion = scan.nextInt();

        switch (estacion) {
            case 1 -> {
                System.out.println("verano");
            }
            case 2 -> {
                System.out.println("Otoño");
            }
            case 3 -> {
                System.out.println("Primavera");
            }
            case 4 -> {
                System.out.println("Invierno");
            }
            default -> System.out.println("No es una estacion");
        }
    }
}
