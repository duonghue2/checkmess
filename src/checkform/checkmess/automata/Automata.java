/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkform.checkmess.automata;

import java.util.stream.IntStream;

/**
 * s
 * 
 * @author tuanc
 */
public class Automata {
	public int finalState;
	
	int cur = -1;// to find reached state
	public static State0[] listState = new State0[] { new State0(), new State1(), new State2(), new State3(),
			new State4(), new State5(), new State6(), new State7(), new State8(), new State9(), new State10(),
			new State11(), new State12(), new State13(), new State14(), new State15(), new State16(), new State17(),
			new State18(), new State19(), new State20(), new State21(), new State22(), new State23(), new State24(),
			new State25(), new State26() };
	

	public State0 getState(int c) {
		return listState[c];
	}

	/**
	 * @param args the command line arguments
	 */
	public int result(String str) {
		int nextState = -7;

		State0 s = new State0();
		nextState = s.getNext(str.charAt(0), -1);
		Automata x = new Automata();
		s = x.getState(nextState);

		for (int i = 1; i < str.length(); i++) {

			nextState = s.getNext(str.charAt(i), x.cur);
		// System.out.println(nextState+":"+str.charAt(i)+" "+s.State);

			if (s.State > x.cur)
				x.cur = s.State;
			if (nextState < 0)
				break;
		
			s = x.getState(nextState);

		}
		
		return x.cur;
	}

	public static void main(String[] args) {
		int nextState = -1;
		String[] string = { "Frd abc B" };
		// String str = "";

		for (String str : string) {

			State0 s = new State0();
			nextState = s.getNext(str.charAt(0), -1);
			Automata x = new Automata();
			s = x.getState(nextState);

			// System.out.println(nextState+":"+str.charAt(0)+" "+s.State);

			for (int i = 1; i < str.length(); i++) {

				nextState = s.getNext(str.charAt(i), x.cur);
				System.out.println(nextState + ":" + str.charAt(i) + " " + s.State);

				if (s.State > x.cur)
					x.cur = s.State;

				if (nextState < 0)
					break;
				
				s = x.getState(nextState);

			}
			// System.out.println(nextState);

			/*System.out.print(str + ": " + x.cur);
			if (x.cur == 1)
				System.out.println("B/G missing");
			if (x.cur == 0)
				System.out.println("Frd missing");
			if (x.cur == 2)
				System.out.println("ok girl");
			if (x.cur == 3)
				System.out.println("ok man");
			if (x.cur == 4)
				System.out.println("missing del");
			if (x.cur == 5)
				System.out.println("ok del");
			if (x.cur == 7)
				System.out.println("RJ missing");
			if (x.cur == 8)
				System.out.println("B/G missing");
			if (x.cur == 9)
				System.out.println("Rejoin girl");
			if (x.cur == 10)
				System.out.println("Rejoin man");
			if (x.cur == 11)
				System.out.println("chg missing");
			if (x.cur == 12)
				System.out.println("chg ok");
			// if(nextState!=9) //s.show();
*/
		}

		System.exit(0);
	}
}
