package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.o0;
import com.airbnb.lottie.utils.i;

/* compiled from: LPaint.java */
/* loaded from: classes3.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(i.d(i4, 0, 255));
        } else {
            setColor((i.d(i4, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@o0 LocaleList localeList) {
    }

    public a(int i4) {
        super(i4);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i4, PorterDuff.Mode mode) {
        super(i4);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
