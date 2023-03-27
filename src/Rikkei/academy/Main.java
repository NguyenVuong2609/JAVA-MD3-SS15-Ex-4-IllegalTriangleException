package Rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        try {
            System.out.println("Nhập cạnh a: ");
            float a = Float.parseFloat(sc.nextLine());
            System.out.println("Nhập cạnh b: ");
            float b = Float.parseFloat(sc.nextLine());
            System.out.println("Nhập cạnh c: ");
            float c = Float.parseFloat(sc.nextLine());
            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Sai, Không đúng định dạng.");
        }
    }
}
