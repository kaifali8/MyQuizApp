package com.example.myquizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        //1
        val que1=Question(1,"What Country does this flag belongs to?",R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Armenia","Austria",1)
        questionList.add(que1)
        //2
        val que2=Question(2,"What Country does this flag belongs to?",R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Armenia","Austria",2)
        questionList.add(que2)
        //3
        val que3=Question(3,"What Country does this flag belongs to?",R.drawable.ic_flag_of_brazil,
            "Belgium","Australia","Brazil","Mexico",3)
        questionList.add(que3)
        //4
        val que4=Question(4,"What Country does this flag belongs to?",R.drawable.ic_flag_of_germany,
            "Germany","Poland","Denmark","Belgium",1)
        questionList.add(que4)
        //5
        val que5=Question(5,"What Country does this flag belongs to?",R.drawable.ic_flag_of_india,
            "Kuwait","Sri Lanka","Pakistan","India",4)
        questionList.add(que5)
        //6
        val que6=Question(6,"What Country does this flag belongs to?",R.drawable.ic_flag_of_kuwait,
            "Kuwait","Saudi Arabia","Iraq","Iran",1)
        questionList.add(que6)
        //7
        val que7=Question(7,"What Country does this flag belongs to?",R.drawable.ic_flag_of_new_zealand,
            "England","Australia","United Kingdom","New Zealand",4)
        questionList.add(que7)
        //8
        val que8=Question(8,"What Country does this flag belongs to?",R.drawable.ic_flag_of_denmark,
            "Belgium","Germany","Denmark","England",3)
        questionList.add(que8)
        //9
        val que9=Question(9,"What Country does this flag belongs to?",R.drawable.ic_flag_of_fiji,
            "Spain","Fiji","England","United Kingdom",1)
        questionList.add(que9)
        return questionList
    }
}