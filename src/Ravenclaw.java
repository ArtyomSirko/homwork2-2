
    public class Ravenclaw extends Hogwarts{
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int powerMagick, int transgression, int wise, int witty, int creative) {
        super(name, powerMagick, transgression);

        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public void compare (Ravenclaw challengerOne ){
        int sumOne = challengerOne.getPowerMagick() + challengerOne.getTransgression() + challengerOne.getWise() + challengerOne.getWitty() + challengerOne.getCreative();
        int sumTwo = this.getPowerMagick() + this.getTransgression() + this.getWitty() + this.getWise() + this.getCreative();
        if(sumOne>sumTwo){
            System.out.println(challengerOne.getName()+"-победил");
        } else if (sumOne==sumTwo) {
            System.out.println(challengerOne.getName()+"-Ничья-"+this.getName());
        }else System.out.println(this.getName() + "-победил");
    }
    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return this.getName()+ "-Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                ", PowerMagick="+this.getPowerMagick()+
                ", Transgression="+this.getTransgression();
    }
}

