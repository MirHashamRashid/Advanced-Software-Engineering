
class Duck {
    flyable flying;
    Quackable quacking;

    public Duck() {

    }

    public void setFlyBehavior(flyable fl) {
        flying = fl;
    }

    public void setQuacBehavior(Quackable qu) {
        quacking = qu;
    }

    public void performQuack() {
        quacking.quack();
    }

    public void performFly() {
        flying.fly();
    }
}