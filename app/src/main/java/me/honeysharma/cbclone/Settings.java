package me.honeysharma.cbclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private Switch aSwitch,aSwitch1,aSwitch2,aSwitch3,aSwitch4,aSwitch5;
    private CheckBox checkBox1,checkBox2,checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //switches
        aSwitch=(Switch)findViewById(R.id.idswitch);
        aSwitch1=(Switch)findViewById(R.id.idswitch1);
        aSwitch2=(Switch)findViewById(R.id.idswitch2);
        aSwitch3=(Switch)findViewById(R.id.idswitch3);
        aSwitch4=(Switch)findViewById(R.id.idswitch4);
        aSwitch5=(Switch)findViewById(R.id.idswitch5);

        //Checkboxes
        checkBox1=(CheckBox)findViewById(R.id.checkbox1);
        checkBox2=(CheckBox)findViewById(R.id.checkbox2);
        checkBox3=(CheckBox)findViewById(R.id.checkbox3);

    }

    public void onSwitchClick(View v){

        if(aSwitch.isChecked())
            Toast.makeText(this,"DarkTheme ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"DarkTheme OFF",Toast.LENGTH_SHORT).show();
    }

    public void onSwitchClick1(View v){

        if(aSwitch1.isChecked())
            Toast.makeText(this,"DataSaver ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"DataSaver OFF",Toast.LENGTH_SHORT).show();
    }

    public void onSwitchClick2(View v){

        if(aSwitch2.isChecked())
            Toast.makeText(this,"LoadImages ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"LoadImages OFF",Toast.LENGTH_SHORT).show();
    }

    public void onSwitchClick3(View v){

        if(aSwitch3.isChecked())
            Toast.makeText(this,"Notification ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Notification OFF",Toast.LENGTH_SHORT).show();
    }

    public void onSwitchClick4(View v){

        if(aSwitch4.isChecked())
            Toast.makeText(this,"Sound ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Sound OFF",Toast.LENGTH_SHORT).show();
    }

    public void onSwitchClick5(View v){

        if(aSwitch5.isChecked())
            Toast.makeText(this,"Vibration ON",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Vibration OFF",Toast.LENGTH_SHORT).show();
    }
}
