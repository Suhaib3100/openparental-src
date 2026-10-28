package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/c0;", "c", "(IILandroidx/compose/runtime/t;II)Landroidx/compose/foundation/lazy/c0;", "Landroidx/compose/ui/unit/h;", "a", "F", "DeltaThresholdForScrollAnimation", "Landroidx/compose/foundation/lazy/u;", "b", "Landroidx/compose/foundation/lazy/u;", "EmptyLazyListMeasureResult", "I", "NumberOfItemsToTeleport", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,567:1\n1116#2,6:568\n154#3:574\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n79#1:568,6\n540#1:574\n*E\n"})
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f5551a = androidx.compose.ui.unit.h.g(1);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final u f5552b = new u(null, 0, false, 0.0f, new a(), 0.0f, false, j0.f74919b, 0, 0, 0, false, androidx.compose.foundation.gestures.j0.Vertical, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f5553c = 100;

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/lazy/d0$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements n0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines = z0.z();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.n0
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "a", "()Landroidx/compose/foundation/lazy/c0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<c0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5558c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, int i5) {
            super(0);
            this.f5557b = i4;
            this.f5558c = i5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            return new c0(this.f5557b, this.f5558c);
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final c0 c(int i4, int i5, @fg.m androidx.compose.runtime.t tVar, int i6, int i7) {
        tVar.P(1470655220);
        if ((i7 & 1) != 0) {
            i4 = 0;
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1470655220, i6, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        c0.INSTANCE.getClass();
        androidx.compose.runtime.saveable.l lVar = c0.D;
        tVar.P(2079514038);
        boolean f4 = tVar.f(i4) | tVar.f(i5);
        Object Q = tVar.Q();
        if (f4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(i4, i5);
            tVar.E(Q);
        }
        tVar.p0();
        c0 c0Var = (c0) androidx.compose.runtime.saveable.d.d(objArr, lVar, null, (ld.a) Q, tVar, 72, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c0Var;
    }
}
