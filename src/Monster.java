public class Monster {
     String MonstersName;
     int limb,eye;
     boolean canFly;
     Food FoodName;
     int totalFeed;




    public Monster(String MonstersName,int limb,int eye,boolean canFly,Food FoodName, int totalFeed) {
        this.MonstersName = MonstersName;
        this.limb=limb;
        this.eye= eye;
        this.canFly=canFly;
        this.FoodName = FoodName;
        this.totalFeed= totalFeed;

    }

    public Monster(String MonstersName) {
           this.MonstersName=MonstersName;
    }

    public void looseALimb(){
        if(this.limb > 0){
            limb--;
        }
    }
    public void looseAnEye(){
        if(this.eye > 0){
            eye--;
        }


    }
    public int getNumberOfLimbs(){
        return this.limb;
    }
    public int getNumberOfEyes(){

        return this.eye;
    }
    public void eat(Food cookies) {
        this.totalFeed++;
    }

    public void eat(Food[] meat) {
        this.totalFeed = this.totalFeed+meat.length;
    }
    public double getLifetimeFeed(){
        return this.totalFeed;
    }
    public String toString() {
        return this.MonstersName+ " has " + this.limb + " limbs and " + this.eye + " eyes";
    }
}