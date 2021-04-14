package com.zappy;
public class Quiz {
    public static void main(String[] args) {

        Question question = new MultipleChoiceQuestion(
                "Which of the following is a large blood vessel that carries blood away from the heart?",
                "Vein",
                "Artery",
                "Capilarry",
                "Nerve",
                "Red blood cell",
                "B"
        );
        question.check();

        Question question1 = new MultipleChoiceQuestion (
                "Which of the following is not a member of the vitamin B complex?",
                "Thiamine",
                "Riboflavin",
                "Follic Acid",
                "Ascorbic Acid",
                "Niacin",
                "D"
        );
        question1.check();

        Question question2 = new MultipleChoiceQuestion (
                "What is the melting point of tin in Celsius?",
                "100",
                "231.9",
                "243.4",
                "258.5",
                "0",
                "B"
        );
        question2.check();

        Question question3 = new MultipleChoiceQuestion (
                "Who is the current president of the United States?",
                "Joe Biden",
                "Donal Trump",
                "George Bush",
                "Barrack Obama",
                "Gregory Isaac",
                "B"
        );
        question3.check();

        Question question4 = new MultipleChoiceQuestion (
                "What continent on Earth is uninhabited?",
                "Australia",
                "Africa",
                "Antarctica",
                "Russia",
                "Asia",
                "C"
        );
        question4.check();

        Question question5 = new TrueFalseQuestion(
                "Marrakesh is the capital of Morocco",
                "TRUE"
        );
        question5.check();

        Question question6 = new TrueFalseQuestion(
                "'A' is the most common letter used in the English language",
                "FALSE"
        );
        question6.check();

        Question question7 = new TrueFalseQuestion(
                "A lion's roar can be heard up to eight kilometres away",
                "TRUE"
        );
        question7.check();

        Question question8 = new TrueFalseQuestion(
                "In Harry Potter, Draco Malfoy has no siblings",
                "FALSE"
        );
        question8.check();

        Question question9 = new TrueFalseQuestion(
                "The river Seine in Paris is longer than the river Thames in London",
                "TRUE"
        );
        question9.check();

        Question.showResults();



    }
}
