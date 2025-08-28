class Main {
    public static void main(String[] args) {
        UIFactory factory1 = new AFactory();
        System.out.println("Factory 1 test: ");
        Button button1 = factory1.createButton("factory1 button");
        TextField textField1 = factory1.createTextField("factory1 textfield");
        Checkbox checkbox1 = factory1.createCheckbox("factory1 checkbox");

        button1.display();
        button1.setText("new text");
        button1.display();
        textField1.display();
        checkbox1.display();



        System.out.println();
        System.out.println("Factory 2 test: ");
        UIFactory factory2 = new BFactory();
        Button button2 = factory2.createButton("factory2 button");
        TextField textField2 = factory2.createTextField("factory2 textfield");
        Checkbox checkbox2 = factory2.createCheckbox("factory2 checkbox");
        button2.display();
        textField2.display();
        checkbox2.display();

    }
}
