package fr.ulille.iutinfo.teletp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

public class VueGenerale extends Fragment implements Observer<Integer> {

    String DISTANCIEL;
    String poste="";
    String salle;
    SuiviViewModel model;
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
        DISTANCIEL= this.getActivity().getResources().getStringArray(R.array.list_salles)[0];
        salle=DISTANCIEL;
        Log.d("test",DISTANCIEL);
        model = new ViewModelProvider(requireActivity()).get(SuiviViewModel.class);
        // TODO Q4

        view.findViewById(R.id.btnToListe).setOnClickListener(view1 -> {
            // TODO Q3
            NavHostFragment.findNavController(VueGenerale.this).navigate(R.id.generale_to_liste);
        });

        // TODO Q5.b
        // TODO Q9
    }

    @Override
    public void onChanged(Integer integer) {

    }

    // TODO Q5.a
    // TODO Q9
}