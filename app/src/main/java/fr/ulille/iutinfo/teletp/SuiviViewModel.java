package fr.ulille.iutinfo.teletp;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public class SuiviViewModel extends AndroidViewModel {

    private MutableLiveData<String> liveLocalisation;
    private MutableLiveData<String> liveUsername;
    private MutableLiveData<Integer> liveNextQuestion;
    private String[] questions;

    public SuiviViewModel(Application application) {
        super(application);
        liveLocalisation = new MutableLiveData<>();
        liveUsername = new MutableLiveData<>();
    }

    public LiveData<String> getLiveUsername() {
        return liveUsername;
    }

    public void setUsername(String username) {
        liveUsername.setValue(username);
        Context context = getApplication().getApplicationContext();
        Toast toast = Toast.makeText(context, "Username : " + username, Toast.LENGTH_LONG);
        toast.show();
    }

    public String getUsername() {
        return liveUsername.getValue();
    }
    public LiveData<String> getLiveLocalisation() {
        return liveLocalisation;
    }

    public void setLocalisation(String localisation) {
        liveLocalisation.setValue(localisation);
        Context context = getApplication().getApplicationContext();
        Toast toast = Toast.makeText(context, "Localisation : " + localisation, Toast.LENGTH_LONG);
        toast.show();
    }

    public String getLocalisation() {
        return liveLocalisation.getValue();
    }

    public MutableLiveData<Integer> getLiveNextQuestion() {
        return liveNextQuestion;
    }

    public void setLiveNextQuestion(Integer positionQuestion) {
        this.liveNextQuestion.setValue(positionQuestion);
        Context context = getApplication().getApplicationContext();
        Toast toast = Toast.makeText(context, "NextQuestion : " + positionQuestion, Toast.LENGTH_LONG);
        toast.show();
    }

    public Integer getNextQuestion(){
        return this.liveNextQuestion.getValue();
    }
    public String getQuestions(int position) {
        return questions[position];
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public void initQuestions(Context context){
        this.questions=context.getResources().getStringArray(0);
    }

    @MainThread
    public void observeSelection(@NonNull LifecycleOwner owner, @NonNull Observer<? super Integer> observer) {
        getLiveNextQuestion().observe(owner, observer);
    }
}
