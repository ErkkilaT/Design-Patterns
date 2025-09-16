

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> forwardHistory;
    private ObservableList<String> timeStampHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.forwardHistory = new ArrayList<>();
        this.timeStampHistory = FXCollections.observableArrayList();
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
            timeStampHistory.remove(timeStampHistory.size()-1);
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
        timeStampHistory.add(currentState.getTimeStamp());
    }
    private void saveToForwardHistory(){
        IMemento currentState = model.createMemento();
        forwardHistory.add(currentState);
    }

    public ObservableList<String> getTimeStamps(){
        return timeStampHistory;

    }
    public void moveToTimeStamp(String ts){
        System.out.println("Moving to timestamp" + ts);
        for(int i = 0; i<history.size(); i++){
            if (history.get(i).getTimeStamp().equals(ts)){

                model.restoreState(history.get(i));

//                history.subList(i,history.size()).clear();
//                timeStampHistory.subList(i, timeStampHistory.size()).clear();
                gui.updateGui();
            }
        }
    }
}