package week8;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void attach(Observer observer) {
        if (observer == null) return;
        if (!observers.contains(observer)) observers.add(observer);
        System.out.println("[Subject] Attached: " + observer.getClass().getSimpleName());
    }

    @Override
    public void detach(Observer observer) {
        if (observer == null) return;
        observers.remove(observer);
        System.out.println("[Subject] Detached: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        System.out.println("[Subject] Notifying " + observers.size() + " observers...");
        for (Observer o : new ArrayList<>(observers)) { // copy to avoid ConcurrentModification
            o.update(state);
        }
    }

    // Изменение состояния и уведомление
    public void setState(String newState) {
        if (newState == null) return;
        if (!newState.equals(this.state)) {
            this.state = newState;
            System.out.println("[Subject] State changed to: " + newState);
            notifyObservers();
        } else {
            System.out.println("[Subject] State set to same value, no notification.");
        }
    }

    public String getState() {
        return state;
    }
}

