class Solution {
    public int maxFreqSum(String s) {
    HashMap<Character,Integer> ans=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
         char ch=s.charAt(i);
         ans.put(ch,ans.getOrDefault(ch,0)+1);
    }
    int vowel=0;
    int cons=0;
    for(char ch:ans.keySet())
    {
        int count=ans.get(ch);
        if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u')
        {
            vowel=Math.max(vowel,count);
        }
        else
        {
            cons=Math.max(cons,count);
        }
    }
    return vowel+cons;
    }
        
}