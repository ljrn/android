package fr.ulille.iutinfo.teletp;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class SuiviViewModel extends AndroidViewModel {

    private MutableLiveData<String> liveLocalisation;
    private MutableLiveData<String> liveUsername;
    // TODO Q2.a

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
    
    // TODO Q2.a
}
