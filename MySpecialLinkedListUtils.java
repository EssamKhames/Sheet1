package sheet2;
 

public class MySpecialLinkedListUtils {
public static void main (String[]args) {

	LinkedListNode i =new LinkedListNode() ;	
	LinkedListNode m =new LinkedListNode() ;
	LinkedListNode s =new LinkedListNode() ;
	LinkedListNode b =new LinkedListNode() ;
	i.value=5;
	m.value=2;
	s.value=0;
	b.value=3;
	i.next=m;
	m.next=s;
	s.next=b;
	b.next=null;
	insertionSort(i);
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
	LinkedListNode Next = new LinkedListNode()  ;
	LinkedListNode current = head ;
	LinkedListNode previous = null ;
	while(current!=null) {
		Next=current.getNext();
		current.next = previous ;
		previous = current ; 
		current=Next  ;
	}

return previous ;
}
public static LinkedListNode removeCentralNode(LinkedListNode head) {
	LinkedListNode counter = head ; 
	LinkedListNode New = head ; 
	int l=0;int flag = 0 ;
	while(counter!=null) {
		l++;
		counter=counter.getNext();
	}if(l%2!=0) {
	for(int i=0 ; i<=(l)/2;i++) {
		if(i==(l/2)-1) {
			New.next=New.getNext().getNext();
			flag =1 ;
		}
		if(flag ==0) {
		New=New.getNext();
	}}	}
	else {
		for(int i=1 ; i<=(l)/2;i++) {
			if(i==(l/2)-1) {
				New.next=New.getNext().getNext();
				flag =1 ;
			}
			if(flag ==0) {
			New=New.getNext();
		}}
	}
	return head ;
}
public static boolean palindrome(LinkedListNode head) {
LinkedListNode old = head ; 
LinkedListNode counter = head ; 
int flag=0 ; int i=0 ; int l=0 ; 
while(counter!=null) {
	l++;
	counter=counter.getNext();
}
for( i=0 ;i<l/2;i++) {
	LinkedListNode helper = head ; 
	for(int m=0;m<l-1-i;m++) {
		helper=helper.getNext();
	}
	if(helper.getValue()!=old.getValue()) {
		flag=1;
	}
	old=old.getNext();
}
if(flag==0) {
	return true ;
}
else {
	return false ;
}
 
}
public static LinkedListNode evenIndexedElements(LinkedListNode head) {
	LinkedListNode even1 = head ;	
	LinkedListNode counter = head ; 
	LinkedListNode current = head ;int l=0;
	while(counter!=null) {
		l++;
		counter=counter.getNext();
	}
	for(int i=0; i<l;i++) {
		if(i%2==0) {			
			even1.next=current;
		}
		current = current.getNext();
	}
retrun even1 ; 
}
public static LinkedListNode insertionSort(LinkedListNode head) {
	LinkedListNode counter = head ;
	LinkedListNode M = head ;
	int f=0 ; int i=0 ; int l=0 ; int flag=0;
	while(counter!=null) {
		l++;
		counter=counter.getNext();
	}
	for(i=0 ; i<l-1;i++) {
		LinkedListNode current = head ;
		LinkedListNode previous = head ; 
		flag=0;
		for(f=0;(f<l)&&flag==0;f++) {
			if(current.getValue()<head.getValue()||current.getValue()<M.getValue()) {
			flag=1;
			}else {
				current=current.getNext();
				if(f!=0) {
				previous=previous.getNext();
				}
			}}
			if(flag==1) {
		previous.next=current.getNext();
		current.next=head;
		head=current;
		}
		else {
				M=head.getNext();
			}
		}
	return head ;
}

}
