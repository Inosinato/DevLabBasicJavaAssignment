package assignment2;

public class IsWordPresentInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "A brown fox ran away fast";
		String word = "brown";
		
		if(sentence.contains(word))
			System.out.println(word + " is present in " + sentence);
	}

}
