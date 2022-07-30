
    public class Gryffindor extends Hogwarts{
        private int nobility;
        private int honor;
        private int courage;

        public Gryffindor(String name, int powerMagick, int transgression, int nobility, int honor, int courage) {
            super(name, powerMagick, transgression);

            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
        }
        public void compare (Gryffindor challengerOne ){
            int sumOne = challengerOne.getPowerMagick() + challengerOne.getTransgression() + challengerOne.getNobility() + challengerOne.getHonor() + challengerOne.getCourage();
            int sumTwo = this.getPowerMagick() + this.getTransgression() + this.getNobility() + this.getHonor() + this.getCourage();
            if(sumOne>sumTwo){
                System.out.println(challengerOne.getName()+"-победил");
            } else if (sumOne==sumTwo) {
                System.out.println(challengerOne.getName()+"-Ничья-"+this.getName());
            }else System.out.println(this.getName() + "-победил");
        }
        public int getNobility() {
            return nobility;
        }

        public int getHonor() {
            return honor;
        }

        public int getCourage() {
            return courage;
        }

        public void setCourage(int courage) {
            this.courage = courage;
        }

        public void setNobility(int nobility) {
            this.nobility = nobility;
        }

            public void setHonor(int honor) {
            this.honor = honor;
        }

        @Override
        public String toString() {
            return "Gryffindor{" +
                    "nobility=" + nobility +
                    ", honor=" + honor +
                    ", courage=" + courage +
        ", PowerMagick="+this.getPowerMagick()+
                    ", Transgression="+this.getTransgression();
        }
    }

