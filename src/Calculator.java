public class Calculator {
    public double getDoubletValue(double a, double b, double c) {
        try {
            double d = b * b - 4 * a * c;
            if (a == 0) {
                System.out.println("To nie jest rownanie kwadratowe!");
            } else if (d > 0) {
                double pd = Math.sqrt(d);
                double x1 = (-b - pd) / 2 / a;
                double x2 = (-b + pd) / 2 / a;
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else if (d == 0) {
                System.out.println("x1 = x2 = " + (-b / 2 / a));
            } else if (d < 0) {
                System.out.println("Brak rozwiazan rzeczywistych!");
            }
        } catch (Exception e) {
            System.out.println("Blednie podane wspolczynniki");
        }
        return 0;
    }
}
