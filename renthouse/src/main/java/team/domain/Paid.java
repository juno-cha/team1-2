package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long totalPrice;
    private Long productId;
    private String cancelYn;
    private Long orderId;
}


