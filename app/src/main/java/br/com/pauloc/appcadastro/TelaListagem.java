package br.com.pauloc.appcadastro;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import br.com.pauloc.appcadastro.R.*;

public class TelaListagem {
    MainActivity act;
    TelaPrincipal tela_principal;
    Button btanterior, btproximo, btfechar;
    TextView txtnome, txttelefone, txtendereco, txtstatus;
    int index;

    public TelaListagem(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
        index = 0;
    }

    public void CarregarTela() {
        /*
        Antes de carregar a tela, verifica se existe registros
        inseridos
        */
        if (act.getRegistros().size() == 0) {
            (new AlertDialog.Builder(act))
                    .setTitle("Aviso")
                    .setMessage(string.msg_dlg)
                    .setNeutralButton("OK", null)
                    .show();

            return;
        }

        act.setContentView(R.layout.listagem_usuarios);
        btanterior = act.findViewById(R.id.btanterior);
        btproximo = act.findViewById(R.id.btproximo);
        btfechar = act.findViewById(R.id.btfechar);
        txtnome = act.findViewById(R.id.txtnome);
        txtendereco = act.findViewById(R.id.txt_endereco);
        txttelefone = act.findViewById(R.id.txt_telefone);
        txtstatus = act.findViewById(R.id.txtstatus);

        PreencheCampos(index);
        AtualizaStatus(index);

        btanterior.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (index > 0) {
                    index--;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });
        btproximo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (index < act.getRegistros().size() - 1) {
                    index++;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });

        btfechar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tela_principal.CarregarTela();

            }
        });

        btfechar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tela_principal.CarregarTela();

            }
        });

    }

    private void PreencheCampos(int idx) {
        txtnome.setText(act.getRegistros().get(idx).getNome());
        txttelefone.setText(act.getRegistros().get(idx).getTelefone());
        txtendereco.setText(act.getRegistros().get(idx).getEndereco());
    }

    private void AtualizaStatus(int idx) {
        int total = act.getRegistros().size();
        txtstatus.setText("Registros : " + (idx + 1) + "/" + total);
    }
}
