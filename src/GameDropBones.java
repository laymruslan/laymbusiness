import java.util.Random;
import java.util.Scanner;

public class GameDropBones {
    public static void main(String[] args) {
        Random Chislo = new Random ();
        int kakoeChislo = Chislo.nextInt (100);
        int kolichestvoPopitok = 0;
        Scanner input = new Scanner(System.in);
        int ugaday;
        boolean win = false;
        System.out.println( "Угадай число от 1 до 100");

        while (win == false) {
            System.out.println( );
            ugaday = input.nextInt();
            kolichestvoPopitok++;

        if (ugaday == kakoeChislo) {
            win = true; }

        else if ( ugaday < kakoeChislo) {
            System.out.println("Я сам в шоке, но загаданное число больше брат\n");
        }
            else if (ugaday > kakoeChislo) {
            System.out.println("Не ожидал от тебя такого, загаданное число меньше брат");
        }
        }

        System.out.println("\nДа, ты угадал");
        System.out.println("Число было: " + kakoeChislo);
        System.out.println("Количество попыток: " + kolichestvoPopitok);
    }
}
