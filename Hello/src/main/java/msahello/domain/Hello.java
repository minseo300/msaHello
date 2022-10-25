package msahello.domain;

import msahello.domain.HelloPlaced;
import msahello.HelloApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Hello_table")
@Data

public class Hello  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;

    @PostPersist
    public void onPostPersist(){


        HelloPlaced helloPlaced = new HelloPlaced(this);
        helloPlaced.publishAfterCommit();

    }

    public static HelloRepository repository(){
        HelloRepository helloRepository = HelloApplication.applicationContext.getBean(HelloRepository.class);
        return helloRepository;
    }






}
