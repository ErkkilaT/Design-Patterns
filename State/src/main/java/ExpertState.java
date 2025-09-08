public class ExpertState  extends State{
    private final static int REQUIRED_XP_TO_LEVEL = 90;

    public ExpertState(Game game){
        super(game);
    }
    public void takeTurn(){
        getGame().printCharStats(REQUIRED_XP_TO_LEVEL);
        String[] options = {"Train", "Meditate", "Fight"};

        switch(getGame().readUserOption(options)){
            case 1:
                getGame().setXp(getGame().getXp() + 10);
                break;
            case 2:
                getGame().setHp(getGame().getHp() + 50);
                break;
            case 3:
                getGame().setXp(getGame().getXp() + 15);
                getGame().setHp(getGame().getHp() - 50);
                break;
        }
        if(getGame().getXp() >= REQUIRED_XP_TO_LEVEL){
            getGame().setLvl("Master");
            getGame().setState(new MasterState(getGame()));
        }
    }
}
