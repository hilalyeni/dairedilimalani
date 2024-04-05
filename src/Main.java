import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını girin: ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Girin: ");
        a = input.nextInt();
        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire Diliminin Alanı: " + alan);

    }
}