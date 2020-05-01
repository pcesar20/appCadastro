package br.com.pauloc.appcadastro;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagem tela_listagem;

    public TelaPrincipal(MainActivity act) {

        this.act = act;

    }

    public void CarregarTela() {
        act.setContentView(R.layout.activity_main);
        btcadastrar_usuario = act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = act.findViewById(R.id.bt_listar_usuarios_cadastrados);
        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tela_cadastro.CarregarTela();
            }
        });

        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tela_listagem.CarregarTela();
            }
        });
    }

    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro) {
        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagem tela_listagem) {
        this.tela_listagem = tela_listagem;
    }

}


