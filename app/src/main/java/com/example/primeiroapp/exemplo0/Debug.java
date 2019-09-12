package com.example.primeiroapp.exemplo0;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Debug extends AppCompatActivity {
    static final String TAG = "DEBUG";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClassName() + "onCreate OK");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName() + "onStart OK");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getClassName() + "onStop OK");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, getClassName() + "onRestart OK");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getClassName() + "onPause OK");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getClassName() + "onResume OK");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getClassName() + "onDestroy OK");
    }

    public String getClassName() {
        String s = getClass().getSimpleName();

        return "-> "+s;
    }
}
