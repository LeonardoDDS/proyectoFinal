package mx.unam.aragon.ico.te.dulcemvc.controladores;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.unam.aragon.ico.te.dulcemvc.modelos.Dulce;
import mx.unam.aragon.ico.te.dulcemvc.servicios.DulceServices;

@Controller
@RequestMapping("/tienda/")
public class DulceController {

    @Autowired
    private DulceServices dulceServices;
    @Autowired
    private SmartInitializingSingleton smartInitializingSingleton;

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
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("dulce", new Dulce(1, "Chocolate", "Dulce", 101026, "Chocolate de leche", "https://images.rappi.com.mx/products/268636744747_uyxxyqvgfgvk_104532306112_lnfpkieiqxnj_618_1.png?e=webp&q=80&d=130x130"));
        return "formDulces";
    }
    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Dulce dulce
    ) {
        LoggerFactory.getLogger(getClass()).info("Guardando dulce" + dulce);

        //Save en BD
        dulceServices.guardarDulce(dulce);
        return "redirect:/tienda/nuevo?exito";
    }

    @GetMapping("/modificar")
    public String modificar() {
        return "modificar";
        }
}
