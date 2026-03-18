public class Cafe {

    // Atributos privados
    private String nombre;
    private String tamano;
    private double precio;

    // Constructor
    public Cafe(String nombre, String tamaño, double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.nombre = nombre;
        this.tamano = tamaño;
        this.precio = precio;
    }

    // Mostrar ticket
    public void mostrarTicket() {
        System.out.println("----- TICKET DE CAFE -----");
        System.out.printf("Nombre : ", nombre);
        System.out.printf("Tamaño : ", tamano);
        System.out.printf("Precio : ", precio);
        System.out.println("--------------------------");
    }

}
