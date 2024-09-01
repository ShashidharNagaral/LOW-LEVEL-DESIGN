package AbstractFactoryPattern.ApplicationUI;

import AbstractFactoryPattern.*;
import AbstractFactoryPattern.MacOS.MacButton;
import AbstractFactoryPattern.MacOS.MacCheckBox;
import AbstractFactoryPattern.MacOS.MacDropDown;
import AbstractFactoryPattern.MacOS.MacInputBox;

public class MacUI implements UI {
    @Override
    public Button renderButton() {
        return new MacButton();
    }

    @Override
    public Checkbox renderCheckbox() {
        return new MacCheckBox();
    }

    @Override
    public InputBox renderInputBox() {
        return new MacInputBox();
    }

    @Override
    public DropDown renderDropDown() {
        return new MacDropDown();
    }
}
