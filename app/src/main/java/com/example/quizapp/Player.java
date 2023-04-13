package com.example.quizapp;

public class Player {
    private String name;
    private int score;
    private String answer;
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    public String getAnswer()
    {
        return answer;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void addScore()
    {
        score++;
    }
}
