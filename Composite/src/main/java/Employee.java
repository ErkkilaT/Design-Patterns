class Employee extends Component{
    private int salary;
    public Employee(String name, int salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public void printData(String indent){
        System.out.println(indent + "<Employee>" + name + "</Employee>");

    }
    @Override
    public void add(Component c){
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
    @Override
    public void remove(Component c){
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
    @Override
    public Component getChild(int i){
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
    @Override
    public int getSalary(){
        return salary;
    }
}
