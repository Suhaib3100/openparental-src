package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AnimationSpec.kt */
@kd.g
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\u0088\u0001\t\u0092\u0001\u00020\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/z1;", "", "", "offsetMillis", "Landroidx/compose/animation/core/b2;", "offsetType", "b", "(II)J", "", "value", "c", "(J)J", "", "j", "(J)Ljava/lang/String;", "i", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "g", "h", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    private /* synthetic */ z1(long j4) {
        this.value = j4;
    }

    public static final /* synthetic */ z1 a(long j4) {
        return new z1(j4);
    }

    public static long b(int i4, int i5) {
        return i4 * i5;
    }

    private static long c(long j4) {
        return j4;
    }

    public static long d(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        if ((i6 & 2) != 0) {
            b2.INSTANCE.getClass();
            i5 = b2.f2563c;
        }
        return i4 * i5;
    }

    public static boolean e(long j4, Object obj) {
        return (obj instanceof z1) && j4 == ((z1) obj).value;
    }

    public static final boolean f(long j4, long j5) {
        return j4 == j5;
    }

    public static final int g(long j4) {
        return Math.abs((int) j4);
    }

    public static final int h(long j4) {
        boolean z4 = j4 > 0;
        if (z4) {
            b2.INSTANCE.getClass();
            return b2.f2564d;
        }
        if (z4) {
            throw new NoWhenBranchMatchedException();
        }
        b2.INSTANCE.getClass();
        return b2.f2563c;
    }

    public static int i(long j4) {
        return Long.hashCode(j4);
    }

    public static String j(long j4) {
        return "StartOffset(value=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    /* renamed from: k, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return j(this.value);
    }
}
