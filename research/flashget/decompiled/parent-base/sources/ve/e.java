package ve;

import androidx.collection.r2;
import androidx.collection.s;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import okio.j;
import okio.j0;
import okio.p;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001ad\u0010\u0014\u001a\u00020\u0012*\u00020\u00072K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0018\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001b\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a,\u0010&\u001a\u00020\u0012*\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b&\u0010'\u001a4\u0010+\u001a\u00020**\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b+\u0010,\u001a4\u0010-\u001a\u00020**\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u001e\u00100\u001a\u00020**\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010/H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u0014\u00102\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b2\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"", "", "value", "fromIndex", "toIndex", "b", "([IIII)I", "Lokio/l0;", "pos", "n", "(Lokio/l0;I)I", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "data", "offset", "byteCount", "Lkotlin/k2;", "action", "m", "(Lokio/l0;Lld/q;)V", "beginIndex", "endIndex", "l", "(Lokio/l0;IILld/q;)V", "Lokio/p;", "i", "(Lokio/l0;II)Lokio/p;", "", "f", "(Lokio/l0;I)B", "d", "(Lokio/l0;)I", "j", "(Lokio/l0;)[B", "Lokio/m;", "buffer", "k", "(Lokio/l0;Lokio/m;II)V", "other", "otherOffset", "", "g", "(Lokio/l0;ILokio/p;II)Z", "h", "(Lokio/l0;I[BII)Z", "", "c", "(Lokio/l0;Ljava/lang/Object;)Z", "e", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class e {
    public static final int b(@l int[] iArr, int i4, int i5, int i6) {
        l0.p(iArr, ProtectedSandApp.s("⅗"));
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i10 = (i5 + i7) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i4) {
                i5 = i10 + 1;
            } else {
                if (i11 <= i4) {
                    return i10;
                }
                i7 = i10 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final boolean c(@l okio.l0 l0Var, @m Object obj) {
        l0.p(l0Var, ProtectedSandApp.s("⅘"));
        if (obj == l0Var) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.q() == l0Var.q() && l0Var.U(0, pVar, 0, l0Var.q())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@l okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("⅙"));
        return l0Var.getDirectory()[l0Var.getSegments().length - 1];
    }

    public static final int e(@l okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("⅚"));
        int hashCode = l0Var.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = l0Var.getSegments().length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int i7 = l0Var.getDirectory()[length + i4];
            int i10 = l0Var.getDirectory()[i4];
            byte[] bArr = l0Var.getSegments()[i4];
            int i11 = (i10 - i6) + i7;
            while (i7 < i11) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i10;
        }
        l0Var.Y(i5);
        return i5;
    }

    public static final byte f(@l okio.l0 l0Var, int i4) {
        l0.p(l0Var, ProtectedSandApp.s("⅛"));
        j.e(l0Var.getDirectory()[l0Var.getSegments().length - 1], i4, 1L);
        int n4 = n(l0Var, i4);
        return l0Var.getSegments()[n4][(i4 - (n4 == 0 ? 0 : l0Var.getDirectory()[n4 - 1])) + l0Var.getDirectory()[l0Var.getSegments().length + n4]];
    }

    public static final boolean g(@l okio.l0 l0Var, int i4, @l p pVar, int i5, int i6) {
        l0.p(l0Var, ProtectedSandApp.s("⅜"));
        l0.p(pVar, ProtectedSandApp.s("⅝"));
        if (i4 < 0 || i4 > l0Var.q() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int n4 = n(l0Var, i4);
        while (i4 < i7) {
            int i10 = n4 == 0 ? 0 : l0Var.getDirectory()[n4 - 1];
            int i11 = l0Var.getDirectory()[n4] - i10;
            int i12 = l0Var.getDirectory()[l0Var.getSegments().length + n4];
            int min = Math.min(i7, i11 + i10) - i4;
            if (!pVar.V(i5, l0Var.getSegments()[n4], (i4 - i10) + i12, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            n4++;
        }
        return true;
    }

    public static final boolean h(@l okio.l0 l0Var, int i4, @l byte[] bArr, int i5, int i6) {
        l0.p(l0Var, ProtectedSandApp.s("⅜"));
        l0.p(bArr, ProtectedSandApp.s("⅝"));
        if (i4 < 0 || i4 > l0Var.q() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int n4 = n(l0Var, i4);
        while (i4 < i7) {
            int i10 = n4 == 0 ? 0 : l0Var.getDirectory()[n4 - 1];
            int i11 = l0Var.getDirectory()[n4] - i10;
            int i12 = l0Var.getDirectory()[l0Var.getSegments().length + n4];
            int min = Math.min(i7, i11 + i10) - i4;
            if (!j.d(l0Var.getSegments()[n4], (i4 - i10) + i12, bArr, i5, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            n4++;
        }
        return true;
    }

    @l
    public static final p i(@l okio.l0 l0Var, int i4, int i5) {
        l0.p(l0Var, ProtectedSandApp.s("⅞"));
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("Ⅲ"), i4, ProtectedSandApp.s("Ⅳ")).toString());
        }
        boolean z4 = i5 <= l0Var.q();
        String s4 = ProtectedSandApp.s("⅟");
        if (!z4) {
            StringBuilder a5 = s.a(s4, i5, ProtectedSandApp.s("Ⅱ"));
            a5.append(l0Var.q());
            a5.append(')');
            throw new IllegalArgumentException(a5.toString().toString());
        }
        int i6 = i5 - i4;
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(q.a(s4, i5, ProtectedSandApp.s("Ⅰ"), i4).toString());
        }
        if (i4 == 0 && i5 == l0Var.q()) {
            return l0Var;
        }
        if (i4 == i5) {
            return p.f85244f;
        }
        int n4 = n(l0Var, i4);
        int n5 = n(l0Var, i5 - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.l.l1(l0Var.getSegments(), n4, n5 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (n4 <= n5) {
            int i7 = 0;
            int i10 = n4;
            while (true) {
                iArr[i7] = Math.min(l0Var.getDirectory()[i10] - i4, i6);
                int i11 = i7 + 1;
                iArr[i7 + bArr.length] = l0Var.getDirectory()[l0Var.getSegments().length + i10];
                if (i10 == n5) {
                    break;
                }
                i10++;
                i7 = i11;
            }
        }
        int i12 = n4 != 0 ? l0Var.getDirectory()[n4 - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i4 - i12) + iArr[length];
        return new okio.l0(bArr, iArr);
    }

    @l
    public static final byte[] j(@l okio.l0 l0Var) {
        l0.p(l0Var, ProtectedSandApp.s("Ⅴ"));
        byte[] bArr = new byte[l0Var.q()];
        int length = l0Var.getSegments().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = l0Var.getDirectory()[length + i4];
            int i10 = l0Var.getDirectory()[i4];
            int i11 = i10 - i5;
            kotlin.collections.l.v0(l0Var.getSegments()[i4], bArr, i6, i7, i7 + i11);
            i6 += i11;
            i4++;
            i5 = i10;
        }
        return bArr;
    }

    public static final void k(@l okio.l0 l0Var, @l okio.m mVar, int i4, int i5) {
        l0.p(l0Var, ProtectedSandApp.s("Ⅵ"));
        l0.p(mVar, ProtectedSandApp.s("Ⅶ"));
        int i6 = i5 + i4;
        int n4 = n(l0Var, i4);
        while (i4 < i6) {
            int i7 = n4 == 0 ? 0 : l0Var.getDirectory()[n4 - 1];
            int i10 = l0Var.getDirectory()[n4] - i7;
            int i11 = l0Var.getDirectory()[l0Var.getSegments().length + n4];
            int min = Math.min(i6, i10 + i7) - i4;
            int i12 = (i4 - i7) + i11;
            j0 j0Var = new j0(l0Var.getSegments()[n4], i12, i12 + min, true, false);
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
            i4 += min;
            n4++;
        }
        mVar.Y(mVar.size() + l0Var.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(okio.l0 l0Var, int i4, int i5, ld.q<? super byte[], ? super Integer, ? super Integer, k2> qVar) {
        int n4 = n(l0Var, i4);
        while (i4 < i5) {
            int i6 = n4 == 0 ? 0 : l0Var.getDirectory()[n4 - 1];
            int i7 = l0Var.getDirectory()[n4] - i6;
            int i10 = l0Var.getDirectory()[l0Var.getSegments().length + n4];
            int min = Math.min(i5, i7 + i6) - i4;
            qVar.R(l0Var.getSegments()[n4], Integer.valueOf((i4 - i6) + i10), Integer.valueOf(min));
            i4 += min;
            n4++;
        }
    }

    public static final void m(@l okio.l0 l0Var, @l ld.q<? super byte[], ? super Integer, ? super Integer, k2> qVar) {
        l0.p(l0Var, ProtectedSandApp.s("Ⅷ"));
        l0.p(qVar, ProtectedSandApp.s("Ⅸ"));
        int length = l0Var.getSegments().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = l0Var.getDirectory()[length + i4];
            int i7 = l0Var.getDirectory()[i4];
            qVar.R(l0Var.getSegments()[i4], Integer.valueOf(i6), Integer.valueOf(i7 - i5));
            i4++;
            i5 = i7;
        }
    }

    public static final int n(@l okio.l0 l0Var, int i4) {
        l0.p(l0Var, ProtectedSandApp.s("Ⅹ"));
        int b5 = b(l0Var.getDirectory(), i4 + 1, 0, l0Var.getSegments().length);
        return b5 >= 0 ? b5 : ~b5;
    }
}
