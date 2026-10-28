package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.text.v;
import kotlin.time.e;
import kotlin.x0;

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\bS\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a0\u0010\u001d\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010\u001f\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aH\u0082\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010#\u001a\u0017\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010#\u001a\u0017\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010#\u001a\u001f\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0000H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010#\u001a\u0017\u0010/\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010#\"\u0014\u00102\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00105\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00107\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00104\"\u001e\u0010>\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;\"\u001e\u0010>\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010#\"\u001e\u0010>\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010C\"\u001e\u0010H\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010;\"\u001e\u0010H\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010#\"\u001e\u0010H\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010E\u001a\u0004\bK\u0010C\"\u001e\u0010N\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010=\u001a\u0004\bM\u0010;\"\u001e\u0010N\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010A\u001a\u0004\bO\u0010#\"\u001e\u0010N\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010E\u001a\u0004\bQ\u0010C\"\u001e\u0010T\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010=\u001a\u0004\bR\u0010;\"\u001e\u0010T\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010A\u001a\u0004\bU\u0010#\"\u001e\u0010T\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010E\u001a\u0004\bW\u0010C\"\u001e\u0010[\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010=\u001a\u0004\bY\u0010;\"\u001e\u0010[\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010A\u001a\u0004\b\\\u0010#\"\u001e\u0010[\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010E\u001a\u0004\b^\u0010C\"\u001e\u0010b\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010=\u001a\u0004\b`\u0010;\"\u001e\u0010b\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bd\u0010A\u001a\u0004\bc\u0010#\"\u001e\u0010b\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010E\u001a\u0004\be\u0010C\"\u001e\u0010i\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bh\u0010=\u001a\u0004\bg\u0010;\"\u001e\u0010i\u001a\u00020\u0003*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010A\u001a\u0004\bj\u0010#\"\u001e\u0010i\u001a\u00020\u0003*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010E\u001a\u0004\bl\u0010C¨\u0006n"}, d2 = {"", "Lkotlin/time/h;", "unit", "Lkotlin/time/e;", "m0", "(ILkotlin/time/h;)J", "", "n0", "(JLkotlin/time/h;)J", "", "l0", "(DLkotlin/time/h;)J", "duration", "k0", "(IJ)J", "j0", "(DJ)J", "", "value", "", "strictIso", "f0", "(Ljava/lang/String;Z)J", "g0", "(Ljava/lang/String;)J", "startIndex", "Lkotlin/Function1;", "", "predicate", "i0", "(Ljava/lang/String;ILld/l;)Ljava/lang/String;", "h0", "(Ljava/lang/String;ILld/l;)I", "nanos", "e0", "(J)J", "millis", "d0", "normalNanos", "l", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "a", "I", "NANOS_IN_MILLIS", "b", "J", "MAX_NANOS", "c", "MAX_MILLIS", "d", "MAX_NANOS_IN_MILLIS", "S", "(I)J", "V", "(I)V", "nanoseconds", "T", "W", "(J)V", "R", "(D)J", "U", "(D)V", "A", "D", "microseconds", "B", "E", "z", "C", "G", "milliseconds", "H", "K", "F", "Y", "b0", "seconds", "Z", "c0", "X", "a0", "M", "P", "minutes", "N", "Q", "L", "O", "u", "x", "hours", "v", "y", "t", "w", "o", "r", "days", "p", "s", "n", "q", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f79216a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f79217b = 4611686018426999999L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f79218c = 4611686018427387903L;

    /* renamed from: d, reason: collision with root package name */
    private static final long f79219d = 4611686018426L;

    @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void C(double d5) {
    }

    @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void D(int i4) {
    }

    @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void E(long j4) {
    }

    @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void I(double d5) {
    }

    @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void J(int i4) {
    }

    @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void K(long j4) {
    }

    @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void O(double d5) {
    }

    @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void P(int i4) {
    }

    @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void Q(long j4) {
    }

    @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void U(double d5) {
    }

    @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void V(int i4) {
    }

    @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void W(long j4) {
    }

    @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void a0(double d5) {
    }

    @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void b0(int i4) {
    }

    @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void c0(long j4) {
    }

    private static final long d0(long j4) {
        return j4 * 1000000;
    }

    private static final long e0(long j4) {
        return j4 / 1000000;
    }

    public static final long f(long j4) {
        return j4 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final long f0(String str, boolean z4) {
        long j4;
        boolean z5;
        Object obj;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("蔸\u0001"));
        }
        e.Companion companion = e.INSTANCE;
        companion.getClass();
        long j5 = e.f79210d;
        char charAt = str.charAt(0);
        int i4 = 1;
        int i5 = (charAt == '+' || charAt == '-') ? 1 : 0;
        boolean z6 = i5 > 0;
        Object obj2 = null;
        Object[] objArr = z6 && v.b5(str, '-', false, 2, null);
        String s4 = ProtectedSandApp.s("蔰\u0001");
        if (length <= i5) {
            throw new IllegalArgumentException(s4);
        }
        char charAt2 = str.charAt(i5);
        String s5 = ProtectedSandApp.s("蔱\u0001");
        char c5 = '9';
        char c6 = '0';
        String s6 = ProtectedSandApp.s("蔲\u0001");
        String s7 = ProtectedSandApp.s("蔳\u0001");
        if (charAt2 == 'P') {
            int i6 = i5 + 1;
            if (i6 == length) {
                throw new IllegalArgumentException();
            }
            h hVar = null;
            boolean z7 = false;
            while (i6 < length) {
                if (str.charAt(i6) != 'T') {
                    int i7 = i6;
                    while (true) {
                        if (i7 >= str.length()) {
                            obj = obj2;
                            break;
                        }
                        char charAt3 = str.charAt(i7);
                        if (!new kotlin.ranges.c(c6, c5, i4).r(charAt3)) {
                            obj = null;
                            if (!v.S2(ProtectedSandApp.s("蔴\u0001"), charAt3, false, 2, null)) {
                                break;
                            }
                        } else {
                            obj = null;
                        }
                        i7++;
                        obj2 = obj;
                        c5 = '9';
                        c6 = '0';
                        i4 = 1;
                    }
                    l0.n(str, s7);
                    String substring = str.substring(i6, i7);
                    l0.o(substring, s6);
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = substring.length() + i6;
                    if (length2 < 0 || length2 > v.g3(str)) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("蔵\u0001").concat(substring));
                    }
                    char charAt4 = str.charAt(length2);
                    int i10 = length2 + 1;
                    h f4 = k.f(charAt4, z7);
                    if (hVar != null && hVar.compareTo(f4) <= 0) {
                        throw new IllegalArgumentException(s5);
                    }
                    int o32 = v.o3(substring, '.', 0, false, 6, null);
                    if (f4 != h.SECONDS || o32 <= 0) {
                        j5 = e.i0(j5, n0(g0(substring), f4));
                    } else {
                        l0.n(substring, s7);
                        String substring2 = substring.substring(0, o32);
                        l0.o(substring2, s6);
                        long i02 = e.i0(j5, n0(g0(substring2), f4));
                        l0.n(substring, s7);
                        String substring3 = substring.substring(o32);
                        l0.o(substring3, s6);
                        j5 = e.i0(i02, l0(Double.parseDouble(substring3), f4));
                    }
                    obj2 = obj;
                    hVar = f4;
                    c5 = '9';
                    c6 = '0';
                    i4 = 1;
                    i6 = i10;
                } else {
                    if (z7 || (i6 = i6 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z7 = i4 == true ? 1 : 0;
                }
            }
        } else {
            if (z4) {
                throw new IllegalArgumentException();
            }
            String str2 = s5;
            char c7 = '0';
            if (v.b2(str, i5, ProtectedSandApp.s("蔶\u0001"), 0, Math.max(length - i5, 8), true)) {
                companion.getClass();
                j5 = e.f79211e;
            } else {
                boolean z10 = !z6;
                if (z6 && str.charAt(i5) == '(' && v.r7(str) == ')') {
                    i5++;
                    length--;
                    if (i5 == length) {
                        throw new IllegalArgumentException(s4);
                    }
                    j4 = j5;
                    z10 = true;
                } else {
                    j4 = j5;
                }
                boolean z11 = false;
                h hVar2 = null;
                while (i5 < length) {
                    if (z11 && z10) {
                        while (i5 < str.length() && str.charAt(i5) == ' ') {
                            i5++;
                        }
                    }
                    int i11 = i5;
                    while (i11 < str.length()) {
                        char charAt5 = str.charAt(i11);
                        if (!new kotlin.ranges.c(c7, '9', 1).r(charAt5) && charAt5 != '.') {
                            break;
                        }
                        i11++;
                    }
                    l0.n(str, s7);
                    String substring4 = str.substring(i5, i11);
                    l0.o(substring4, s6);
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = substring4.length() + i5;
                    int i12 = length3;
                    while (true) {
                        if (i12 >= str.length()) {
                            z5 = true;
                            break;
                        }
                        z5 = true;
                        if (!new kotlin.ranges.c('a', 'z', 1).r(str.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                    l0.n(str, s7);
                    String substring5 = str.substring(length3, i12);
                    l0.o(substring5, s6);
                    i5 = substring5.length() + length3;
                    h g4 = k.g(substring5);
                    if (hVar2 != null && hVar2.compareTo(g4) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int o33 = v.o3(substring4, '.', 0, false, 6, null);
                    if (o33 > 0) {
                        l0.n(substring4, s7);
                        String substring6 = substring4.substring(0, o33);
                        l0.o(substring6, s6);
                        long i03 = e.i0(j4, n0(Long.parseLong(substring6), g4));
                        l0.n(substring4, s7);
                        String substring7 = substring4.substring(o33);
                        l0.o(substring7, s6);
                        j4 = e.i0(i03, l0(Double.parseDouble(substring7), g4));
                        if (i5 < length) {
                            throw new IllegalArgumentException(ProtectedSandApp.s("蔷\u0001"));
                        }
                    } else {
                        j4 = e.i0(j4, n0(Long.parseLong(substring4), g4));
                    }
                    hVar2 = g4;
                    str2 = str3;
                    z11 = z5;
                    c7 = '0';
                }
                j5 = j4;
            }
        }
        return objArr != false ? e.A0(j5) : j5;
    }

    public static final long g(long j4) {
        return j4 / 1000000;
    }

    private static final long g0(String str) {
        int length = str.length();
        int i4 = (length <= 0 || !v.S2(ProtectedSandApp.s("蔹\u0001"), str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i4 > 16) {
            Iterable lVar = new kotlin.ranges.l(i4, v.g3(str), 1);
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                Iterator it = lVar.iterator();
                while (it.hasNext()) {
                    if (!new kotlin.ranges.c('0', '9', 1).r(str.charAt(((u0) it).c()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (v.s2(str, ProtectedSandApp.s("蔺\u0001"), false, 2, null)) {
            str = v.y6(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int h0(String str, int i4, ld.l<? super Character, Boolean> lVar) {
        while (i4 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i4))).booleanValue()) {
            i4++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j4, int i4) {
        return e.i((j4 << 1) + i4);
    }

    private static final String i0(String str, int i4, ld.l<? super Character, Boolean> lVar) {
        int i5 = i4;
        while (i5 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
            i5++;
        }
        l0.n(str, ProtectedSandApp.s("蔳\u0001"));
        String substring = str.substring(i4, i5);
        l0.o(substring, ProtectedSandApp.s("蔲\u0001"));
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j4) {
        return e.i((j4 << 1) + 1);
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final long j0(double d5, long j4) {
        return e.j0(j4, d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j4) {
        return new kotlin.ranges.o(-4611686018426L, f79219d).r(j4) ? l(j4 * 1000000) : j(kotlin.ranges.s.K(j4, -4611686018427387903L, f79218c));
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final long k0(int i4, long j4) {
        return e.k0(j4, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j4) {
        return e.i(j4 << 1);
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    public static final long l0(double d5, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔻\u0001"));
        double a5 = j.a(d5, hVar, h.NANOSECONDS);
        if (Double.isNaN(a5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("蔼\u0001"));
        }
        long M0 = kotlin.math.b.M0(a5);
        return new kotlin.ranges.o(-4611686018426999999L, f79217b).r(M0) ? l(M0) : k(kotlin.math.b.M0(j.a(d5, hVar, h.MILLISECONDS)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j4) {
        return new kotlin.ranges.o(-4611686018426999999L, f79217b).r(j4) ? l(j4) : j(j4 / 1000000);
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    public static final long m0(int i4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔻\u0001"));
        return hVar.compareTo(h.SECONDS) <= 0 ? l(j.c(i4, hVar, h.NANOSECONDS)) : n0(i4, hVar);
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    public static final long n0(long j4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔻\u0001"));
        h hVar2 = h.NANOSECONDS;
        long c5 = j.c(f79217b, hVar2, hVar);
        return new kotlin.ranges.o(-c5, c5).r(j4) ? l(j.c(j4, hVar, hVar2)) : j(kotlin.ranges.s.K(j.b(j4, hVar, h.MILLISECONDS), -4611686018427387903L, f79218c));
    }

    @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void q(double d5) {
    }

    @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void r(int i4) {
    }

    @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void s(long j4) {
    }

    @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void w(double d5) {
    }

    @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void x(int i4) {
    }

    @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    @c1(version = "1.3")
    public static /* synthetic */ void y(long j4) {
    }
}
