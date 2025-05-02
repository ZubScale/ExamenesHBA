package Ejercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("QuickShip");

        Paquete chico = PackageFactory.crearPaquete("Peque");
        Paquete mediano = PackageFactory.crearPaquete("Mediano");
        Paquete grande = PackageFactory.crearPaquete("Jumbo");
        Paquete chico1 = chico.clone();
        Paquete grande2 = grande.clone();

        ShippingOrder order1 = new ShippingOrder.ShippingOrderConstructor(chico)
                .conDireccionEnvio("Gladiolas 566")
                .conNombreDestinatario("Hugo")
                .conSeguroAdicional(true)
                .conEnvioExpreas(true)
                .builder();
        System.out.println("Orden 1 creada " + order1);

        ShippingOrder order2 = new ShippingOrder.ShippingOrderConstructor(mediano)
                .conDireccionEnvio("Uxmal 7123")
                .conNombreDestinatario("Carlos")
                .conSeguroAdicional(false)
                .conEnvioExpreas(false)
                .builder();
        System.out.println("Orden 2 creada " + order2);

        ShippingOrder order3 = new ShippingOrder.ShippingOrderConstructor(grande)
                .conDireccionEnvio("Panama 1")
                .conNombreDestinatario("Aratza")
                .builder();
        System.out.println("Orden 3 creada " + order3);

        ShippingOrder order4 = new ShippingOrder.ShippingOrderConstructor(chico1)
                .conDireccionEnvio("  Viva 742")
                .conNombreDestinatario("Luis")
                .conSeguroAdicional(true)
                .builder();
        System.out.println("Orden 4 creada " + order4);

        ShippingOrder order5 = new ShippingOrder.ShippingOrderConstructor(grande2)
                .conDireccionEnvio("Calle Luna 4563")
                .conNombreDestinatario("Tim")
                .conSeguroAdicional(false)
                .builder();
        System.out.println("Orden 5 creada " + order5);

        ShippingOrder order6 = new ShippingOrder.ShippingOrderConstructor(chico.clone())
                .conDireccionEnvio("Benito jUAREZ 90")
                .conNombreDestinatario("Mario")
                .conEnvioExpreas(true)
                .builder();
        System.out.println("Orden 6 creada a partir del clon " + order6);

        ShippingOrder order7 = new ShippingOrder.ShippingOrderConstructor(grande.clone())
                .conDireccionEnvio("Paseo del Sol 321111")
                .conNombreDestinatario("Juan")
                .conSeguroAdicional(true)
                .builder();
        System.out.println("Orden 7 creada a partir del clon " + order7);
    }
}

