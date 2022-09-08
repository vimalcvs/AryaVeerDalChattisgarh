package com.bindesh.aryaveerdalchattisgarh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    //varaible initilization
    EditText ed_username,ed_email,ed_password,ed_phone,ed_address,ed_post,ed_district,ed_pin,ed_state,ed_country,ed_gender,ed_sahbhagita;
    String str_name,str_email,str_password,str_phone,str_address,str_post,str_district,str_pin,str_state,str_country,str_gender,str_sahbhagita;
    String url = "https://untoldtruth.in/data/register.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//initialization
        ed_email = findViewById(R.id.ed_email);
        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        ed_phone =findViewById(R.id.ed_phone);
        ed_address=findViewById(R.id.ed_address);
        ed_post=findViewById(R.id.ed_post);
        ed_district=findViewById(R.id.ed_district);
        ed_pin=findViewById(R.id.ed_pin);
        ed_state=findViewById(R.id.ed_State);
        ed_country=findViewById(R.id.ed_country);
        ed_gender=findViewById(R.id.ed_gender);
        ed_sahbhagita=findViewById(R.id.ed_sahbhagita);
    }

    public void moveToLogin(View view) {

        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void Register(View view) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait..");


        if(ed_username.getText().toString().equals("")){
            Toast.makeText(this, "Enter Username", Toast.LENGTH_SHORT).show();
        }
        else if(ed_email.getText().toString().equals("")){
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        }
        else if(ed_password.getText().toString().equals("")){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else if(ed_phone.getText().toString().equals("")){
            Toast.makeText(this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }
        else if(ed_address.getText().toString().equals("")){
            Toast.makeText(this, "Enter Address", Toast.LENGTH_SHORT).show();
        }
        else if(ed_post.getText().toString().equals("")){
            Toast.makeText(this, "Enter Post", Toast.LENGTH_SHORT).show();
        }
        else if(ed_district.getText().toString().equals("")){
            Toast.makeText(this, "Enter District", Toast.LENGTH_SHORT).show();
        }
        else if(ed_pin.getText().toString().equals("")){
            Toast.makeText(this, "Enter Pin Code", Toast.LENGTH_SHORT).show();
        }
        else if(ed_state.getText().toString().equals("")){
            Toast.makeText(this, "Enter State", Toast.LENGTH_SHORT).show();
        }
        else if(ed_country.getText().toString().equals("")){
            Toast.makeText(this, "Enter Country", Toast.LENGTH_SHORT).show();
        }
        else if(ed_gender.getText().toString().equals("")){
            Toast.makeText(this, "Enter Gender", Toast.LENGTH_SHORT).show();
        }
        else if(ed_sahbhagita.getText().toString().equals("")){
            Toast.makeText(this, "Enter Arya Veer Dal Pad (arya veer,sakhanayak \n upvyayam shikshak,vyayam shikshak,adhikarik pad /other", Toast.LENGTH_SHORT).show();
        }
        else{

            progressDialog.show();
            str_name = ed_username.getText().toString().trim();
            str_email = ed_email.getText().toString().trim();
            str_password = ed_password.getText().toString().trim();
            str_phone=ed_phone.getText().toString().trim();
            str_address =ed_address.getText().toString().trim();
            str_post =ed_post.getText().toString().trim();
            str_district =ed_district.getText().toString().trim();
            str_pin =ed_pin.getText().toString().trim();
            str_state =ed_state.getText().toString().trim();
            str_country =ed_country.getText().toString().trim();
            str_gender=ed_gender.getText().toString().trim();
            str_sahbhagita=ed_sahbhagita.getText().toString();

            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();
                    ed_username.setText("");
                    ed_email.setText("");
                    ed_password.setText("");
                    ed_phone.setText("");
                    ed_address.setText("");
                    ed_post.setText("");
                    ed_district.setText("");
                    ed_pin.setText("");
                    ed_state.setText("");
                    ed_country.setText("");
                    ed_gender.setText("");
                    Toast.makeText(RegisterActivity.this, response, Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            },new Response.ErrorListener(){

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(RegisterActivity.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String, String>();

                    params.put("name",str_name);
                    params.put("email",str_email);
                    params.put("password",str_password);
                    params.put("phone",str_phone);
                    params.put("address",str_address);
                    params.put("post",str_post);
                    params.put("district",str_district);
                    params.put("pin",str_pin);
                    params.put("state",str_state);
                    params.put("country",str_country);
                    params.put("gender",str_gender);
                    params.put("sahbhagita",str_sahbhagita);
                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(RegisterActivity.this);
            requestQueue.add(request);


        }

    }
}

