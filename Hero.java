public abstract class Hero{
    private String name;
    private String heroClass;
    private int maxHP;
    private int currentHP;
    private boolean alive;
    public Hero() {

    }

    public Hero(String name, String heroClass, int maxHP) {
        this.name = name;
        this.heroClass = heroClass;
        this.maxHP=maxHP;
        currentHP=maxHP;
        if(maxHP>0) {
            this.alive = true;
        }
        else{
            this.alive=false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public boolean isAlive(){
        return alive;
    }
    public void setAlive(boolean alive){
        this.alive=alive;
        if(alive){
            currentHP=1;
        }
        else{
            currentHP=0;
        }
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        if(getMaxHP()>=currentHP){
            this.currentHP=currentHP;
        }
        else{
            System.out.println("current HP is more than max HP");
        }
    }
    public abstract String toString();
}