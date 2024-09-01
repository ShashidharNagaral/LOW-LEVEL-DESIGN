package AbstractFactoryPattern.ApplicationUI;


import AbstractFactoryPattern.*;
import AbstractFactoryPattern.WindowsOS.WindowsButton;
import AbstractFactoryPattern.WindowsOS.WindowsCheckBox;
import AbstractFactoryPattern.WindowsOS.WindowsDropDown;
import AbstractFactoryPattern.WindowsOS.WindowsInputBox;

public class WindowsUI implements UI {
    @Override
    public Button renderButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox renderCheckbox() {
        return new WindowsCheckBox();
    }

    @Override
    public InputBox renderInputBox() {
        return new WindowsInputBox();
    }

    @Override
    public DropDown renderDropDown() {
        return new WindowsDropDown();
    }
}
