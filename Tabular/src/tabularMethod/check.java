package tabularMethod;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		HashMap<Integer, LinkedList<LinkedList>> list = new HashMap<Integer, LinkedList<LinkedList>>();
		Tabular check = new Tabular();
		Scanner s = new Scanner(System.in);
		String minterms = new String();
		minterms = s.nextLine();
		String[] splited = minterms.split("\\s+");
		int x;
		for(int i = 0; i < splited.length; i++)
		{
			 x =   Integer.parseInt(splited[i]);
			int y = check.numberOfOnes(x);
			check.addToList(y, x);
		}
		list = check.list;
		check.merge(check.generate(list));
		check.coverdByImplicant(check.result , splited) ;
		LinkedList<String> finall = new LinkedList<String>();
		finall = check.finalResult(check.result);
		for(int i = 0; i < finall.size(); i++)
		{
			System.out.println(finall.get(i));
		}
	}

}