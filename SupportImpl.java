public class SupportImpl extends Hero implements Support{
    private int heal;
    public SupportImpl(){

    }
    public SupportImpl(String name,String heroClass,int maxHP, int heal){
        super(name, heroClass,maxHP);
        if (maxHP>0){
            setAlive(true);
        }
        else{
            setAlive(false);
        }
        this.heal=heal;
        setCurrentHP(maxHP);
    }
    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }
    public String heal(Hero target){
        if(this.isAlive() && target.isAlive()){
            if(this.getName().equals(target.getName())){
                return "The hero can't heal himself";
            }
            else if(target.getCurrentHP()==target.getMaxHP()){
              return this.getName()+" can't heal his target because his target has full hp";
            }
            else if(target.getMaxHP()<target.getCurrentHP()+this.heal){
                int num=target.getMaxHP()-target.getCurrentHP();
                target.setCurrentHP(target.getCurrentHP()+(target.getMaxHP()-target.getCurrentHP()));
                return "The hero healed his target by "+num+" units";
            }
            else{
                 target.setCurrentHP(target.getCurrentHP()+this.heal);
                 return "The hero healed his target by "+this.heal+" units";
            }
        }
        else if(!target.isAlive()){
            return "The hero can't heal the dead";
        }
        else{
            return "The hero can't apply his ability because he's dead";
        }
    }
    public String toString(){
        return "Attacker{name='"+getName()+"', heroClass='"+getHeroClass()+"', maxHP="+getMaxHP()
                +", currentHP="+getCurrentHP()+", alive="+isAlive()+", heal="+heal+"}";
    }
}
