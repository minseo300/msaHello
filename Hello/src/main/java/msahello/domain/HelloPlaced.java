package msahello.domain;

import msahello.domain.*;
import msahello.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class HelloPlaced extends AbstractEvent {

    private Long id;
    private String message;
    private String name;

    public HelloPlaced(Hello aggregate){
        super(aggregate);
    }
    public HelloPlaced(){
        super();
    }
}
