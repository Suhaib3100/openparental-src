package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.p1;
import kotlin.p2;
import kotlin.t1;

/* compiled from: UStrings.kt */
@p3.i(name = "UStringsKt")
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001a\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0019\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001e\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o0 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final String a(long j5, int i5) {
        return p2.l(j5, d.a(i5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final String b(byte b6, int i5) {
        String num = Integer.toString(b6 & UByte.f27220r, d.a(i5));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("宀"));
        return num;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final String c(int i5, int i6) {
        String l5 = Long.toString(i5 & 4294967295L, d.a(i6));
        kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("宁"));
        return l5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @d5.d
    public static final String d(short s5, int i5) {
        String num = Integer.toString(s5 & UShort.f23340r, d.a(i5));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("宂"));
        return num;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte e(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("它"));
        UByte g5 = g(str);
        if (g5 != null) {
            return g5.getF27223o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte f(@d5.d String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宄"));
        UByte h5 = h(str, i5);
        if (h5 != null) {
            return h5.getF27223o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UByte g(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宅"));
        return h(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UByte h(@d5.d String str, int i5) {
        int compare;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宆"));
        UInt l5 = l(str, i5);
        if (l5 == null) {
            return null;
        }
        int f27240o = l5.getF27240o();
        compare = Integer.compare(f27240o ^ Integer.MIN_VALUE, 255 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UByte.h(UByte.r((byte) f27240o));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int i(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宇"));
        UInt k5 = k(str);
        if (k5 != null) {
            return k5.getF27240o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int j(@d5.d String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("守"));
        UInt l5 = l(str, i5);
        if (l5 != null) {
            return l5.getF27240o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UInt k(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("安"));
        return l(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UInt l(@d5.d String str, int i5) {
        int i6;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宊"));
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i6 = 0;
        }
        int r5 = UInt.r(i5);
        int i8 = 119304647;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), i5);
            if (digit < 0) {
                return null;
            }
            compare = Integer.compare(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i8 == 119304647) {
                    i8 = p1.a(-1, r5);
                    compare3 = Integer.compare(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int i9 = i7 * r5;
            int i10 = digit + i9;
            compare2 = Integer.compare(i10 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i6++;
            i7 = i10;
        }
        return UInt.h(i7);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long m(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宋"));
        ULong o5 = o(str);
        if (o5 != null) {
            return o5.getF23071o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long n(@d5.d String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("完"));
        ULong p5 = p(str, i5);
        if (p5 != null) {
            return p5.getF23071o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULong o(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宍"));
        return p(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULong p(@d5.d String str, int i5) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宎"));
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long r5 = ULong.r(i5);
        long j5 = 0;
        long j6 = 512409557603043100L;
        while (i6 < length) {
            if (Character.digit((int) str.charAt(i6), i5) < 0) {
                return null;
            }
            compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j6 == 512409557603043100L) {
                    j6 = t1.a(-1L, r5);
                    compare3 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long j7 = j5 * r5;
            long r6 = (UInt.r(r13) & 4294967295L) + j7;
            compare2 = Long.compare(r6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i6++;
            j5 = r6;
        }
        return ULong.h(j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short q(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宏"));
        UShort s5 = s(str);
        if (s5 != null) {
            return s5.getF23343o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short r(@d5.d String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宐"));
        UShort t5 = t(str, i5);
        if (t5 != null) {
            return t5.getF23343o();
        }
        d0.U0(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UShort s(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宑"));
        return t(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UShort t(@d5.d String str, int i5) {
        int compare;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宒"));
        UInt l5 = l(str, i5);
        if (l5 == null) {
            return null;
        }
        int f27240o = l5.getF27240o();
        compare = Integer.compare(f27240o ^ Integer.MIN_VALUE, 65535 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return UShort.h(UShort.r((short) f27240o));
    }
}
