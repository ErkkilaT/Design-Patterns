class AFactory extends UIFactory{
    @Override
    public Button createButton(String s) {
        return new ButtonA(s);
    }

    @Override
    public Checkbox createCheckbox(String s) {
        return new CheckboxA(s);
    }

    @Override
    public TextField createTextField(String s) {
        return new TextFieldA(s);
    }
}
