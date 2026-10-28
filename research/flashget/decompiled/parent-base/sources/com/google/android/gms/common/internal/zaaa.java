package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.DeviceProperties;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @q0 AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return i5;
        }
        if (i4 == 1) {
            return i6;
        }
        if (i4 == 2) {
            return i7;
        }
        throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("쬡"), i4));
    }

    public final void zaa(Resources resources, int i4, int i5) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i6);
        setMinWidth(i6);
        int i7 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i10 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i5, i7, i10, i10);
        int i11 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i5, i11, i12, i12);
        String s4 = ProtectedSandApp.s("쬢");
        if (i4 == 0 || i4 == 1) {
            zab = zab2;
        } else if (i4 != 2) {
            throw new IllegalStateException(android.support.v4.media.a.a(s4, i4));
        }
        Drawable drawable = resources.getDrawable(zab);
        drawable.setTintList(resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i13 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i14 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i5, i13, i14, i14))));
        if (i4 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i4 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i4 != 2) {
                throw new IllegalStateException(android.support.v4.media.a.a(s4, i4));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
