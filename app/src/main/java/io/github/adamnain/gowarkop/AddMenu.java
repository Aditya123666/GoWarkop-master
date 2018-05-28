package io.github.adamnain.gowarkop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddMenu extends AppCompatActivity {

    Button addmenu;
    EditText etnamamakanan,hargamakanan;
    RadioButton rbmakanan,rbminuman,rbcemilan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        addmenu = (Button) findViewById(R.id.btn_addmenu);
        etnamamakanan = (EditText) findViewById(R.id.et_namamakanan);
        hargamakanan = (EditText) findViewById(R.id.et_hargamakanan);
        rbmakanan = (RadioButton) findViewById(R.id.rb_makanan);
        rbminuman = (RadioButton) findViewById(R.id.rb_minuman);
        rbcemilan = (RadioButton) findViewById(R.id.rb_cemilan);
    }
}
