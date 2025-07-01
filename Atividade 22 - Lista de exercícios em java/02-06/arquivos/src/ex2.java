public class ex2 {

    public static void main(String[] args) {

        int[] primeirosNumeros = {8, 9, 7};

        int somaPrimeirosNumeros = 0;

        for (int i = 0; i < primeirosNumeros.length; i++) {
            somaPrimeirosNumeros += primeirosNumeros[i];
        }

        int mediaPrimeirosNumeros = somaPrimeirosNumeros / 3;

        System.out.println(mediaPrimeirosNumeros);


        int[] segundosNumeros = {4, 5, 7};

        int somaSegundosNumeros = 0;

        for (int i = 0; i < segundosNumeros.length; i++) {
            somaSegundosNumeros += segundosNumeros[i];
        }

        int mediaSegundosNumeros = somaSegundosNumeros / 3;

        System.out.println(mediaSegundosNumeros);





    }

}
