import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their birth year
        System.out.println("Doğum Yılınızı Giriniz : ");

        int birthYear = scanner.nextInt();


        // Chinese Zodiac Calculation
        String ChineseZodiac = switch (birthYear % 12){
            case 0 ->"Maymun";
            case 1 ->"Horoz";
            case 2 ->"Köpek";
            case 3 ->"Domuz";
            case 4 ->"Fare";
            case 5 ->"Öküz";
            case 6 ->"Kaplan";
            case 7 ->"Tavşan";
            case 8 ->"Ejderha";
            case 9 ->"Yılan";
            case 10 ->" At";
            case 11 ->"Koyun";
            default -> "Hatalı Giriş";
        };

        // Print out the user's Chinese zodiac sign
        System.out.println("Çin Zodyağı Burcunuz : " + ChineseZodiac);

        scanner.close();
    }
    }

