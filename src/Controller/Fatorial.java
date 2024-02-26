package Controller;

public class Fatorial {

    public Fatorial () {
        super();

    }

    public int fFatorial (int n) {

        // Condição de parada: valor inicial ser maior do que 12
        if (n > 12) {

            System.out.println("Valor excedeu o limite");

            return 0;
        }

        // Condição de parada: valor ser menor do que 1
        if ( n < 1) {

            return 1;
        }

        // Chamar a função até n ser menor do que 1
        return n * fFatorial(n - 1);
    }


}
