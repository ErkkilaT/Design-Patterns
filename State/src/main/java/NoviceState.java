public class NoviceState  extends State{
    private final static int REQUIRED_XP_TO_LEVEL = 30;

    public NoviceState(Game game){
        super(game);
        this.getGame().setXp(0);
        this.getGame().setHp(100);
        this.getGame().setLvl("Novice");

    }
    public void takeTurn(){
        getGame().printCharStats(REQUIRED_XP_TO_LEVEL);
        String[] options = {"Train"};
        if(getGame().readUserOption(options) == 1){
            getGame().setXp(getGame().getXp() + 10);
            if(getGame().getXp() >= REQUIRED_XP_TO_LEVEL){
                getGame().setLvl("Intermediate");
                getGame().setXp(0);
                getGame().setState(new IntermediateState(getGame()));
            }
        }
    }

}
