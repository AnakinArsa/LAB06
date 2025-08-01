public class Flyingshark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flyingshark is gliding through the air! (I know it's impossible but who cares!)");
    }

    public void eat(Flyable creature) {
        System.out.println("Flyingshark caught a flying creature!");
    }

    @Override
    public String toString() {
        return "Flyingshark@" + Integer.toHexString(hashCode());
    }
}