package gymhum.de;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gymhum.de.model.Film;
import gymhum.de.model.Person;

@Controller

public class FilmController {

    ArrayList<Film> filme;

    public FilmController(){
        setFilme(new ArrayList<>());
        getFilme().add(new Film("Star wars", 12, 100));
        getFilme().add(new Film("Avatarr", 6, 100));
        getFilme().add(new Film("Harry Potter", 16, 230));
        getFilme().add(new Film("Minions", 0, 70));
}

    @GetMapping("/filme")
    public String showFilme(@RequestParam(name="activePage", required = false, defaultValue = "filme") String activePage, Model model){
        model.addAttribute("activePage", "filme");
        model.addAttribute("filme", getFilme());
        return "index.html";
    }
    
     public void setFilme(ArrayList<Film> filme) {
         this.filme = filme;
     }
     public ArrayList<Film> getFilme() {
         return filme;
     }

}
