package io.github.brunogabriel.sampleappkotlin

import io.github.brunogabriel.sampleappkotlin.register.ImplRegisterPresenter
import io.github.brunogabriel.sampleappkotlin.register.RegisterView
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.*

/**
 * Created by brunogabriel on 16/05/17.
 */
class RegisterPresenterTest {

    /**
     * Tip: To suppress error Identifier not allowed for Android project...
     * displayed by Android Studio you have to got to
     * Preferences... -> Editor -> Inspections -> Kotlin and disable Illegal Android Identifier inspection.
     */

    @Test
    fun `should show name error when has no name`() {
        // given
        val registerView = Mockito.mock(RegisterView::class.java)
        val presenter = ImplRegisterPresenter(registerView)

        // when
        presenter.saveUser("", "")

        // then
        verify(registerView).showEmptyNameError()
    }

    @Test
    fun `should show surname error when has no surname`() {
        // given
        val registerView = Mockito.mock(RegisterView::class.java)
        val presenter = ImplRegisterPresenter(registerView)

        // when
        presenter.saveUser("anyName", "")

        // then
        verify(registerView).showEmptySurnameError()
    }

    @Test
    fun `should show user saved when has a valid user`() {
        // given
        val registerView = Mockito.mock(RegisterView::class.java)
        val presenter = ImplRegisterPresenter(registerView)

        // when
        presenter.saveUser("anyName", "anySurname")

        // then
        verify(registerView).showUserSaved()
    }
}
