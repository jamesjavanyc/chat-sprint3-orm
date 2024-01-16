package com.example.sprint4.services;

import com.example.sprint4.dao.QuestionAndAnswerRepository;
import com.example.sprint4.models.QuestionAndAnswer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ChatService {

    private final QuestionAndAnswerRepository questionAndAnswerRepository;


    public String getResponse(String text) {
        return this.questionAndAnswerRepository.findAnswer(text).orElse("No answer for question: " + text);
    }


    public String save(String ask, String ans) {
        this.questionAndAnswerRepository.save(new QuestionAndAnswer(ask, ans));
        return "Question and answer set.";
    }

    public String update(String ask, String ans) {
        this.questionAndAnswerRepository.updateAnswer(ask, ans);
        return "Answer set.";
    }

    public void delete(String ask) {
        this.questionAndAnswerRepository.deleteById(ask);
    }
}
