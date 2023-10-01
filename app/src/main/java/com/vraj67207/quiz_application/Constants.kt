package com.vraj67207.quiz_application

object Constants {
    const val USER_NAME : String="user_name"
    const val TOTAL_QUESTION :String= "total_question"
    const val CORRECT_ANSWER : String= "correct_answer"

    fun getQuestion():ArrayList<Question>{
    val questionlist = ArrayList<Question>()

        val que1= Question(
            1,"Arrange the question  in Ascending order  15,2,12,7,4,9,3,2,1 ",R.drawable.ascending,"1,2,3,4,9,12,15",
            "15,12,9,4,3,2,1","1,2,9,3,12,15","12,15,2,1,3,4,9",1

        )
        questionlist.add(que1)

//        que2
        val que2= Question(
            2,"Arrange the question  in Dscending order  15,2,12,7,4,9,3,2,1 ",R.drawable.ascending,"1,2,3,4,9,12,15",
            "15,12,9,4,3,2,1","1,2,9,3,12,15","12,15,2,1,3,4,9",2

        )
        questionlist.add(que2)

//        que3
        val que3= Question(
            3,"Addition of two Numbers 15 + 2 ",R.drawable.ascending,"15",
            "17","12","10",2

        )
        questionlist.add(que3)
        return questionlist

    }
}