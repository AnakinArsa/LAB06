public class Shark extends Fish {
    @Override
    public void swim() {  // Corrected: Changed 'Swim()' to 'swim()'
        System.out.println("Shark is swimming fast!");
    }

    public void eat(Fish fish) {
        System.out.println(this.toString() + " is eating " + fish.toString());
    }

    @Override
    public String toString() {
        return "Shark@" + Integer.toHexString(hashCode());
    }
}