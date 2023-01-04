package com.example.sharepref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3, editText4, editText5;
    TextView textView1, textView2, textView3, textView4, textView5;
    Button buttonSave, buttonLoad;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_One);
        editText2 = findViewById(R.id.et_Two);
        editText3 = findViewById(R.id.et_Three);
        editText4 = findViewById(R.id.et_Four);
        editText5 = findViewById(R.id.et_Five);

        textView1 = findViewById(R.id.txt_one);
        textView2 = findViewById(R.id.txt_two);
        textView3 = findViewById(R.id.txt_three);
        textView4 = findViewById(R.id.txt_four);
        textView5 = findViewById(R.id.txt_five);

        buttonSave = findViewById(R.id.btn_save);
        buttonLoad = findViewById(R.id.btn_load);

sharedPreferences=getSharedPreferences("DATA",MODE_PRIVATE);

buttonSave.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
SharedPreferences.Editor editor=sharedPreferences.edit();
editor.putString("key",editText1.getText().toString());
editor.putString("key2",editText2.getText().toString());
editor.putString("key3",editText3.getText().toString());
editor.putString("key4",editText4.getText().toString());
editor.putString("key5",editText5.getText().toString());





editor.apply();



    }
});

buttonLoad.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
   if (sharedPreferences.contains("key")){
textView1.setText(sharedPreferences.getString("key",""));

   } if (sharedPreferences.contains("key2")){
textView2.setText(sharedPreferences.getString("key2",""));

   }
     if (sharedPreferences.contains("key3")){
textView3.setText(sharedPreferences.getString("key3",""));


    } if (sharedPreferences.contains("key4")){
textView4.setText(sharedPreferences.getString("key4",""));


    } if (sharedPreferences.contains("key5")){
textView5.setText(sharedPreferences.getString("key5",""));

   }
















    }
});


    }

   /* private void LoadButton(){
     *//*   String text;
        SharedPreferences sharedPreferences=getSharedPreferences("SHARED",MODE_PRIVATE);
        text=sharedPreferences.getString("key","");
        textView1.setText(text);


        String text1;
        String text2;
        String text3;
        String text4;
        String text5;
SharedPreferences sharedPreferences=getSharedPreferences("SHARED",MODE_PRIVATE);

  text1=sharedPreferences.getString("key1","");
  text2=sharedPreferences.getString("key2","");

        text3=sharedPreferences.getString("key3","");
        text4=sharedPreferences.getString("key4","");
        text5=sharedPreferences.getString("key5","");

textView1.setText(text1);
textView2.setText(text2);

textView3.setText(text3);
textView4.setText(text4);
textView5.setText(text5);

if (sharedPreferences.contains("key1")){
    textView1.setText(sharedPreferences.getString("key1",""));

  if (sharedPreferences.contains("key2")){
       textView2.setText(sharedPreferences.getString("key2",""));
   }
*//*

}






private void SaveButton(){

   *//* String value=editText1.getText().toString();
    SharedPreferences sharedPreferences=getSharedPreferences("SHARED",MODE_PRIVATE);
    SharedPreferences.Editor editor=sharedPreferences.edit();
    editor.putString("key",value);
    editor.apply();*//*





*//*
    String value1=editText1.getText().toString();
    String value2=editText2.getText().toString();
    String value3=editText3.getText().toString();
    String value4=editText4.getText().toString();
    String value5=editText5.getText().toString();
    SharedPreferences sharedPreferences=getSharedPreferences("SHARED",MODE_PRIVATE);
    SharedPreferences.Editor editor=sharedPreferences.edit();
    editor.putString("key1",value1);
    editor.putString("Key2",value2);
    editor.putString("Key3",value3);
    editor.putString("Key4",value4);
    editor.putString("Key5",value5);
    editor.apply();
    Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();

*//*

}*/
}