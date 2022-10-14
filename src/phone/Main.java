package phone;

public class Main {
    //    Класс phone.Phone. Создайте класс phone.Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
//    Добавить в класс phone.Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//    возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//    Добавить конструктор в класс phone.Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//    Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//    Добавить конструктор без параметров.
//    Вызвать из конструктора с тремя параметрами конструктор с двумя.
//    Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено
//    сообщение. Метод выводит на консоль номера этих телефонов.
    public static void main(String[] args) {

        Phone iphone = new Phone("+44-123-456", "IPhone", 15.74);
        Phone xiaomi = new Phone("+28-456-789", "Xiaomi", 17.23);
        Phone vivo = new Phone("+85-789-123", "Vivo", 17.81);

        System.out.println(iphone);
        System.out.println(xiaomi);
        System.out.println(vivo);
        System.out.println();

        iphone.receiveCall("Olivia");
        xiaomi.receiveCall("Mark");
        vivo.receiveCall("Bob");
        System.out.println();

        System.out.println(iphone.getNumber());
        System.out.println(xiaomi.getNumber());
        System.out.println(vivo.getNumber());
        System.out.println();

        System.out.println(iphone.receiveCall("Olivia", iphone.getNumber()));
        System.out.println(iphone.receiveCall("Mark", xiaomi.getNumber()));
        System.out.println(iphone.receiveCall("Bob", vivo.getNumber()));
        System.out.println();

        iphone.sendMessage("Hello, what's up?", iphone.getNumber());
        xiaomi.sendMessage(null, xiaomi.getNumber());
        vivo.sendMessage("Hi, I'm here!" ,vivo.getNumber());
    }
}