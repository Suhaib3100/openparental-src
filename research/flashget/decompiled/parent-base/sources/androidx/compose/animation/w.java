package androidx.compose.animation;

import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.k2;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;

/* compiled from: ColorVectorConverter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\";\u0010\n\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/c;", "Lkotlin/r0;", "name", "colorSpace", "Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/graphics/d2;", "Landroidx/compose/animation/core/r;", "a", "Lld/l;", "ColorToVector", "Landroidx/compose/ui/graphics/d2$a;", "(Landroidx/compose/ui/graphics/d2$a;)Lld/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<androidx.compose.ui.graphics.colorspace.c, i2<d2, androidx.compose.animation.core.r>> f3387a = a.f3388b;

    /* compiled from: ColorVectorConverter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroidx/compose/animation/core/i2;", "Landroidx/compose/ui/graphics/d2;", "Landroidx/compose/animation/core/r;", "a", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/animation/core/i2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.colorspace.c, i2<d2, androidx.compose.animation.core.r>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3388b = new a(1);

        /* compiled from: ColorVectorConverter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/animation/core/r;", "a", "(J)Landroidx/compose/animation/core/r;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.w$a$a, reason: collision with other inner class name */
        static final class C0050a extends kotlin.jvm.internal.n0 implements ld.l<d2, androidx.compose.animation.core.r> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0050a f3389b = new C0050a(1);

            C0050a() {
                super(1);
            }

            @fg.l
            public final androidx.compose.animation.core.r a(long j4) {
                long u4 = d2.u(j4, androidx.compose.ui.graphics.colorspace.g.f17689a.u());
                return new androidx.compose.animation.core.r(d2.A(u4), d2.I(u4), d2.G(u4), d2.C(u4));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.r invoke(d2 d2Var) {
                return a(d2Var.M());
            }
        }

        /* compiled from: ColorVectorConverter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/r;", "vector", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/animation/core/r;)J"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.r, d2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.colorspace.c f3390b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.graphics.colorspace.c cVar) {
                super(1);
                this.f3390b = cVar;
            }

            public final long a(@fg.l androidx.compose.animation.core.r rVar) {
                return d2.u(f2.a(kotlin.ranges.s.H(rVar.getV2(), 0.0f, 1.0f), kotlin.ranges.s.H(rVar.getV3(), -0.5f, 0.5f), kotlin.ranges.s.H(rVar.getV4(), -0.5f, 0.5f), kotlin.ranges.s.H(rVar.getV1(), 0.0f, 1.0f), androidx.compose.ui.graphics.colorspace.g.f17689a.u()), this.f3390b);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ d2 invoke(androidx.compose.animation.core.r rVar) {
                return d2.n(a(rVar));
            }
        }

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2<d2, androidx.compose.animation.core.r> invoke(@fg.l androidx.compose.ui.graphics.colorspace.c cVar) {
            return k2.a(C0050a.f3389b, new b(cVar));
        }
    }

    @fg.l
    public static final ld.l<androidx.compose.ui.graphics.colorspace.c, i2<d2, androidx.compose.animation.core.r>> a(@fg.l d2.Companion companion) {
        return f3387a;
    }
}
