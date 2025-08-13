package com.example.artbackend.Service;

import com.example.artbackend.Entities.Evenement;
import com.example.artbackend.Entities.Media;
import com.example.artbackend.Entities.MediaEvent;
import com.example.artbackend.Repository.EvenementRepository;
import com.example.artbackend.Repository.MediaeventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EvenementService {
    @Autowired
    EvenementRepository ER ;

    @Autowired
    MediaeventRepository MR ;



    public List<Evenement> GetAllEvents(){
    return ER.findAll();
    }

    public void AddEvenement(Evenement e){
        ER.save(e);
    }

    public void DeleteEvenement(int id ){
        ER.deleteById(id);
    }

    public void  addMediaToEvent(String path ,  int  id ){
        MediaEvent m = new MediaEvent();
        m.setPath(path);
        Evenement e = new Evenement(id);
        m.setEvenement(e);
        MR.save(m);
    }


}
