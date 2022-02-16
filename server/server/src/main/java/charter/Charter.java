package charter;

import boat.Boat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Charter {

    @Id
    private Long id;
    private String name;
    private String description;
    private Date startCharter;
    private Date endCharter;
    private String port;


    @ManyToOne
    private Boat boat;


}
