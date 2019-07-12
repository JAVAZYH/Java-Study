package com.atguigu.customerSystem.java;

/**
 * 
 * CustomerList : 1.用来保存所有的数据 2.用来对所有的数据进行处理。 添加用户，删除用户，修改用户，获取用户。
 *
 */
public class CustomerList {

	private Customer[] customers;// 用来保存客户对象的数组
	private int total = 0; // 记录已保存客户对象的数量

	/**
	 * 用来初始化数组
	 * 
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
	}

	/**
	 * 用来添加用户
	 * 
	 * @param customer
	 *            : 要添加的用户
	 * @return 如果返回true表示添加成功，否则添加失败
	 */
	public boolean addCustomer(Customer customer) {
		// 校验 1.数组中是否还能存储用户 2.传进来的实参是否为null
		if (total >= customers.length) {
			return false;
		}

		if (customer == null) {
			return false;
		}
		// total的作用 ： 1.用来记录用户的数量
		customers[total] = customer;
		// total的作用 ： 2.下次存放数据的索引值
		total++;
		// customers[total++] = customer;和上面的两行代码效果一样
		return true;
	}

	/**
	 * 修改用户
	 * 
	 * @param index
	 *            : 要替换掉的用户的索引值
	 * @param cust
	 *            ：新用户要去替换原来的用户
	 * @return 如果返回true表示替换成功，否则替换失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {

		// 校验 ：1.索引值的合理范围 （0 ~ (total - 1)） 2.新用户是否为null
		if (index < 0 || index >= total) {
			return false;
		}
		if (cust == null) {
			return false;
		}

		customers[index] = cust;
		return true;
	}

	/**
	 * 删除用户
	 * 
	 * @param index 要删除用户的索引值
	 * @return 如果返回true删除成功，如果返回false删除失败
	 */
	public boolean deleteCustomer(int index) {

		// 校验 ：索引值的合理范围 0 ~ （total - 1）
		if (index < 0 || index >= total) {
			return false;
		}
		// 后一个用户替换前一个用户
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}

		// 最后一个元素变为null
		customers[total - 1] = null; // total - 1 ：total的值没变
		// 总人数减去1
		total--;

		// customers[--total] = null;和上面的两行代码一样
		return true;
	}

	/**
	 * 获取所有的用户
	 * 
	 * @return Customer[] - 所有的用户
	 */
	public Customer[] getAllCustomers() {
		// 创建一个数组用来存放用户。有几个用户数组的长度就是几
		Customer[] cs = new Customer[total];
		// 将customers中的用户存到cs中
		for (int i = 0; i < cs.length; i++) {
			cs[i] = customers[i];
		}
		return cs;
	}

	/**
	 * 获取指定的用户
	 * 
	 * @param index 要获取的用户的索引值
	 * @return Customer的对象，如果不存在返回null
	 */
	public Customer getCustomer(int index) {
		// 校验 ：1.索引值的合理范围 （0 ~ (total - 1)） 2.新用户是否为null
		if (index < 0 || index >= total) { //预防空指针的问题
			return null;
		}
		return customers[index];
	}
}
