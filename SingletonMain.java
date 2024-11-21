public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        // call a method on the singleton instance
        singleton.showMessage();
    }
}
