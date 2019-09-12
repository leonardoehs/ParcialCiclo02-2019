package Adaptador;

import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.BaseAdapter;
import Entidades.persona;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.parcial.R;
import java.util.List;

public class adaptadorPersona extends BaseAdapter {
    private List<persona> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;
    public List<persona> GetData(){
        return this.datasource;
    }

    /**
     * Constructor que permite inicializar las variables de la clase
     * @param context
     * @param IdPlantilla
     * @param sources
     */

    public adaptadorPersona(Context context, int IdPlantilla, List<persona> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public persona getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView lblEdad = convertView.findViewById(R.id.lblEdad);
            TextView lblUbicacion = convertView.findViewById(R.id.lblUbicacion);
            //ImageView icono=convertView.findViewById(R.id.icono);

            //Obtenemos el dato a mostrar
            lblEdad.setText(this.datasource.get(position).getEdad());
            lblUbicacion.setText(this.datasource.get(position).getUbicacion());
            //icono.setImageResource(this.datasource.get(position).getImg());
        }
        return convertView;
    }
}
