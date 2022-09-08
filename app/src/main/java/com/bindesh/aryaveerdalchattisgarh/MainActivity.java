package com.bindesh.aryaveerdalchattisgarh;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.bindesh.aryaveerdalchattisgarh.pdfview.DastavezPDF;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,FirebaseAuth.AuthStateListener {

    public CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8 ,cardView9,cardView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
        cardView5 = findViewById(R.id.card5);
        cardView6 = findViewById(R.id.card6);
        cardView7 = findViewById(R.id.card7);
        cardView8 = findViewById(R.id.card8);
        cardView9 = findViewById(R.id.card9);
        cardView10 = findViewById(R.id.card10);

        cardView1.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Parichaya.class);
            startActivity(myIntent);


        });
        cardView2.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Pathyakaram.class);
            startActivity(myIntent);
        });


        cardView3.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Vyayamsangeet.class);
            startActivity(myIntent);


        });
        cardView4.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Sangeet.class);
            Toast.makeText(this, "कार्य प्रगति पर है इस पेज का अपडेट जल्द ही आएगा ", Toast.LENGTH_SHORT).show();
            startActivity(myIntent);
        });

        cardView5.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, DastavezPDF.class);
            startActivity(myIntent);
        });

        cardView6.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Mantra.class);
            startActivity(myIntent);
        });
        cardView7.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Arya_veer_dal.class);
            Toast.makeText(this, "कार्य प्रगति पर है इस पेज का अपडेट जल्द ही आएगा ", Toast.LENGTH_SHORT).show();

            startActivity(myIntent);


        });
        cardView8.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Arya_veerangna_dal.class);
            Toast.makeText(this, "कार्य प्रगति पर है इस पेज का अपडेट जल्द ही आएगा ", Toast.LENGTH_SHORT).show();

            startActivity(myIntent);


        });
        cardView9.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Contact_Us.class);
            startActivity(myIntent);


        });
        cardView10.setOnClickListener(view -> {
            Intent myIntent = new Intent(this, Naya_Sanskaran.class);
            startActivity(myIntent);


        });

        //drawer layout
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if(getIntent().getExtras() !=null) {
            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                if (key.equals("Another")) {
                    assert value != null;
                    if (value.equals("True")) {
                        Intent intent = new Intent(this, Notification.class);
                        intent.putExtra("value", value);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        }
        subscribeToPushService();
    }

    //Notification
    private void subscribeToPushService() {
        FirebaseMessaging.getInstance().subscribeToTopic("news");

        // Log.d("AndroidBash", "Subscribed");
        //  Toast.makeText(this, "Subscribed", Toast.LENGTH_SHORT).show();

        String token = FirebaseInstanceId.getInstance().getToken();

        // Log and toast
        //   Log.d("AndroidBash", token);
        // Toast.makeText(this, token, Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        //  AuthUI.getInstance().signOut(this);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_notification) {
            Intent myIntent = new Intent(this, Webview.class);
            myIntent.putExtra("keyHTML", "https://aryaveerdal.in/category/arya-veer-dal-camp/");
            String message = "ई पुस्तकालय  ";
            myIntent.putExtra("key", message);
            startActivity(myIntent);

        }

        if (id == R.id.action_Contact_Us) {
            Intent myIntent = new Intent(this, Contact_Us.class);
            startActivity(myIntent);
        }
        if (id == R.id.action_developer) {
            Intent myIntent = new Intent(this, Developer_profile.class);
            startActivity(myIntent);
        }

        if (id == R.id.action_Exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.app_name);
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setMessage("Do you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", (dialog, id12) -> finish())
                    .setNegativeButton("No", (dialog, id1) -> dialog.cancel());
            AlertDialog alert = builder.create();
            alert.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startLoginActivity() {
        Intent intent = new Intent(this, Login_RegisterActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_aboutme) {
            Intent myIntent = new Intent(this, Aboutme.class);
            startActivity(myIntent);

        } else if (id == R.id.nav_home) {
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);

        }else if (id==R.id.nav_arya_samaj){
            Intent myIntent = new Intent(this, Arya_Samaj.class);
            startActivity(myIntent);

        }
        else if (id == R.id.nav_slideshow) {
            Intent myIntent = new Intent(this, Drawer_Karyakarni.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_manage) {
            Toast.makeText(this, "इस पेज का अपडेट जल्द ही आएगा", Toast.LENGTH_SHORT).show();

        }  else if (id == R.id.nav_share) {
            String share = "  Arya Veer Dal "+ "Download Sarvadeshik Arya veer dal mobile application for to know all about arya veer dal.\\n\" +\n";
            String shareBody = share + "\nhttps://play.google.com/store/apps/developer?id="+ this.getPackageName();
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Arya Veer Dal");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;

        } else if (id == R.id.nav_send) {
            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");
            Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "sarvadeshikaryaveerdal@gmail.com" });
            Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear ...," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback Email:"));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().addAuthStateListener(this);
    }


    @Override
    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
        if (firebaseAuth.getCurrentUser() == null) {
            startLoginActivity();
        }
    }
}

