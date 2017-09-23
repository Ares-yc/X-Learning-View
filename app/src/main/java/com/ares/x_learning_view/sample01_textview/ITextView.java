package com.ares.x_learning_view.sample01_textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：自定义TextView
 * 版    本：1.0.0
 * 创建时间：2017/9/23.
 * 修改时间：2017/9/23.
 * ====================================
 */

public class ITextView extends View{
    public ITextView(Context context) {
        super(context);
    }

    public ITextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ITextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ITextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
