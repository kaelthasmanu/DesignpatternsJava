    void main() {
        Singleton singleton = Singleton.getInstance("1");
        Singleton anotherSingleton = Singleton.getInstance("2");
        IO.println(singleton.value);
        IO.println(anotherSingleton.value);
    }