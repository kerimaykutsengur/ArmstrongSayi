import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue = 0;
        int result = 0;
        int basPow;

        if (number >= 0 && number <= 999){
            while (tempNumber != 0){
                tempNumber /=10;
                basNumber++;
            }
            tempNumber = number;
            while (tempNumber != 0){
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i =1;i <= basNumber; i++){
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /=10;
            }
            if (result == number){
                System.out.print(number + " sayısı bir Armstrong sayısıdır.");
            }else {
                System.out.print(number + " sayısı bir Armstrong sayısı değildir.");
            }
        } else {
            System.out.print("Lütfen 3 basamaklı bir sayı giriniz!");
        }

    }
}
