package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@kd.g
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/a0;", "", "", "value", "b", "(J)J", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "e", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    private /* synthetic */ a0(long j4) {
        this.value = j4;
    }

    public static final /* synthetic */ a0 a(long j4) {
        return new a0(j4);
    }

    public static long b(long j4) {
        return j4;
    }

    public static boolean c(long j4, Object obj) {
        return (obj instanceof a0) && j4 == ((a0) obj).value;
    }

    public static final boolean d(long j4, long j5) {
        return j4 == j5;
    }

    public static int f(long j4) {
        return Long.hashCode(j4);
    }

    public static String g(long j4) {
        return "PointerId(value=" + j4 + ')';
    }

    /* renamed from: e, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public final /* synthetic */ long h() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return g(this.value);
    }
}
