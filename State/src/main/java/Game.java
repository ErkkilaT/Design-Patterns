import java.util.Scanner;

public class Game {
    private State state;
    private int xp;
    private String lvl;
    private int hp;
    private String name;
    private static Scanner scanner = new Scanner(System.in);

    public void start(String name){
        this.name=name;
        state = new NoviceState(this);
        operate();
        while(true){
            if(state == null){
                System.out.println("Game broken pls fix");
                return;
            }
            state.takeTurn();
        }
    }

    public void operate(){

    }

    public void setState(State state){
        this.state=state;
    }

    public int readUserOption(String [] options){
        System.out.println("Type the number of the option:");
        for(int i =1; i<=options.length; i++){
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }
    public void printCharStats(int maxXp){
        System.out.println("\n" + name + " " + lvl + " lvl " + xp + "/" + maxXp + "xp " + hp + "hp");
    }








    public void setXp(int i){
        xp = i;
    }
    public int getXp(){
        return xp;
    }
    public void setLvl(String i){
        lvl = i;
    }
    public String getLvl(){
        return lvl;
    }
    public void setHp(int i){
        hp = i;
    }
    public int getHp(){
        return hp;
    }

}
