package tec.fenrir.test.theme.material

import android.content.Context
import android.util.AttributeSet
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatSpinner
import androidx.appcompat.widget.ListPopupWindow


class PopupDisplaySpinner: AppCompatSpinner {

    private var mPopup: ListPopupWindow? = null

    constructor(con: Context): super(con)
//    constructor(con: Context, mode: Int): super(con, mode)
    constructor(con: Context, attr: AttributeSet): super(con, attr) {
        initPopup(con, attr, android.R.attr.spinnerStyle)
    }
    constructor(con: Context, attr: AttributeSet, defStyleAttr: Int): super(con, attr, defStyleAttr) {
        initPopup(con, attr, defStyleAttr)
    }
//    constructor(con: Context, attr: AttributeSet, defStyleAttr: Int, mode: Int): super(con, attr, defStyleAttr, mode) {
//        initPopup(con, attr, defStyleAttr)
//    }



    override fun performClick(): Boolean {
        if (mPopup != null) {
            if (!mPopup!!.isShowing) {
                showPopup()
            }
            return true
        }

        // Else let the platform handle the click
        return super.performClick()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        if (mPopup != null && mPopup!!.isShowing) {
            mPopup!!.dismiss()
        }
    }

    private fun initPopup(con: Context, attr: AttributeSet, defStyleAttr: Int) {
        mPopup = ListPopupWindow(con, attr, defStyleAttr)
        mPopup!!.anchorView = this

        val tempAdapter = ArrayAdapter<String>(
            con,
            android.R.layout.simple_list_item_1,
            con.resources.getStringArray(R.array.spinner_resource)
        )
        adapter = tempAdapter

        mPopup!!.setAdapter(tempAdapter)

        mPopup!!.setOnItemClickListener { parent, view, position, id ->
            performItemClick(view, position, id)
            setSelection(position)
            mPopup?.dismiss()
        }

    }

    private fun showPopup() {
        mPopup!!.height = context.resources.getDimensionPixelSize(R.dimen.list_item_height) * 5
        mPopup!!.show()
        mPopup!!.setSelection(selectedItemPosition)
    }


}