package com.airbnb.lottie;

/* compiled from: RenderMode.java */
/* loaded from: classes3.dex */
public enum z0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40236a;

        static {
            int[] iArr = new int[z0.values().length];
            f40236a = iArr;
            try {
                iArr[z0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40236a[z0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40236a[z0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i4, boolean z4, int i5) {
        int i6 = a.f40236a[ordinal()];
        if (i6 == 1) {
            return false;
        }
        if (i6 != 2) {
            return (z4 && i4 < 28) || i5 > 4 || i4 <= 25;
        }
        return true;
    }
}
