package ss1.bai_tap;

import java.util.Scanner;

public class UngDungChuyDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nha tien USD");
        usd = sc.nextByte();
        double quyDoi = usd * vnd;
        System.out.print("Gia tri VND:" + quyDoi);
    }
}
