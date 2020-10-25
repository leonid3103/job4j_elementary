package inheritance;

class Doctor extends Profession {
    public void setDiagnose(Diagnose diagnose) {
    }

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
    public Diagnose heal() {
        return null;
    }
}
