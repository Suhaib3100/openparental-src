package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/i8;", "", "Landroidx/compose/foundation/w2;", "scrollState", "Lkotlinx/coroutines/r0;", "coroutineScope", "<init>", "(Landroidx/compose/foundation/w2;Lkotlinx/coroutines/r0;)V", "Landroidx/compose/material3/ka;", "Landroidx/compose/ui/unit/d;", "density", "", "edgeOffset", "", "tabPositions", "b", "(Landroidx/compose/material3/ka;Landroidx/compose/ui/unit/d;ILjava/util/List;)I", "selectedTab", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/unit/d;ILjava/util/List;I)V", "a", "Landroidx/compose/foundation/w2;", "Lkotlinx/coroutines/r0;", "Ljava/lang/Integer;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i8 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.w2 scrollState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 coroutineScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer selectedTab;

    /* compiled from: TabRow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {1181}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11616b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11618d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f11618d = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return i8.this.new a(this.f11618d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            androidx.compose.animation.core.k<Float> kVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11616b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.w2 w2Var = i8.this.scrollState;
                int i5 = this.f11618d;
                kVar = na.f12747b;
                this.f11616b = 1;
                if (w2Var.m(i5, kVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public i8(@fg.l androidx.compose.foundation.w2 w2Var, @fg.l kotlinx.coroutines.r0 r0Var) {
        this.scrollState = w2Var;
        this.coroutineScope = r0Var;
    }

    private final int b(ka kaVar, androidx.compose.ui.unit.d dVar, int i4, List<ka> list) {
        int q22 = dVar.q2(((ka) kotlin.collections.w.p3(list)).c()) + i4;
        int q4 = q22 - this.scrollState.q();
        int q23 = dVar.q2(kaVar.getLeft()) - ((q4 / 2) - (dVar.q2(kaVar.getWidth()) / 2));
        int i5 = q22 - q4;
        if (i5 < 0) {
            i5 = 0;
        }
        return kotlin.ranges.s.I(q23, 0, i5);
    }

    public final void c(@fg.l androidx.compose.ui.unit.d density, int edgeOffset, @fg.l List<ka> tabPositions, int selectedTab) {
        int b5;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == selectedTab) {
            return;
        }
        this.selectedTab = Integer.valueOf(selectedTab);
        ka kaVar = (ka) kotlin.collections.w.W2(tabPositions, selectedTab);
        if (kaVar == null || this.scrollState.r() == (b5 = b(kaVar, density, edgeOffset, tabPositions))) {
            return;
        }
        kotlinx.coroutines.k.f(this.coroutineScope, null, null, new a(b5, null), 3, null);
    }
}
