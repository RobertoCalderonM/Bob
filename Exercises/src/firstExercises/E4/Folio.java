package firstExercises.E4;


public class Folio {

private String genFolio;

public Folio(boolean mode) {
this.genFolio="";
	for (int i=1;i<=3;i++) {
		this.genFolio+=genString(i,mode);
		if (i<3) {
		this.genFolio+="-";}
	}
}

private String genString(int N, boolean mode) {
	char[] elements= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	char[] folioChar;
	String folioString;
	folioChar=new char[9];
	switch (N) {
	case 1:	
		folioChar=genStringCase(mode,9,elements); //mode (true= ISO folio, false= not implemented)
		break;
		
	case 2:
		folioChar=genStringCase(false,8,elements);
		break;	
	case 3:
		folioChar=genStringCase(false,7,elements);
		break;	
	}
	
	folioString=String.valueOf(folioChar);
	return folioString;
}

private boolean validateChar(int ActualIndex,int LastIndex) {
	if (ActualIndex>9 && LastIndex>9) {
	return false;
}
	return true;
	}

private char[] genStringCase(boolean ISO,int size,char[] elements) {
	char[] folioChar=new char[size];
	int ActualIndex=0,LastIndex=0;
	System.currentTimeMillis();
	for (int i=0;i<size;i++) {
		if (i==0 && ISO) {
			String iso=genISO();
			folioChar[0]=iso.charAt(0);
			folioChar[1]=iso.charAt(1);
			folioChar[2]=iso.charAt(2);
			i=2;
		}else {
			do {
			ActualIndex= (int)(Math.random()*elements.length);
			folioChar[i]=elements[ActualIndex];
			}while(!validateChar(ActualIndex,LastIndex));
			LastIndex=ActualIndex;
		}
	}
	
	return folioChar;
	
}

public String getFolio() {
	return this.genFolio;
}

public void setFolio(String genFolio) {
	this.genFolio=genFolio;
}

private String genISO() {
	String[] ISO= {"AGU","BCN","BCS","CAM","CHP","CHH","CMX","COA","COL","DUR","GUA","GRO","HID","JAL","MEX"
			,"MIC","MOR","NAY","NLE","OAX","PUE","QUE","ROO","SLP","SIN","SON","TAB","TAM","TLA","VER","YUC","ZAC"};
	System.currentTimeMillis();
	int value=(int) (Math.random()*ISO.length);
	String genIso=ISO[value];
	return genIso;
	}
}

