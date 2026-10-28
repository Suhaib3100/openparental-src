package v4;

import android.content.preferences.protobuf.v;
import androidx.core.app.x;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import okio.j;
import okio.j0;
import okio.m;
import okio.p;
import q3.q;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a]\u0010\u0012\u001a\u00020\u0010*\u00020\u00062K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0080\bø\u0001\u0000\u001aj\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0082\b\u001a\u001d\u0010\u0017\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u001a\r\u0010\u001b\u001a\u00020\n*\u00020\u0006H\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010\"\u001a\u00020!*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010#\u001a\u00020!*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010%\u001a\u00020!*\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0080\b\u001a\r\u0010&\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"", "", "value", "fromIndex", "toIndex", "b", "Lokio/l0;", "pos", "n", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "data", "offset", "byteCount", "Lkotlin/m2;", "action", "m", "beginIndex", "endIndex", "l", "Lokio/p;", "i", "", "f", "d", "j", "Lokio/m;", "buffer", "k", "other", "otherOffset", "", "g", "h", "", "c", "e", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class e {
    public static final int b(@d5.d int[] iArr, int i5, int i6, int i7) {
        l0.p(iArr, ProtectedSandApp.s("欞"));
        int i8 = i7 - 1;
        while (i6 <= i8) {
            int i9 = (i6 + i8) >>> 1;
            int i10 = iArr[i9];
            if (i10 < i5) {
                i6 = i9 + 1;
            } else {
                if (i10 <= i5) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return (-i6) - 1;
    }

    public static final boolean c(@d5.d okio.l0 l0Var, @d5.e Object obj) {
        l0.p(l0Var, ProtectedSandApp.s("欟"));
        if (obj == l0Var) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.i0() == l0Var.A() && l0Var.Z(0, pVar, 0, l0Var.A())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@d5.d okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("欠"));
        return l0Var.getDirectory()[l0Var.getSegments().length - 1];
    }

    public static final int e(@d5.d okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("次"));
        int hashCode = l0Var.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = l0Var.getSegments().length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int i8 = l0Var.getDirectory()[length + i5];
            int i9 = l0Var.getDirectory()[i5];
            byte[] bArr = l0Var.getSegments()[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        l0Var.d0(i6);
        return i6;
    }

    public static final byte f(@d5.d okio.l0 l0Var, int i5) {
        l0.p(l0Var, ProtectedSandApp.s("欢"));
        j.e(l0Var.getDirectory()[l0Var.getSegments().length - 1], i5, 1L);
        int n5 = n(l0Var, i5);
        return l0Var.getSegments()[n5][(i5 - (n5 == 0 ? 0 : l0Var.getDirectory()[n5 - 1])) + l0Var.getDirectory()[l0Var.getSegments().length + n5]];
    }

    public static final boolean g(@d5.d okio.l0 l0Var, int i5, @d5.d p pVar, int i6, int i7) {
        l0.p(l0Var, ProtectedSandApp.s("欣"));
        l0.p(pVar, ProtectedSandApp.s("欤"));
        if (i5 < 0 || i5 > l0Var.A() - i7) {
            return false;
        }
        int i8 = i7 + i5;
        int n5 = n(l0Var, i5);
        while (i5 < i8) {
            int i9 = n5 == 0 ? 0 : l0Var.getDirectory()[n5 - 1];
            int i10 = l0Var.getDirectory()[n5] - i9;
            int i11 = l0Var.getDirectory()[l0Var.getSegments().length + n5];
            int min = Math.min(i8, i10 + i9) - i5;
            if (!pVar.a0(i6, l0Var.getSegments()[n5], (i5 - i9) + i11, min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            n5++;
        }
        return true;
    }

    public static final boolean h(@d5.d okio.l0 l0Var, int i5, @d5.d byte[] bArr, int i6, int i7) {
        l0.p(l0Var, ProtectedSandApp.s("欥"));
        l0.p(bArr, ProtectedSandApp.s("欦"));
        if (i5 < 0 || i5 > l0Var.A() - i7 || i6 < 0 || i6 > bArr.length - i7) {
            return false;
        }
        int i8 = i7 + i5;
        int n5 = n(l0Var, i5);
        while (i5 < i8) {
            int i9 = n5 == 0 ? 0 : l0Var.getDirectory()[n5 - 1];
            int i10 = l0Var.getDirectory()[n5] - i9;
            int i11 = l0Var.getDirectory()[l0Var.getSegments().length + n5];
            int min = Math.min(i8, i10 + i9) - i5;
            if (!j.d(l0Var.getSegments()[n5], (i5 - i9) + i11, bArr, i6, min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            n5++;
        }
        return true;
    }

    @d5.d
    public static final p i(@d5.d okio.l0 l0Var, int i5, int i6) {
        Object[] l12;
        l0.p(l0Var, ProtectedSandApp.s("欧"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("欫"), i5, ProtectedSandApp.s("欬")).toString());
        }
        boolean z5 = i6 <= l0Var.A();
        String s5 = ProtectedSandApp.s("欨");
        if (!z5) {
            StringBuilder a6 = x.a(s5, i6, ProtectedSandApp.s("欪"));
            a6.append(l0Var.A());
            a6.append(')');
            throw new IllegalArgumentException(a6.toString().toString());
        }
        int i7 = i6 - i5;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(v.a(s5, i6, ProtectedSandApp.s("欩"), i5).toString());
        }
        if (i5 == 0 && i6 == l0Var.A()) {
            return l0Var;
        }
        if (i5 == i6) {
            return p.f31688s;
        }
        int n5 = n(l0Var, i5);
        int n6 = n(l0Var, i6 - 1);
        l12 = kotlin.collections.p.l1(l0Var.getSegments(), n5, n6 + 1);
        byte[][] bArr = (byte[][]) l12;
        int[] iArr = new int[bArr.length * 2];
        if (n5 <= n6) {
            int i8 = 0;
            int i9 = n5;
            while (true) {
                iArr[i8] = Math.min(l0Var.getDirectory()[i9] - i5, i7);
                int i10 = i8 + 1;
                iArr[i8 + bArr.length] = l0Var.getDirectory()[l0Var.getSegments().length + i9];
                if (i9 == n6) {
                    break;
                }
                i9++;
                i8 = i10;
            }
        }
        int i11 = n5 != 0 ? l0Var.getDirectory()[n5 - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i5 - i11) + iArr[length];
        return new okio.l0(bArr, iArr);
    }

    @d5.d
    public static final byte[] j(@d5.d okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("欭"));
        byte[] bArr = new byte[l0Var.A()];
        int length = l0Var.getSegments().length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int i8 = l0Var.getDirectory()[length + i5];
            int i9 = l0Var.getDirectory()[i5];
            int i10 = i9 - i6;
            kotlin.collections.p.v0(l0Var.getSegments()[i5], bArr, i7, i8, i8 + i10);
            i7 += i10;
            i5++;
            i6 = i9;
        }
        return bArr;
    }

    public static final void k(@d5.d okio.l0 l0Var, @d5.d m mVar, int i5, int i6) {
        l0.p(l0Var, ProtectedSandApp.s("欮"));
        l0.p(mVar, ProtectedSandApp.s("欯"));
        int i7 = i6 + i5;
        int n5 = n(l0Var, i5);
        while (i5 < i7) {
            int i8 = n5 == 0 ? 0 : l0Var.getDirectory()[n5 - 1];
            int i9 = l0Var.getDirectory()[n5] - i8;
            int i10 = l0Var.getDirectory()[l0Var.getSegments().length + n5];
            int min = Math.min(i7, i9 + i8) - i5;
            int i11 = (i5 - i8) + i10;
            j0 j0Var = new j0(l0Var.getSegments()[n5], i11, i11 + min, true, false);
            j0 j0Var2 = mVar.head;
            if (j0Var2 == null) {
                j0Var.prev = j0Var;
                j0Var.next = j0Var;
                mVar.head = j0Var;
            } else {
                l0.m(j0Var2);
                j0 j0Var3 = j0Var2.prev;
                l0.m(j0Var3);
                j0Var3.c(j0Var);
            }
            i5 += min;
            n5++;
        }
        mVar.M0(mVar.size() + l0Var.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(okio.l0 l0Var, int i5, int i6, q<? super byte[], ? super Integer, ? super Integer, m2> qVar) {
        int n5 = n(l0Var, i5);
        while (i5 < i6) {
            int i7 = n5 == 0 ? 0 : l0Var.getDirectory()[n5 - 1];
            int i8 = l0Var.getDirectory()[n5] - i7;
            int i9 = l0Var.getDirectory()[l0Var.getSegments().length + n5];
            int min = Math.min(i6, i8 + i7) - i5;
            qVar.G(l0Var.getSegments()[n5], Integer.valueOf((i5 - i7) + i9), Integer.valueOf(min));
            i5 += min;
            n5++;
        }
    }

    public static final void m(@d5.d okio.l0 l0Var, @d5.d q<? super byte[], ? super Integer, ? super Integer, m2> qVar) {
        l0.p(l0Var, ProtectedSandApp.s("欰"));
        l0.p(qVar, ProtectedSandApp.s("欱"));
        int length = l0Var.getSegments().length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = l0Var.getDirectory()[length + i5];
            int i8 = l0Var.getDirectory()[i5];
            qVar.G(l0Var.getSegments()[i5], Integer.valueOf(i7), Integer.valueOf(i8 - i6));
            i5++;
            i6 = i8;
        }
    }

    public static final int n(@d5.d okio.l0 l0Var, int i5) {
        l0.p(l0Var, ProtectedSandApp.s("欲"));
        int b6 = b(l0Var.getDirectory(), i5 + 1, 0, l0Var.getSegments().length);
        return b6 >= 0 ? b6 : ~b6;
    }
}
