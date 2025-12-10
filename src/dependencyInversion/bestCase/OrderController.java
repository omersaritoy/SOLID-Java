package dependencyInversion.bestCase;

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    public String pa(PaymentRequest request) {
        return orderService.payOrder(request);
    }
}
