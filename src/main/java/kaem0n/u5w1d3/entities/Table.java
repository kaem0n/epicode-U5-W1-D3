package kaem0n.u5w1d3.entities;

import kaem0n.u5w1d3.enums.TableStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
@Scope("prototype")
public class Table {
    private final int number;
    private final int maxSeats;
    @Setter
    private TableStatus status;

    public Table(@Qualifier("getTableNumber") int number, @Qualifier("getSeats") int maxSeats) {
        this.number = number;
        this.maxSeats = maxSeats;
        this.status = TableStatus.FREE;
    }
}

