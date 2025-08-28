class BFactory extends UIFactory{
    @Override
    public Button createButton(String s) {
        return new ButtonB(s);
    }

    @Override
    public Checkbox createCheckbox(String s) {
        return new CheckboxB(s);
    }

    @Override
    public TextField createTextField(String s) {
        return new TextFieldB(s);
    }
}