import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GpaCalculatorGUI extends JFrame{
    private JPanel GpaCalculator;
    private JTextField Name;
    private JLabel NameLabel;
    private JButton GoToMyCredits;
    private JPanel ShowMyResults;
    private JTextField FirstCourseG;
    private JTextField FirstC;
    private JTextField SecondCourseG;
    private JTextField SecondC;
    private JTextField ThirdCourseG;
    private JTextField ThirdC;
    private JTextField FourthCourseG;
    private JTextField FourthC;
    private JTextField FifthCourseG;
    private JTextField FifthC;
    private JTextField SixthCourseG;
    private JTextField SixthC;
    private JButton GetResults;
    private JLabel ValidSection;

    public GpaCalculatorGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(GpaCalculator);
        this.pack();
        ValidSection.setVisible(false);

        GetResults.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                try{  if(Float.parseFloat(FirstCourseG.getText())>0
                        && Float.parseFloat(SecondCourseG.getText())>0
                        && Float.parseFloat(ThirdCourseG.getText())>0
                        && Float.parseFloat(FourthCourseG.getText())>0
                        && Float.parseFloat(FifthCourseG.getText())>0
                        && Float.parseFloat(SixthCourseG.getText())>0)
                {
                    float TotalPointsEarned= Float.parseFloat(FirstCourseG.getText())+ Float.parseFloat(SecondCourseG.getText())+ Float.parseFloat(ThirdCourseG.getText())+ Float.parseFloat(FourthCourseG.getText())+ Float.parseFloat(FifthCourseG.getText())+Float.parseFloat(SixthCourseG.getText());
                    float Percentage= TotalPointsEarned*100/600;
                    float TotalCredits= Float.parseFloat(FirstC.getText())+ Float.parseFloat(SecondC.getText())+ Float.parseFloat(ThirdC.getText())+ Float.parseFloat(FourthC.getText())+ Float.parseFloat(FifthC.getText())+Float.parseFloat(SixthC.getText());
                    float YourGPA= TotalPointsEarned/TotalCredits;
                    ValidSection.setVisible(false);
                    new GpaFinalLetterGrade(Name.getText(),YourGPA,Percentage).setVisible(true);
                }
                else {
                    ValidSection.setVisible(true);
                    ValidSection.setText("INVALID Input to Calculate your GPA, All Grades should be Greater than Zero");
                }}
                catch(NumberFormatException e1){
                    ValidSection.setVisible(true);
                    ValidSection.setText("Empty Fields!! Please Enter your Grades");
                }

            }
        });
    }
    public static void main(String[]args){
        JFrame frame = new GpaCalculatorGUI("Gpa Calculator");
        frame.setVisible(true);

    }
}

