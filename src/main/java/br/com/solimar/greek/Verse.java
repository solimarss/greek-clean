package br.com.solimar.greek;

public class Verse {

	private String book;
	private String chapter;
	private String verseNumber;
	private String text;

	public Verse(String book, String chapter, String verseNumber, String text) {
		super();
		this.book = book;
		this.chapter = chapter;
		this.verseNumber = verseNumber;
		this.text = text;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getVerseNumber() {
		return verseNumber;
	}

	public void setVerseNumber(String verseNumber) {
		this.verseNumber = verseNumber;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
