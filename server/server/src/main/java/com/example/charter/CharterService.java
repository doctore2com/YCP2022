package com.example.charter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharterService {

    private final CharterRepository charterRepository;
//    private final BoatRepository boatRepository;

//    public List<Charter> getAllChartersByBoat(Long boatId) {
//        List<Charter> charters = new ArrayList<>();
//        charterRepository.findCharterByBoatId(boatId)
//                .forEach(charters::add);
//        return charters;
//    }
    public List<Charter> getAllCharters(){
        return charterRepository.findAll();
    }

    public Charter getCharter(Long id) {
        return charterRepository.findById(id).get();
    }

    public void addCharter(Charter charter, Long boatId) {
//        Boat boat = boatRepository.getById(boatId);
        charterRepository.save(charter);
    }

    public void updateCharter(Charter charter) {
        charterRepository.save(charter);
    }

    public void deleteCharter(Long id) {
        Charter charter = charterRepository.findById(id).get();
        charterRepository.delete(charter);
    }

}