

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> forwardHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.forwardHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        forwardHistory.clear();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        forwardHistory.clear();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            saveToForwardHistory(); //adding to forward list
            model.restoreState(previousState);
            gui.updateGui();
        }
    }
    public void redo(){
        if(!forwardHistory.isEmpty()){
            saveToHistory();
            System.out.println("Memento found in ForwardHistory");
            IMemento forwardState = forwardHistory.remove(forwardHistory.size()-1);
            model.restoreState(forwardState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }
    private void saveToForwardHistory(){
        IMemento currentState = model.createMemento();
        forwardHistory.add(currentState);
    }
}