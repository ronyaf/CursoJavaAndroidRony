package devandroid.rony.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
       // pessoa.setPrimeiroNome("Rony");
       // pessoa.setSobreNome("Franck");
       // pessoa.setCursoDesejado("Android");
       // pessoa.setTelefoneContato("21-999999999");

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

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNomeAluno.setText("");
                editSobrenomeAluno.setText("");
                editNomeDoCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pessoa.setPrimeiroNome(editPrimeiroNomeAluno.getText().toString());
                pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCurso.getText().toString());

                Toast.makeText(MainActivity.this,"Salvo"+pessoa.toString(), Toast.LENGTH_LONG).show();

            }
        }));

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