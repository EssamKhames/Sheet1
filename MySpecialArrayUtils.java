package problem1;
import java.math.BigInteger;
import java.util.Scanner;

public class MySpecialArrayUtils {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int size =input.nextInt();
	int [][] x = new int[size][size];
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
		x[i][j]=input.nextInt();
	}}
}

public static void reverse (int []arr) {
	int size = arr.length;
	int right =0;
	int left = size-1 ;
	int temp = 0;
	for( ; right<left ; left--,right++) {
		temp = arr[right];
		arr[right]=arr[left];
		arr[left]=temp;
	}
	
}
public static int[] SumEvenOdd (int []arr) {
	int size = arr.length;
	int end = size-1;
	int [] sum=new int [2];
	if(end!=0) {
	for(int i=0 ; i<=end ; i++) {
		if(i%2==0) {
			sum[0]=sum[0]+arr[i];
		}
		else {
			sum[1]=sum[1]+arr[i];
		}
	}}
	else {
		sum[0]=0;sum[1]=0;
	}
	for(int i =0 ; i<2;i++) {
		System.out.print(" "+sum[i]);
	}
	return sum ;
}
public static double average(int[] arr) {
	int size = arr.length;
	int end = size-1;
	long sum =0;
	if(end!=0) {
		if(size<1000000) {
		double aver =0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		aver=sum/size ;
		return aver;
		}
		else {
			long aver=0;
			for(int i=0;i<size;i++) {
				sum=sum+arr[i];
			}
			aver=sum/size ;
			return aver;
		}
	}
	else {
		int aver = 0 ;
		return aver ;
	}
	
}
public static void moveValue(int[] arr, int val) {
	int size = arr.length;
	int i = 0;
	int k=0;
	while(arr[i]!=val) {
		i++;
	}
	for( ; i<size-1 ;i++ ) {
		int breakpoint =0;
		if(arr[size-1]!=val) {
		while(arr[i+k]==arr[i+k+1] && i+k+1<size-1 ) {
			k++;
		 breakpoint =1;
		}
	  if(arr[i]==val ) {
		if(breakpoint==0) {
			arr[i]=arr[i+1];
			arr[i+1]=val;
			}
		else {
			arr[i]=arr[i+k+1];
			arr[i+k+1]=val;
			i=i+k-2;
			k=0;
		}
		}
		}
		else {break;}
		}

	}
public static void transpose(int[][] arr) {
	int i=0,j=0,size=arr.length;
	if(arr[0][size-1]!=0) {
		for(i=0 ;i<size;i++) {
			for(j=i;j<size;j++) {
				if(i!=j) {
				arr[j][i]=arr[i][j];
				arr[i][j]=0;}
			}
		}
	}
	else if (arr[i][j]==0 && arr[j][i]==0) {
		return ;
	}
	else {
		for(i=0 ;i<size;i++) {
			for(j=i;j<size;j++) {
				if(i!=j) {
				arr[i][j]=arr[j][i];
				arr[j][i]=0;}
			}
		}
	}
}
public static BigInteger fibonacci(int n)  {
	BigInteger B=new BigInteger("1");
	BigInteger A= new BigInteger("0");
	BigInteger F=new BigInteger("1");
	if(n == 1)  return A;
    else if(n==2) return B;
    	else {
    		for(int i=2 ; i<n ; i++) {
    			F=B.add(A);
    			A=B;
    			B=F;
    		}
    		return F;
    	}
      
}
}

