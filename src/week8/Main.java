package week8;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverA alice = new ConcreteObserverA("Alice");
        ConcreteObserverA bob = new ConcreteObserverA("Bob");
        ConcreteObserverB logger = new ConcreteObserverB();

        subject.attach(alice);
        subject.attach(bob);
        subject.attach(logger);

        subject.setState("Price: 100");

        // simulate some change
        Thread.sleep(200);
        subject.setState("Price: 120");

        // detach one observer
        subject.detach(bob);

        Thread.sleep(100);
        subject.setState("Price: 120"); // same value — no notification

        Thread.sleep(100);
        subject.setState("Price: 150");
    }
}

