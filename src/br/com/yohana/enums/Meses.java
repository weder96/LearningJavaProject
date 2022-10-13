package br.com.yohana.enums;

public enum Meses {
    JANUARY(1, "January", "MVP"),
    FEBRUARY(2, "February", "FFF"),
    MARC(3, "Marc", "MMM");

    private int code;
    private String description;
    private String zip;

    private Meses(int code, String description, String zip) {
        this.code = code;
        this.description = description;
        this.zip = zip;
    }
;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
