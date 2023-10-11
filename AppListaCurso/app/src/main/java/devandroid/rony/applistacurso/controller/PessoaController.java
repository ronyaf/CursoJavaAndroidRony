package devandroid.rony.applistacurso.controller;


import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.rony.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_controlle", "Controller inciada..");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_controlle", "salvo:" + pessoa.toString());

    }

}