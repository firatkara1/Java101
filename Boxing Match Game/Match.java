public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight  = maxWeight;
        this.minWeight = minWeight;
    }

     void run(){
        if(isCheck()){
            int round=1;

            if (this.f1.isFirstAttack()) {
                this.f2.health = this.f1.hit(f2);
            } else if (this.f2.isFirstAttack()) {
                this.f1.health = this.f2.hit(f1);
            }

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("---------- " + round + ".Round ----------");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Saglik " + this.f1.health);
                System.out.println(this.f2.name + " Saglik " + this.f2.health);
                round++;
            }
        }else{
            System.out.println("Sporcularin sikletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " sporcusu maci kazandi!");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " sporcusu maci kazandi.");
            return true;
        }
        return false;
    }
}














