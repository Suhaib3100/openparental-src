package com.lxj.xpopup.photoview;

import android.widget.ImageView;
import androidx.core.view.f1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Util.java */
/* loaded from: classes5.dex */
class l {

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21257a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f21257a = iArr;
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
            throw new IllegalArgumentException(ProtectedSandApp.s("㔌"));
        }
        if (midZoom >= maxZoom) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㔋"));
        }
    }

    static int b(int action) {
        return (action & f1.f5504f) >> 8;
    }

    static boolean c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean d(final ImageView.ScaleType scaleType) {
        return (scaleType == null || a.f21257a[scaleType.ordinal()] == 1) ? false : true;
    }
}
