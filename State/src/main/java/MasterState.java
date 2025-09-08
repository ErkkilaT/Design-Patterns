public class MasterState extends State{
    public MasterState(Game game){
        super(game);
    }

    public void takeTurn(){
        System.out.println("Wohoo you are a master!!!!!");
        String[] options = {"Start New Game"};
        if(getGame().readUserOption(options) == 1){
            getGame().setState(new NoviceState(getGame()));
        }
    }
}
