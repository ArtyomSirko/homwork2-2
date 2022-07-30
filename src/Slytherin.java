public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerMagick, int transgression, int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, powerMagick, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void compare (Slytherin challengerOne ){
        int sumOne = challengerOne.getPowerMagick() + challengerOne.getTransgression() + challengerOne.getCunning() +
                challengerOne.getDetermination() + challengerOne.getAmbition()+challengerOne.getResourcefulness()+
                challengerOne.getLustForPower();
        int sumTwo = this.getPowerMagick() + this.getTransgression() + this.getCunning() + this.getDetermination() + this.getAmbition()+this.getAmbition()+getResourcefulness()+getLustForPower();
        if(sumOne>sumTwo){
            System.out.println(challengerOne.getName()+"-победил");
        } else if (sumOne==sumTwo) {
            System.out.println(challengerOne.getName()+"-Ничья-"+this.getName());
        }else System.out.println(this.getName() + "-победил");
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return this.getName()+ "-Slytherin" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", PowerMagick="+this.getPowerMagick()+
                ", Transgression="+this.getTransgression();
    }
}
