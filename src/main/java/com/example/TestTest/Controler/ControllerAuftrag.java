
package com.example.TestTest.Controler;

        import com.example.TestTest.AuftragRepository;
        import com.example.TestTest.model.Auftrag;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;


        import java.util.List;


@RestController
public class ControllerAuftrag  {
    @Autowired
    AuftragRepository auftragRepository;



    @GetMapping("/Auftrage")
    public List<Auftrag> index(){

        return auftragRepository.findAll();
    }
    @GetMapping("/Auftrag/{kundeNummer}")
    public List<Auftrag> show(@PathVariable Integer kundeNummer){

        return auftragRepository.findByKundenNr(kundeNummer);
    }
}

