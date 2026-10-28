package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatFloatPair.kt */
@kd.g
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u0012\u0010\u0003\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0012\u0010\u0004\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u001e"}, d2 = {"Landroidx/collection/o;", "", "", "first", "second", "d", "(FF)J", "", "packedValue", "e", "(J)J", "b", "(J)F", "c", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "i", "()V", "h", "j", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long packedValue;

    private /* synthetic */ o(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ o a(long j4) {
        return new o(j4);
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static long d(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static long e(long j4) {
        return j4;
    }

    public static boolean f(long j4, Object obj) {
        return (obj instanceof o) && j4 == ((o) obj).packedValue;
    }

    public static final boolean g(long j4, long j5) {
        return j4 == j5;
    }

    public static final float h(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    @kotlin.w0
    public static /* synthetic */ void i() {
    }

    public static final float j(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static int k(long j4) {
        return Long.hashCode(j4);
    }

    @fg.l
    public static String l(long j4) {
        return "(" + Float.intBitsToFloat((int) (j4 >> 32)) + ", " + Float.intBitsToFloat((int) (j4 & 4294967295L)) + ')';
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
