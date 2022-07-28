package tec.fenrir.test.theme.material

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.DatePicker
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import tec.fenrir.test.theme.material.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var inputlayout = findViewById<TextInputLayout>(R.id.textInputLayout)
        inputlayout.typeface = Typeface.MONOSPACE

        setSupportActionBar(binding.toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    public fun dialog1(view: View) {
//        val builder = AlertDialog.Builder(this)
//        builder.setTitle(R.string.dialog_title).setMessage(R.string.dialog_msg)
//            .setPositiveButton(
//                R.string.dialog_OK
//            ) { _, _ ->
//                // FIRE ZE MISSILES!
//            }
//            .setNegativeButton(
//                R.string.dialog_cancel
//            ) { _, _ ->
//                // User cancelled the dialog
//            }
//        val d = builder.create()
//        d.show()

        val builder = AlertDialog.Builder(this)
        builder.setView(DatePicker(this)).create().show()

//        builder.show()

    }

    public fun typographyActivity(view: View) {
        val intent = Intent(this, TypographyActivity::class.java)
        startActivity(intent)
    }

    public fun bottomBarActivity(view: View) {
        val intent = Intent(this, BottomBarActivity::class.java)
        startActivity(intent)
    }

}
