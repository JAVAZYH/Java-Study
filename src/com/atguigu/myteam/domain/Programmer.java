package com.atguigu.myteam.domain;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/6
 * \* Time: 10:52
 * \
 */
public class Programmer extends Employee{
    private int memberId;

    @Override
    public String toString() {
        return getEmployeeDes() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    /*
     * 2/3	任我行	23	7000.0	程序员
     */
    public String showTeamInfo(){
        return getMemberId() +"/" + getId() + "\t"
                + getName() + "\t" + getAge() + "\t" + getSalary()
                + "\t程序员";
    }
    public Programmer() {
    }

    public Programmer(int memberId, Status status, Equipment equipment) {
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    private Status status=Status.FREE;
    private Equipment equipment;


}