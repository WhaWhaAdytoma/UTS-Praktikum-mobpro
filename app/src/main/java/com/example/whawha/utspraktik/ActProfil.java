package com.example.whawha.utspraktik;


        import android.content.Intent;
        import android.provider.Settings;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.GridLayoutManager;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;

        import java.util.ArrayList;

public class ActProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_profil);
    }

    RecyclerView recyclerView;
    private ArrayList<President> list;


    private void showRecyclerCardView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewPresidentAdapter cardViewPresidentAdapter = new CardViewPresidentAdapter(this);
        cardViewPresidentAdapter.setListPresident(list);
        recyclerView.setAdapter(cardViewPresidentAdapter);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = null;
        switch (item.getItemId()){
            case R.id.action_list:
                title = "Mode List";
                showListCountry();
                break;

            case R.id.action_grid:
                title = "My Profil";
                startActivity(new Intent(this, ActProfil.class));
                break;

            case R.id.action_cardview:
                title = "Change Language";

                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);

                break;
        }
        setActionBarTitle(title);
        return super.onOptionsItemSelected(item);
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }



    private void setActionBarTittle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showListCountry() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListCountryAdapter listCountryAdapter = new
                ListCountryAdapter(this);
        listCountryAdapter.setListPresident(list);
        recyclerView.setAdapter(listCountryAdapter);
    }

    private void showRecyclerGrid(){
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridPresidentAdapter gridPresidentAdapter = new GridPresidentAdapter(this);
        gridPresidentAdapter.setListPresident(list);
        recyclerView.setAdapter(gridPresidentAdapter);
    }
}