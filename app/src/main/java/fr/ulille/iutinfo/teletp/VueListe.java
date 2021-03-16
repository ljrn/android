package fr.ulille.iutinfo.teletp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class VueListe extends Fragment /* TODO Q7 */ {

    private SuiviViewModel model;
    private SuiviAdapter adapter;
    
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

        model = new ViewModelProvider(requireActivity()).get(SuiviViewModel.class);
        RecyclerView questionsList = getActivity().findViewById(R.id.rvQuestions);
        questionsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new SuiviAdapter(model);
        questionsList.setAdapter(adapter);
        // TODO Q7
        // TODO Q8
    }
}