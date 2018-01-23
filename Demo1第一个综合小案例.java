package demo;
/**
 * @author tangyang
 * 
 */
import java.util.*;
public class Demo3 {
	//显示提示信息的方法
	public void notice(){
    	System.out.println();
    	System.out.println("*******************************");
    	System.out.println("         1--插入显示数据                              ");
    	System.out.println("         2--显示数据                                     ");
    	System.out.println("         3--插入数据                                     ");
    	System.out.println("         4--查询能被3 整除的数据               ");
    	System.out.println("         0--退出程序                                     ");
    	System.out.println("*******************************");
    	System.out.println("请输入对应的数字进行操作:              ");   	
    }
	//插入数据的方法
	public void insertDate(int[] a) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			System.out.println("请输入第"+(i+1)+"个数据");
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("数据不能为0");
				i-=1;
				continue;			
			}else{
				a[i]=n;
			}
		}
		
		showDate(a);     //谢谢，老师上次帮我指出问题
	}
	//显示数据的方法
	public int[] showDate(int[] a) {
		for(int i=0;i<10;i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+"  ");
			}
		}
		return a;
	}
	//在指定位置插入数据
	public void insetAtArray(int[] a,int n,int k) {
		if(k==9) {
			a[k]=n;
		}
		if(k>=1&&k<=8) {
			for(int i=9;i>k-1;i--) {
				a[i]=a[i-1];
			}
			a[k-1]=n;
		}
			
		showDate(a);
	}
	//查询能被3整除的数据
	public void divThree(int[] a) {
		boolean flag = false;
		String str="";
		for(int i=0;i<9;i++) {
			if(a[i]%3==0 && a[i]!=0) {
				str=str+a[i]+" ";
                flag = true;
			}			
		}
		if(flag) {
			System.out.print(str);
		}else {
			System.out.println("数组中没有数据能被3整除");
		}		
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		Demo3 de = new Demo3();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			de.notice();
			int n = sc.nextInt();
			if(n == 0) {				
				System.out.println("退出程序");
				break;
			}else {
				switch(n) {
				case 1:
					de.insertDate(arr);
					break;
				case 2:
					de.showDate(arr);
					break;
				case 3:
					System.out.println("请输入要插入的数据:");
					int j = sc.nextInt();
					System.out.println("请输入要插入的位置:");
					int i = sc.nextInt();
					de.insetAtArray(arr, j, i);
					break;
				case 4:
					de.divThree(arr);
					break;
				default:
					System.out.println("输入错误请重新输入:");
					continue;
				}
			}
		}
	}

}
