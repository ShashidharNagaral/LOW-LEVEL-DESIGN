package AbstractFactoryPattern.ApplicationUI;


import AbstractFactoryPattern.*;
import AbstractFactoryPattern.LinuxOS.*;


public class LinuxUI implements UI {
    @Override
    public Button renderButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox renderCheckbox() {
        return new LinuxCheckBox();
    }

    @Override
    public InputBox renderInputBox() {
        return new LinuxInputBox();
    }

    @Override
    public DropDown renderDropDown() {
        return new LinuxDropDown();
    }
}
