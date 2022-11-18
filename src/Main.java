public class Main {

    public static void main(String[] args) {

        Command c1 = new cookEggCommand();
        Command c2 = new cookPizzaCommand();
        Command c3 = new cookSpinachCommand();

        Kitchen k = Kitchen.getInstance();
        k = Kitchen.getInstance();

        k.add(c1);
        k.add(c2);
        k.add(c1);
        k.add(c3);
        k.add(c3);


    }

}
