package Rikkei.academy;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(float a, float b, float c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
