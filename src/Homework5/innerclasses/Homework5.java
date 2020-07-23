package Homework5.innerclasses;

import static Homework5.innerclasses.DisplayStatus.ON;
import static Homework5.innerclasses.DisplayStatus.OFF;
import static Homework5.innerclasses.DisplayStatus.BLOCK;


public class Homework5 {
    public static void main(String[] args) {

        Identifier<String> stringIdentifier = new StringIdentifier("321");
        Mobile siemens = new Mobile(OFF, true, true, stringIdentifier);
        siemens.showInnerState();


        Identifier<Integer> integerIdentifier = new IntegerIdentifier(8);
        Mobile nokia = new Mobile(ON, false, true, integerIdentifier);
        nokia.showInnerState();


        Identifier<String> identifier = new StringIdentifier("f5774c7c-c077-11ea-b3de-0242ac130004");
        Mobile ZTE = new Mobile(BLOCK, false, false, identifier);
        ZTE.showInnerState();


    }
}