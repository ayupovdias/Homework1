public class AttackerImpl extends Hero implements Attacker{
    private int damage;

    public AttackerImpl(){

    }
    public AttackerImpl(String name, String heroClass, int maxHP,int damage){
        super(name, heroClass, maxHP);
        this.damage=damage;
        if(maxHP>0){
            setAlive(true);

        }
        else{
            setAlive(false);
        }
        setCurrentHP(maxHP);
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String attacks(Hero target){
        if(this.isAlive() && target.isAlive()){
            if(this.getName().equals(target.getName())){
                return "The hero can't hit himself";
            }
            else{
                target.setCurrentHP(target.getCurrentHP()-this.damage);
                if(target.getCurrentHP()<=0){
                    target.setCurrentHP(0);
                    target.setAlive(false);
                    return target.getName()+" was killed by "+this.getName();
                }
                else{
                    return target.getName()+" lost "+this.damage +" units of hp. "+target.getName()
                            +" has "+target.getCurrentHP();
                }
            }
        }
        else if(!this.isAlive()){
            return "The hero can't use his ability because he is dead";
        }
        else{
            return "The hero can't use his ability because the target is dead";
        }

    }

    public String toString(){
        return "Attacker{name='"+getName()+"', heroClass='"+getHeroClass()+"', maxHP="+getMaxHP()
                +", currentHP="+getCurrentHP()+", alive="+isAlive()+", damage="+damage+"}" ;
    }
}
