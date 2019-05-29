package Translation;

@SuppressWarnings("ALL")
public class Token {
    public String name;
    public String type;

    public String scopeName;

    public Token(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s_%s", this.scopeName, this.name);
    }
}
