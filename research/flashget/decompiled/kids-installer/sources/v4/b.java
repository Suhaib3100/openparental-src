package v4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import okio.i;
import okio.j;
import okio.m;
import okio.p;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0080\b\u001a\r\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a-\u0010\u0019\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0010H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010!\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u001d\u0010\"\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u001d\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u0017\u0010%\u001a\u00020\u0017*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010$H\u0080\b\u001a\r\u0010&\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\u0015\u0010'\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0080\b\u001a\u0011\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\r\u0010+\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b\u001a\r\u0010-\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a$\u00101\u001a\u000200*\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0010\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0002\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\u0018\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u00106\u001a\u00020\bH\u0002\"\u001a\u0010<\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lokio/p;", "", "F", "d", "e", "p", "A", "B", "", "beginIndex", "endIndex", "z", "pos", "", "m", "n", "", "C", "r", "offset", "other", "otherOffset", "byteCount", "", "v", "w", "prefix", "x", "y", "suffix", "j", "k", "fromIndex", "q", "s", "t", "", "l", "o", "f", "data", "u", "D", "i", "g", "h", "Lokio/m;", "buffer", "Lkotlin/m2;", "G", "", "c", "H", "E", "codePointCount", "", "a", "[C", "I", "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final char[] f33897a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @d5.d
    public static final p A(@d5.d p pVar) {
        byte b6;
        l0.p(pVar, ProtectedSandApp.s("橢"));
        for (int i5 = 0; i5 < pVar.getData().length; i5++) {
            byte b7 = pVar.getData()[i5];
            byte b8 = (byte) 65;
            if (b7 >= b8 && b7 <= (b6 = (byte) 90)) {
                byte[] data = pVar.getData();
                byte[] copyOf = Arrays.copyOf(data, data.length);
                l0.o(copyOf, ProtectedSandApp.s("橣"));
                copyOf[i5] = (byte) (b7 + 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b9 = copyOf[i6];
                    if (b9 >= b8 && b9 <= b6) {
                        copyOf[i6] = (byte) (b9 + 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @d5.d
    public static final p B(@d5.d p pVar) {
        byte b6;
        l0.p(pVar, ProtectedSandApp.s("橤"));
        for (int i5 = 0; i5 < pVar.getData().length; i5++) {
            byte b7 = pVar.getData()[i5];
            byte b8 = (byte) 97;
            if (b7 >= b8 && b7 <= (b6 = (byte) 122)) {
                byte[] data = pVar.getData();
                byte[] copyOf = Arrays.copyOf(data, data.length);
                l0.o(copyOf, ProtectedSandApp.s("橥"));
                copyOf[i5] = (byte) (b7 - 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b9 = copyOf[i6];
                    if (b9 >= b8 && b9 <= b6) {
                        copyOf[i6] = (byte) (b9 - 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @d5.d
    public static final byte[] C(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("橦"));
        byte[] data = pVar.getData();
        byte[] copyOf = Arrays.copyOf(data, data.length);
        l0.o(copyOf, ProtectedSandApp.s("橧"));
        return copyOf;
    }

    @d5.d
    public static final p D(@d5.d byte[] bArr, int i5, int i6) {
        byte[] f12;
        l0.p(bArr, ProtectedSandApp.s("橨"));
        j.e(bArr.length, i5, i6);
        f12 = kotlin.collections.p.f1(bArr, i5, i6 + i5);
        return new p(f12);
    }

    @d5.d
    public static final String E(@d5.d p pVar) {
        String i22;
        String i23;
        String i24;
        byte[] f12;
        p pVar2 = pVar;
        l0.p(pVar2, ProtectedSandApp.s("橩"));
        if (pVar.getData().length == 0) {
            return ProtectedSandApp.s("橪");
        }
        int c6 = c(pVar.getData(), 64);
        String s5 = ProtectedSandApp.s("橫");
        String s6 = ProtectedSandApp.s("橬");
        if (c6 == -1) {
            if (pVar.getData().length <= 64) {
                return ProtectedSandApp.s("橭") + pVar.C() + ']';
            }
            StringBuilder sb = new StringBuilder(s6);
            sb.append(pVar.getData().length);
            sb.append(ProtectedSandApp.s("橮"));
            if (!(64 <= pVar.getData().length)) {
                throw new IllegalArgumentException((ProtectedSandApp.s("橯") + pVar.getData().length + ')').toString());
            }
            if (64 != pVar.getData().length) {
                f12 = kotlin.collections.p.f1(pVar.getData(), 0, 64);
                pVar2 = new p(f12);
            }
            sb.append(pVar2.C());
            sb.append(s5);
            return sb.toString();
        }
        String t02 = pVar.t0();
        if (t02 == null) {
            throw new NullPointerException(ProtectedSandApp.s("橹"));
        }
        String substring = t02.substring(0, c6);
        l0.o(substring, ProtectedSandApp.s("橰"));
        i22 = e0.i2(substring, ProtectedSandApp.s("橱"), ProtectedSandApp.s("橲"), false, 4, null);
        i23 = e0.i2(i22, ProtectedSandApp.s("橳"), ProtectedSandApp.s("橴"), false, 4, null);
        i24 = e0.i2(i23, ProtectedSandApp.s("橵"), ProtectedSandApp.s("橶"), false, 4, null);
        if (c6 >= t02.length()) {
            return ProtectedSandApp.s("橸") + i24 + ']';
        }
        return s6 + pVar.getData().length + ProtectedSandApp.s("橷") + i24 + s5;
    }

    @d5.d
    public static final String F(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("橺"));
        String utf8 = pVar.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String c6 = i.c(pVar.N());
        pVar.e0(c6);
        return c6;
    }

    public static final void G(@d5.d p pVar, @d5.d m mVar, int i5, int i6) {
        l0.p(pVar, ProtectedSandApp.s("橻"));
        l0.p(mVar, ProtectedSandApp.s("橼"));
        mVar.write(pVar.getData(), i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(char c6) {
        if ('0' <= c6 && '9' >= c6) {
            return c6 - '0';
        }
        char c7 = 'a';
        if ('a' > c6 || 'f' < c6) {
            c7 = 'A';
            if ('A' > c6 || 'F' < c6) {
                throw new IllegalArgumentException(ProtectedSandApp.s("橽") + c6);
            }
        }
        return (c6 - c7) + 10;
    }

    @d5.d
    public static final char[] I() {
        return f33897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0069, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.b.c(byte[], int):int");
    }

    @d5.d
    public static final String d(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("橾"));
        return okio.a.c(pVar.getData(), null, 1, null);
    }

    @d5.d
    public static final String e(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("橿"));
        return okio.a.b(pVar.getData(), okio.a.e());
    }

    public static final int f(@d5.d p pVar, @d5.d p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("檀"));
        l0.p(pVar2, ProtectedSandApp.s("檁"));
        int i02 = pVar.i0();
        int i03 = pVar2.i0();
        int min = Math.min(i02, i03);
        for (int i5 = 0; i5 < min; i5++) {
            int x5 = pVar.x(i5) & UByte.f27220r;
            int x6 = pVar2.x(i5) & UByte.f27220r;
            if (x5 != x6) {
                return x5 < x6 ? -1 : 1;
            }
        }
        if (i02 == i03) {
            return 0;
        }
        return i02 < i03 ? -1 : 1;
    }

    @d5.e
    public static final p g(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("檂"));
        byte[] a6 = okio.a.a(str);
        if (a6 != null) {
            return new p(a6);
        }
        return null;
    }

    @d5.d
    public static final p h(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("檃"));
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("檄").concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = (byte) ((H(str.charAt(i6)) << 4) + H(str.charAt(i6 + 1)));
        }
        return new p(bArr);
    }

    @d5.d
    public static final p i(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("檅"));
        p pVar = new p(i.a(str));
        pVar.e0(str);
        return pVar;
    }

    public static final boolean j(@d5.d p pVar, @d5.d p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("檆"));
        l0.p(pVar2, ProtectedSandApp.s("檇"));
        return pVar.Z(pVar.i0() - pVar2.i0(), pVar2, 0, pVar2.i0());
    }

    public static final boolean k(@d5.d p pVar, @d5.d byte[] bArr) {
        l0.p(pVar, ProtectedSandApp.s("檈"));
        l0.p(bArr, ProtectedSandApp.s("檉"));
        return pVar.a0(pVar.i0() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean l(@d5.d p pVar, @d5.e Object obj) {
        l0.p(pVar, ProtectedSandApp.s("檊"));
        if (obj == pVar) {
            return true;
        }
        if (obj instanceof p) {
            p pVar2 = (p) obj;
            if (pVar2.i0() == pVar.getData().length && pVar2.a0(0, pVar.getData(), 0, pVar.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte m(@d5.d p pVar, int i5) {
        l0.p(pVar, ProtectedSandApp.s("檋"));
        return pVar.getData()[i5];
    }

    public static final int n(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("檌"));
        return pVar.getData().length;
    }

    public static final int o(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("檍"));
        int hashCode = pVar.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int hashCode2 = Arrays.hashCode(pVar.getData());
        pVar.d0(hashCode2);
        return hashCode2;
    }

    @d5.d
    public static final String p(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("檎"));
        char[] cArr = new char[pVar.getData().length * 2];
        int i5 = 0;
        for (byte b6 : pVar.getData()) {
            int i6 = i5 + 1;
            char[] cArr2 = f33897a;
            cArr[i5] = cArr2[(b6 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public static final int q(@d5.d p pVar, @d5.d byte[] bArr, int i5) {
        l0.p(pVar, ProtectedSandApp.s("檏"));
        l0.p(bArr, ProtectedSandApp.s("檐"));
        int length = pVar.getData().length - bArr.length;
        int max = Math.max(i5, 0);
        if (max > length) {
            return -1;
        }
        while (!j.d(pVar.getData(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @d5.d
    public static final byte[] r(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("檑"));
        return pVar.getData();
    }

    public static final int s(@d5.d p pVar, @d5.d p pVar2, int i5) {
        l0.p(pVar, ProtectedSandApp.s("檒"));
        l0.p(pVar2, ProtectedSandApp.s("檓"));
        return pVar.S(pVar2.N(), i5);
    }

    public static final int t(@d5.d p pVar, @d5.d byte[] bArr, int i5) {
        l0.p(pVar, ProtectedSandApp.s("檔"));
        l0.p(bArr, ProtectedSandApp.s("檕"));
        for (int min = Math.min(i5, pVar.getData().length - bArr.length); min >= 0; min--) {
            if (j.d(pVar.getData(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @d5.d
    public static final p u(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("檖"));
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, ProtectedSandApp.s("檗"));
        return new p(copyOf);
    }

    public static final boolean v(@d5.d p pVar, int i5, @d5.d p pVar2, int i6, int i7) {
        l0.p(pVar, ProtectedSandApp.s("檘"));
        l0.p(pVar2, ProtectedSandApp.s("檙"));
        return pVar2.a0(i6, pVar.getData(), i5, i7);
    }

    public static final boolean w(@d5.d p pVar, int i5, @d5.d byte[] bArr, int i6, int i7) {
        l0.p(pVar, ProtectedSandApp.s("檚"));
        l0.p(bArr, ProtectedSandApp.s("檛"));
        return i5 >= 0 && i5 <= pVar.getData().length - i7 && i6 >= 0 && i6 <= bArr.length - i7 && j.d(pVar.getData(), i5, bArr, i6, i7);
    }

    public static final boolean x(@d5.d p pVar, @d5.d p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("檜"));
        l0.p(pVar2, ProtectedSandApp.s("檝"));
        return pVar.Z(0, pVar2, 0, pVar2.i0());
    }

    public static final boolean y(@d5.d p pVar, @d5.d byte[] bArr) {
        l0.p(pVar, ProtectedSandApp.s("檞"));
        l0.p(bArr, ProtectedSandApp.s("檟"));
        return pVar.a0(0, bArr, 0, bArr.length);
    }

    @d5.d
    public static final p z(@d5.d p pVar, int i5, int i6) {
        byte[] f12;
        l0.p(pVar, ProtectedSandApp.s("檠"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("檣").toString());
        }
        if (!(i6 <= pVar.getData().length)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("檢") + pVar.getData().length + ')').toString());
        }
        if (!(i6 - i5 >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("檡").toString());
        }
        if (i5 == 0 && i6 == pVar.getData().length) {
            return pVar;
        }
        f12 = kotlin.collections.p.f1(pVar.getData(), i5, i6);
        return new p(f12);
    }
}
