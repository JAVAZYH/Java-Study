package zyh.atguigu.myteam.domain;

import zyh.atguigu.team.domain.Designer;
import zyh.atguigu.team.domain.Equipment;

public class Architect extends Designer{

	private int stock;

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary,
                     Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

	@Override
	public String toString() {
		return getEmployeeDes() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" 
				+ getStock() + "\t"+ getEquipment().getDescription();
	}

	@Override
	 public String showTeamInfo(){
		 return getMemberId() +"/" + getId() + "\t" 
				 + getName() + "\t" + getAge() + "\t" + getSalary()
				 + "\t架构师\t" + getBonus() + "\t" + getStock();
	 }
}
