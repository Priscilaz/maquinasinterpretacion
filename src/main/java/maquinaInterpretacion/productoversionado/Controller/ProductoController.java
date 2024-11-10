package maquinaInterpretacion.productoversionado.Controller;

import maquinaInterpretacion.productoversionado.Clases.ProductoV1;
import maquinaInterpretacion.productoversionado.Clases.ProductoV2;
import maquinaInterpretacion.productoversionado.Clases.ProductoV3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping("/v1")
    public ProductoV1 obtenerProductoV1() {
        return new ProductoV1();
    }

    @GetMapping("/v2")
    public ProductoV2 obtenerProductoV2() {
        return new ProductoV2();
    }

    @GetMapping("/v3")
    public ProductoV3 obtenerProductoV3() {
        return new ProductoV3();
    }
}

