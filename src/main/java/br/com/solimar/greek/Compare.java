package br.com.solimar.greek;

public class Compare {

	
	private static String removePunctuation(String s) {
		s = s.replace(".", "");
		return s;
	}

	public static String replace(String verse) {
		String text = verse;
		text = text.replace('ί', 'ι');
		text = text.replace('ά', 'α');
		text = text.replace('ώ', 'ω');
		text = text.replace('ύ', 'υ');
		text = text.replace('Π', 'π');
		/**
		 * 
		
		text = text.replace('Ἀ', 'α');
		text = text.replace('ά', 'α');
		text = text.replace('ἀ', 'α');
		text = text.replace('ὰ', 'α');
		text = text.replace('ἄ', 'α');
		text = text.replace('έ', 'ε');
		text = text.replace('ἔ', 'ε');
		text = text.replace('ἐ', 'ε');
		text = text.replace('ὲ', 'ε');
		text = text.replace('ἕ', 'ε');
		text = text.replace('ὑ', 'υ');
		text = text.replace('ῖ', 'ι');
		text = text.replace('ὶ', 'ι');
		text = text.replace('ἰ', 'ι');
		text = text.replace('ή', 'η');
		text = text.replace('ὴ', 'η');
		text = text.replace('ὸ', 'ο');
		text = text.replace('ῦ', 'υ');
		text = text.replace('ἡ', 'η');
		text = text.replace('ί', 'ι');
		text = text.replace('Ἰ', 'ι');
		text = text.replace('ἴ', 'ι');
		text = text.replace('Χ', 'χ');
		text = text.replace('ῶ', 'ω');
		text = text.replace('ὡ', 'ω');
		text = text.replace('ώ', 'ω');
		
		 */
		
		text = text.replace('Ἰ', 'ι');
		text = text.replace('ό', 'ο');
		text = text.replace('ή', 'η');
		text = text.replace('έ', 'ε');
		
		text = text.replace('ἀ', 'α');
		text = text.replace('ἁ', 'α');
		text = text.replace('ἂ', 'α');
		text = text.replace('ἃ', 'α');
		text = text.replace('ἄ', 'α');
		text = text.replace('ἅ', 'α');
		text = text.replace('ἆ', 'α');
		text = text.replace('ἇ', 'α');
		text = text.replace('ὰ', 'α');
		text = text.replace('ά', 'α');
		text = text.replace('ᾀ', 'α');
		text = text.replace('ᾁ', 'α');
		text = text.replace('ᾂ', 'α');
		text = text.replace('ᾃ', 'α');
		text = text.replace('ᾄ', 'α');
		text = text.replace('ᾅ', 'α');
		text = text.replace('ᾆ', 'α');
		text = text.replace('ᾇ', 'α');
		text = text.replace('ᾲ', 'α');
		text = text.replace('ᾳ', 'α');
		text = text.replace('ᾴ', 'α');
		text = text.replace('ᾶ', 'α');
		text = text.replace('ᾷ', 'α');
		
		text = text.replace('ἐ', 'ε');
		text = text.replace('ἑ', 'ε');
		text = text.replace('ἒ', 'ε');
		text = text.replace('ἓ', 'ε');
		text = text.replace('ἔ', 'ε');
		text = text.replace('ἕ', 'ε');
		text = text.replace('έ', 'ε');
		text = text.replace('ὲ', 'ε');
		
		text = text.replace('ἠ', 'η');
		text = text.replace('ἡ', 'η');
		text = text.replace('ἢ', 'η');
		text = text.replace('ἣ', 'η');
		text = text.replace('ἤ', 'η');
		text = text.replace('ἥ', 'η');
		text = text.replace('ἦ', 'η');
		text = text.replace('ἧ', 'η');
		text = text.replace('ή', 'η');
		text = text.replace('ὴ', 'η');
		text = text.replace('ᾐ', 'η');
		text = text.replace('ᾑ', 'η');
		text = text.replace('ᾒ', 'η');
		text = text.replace('ᾓ', 'η');
		text = text.replace('ᾔ', 'η');
		text = text.replace('ᾕ', 'η');
		text = text.replace('ᾖ', 'η');
		text = text.replace('ᾗ', 'η');
		text = text.replace('ῂ', 'η');
		text = text.replace('ῃ', 'η');
		text = text.replace('ῄ', 'η');
		text = text.replace('ῆ', 'η');
		text = text.replace('ῇ', 'η');
		
		text = text.replace('ί', 'ι');
		text = text.replace('ὶ', 'ι');
		text = text.replace('ἰ', 'ι');
		text = text.replace('ἱ', 'ι');
		text = text.replace('ἲ', 'ι');
		text = text.replace('ἳ', 'ι');
		text = text.replace('ἴ', 'ι');
		text = text.replace('ἵ', 'ι');
		text = text.replace('ἶ', 'ι');
		text = text.replace('ἷ', 'ι');
		text = text.replace('ῒ', 'ι');
		text = text.replace('ΐ', 'ι');
		text = text.replace('ῖ', 'ι');
		text = text.replace('ῗ', 'ι');
		
		text = text.replace('ὸ', 'ο');
		text = text.replace('ό', 'ο');
		text = text.replace('ὀ', 'ο');
		text = text.replace('ὁ', 'ο');
		text = text.replace('ὂ', 'ο');
		text = text.replace('ὃ', 'ο');
		text = text.replace('ὄ', 'ο');
		text = text.replace('ὅ', 'ο');
		
		text = text.replace('ύ', 'υ');
		text = text.replace('ὺ', 'υ');
		text = text.replace('ὐ', 'υ');
		text = text.replace('ὑ', 'υ');
		text = text.replace('ὒ', 'υ');
		text = text.replace('ὓ', 'υ');
		text = text.replace('ὔ', 'υ');
		text = text.replace('ὕ', 'υ');
		text = text.replace('ὖ', 'υ');
		text = text.replace('ὗ', 'υ');
		text = text.replace('ῢ', 'υ');
		text = text.replace('ΰ', 'υ');
		text = text.replace('ῦ', 'υ');
		text = text.replace('ῧ', 'υ');
		
		text = text.replace('ώ', 'ω');
		text = text.replace('ὼ', 'ω');
		text = text.replace('ὠ', 'ω');
		text = text.replace('ὡ', 'ω');
		text = text.replace('ὢ', 'ω');
		text = text.replace('ὣ', 'ω');
		text = text.replace('ὤ', 'ω');
		text = text.replace('ὥ', 'ω');
		text = text.replace('ὦ', 'ω');
		text = text.replace('ὧ', 'ω');
		text = text.replace('ᾠ', 'ω');
		text = text.replace('ᾡ', 'ω');
		text = text.replace('ᾢ', 'ω');
		text = text.replace('ᾣ', 'ω');
		text = text.replace('ᾤ', 'ω');
		text = text.replace('ᾥ', 'ω');
		text = text.replace('ᾦ', 'ω');
		text = text.replace('ᾧ', 'ω');
		text = text.replace('ῲ', 'ω');
		text = text.replace('ῳ', 'ω');
		text = text.replace('ῴ', 'ω');
		text = text.replace('ῶ', 'ω');
		text = text.replace('ῷ', 'ω');
	
		
		return text;
	}

}
