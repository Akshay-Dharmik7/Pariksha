package com.exam.controller;

import com.exam.model.exam.Question;
import com.exam.model.exam.Quiz;
import com.exam.service.QuestionService;
import com.exam.service.QuizService;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @Autowired
    private QuizService quizService;

    //add Question
    @PostMapping("/")
    public ResponseEntity<Question> add(@RequestBody Question question){
        return ResponseEntity.ok(this.service.addQuestion(question));
    }

    //update Question
    @PutMapping("/")
    public ResponseEntity<Question> update(@RequestBody Question question){
        return ResponseEntity.ok(this.service.updateQuestion(question));
    }

    //get All Questions of any Quiz
    @GetMapping("/quiz/{qid}")
    public ResponseEntity<?> getQuestionsOfQuiz(@PathVariable("qid") Long qid){
//        Quiz quiz = new Quiz();
//        quiz.setQid(qid);
//        Set<Question> questionsOfQuiz = this.service.getQuestionsOfQuiz(quiz);
//        return ResponseEntity.ok(questionsOfQuiz);

        Quiz quiz = this.quizService.getQuiz(qid);
        Set<Question> questions = quiz.getQuestions();
        List<Question> list = new ArrayList<>(questions);

        int totalQuestions=Integer.parseInt(quiz.getNoOfQuestions());
        if(list.size()> totalQuestions){
            list = list.subList(0, totalQuestions+1);
        }

        for (Question q : list) {
            q.setAnswer("");
        }

        Collections.shuffle(list);
        return ResponseEntity.ok(list);
    }


    @GetMapping("/quiz/all/{qid}")
    public ResponseEntity<?> getQuestionsOfQuizAdmin(@PathVariable("qid") Long qid){
        Quiz quiz = new Quiz();
        quiz.setQid(qid);
        Set<Question> questionsOfQuiz = this.service.getQuestionsOfQuiz(quiz);
        return ResponseEntity.ok(questionsOfQuiz);
        
    }


    //get Single Question
    @GetMapping("/{quesId}")
    public Question get(@PathVariable("quesId") Long quesId){
        return this.service.getQuestion(quesId);
    }

    //delete Question
    @DeleteMapping("/{quesId}")
    public void delete(@PathVariable("quesId") Long quesId){
        this.service.deleteQuestion(quesId);
    }

    //evaluate quiz
    @PostMapping("/eval-quiz")
    public ResponseEntity<?> evalQuiz(@RequestBody List<Question> questions){
        System.out.println(questions);

        double marksGot = 0;
        int correctAnswers = 0;
        int attempted = 0;
        for(Question q:questions){
            //single questions
            Question question = this.service.get(q.getQuesId());

            if(question.getAnswer().equals(q.getGivenAnswer())){
                //correct
                correctAnswers++;

                double marksSingle=
                    Double.parseDouble(questions.get(0).getQuiz().getMaxMarks())/questions.size();
                marksGot+=marksSingle;
            }

            if (q.getGivenAnswer()!=null ){
                attempted++;
            }
        };

        Map<String, Object> map =  Map.of("marksGot",marksGot, "correctAnswers",correctAnswers, "attempted",attempted);
        return ResponseEntity.ok(map);
    }
}
