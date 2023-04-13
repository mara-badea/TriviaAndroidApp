package com.example.quizapp;

import java.util.ArrayList;
import java.util.Collections;

public class Game
{
    private Player player;
    private ArrayList<Question> questions;
    private int currQuestionIndex;
    public Game(Player player, ArrayList<Question> questions)
    {
        this.player = player;
        this.questions = questions;
        Collections.shuffle(this.questions);
        this.currQuestionIndex = 0;
    }
    public Question getCurrentQuestion()
    {
        return questions.get(currQuestionIndex);
    }
    public void nextQuestion()
    {
        currQuestionIndex++;
    }
    public boolean isGameOver()
    {
        return currQuestionIndex >= questions.size();
    }
    public boolean answerCurrentQuestion(String answer)
    {
        Question currentQuestion = getCurrentQuestion();
        currentQuestion.setIsCorrectAnswer(answer);
        if(currentQuestion.getIsCorrectAnswer())
        {
            player.addScore();
            return true;
        }
        return false;
    }
}
