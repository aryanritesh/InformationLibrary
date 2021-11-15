package blehblu.com.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import blehblu.com.R;
import blehblu.com.adapters.adapter_fermi;

public class FermiActivity extends AppCompatActivity {
    private TabLayout tabLayoutFermi;
    private ViewPager2 viewPagerFermi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fermi);
        tabLayoutFermi=findViewById(R.id.tabLayoutFermi);
        viewPagerFermi=findViewById(R.id.viewPagerFermi);
        adapter_fermi adapter= new adapter_fermi(getSupportFragmentManager(),getLifecycle());
        viewPagerFermi.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayoutFermi, viewPagerFermi, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("About");
                        break;
                    case 1:
                        tab.setText("Basis");
                        break;

                }
            }
        });
        tabLayoutMediator.attach();

    }
}