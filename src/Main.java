import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = (int) 1.87;
        int weight = 98;
        int Bmi = service.calculate(1.87,98);


        System.out.println("Индекс массы тела:");
        System.out.println(service.calculate(1.80,80));

        System.out.println("Индекс массы тела:");
        System.out.println(service.calculate(2.10,120));
    }
}
