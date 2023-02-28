import coffee.order.CoffeeOrderBoard;

public class App {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Visitor 1");
        board.add("Visitor 2");
        board.add("Visitor 3");
        board.add("Visitor 4");
        board.add("Visitor 5");
        board.add("Visitor 6");
        board.add("Visitor 7");
        board.add("Visitor 8");
        board.add("Visitor 9");
        board.add("Visitor 10");

        System.out.println(board.deliver());
        System.out.println(board.deliver());
        System.out.println(board.deliver());

        System.out.println(board.deliver(5));
        System.out.println(board.deliver(8));
        System.out.println(board.deliver(8));
        System.out.println(board.deliver(99));

        board.add("Visitor 1");
        board.add("Visitor 2");
        board.add("Visitor 3");
        board.add("Visitor 4");
        board.add("Visitor 5");

        board.draw();
        board.draw(3);

        System.out.println();
    }
}
