package com.example.quizapp;

public class Question {
    private int questionID;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    private boolean isCorrectAnswer = false;
    public Question(int questionID, String question, String answer1, String answer2,
                    String answer3, String answer4, String correctAnswer) {
        this.questionID = questionID;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }
    public String getQuestion()
    {
        return question;
    }
    public int getQuestionID()
    {
        return questionID;
    }
    public String getAnswer1()
    {
        return answer1;
    }
    public String getAnswer2()
    {
        return answer2;
    }
    public String getAnswer3()
    {
        return answer3;
    }
    public String getAnswer4()
    {
        return answer4;
    }
    public void setIsCorrectAnswer(String providedAnswer)
    {
        if(correctAnswer.equals(providedAnswer))
        {
            isCorrectAnswer = true;
        }
    }
    public boolean getIsCorrectAnswer()
    {
        return isCorrectAnswer;
    }
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
}
