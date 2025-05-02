package Ejercicio;

class ShippingOrder {
    private final Paquete paquete;
    private final String direccionEnvio;
    private final String nombreDestinatario;
    private final boolean seguroAdicional;
    private final boolean envioExpreas;

    private ShippingOrder(ShippingOrderConstructor builder) {
        this.paquete = builder.paquete;
        this.direccionEnvio = builder.direccionEnvio;
        this.nombreDestinatario = builder.nombreDestinatario;
        this.seguroAdicional = builder.seguroAdicional;
        this.envioExpreas = builder.envioExpreas;
    }

    @Override
    public String toString() {
        return " \n" +
                "Detalles:\n" +
                "Paquete Peso: " + (paquete != null ? paquete.getWeight() : "N/A") + "\n" +
                "Paquete Costo: " + (paquete != null ? paquete.getCost() : "N/A") + "\n" +
                "Direccion Envio: " + direccionEnvio + "\n" +
                "Nombre Destinatario: " + nombreDestinatario + "\n" +
                "Seguro Adicional: " + (seguroAdicional ? "Sí" : "No") + "\n" +
                "Envio Exprés: " + (envioExpreas ? "Sí" : "No");
    }

    public static class ShippingOrderConstructor {
        private Paquete paquete;
        private String direccionEnvio;
        private String nombreDestinatario;
        private boolean seguroAdicional;
        private boolean envioExpreas;

        public ShippingOrderConstructor(Paquete paquete) {
            this.paquete = paquete;
        }

        public ShippingOrderConstructor(String direccionEnvio, String nombreDestinatario, boolean seguroAdicional, boolean envioExpreas) {
            this.direccionEnvio = direccionEnvio;
            this.nombreDestinatario = nombreDestinatario;
            this.seguroAdicional = seguroAdicional;
            this.envioExpreas = envioExpreas;
        }

        public ShippingOrderConstructor(Paquete paquete, String direccionEnvio, String nombreDestinatario) {
            this.paquete = paquete;
            this.direccionEnvio = direccionEnvio;
            this.nombreDestinatario = nombreDestinatario;
        }

        public ShippingOrderConstructor conDireccionEnvio(String direccionEnvio) {
            this.direccionEnvio = direccionEnvio;
            return this;
        }

        public ShippingOrderConstructor conNombreDestinatario(String nombreDestinatario) {
            this.nombreDestinatario = nombreDestinatario;
            return this;
        }

        public ShippingOrderConstructor conSeguroAdicional(boolean seguroAdicional) {
            this.seguroAdicional = seguroAdicional;
            return this;
        }

        public ShippingOrderConstructor conEnvioExpreas(boolean envioExpreas) {
            this.envioExpreas = envioExpreas;
            return this;
        }

        public ShippingOrder builder() {
            return new ShippingOrder(this);
        }
    }
}
