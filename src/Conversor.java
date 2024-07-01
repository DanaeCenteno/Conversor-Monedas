

public class Conversor {

    public static void convertirMonedas(String base, String cambio, ConsultaConversor tipoConsulta, String cantidadMonedas){
        double cantidad;
        double conversorM;

        Monedas monedas = tipoConsulta.monedaEncontrada(base, cambio);
        try {
            cantidad = Double.parseDouble(cantidadMonedas);
            conversorM = cantidad * monedas.conversion_rates().get(cambio);
            System.out.println(conversorM);
            System.out.println("El valor " + cantidad + " " + base + " " + "corresponde al valor final de -> " + conversorM + " " + cambio );
        }catch (NumberFormatException e){
            System.out.println("Cantidad erronea. Intenta de nuevo");
        }
    }


}
