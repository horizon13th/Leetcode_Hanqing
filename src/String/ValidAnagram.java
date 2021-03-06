package String;

public class ValidAnagram {
	public static void main(String args[]) {
		String str1 = new String("AB");
		String str2 = new String("BA");
		System.out.println(isAnagram(str1, str2));
		// Input number
	}

	public static boolean isAnagram(String s, String t) {
		int[] a = new int[26];
		for (int i = 0; i < s.length(); i++)
			a[s.charAt(i) - 'a']++;
		for (int i = 0; i < t.length(); i++)
			a[t.charAt(i) - 'a']--;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				return false;
		}
		return true;
	}
}
