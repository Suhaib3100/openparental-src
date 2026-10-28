package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/material3/z9;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "totalDistance", "a", "(Landroidx/compose/runtime/t;I)Lld/l;", "positionalThreshold", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,480:1\n74#2:481\n1116#3,6:482\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n*L\n326#1:481\n327#1:482,6\n*E\n"})
/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final z9 f15862a = new z9();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15863b = 0;

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults$positionalThreshold$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,480:1\n154#2:481\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults$positionalThreshold$1$1$1\n*L\n327#1:481\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f15864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f15864b = dVar;
        }

        @fg.l
        public final Float a(float f4) {
            return Float.valueOf(this.f15864b.v5(androidx.compose.ui.unit.h.g(56)));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    private z9() {
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getPositionalThreshold")
    public final ld.l<Float, Float> a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1545861529);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1545861529, i4, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:325)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        tVar.P(308181361);
        boolean q02 = tVar.q0(dVar);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(dVar);
            tVar.E(Q);
        }
        ld.l<Float, Float> lVar = (ld.l) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return lVar;
    }
}
