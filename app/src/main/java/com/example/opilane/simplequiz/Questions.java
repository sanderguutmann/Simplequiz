package com.example.opilane.simplequiz;


public class Questions {
    public String MyQuestions[] = {
        "Mis värvi on sinine jalgratas?",
        "Mis värvi on politseiauto?",
        "Kui vana on 50 aastane mees?",
        "555 + 111 = ?",
        "Palju elab Eestis inimesi?",
        "Mitu värvi on Eesti lipus?",
        "Mis vastus oli esimesel küsimusel?",
        "Mis klassis meil tund on?",
        "500 - 80 = ",
        "Kas Tatjana Shkarbanova on hea?"

    };

    public String MyChoices [] [] ={
            {"Punane","Sinine","Kollane","Roheline"},
            {"Kollane","Must","Sinine","Punane"},
            {"12","33","26","50"},
            {"306","444","666","555"},
            {"1,3 miljonit","1,2 miljoni","1 miljon","5 miljonit"},
            {"12","5","2","3"},
            {"Punane","Sinine","Kollane","Roheline"},
            {"D09","A236","C012","B220"},
            {"20","420","0","50"},
            {"Pigem on","Ei","Keskmine","Mare oli parem tbh"}

    };

    public String MyCorrectAnswers [] = {
            "Sinine","Sinine","50","666","1,3 miljonit","3","Sinine","A236","420","Mare oli parem tbh"
    };

    public int getLength() {return MyQuestions.length;}

    public String getQuestions(int a) {
        String question = MyQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }

    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }
}
