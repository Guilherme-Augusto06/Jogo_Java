import java.util.Random;

public class Random_A {

    private int randonNUmber;

    public Random_A() {

    }

    public int valor_aleatorio() {
        Random Num_aleatorio = new Random();

        int randonNumber = Num_aleatorio.nextInt(101);
        return  randonNumber;
    }
}
