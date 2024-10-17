package com.example.fragements;

import androidx.fragment.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class filmsListFragment extends ListFragment {

    // TODO: Définir l'interface OnItemSelectedListener pour la communication

    ArrayAdapter<String> adapter;

    public interface OnItemSelectedListener {
        void onRssItemSelected(String link);
    }

    private OnItemSelectedListener listener;

    String[] values = {"Rambo I", "Rambo II", "Rambo III",
                       "Rambo V", "Die Hard I", "Die Hard 2",
                       "Die Hard 3", "Die Hard 4"};

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        if(getActivity() instanceof OnItemSelectedListener){
            listener = (OnItemSelectedListener) getActivity();
        }else{
            throw new ClassCastException(getActivity().toString() + "must implement filmListFragment.OnItemSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        listener.onRssItemSelected(values[position]);
        // TODO: Implémenter la logique pour notifier l'activité/fragment parent de l'élément sélectionné
    }
}
