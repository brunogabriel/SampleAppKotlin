package io.github.brunogabriel.sampleappkotlin.commons

/**
 * Created by brunogabriel on 16/05/17.
 */
interface Presenter<T: View> {
    var view: T?

    fun onDestroy() {
        view = null
    }
}