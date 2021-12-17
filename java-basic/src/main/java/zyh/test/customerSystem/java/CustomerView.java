package zyh.test.customerSystem.java;

/**
 * CustomerView : 负责菜单的显示和处理用户操作
 * 
 * ctrl + 1 : 提示 （自动生成局部变量）
 * 
 * ctrl + shift + f : 格式化代码
 */
public class CustomerView {

	// 创建CustomerList的对象
	private CustomerList list = new CustomerList(10);
	
	public CustomerView(){
		//默认添加一条数据 - 向CustomerList的数组中添加的
		list.addCustomer(new Customer("小志玲", '女', 18, "153333333", "qq@qq.com"));
	}

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		do {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                 1 添 加 客 户");
			System.out.println("                 2 修 改 客 户");
			System.out.println("                 3 删 除 客 户");
			System.out.println("                 4 客 户 列 表");
			System.out.println("                 5 退       出");
			System.out.print("                请选择(1-5)：");
			// 读取菜单项
			char menuSelection = CMUtility.readMenuSelection();
			// 判断
			switch (menuSelection) {
			case '1': // 添加客户
				addNewCustomer();
				break;

			case '2':// 修改客户
				modifyCustomer();
				break;
			case '3':// 删除客户
				deleteCustomer();
				break;
			case '4': // 客户列表
				listAllCustomers();
				break;
			case '5':// 退出
				System.out.print("确认是否退出(Y/N):");
				// 读取确认是否退出
				char confirmSelection = CMUtility.readConfirmSelection();
				// 判断是否退出
				if (confirmSelection == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}
		} while (isFlag);
	}

	/**
	 * 添加一个新用户
	 */
	private void addNewCustomer() {
		/*
		 * ---------------------添加客户--------------------- 姓名:aa 性别:男 年龄:18
		 * 电话:110 邮箱:120 ---------------------添加完成---------------------
		 */
		System.out.println("---------------------添加客户---------------------");
		// 1.读取内容
		System.out.print("姓名:");
		// 读取姓名的内容
		String name = CMUtility.readString(10);
		System.out.print("性别:");
		// 读取性别的内容
		char gender = CMUtility.readChar();
		System.out.print("年龄:");
		// 读取年纪的内容
		int age = CMUtility.readInt();
		System.out.print("电话:");
		// 读取电话内容
		String phone = CMUtility.readString(15);
		System.out.print("邮箱:");
		// 读取邮箱内容
		String email = CMUtility.readString(30);
		// 2.封装对象
		Customer customer = new Customer(name, gender, age, phone, email);
		// 3.将对象保存到数组中 - 保存到CustomerList的类中的数组中
		boolean addCustomer = list.addCustomer(customer);
		// 4.判断是否添加成功
		if (addCustomer) {
			System.out.println("---------------------添加成功---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}

	}

	/**
	 * 修改用户
	 */
	private void modifyCustomer() {
		/*
		 * ---------------------修改客户---------------------
			请选择待修改客户编号(-1退出)：5
			无法找到指定用户
			请选择待修改客户编号(-1退出)：1
			姓名(aa):cc
			性别(男):
			年龄(18):
			电话(110):
			邮箱(aaa@qq.com):
			---------------------修改完成--------------------- 
		 */
		System.out.println("---------------------修改客户---------------------");
		boolean isFlag = true;
		Customer customer = null; //局部变量没有默认值
		int id = 0;
		while(isFlag){
			System.out.print("请选择待修改客户编号(-1退出)：");
			//读取用户编号
			id = CMUtility.readInt();
			//判断如果编号为-1则退出
			if (id == -1) {
				return;
			}
			//如果编号不为-1需要判断该用户是否存在
			customer = list.getCustomer(id - 1);
			//如果customer为null则说明该用户不存在,否则就是存在
			if (customer != null) {
				break;
			}else{
				System.out.println("该用户不存在");
			}
		}
		//用户存在
		//1.读取新的内容
		System.out.print("姓名(" + customer.getName()+"):");
		//读取新的姓名，如果不输入内容则使用原来的名字
		String name = CMUtility.readString(13, customer.getName());
		System.out.print("性别(" + customer.getGender()+"):");
		//读取新的性别，如果不输入内容则使用原来的性别
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄(" + customer.getAge()+"):");
		//读取新的年纪，如果不输入内容则使用原来的年纪
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话(" + customer.getPhone()+"):");
		//读取新的电话，如果不输入内容则使用原来的电话
		String phone = CMUtility.readString(15, customer.getPhone());
		System.out.print("邮箱(" + customer.getEmail()+"):");
		//读取新的邮箱，如果不输入内容则使用原来的邮箱
		String email = CMUtility.readString(30, customer.getEmail());
		
		//2.将新的内容封装到对象中
		Customer cust = new Customer(name, gender, age, phone, email);
		
		//3.将新的用户替换原来的用户
		boolean replaceCustomer = list.replaceCustomer(id - 1, cust);
		
		//4.判断是否替换成功
		if (replaceCustomer) {
			System.out.println("---------------------修改成功--------------------- ");
		} else {
			System.out.println("---------------------修改失败--------------------- ");
		}
			
	}

	/**
	 * 删除用户
	 */
	private void deleteCustomer() {
		/*
		 * ---------------------删除客户---------------------
			请选择待删除客户编号(-1退出)：2
			无法找到该用户
			请选择待删除客户编号(-1退出)：1
			确认是否删除(Y/N):Y
			---------------------删除完成---------------------
		 */
		System.out.println("---------------------删除客户---------------------");
		boolean isFlag = true;
		int id  = 0;
		while(isFlag){
			System.out.print("请选择待删除客户编号(-1退出)：");
			//读取用户编号
			id = CMUtility.readInt();
			//判断编号是否为-1,如果为-1则退出
			if(id == -1){
				return;
			}
			//如果编 号不是-1则判断该用户是否存在
			Customer customer = list.getCustomer(id - 1);
			//判断customer是否为null,如果为null则表示没找到该用户
			if (customer == null) {
				System.out.println("没有找到该用户");
			}else{//找取了用户则退出循环
				break;
			}
		}
		System.out.print("确认是否删除(Y/N):");
		//读取是否删除
		char selection = CMUtility.readConfirmSelection();
		//判断是否退出
		if (selection == 'Y') {//确定删除
			//把该对象从数组中删除
			boolean deleteCustomer = list.deleteCustomer(id - 1);
			//判断是否删除成功
			if (deleteCustomer) {
				System.out.println("---------------------删除成功---------------------");
			} else {
				System.out.println("---------------------删除失败---------------------");
			}
			return;
		} 
		System.out.println("-----------------------------------------------------");
	}

	/**
	 * 展示所有的用户
	 */
	private void listAllCustomers() {
		/*
		 * ---------------------------客户列表--------------------------- 编号 姓名 性别
		 * 年龄 电话 邮箱 1 小井 男 18 110 aaa@qq.com
		 * --------------------------客户列表完成-------------------------
		 */
		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话	\t邮箱");
		// 1.获取所有的用户
		Customer[] allCustomers = list.getAllCustomers();
		// 2.显示所有用户的信息
		for (int i = 0; i < allCustomers.length; i++) {
			// 获取每个用户
			Customer customer = allCustomers[i];
			// 输出用户信息
			System.out.println(i + 1 +
				"\t" + customer.getName() +
				"\t" + customer.getGender() +
				"\t" + customer.getAge() +
				"\t" + customer.getPhone() +
				"\t" + customer.getEmail());
	}
		System.out.println("--------------------------客户列表完成-------------------------");
	}

	/**
	 * 程序的入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 进入主菜单
		new CustomerView().enterMainMenu();
	}

}
