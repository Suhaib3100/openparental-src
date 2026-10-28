package com.lxj.xpopup.photoview;

import android.widget.ImageView;
import androidx.core.view.u0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Util.java */
/* loaded from: classes6.dex */
class l {

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69734a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f69734a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    l() {
    }

    static void a(float minZoom, float midZoom, float maxZoom) {
        if (minZoom >= midZoom) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ឣ\u0001"));
        }
        if (midZoom >= maxZoom) {
            throw new IllegalArgumentException(ProtectedSandApp.s("អ\u0001"));
        }
    }

    static int b(int action) {
        return (action & u0.f27413f) >> 8;
    }

    static boolean c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean d(final ImageView.ScaleType scaleType) {
        return (scaleType == null || a.f69734a[scaleType.ordinal()] == 1) ? false : true;
    }
}
