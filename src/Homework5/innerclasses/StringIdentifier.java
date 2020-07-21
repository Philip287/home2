package Homework5.innerclasses;

public class StringIdentifier extends Identifier<String> {

    public StringIdentifier(String id) {
        super(id);
    }

    @Override
    public String getMobileReadableString() {
        try {
           return "" + (Integer.parseInt(id) + 1);
        } catch (NumberFormatException e) {
            System.out.println("Exception during parsing id as integer." + e);
        return super.getMobileReadableString();
        }
    }

}
