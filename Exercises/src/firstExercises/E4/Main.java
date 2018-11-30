package firstExercises.E4;

import java.io.*;

public class Main {

final static String adress="Data.txt";

public static void main(String[] args) throws FileNotFoundException, IOException{
try {	
	File file=new File(adress);
	if (!file.exists()) {
		file.createNewFile();
		System.out.println("File created in-> "+adress);
	}
	boolean flag=false;
	Folio folio;
	do {
	folio=new Folio();
	flag=Main.validateFolio(folio,file);
	}while(!flag);
	Main.writeFolio(folio,file);
	System.out.println("New folio generated:"+folio.getFolio());
	System.out.println("Saved in -> "+adress);
}catch(IOException A){
	System.out.println("Path not found-> "+adress);
};
}

public static void writeFolio(Folio folio,File file) throws FileNotFoundException, IOException {
	BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
	bw.write(folio.getFolio());
	bw.newLine();
	bw.close();
	}

public static boolean validateFolio(Folio folio,File file) throws FileNotFoundException, IOException {
	BufferedReader br=new BufferedReader(new FileReader(file));
	String value;
	while((value=br.readLine())!=null) {
		if (value.equals(folio.getFolio())) {
			br.close();
			System.out.println("Repeated");
			return false;
		}	
	}
	br.close();
	return true;
	}

}
