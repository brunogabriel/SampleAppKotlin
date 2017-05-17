package io.github.brunogabriel.sampleappkotlin.register

import io.github.brunogabriel.sampleappkotlin.commons.Presenter
import io.github.brunogabriel.sampleappkotlin.commons.View

/**
 * Created by brunogabriel on 16/05/17.
 */
interface RegisterPresenter<T: View>: Presenter<T> {
    fun saveUser(name: String, surname: String)
}