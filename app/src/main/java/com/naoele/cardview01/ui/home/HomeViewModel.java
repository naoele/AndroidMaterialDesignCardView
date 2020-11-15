package com.naoele.cardview01.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("All categories");
    }

    private final MutableLiveData<String> mText;

    public LiveData<String> getText() {
        return mText;
    }
}