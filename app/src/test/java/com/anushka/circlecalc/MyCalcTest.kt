package com.anushka.circlecalc


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MyCalcTest{


    lateinit var myCalc: MyCalc
    @Test
    //FunctionName_input_result
     fun calculateCircumference_radGiven_Circumference()
     {
         myCalc= MyCalc()
        val result:Double=myCalc.calculateCircumference(2.3)
         assertThat(result).isEqualTo(14.443999999999999)
     }

}