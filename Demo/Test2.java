public class Test2 {
    public static void main(String[] args) {
        
        String inputSentence = "Think Twice";
        String[] words = inputSentence.split(" "); // Split using space as the delimiter

        StringBuilder result=new StringBuilder();

        for(String word : words){
            StringBuilder reverseword=new StringBuilder(word+" ");
            reverseword.reverse();
            result.append(reverseword);
        }
        System.out.println(result);    
    }
}
        




       /* 
        1. Accept the input sentence.
        2. Split the input sentence into words using space as a delimiter.
        3. Initialize an empty string to store the reversed sentence.
        4. For each word in the sentence:
        a. Reverse the word.
        b. Append the reversed word to the reversed sentence.
        c. Append a space to the reversed sentence.
        5. Remove the trailing space from the reversed sentence.
        6. Output the reversed sentence.
        */

