package info.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SHRADDHA on 24-07-2016.
 */
public class Tab1Fragment extends Fragment {

    public Tab1Fragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_tab1,container,false);

        return v;
    }
}
