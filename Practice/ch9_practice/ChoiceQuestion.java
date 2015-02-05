// 
// public class ChoiceQuestion
// {
//     
//     //choice question is displayed as the text of the question and a list of the choices
//     //example:
//     //      "What are the primary colors of light"
//     //      1)red, blue, yellow
//     //      2)red, blue, green
//     //      3)purple, ping orange
//     
//     private int numberOfChoices;
//     
//     public ChoiceQuestion()
//     {
//         super();
//         numberOfChoices = 0;
//     }
// 
//     public void addChoice(String choice, boolean correct)
//     {
//         numberOfChoices++;
//         
//         super.addText("\n" + numberOfChoices + ")" + choice);
//         
//         if (correct)
//         {
//             String answerString = "" + numberOfChoices;
//             super.setAnswer(answerString);
//         }
//     
//     }
// }