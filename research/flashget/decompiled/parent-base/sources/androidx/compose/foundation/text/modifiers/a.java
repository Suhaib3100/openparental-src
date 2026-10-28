package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: InlineDensity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0088\u0001\u000b\u0092\u0001\u00020\n¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "", "", "density", "fontScale", "c", "(FF)J", "Landroidx/compose/ui/unit/d;", "e", "(Landroidx/compose/ui/unit/d;)J", "", "packedValue", "d", "(J)J", "", "k", "(J)Ljava/lang/String;", "", "j", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "h", "(J)F", "i", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@r1({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,50:1\n25#2,3:51\n34#2:54\n41#2:55\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n32#1:51,3\n37#1:54\n40#1:55\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f7710c = c(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: InlineDensity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/a;", "Unspecified", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return a.f7710c;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ a(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ a b(long j4) {
        return new a(j4);
    }

    public static long c(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    private static long d(long j4) {
        return j4;
    }

    public static long e(@fg.l androidx.compose.ui.unit.d dVar) {
        return c(dVar.b(), dVar.getFontScale());
    }

    public static boolean f(long j4, Object obj) {
        return (obj instanceof a) && j4 == ((a) obj).packedValue;
    }

    public static final boolean g(long j4, long j5) {
        return j4 == j5;
    }

    public static final float h(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float i(long j4) {
        a0 a0Var = a0.f75283a;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static int j(long j4) {
        return Long.hashCode(j4);
    }

    @fg.l
    public static String k(long j4) {
        return "InlineDensity(density=" + h(j4) + ", fontScale=" + i(j4) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: l, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @fg.l
    public String toString() {
        return k(this.packedValue);
    }
}
