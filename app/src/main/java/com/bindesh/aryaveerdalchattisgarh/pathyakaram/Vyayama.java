package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.bindesh.aryaveerdalchattisgarh.Parichaya;
import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.anime.Anime;
import com.bindesh.aryaveerdalchattisgarh.anime.RecyclerViewAdapter;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Bhoomi_namaskar;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Chandra_namaskar;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Dand_Baithak;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Dumble;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Indian_club;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Khel;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Lezium;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Malkhamb;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Sainik_shiksha;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Sarvaang_sundram;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Surya_namaskar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Vyayama extends AppCompatActivity {

    private final String JSON_URL = "https://aryaveerdal.in/all-json/vyayam.json" ;
    private JsonArrayRequest request ;
    private RequestQueue requestQueue ;

    private List<Anime> lstAnime ;
    private RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        lstAnime = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerviewid);
        jsonrequest();


        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this,lstAnime) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);
    }
    private void jsonrequest() {

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject  = null ;

                for (int i = 0 ; i < response.length(); i++ ) {


                    try {
                        jsonObject = response.getJSONObject(i) ;

                        com.bindesh.aryaveerdalchattisgarh.anime.Anime anime = new com.bindesh.aryaveerdalchattisgarh.anime.Anime() ;
                        anime.setName(jsonObject.getString("name"));
                        anime.setDescription(jsonObject.getString("description"));

                        anime.setCategorie(jsonObject.getString("categorie"));

                        anime.setImage_url(jsonObject.getString("img"));
                        lstAnime.add(anime);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }

                setuprecyclerview(lstAnime);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue = Volley.newRequestQueue(Vyayama.this);
        requestQueue.add(request) ;


    }


    private void setuprecyclerview(List<com.bindesh.aryaveerdalchattisgarh.anime.Anime> lstAnime) {
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this,lstAnime) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);

    }

}
