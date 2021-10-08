package Doctor;

public class docinfo {

    String code;
    String name;
    String spec;
    int a;

    public docinfo() {
    }

    public docinfo(String code, String name, String spec, int a) {
        this.code = code;
        this.name = name;
        this.spec = spec;
        this.a = a;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return  "|" + "Doctor code:" + code + "|" + "Doctor name: "+name + "|" + "Doctor specialization: "+spec + "|" +" Doctor Avalability:" +a + "|";
    }

}
