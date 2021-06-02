public class Food {

    private String name;
    double servingSize;

    //creates a new food
    public Food(String name, double servingSize) {
        this.name = name;
        this.servingSize = servingSize;
    }

    //gets the name of the food
    public String getName() {
        return this.name;
    }

    //gets the serving size of the food
    public double getServingSize() {
        if(this.servingSize < 0.0){
            return 0.0;
        }

            return this.servingSize;

    }
}