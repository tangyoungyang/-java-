package Demo;
/**
 * 
 *@author tangyang
 * @version 1.0
 */
import java.util.*;
public class Demo1 {
	//��ʾ��ʾ��Ϣ�ķ���
    public void notice(){
    	System.out.println();
    	System.out.println("****************************");
    	System.out.println("          1--��������");
    	System.out.println("          2--��ʾ��������");
    	System.out.println("          3--��ָ��λ�ô���������");
    	System.out.println("          4--��ѯ�ܱ�3 ����������");
    	System.out.println("          0--�˳�");
    	System.out.println("****************************");
    	System.out.println("�������Ӧ�����ֽ��в���:");
    }
    //�������ݵķ���
    public void insertData(int[] arr) {
		for(int i=0;i<9;i++) {
			System.out.println("�������"+(i+1)+"������");
			Scanner input = new Scanner(System.in);			
			arr[i] = input.nextInt();
		}
		for(int i=0;i<9;i++) {
			System.out.print(arr[i]+"  ");
		}	
    }
    //��ʾ�������ݵķ���
    public void showData(int[] a) {
    	for(int i=0;i<10;i++) {
    		if(a[i]!=0) {
    			System.out.print(a[i]+"  ");
    		}
    	}
    }
    //��ָ��λ�ô��������� 
    public void insertAtArray(int[] a,int n,int k) {
    	if(k == 9) {
    		a[9] = n;
    	}
    	if(k>=1 && k<=8) {
    		for(int i=9; i>k-1; i--) {
    			a[i]=a[i];
    		}
    		a[k-1]=n;
    	}//��ʦ������������黹���е�û�㶮������
    	for(int j:a) {
    		System.out.print(j+"  ");
    	}
    }
    //��ѯ�ܱ�3����������
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
	    		System.out.println("�˳�����");
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
	    			System.out.println("������Ҫ��������ݣ�");
	    			int i = input.nextInt();
	    			System.out.println("������Ҫ�����λ��:");
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
