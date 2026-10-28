package androidx.compose.foundation.text;

import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u00020\r*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/g1;", "Landroidx/compose/ui/layout/m0;", "Lkotlin/Function0;", "", "Li0/i;", "placements", "<init>", "(Lld/a;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Lld/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n298#2,3:448\n69#2,4:451\n301#2:455\n302#2:457\n74#2:458\n303#2:459\n1#3:456\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n373#1:448,3\n373#1:451,4\n373#1:455\n373#1:457\n373#1:458\n373#1:459\n373#1:456\n*E\n"})
/* loaded from: classes.dex */
final class g1 implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<List<i0.i>> placements;

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,447:1\n33#2,6:448\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n*L\n392#1:448,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<kotlin.q0<androidx.compose.ui.layout.i1, androidx.compose.ui.unit.q>> f7403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends kotlin.q0<? extends androidx.compose.ui.layout.i1, androidx.compose.ui.unit.q>> list) {
            super(1);
            this.f7403b = list;
        }

        public final void a(@fg.l i1.a aVar) {
            List<kotlin.q0<androidx.compose.ui.layout.i1, androidx.compose.ui.unit.q>> list = this.f7403b;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    kotlin.q0<androidx.compose.ui.layout.i1, androidx.compose.ui.unit.q> q0Var = list.get(i4);
                    i1.a.i(aVar, q0Var.a(), q0Var.b().getPackedValue(), 0.0f, 2, null);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g1(@fg.l ld.a<? extends List<i0.i>> aVar) {
        this.placements = aVar;
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        List<i0.i> invoke = this.placements.invoke();
        ArrayList arrayList = null;
        if (invoke != null) {
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size = invoke.size();
            for (int i4 = 0; i4 < size; i4++) {
                i0.i iVar = invoke.get(i4);
                kotlin.q0 q0Var = iVar != null ? new kotlin.q0(list.get(i4).m0(androidx.compose.ui.unit.c.b(0, (int) Math.floor(iVar.G()), 0, (int) Math.floor(iVar.r()), 5, null)), androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.r.a(kotlin.math.b.L0(iVar.t()), kotlin.math.b.L0(iVar.getTop())))) : null;
                if (q0Var != null) {
                    arrayList2.add(q0Var);
                }
            }
            arrayList = arrayList2;
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4), null, new a(arrayList), 4, null);
    }
}
