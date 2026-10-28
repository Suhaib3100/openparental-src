package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntIntPair.kt */
@kd.g
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u001c"}, d2 = {"Landroidx/collection/g0;", "", "", "first", "second", "d", "(II)J", "", "packedValue", "e", "(J)J", "b", "(J)I", "c", "", "l", "(J)Ljava/lang/String;", "k", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "i", "()V", "h", "j", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long packedValue;

    private /* synthetic */ g0(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ g0 a(long j4) {
        return new g0(j4);
    }

    public static final int b(long j4) {
        return (int) (j4 >> 32);
    }

    public static final int c(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static long d(int i4, int i5) {
        return (i5 & 4294967295L) | (i4 << 32);
    }

    public static long e(long j4) {
        return j4;
    }

    public static boolean f(long j4, Object obj) {
        return (obj instanceof g0) && j4 == ((g0) obj).packedValue;
    }

    public static final boolean g(long j4, long j5) {
        return j4 == j5;
    }

    public static final int h(long j4) {
        return (int) (j4 >> 32);
    }

    @kotlin.w0
    public static /* synthetic */ void i() {
    }

    public static final int j(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static int k(long j4) {
        return Long.hashCode(j4);
    }

    @fg.l
    public static String l(long j4) {
        StringBuilder sb = new StringBuilder("(");
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

    /* renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @fg.l
    public String toString() {
        return l(this.packedValue);
    }
}
