package creational.singleton;

public class Main {
    void main(){
        Singleton singleton = Singleton.getInstance("1");
        Singleton anotherSingleton = Singleton.getInstance("2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
