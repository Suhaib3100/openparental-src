package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.compose.ui.graphics.k1;
import kotlin.Metadata;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/k1;", "", "a", "(I)Z", "Landroid/graphics/PorterDuff$Mode;", "d", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "b", "(I)Landroid/graphics/BlendMode;", "c", "(Landroid/graphics/BlendMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: AndroidBlendMode.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17812a;

        static {
            BlendMode[] values;
            BlendMode blendMode;
            int ordinal;
            BlendMode blendMode2;
            int ordinal2;
            BlendMode blendMode3;
            int ordinal3;
            BlendMode blendMode4;
            int ordinal4;
            BlendMode blendMode5;
            int ordinal5;
            BlendMode blendMode6;
            int ordinal6;
            BlendMode blendMode7;
            int ordinal7;
            BlendMode blendMode8;
            int ordinal8;
            BlendMode blendMode9;
            int ordinal9;
            BlendMode blendMode10;
            int ordinal10;
            BlendMode blendMode11;
            int ordinal11;
            BlendMode blendMode12;
            int ordinal12;
            BlendMode blendMode13;
            int ordinal13;
            BlendMode blendMode14;
            int ordinal14;
            BlendMode blendMode15;
            int ordinal15;
            BlendMode blendMode16;
            int ordinal16;
            BlendMode blendMode17;
            int ordinal17;
            BlendMode blendMode18;
            int ordinal18;
            BlendMode blendMode19;
            int ordinal19;
            BlendMode blendMode20;
            int ordinal20;
            BlendMode blendMode21;
            int ordinal21;
            BlendMode blendMode22;
            int ordinal22;
            BlendMode blendMode23;
            int ordinal23;
            BlendMode blendMode24;
            int ordinal24;
            BlendMode blendMode25;
            int ordinal25;
            BlendMode blendMode26;
            int ordinal26;
            BlendMode blendMode27;
            int ordinal27;
            BlendMode blendMode28;
            int ordinal28;
            BlendMode blendMode29;
            int ordinal29;
            values = BlendMode.values();
            int[] iArr = new int[values.length];
            try {
                blendMode29 = BlendMode.CLEAR;
                ordinal29 = blendMode29.ordinal();
                iArr[ordinal29] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                blendMode28 = BlendMode.SRC;
                ordinal28 = blendMode28.ordinal();
                iArr[ordinal28] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                blendMode27 = BlendMode.DST;
                ordinal27 = blendMode27.ordinal();
                iArr[ordinal27] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                blendMode26 = BlendMode.SRC_OVER;
                ordinal26 = blendMode26.ordinal();
                iArr[ordinal26] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                blendMode25 = BlendMode.DST_OVER;
                ordinal25 = blendMode25.ordinal();
                iArr[ordinal25] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                blendMode24 = BlendMode.SRC_IN;
                ordinal24 = blendMode24.ordinal();
                iArr[ordinal24] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                blendMode23 = BlendMode.DST_IN;
                ordinal23 = blendMode23.ordinal();
                iArr[ordinal23] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                blendMode22 = BlendMode.SRC_OUT;
                ordinal22 = blendMode22.ordinal();
                iArr[ordinal22] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                blendMode21 = BlendMode.DST_OUT;
                ordinal21 = blendMode21.ordinal();
                iArr[ordinal21] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                blendMode20 = BlendMode.SRC_ATOP;
                ordinal20 = blendMode20.ordinal();
                iArr[ordinal20] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                blendMode19 = BlendMode.DST_ATOP;
                ordinal19 = blendMode19.ordinal();
                iArr[ordinal19] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                blendMode18 = BlendMode.XOR;
                ordinal18 = blendMode18.ordinal();
                iArr[ordinal18] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                blendMode17 = BlendMode.PLUS;
                ordinal17 = blendMode17.ordinal();
                iArr[ordinal17] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                blendMode16 = BlendMode.MODULATE;
                ordinal16 = blendMode16.ordinal();
                iArr[ordinal16] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                blendMode15 = BlendMode.SCREEN;
                ordinal15 = blendMode15.ordinal();
                iArr[ordinal15] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                blendMode14 = BlendMode.OVERLAY;
                ordinal14 = blendMode14.ordinal();
                iArr[ordinal14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                blendMode13 = BlendMode.DARKEN;
                ordinal13 = blendMode13.ordinal();
                iArr[ordinal13] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                blendMode12 = BlendMode.LIGHTEN;
                ordinal12 = blendMode12.ordinal();
                iArr[ordinal12] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                blendMode11 = BlendMode.COLOR_DODGE;
                ordinal11 = blendMode11.ordinal();
                iArr[ordinal11] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                blendMode10 = BlendMode.COLOR_BURN;
                ordinal10 = blendMode10.ordinal();
                iArr[ordinal10] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                blendMode9 = BlendMode.HARD_LIGHT;
                ordinal9 = blendMode9.ordinal();
                iArr[ordinal9] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                blendMode8 = BlendMode.SOFT_LIGHT;
                ordinal8 = blendMode8.ordinal();
                iArr[ordinal8] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                blendMode7 = BlendMode.DIFFERENCE;
                ordinal7 = blendMode7.ordinal();
                iArr[ordinal7] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                blendMode6 = BlendMode.EXCLUSION;
                ordinal6 = blendMode6.ordinal();
                iArr[ordinal6] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                blendMode5 = BlendMode.MULTIPLY;
                ordinal5 = blendMode5.ordinal();
                iArr[ordinal5] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                blendMode4 = BlendMode.HUE;
                ordinal4 = blendMode4.ordinal();
                iArr[ordinal4] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                blendMode3 = BlendMode.SATURATION;
                ordinal3 = blendMode3.ordinal();
                iArr[ordinal3] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                blendMode2 = BlendMode.COLOR;
                ordinal2 = blendMode2.ordinal();
                iArr[ordinal2] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                blendMode = BlendMode.LUMINOSITY;
                ordinal = blendMode.ordinal();
                iArr[ordinal] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f17812a = iArr;
        }
    }

    public static final boolean a(int i4) {
        if (Build.VERSION.SDK_INT < 29) {
            k1.INSTANCE.getClass();
            if (!k1.G(i4, k1.f17877f) && d(i4) == PorterDuff.Mode.SRC_OVER) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    @androidx.annotation.x0(29)
    public static final BlendMode b(int i4) {
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
        BlendMode blendMode30;
        k1.Companion companion = k1.INSTANCE;
        companion.getClass();
        if (k1.G(i4, k1.f17874c)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17875d)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17876e)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17877f)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17878g)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17879h)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17880i)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17881j)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17882k)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17883l)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17884m)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17885n)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17886o)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17887p)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17888q)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17889r)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17890s)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17891t)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17892u)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17893v)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17894w)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17895x)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17896y)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17897z)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        companion.getClass();
        if (k1.G(i4, k1.A)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        companion.getClass();
        if (k1.G(i4, k1.B)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        companion.getClass();
        if (k1.G(i4, k1.C)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        companion.getClass();
        if (k1.G(i4, k1.D)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        companion.getClass();
        if (k1.G(i4, k1.E)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    @androidx.annotation.x0(29)
    public static final int c(@fg.l BlendMode blendMode) {
        int ordinal;
        int[] iArr = a.f17812a;
        ordinal = blendMode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                k1.INSTANCE.getClass();
                return k1.f17874c;
            case 2:
                k1.INSTANCE.getClass();
                return k1.f17875d;
            case 3:
                k1.INSTANCE.getClass();
                return k1.f17876e;
            case 4:
                k1.INSTANCE.getClass();
                return k1.f17877f;
            case 5:
                k1.INSTANCE.getClass();
                return k1.f17878g;
            case 6:
                k1.INSTANCE.getClass();
                return k1.f17879h;
            case 7:
                k1.INSTANCE.getClass();
                return k1.f17880i;
            case 8:
                k1.INSTANCE.getClass();
                return k1.f17881j;
            case 9:
                k1.INSTANCE.getClass();
                return k1.f17882k;
            case 10:
                k1.INSTANCE.getClass();
                return k1.f17883l;
            case 11:
                k1.INSTANCE.getClass();
                return k1.f17884m;
            case 12:
                k1.INSTANCE.getClass();
                return k1.f17885n;
            case 13:
                k1.INSTANCE.getClass();
                return k1.f17886o;
            case 14:
                k1.INSTANCE.getClass();
                return k1.f17887p;
            case 15:
                k1.INSTANCE.getClass();
                return k1.f17888q;
            case 16:
                k1.INSTANCE.getClass();
                return k1.f17889r;
            case 17:
                k1.INSTANCE.getClass();
                return k1.f17890s;
            case 18:
                k1.INSTANCE.getClass();
                return k1.f17891t;
            case 19:
                k1.INSTANCE.getClass();
                return k1.f17892u;
            case 20:
                k1.INSTANCE.getClass();
                return k1.f17893v;
            case 21:
                k1.INSTANCE.getClass();
                return k1.f17894w;
            case 22:
                k1.INSTANCE.getClass();
                return k1.f17895x;
            case 23:
                k1.INSTANCE.getClass();
                return k1.f17896y;
            case 24:
                k1.INSTANCE.getClass();
                return k1.f17897z;
            case 25:
                k1.INSTANCE.getClass();
                return k1.A;
            case 26:
                k1.INSTANCE.getClass();
                return k1.B;
            case 27:
                k1.INSTANCE.getClass();
                return k1.C;
            case 28:
                k1.INSTANCE.getClass();
                return k1.D;
            case 29:
                k1.INSTANCE.getClass();
                return k1.E;
            default:
                k1.INSTANCE.getClass();
                return k1.f17877f;
        }
    }

    @fg.l
    public static final PorterDuff.Mode d(int i4) {
        k1.Companion companion = k1.INSTANCE;
        companion.getClass();
        if (k1.G(i4, k1.f17874c)) {
            return PorterDuff.Mode.CLEAR;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17875d)) {
            return PorterDuff.Mode.SRC;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17876e)) {
            return PorterDuff.Mode.DST;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17877f)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17878g)) {
            return PorterDuff.Mode.DST_OVER;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17879h)) {
            return PorterDuff.Mode.SRC_IN;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17880i)) {
            return PorterDuff.Mode.DST_IN;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17881j)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17882k)) {
            return PorterDuff.Mode.DST_OUT;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17883l)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17884m)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17885n)) {
            return PorterDuff.Mode.XOR;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17886o)) {
            return PorterDuff.Mode.ADD;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17888q)) {
            return PorterDuff.Mode.SCREEN;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17889r)) {
            return PorterDuff.Mode.OVERLAY;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17890s)) {
            return PorterDuff.Mode.DARKEN;
        }
        companion.getClass();
        if (k1.G(i4, k1.f17891t)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        companion.getClass();
        return k1.G(i4, k1.f17887p) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
