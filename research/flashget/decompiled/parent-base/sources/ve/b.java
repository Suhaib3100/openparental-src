package ve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.text.v;
import okio.i;
import okio.j;
import okio.m;
import okio.p;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b \u0010!\u001a\u001c\u0010#\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010%\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010(\u001a\u00020\u001d*\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010$\u001a\u001c\u0010)\u001a\u00020\u001d*\u00020\u00002\u0006\u0010'\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b)\u0010&\u001a$\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b+\u0010,\u001a$\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b-\u0010.\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u0010,\u001a\u001e\u00101\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u000100H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u0010\u0014\u001a\u001c\u00104\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u00105\u001a\u0018\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b7\u00108\u001a$\u00109\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u0014\u0010;\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b;\u0010<\u001a\u0016\u0010=\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b=\u0010<\u001a\u0014\u0010>\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b>\u0010<\u001a+\u0010B\u001a\u00020A*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010H\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bH\u0010\u0003\u001a\u001f\u0010E\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010I\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010J\"\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lokio/p;", "", "F", "(Lokio/p;)Ljava/lang/String;", "d", "e", "p", "A", "(Lokio/p;)Lokio/p;", "B", "", "beginIndex", "endIndex", "z", "(Lokio/p;II)Lokio/p;", "pos", "", "m", "(Lokio/p;I)B", "n", "(Lokio/p;)I", "", "C", "(Lokio/p;)[B", "r", "offset", "other", "otherOffset", "byteCount", "", "v", "(Lokio/p;ILokio/p;II)Z", "w", "(Lokio/p;I[BII)Z", "prefix", "x", "(Lokio/p;Lokio/p;)Z", "y", "(Lokio/p;[B)Z", "suffix", "j", "k", "fromIndex", "q", "(Lokio/p;[BI)I", "s", "(Lokio/p;Lokio/p;I)I", "t", "", "l", "(Lokio/p;Ljava/lang/Object;)Z", "o", "f", "(Lokio/p;Lokio/p;)I", "data", "u", "([B)Lokio/p;", "D", "([BII)Lokio/p;", "i", "(Ljava/lang/String;)Lokio/p;", "g", "h", "Lokio/m;", "buffer", "Lkotlin/k2;", "G", "(Lokio/p;Lokio/m;II)V", "", "c", "H", "(C)I", "E", "codePointCount", "([BI)I", "", "a", "[C", "I", "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final char[] f92847a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @l
    public static final p A(@l p pVar) {
        byte b5;
        l0.p(pVar, ProtectedSandApp.s("⃞"));
        for (int i4 = 0; i4 < pVar.o().length; i4++) {
            byte b6 = pVar.o()[i4];
            byte b7 = (byte) 65;
            if (b6 >= b7 && b6 <= (b5 = (byte) 90)) {
                byte[] o4 = pVar.o();
                byte[] copyOf = Arrays.copyOf(o4, o4.length);
                l0.o(copyOf, ProtectedSandApp.s("⃟"));
                copyOf[i4] = (byte) (b6 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b10 = copyOf[i5];
                    if (b10 >= b7 && b10 <= b5) {
                        copyOf[i5] = (byte) (b10 + 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @l
    public static final p B(@l p pVar) {
        byte b5;
        l0.p(pVar, ProtectedSandApp.s("⃠"));
        for (int i4 = 0; i4 < pVar.o().length; i4++) {
            byte b6 = pVar.o()[i4];
            byte b7 = (byte) 97;
            if (b6 >= b7 && b6 <= (b5 = (byte) 122)) {
                byte[] o4 = pVar.o();
                byte[] copyOf = Arrays.copyOf(o4, o4.length);
                l0.o(copyOf, ProtectedSandApp.s("⃟"));
                copyOf[i4] = (byte) (b6 - 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b10 = copyOf[i5];
                    if (b10 >= b7 && b10 <= b5) {
                        copyOf[i5] = (byte) (b10 - 32);
                    }
                }
                return new p(copyOf);
            }
        }
        return pVar;
    }

    @l
    public static final byte[] C(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("⃡"));
        byte[] o4 = pVar.o();
        byte[] copyOf = Arrays.copyOf(o4, o4.length);
        l0.o(copyOf, ProtectedSandApp.s("⃟"));
        return copyOf;
    }

    @l
    public static final p D(@l byte[] bArr, int i4, int i5) {
        l0.p(bArr, ProtectedSandApp.s("⃢"));
        j.e(bArr.length, i4, i5);
        return new p(kotlin.collections.l.f1(bArr, i4, i5 + i4));
    }

    @l
    public static final String E(@l p pVar) {
        p pVar2 = pVar;
        l0.p(pVar2, ProtectedSandApp.s("⃣"));
        if (pVar.o().length == 0) {
            return ProtectedSandApp.s("⃤");
        }
        int c5 = c(pVar.o(), 64);
        String s4 = ProtectedSandApp.s("⃥");
        String s5 = ProtectedSandApp.s("⃦");
        if (c5 != -1) {
            String o02 = pVar.o0();
            if (o02 == null) {
                throw new NullPointerException(ProtectedSandApp.s("\u20f3"));
            }
            String substring = o02.substring(0, c5);
            l0.o(substring, ProtectedSandApp.s("⃪"));
            String i22 = v.i2(v.i2(v.i2(substring, ProtectedSandApp.s("⃫"), ProtectedSandApp.s("⃬"), false, 4, null), ProtectedSandApp.s("⃭"), ProtectedSandApp.s("⃮"), false, 4, null), ProtectedSandApp.s("⃯"), ProtectedSandApp.s("⃰"), false, 4, null);
            if (c5 < o02.length()) {
                return androidx.compose.runtime.changelist.a.a(new StringBuilder(s5), pVar.o().length, ProtectedSandApp.s("\u20f1"), i22, s4);
            }
            return ProtectedSandApp.s("\u20f2") + i22 + ']';
        }
        if (pVar.o().length <= 64) {
            return ProtectedSandApp.s("⃧") + pVar.s() + ']';
        }
        StringBuilder sb = new StringBuilder(s5);
        sb.append(pVar.o().length);
        sb.append(ProtectedSandApp.s("⃨"));
        if (!(64 <= pVar.o().length)) {
            throw new IllegalArgumentException(androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("⃩")), pVar.o().length, ')').toString());
        }
        if (64 != pVar.o().length) {
            pVar2 = new p(kotlin.collections.l.f1(pVar.o(), 0, 64));
        }
        sb.append(pVar2.s());
        sb.append(s4);
        return sb.toString();
    }

    @l
    public static final String F(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("\u20f4"));
        String utf8 = pVar.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String c5 = i.c(pVar.getData());
        pVar.Z(c5);
        return c5;
    }

    public static final void G(@l p pVar, @l m mVar, int i4, int i5) {
        l0.p(pVar, ProtectedSandApp.s("\u20f5"));
        l0.p(mVar, ProtectedSandApp.s("\u20f6"));
        mVar.write(pVar.o(), i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(char c5) {
        if ('0' <= c5 && '9' >= c5) {
            return c5 - '0';
        }
        if ('a' <= c5 && 'f' >= c5) {
            return c5 - 'W';
        }
        if ('A' > c5 || 'F' < c5) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("\u20f7"), c5));
        }
        return c5 - '7';
    }

    @l
    public static final char[] I() {
        return f92847a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i4) {
        byte b5;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        loop0: while (i6 < length) {
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                int i11 = i10 + 1;
                if (i10 == i4) {
                    return i7;
                }
                if ((b6 != 10 && b6 != 13 && ((b6 >= 0 && 31 >= b6) || (Byte.MAX_VALUE <= b6 && 159 >= b6))) || b6 == 65533) {
                    return -1;
                }
                i7 += b6 < 65536 ? 1 : 2;
                i6++;
                while (true) {
                    i10 = i11;
                    if (i6 < length && (b5 = bArr[i6]) >= 0) {
                        i6++;
                        i11 = i10 + 1;
                        if (i10 == i4) {
                            return i7;
                        }
                        if ((b5 == 10 || b5 == 13 || ((b5 < 0 || 31 < b5) && (Byte.MAX_VALUE > b5 || 159 < b5))) && b5 != 65533) {
                            i7 += b5 < 65536 ? 1 : 2;
                        }
                    }
                }
            } else if ((b6 >> 5) == -2) {
                int i12 = i6 + 1;
                if (length <= i12) {
                    if (i10 == i4) {
                        return i7;
                    }
                    return -1;
                }
                byte b7 = bArr[i12];
                if ((b7 & 192) != 128) {
                    if (i10 == i4) {
                        return i7;
                    }
                    return -1;
                }
                int i13 = (b6 << 6) ^ (b7 ^ 3968);
                if (i13 < 128) {
                    if (i10 == i4) {
                        return i7;
                    }
                    return -1;
                }
                int i14 = i10 + 1;
                if (i10 == i4) {
                    return i7;
                }
                if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && 31 >= i13) || (127 <= i13 && 159 >= i13))) || i13 == 65533) {
                    return -1;
                }
                i7 += i13 < 65536 ? 1 : 2;
                k2 k2Var = k2.f75408a;
                i6 += 2;
                i10 = i14;
            } else {
                if ((b6 >> 4) == -2) {
                    int i15 = i6 + 2;
                    if (length <= i15) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i6 + 1];
                    if ((b10 & 192) != 128) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i15];
                    if ((b11 & 192) != 128) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    int i16 = (b6 << 12) ^ ((b11 ^ (-123008)) ^ (b10 << 6));
                    if (i16 < 2048) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    if (55296 <= i16 && 57343 >= i16) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    i5 = i10 + 1;
                    if (i10 == i4) {
                        return i7;
                    }
                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && 31 >= i16) || (127 <= i16 && 159 >= i16))) || i16 == 65533) {
                        return -1;
                    }
                    i7 += i16 < 65536 ? 1 : 2;
                    k2 k2Var2 = k2.f75408a;
                    i6 += 3;
                } else {
                    if ((b6 >> 3) != -2) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    int i17 = i6 + 3;
                    if (length <= i17) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i6 + 1];
                    if ((b12 & 192) != 128) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i6 + 2];
                    if ((b13 & 192) != 128) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i17];
                    if ((b14 & 192) != 128) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    int i18 = (b6 << com.google.common.base.c.f54875u) ^ (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12));
                    if (i18 > 1114111) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && 57343 >= i18) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    if (i18 < 65536) {
                        if (i10 == i4) {
                            return i7;
                        }
                        return -1;
                    }
                    i5 = i10 + 1;
                    if (i10 == i4) {
                        return i7;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && 31 >= i18) || (127 <= i18 && 159 >= i18))) || i18 == 65533) {
                        return -1;
                    }
                    i7 += i18 < 65536 ? 1 : 2;
                    k2 k2Var3 = k2.f75408a;
                    i6 += 4;
                }
                i10 = i5;
            }
        }
        return i7;
    }

    @l
    public static final String d(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("\u20f8"));
        return okio.a.c(pVar.o(), null, 1, null);
    }

    @l
    public static final String e(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("\u20f9"));
        return okio.a.b(pVar.o(), okio.a.e());
    }

    public static final int f(@l p pVar, @l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("\u20fa"));
        l0.p(pVar2, ProtectedSandApp.s("\u20fb"));
        int q4 = pVar.q();
        int q5 = pVar2.q();
        int min = Math.min(q4, q5);
        for (int i4 = 0; i4 < min; i4++) {
            int G = pVar.G(i4) & 255;
            int G2 = pVar2.G(i4) & 255;
            if (G != G2) {
                return G < G2 ? -1 : 1;
            }
        }
        if (q4 == q5) {
            return 0;
        }
        return q4 < q5 ? -1 : 1;
    }

    @fg.m
    public static final p g(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u20fc"));
        byte[] a5 = okio.a.a(str);
        if (a5 != null) {
            return new p(a5);
        }
        return null;
    }

    @l
    public static final p h(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u20fd"));
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u20fe").concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            bArr[i4] = (byte) ((H(str.charAt(i5)) << 4) + H(str.charAt(i5 + 1)));
        }
        return new p(bArr);
    }

    @l
    public static final p i(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u20ff"));
        p pVar = new p(i.a(str));
        pVar.Z(str);
        return pVar;
    }

    public static final boolean j(@l p pVar, @l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("℀"));
        l0.p(pVar2, ProtectedSandApp.s("℁"));
        return pVar.U(pVar.q() - pVar2.q(), pVar2, 0, pVar2.q());
    }

    public static final boolean k(@l p pVar, @l byte[] bArr) {
        l0.p(pVar, ProtectedSandApp.s("℀"));
        l0.p(bArr, ProtectedSandApp.s("℁"));
        return pVar.V(pVar.q() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean l(@l p pVar, @fg.m Object obj) {
        l0.p(pVar, ProtectedSandApp.s("ℂ"));
        if (obj == pVar) {
            return true;
        }
        if (obj instanceof p) {
            p pVar2 = (p) obj;
            if (pVar2.q() == pVar.o().length && pVar2.V(0, pVar.o(), 0, pVar.o().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte m(@l p pVar, int i4) {
        l0.p(pVar, ProtectedSandApp.s("℃"));
        return pVar.o()[i4];
    }

    public static final int n(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("℄"));
        return pVar.o().length;
    }

    public static final int o(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("℅"));
        int hashCode = pVar.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int hashCode2 = Arrays.hashCode(pVar.o());
        pVar.Y(hashCode2);
        return hashCode2;
    }

    @l
    public static final String p(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("℆"));
        char[] cArr = new char[pVar.o().length * 2];
        int i4 = 0;
        for (byte b5 : pVar.o()) {
            int i5 = i4 + 1;
            char[] cArr2 = f92847a;
            cArr[i4] = cArr2[(b5 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr);
    }

    public static final int q(@l p pVar, @l byte[] bArr, int i4) {
        l0.p(pVar, ProtectedSandApp.s("ℇ"));
        l0.p(bArr, ProtectedSandApp.s("\u20fb"));
        int length = pVar.o().length - bArr.length;
        int max = Math.max(i4, 0);
        if (max > length) {
            return -1;
        }
        while (!j.d(pVar.o(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @l
    public static final byte[] r(@l p pVar) {
        l0.p(pVar, ProtectedSandApp.s("℈"));
        return pVar.o();
    }

    public static final int s(@l p pVar, @l p pVar2, int i4) {
        l0.p(pVar, ProtectedSandApp.s("℉"));
        l0.p(pVar2, ProtectedSandApp.s("\u20fb"));
        return pVar.M(pVar2.getData(), i4);
    }

    public static final int t(@l p pVar, @l byte[] bArr, int i4) {
        l0.p(pVar, ProtectedSandApp.s("℉"));
        l0.p(bArr, ProtectedSandApp.s("\u20fb"));
        for (int min = Math.min(i4, pVar.o().length - bArr.length); min >= 0; min--) {
            if (j.d(pVar.o(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @l
    public static final p u(@l byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("ℊ"));
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, ProtectedSandApp.s("⃟"));
        return new p(copyOf);
    }

    public static final boolean v(@l p pVar, int i4, @l p pVar2, int i5, int i6) {
        l0.p(pVar, ProtectedSandApp.s("ℋ"));
        l0.p(pVar2, ProtectedSandApp.s("\u20fb"));
        return pVar2.V(i5, pVar.o(), i4, i6);
    }

    public static final boolean w(@l p pVar, int i4, @l byte[] bArr, int i5, int i6) {
        l0.p(pVar, ProtectedSandApp.s("ℋ"));
        l0.p(bArr, ProtectedSandApp.s("\u20fb"));
        return i4 >= 0 && i4 <= pVar.o().length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && j.d(pVar.o(), i4, bArr, i5, i6);
    }

    public static final boolean x(@l p pVar, @l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("ℌ"));
        l0.p(pVar2, ProtectedSandApp.s("ℍ"));
        return pVar.U(0, pVar2, 0, pVar2.q());
    }

    public static final boolean y(@l p pVar, @l byte[] bArr) {
        l0.p(pVar, ProtectedSandApp.s("ℌ"));
        l0.p(bArr, ProtectedSandApp.s("ℍ"));
        return pVar.V(0, bArr, 0, bArr.length);
    }

    @l
    public static final p z(@l p pVar, int i4, int i5) {
        l0.p(pVar, ProtectedSandApp.s("ℎ"));
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ℐ"));
        }
        if (!(i5 <= pVar.o().length)) {
            throw new IllegalArgumentException(androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("⃩")), pVar.o().length, ')').toString());
        }
        if (i5 - i4 >= 0) {
            return (i4 == 0 && i5 == pVar.o().length) ? pVar : new p(kotlin.collections.l.f1(pVar.o(), i4, i5));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ℏ"));
    }
}
