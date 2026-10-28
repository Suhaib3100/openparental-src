package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import com.google.android.material.internal.v;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes2.dex */
public class k {
    private k() {
    }

    @o0
    static e a(int i5) {
        return i5 != 0 ? i5 != 1 ? new n() : new f() : new n();
    }

    @o0
    static e b() {
        return new n();
    }

    @o0
    static g c() {
        return new g();
    }

    public static void d(@o0 View view, float f6) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).o0(f6);
        }
    }

    public static void e(@o0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j) background);
        }
    }

    public static void f(@o0 View view, @o0 j jVar) {
        if (jVar.c0()) {
            jVar.t0(v.i(view));
        }
    }
}
