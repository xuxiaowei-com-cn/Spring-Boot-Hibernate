package cn.com.xuxiaowei.entity;

public class Salgrade {
    private Short grade;

    private Short losal;

    private Short hisal;

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public Short getLosal() {
        return losal;
    }

    public void setLosal(Short losal) {
        this.losal = losal;
    }

    public Short getHisal() {
        return hisal;
    }

    public void setHisal(Short hisal) {
        this.hisal = hisal;
    }

    @Override
    public String toString() {
        return "Salgrade{" +
                "grade=" + grade +
                ", losal=" + losal +
                ", hisal=" + hisal +
                '}';
    }

}