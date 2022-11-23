public class Stage1 {
    private String nameBus1;
    private String where;
    private String nameBus2;
    private String nameBus3;
    private String where3;
    private String where2;

    public Stage1(String nameBus1, String where, String nameBus2, String nameBus3, String where3, String where2) {
        this.nameBus1 = nameBus1;
        this.where = where;
        this.nameBus2 = nameBus2;
        this.nameBus3 = nameBus3;
        this.where3 = where3;
        this.where2 = where2;
    }

    public String getNameBus2() {
        return nameBus2;
    }

    public void setNameBus2(String nameBus2) {
        this.nameBus2 = nameBus2;
    }

    public String getNameBus3() {
        return nameBus3;
    }

    public void setNameBus3(String nameBus3) {
        this.nameBus3 = nameBus3;
    }

    public String getWhere3() {
        return where3;
    }

    public void setWhere3(String where3) {
        this.where3 = where3;
    }

    public String getWhere2() {
        return where2;
    }

    public void setWhere2(String where2) {
        this.where2 = where2;
    }

    public String getNameBus1() {
        return nameBus1;
    }

    public void setNameBus1(String nameBus1) {
        this.nameBus1 = nameBus1;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    @Override
    public String toString() {
        return "1 | "+ nameBus1 +"|"+ "   | "+ where+"\n"+
                "2 | "+nameBus2 +"|"+ "   | "+ where2+"\n"+
                "3 | "+nameBus3 +"|"+ "   | "+ where3;
    }
}
