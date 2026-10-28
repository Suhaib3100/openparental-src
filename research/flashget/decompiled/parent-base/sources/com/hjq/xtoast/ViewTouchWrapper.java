package com.hjq.xtoast;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.hjq.xtoast.XToast;

/* loaded from: classes6.dex */
final class ViewTouchWrapper implements View.OnTouchListener {
    private final XToast.OnTouchListener mListener;
    private final XToast<?> mToast;

    ViewTouchWrapper(XToast<?> xToast, XToast.OnTouchListener onTouchListener) {
        this.mToast = xToast;
        this.mListener = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        XToast.OnTouchListener onTouchListener = this.mListener;
        if (onTouchListener == null) {
            return false;
        }
        return onTouchListener.onTouch(this.mToast, view, motionEvent);
    }
}
