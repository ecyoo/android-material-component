package tec.fenrir.test.theme.material

import android.content.Context
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class TouchViewPager : ViewPager {
    constructor(con: Context): super(con)


    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {

        return super.onInterceptTouchEvent(ev)
    }
}