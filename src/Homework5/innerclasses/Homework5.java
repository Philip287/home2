package Homework5.innerclasses;

public class Homework5
{
    public static void main(String[] args) {

        Identifier<String> stringIdentifier = new StringIdentifier("321");
        Mobile siemens = new Mobile(false, true, true, stringIdentifier, Mobile.Switcher.OFF);
        siemens.showInnerState();
        siemens.SwitcherMobile(Mobile.Switcher.ON);

        Identifier<Integer> integerIdentifier = new IntegerIdentifier(8);
        Mobile nokia = new Mobile(true, false, true, integerIdentifier, Mobile.Switcher.ON);
        nokia.showInnerState();
        nokia.SwitcherMobile(Mobile.Switcher.BLOCK);

        Identifier<String> identifier = new StringIdentifier("f5774c7c-c077-11ea-b3de-0242ac130004");
        Mobile ZTE = new Mobile(true, false, false, identifier, Mobile.Switcher.ON);
        ZTE.showInnerState();
        ZTE.SwitcherMobile(Mobile.Switcher.OFF);

    }
}