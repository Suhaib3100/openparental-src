package androidx.compose.ui.unit;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\fH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/unit/h;", "", "", "value", "g", "(F)F", "other", "p", "(FF)F", "o", "t", "i", "", "j", "(FI)F", "h", "q", "r", "f", "(FF)I", "", "s", "(F)Ljava/lang/String;", "n", "(F)I", "", "", "k", "(FLjava/lang/Object;)Z", "b", "F", "m", "()F", "c", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    private static final float f21499d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f21500e = Float.POSITIVE_INFINITY;

    /* renamed from: f, reason: collision with root package name */
    private static final float f21501f = Float.NaN;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float value;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/unit/h$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "Hairline", "F", "a", "()F", "b", "Infinity", "c", "d", "Unspecified", "e", "f", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        public final float a() {
            return h.f21499d;
        }

        public final float c() {
            return h.f21500e;
        }

        public final float e() {
            return h.f21501f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ h(float f4) {
        this.value = f4;
    }

    public static final /* synthetic */ h d(float f4) {
        return new h(f4);
    }

    @x4
    public static int f(float f4, float f5) {
        return Float.compare(f4, f5);
    }

    public static float g(float f4) {
        return f4;
    }

    @x4
    public static final float h(float f4, float f5) {
        return f4 / f5;
    }

    @x4
    public static final float i(float f4, float f5) {
        return f4 / f5;
    }

    @x4
    public static final float j(float f4, int i4) {
        return f4 / i4;
    }

    public static boolean k(float f4, Object obj) {
        return (obj instanceof h) && Float.compare(f4, ((h) obj).value) == 0;
    }

    public static final boolean l(float f4, float f5) {
        return Float.compare(f4, f5) == 0;
    }

    public static int n(float f4) {
        return Float.hashCode(f4);
    }

    @x4
    public static final float o(float f4, float f5) {
        return f4 - f5;
    }

    @x4
    public static final float p(float f4, float f5) {
        return f4 + f5;
    }

    @x4
    public static final float q(float f4, float f5) {
        return f4 * f5;
    }

    @x4
    public static final float r(float f4, int i4) {
        return f4 * i4;
    }

    @x4
    @fg.l
    public static String s(float f4) {
        if (Float.isNaN(f4)) {
            return "Dp.Unspecified";
        }
        return f4 + ".dp";
    }

    @x4
    public static final float t(float f4) {
        return -f4;
    }

    @Override // java.lang.Comparable
    public int compareTo(h hVar) {
        return Float.compare(this.value, hVar.value);
    }

    @x4
    public int e(float f4) {
        return Float.compare(this.value, f4);
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    /* renamed from: m, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @x4
    @fg.l
    public String toString() {
        return s(this.value);
    }

    public final /* synthetic */ float u() {
        return this.value;
    }
}
