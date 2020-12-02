import java.util.Scanner;

public class SMSSerial {
//移动云mas短信平台，拓展码算法，客户每次发送短信查询短信总数然后生成拓展码，拓展码只能有3位
	public static void main(String args[]) {
  //输入数量为短信总数量输入0时无法送记录，则拓展码为100，输入899时为第899条短信拓展码为999，输入1000时为200
		System.out.println("输入总数：");
		Scanner input = new Scanner(System.in);
		int serialCount = input.nextInt();
		int serial = serialCount + 100;

		if (serial > 999) {
			serial = serial % 1000;
			if (serial > 899) {
				serial = (serial + 100) % 1000;
			}
			serial = serial + 100;
		}
		System.out.println("拓展码为："+serial);
	}
}
