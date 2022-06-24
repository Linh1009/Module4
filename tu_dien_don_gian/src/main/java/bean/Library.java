package bean;

public class Library {
    private String english;
    private String vietName;

    public Library() {
    }

    public Library(String english, String vietName) {
        this.english = english;
        this.vietName = vietName;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietName() {
        return vietName;
    }

    public void setVietName(String vietName) {
        this.vietName = vietName;
    }
}

