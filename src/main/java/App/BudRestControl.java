package App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BudRestControl {
    @Autowired
    private BuddyRep repo;
    private List<BuddyInfo> list;

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="") String contact, Model model) {
        if(contact!=""){
            list= repo.findByName(contact);
            model.addAttribute("contacts", list);
        } else {
            for (BuddyInfo bud : repo.findAll()) {
               list.add(bud) ;
            }
            model.addAttribute("contacts", list);
        }


        return "greeting";
    }

}
