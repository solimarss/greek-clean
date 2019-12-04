package br.com.solimar.greek;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Verse> tr = new ArrayList<Verse>();
		List<Verse> ubs = new ArrayList<Verse>();
		
		//Verse trMt11 = new Verse("mt", "1", "1", "χαρις υμιν και ειρηνη απο θεου πατρος ημων και κυριου ιησου χριστου");
		//Verse ubsMt11 = new Verse("mt", "1", "1", "χάρις ὑμῖν καὶ εἰρήνη ἀπὸ θεοῦ πατρὸς ἡμῶν καὶ κυρίου Ἰησοῦ Χριστοῦ.");
		
		Verse trMt11 = new Verse("mt", "1", "1", "κατα την χαριν του θεου την δοθεισαν μοι ως σοφος αρχιτεκτων θεμελιον αλλος δε εποικοδομει εκαστος δε βλεπετω πως εποικοδομει");
		Verse ubsMt11 = new Verse("mt", "1", "1", "(1Co 3:1) Κἀγώ, ἀδελφοί, οὐκ ἠδυνήθην λαλῆσαι ὑμῖν ὡς πνευματικοῖς ἀλλ᾽ ὡς σαρκίνοις, ὡς νηπίοις ἐν Χριστῷ.");
		
		

		
		if (Compare.compare(trMt11, ubsMt11)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		System.out.println(ubsMt11.getText());

	}

}
