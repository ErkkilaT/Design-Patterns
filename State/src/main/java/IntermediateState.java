public class IntermediateState  extends State{
    private final static int REQUIRED_XP_TO_LEVEL = 60;

    public IntermediateState(Game game){
        super(game);
    }
    public void takeTurn(){
        getGame().printCharStats(REQUIRED_XP_TO_LEVEL);
        String[] options = {"Train", "Meditate"};

        switch(getGame().readUserOption(options)){
            case 1:
                getGame().setXp(getGame().getXp() + 10);
                break;
            case 2:
                getGame().setHp(getGame().getHp() + 50);
                break;
        }
        if(getGame().getXp() >= REQUIRED_XP_TO_LEVEL){
            getGame().setLvl("Expert");
            getGame().setXp(0);
            getGame().setState(new ExpertState(getGame()));
        }
    }
}
