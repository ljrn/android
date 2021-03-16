package fr.ulille.iutinfo.teletp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

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
        model = new ViewModelProvider(requireActivity()).get(SuiviViewModel.class);
        Spinner spSalle=(Spinner)view.findViewById(R.id.spSalle);
        Spinner spPoste=(Spinner)view.findViewById(R.id.spPoste);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this.getActivity().getApplicationContext(),R.array.list_salles,android.R.layout.simple_spinner_item);
        spSalle.setAdapter(adapter);
        ArrayAdapter<CharSequence> adapterPoste=ArrayAdapter.createFromResource(this.getActivity().getApplicationContext(),R.array.list_postes,android.R.layout.simple_spinner_item);
        spPoste.setAdapter(adapterPoste);
        spSalle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                    update();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }
        });
        view.findViewById(R.id.btnToListe).setOnClickListener(view1 -> {
            TextView tvLogin=(TextView) view.findViewById(R.id.tvLogin);
            model.setUsername(tvLogin.getText().toString());
            NavHostFragment.findNavController(VueGenerale.this).navigate(R.id.generale_to_liste);
        });
        update();
        // TODO Q9
    }

    @Override
    public void onChanged(Integer integer) {

    }

    private void update() {
        Spinner spSalle=getActivity().findViewById(R.id.spSalle);
        Spinner spPoste=getActivity().findViewById(R.id.spPoste);

        if(spSalle.getSelectedItem().toString().equals("Distanciel")){
            spPoste.setVisibility(View.INVISIBLE);
            spPoste.setEnabled(false);
            model.setLocalisation("Distanciel");
        }else {
            spPoste.setVisibility(View.VISIBLE);
            spPoste.setEnabled(true);
            model.setLocalisation(spSalle.getSelectedItem().toString()+" : "+spPoste.getSelectedItem().toString());
        }
    }    // TODO Q9
}