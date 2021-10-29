package zyh.atguigu.day14.java4;


interface IUSB{
	void start();
	void close();
}

interface IBluetooth{
	void connect();
	void disconnect();
}

class Mouse implements IUSB{

	@Override
	public void start() {
		System.out.println("鼠标运行了");
	}

	@Override
	public void close() {
		System.out.println("鼠标停止了");
	}
	
}

class Printer implements IUSB,IBluetooth{

	@Override
	public void start() {
		System.out.println("打印机运行了");
	}

	@Override
	public void close() {
		System.out.println("打印机停止了");
	}

	@Override
	public void connect() {
		System.out.println("打印机已连接蓝牙");
	}

	@Override
	public void disconnect() {
		System.out.println("蓝牙已断开");
	}
	
}

class Computer{
	
	public void run(IUSB usb){
		usb.start();
		System.out.println("---------usb设备运行中----------");
		usb.close();
	}
	
	public void runBluetooth(IBluetooth bt){
		bt.connect();
		System.out.println("----------蓝牙设备运行中-------");
		bt.disconnect();
	}
}



public class USBTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Mouse mouse = new Mouse();
		
		computer.run(mouse);
		
		computer.run(new Printer());
		
		System.out.println("------------------------");
		
		computer.runBluetooth(new Printer());
	}
}

