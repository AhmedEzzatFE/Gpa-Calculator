import javax.swing.*;

public class GpaFinalLetterGrade extends JFrame {
    private JPanel FinalLetter;
    private JLabel GpaField;
    private JLabel LetterField;
    private JLabel StudentName;
    private JLabel PercentageField;

    public GpaFinalLetterGrade(String text, float GPA, float percentage){
        this.setContentPane(FinalLetter);
        this.pack();
        StudentName.setText(text);
        GpaField.setText(String.valueOf(GPA));
        PercentageField.setText(String.valueOf(percentage));
        if(GPA<2.00)
            LetterField.setText("F");
        else if (GPA<2.75)
            LetterField.setText("C");
        else if (GPA<3)
            LetterField.setText("B-");
        else if (GPA<3.25)
            LetterField.setText("B");
        else if (GPA<3.5)
            LetterField.setText("B+");
        else if (GPA<3.75)
            LetterField.setText("A-");
        else if (GPA<4)
            LetterField.setText("A");
        else if (GPA==4)
            LetterField.setText("A+");
        else if (GPA<0)
        {            LetterField.setText("Not Valid GPA"); GpaField.setText("Not Valid GPA");        }


    }
}
