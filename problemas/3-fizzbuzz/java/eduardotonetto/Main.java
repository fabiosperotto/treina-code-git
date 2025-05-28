import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a entrada:");
        int x = Integer.parseInt(input.nextLine());

        for (int i=1; i <= x; i++){

        if(i%3 == 0){
            if(i%5 == 0){System.out.println("fizzbuzz");}
            else{System.out.println("fizz");}
        }
        else{
        if(i%5 == 0){System.out.println("buzz");}
        else{System.out.println(i);}
        }
        }




    }
}