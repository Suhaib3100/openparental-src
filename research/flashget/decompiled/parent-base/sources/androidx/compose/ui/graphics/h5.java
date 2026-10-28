package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: PathEffect.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/h5;", "", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f17845a;

    /* compiled from: PathEffect.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/h5$a;", "", "<init>", "()V", "", "radius", "Landroidx/compose/ui/graphics/h5;", "b", "(F)Landroidx/compose/ui/graphics/h5;", "", "intervals", "phase", "c", "([FF)Landroidx/compose/ui/graphics/h5;", "outer", "inner", "a", "(Landroidx/compose/ui/graphics/h5;Landroidx/compose/ui/graphics/h5;)Landroidx/compose/ui/graphics/h5;", "Landroidx/compose/ui/graphics/g5;", "shape", "advance", "Landroidx/compose/ui/graphics/h6;", "style", "e", "(Landroidx/compose/ui/graphics/g5;FFI)Landroidx/compose/ui/graphics/h5;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.h5$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17845a = new Companion();

        private Companion() {
        }

        public static h5 d(Companion companion, float[] fArr, float f4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                f4 = 0.0f;
            }
            companion.getClass();
            return x0.c(fArr, f4);
        }

        @fg.l
        public final h5 a(@fg.l h5 outer, @fg.l h5 inner) {
            return x0.a(outer, inner);
        }

        @fg.l
        public final h5 b(float radius) {
            return x0.b(radius);
        }

        @fg.l
        public final h5 c(@fg.l float[] intervals, float phase) {
            return x0.c(intervals, phase);
        }

        @fg.l
        public final h5 e(@fg.l g5 shape, float advance, float phase, int style) {
            return x0.d(shape, advance, phase, style);
        }
    }
}
