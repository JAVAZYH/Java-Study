package zyh.DesignPatterns.bulider.test;

/**
 * @ Author     ：aresyhzhang
 * @ Date       ：Created in 11:12 2021/12/10
 * @ Description：建造房子
 */
public class Room {
    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    @Override
    public String toString() {
        return "Room{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                '}'+"房子盖好了";
    }

    private String buildA;
    private String buildB;
    private String buildC;
}