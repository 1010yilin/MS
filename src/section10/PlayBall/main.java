package section10.PlayBall;


import org.w3c.dom.Node;

public class main {
    public static void main(String[] args) {
        Football joe = new Football("Joe");
        Football pat = new Football("pat");
        Football bec = new Football("bec");


        League<Team<Football>> football = new League<>("AFL");
        Team<Football> Bull = new Team<>("Bull");
        Team<Football> Cull = new Team<>("Cull");
        Team<Football> Dull = new Team<>("Dull");

        football.add(Bull);
        football.add(Cull);
        football.add(Dull);


        Bull.addPlayer(joe);
        Cull.addPlayer(pat);
        Dull.addPlayer(bec);


        System.out.println(Bull.teamSize());

        Bull.matchResult(Cull,1,0);

        System.out.println("Rankings");
        System.out.println(Bull.ranking());
        System.out.println(Cull.ranking());

        System.out.println(Bull.compareTo(Cull));

        football.showLeagueTable();

        Node node = null;

    }
}
