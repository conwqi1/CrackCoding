public class replaceSpace{
public static char[] replaceSpaces (char[]str,int length){
	int spaceCount=0, newLength, i=0;
	for(i=0;i<length;i++){
		if ( str[i]==' ') {
			spaceCount++;
			}
	}
	
	newLength=length+spaceCount*2;
	char[]strNew=new char[newLength];
	newLength=0;
	  for (i=0;i<length;i++){
		  if (str[i]==' '){
			  strNew[newLength++]='%';
			  strNew[newLength++]='2';
			  strNew[newLength++]='0';
		  }else{
			  strNew[newLength++]=str[i];
		  }
	  }
	  return strNew;
}
public static void main(String[] args){
	
	  System.out.println(replaceSpaces("ab   bde".toCharArray(),8));
	}

}
