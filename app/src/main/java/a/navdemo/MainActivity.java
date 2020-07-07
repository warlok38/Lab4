package a.navdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import a.navdemo.SecondFragment.OnFragmentInteractionListener;
import a.navdemo.ui.main.MainViewModel;

public class MainActivity extends AppCompatActivity implements
        SecondFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    private void getView() {
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}