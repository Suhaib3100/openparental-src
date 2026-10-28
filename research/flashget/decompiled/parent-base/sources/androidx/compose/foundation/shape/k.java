package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.x1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u0003HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/shape/k;", "Landroidx/compose/foundation/shape/f;", "Landroidx/compose/ui/platform/x1;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "f", "()F", "Li0/n;", "shapeSize", "Landroidx/compose/ui/unit/d;", "density", "", "a", "(JLandroidx/compose/ui/unit/d;)F", "", "toString", "()Ljava/lang/String;", "i", "(F)Landroidx/compose/foundation/shape/k;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "k", "valueOverride", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/* loaded from: classes.dex */
final /* data */ class k implements f, x1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float size;

    public /* synthetic */ k(float f4, w wVar) {
        this(f4);
    }

    /* renamed from: f, reason: from getter */
    private final float getSize() {
        return this.size;
    }

    public static k j(k kVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = kVar.size;
        }
        kVar.getClass();
        return new k(f4);
    }

    @Override // androidx.compose.foundation.shape.f
    public float a(long shapeSize, @fg.l androidx.compose.ui.unit.d density) {
        return density.v5(this.size);
    }

    @Override // androidx.compose.ui.platform.x1
    public Object b() {
        return androidx.compose.ui.unit.h.d(this.size);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && androidx.compose.ui.unit.h.l(this.size, ((k) other).size);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.h.n(this.size);
    }

    @fg.l
    public final k i(float size) {
        return new k(size);
    }

    public float k() {
        return this.size;
    }

    @fg.l
    public String toString() {
        return j.a(new StringBuilder("CornerSize(size = "), this.size, ".dp)");
    }

    private k(float f4) {
        this.size = f4;
    }
}
