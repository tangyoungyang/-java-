package Demo;
/**
 * 
 *@author tangyang
 * @version 1.0
 */
import java.util.*;
public class Demo1 {
	//显示提示信息的方法
    public void notice(){
    	System.out.println();
    	System.out.println("****************************");
    	System.out.println("          1--插入数据");
    	System.out.println("          2--显示所有数据");
    	System.out.println("          3--在指定位置处插入数据");
    	System.out.println("          4--查询能被3 整除的数据");
    	System.out.println("          0--退出");
    	System.out.println("****************************");
    	System.out.println("请输入对应的数字进行操作:");
    }
    //插入数据的方法
    public void insertData(int[] arr) {
		for(int i=0;i<9;i++) {
			System.out.println("请输入第"+(i+1)+"个数据");
			Scanner input = new Scanner(System.in);			
			arr[i] = input.nextInt();
		}
		for(int i=0;i<9;i++) {
			System.out.print(arr[i]+"  ");
		}	
    }
    //显示所有数据的方法
    public void showData(int[] a) {
    	for(int i=0;i<10;i++) {
    		if(a[i]!=0) {
    			System.out.print(a[i]+"  ");
    		}
    	}
    }
    //在指定位置处插入数据 
    public void insertAtArray(int[] a,int n,int k) {
    	if(k == 9) {
    		a[9] = n;
    	}
    	if(k>=1 && k<=8) {
    		for(int i=9; i>k-1; i--) {
    			a[i]=a[i];
    		}
    		a[k-1]=n;
    	}//老师：插入数据这块还是有点没搞懂。。。
    	for(int j:a) {
    		System.out.print(j+"  ");
    	}
    }
    //查询能被3整除的数据
    public void divThree(int[] a) {
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%3==0) {
    			System.out.print(a[i]+"  ");
    		}
    	}
    }
	public static void main(String[] args) {
		Demo1 de = new Demo1();
		int[] arr=new int[10];
	    while(true) {
	    	de.notice();
	    	Scanner input = new Scanner(System.in);
	    	int n = input.nextInt();
	    	if(n == 0) {
	    		System.out.println("退出程序");
	    		break;
	    	}else {
	    		switch(n) {
	    		case 1:
	    			de.insertData(arr);
	    			break;
	    		case 2:
	    			de.showData(arr);
	    			break;
	    		case 3:
	    			System.out.println("请输入要插入的数据：");
	    			int i = input.nextInt();
	    			System.out.println("请输入要插入的位置:");
	    			int j = input.nextInt();
	    			de.insertAtArray(arr, i, j);
	    			break;
	    		case 4:
	    			de.divThree(arr);
	    			break;
	    		}
	    	}
	    }
		

	}

}
