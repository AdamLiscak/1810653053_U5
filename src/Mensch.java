public class Mensch extends Saugetier {
    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Mensch(String name, int alter, String geschlecht, String vorname, String nachname)
    {
        super(name, alter, geschlecht);
        this.vorname = vorname;
        this.nachname = nachname;
    }
    public Mensch(int alter, String geschlecht, String vorname, String nachname)
    {
        super( alter, geschlecht);
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Mensch(String name, int alter, String geschlecht)
    {
        super(name, alter, geschlecht);
    }
    public Mensch(){}

    @Override
    public String printall() {
        return getGeschlecht()+"#"+getName()+"#"+getAlter();
    }
    public void status()
    {
        System.out.println("Es handelt sich um einen Menschen"+" Vorname:"+vorname+" Nachnme:"+nachname+
                " Alter:"+getAlter());
    }
}
