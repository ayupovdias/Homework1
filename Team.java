public class Team {
    private Hero[] team=new Hero[4];
    int index=0;
    public void addInTeam(Hero hero){
        if(team.length>index){
            team[index]=hero;
            index++;
        }
        else{
            System.out.println("One team mush consist of 4 heroes");
        }
    }
    public void AllHeroesInTeam(){
        for(int i=0;i<index;i++){
            System.out.println(team[i]);
        }
    }

}
