import java.util.HashMap;

public class WordPattern
{

	public boolean wordPattern(String pattern, String str)
	{
		HashMap<Character, String> patternMap = new HashMap<Character, String>();
		String[] words = str.split(" ");
		
		//if the length of the pattern doesn't match the number of words
		//the string cant possibly match the pattern
		if (pattern.length() != words.length)
		{
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {
			char patternChar = pattern.charAt(i);
			String word = words[i];

			//unknown key
			if (!patternMap.containsKey(patternChar))
			{
				if (patternMap.containsValue(word))
				{
					//if the current word is one for which we already have a different
					//key assigned then the current pair is a mismatch
					return false;
				}
				patternMap.put(patternChar, word);
			} 
			//known key
			else
			{
				String expectedWord = patternMap.get(patternChar);
				if (!expectedWord.equals(word))
				{
					//if the current word doesn't match up with the word expected for 
					//the current key then the current pair is a mismatch
					return false;
				}
			}
		}

		return true;
	}
}
