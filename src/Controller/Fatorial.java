package Controller;

public class Fatorial {

    public Fatorial () {
        super();

    }

    public int fFatorial (int n) {

        if (n > 12) {

            System.out.println("Valor excedeu o limite");

            return 0;
        }

        if ( n < 1) {

            return 1;
        }

        return n * fFatorial(n - 1);
    }


}
