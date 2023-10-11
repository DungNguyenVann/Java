package BaiTap_DongGoi;

public class classes {
    private int idClass;
    private String name;


    void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    void setName(String name) {
        this.name = name;
    }

    int getIdClass() {
        return this.idClass;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return idClass + name;
    }
}
