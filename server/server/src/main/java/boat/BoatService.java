package boat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepository;

    public List<Boat> getAllBoatsByBoat(Long boatId) {
        List<Boat> boats = new ArrayList<>();
        boatRepository.findBoatByBoatId(boatId)
                .forEach(boats::add);
        return boats;
    }
    public List<Boat> getAllBoats(){
        return boatRepository.findAll();
    }

    public Boat getBoat(Long id) {
        return boatRepository.findById(id).get();
    }

    public void addBoat(Boat boat) {
        boatRepository.save(boat);
    }

    public void updateBoat(Boat boat) {
        boatRepository.save(boat);
    }

    public void deleteBoat(Long id) {
        Boat boat = boatRepository.findById(id).get();
        boatRepository.delete(boat);
    }
}