package esercizio1;

import java.util.Scanner;

public class Esercizio1 {

    Scanner sc = new Scanner(System.in);

    public void istanziaArray(){
        int [] casualArray = new int [5];
        boolean permesso = true;

        for(int i = 0; i<casualArray.length; i++){
            casualArray[i] = (int) ((Math.random() * 10) +1);
            System.out.println(casualArray[i]);
        }

        while(permesso == true){
            System.out.println("In che posizione vuoi inserire il numero?");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 0){
                permesso = false;
            }else {
                System.out.println("Digita il numero che vuoi inserire");
                int number = sc.nextInt();
                sc.nextLine();

                try{
                    casualArray[choice -1] = number;
                } catch(IndexOutOfBoundsException e){
                    System.out.println("posizione inesistente");
                }

                for(int i = 0; i<casualArray.length; i++){
                    System.out.println(casualArray[i]);
                }
            }





        }

    }
}
