package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: LazyGridSpan.kt */
@kd.g
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b;", "", "", "packedValue", "b", "(J)J", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "e", "currentLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ b(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ b a(long j4) {
        return new b(j4);
    }

    public static long b(long j4) {
        return j4;
    }

    public static boolean c(long j4, Object obj) {
        return (obj instanceof b) && j4 == ((b) obj).packedValue;
    }

    public static final boolean d(long j4, long j5) {
        return j4 == j5;
    }

    public static final int e(long j4) {
        return (int) j4;
    }

    public static int f(long j4) {
        return Long.hashCode(j4);
    }

    public static String g(long j4) {
        return "GridItemSpan(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    /* renamed from: h, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public String toString() {
        return g(this.packedValue);
    }
}
