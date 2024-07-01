import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaConversor conversor = new ConsultaConversor();
        String cantidadM;

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n***************** CONVERSOR MONEDAS ***************\n" +
                    "1. Dolar -> Peso Argentino\n" +
                    "2. Peso Argentino -> Dolar\n" +
                    "3. Dolar -> Real Brasileño\n" +
                    "4. Real Brasileño -> Dolar\n" +
                    "5. Dolar -> Peso Colombiano\n" +
                    "6. Peso Colombiano -> Dolar\n" +
                    "0. Salir\n\n" +

                    "Eliga el tipo de cambio:");

            opcion = teclado.nextInt();
            teclado.nextLine();

            try {

                switch (opcion){
                    case 1:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Dolar  --> Peso Argentino");
                        Conversor.convertirMonedas("USD", "ARS", conversor,cantidadM );
                        break;
                    case 2:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Peso Argentino -> Dolar");
                        Conversor.convertirMonedas("ARS","USD", conversor,cantidadM);
                        break;
                    case 3:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Dolar -> Real Brasileño");
                        Conversor.convertirMonedas("USD","BRL",conversor,cantidadM);
                        break;
                    case 4:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Real Brasileño -> Dolar");
                        Conversor.convertirMonedas("BRL","USD",conversor,cantidadM);
                        break;
                    case 5:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Dolar -> Peso Colombiano");
                        Conversor.convertirMonedas("USD","COP",conversor,cantidadM);

                        break;
                    case 6:
                        System.out.print("Inserta la cantidad a convertir: \n$");
                        cantidadM = teclado.nextLine();
                        System.out.println("Peso Colombiano -> Dolar");
                        Conversor.convertirMonedas("COP","USD",conversor,cantidadM);
                        break;


                    case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opcion invalida. Intentalo de nuevo.\n");

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
