package Tools;

import Interfaces.IOutputString;

public class ConsoleOutput implements IOutputString {
    @Override
    public void Out(String textOut) {
        System.out.println(textOut);
    }
}
