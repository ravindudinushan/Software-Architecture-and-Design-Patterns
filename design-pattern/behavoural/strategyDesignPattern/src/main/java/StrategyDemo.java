public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(20,10));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(20,10));
    }
}
