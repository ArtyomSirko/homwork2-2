public abstract class Hogwarts {
        private String name;
        private int powerMagick;
        private int transgression;

        public Hogwarts(String name, int powerMagick, int transgression) {
            this.name = name;
            this.powerMagick = powerMagick;

            this.transgression = transgression;
        }

        public void compareAll (Hogwarts challengerOne) {
            int sumOne = challengerOne.getPowerMagick() + challengerOne.transgression;
            int sumTwo = this.getTransgression() + this.powerMagick;
            if(sumOne>sumTwo){
                System.out.println(challengerOne.getName()+"-победил");
            } else if (sumOne==sumTwo) {
                System.out.println(challengerOne.getName()+"-Ничья-"+this.getName());
            }else System.out.println(this.getName() + "-победил");
        }
        public String getName() {
            return name;
        }

        public int getPowerMagick() {
            return powerMagick;
        }

        public int getTransgression() {
            return transgression;
        }

        public void setPowerMagick(int powerMagick) {
            this.powerMagick = powerMagick;
        }

        public void setTransgression(int transgression) {
            this.transgression = transgression;
        }

    }
