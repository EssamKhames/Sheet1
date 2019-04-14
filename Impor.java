package eg.edu.alexu.cad.datastructure.iceHockey;

class Impor implements IPlayerFinder {
	int w=0 ;int counter ;
	int [] Information = new int [4] ; /*startI,STARTJ,ENDI,ENDJ*/
public  java.awt.Point[]  findPlayers (String [] photo ,int team , int thershold){
	int [][] checkarray = new int [photo.length][photo[0].length()];
	java.awt.Point[] essam = new java.awt.Point[200];
	for(int i=0 ; i<photo.length;i++) {
		for(int j=0 ; j<photo[0].length();j++) {
			if(photo[i].charAt(j)==Integer.toString(team).charAt(0)&&checkarray[i][j]==0) {
			Information[0]=i; Information[1]=j;Information[2]=i;Information[3]=j;
			 searchinI(photo,team,thershold,Information[0],Information[1],Information[2],Information[3]);
			 searchinJ(photo,team,thershold,Information[0],Information[1],Information[2],Information[3]);
			if( checkarea(photo,team,thershold,Information[0],Information[1],Information[2],Information[3],checkarray)==true) {
				essam[w].x=(Information[0]+Information[2]+1);
				essam[w].y=(Information[1]+Information[3]+1);
				w++;
			}
			
			}
			
		}
	}
	return essam ;
	
	}
public void searchinJ (String [] photo , int team , int thershold,int startI,int startJ,int endI ,int endJ) {
	if(endJ+1<photo[0].length()&&startJ-1>=0) {
		if(photo[startI].charAt(endJ+1)==Integer.toString(team).charAt(0)&&photo[startI].charAt(startJ-1)==Integer.toString(team).charAt(0)) {
			Information[1]--;Information[3]++;
			searchinJ(photo,team,thershold,startI,startJ-1,endI,endJ+1);
		}}
	 else if(endJ+1<photo[0].length()) {
		 if (photo[startI].charAt(endJ+1)==Integer.toString(team).charAt(0)) {
			Information[3]++;
			 searchinJ(photo,team,thershold,startI,startJ,endI,endJ+1);
		 }}
		else if(startJ-1>=0){
		if(photo[startI].charAt(startJ-1)==Integer.toString(team).charAt(0)){
			Information[1]--;
			searchinJ(photo,team,thershold,startI,startJ-1,endI,endJ);
		}}
	}

	public void searchinI (String [] photo , int team , int thershold,int startI,int startJ,int endI ,int endJ) {
		if(endI+1<photo.length) {
			if(photo[endI+1].charAt(startJ)==Integer.toString(team).charAt(0)) {	
				Information[2]++;
				searchinI(photo,team,thershold,startI,startJ,endI+1,endJ);
			}}}
	public boolean checkarea (String[] photo,int team ,int thershold , int startI,int startJ , int endI ,int endJ,int [][]checkarray) {
		for(int i = startI;i<=endI;i++) {
			for(int j = startJ ; j<=endJ ; j++){
				if(photo[i].charAt(j)==Integer.toString(team).charAt(0)) {
					counter++;}}}
		if((counter*4)>=thershold) {	
			for(int i = startI;i<endI;i++) {
			for(int j = startJ ; j<endJ ; j++){
				checkarray[i][j]=1;
			}}
			return true ;
			}else {return false ;}
	}

}

