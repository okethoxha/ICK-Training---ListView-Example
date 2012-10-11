package com.milot.example.list;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	
	List<Person> lista = new ArrayList<Person>();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        lista.add(new Person("Hajdar", "Dushi", "Haker"));
        
        setListAdapter(new PersonCustomAdapter());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    class PersonCustomAdapter extends ArrayAdapter<Person>
    {

		public PersonCustomAdapter() {
			super(MainActivity.this, R.layout.list_row, lista);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			View row = convertView;
			
			if (row == null) {
				LayoutInflater inflater = getLayoutInflater();
				row = inflater.inflate(R.layout.list_row, parent, false);
				holder = new ViewHolder(row);
				row.setTag(holder);
			} else {
				holder = (ViewHolder) row.getTag();
			}
			
			holder.getName().setText(lista.get(position).getName() + lista.get(position).getLastname());
			holder.getDescription().setText(lista.get(position).getDescription());
			
			row.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "e kemi sust shtypen", Toast.LENGTH_LONG).show();
					
				}
			});
			
			return row;
		}
    			
    }
}
