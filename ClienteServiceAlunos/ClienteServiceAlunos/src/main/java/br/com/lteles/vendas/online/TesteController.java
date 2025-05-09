package br.com.lteles.vendas.online;

/**
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TesteController {

    @GetMapping("/teste")
    public String teste() {
        return "Swagger funcionando!";
    }
}
