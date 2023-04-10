package day_30_;

public class C07_FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("javajavajavajavaPythonruby","java"));
    }
    public static int frequencyOfWord(String sentence, String word){
        int frequency=0;
        while(sentence.contains(word)){
          sentence=  sentence.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }
}
