package fr.ulille.iutinfo.teletp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SuiviAdapter extends RecyclerView.Adapter<SuiviAdapter.ViewHolder>{
    SuiviViewModel model;
    public SuiviAdapter(SuiviViewModel model){
        this.model=model;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private final View itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }
    @NonNull
    @Override
    public SuiviAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.question_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuiviAdapter.ViewHolder holder, int position) {
        String question = model.getQuestions(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    // TODO Q7
}
