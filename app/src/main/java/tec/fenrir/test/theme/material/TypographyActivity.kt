package tec.fenrir.test.theme.material

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tec.fenrir.test.theme.material.databinding.ActivityTypographyBinding

class TypographyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTypographyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTypographyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar2)
        setTitle(R.string.title_typography)
    }
}
