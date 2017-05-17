package io.github.brunogabriel.sampleappkotlin.models

/**
 * Created by brunogabriel on 16/05/17.
 */
data class User(val name: String, val surname: String)

enum class UserError {
    EMPTY_NAME,
    EMPTY_SURNAME,
    NO_ERROR
}

object UserValidator {
    fun validateUser(user: User): UserError {
        with(user) {
            if (name.isNullOrEmpty()) return UserError.EMPTY_NAME
            if (surname.isNullOrEmpty()) return UserError.EMPTY_SURNAME
        }

        return UserError.NO_ERROR
    }
}