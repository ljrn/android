package fr.ulille.iutinfo.teletp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class VueGenerale extends Fragment {

    // TODO Q1
    // TODO Q2.c

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vue_generale, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // TODO Q1
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