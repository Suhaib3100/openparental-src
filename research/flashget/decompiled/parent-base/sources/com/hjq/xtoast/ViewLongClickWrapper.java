package com.hjq.xtoast;

import android.view.View;
import com.hjq.xtoast.XToast;

/* loaded from: classes6.dex */
final class ViewLongClickWrapper implements View.OnLongClickListener {
    private final XToast.OnLongClickListener mListener;
    private final XToast<?> mToast;

    ViewLongClickWrapper(XToast<?> xToast, XToast.OnLongClickListener onLongClickListener) {
        this.mToast = xToast;
        this.mListener = onLongClickListener;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        XToast.OnLongClickListener onLongClickListener = this.mListener;
        if (onLongClickListener == null) {
            return false;
        }
        return onLongClickListener.onLongClick(this.mToast, view);
    }
}
