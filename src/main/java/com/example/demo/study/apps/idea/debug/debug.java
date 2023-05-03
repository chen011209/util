package com.example.demo.study.apps.idea.debug;

/**
 * 断点调试 循环内的断点相当于多个断点 即十次循环需要十次 Resume Program
 * <p>
 * 断点：在左边行号栏单击左键，或者快捷键Ctrl+F8 打上/取消断点，断点行的颜色可自己去设置。
 * Show Execution Point (Alt + F10)：如果你的光标在其它行或其它页面，点击这个按钮可跳转到当前代码执行的行(页面跳转过来看，而不是代码跳转)。
 * <p>
 * <p>
 * Step Over (F8)：步过，一行一行地往下走，如果这一行上有方法不会进入方法。
 * Step Into (F7)：步入，如果当前行有方法，可以进入方法内部，一般用于进入自定义方法内，不会进入官方类库的方法。
 * Force Step Into (Alt + Shift + F7)：强制步入，能进入任何方法，查看底层源码的时候可以用这个进入官方类库的方法。
 * Step Out (Shift + F8)：步出，从步入的方法内退出到方法调用处，此时方法已执行完毕，只是还没有完成赋值。
 * Resume Program (F9)：恢复程序(运行到下个断点)，比如，你在第20行和25行有两个断点，当前运行至第20行，按F9，则运行到下一个断点(即第25行)，再按F9，则运行完整个流程，因为后面已经没有断点了。
 * <p>
 * Run to Cursor (Alt + F9)：运行到光标(程序光标 而不是鼠标)处，你可以将光标定位到你需要查看的那一行，然后使用这个功能，代码会运行至光标行，而不需要打断点。
 * <p>
 * <p>
 * 右键断点设置条件断点   可以在循环中设置条件断点 否则每次循环都会进入断点
 * 可以添加异常断点 当发生异常时到异常抛出位置 设置全部Exception可能会有问题 系统其他地方如idea的异常也会被捕获 最好捕获自定义异常
 * 可以直接在variables中右键变量修改变量值
 * <p>
 * 查看变量：
 * 在IDEA中，参数所在行后面会显示当前变量的值。
 * 光标悬停到参数上，显示当前变量信息。点击打开详情。
 * 在Variables里查看，这里显示当前方法里的所有变量。
 * Evaluate计算表达式
 * 在Watches里，点击New Watch，输入需要查看的变量。或者可以从Variables里拖到Watches里查看。通过在watches直接加计算式和函数来检测运算式子的值
 * (不常用)甚至可以更改变量的值 直接d.setT(20) 可以将值改为20 而且始终保持为20 因为程序每执行一句后都需要执行Evaluate计算表达式
 *
 *
 * 断点回退用DropFrame可以回到方法调用前 断点回退只能重新走一下流程，之前的某些参数和变量/数据的状态已经改变
 */
public class debug {


	public int t;

	public int setT(int t) {
		this.t = t;
		return this.t;
	}


	public static void main(String[] args) {

//		System.out.println(test);
//
//		debug d = new debug();
//
//		d.setT(123);
//
//		System.out.println(d.t);
//
//		System.out.println(d.t);
//
//		d.setT(12);
//
//		System.out.println(d.t);
//
//		String s = "method";
//		int test =1;
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 2; j++) {
//				test++;
//				System.out.println(test);
//
//				method(s);
//			}
//		}

		debug d = new debug();
		d.setT(0);

		for (int i = 0; i < 10; i++) {
			increaseT(d);
		}


//		throwException();

	}


	public static void throwException() {
		try {
			throw new MyEx();
		} catch (MyEx e) {
			e.printStackTrace();
		}
	}


	public static void increaseT(debug d){
		d.t++;
		System.out.println(d.t);
	}



	public static String method(String s) {
		System.out.println(s);
		return s;
	}
}
