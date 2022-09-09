/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.print("hello");
        Duck maller = new Duck();
        maller.setQuacBehavior(new quack());
        maller.setFlyBehavior(new noFly());
        maller.performQuack();
        maller.performFly();
        Duck parrot = new Duck();
        parrot.setQuacBehavior(new mute());
        parrot.setFlyBehavior(new flyWithWings());
        parrot.performQuack();
        parrot.performFly();

    }

}