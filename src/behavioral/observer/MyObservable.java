package behavioral.observer;

public interface MyObservable {
    void  addObserver(MyObserver o);
    void removeObserver(MyObserver o);
    void broadcastMessage(String message);
}
