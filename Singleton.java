public class Singleton {

    // private static instance of the class
    private static Singleton instance;

    private Singleton(){
        //initialization code (if needed)
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    // double-checked locking
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello from Singleton Instance");
    }


}
