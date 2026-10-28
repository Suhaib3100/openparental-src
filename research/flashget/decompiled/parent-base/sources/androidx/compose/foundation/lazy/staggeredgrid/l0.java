package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridMeasure.kt */
@kd.g
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0019\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0012\u0010\u001b\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0012\u0010\u001d\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "", "", "lane", "span", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "k", "(J)Ljava/lang/String;", "j", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "g", "()J", "i", "start", "f", "end", "h", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n952#1:1229\n951#1:1231\n48#2:1226\n55#2:1227\n62#2:1228\n62#2:1230\n55#2:1232\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n953#1:1229\n953#1:1231\n949#1:1226\n951#1:1227\n952#1:1228\n953#1:1230\n953#1:1232\n*E\n"})
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ l0(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ l0 a(long j4) {
        return new l0(j4);
    }

    public static long b(int i4, int i5) {
        return ((i5 + i4) & 4294967295L) | (i4 << 32);
    }

    private static long c(long j4) {
        return j4;
    }

    public static boolean d(long j4, Object obj) {
        return (obj instanceof l0) && j4 == ((l0) obj).packedValue;
    }

    public static final boolean e(long j4, long j5) {
        return j4 == j5;
    }

    public static final int f(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static final int h(long j4) {
        return ((int) (4294967295L & j4)) - ((int) (j4 >> 32));
    }

    public static final int i(long j4) {
        return (int) (j4 >> 32);
    }

    public static int j(long j4) {
        return Long.hashCode(j4);
    }

    public static String k(long j4) {
        return "SpanRange(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    /* renamed from: g, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final /* synthetic */ long l() {
        return this.packedValue;
    }

    public String toString() {
        return k(this.packedValue);
    }
}
