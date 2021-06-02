public class Zoo {
    private int capacity;
    private int numberOfMonsters;
    private Monster[] entriedMonsters;
    static int input;

    public Zoo(int capacity) {
          this.capacity= capacity;
          this.numberOfMonsters=0;
          this.entriedMonsters =new Monster[capacity];
    }
    public void addAMonster(Monster[] monsters){
             for(int i=0;i<monsters.length;i++) {

                 entriedMonsters[i] = monsters[i];
                 if(entriedMonsters[i]!= null){
                     input++;
                 }
             }
                 if(input <= this.capacity){
                     this.numberOfMonsters=this.numberOfMonsters+input;

                 }
                 else{
                     this.numberOfMonsters= this.capacity;
                     System.out.println("The zoo is full");
                 }
             }


    public void addAMonster(Monster monster){
        if(this.numberOfMonsters < this.capacity){

            this.numberOfMonsters++;

        }
        else {
            this.numberOfMonsters =  this.capacity;
            System.out.println("The Zoo is full");
        }
    }

    public int getNumberOfMonsters() {
        if (this.numberOfMonsters < this.capacity){
            return this.numberOfMonsters;

        }
        else{
            return this.capacity;
    }
    }
}

