public class Mensch extends Saugetier {
    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    public Mensch(){}

    @Override
    public String printall() {
        return getGeschlecht()+"#"+getName()+"#"+getAlter();
    }
}
