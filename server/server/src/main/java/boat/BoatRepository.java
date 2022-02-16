package boat;

import boat.Boat;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoatRepository extends JpaRepository<Boat,Long> {

    List<Boat> findByTopicId(Long boatId);


    List<Boat> findBoatByBoatId(Long boatId);





}