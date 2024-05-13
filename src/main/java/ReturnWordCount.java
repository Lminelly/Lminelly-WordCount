
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        if(in == null || in.isEmpty()){
            return 0;
        }
        String[] words = in.split("\\s+");
        int wordCount = 0;
        for(String word : words){
            if(!word.isEmpty()){
                wordCount ++;
            }
        }
        return wordCount;
    }
}
