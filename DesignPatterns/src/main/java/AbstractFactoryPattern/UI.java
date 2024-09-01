package AbstractFactoryPattern;

public interface UI {
    public Button renderButton();
    public Checkbox renderCheckbox();
    public InputBox renderInputBox();
    public DropDown renderDropDown();
}
