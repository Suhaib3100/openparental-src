package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/t0;", "", "", "packedValue", "c", "(J)J", "other", "", "p", "(JJ)Z", "d", "", "offset", "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "o", "(J)I", "f", "(JLjava/lang/Object;)Z", "a", "J", "n", "start", "i", "end", "l", "min", "k", "max", "h", "(J)Z", "collapsed", "m", "reversed", "j", "length", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n55#2:130\n62#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f21417c = u0.b(0, 0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/t0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/t0;", "Zero", "J", "a", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.t0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return t0.f21417c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ t0(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ t0 b(long j4) {
        return new t0(j4);
    }

    public static long c(long j4) {
        return j4;
    }

    public static final boolean d(long j4, long j5) {
        return l(j4) <= l(j5) && k(j5) <= k(j4);
    }

    public static final boolean e(long j4, int i4) {
        return i4 < k(j4) && l(j4) <= i4;
    }

    public static boolean f(long j4, Object obj) {
        return (obj instanceof t0) && j4 == ((t0) obj).packedValue;
    }

    public static final boolean g(long j4, long j5) {
        return j4 == j5;
    }

    public static final boolean h(long j4) {
        return ((int) (j4 >> 32)) == ((int) (j4 & 4294967295L));
    }

    public static final int i(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static final int j(long j4) {
        return k(j4) - l(j4);
    }

    public static final int k(long j4) {
        int i4 = (int) (j4 >> 32);
        int i5 = (int) (j4 & 4294967295L);
        return i4 > i5 ? i4 : i5;
    }

    public static final int l(long j4) {
        int i4 = (int) (j4 >> 32);
        int i5 = (int) (j4 & 4294967295L);
        return i4 > i5 ? i5 : i4;
    }

    public static final boolean m(long j4) {
        return ((int) (j4 >> 32)) > ((int) (j4 & 4294967295L));
    }

    public static final int n(long j4) {
        return (int) (j4 >> 32);
    }

    public static int o(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean p(long j4, long j5) {
        return l(j4) < k(j5) && l(j5) < k(j4);
    }

    @fg.l
    public static String q(long j4) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return androidx.view.e.a(sb, (int) (j4 & 4294967295L), ')');
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @fg.l
    public String toString() {
        return q(this.packedValue);
    }
}
