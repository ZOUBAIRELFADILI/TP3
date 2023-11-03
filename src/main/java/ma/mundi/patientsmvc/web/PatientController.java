package ma.mundi.patientsmvc.web;

import lombok.AllArgsConstructor;
import ma.mundi.patientsmvc.entities.Patient;
import ma.mundi.patientsmvc.repositories.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path = "/index")
    public String patients(Model model){
        List<Patient> patients=patientRepository.findAll();
        model.addAttribute("listPatients",patients);
        return "patients";
    }
}
