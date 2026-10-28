package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aZ\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/o;", "cb", "Landroidx/compose/ui/node/w;", "d", "(IILandroidx/compose/ui/node/o;)Landroidx/compose/ui/node/w;", "diagonals", "callback", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/node/w;Landroidx/compose/ui/node/o;)V", "e", "(IILandroidx/compose/ui/node/o;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/f;", "forward", "backward", "", "snake", "", "h", "(IIIILandroidx/compose/ui/node/o;[I[I[I)Z", "g", "(IIIILandroidx/compose/ui/node/o;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", "i", "j", "([III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a1 {
    private static final void b(w wVar, o oVar) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < wVar.getLastIndex()) {
            int i7 = i4 + 2;
            int b5 = wVar.b(i4) - wVar.b(i7);
            int b6 = wVar.b(i4 + 1) - wVar.b(i7);
            int b7 = wVar.b(i7);
            i4 += 3;
            while (i5 < b5) {
                oVar.a(i6, i5);
                i5++;
            }
            while (i6 < b6) {
                oVar.c(i6);
                i6++;
            }
            while (true) {
                int i10 = b7 - 1;
                if (b7 > 0) {
                    oVar.d(i5, i6);
                    i5++;
                    i6++;
                    b7 = i10;
                }
            }
        }
    }

    private static final boolean c(int i4, int i5, int i6, int i7, o oVar, int[] iArr, int[] iArr2, int i10, int[] iArr3) {
        int e4;
        int i11;
        int i12;
        int i13 = (i5 - i4) - (i7 - i6);
        boolean z4 = i13 % 2 == 0;
        int i14 = -i10;
        for (int i15 = i14; i15 <= i10; i15 += 2) {
            if (i15 == i14 || (i15 != i10 && f.e(iArr2, i15 + 1) < f.e(iArr2, i15 - 1))) {
                e4 = f.e(iArr2, i15 + 1);
                i11 = e4;
            } else {
                e4 = f.e(iArr2, i15 - 1);
                i11 = e4 - 1;
            }
            int i16 = i7 - ((i5 - i11) - i15);
            int i17 = (i10 == 0 || i11 != e4) ? i16 : i16 + 1;
            while (i11 > i4 && i16 > i6) {
                if (!oVar.b(i11 - 1, i16 - 1)) {
                    break;
                }
                i11--;
                i16--;
            }
            f.h(iArr2, i15, i11);
            if (z4 && (i12 = i13 - i15) >= i14 && i12 <= i10) {
                if (f.e(iArr, i12) >= i11) {
                    f(i11, i16, e4, i17, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final w d(int i4, int i5, o oVar) {
        int[] iArr;
        int i6 = ((i4 + i5) + 1) / 2;
        w wVar = new w(i6 * 3);
        w wVar2 = new w(i6 * 4);
        wVar2.h(0, i4, 0, i5);
        int i7 = (i6 * 2) + 1;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int[] iArr4 = new int[5];
        while (wVar2.d()) {
            int f4 = wVar2.f();
            int f5 = wVar2.f();
            int f6 = wVar2.f();
            int f7 = wVar2.f();
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr2;
            if (h(f7, f6, f5, f4, oVar, iArr2, iArr3, iArr5)) {
                if (a2.g(iArr5) > 0) {
                    iArr = iArr5;
                    a2.a(iArr, wVar);
                } else {
                    iArr = iArr5;
                }
                wVar2.h(f7, iArr[0], f5, iArr[1]);
                wVar2.h(iArr[2], f6, iArr[3], f4);
                iArr4 = iArr;
                iArr2 = iArr6;
            } else {
                iArr4 = iArr5;
                iArr2 = iArr6;
            }
        }
        wVar.j();
        wVar.g(i4, i5, 0);
        return wVar;
    }

    public static final void e(int i4, int i5, @fg.l o oVar) {
        b(d(i4, i5, oVar), oVar);
    }

    public static final void f(int i4, int i5, int i6, int i7, boolean z4, @fg.l int[] iArr) {
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i6;
        iArr[3] = i7;
        iArr[4] = z4 ? 1 : 0;
    }

    private static final boolean g(int i4, int i5, int i6, int i7, o oVar, int[] iArr, int[] iArr2, int i10, int[] iArr3) {
        int e4;
        int i11;
        int i12;
        int i13 = (i5 - i4) - (i7 - i6);
        boolean z4 = Math.abs(i13) % 2 == 1;
        int i14 = -i10;
        for (int i15 = i14; i15 <= i10; i15 += 2) {
            if (i15 == i14 || (i15 != i10 && f.e(iArr, i15 + 1) > f.e(iArr, i15 - 1))) {
                e4 = f.e(iArr, i15 + 1);
                i11 = e4;
            } else {
                e4 = f.e(iArr, i15 - 1);
                i11 = e4 + 1;
            }
            int i16 = ((i11 - i4) + i6) - i15;
            int i17 = (i10 == 0 || i11 != e4) ? i16 : i16 - 1;
            while (i11 < i5 && i16 < i7) {
                if (!oVar.b(i11, i16)) {
                    break;
                }
                i11++;
                i16++;
            }
            f.h(iArr, i15, i11);
            if (z4 && (i12 = i13 - i15) >= i14 + 1 && i12 <= i10 - 1) {
                if (f.e(iArr2, i12) <= i11) {
                    f(e4, i17, i11, i16, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i4, int i5, int i6, int i7, o oVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = i5 - i4;
        int i11 = i7 - i6;
        if (i10 >= 1 && i11 >= 1) {
            int i12 = ((i10 + i11) + 1) / 2;
            f.h(iArr, 1, i4);
            f.h(iArr2, 1, i5);
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13;
                if (g(i4, i5, i6, i7, oVar, iArr, iArr2, i13, iArr3) || c(i4, i5, i6, i7, oVar, iArr, iArr2, i14, iArr3)) {
                    return true;
                }
                i13 = i14 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i4, int i5) {
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
    }
}
