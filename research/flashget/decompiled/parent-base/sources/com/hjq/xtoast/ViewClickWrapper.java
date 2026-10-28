package com.hjq.xtoast;

import android.view.View;
import com.hjq.xtoast.XToast;

/* loaded from: classes6.dex */
final class ViewClickWrapper implements View.OnClickListener {
    private final XToast.OnClickListener mListener;
    private final XToast<?> mToast;

    ViewClickWrapper(XToast<?> xToast, XToast.OnClickListener onClickListener) {
        this.mToast = xToast;
        this.mListener = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        XToast.OnClickListener onClickListener = this.mListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(this.mToast, view);
    }
}
