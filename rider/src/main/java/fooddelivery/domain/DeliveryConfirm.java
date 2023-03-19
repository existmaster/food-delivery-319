package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryConfirm extends AbstractEvent {

    private Long id;

    public DeliveryConfirm(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryConfirm() {
        super();
    }
}
