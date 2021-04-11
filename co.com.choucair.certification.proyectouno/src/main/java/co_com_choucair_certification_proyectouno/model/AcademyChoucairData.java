package co_com_choucair_certification_proyectouno.model;

public class AcademyChoucairData {
    private String strUser;
    private String strPassword;
    private String strCourse;

    public String getStrUser() {
        return strUser;
    }

    public AcademyChoucairData(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }
}
