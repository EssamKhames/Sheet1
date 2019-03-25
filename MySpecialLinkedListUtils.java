package sheet2;
 

public class MySpecialLinkedListUtils {
public static void main (String[]args) {

	LinkedListNode i =new LinkedListNode() ;
	LinkedListNode m =new LinkedListNode() ;
	LinkedListNode n =new LinkedListNode() ;
	i.value=5;
	i.next=m;
	m.value=3;
	m.next=n;
	n.value=2;
	reverse(i);
}
public static double[] summary(LinkedListNode head) {
	double [] x =new double[5];
	LinkedListNode i = head ;
	LinkedListNode n = head ;
	double length=0 ;
	double sum =0 ;
	double average =0 ;
	double max =head.getValue() ;
	double min =head.getValue() ;
	double median =head.getValue() ;
	while( i != null ) {
		sum= sum+ i.getValue() ;
		length ++ ;
		i=i.getNext();
}
	while( n !=null) {
			if(max<n.getValue()) {
				max=n.getValue();
				}
			if(min>n.getValue()) {
				min=n.getValue();
				}
			n=n.getNext();
	}
	average = sum/length ;
	if(length%2==0) {
		length = length/2;
		for(int z=0 ; z<length ; z++) {
			head=head.getNext();
		}
		median = head.getValue();
	}
	if(length%2 !=0) {
		length = (length+1)/2;
		for(int z=1 ; z<length ; z++) {
			head=head.getNext();
		}
		median = head.getValue();
	}
	x[0]=sum;
	x[1]=average ; 
	x[2]=median ; 
	x[3]=max;
	x[4]=min;
	
	return x ;	
}
public static LinkedListNode reverse(LinkedListNode head) {
	LinkedListNode N = new LinkedListNode()  ;
	LinkedListNode M = head ;
	int length=0;
	while( M != null ) {
		length++;
		M=M.getNext();
	}
	for(int i =0 ; i < (length+1)/2 ; i++) {
		for(int l = 0 ; l<(length-i) ; l++) {
			if(l==length-i-1) {
				N.value=head.getValue();
				for(int m=0;m<(length-i-1);m++) {
					N.next=head.getNext();
				}
			}
		}
	}
return N ;}
}
