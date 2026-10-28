package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.a1;
import androidx.compose.animation.core.b0;
import androidx.compose.foundation.gestures.e0;
import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.lazy.c0;
import androidx.compose.foundation.lazy.n;
import androidx.compose.foundation.lazy.s;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.unit.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "lazyListState", "Landroidx/compose/foundation/gestures/snapping/l;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/j;", "a", "(Landroidx/compose/foundation/lazy/c0;Landroidx/compose/foundation/gestures/snapping/l;)Landroidx/compose/foundation/gestures/snapping/j;", "Landroidx/compose/foundation/gestures/e0;", "e", "(Landroidx/compose/foundation/lazy/c0;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/e0;", "Landroidx/compose/ui/unit/d;", "", "velocity", "Landroidx/compose/foundation/gestures/snapping/c;", "c", "(Landroidx/compose/ui/unit/d;F)I", "Landroidx/compose/foundation/lazy/s;", "", "d", "(Landroidx/compose/foundation/lazy/s;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,155:1\n36#2:156\n1116#3,6:157\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n127#1:156\n127#1:157,6\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* compiled from: LazyListSnapLayoutInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/gestures/snapping/f$a", "Landroidx/compose/foundation/gestures/snapping/j;", "", "initialVelocity", "b", "(F)F", "currentVelocity", "a", "c", "()F", "Landroidx/compose/foundation/lazy/s;", "d", "()Landroidx/compose/foundation/lazy/s;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n33#2,6:156\n132#2,3:163\n33#2,4:166\n135#2,2:170\n38#2:172\n137#2:173\n1#3:162\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n78#1:156,6\n110#1:163,3\n110#1:166,4\n110#1:170,2\n110#1:172\n110#1:173\n*E\n"})
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f4259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f4260b;

        a(c0 c0Var, l lVar) {
            this.f4259a = c0Var;
            this.f4260b = lVar;
        }

        private final s d() {
            return this.f4259a.A();
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float a(float currentVelocity) {
            List<n> j4 = this.f4259a.A().j();
            l lVar = this.f4260b;
            int size = j4.size();
            float f4 = Float.NEGATIVE_INFINITY;
            float f5 = Float.POSITIVE_INFINITY;
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = j4.get(i4);
                float a5 = m.a(f.d(this.f4259a.A()), this.f4259a.A().e(), this.f4259a.A().getAfterContentPadding(), nVar.getSize(), nVar.getOffset(), nVar.getIndex(), lVar);
                if (a5 <= 0.0f && a5 > f4) {
                    f4 = a5;
                }
                if (a5 >= 0.0f && a5 < f5) {
                    f5 = a5;
                }
            }
            return i.j(f.c(this.f4259a.getDensity(), currentVelocity), f4, f5);
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float b(float initialVelocity) {
            float t4 = kotlin.ranges.s.t((c() * ((float) Math.floor(Math.abs(Math.abs(b0.a(a1.c(this.f4259a.getDensity()), 0.0f, initialVelocity))) / c()))) - c(), 0.0f);
            return t4 == 0.0f ? t4 : t4 * Math.signum(initialVelocity);
        }

        public final float c() {
            s A = this.f4259a.A();
            if (A.j().isEmpty()) {
                return 0.0f;
            }
            List<n> j4 = A.j();
            int size = j4.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                i4 += j4.get(i5).getSize();
            }
            return i4 / A.j().size();
        }
    }

    @fg.l
    @z0
    public static final j a(@fg.l c0 c0Var, @fg.l l lVar) {
        return new a(c0Var, lVar);
    }

    public static j b(c0 c0Var, l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = l.INSTANCE.c();
        }
        return new a(c0Var, lVar);
    }

    public static final int c(@fg.l androidx.compose.ui.unit.d dVar, float f4) {
        if (Math.abs(f4) < dVar.v5(i.p())) {
            c.INSTANCE.getClass();
            return c.f4252c;
        }
        if (f4 > 0.0f) {
            c.INSTANCE.getClass();
            return c.f4253d;
        }
        c.INSTANCE.getClass();
        return c.f4254e;
    }

    public static final int d(@fg.l s sVar) {
        return sVar.getOrientation() == j0.Vertical ? u.j(sVar.b()) : u.m(sVar.b());
    }

    @fg.l
    @z0
    @androidx.compose.runtime.i
    public static final e0 e(@fg.l c0 c0Var, @fg.m t tVar, int i4) {
        tVar.P(1148456277);
        if (x.b0()) {
            x.r0(1148456277, i4, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:125)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(c0Var);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            Q = b(c0Var, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        h q4 = i.q((j) Q, tVar, 0);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return q4;
    }
}
