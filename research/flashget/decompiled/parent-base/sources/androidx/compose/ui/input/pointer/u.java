package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\"\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0015\u0010\u0014\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\"\u0015\u0010\u0016\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r\"\u0015\u0010\u0018\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\"\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r\"\u0015\u0010\u001c\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r\"\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r\"\u0015\u0010 \u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r\"\u0015\u0010\"\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b!\u0010\r\"\u0015\u0010$\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010\r\"\u0015\u0010&\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010\r\"\u0015\u0010(\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010\r\"\u0015\u0010*\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b)\u0010\r\"\u0015\u0010,\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010\r*\f\b\u0000\u0010-\"\u00020\u00042\u00020\u0004*\f\b\u0000\u0010.\"\u00020\u00042\u00020\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/input/pointer/p0;", "a", "()I", "Landroidx/compose/ui/input/pointer/o;", "", "buttonIndex", "", "n", "(II)Z", "c", "(I)I", "d", "o", "(I)Z", "isPrimaryPressed", "q", "isSecondaryPressed", "t", "isTertiaryPressed", "g", "isBackPressed", "j", "isForwardPressed", "b", "areAnyPressed", "i", "isCtrlPressed", "l", "isMetaPressed", "f", "isAltPressed", "e", "isAltGraphPressed", "s", "isSymPressed", "r", "isShiftPressed", "k", "isFunctionPressed", "h", "isCapsLockOn", "p", "isScrollLockOn", "m", "isNumLockOn", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {
    public static final int a() {
        return 0;
    }

    public static final boolean b(int i4) {
        return i4 != 0;
    }

    public static final int c(int i4) {
        if (i4 == 0) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = (i4 & (-97)) | ((i4 & 96) >>> 5); (i6 & 1) == 0; i6 >>>= 1) {
            i5++;
        }
        return i5;
    }

    public static final int d(int i4) {
        int i5 = -1;
        for (int i6 = (i4 & (-97)) | ((i4 & 96) >>> 5); i6 != 0; i6 >>>= 1) {
            i5++;
        }
        return i5;
    }

    public static final boolean e(int i4) {
        return false;
    }

    public static final boolean f(int i4) {
        return (i4 & 2) != 0;
    }

    public static final boolean g(int i4) {
        return (i4 & 8) != 0;
    }

    public static final boolean h(int i4) {
        return (i4 & 1048576) != 0;
    }

    public static final boolean i(int i4) {
        return (i4 & 4096) != 0;
    }

    public static final boolean j(int i4) {
        return (i4 & 16) != 0;
    }

    public static final boolean k(int i4) {
        return (i4 & 8) != 0;
    }

    public static final boolean l(int i4) {
        return (i4 & 65536) != 0;
    }

    public static final boolean m(int i4) {
        return (i4 & 2097152) != 0;
    }

    public static final boolean n(int i4, int i5) {
        if (i5 == 0) {
            return o(i4);
        }
        if (i5 == 1) {
            return q(i4);
        }
        if (i5 == 2 || i5 == 3 || i5 == 4) {
            if ((i4 & (1 << i5)) != 0) {
                return true;
            }
        } else if ((i4 & (1 << (i5 + 2))) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean o(int i4) {
        return (i4 & 33) != 0;
    }

    public static final boolean p(int i4) {
        return (i4 & 4194304) != 0;
    }

    public static final boolean q(int i4) {
        return (i4 & 66) != 0;
    }

    public static final boolean r(int i4) {
        return (i4 & 1) != 0;
    }

    public static final boolean s(int i4) {
        return (i4 & 4) != 0;
    }

    public static final boolean t(int i4) {
        return (i4 & 4) != 0;
    }
}
