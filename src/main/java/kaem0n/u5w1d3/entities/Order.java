package kaem0n.u5w1d3.entities;

import kaem0n.u5w1d3.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.List;

@Getter
public class Order {
    private final List<Food> orderList;
    private final int orderNumber;
    @Setter
    private OrderStatus status;
    private final int seats;
    private final Time acquisitionTime;
    @Setter
    private double total;

    public Order(List<Food> orderList, int orderNumber, int seats, Time acquisitionTime) {
        this.orderList = orderList;
        this.orderNumber = orderNumber;
        this.seats = seats;
        this.acquisitionTime = acquisitionTime;
        this.status = OrderStatus.PREPARING;
        this.total = 0;
        orderList.forEach(dish -> this.total += dish.getPrice());
    }
}
