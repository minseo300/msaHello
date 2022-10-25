package msahello.domain;

import msahello.domain.*;
import msahello.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class HelloPlaced extends AbstractEvent {

    private Long id;
    private String message;
    private String name;
}


