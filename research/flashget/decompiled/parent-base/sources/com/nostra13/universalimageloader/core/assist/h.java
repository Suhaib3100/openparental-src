package com.nostra13.universalimageloader.core.assist;

import android.widget.ImageView;

/* compiled from: ViewScaleType.java */
/* loaded from: classes6.dex */
public enum h {
    FIT_INSIDE,
    CROP;

    /* compiled from: ViewScaleType.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70284a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f70284a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70284a[ImageView.ScaleType.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70284a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70284a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70284a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70284a[ImageView.ScaleType.MATRIX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70284a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f70284a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static h fromImageView(ImageView imageView) {
        int i4 = a.f70284a[imageView.getScaleType().ordinal()];
        return (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? FIT_INSIDE : CROP;
    }
}
