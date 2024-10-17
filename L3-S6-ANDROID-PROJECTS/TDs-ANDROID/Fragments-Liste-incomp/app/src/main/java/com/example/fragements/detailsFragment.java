package com.example.fragements;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class detailsFragment extends Fragment {

    // TODO: Compléter la méthode newInstance pour accepter un argument 'url'
    public static detailsFragment newInstance(String url) {
        detailsFragment f = new detailsFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO: Gonfler le layout pour ce fragment et initialiser le TextView
        return null; //v;
    }

    public void settext(String url) {
        // TODO: Mettre à jour le texte du TextView avec l'URL
    }
}
