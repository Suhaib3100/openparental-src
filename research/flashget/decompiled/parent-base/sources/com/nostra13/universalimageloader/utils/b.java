package com.nostra13.universalimageloader.utils;

import android.opengl.GLES10;
import com.nostra13.universalimageloader.core.assist.h;

/* compiled from: ImageSizeUtils.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f70515a = 2048;

    /* renamed from: b, reason: collision with root package name */
    private static com.nostra13.universalimageloader.core.assist.e f70516b;

    /* compiled from: ImageSizeUtils.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70517a;

        static {
            int[] iArr = new int[h.values().length];
            f70517a = iArr;
            try {
                iArr[h.FIT_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70517a[h.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f70516b = new com.nostra13.universalimageloader.core.assist.e(max, max);
    }

    private b() {
    }

    public static int a(com.nostra13.universalimageloader.core.assist.e eVar, com.nostra13.universalimageloader.core.assist.e eVar2, h hVar, boolean z4) {
        int max;
        int b5 = eVar.b();
        int a5 = eVar.a();
        int b6 = eVar2.b();
        int a6 = eVar2.a();
        int i4 = a.f70517a[hVar.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                max = 1;
            } else if (z4) {
                int i5 = b5 / 2;
                int i6 = a5 / 2;
                max = 1;
                while (i5 / max > b6 && i6 / max > a6) {
                    max *= 2;
                }
            } else {
                max = Math.min(b5 / b6, a5 / a6);
            }
        } else if (z4) {
            int i7 = b5 / 2;
            int i10 = a5 / 2;
            max = 1;
            while (true) {
                if (i7 / max <= b6 && i10 / max <= a6) {
                    break;
                }
                max *= 2;
            }
        } else {
            max = Math.max(b5 / b6, a5 / a6);
        }
        return d(b5, a5, max >= 1 ? max : 1, z4);
    }

    public static float b(com.nostra13.universalimageloader.core.assist.e eVar, com.nostra13.universalimageloader.core.assist.e eVar2, h hVar, boolean z4) {
        int b5 = eVar.b();
        int a5 = eVar.a();
        int b6 = eVar2.b();
        int a6 = eVar2.a();
        float f4 = b5;
        float f5 = f4 / b6;
        float f6 = a5;
        float f7 = f6 / a6;
        if ((hVar != h.FIT_INSIDE || f5 < f7) && (hVar != h.CROP || f5 >= f7)) {
            b6 = (int) (f4 / f7);
        } else {
            a6 = (int) (f6 / f5);
        }
        if ((z4 || b6 >= b5 || a6 >= a5) && (!z4 || b6 == b5 || a6 == a5)) {
            return 1.0f;
        }
        return b6 / f4;
    }

    public static int c(com.nostra13.universalimageloader.core.assist.e eVar) {
        int b5 = eVar.b();
        int a5 = eVar.a();
        return Math.max((int) Math.ceil(b5 / f70516b.b()), (int) Math.ceil(a5 / f70516b.a()));
    }

    private static int d(int i4, int i5, int i6, boolean z4) {
        int b5 = f70516b.b();
        int a5 = f70516b.a();
        while (true) {
            if (i4 / i6 <= b5 && i5 / i6 <= a5) {
                return i6;
            }
            i6 = z4 ? i6 * 2 : i6 + 1;
        }
    }

    public static com.nostra13.universalimageloader.core.assist.e e(com.nostra13.universalimageloader.core.imageaware.a aVar, com.nostra13.universalimageloader.core.assist.e eVar) {
        int width = aVar.getWidth();
        int b5 = width <= 0 ? eVar.b() : Math.min(width, eVar.b());
        int height = aVar.getHeight();
        return new com.nostra13.universalimageloader.core.assist.e(b5, height <= 0 ? eVar.a() : Math.min(height, eVar.a()));
    }
}
