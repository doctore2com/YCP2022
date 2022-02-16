package boat;

import boat.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boats")

public class BoatController {

    @Autowired
    private BoatService boatService;

    @GetMapping("/allBoat")
    public List<Boat> getAllBoats() {
        return boatService.getAllBoats();
    }

    @GetMapping("/oneBoat/{boatId}")
    public Boat getBoat(@PathVariable Long boatId) {
        return boatService.getBoat(boatId);
    }

    @PostMapping("/addBoat")
    public void addBoat(@RequestBody Boat boat) {
        boatService.addBoat(boat);
    }

    @PostMapping("/updateBoat")
    public void updateBoat(@RequestBody Boat boat) {
        boatService.updateBoat(boat);
    }

    @DeleteMapping("/deleteBoat/{boatId}")
    public void deleteBoat(@PathVariable Long boatId) {
        boatService.deleteBoat(boatId);
    }
}