import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int money = in.nextInt();
        int price = in.nextInt();
        int wrap = in.nextInt();
        int count = 0;

        while (money != 0){
            if (money - price < 0){
                break;
            }
            money -= price;
            if (count % wrap == 0){
                count++;
            }
            count++;
        }
        System.out.println(count);
    }
}