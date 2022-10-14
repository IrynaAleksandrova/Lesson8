package phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public String receiveCall(String name, String number) {
        return name + " is calling... + " + number;
    }

    public void sendMessage(String mess, String... args) {
        if (mess == null) {
            System.out.println("Message text missing.");
        } else {
            System.out.println("Message text: " + mess);
        }
        for (String number : args) {
            System.out.println("Number: " + number);
        }
    }

    @Override
    public String toString() {
        return "Phone {" + "number = " + number + ", model = '" + model + '\'' + ", weight = " + weight + '}';
    }
}
