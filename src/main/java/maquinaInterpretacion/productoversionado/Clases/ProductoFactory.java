package maquinaInterpretacion.productoversionado.Clases;

public class ProductoFactory {
    public static Object crearProducto(String version) {
        switch (version) {
            case "v1":
                return new ProductoV1();
            case "v2":
                return new ProductoV2();
            case "v3":
                return new ProductoV3();
            default:
                throw new IllegalArgumentException("Versión no soportada: " + version);
        }
    }
}
