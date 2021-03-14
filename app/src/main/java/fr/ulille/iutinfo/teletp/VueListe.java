package fr.ulille.iutinfo.teletp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class VueListe extends Fragment /* TODO Q7 */ {

    // TODO Q2c
    // TODO Q6
    
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vue_liste, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btnToGenerale).setOnClickListener(view1 -> NavHostFragment.findNavController(VueListe.this)
                .navigate(R.id.liste_to_generale));

        // TODO Q2c
        // TODO Q6.b
        // TODO Q7
        // TODO Q8
    }
}