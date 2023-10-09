package devandroid.rony.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.rony.applistacurso.R;
import devandroid.rony.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;

    String dadosPessoa;

    EditText editPrimeiroNomeAluno;
    EditText editSobrenomeAluno;
    EditText editNomeDoCurso;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir conteúdo, dados, valores para o objeto
        //Conforme o seu MODELO, Template
        pessoa.setPrimeiroNome("Rony");
        pessoa.setSobreNome("Franck");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("21-999999999");

        editPrimeiroNomeAluno = findViewById(R.id.editPrimeiroNomeAluno);
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNomeAluno.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

   /*     dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();
*/
        Log.i("PooAndroid",pessoa.toString());

    }
}