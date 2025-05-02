package Ejercicio;

public abstract class Paquete implements Cloneable {
    private double peso;
    private double costo;

    protected Paquete(double peso, double costo) {
        this.peso = peso;
        this.costo = costo;
    }

    public double getWeight() {
        return peso;
    }

    public double getCost() {
        return costo;
    }

    @Override
    public Paquete clone() {
        try {
            return (Paquete) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class PaqueteChico extends Paquete {
    public PaqueteChico() {
        super(5.0, 10.0);
    }

    @Override
    public PaqueteChico clone() {
        return (PaqueteChico) super.clone();
    }
}

class PaqueteMedio extends Paquete {
    public PaqueteMedio() {
        super(10.0, 20.0);
    }

    @Override
    public PaqueteMedio clone() {
        return (PaqueteMedio) super.clone();
    }
}

class PaqueteGrande extends Paquete {
    public PaqueteGrande() {
        super(20.0, 40.0);
    }

    @Override
    public PaqueteGrande clone() {
        return (PaqueteGrande) super.clone();
    }
}

class PackageFactory {
    public static Paquete crearPaquete(String tipo) {
        switch (tipo.toUpperCase()) {
            case "PEQUE":
                return new PaqueteChico();
            case "MEDIANO":
                return new PaqueteMedio();
            case "JUMBO":
                return new PaqueteGrande();
            default:
                throw new IllegalArgumentException("Invalido: " + tipo);
        }
    }
}
