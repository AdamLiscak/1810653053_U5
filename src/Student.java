public class Student extends Mensch {
    private int matrikelnummer;
    private String studiengang;

    public Student( int alter, String geschlecht, String vorname, String nachname, int matrikelnummer, String studiengang)
    {
        super( alter, geschlecht, vorname, nachname);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public Student() {}

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    @Override
    public void status() {
        System.out.println("Es handelt sich um einen Studenten"+" Vorname:"+getVorname()+" Nachnme:" +getNachname()+
                " Alter:"+getAlter()+" Matrikelnr:"+matrikelnummer+" Studiengang:"+studiengang);
    }
}
