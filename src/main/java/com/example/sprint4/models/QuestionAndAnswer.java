package com.example.sprint4.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "questions_and_answers")
@Data
public class QuestionAndAnswer {
    @Id
    @Column(name = "question")
    private String question;
    @Column(name = "answer")
    private String answer;

    public QuestionAndAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public QuestionAndAnswer() {

    }
}
