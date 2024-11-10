package maquinaInterpretacion.productoversionado.Clases;

public class ProductoV3 {
    private String nombre = "UPS";
    private String descripcion = "UPS (Fuente de alimentación ininterrumpida): " +
            "Dispositivo que garantiza el suministro de energía eléctrica constante y respaldo " +
            "temporal en caso de cortes de corriente, protegiendo equipos electrónicos contra sobrecargas, " +
            "picos de voltaje y apagones inesperados.";
    private String categoria = "Equipos de Energía";
    private double descuento = 0.5;
    private double precioFinal = 24.99;

    // Getters
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }
    public double getDescuento() { return descuento; }
    public double getPrecioFinal() { return precioFinal; }
}
