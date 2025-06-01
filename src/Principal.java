import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        while (true){
            System.out.println("\nEscriba el nombre de la moneda base o escriba salir para cerrar el programa");
            var monedaBase = lectura.nextLine().toUpperCase();
            if (monedaBase.equalsIgnoreCase("salir")){
                System.out.println("Gracias por usar el conversor de monedas");
                break;
            }
            Moneda moneda = consulta.buscarMoneda(monedaBase);

            System.out.println("Escriba el nombre de la moneda objetivo");
            String monedaObjetivo = lectura.nextLine().toUpperCase();

            System.out.println("Escriba el monto que quiere convertir: ");
            var monto = Double.valueOf(lectura.nextLine());

            if (moneda.conversion_rates().containsKey(monedaObjetivo)){
                double valorUnitario = moneda.conversion_rates().get(monedaObjetivo);
                double valorConvertido = valorUnitario * monto;
                System.out.println("El valor de " + monto + " " + monedaBase +
                        " corresponde al valor final de ===> " +
                        String.format("%.2f", valorConvertido) + " " + monedaObjetivo);

            }else {
                System.out.println("La moneda '" + monedaObjetivo + "'no esta disponible en los datos.");
            }
        }










//        if (moneda.conversion_rates().containsKey(monedaObjetivo)){
//            double valor = moneda.conversion_rates().get(monedaObjetivo);
//            System.out.println(monedaBase + " --> " + monedaObjetivo + " = " + valor );
//        }else {
//            System.out.println("La moneda '" + monedaObjetivo + "'no esta disponible en los datos.");
//        }

    }



}
