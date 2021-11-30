package org.neotech.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends Activity {

  private TextView tv_user_name;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    tv_user_name = findViewById(R.id.tv_user_name);
  }

  @Override
  protected void onResume() {
    super.onResume();
    tv_user_name.setText("tony");
  }

  @Override
  protected void onPause() {
    super.onPause();
    tv_user_name.setText("");
  }

  public TextView textView() {
    return tv_user_name;
  }

}
