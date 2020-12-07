package com.anushka.circlecalc

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class CalcViewModelTest {

    lateinit var calcViewModel: CalcViewModel
    lateinit var calculations: Calculations;

    @get:Rule
    val liveDataRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        calculations = Mockito.mock(Calculations::class.java)
        Mockito.`when`(calculations.calculateCircumference(2.1)).thenReturn(14.443999999999999)
        calcViewModel = CalcViewModel(calculations)
    }

    @Test
    fun calculateCircumference_radGiven_circumference() {
        calcViewModel.calculateCircumference(2.1)
        val result:String? = calcViewModel.circumference.value
        assertThat(result).isEqualTo("14.443999999999999")
    }
//    fun calculateCircumference(radius: Double) {
//        val calculatedCircumference = calculations.calculateCircumference(radius)
//        circumference.value = calculatedCircumference.toString()
//    }
}