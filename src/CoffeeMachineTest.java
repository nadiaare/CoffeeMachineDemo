public class CoffeeMachineTest {

    public static void main(String[] args) {
        OldCoffeeMachine oldBrew = new OldCoffeeMachine();
        CoffeeMachineInt coffeeAdapt = new CoffeeTouchScreenAdapter(oldBrew);

        System.out.println("*****Java Coffee Machine*****");
        System.out.println("Welcome, please make a selection!" +"\n");


        oldBrew.selectA();
        oldBrew.selectB();

        System.out.println("\n" +"Thank you, have a nice day!");

    }
}
