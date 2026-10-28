package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.g2;
import kotlin.n2;
import kotlin.o1;
import kotlin.o2;
import kotlin.s1;
import kotlin.w1;

/* compiled from: UStrings.kt */
@kd.i(name = "UStringsKt")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0000*\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\t*\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\f*\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010#\u001a\u0004\u0018\u00010\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u0004\u0018\u00010\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\f*\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lkotlin/s1;", "", "radix", "", "b", "(BI)Ljava/lang/String;", "Lkotlin/g2;", "d", "(SI)Ljava/lang/String;", "Lkotlin/w1;", "c", "(II)Ljava/lang/String;", "Lkotlin/a2;", "a", "(JI)Ljava/lang/String;", "e", "(Ljava/lang/String;)B", "f", "(Ljava/lang/String;I)B", "q", "(Ljava/lang/String;)S", "r", "(Ljava/lang/String;I)S", "i", "(Ljava/lang/String;)I", "j", "(Ljava/lang/String;I)I", "m", "(Ljava/lang/String;)J", "n", "(Ljava/lang/String;I)J", "g", "(Ljava/lang/String;)Lkotlin/s1;", "h", "(Ljava/lang/String;I)Lkotlin/s1;", "s", "(Ljava/lang/String;)Lkotlin/g2;", "t", "(Ljava/lang/String;I)Lkotlin/g2;", "k", "(Ljava/lang/String;)Lkotlin/w1;", "l", "(Ljava/lang/String;I)Lkotlin/w1;", "o", "(Ljava/lang/String;)Lkotlin/a2;", "p", "(Ljava/lang/String;I)Lkotlin/a2;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o0 {
    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final String a(long j4, int i4) {
        return n2.l(j4, d.a(i4));
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final String b(byte b5, int i4) {
        String num = Integer.toString(b5 & 255, d.a(i4));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("蓐\u0001"));
        return num;
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final String c(int i4, int i5) {
        String l4 = Long.toString(i4 & 4294967295L, d.a(i5));
        kotlin.jvm.internal.l0.o(l4, ProtectedSandApp.s("蓐\u0001"));
        return l4;
    }

    @fg.l
    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final String d(short s4, int i4) {
        String num = Integer.toString(s4 & g2.f75095e, d.a(i4));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("蓐\u0001"));
        return num;
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final byte e(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        s1 g4 = g(str);
        if (g4 != null) {
            return g4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final byte f(@fg.l String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        s1 h4 = h(str, i4);
        if (h4 != null) {
            return h4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final s1 g(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        return h(str, 10);
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final s1 h(@fg.l String str, int i4) {
        int compare;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        w1 l4 = l(str, i4);
        if (l4 == null) {
            return null;
        }
        int data = l4.getData();
        compare = Integer.compare(data ^ Integer.MIN_VALUE, 255 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return s1.b(s1.h((byte) data));
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int i(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        w1 k4 = k(str);
        if (k4 != null) {
            return k4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final int j(@fg.l String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        w1 l4 = l(str, i4);
        if (l4 != null) {
            return l4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final w1 k(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        return l(str, 10);
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final w1 l(@fg.l String str, int i4) {
        int i5;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        d.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int h4 = w1.h(i4);
        int i7 = 119304647;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), i4);
            if (digit < 0) {
                return null;
            }
            compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i7 == 119304647) {
                    i7 = o1.a(-1, h4);
                    compare3 = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int i10 = i6 * h4;
            int i11 = digit + i10;
            compare2 = Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i5++;
            i6 = i11;
        }
        return w1.b(i6);
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long m(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        a2 o4 = o(str);
        if (o4 != null) {
            return o4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final long n(@fg.l String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        a2 p4 = p(str, i4);
        if (p4 != null) {
            return p4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final a2 o(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        return p(str, 10);
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final a2 p(@fg.l String str, int i4) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        d.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long h4 = a2.h(i4);
        long j4 = 0;
        long j5 = 512409557603043100L;
        while (i5 < length) {
            if (Character.digit((int) str.charAt(i5), i4) < 0) {
                return null;
            }
            compare = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j5 == 512409557603043100L) {
                    j5 = com.tencent.cos.xml.transfer.d.a(-1L, h4);
                    compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long j6 = j4 * h4;
            long h5 = (w1.h(r13) & 4294967295L) + j6;
            compare2 = Long.compare(h5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i5++;
            j4 = h5;
        }
        return a2.b(j4);
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final short q(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        g2 s4 = s(str);
        if (s4 != null) {
            return s4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @c1(version = "1.5")
    public static final short r(@fg.l String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        g2 t4 = t(str, i4);
        if (t4 != null) {
            return t4.getData();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final g2 s(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        return t(str, 10);
    }

    @o2(markerClass = {kotlin.t.class})
    @fg.m
    @c1(version = "1.5")
    public static final g2 t(@fg.l String str, int i4) {
        int compare;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓑\u0001"));
        w1 l4 = l(str, i4);
        if (l4 == null) {
            return null;
        }
        int data = l4.getData();
        compare = Integer.compare(data ^ Integer.MIN_VALUE, 65535 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return g2.b(g2.h((short) data));
    }
}
