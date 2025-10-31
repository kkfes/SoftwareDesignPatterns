package week8;

public class ConcreteObserverA implements Observer {
    private final String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("[ObserverA " + name + "] Received state: " + state);
    }
}

