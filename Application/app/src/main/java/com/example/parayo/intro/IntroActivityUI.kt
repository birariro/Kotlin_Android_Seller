package com.example.parayo.intro

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import com.example.parayo.R
import org.jetbrains.anko.*

class IntroActivityUI : AnkoComponent<IntroActivity>
{
    override fun createView(ui: AnkoContext<IntroActivity>): View {
        return ui.relativeLayout{ //ui의 루트 레이아웃을 relativeLayout 로한다.
            gravity = Gravity.CENTER //레이아웃의 위치는 센터이다.

            textView("PARAYO")
            {
                textSize = 24f
                textColorResource = R.color.colorPrimary
                typeface = Typeface.DEFAULT_BOLD
            }

        }

    }

}
