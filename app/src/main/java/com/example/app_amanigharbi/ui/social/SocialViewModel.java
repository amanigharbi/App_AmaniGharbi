package com.example.app_amanigharbi.ui.social;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SocialViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SocialViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}