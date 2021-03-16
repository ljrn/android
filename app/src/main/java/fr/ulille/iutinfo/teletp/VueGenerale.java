package fr.ulille.iutinfo.teletp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class VueGenerale extends Fragment {

    // TODO Q1
    String DISTANCIEL= this.getContext().getResources().getStringArray(0)[0];
    String poste="";
    String salle;
    // TODO Q2.c

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        Log.d("toto" ,DISTANCIEL);
        return inflater.inflate(R.layout.vue_generale, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        salle=DISTANCIEL;
        // TODO Q2.c
        // TODO Q4

        view.findViewById(R.id.btnToListe).setOnClickListener(view1 -> {
            // TODO Q3
            NavHostFragment.findNavController(VueGenerale.this).navigate(R.id.generale_to_liste);
        });

        // TODO Q5.b
        // TODO Q9
    }

    // TODO Q5.a
    // TODO Q9
}