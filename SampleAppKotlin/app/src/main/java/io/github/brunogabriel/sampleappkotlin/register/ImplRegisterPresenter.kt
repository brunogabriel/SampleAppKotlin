package io.github.brunogabriel.sampleappkotlin.register

import io.github.brunogabriel.sampleappkotlin.models.User
import io.github.brunogabriel.sampleappkotlin.models.UserError
import io.github.brunogabriel.sampleappkotlin.models.UserValidator

/**
 * Created by brunogabriel on 16/05/17.
 */
class ImplRegisterPresenter(override var view: RegisterView?): RegisterPresenter<RegisterView> {

    override fun saveUser(name: String, surname: String) {
        val user = User(name, surname)
        when(UserValidator.validateUser(user)) {
            UserError.EMPTY_NAME -> view?.showEmptyNameError()
            UserError.EMPTY_SURNAME -> view?.showEmptySurnameError()
            UserError.NO_ERROR -> view?.showUserSaved()
        }
    }

}