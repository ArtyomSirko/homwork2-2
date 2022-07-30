public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerMagick, int transgression, int hardworking, int loyal, int honest) {
        super(name, powerMagick, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }
    public void compare (Hufflepuff challengerOne ){
        int sumOne = challengerOne.getPowerMagick() + challengerOne.getTransgression() + challengerOne.getHardworking() + challengerOne.getLoyal() + challengerOne.getHonest();
        int sumTwo = this.getPowerMagick() + this.getTransgression() + this.getHardworking() + this.getLoyal() + this.getHonest();
        if(sumOne>sumTwo){
            System.out.println(challengerOne.getName()+"-победил");
        } else if (sumOne==sumTwo) {
            System.out.println(challengerOne.getName()+"-Ничья-"+this.getName());
        }else System.out.println(this.getName() + "-победил");
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", PowerMagick="+this.getPowerMagick()+
                ", Transgression="+this.getTransgression();
    }
}
