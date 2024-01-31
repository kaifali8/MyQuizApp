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
        val que2=Question(2,"What Country does this map belongs to?",R.drawable.map_australia,
            "Argentina","Australia","Armenia","Austria",2)
        questionList.add(que2)
        //3
        val que3=Question(3,"Who is the scientist in this picture?",R.drawable.nikola_tesla,
            "Thomas Edison","Albert Einstein","Nikola Tesla","Galileo",3)
        questionList.add(que3)
        //4
        val que4=Question(4,"How many hearts does the Octopus have?",R.drawable.octopus,
            "Three","Four","Two","One",1)
        questionList.add(que4)
        //5
        val que5=Question(5,"Taj Mahal is situated in which city??",R.drawable.taj_mahal,
            "Jaipur","Lucknow","Delhi","Agra",4)
        questionList.add(que5)
        //6
        val que6=Question(6,"What Country does this flag belongs to?",R.drawable.ic_flag_of_kuwait,
            "Kuwait","Saudi Arabia","Iraq","Iran",1)
        questionList.add(que6)
        //7
        val que7=Question(7,"What is the height of the Statue of Unity?",R.drawable.statue_of_unity,
            "128m","200m","167m","182m",4)
        questionList.add(que7)
        //8
        val que8=Question(8,"What is the name of the programming language in this photo??",R.drawable.swift,
            "Flutter","Python","Swift","Kotlin",3)
        questionList.add(que8)
        //9
        val que9=Question(9,"What is the full form of HTML?",R.drawable.html_logo,
            "Hypertext Markup Language","Hypertext Machine Language","HyperText Machine Learning"
            ,"Hyper Technical Machine Language",1)
        questionList.add(que9)
        val que10=Question(10,"What Country does this flag belongs to?",R.drawable.ic_flag_of_fiji,
            "Spain","Fiji","England","United Kingdom",2)
        questionList.add(que10)
        return questionList
    }
}