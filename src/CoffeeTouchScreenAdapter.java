public class CoffeeTouchScreenAdapter implements CoffeeMachineInt{

    OldCoffeeMachine oldMach;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine newMach) {
        oldMach = newMach;
    }
    public void chooseFirstSelection() {
        oldMach.selectA();

    }
    public void chooseSecondSelection() {
        oldMach.selectB();
    }
}
