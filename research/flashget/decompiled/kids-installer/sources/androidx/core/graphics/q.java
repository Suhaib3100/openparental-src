package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: BlendModeUtils.java */
/* loaded from: classes.dex */
class q {

    /* compiled from: BlendModeUtils.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4787a;

        static {
            int[] iArr = new int[p.values().length];
            f4787a = iArr;
            try {
                iArr[p.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4787a[p.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4787a[p.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4787a[p.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4787a[p.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4787a[p.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4787a[p.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4787a[p.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4787a[p.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4787a[p.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4787a[p.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4787a[p.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4787a[p.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4787a[p.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4787a[p.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4787a[p.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4787a[p.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4787a[p.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4787a[p.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4787a[p.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4787a[p.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4787a[p.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4787a[p.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4787a[p.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4787a[p.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4787a[p.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4787a[p.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4787a[p.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4787a[p.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* compiled from: BlendModeUtils.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        static Object a(@androidx.annotation.o0 p pVar) {
            BlendMode blendMode;
            BlendMode blendMode2;
            BlendMode blendMode3;
            BlendMode blendMode4;
            BlendMode blendMode5;
            BlendMode blendMode6;
            BlendMode blendMode7;
            BlendMode blendMode8;
            BlendMode blendMode9;
            BlendMode blendMode10;
            BlendMode blendMode11;
            BlendMode blendMode12;
            BlendMode blendMode13;
            BlendMode blendMode14;
            BlendMode blendMode15;
            BlendMode blendMode16;
            BlendMode blendMode17;
            BlendMode blendMode18;
            BlendMode blendMode19;
            BlendMode blendMode20;
            BlendMode blendMode21;
            BlendMode blendMode22;
            BlendMode blendMode23;
            BlendMode blendMode24;
            BlendMode blendMode25;
            BlendMode blendMode26;
            BlendMode blendMode27;
            BlendMode blendMode28;
            BlendMode blendMode29;
            switch (a.f4787a[pVar.ordinal()]) {
                case 1:
                    blendMode = BlendMode.CLEAR;
                    return blendMode;
                case 2:
                    blendMode2 = BlendMode.SRC;
                    return blendMode2;
                case 3:
                    blendMode3 = BlendMode.DST;
                    return blendMode3;
                case 4:
                    blendMode4 = BlendMode.SRC_OVER;
                    return blendMode4;
                case 5:
                    blendMode5 = BlendMode.DST_OVER;
                    return blendMode5;
                case 6:
                    blendMode6 = BlendMode.SRC_IN;
                    return blendMode6;
                case 7:
                    blendMode7 = BlendMode.DST_IN;
                    return blendMode7;
                case 8:
                    blendMode8 = BlendMode.SRC_OUT;
                    return blendMode8;
                case 9:
                    blendMode9 = BlendMode.DST_OUT;
                    return blendMode9;
                case 10:
                    blendMode10 = BlendMode.SRC_ATOP;
                    return blendMode10;
                case 11:
                    blendMode11 = BlendMode.DST_ATOP;
                    return blendMode11;
                case 12:
                    blendMode12 = BlendMode.XOR;
                    return blendMode12;
                case 13:
                    blendMode13 = BlendMode.PLUS;
                    return blendMode13;
                case 14:
                    blendMode14 = BlendMode.MODULATE;
                    return blendMode14;
                case 15:
                    blendMode15 = BlendMode.SCREEN;
                    return blendMode15;
                case 16:
                    blendMode16 = BlendMode.OVERLAY;
                    return blendMode16;
                case 17:
                    blendMode17 = BlendMode.DARKEN;
                    return blendMode17;
                case 18:
                    blendMode18 = BlendMode.LIGHTEN;
                    return blendMode18;
                case 19:
                    blendMode19 = BlendMode.COLOR_DODGE;
                    return blendMode19;
                case 20:
                    blendMode20 = BlendMode.COLOR_BURN;
                    return blendMode20;
                case 21:
                    blendMode21 = BlendMode.HARD_LIGHT;
                    return blendMode21;
                case 22:
                    blendMode22 = BlendMode.SOFT_LIGHT;
                    return blendMode22;
                case 23:
                    blendMode23 = BlendMode.DIFFERENCE;
                    return blendMode23;
                case 24:
                    blendMode24 = BlendMode.EXCLUSION;
                    return blendMode24;
                case 25:
                    blendMode25 = BlendMode.MULTIPLY;
                    return blendMode25;
                case 26:
                    blendMode26 = BlendMode.HUE;
                    return blendMode26;
                case 27:
                    blendMode27 = BlendMode.SATURATION;
                    return blendMode27;
                case 28:
                    blendMode28 = BlendMode.COLOR;
                    return blendMode28;
                case 29:
                    blendMode29 = BlendMode.LUMINOSITY;
                    return blendMode29;
                default:
                    return null;
            }
        }
    }

    private q() {
    }

    @androidx.annotation.q0
    static PorterDuff.Mode a(@androidx.annotation.q0 p pVar) {
        if (pVar == null) {
            return null;
        }
        switch (a.f4787a[pVar.ordinal()]) {
        }
        return null;
    }
}
