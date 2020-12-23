package sn.aissata.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sn.aissata.demo.entities.Candidature;
import sn.aissata.demo.entities.Departement;
import sn.aissata.demo.entities.Formation;
import sn.aissata.demo.repository.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AppService {
        @Autowired
        private ResponsableRepository responsableRepository ;
        @Autowired
        private DepartementRepository departementRepository;
        @Autowired
        private FormationRepository formationRepository;
        @Autowired
        private CandidatureRepository candidatureRepository;
        @Autowired
        private ProfilRepository profilRepository;

        @RequestMapping(value = "/departements", method = RequestMethod.GET)
        public List<Departement> getAllDepartement(){
            return departementRepository.findAll();
        }

         @RequestMapping(value = "/formation", method = RequestMethod.GET)
         public List<Formation> getAllFormation(){
            return formationRepository.findAll();
         }

         @RequestMapping(value = "candidature/save", method = RequestMethod.POST)
         public List<Candidature> save(Candidature candidature){
                candidatureRepository.save(candidature);
                return candidatureRepository.findAll();
         }

}
