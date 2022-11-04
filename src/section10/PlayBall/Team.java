package section10.PlayBall;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{  /*any type extend or subclass of player belongs to T*/
    private String name;
    int player=0;
    int won=0;
    int lost=0;
    int tied=0;
    int round =0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){ //now the program know the T refers to the type within the Player.
         if (members.contains(player)){
             System.out.println(player.getName() + " in team");
             return false;
         }else{
              members.add(player);
             System.out.println(player.getName() + " get in team " + this.name);
             return true;
        }
    }

    public int teamSize(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore>theirScore){
            won++;
            message = " beat ";
        } else if (ourScore==theirScore) {
            tied++;
            message = " tied with ";
        }else {
            lost++;
            message = " lost to ";
        }
        round ++;
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() > team.ranking()) {
            return 1;
        }
        return 0;
    }
}
