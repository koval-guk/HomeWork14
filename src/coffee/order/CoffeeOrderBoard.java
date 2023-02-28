package coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> board;
    private int id;

    public CoffeeOrderBoard() {
        board = new LinkedList<>();
    }

    public void add(String name) {
        Order order = new Order(name);
        order.setId(++id);
        board.add(order);
    }

    public Order deliver() {
        return board.poll();
    }

    public Order deliver(int id) {
        Order orderTemp;
        if (id > this.id) {
            orderTemp = new Order("NON-EXISTENT ORDER");
            orderTemp.setId(id);
            return orderTemp;
        } else {
            for (Order order : board) {
                if (order.getId() == id) {
                    orderTemp = order;
                    board.remove(order);
                    return orderTemp;
                }
            }
        }
        orderTemp = new Order("ALREADY DONE ORDER");
        orderTemp.setId(id);
        return orderTemp;
    }

    public void draw() {
        System.out.println("Order board : ");
        for (Order order : board) {
            System.out.println(order);
        }
    }

    public void draw(int size) {
        System.out.println("Order board " + size + " element(s) : ");
        int counter = 0;
        for (Order order : board) {
            System.out.println(order);
            counter++;
            if (counter >= size) {
                break;
            }
        }
    }
}
