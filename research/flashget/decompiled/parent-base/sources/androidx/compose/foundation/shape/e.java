package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;

/* compiled from: CornerBasedShape.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/shape/e;", "Landroidx/compose/ui/graphics/e6;", "Landroidx/compose/foundation/shape/f;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "Li0/n;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/b5;", "a", "(JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Landroidx/compose/ui/graphics/b5;", "", "e", "(JFFFFLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/graphics/b5;", "c", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/e;", "all", "b", "(Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/e;", "Landroidx/compose/foundation/shape/f;", "i", "()Landroidx/compose/foundation/shape/f;", "h", "f", "d", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e implements e6 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7059e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f topStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f topEnd;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f bottomEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f bottomStart;

    public e(@fg.l f fVar, @fg.l f fVar2, @fg.l f fVar3, @fg.l f fVar4) {
        this.topStart = fVar;
        this.topEnd = fVar2;
        this.bottomEnd = fVar3;
        this.bottomStart = fVar4;
    }

    public static /* synthetic */ e d(e eVar, f fVar, f fVar2, f fVar3, f fVar4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i4 & 1) != 0) {
            fVar = eVar.topStart;
        }
        if ((i4 & 2) != 0) {
            fVar2 = eVar.topEnd;
        }
        if ((i4 & 4) != 0) {
            fVar3 = eVar.bottomEnd;
        }
        if ((i4 & 8) != 0) {
            fVar4 = eVar.bottomStart;
        }
        return eVar.c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.ui.graphics.e6
    @fg.l
    public final b5 a(long size, @fg.l w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
        float a5 = this.topStart.a(size, density);
        float a6 = this.topEnd.a(size, density);
        float a7 = this.bottomEnd.a(size, density);
        float a8 = this.bottomStart.a(size, density);
        float q4 = i0.n.q(size);
        float f4 = a5 + a8;
        if (f4 > q4) {
            float f5 = q4 / f4;
            a5 *= f5;
            a8 *= f5;
        }
        float f6 = a8;
        float f7 = a6 + a7;
        if (f7 > q4) {
            float f10 = q4 / f7;
            a6 *= f10;
            a7 *= f10;
        }
        if (a5 >= 0.0f && a6 >= 0.0f && a7 >= 0.0f && f6 >= 0.0f) {
            return e(size, a5, a6, a7, f6, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a5 + ", topEnd = " + a6 + ", bottomEnd = " + a7 + ", bottomStart = " + f6 + ")!").toString());
    }

    @fg.l
    public final e b(@fg.l f all) {
        return c(all, all, all, all);
    }

    @fg.l
    public abstract e c(@fg.l f topStart, @fg.l f topEnd, @fg.l f bottomEnd, @fg.l f bottomStart);

    @fg.l
    public abstract b5 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @fg.l w layoutDirection);

    @fg.l
    /* renamed from: f, reason: from getter */
    public final f getBottomEnd() {
        return this.bottomEnd;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final f getBottomStart() {
        return this.bottomStart;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final f getTopEnd() {
        return this.topEnd;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final f getTopStart() {
        return this.topStart;
    }
}
