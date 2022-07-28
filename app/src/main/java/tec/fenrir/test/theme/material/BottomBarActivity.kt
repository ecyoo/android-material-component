package tec.fenrir.test.theme.material

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * A {@link BottomAppBar} top edge that works with a Diamond shaped {@link FloatingActionButton}
 */
class BottomBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)

//        val topEdge = BottomAppBarCutCornersTopEdge(
//            bottomAppBar.fabCradleMargin,
//            bottomAppBar.fabCradleRoundedCornerRadius,
//            bottomAppBar.cradleVerticalOffset
//        )
//        val background = bottomAppBar.background as MaterialShapeDrawable
//        background.shapeAppearanceModel = background.shapeAppearanceModel.toBuilder().setTopEdge(topEdge).build()
    }
}
