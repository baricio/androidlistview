package baricio.com.myapp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterEstado;
import transferobject.Estado;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private List<Estado> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<>();
        lista.add(new Estado(1, "Minas Gerais"));
        lista.add(new Estado(2, "São Paulo"));
        lista.add(new Estado(3, "Rio de Janeiro"));

        AdapterEstado adapter = new AdapterEstado(lista, this);
        ListView listEstado = (ListView) findViewById(R.id.listEstado);
        listEstado.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Estado e = lista.get(position);

        Intent i = new Intent(this, CidadeActivity.class);
        i.putExtra("codigoestado", e.getCodigo());
        i.putExtra("descricaoestado", e.getDescricao());

        startActivity(i);
    }
}
