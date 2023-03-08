public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1: ");
        int numberIs = 0;
        if (numberIs > 0) {
            System.out.println("The number is negative");
        } else if (numberIs < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is equal to 0");
        }

        System.out.println("Exercise 2: ");
        int numberWhile = 0;
        while (numberWhile < 3) {
            numberWhile++;
            System.out.println("Number " + numberWhile);
        }

        System.out.println("Exercise 3: ");
        int numberDoWhile = 1;
        do {
            System.out.println(numberDoWhile);
            numberDoWhile++;
        } while (numberDoWhile <= 1);

        System.out.println("Exercise 4: ");
        for (int numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println("Number " + numeroFor);
        }

        System.out.println("Exercise 5: ");
        var estacion = "LUNES";
        switch (estacion) {
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("No hay estacion");
        }

    }
}