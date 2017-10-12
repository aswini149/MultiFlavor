package mm.com.multiflavour;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class PhoneType implements IphoneTypeListener {
    @override
    public static string getPhonetype() {
        return "samsung";
    }

}
