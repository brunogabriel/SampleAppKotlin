package io.github.brunogabriel.sampleappkotlin.register

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import io.github.brunogabriel.sampleappkotlin.R
import io.github.brunogabriel.sampleappkotlin.commons.textValue
import kotlinx.android.synthetic.main.activity_register.*

/**
 * Created by brunogabriel on 16/05/17.
 */
class RegisterActivity : AppCompatActivity(), RegisterView {

    /** Variables **/
    private val presenter: RegisterPresenter<RegisterView> by lazy {
        ImplRegisterPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        create_button.setOnClickListener { presenter.saveUser(name_edittext.textValue(), surname_edittext.textValue()) }
    }

    override fun showEmptyNameError() {
        name_edittext.error  = getString(R.string.name_error)
    }

    override fun showEmptySurnameError() {
        surname_edittext.error  = getString(R.string.surname_error)
    }

    override fun showUserSaved() {
        AlertDialog.Builder(this)
                .setMessage(getString(R.string.save_user))
                .setPositiveButton(getString(R.string.undestood), { dialog, which -> dialog.dismiss() }).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}