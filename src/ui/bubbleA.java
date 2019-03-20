package ui;

import java.io.*;

public class bubbleA {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("data\\arraystosort.in");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String a = br.readLine();
			while(a != null) {
				int contador = 0;
				String[] num = a.split(" ");
				int[] array = new int[num.length];
				for (int k = 0; k < num.length; k++) {
					int u = Integer.parseInt(num[k]);
					array[k] = u;
				}
				PrintWriter pw = new PrintWriter(new File("data\\bubbleA-"+contador+".tx"));
				String t = null;
				boolean isOrdered = false;
					for (int i = 0; i < array.length-1 && !isOrdered; i++) {
							isOrdered = true;
							pw.print(t+ "\n");
						for (int j = 0; j < array.length-1-i; j++) {
							if(array[i]>array[i+1]) {
								isOrdered = false;
								int temp = array[i];
								array[i] = array[i+1];
								array[i+1] = temp;
								t += array[i]+""+" ";
							}
						}
					}		
			
			contador++;
			pw.close();
			fr.close();
			br.close();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
