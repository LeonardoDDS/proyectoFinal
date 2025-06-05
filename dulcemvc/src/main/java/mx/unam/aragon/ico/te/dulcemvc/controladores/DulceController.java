package mx.unam.aragon.ico.te.dulcemvc.controladores;

import mx.unam.aragon.ico.te.dulcemvc.modelos.Dulce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda/")
public class DulceController {
    @GetMapping("/home/")
    public String home() {
        return "home";
    }
    @GetMapping("/dulce/")
    public String dulce(Model model) {
        Dulce dulce = new Dulce(1, "Paleta", "Dulce", 180426, "Paleta de caramelo duro", "https://images.rappi.com.mx/products/268636744747_uyxxyqvgfgvk_104532306112_lnfpkieiqxnj_618_1.png?e=webp&q=80&d=130x130");
        model.addAttribute("dulce", dulce);
        return "dulce";
    }
}
