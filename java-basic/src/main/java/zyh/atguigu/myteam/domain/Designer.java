package zyh.atguigu.myteam.domain;

import zyh.atguigu.team.domain.Equipment;
import zyh.atguigu.team.domain.Programmer;

public class Designer extends Programmer {

	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

	@Override
	public String toString() {
		return getEmployeeDes() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t" 
				+ getEquipment().getDescription();
	}
	

	@Override
	 public String showTeamInfo(){
		 return getMemberId() +"/" + getId() + "\t" 
				 + getName() + "\t" + getAge() + "\t" + getSalary()
				 + "\t设计师\t" + getBonus();
	 }
	
}
