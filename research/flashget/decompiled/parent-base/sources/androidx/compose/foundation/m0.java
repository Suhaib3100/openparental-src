package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: ClipScrollableContainer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/j0;", "orientation", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/j0;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "F", "b", "()F", "MaxSupportedElevation", "Landroidx/compose/ui/q;", "HorizontalScrollableClipModifier", "c", "VerticalScrollableClipModifier", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n63#1:101\n*E\n"})
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f6585a = androidx.compose.ui.unit.h.g(30);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.q f6586b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.q f6587c;

    /* compiled from: ClipScrollableContainer.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/m0$a", "Landroidx/compose/ui/graphics/e6;", "Li0/n;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/b5;", "a", "(JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Landroidx/compose/ui/graphics/b5;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$HorizontalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class a implements e6 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.e6
        @fg.l
        public b5 a(long size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
            float q22 = density.q2(m0.b());
            return new b5.b(new i0.i(0.0f, -q22, i0.n.t(size), i0.n.m(size) + q22));
        }
    }

    /* compiled from: ClipScrollableContainer.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/m0$b", "Landroidx/compose/ui/graphics/e6;", "Li0/n;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/b5;", "a", "(JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Landroidx/compose/ui/graphics/b5;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt$VerticalScrollableClipModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
    public static final class b implements e6 {
        b() {
        }

        @Override // androidx.compose.ui.graphics.e6
        @fg.l
        public b5 a(long size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
            float q22 = density.q2(m0.b());
            return new b5.b(new i0.i(-q22, 0.0f, i0.n.t(size) + q22, i0.n.m(size)));
        }
    }

    static {
        q.Companion companion = androidx.compose.ui.q.INSTANCE;
        f6586b = androidx.compose.ui.draw.h.a(companion, new a());
        f6587c = androidx.compose.ui.draw.h.a(companion, new b());
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.gestures.j0 j0Var) {
        return qVar.w3(j0Var == androidx.compose.foundation.gestures.j0.Vertical ? f6587c : f6586b);
    }

    public static final float b() {
        return f6585a;
    }
}
