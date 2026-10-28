package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: TransformOrigin.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/p6;", "", "", "packedValue", "e", "(J)J", "", "c", "(J)F", "d", "pivotFractionX", "pivotFractionY", "f", "(JFF)J", "", "n", "(J)Ljava/lang/String;", "", "m", "(J)I", "other", "", "h", "(JLjava/lang/Object;)Z", "a", "J", "j", "()V", "k", "l", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@androidx.compose.runtime.m1
@kotlin.jvm.internal.r1({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f17986c = q6.a(0.5f, 0.5f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: TransformOrigin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/p6$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/p6;", "Center", "J", "a", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.p6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return p6.f17986c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ p6(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ p6 b(long j4) {
        return new p6(j4);
    }

    @androidx.compose.runtime.x4
    public static final float c(long j4) {
        return k(j4);
    }

    @androidx.compose.runtime.x4
    public static final float d(long j4) {
        return l(j4);
    }

    public static long e(long j4) {
        return j4;
    }

    public static final long f(long j4, float f4, float f5) {
        return q6.a(f4, f5);
    }

    public static long g(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = k(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = l(j4);
        }
        return q6.a(f4, f5);
    }

    public static boolean h(long j4, Object obj) {
        return (obj instanceof p6) && j4 == ((p6) obj).packedValue;
    }

    public static final boolean i(long j4, long j5) {
        return j4 == j5;
    }

    @kotlin.w0
    public static /* synthetic */ void j() {
    }

    public static final float k(long j4) {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float l(long j4) {
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static int m(long j4) {
        return Long.hashCode(j4);
    }

    public static String n(long j4) {
        return "TransformOrigin(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return h(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: o, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return n(this.packedValue);
    }
}
