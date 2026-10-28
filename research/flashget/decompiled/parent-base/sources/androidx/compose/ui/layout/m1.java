package androidx.compose.ui.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: RootMeasurePolicy.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/m1;", "Landroidx/compose/ui/node/h0$f;", "<init>", "()V", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,68:1\n151#2,3:69\n33#2,4:72\n154#2,2:76\n38#2:78\n156#2:79\n33#2,6:80\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:69,3\n47#1:72,4\n47#1:76,2\n47#1:78\n47#1:79\n52#1:80,6\n*E\n"})
/* loaded from: classes.dex */
public final class m1 extends h0.f {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final m1 f19031c = new m1();

    /* renamed from: d, reason: collision with root package name */
    public static final int f19032d = 0;

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19033b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public k2 invoke(i1.a aVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f19034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1 i1Var) {
            super(1);
            this.f19034b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.q(aVar, this.f19034b, 0, 0, 0.0f, null, 12, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,68:1\n33#2,6:69\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n*L\n60#1:69,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<i1> f19035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends i1> list) {
            super(1);
            this.f19035b = list;
        }

        public final void a(@fg.l i1.a aVar) {
            List<i1> list = this.f19035b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i1.a.q(aVar, list.get(i4), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    private m1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4) {
        if (list.isEmpty()) {
            return o0.x2(o0Var, androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.q(j4), null, a.f19033b, 4, null);
        }
        if (list.size() == 1) {
            i1 m02 = list.get(0).m0(j4);
            return o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, m02.getWidth()), androidx.compose.ui.unit.c.f(j4, m02.getHeight()), null, new b(m02), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            i4 = androidx.compose.animation.n.a(list.get(i4), j4, arrayList, i4, 1);
        }
        int size2 = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            i1 i1Var = (i1) arrayList.get(i7);
            i5 = Math.max(i1Var.getWidth(), i5);
            i6 = Math.max(i1Var.getHeight(), i6);
        }
        return o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, i5), androidx.compose.ui.unit.c.f(j4, i6), null, new c(arrayList), 4, null);
    }
}
