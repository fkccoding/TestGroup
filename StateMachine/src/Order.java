import java.math.BigDecimal;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019/8/29 12:18
 */
public class Order {

    private OrderStateMachine stateMachine = OrderStateMachine.DISPATCHING;

    private String name;

    private BigDecimal amount;

    public OrderStateMachine getStateMachine() {
        return stateMachine;
    }

    public void setStateMachine(OrderStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Order nextState(){
        this.stateMachine = this.stateMachine.nextState();
        return this;
    }

    public void log(){
        System.out.println(this.stateMachine.prevState() + "-------->" + this.stateMachine.name());
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setAmount(BigDecimal.TEN);
        order.setName("˿�����ɿ���");

        order.nextState();
        order.log();
        order.nextState();
        order.log();

    }
}
