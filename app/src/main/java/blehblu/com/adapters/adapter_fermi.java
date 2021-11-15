package blehblu.com.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import blehblu.com.fragments.fragment_fermi1;
import blehblu.com.fragments.fragment_fermi2;

public class adapter_fermi extends FragmentStateAdapter {

    public adapter_fermi(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment= fragment_fermi1.newInstance();
                break;
            case 1:
                fragment= fragment_fermi2.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
