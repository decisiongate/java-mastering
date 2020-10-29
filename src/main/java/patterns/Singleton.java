package patterns;

public class Singleton {
    public static Singleton Instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if(Instance == null) {
            Instance = new Singleton();
        }
        return Instance;
    }

    @Override
    public int hashCode() {
        return 12345;
    }
}
