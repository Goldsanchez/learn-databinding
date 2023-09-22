package com.example.learndatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public MainActivityViewModel() {

    }

    private MutableLiveData<Integer> counter = new MutableLiveData<>(0);


    public void increment (){
        counter.setValue(counter.getValue() + 1);
    }
    public void decrement (){
        counter.setValue(counter.getValue() - 1);
    }

    public MutableLiveData<Integer> getCounter() {
        if(counter.getValue() == null){
            counter.setValue(0);
        }

        return counter;
    }

}
