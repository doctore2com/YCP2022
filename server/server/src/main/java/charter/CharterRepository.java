package charter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CharterRepository extends JpaRepository<Charter,Long> {

    List<Charter> findByTopicId(Long boatId);


List<Charter> findCharterByBoatId(Long boatId);





}