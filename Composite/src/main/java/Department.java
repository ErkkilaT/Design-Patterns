import java.util.ArrayList;
import java.util.List;

class Department extends Component{
    private List<Component> children = new ArrayList<>();
    public Department(String name) {
        super(name);
    }

    @Override
    public void printData(String indent){
        System.out.println(indent + "<Department name=" + name + ">");
        for(Component c : children){
            c.printData(indent + "   ");
        }
        System.out.println(indent + "</Department>");
    }
    @Override
    public void add(Component c){
        this.children.add(c);

    }
    @Override
    public void remove(Component c){
        this.children.remove(c);
    }
    @Override
    public Component getChild(int i){
        return this.children.get(i);
    }
    @Override
    public int getSalary(){
        int totalSalary = 0;
        for(Component c : children){
            totalSalary += c.getSalary();
        }
        return totalSalary;
    }
}
