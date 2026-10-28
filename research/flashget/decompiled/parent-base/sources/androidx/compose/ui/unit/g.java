package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b*\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/g;", "Landroidx/compose/ui/unit/d;", "", "density", "fontScale", "Lw0/a;", "converter", "<init>", "(FFLw0/a;)V", "l", "()Lw0/a;", "Landroidx/compose/ui/unit/h;", "Landroidx/compose/ui/unit/z;", "h", "(F)J", "i", "(J)F", "a", "()F", "f", "p", "(FFLw0/a;)Landroidx/compose/ui/unit/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "c", "U", "d", "Lw0/a;", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class g implements d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float fontScale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0.a converter;

    public g(float f4, float f5, @fg.l w0.a aVar) {
        this.density = f4;
        this.fontScale = f5;
        this.converter = aVar;
    }

    /* renamed from: l, reason: from getter */
    private final w0.a getConverter() {
        return this.converter;
    }

    public static g q(g gVar, float f4, float f5, w0.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = gVar.density;
        }
        if ((i4 & 2) != 0) {
            f5 = gVar.fontScale;
        }
        if ((i4 & 4) != 0) {
            aVar = gVar.converter;
        }
        gVar.getClass();
        return new g(f4, f5, aVar);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    /* renamed from: a, reason: from getter */
    public final float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.density;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return Float.compare(this.density, gVar.density) == 0 && Float.compare(this.fontScale, gVar.fontScale) == 0 && l0.g(this.converter, gVar.converter);
    }

    public final float f() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.unit.n
    public long h(float f4) {
        return a0.v(4294967296L, this.converter.a(f4));
    }

    public int hashCode() {
        return this.converter.hashCode() + androidx.compose.animation.l0.a(this.fontScale, Float.hashCode(this.density) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.n
    public float i(long j4) {
        long m4 = z.m(j4);
        b0.INSTANCE.getClass();
        if (b0.g(m4, b0.f21487d)) {
            return h.g(this.converter.b(z.n(j4)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @fg.l
    public final g p(float density, float fontScale, @fg.l w0.a converter) {
        return new g(density, fontScale, converter);
    }

    @fg.l
    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
