package phone;

public class Phone {
    private int number;
    private String model;
    private double weight;

    @Override
    public String toString() {
        return "Phone {" + "number = " + number + ", model = '" + model + '\'' + ", weight = " + weight + '}';
    }

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public String receiveCall(String name, int number) {
        return name + " is calling... + " + number;
    }

    public void sendMessage(String mess, int... args) {
        if (mess == null) {
            System.out.println("Message text missing.");
        } else {
            System.out.println("Message text: " + mess);
        }
        for (int number : args) {
            System.out.println("Number: " + number);
        }
    }
}
