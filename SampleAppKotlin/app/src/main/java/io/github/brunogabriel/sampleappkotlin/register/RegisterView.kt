package io.github.brunogabriel.sampleappkotlin.register

import io.github.brunogabriel.sampleappkotlin.commons.View

/**
 * Created by brunogabriel on 16/05/17.
 */
interface RegisterView: View {
    fun showEmptyNameError()
    fun showEmptySurnameError()
    fun showUserSaved()
}
