import patterns.*;

public class MainApp {
    public static void main(String[] args)
    {
        // singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1.hashCode()==singleton2.hashCode()){
            System.out.println("s1 is the same as s2");
        } else {
            System.out.println("s1 is NOT the same as s2");
        }
        // strategy
        var context = new StrategyContext(new StrategyA());
        context.contextInterface();
        context = new StrategyContext(new StrategyB());
        context.contextInterface();
        context = new StrategyContext(new StrategyC());
        context.contextInterface();
        // builder
        BuilderDirector builderDirector   = new BuilderDirector();
        BuilderConcrete1 builderConcrete1 = new BuilderConcrete1();
        BuilderConcrete2 builderConcrete2 = new BuilderConcrete2();
        builderDirector.Construct(builderConcrete1);
        var product1 = builderConcrete1.getResult();
        product1.showResult();
        builderDirector.Construct(builderConcrete2);
        var product2 = builderConcrete2.getResult();
        product2.showResult();
    }
}
