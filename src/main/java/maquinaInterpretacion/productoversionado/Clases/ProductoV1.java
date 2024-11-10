package maquinaInterpretacion.productoversionado.Clases;

public class ProductoV1 {
    private String nombre = "UPS";
    private String descripcion = "UPS (Fuente de alimentación ininterrumpida): " +
            "Dispositivo que garantiza el suministro de energía eléctrica constante y respaldo " +
            "temporal en caso de cortes de corriente, protegiendo equipos electrónicos contra sobrecargas, " +
            "picos de voltaje y apagones inesperados.";
    private double precio = 49.99;

    // Getters
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
}
