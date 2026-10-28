package androidx.compose.ui.layout;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u00022!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aV\u0010\u0014\u001a\u00020\t*\u00020\t2A\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/i0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/ui/v;", "Lkotlin/u;", "content", "a", "(Lld/q;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/q;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/r0;", "name", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "measure", "b", "(Landroidx/compose/ui/q;Lld/q;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,192:1\n25#2:193\n365#2,11:200\n1116#3,6:194\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n50#1:193\n51#1:200,11\n50#1:194,6\n*E\n"})
/* loaded from: classes.dex */
public final class k0 {

    /* compiled from: LookaheadScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/h0;", "a", "()Landroidx/compose/ui/node/h0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19024b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.node.h0 invoke() {
            return new androidx.compose.ui.node.h0(true, 0, 2, null);
        }
    }

    /* compiled from: LookaheadScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/h0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19025b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var) {
            h0Var.P1(true);
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.node.h0 h0Var) {
            h0Var.P1(true);
            return k2.f75408a;
        }
    }

    /* compiled from: LookaheadScope.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/j0;", "scope", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/layout/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.node.h0, j0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19026b = new c(2);

        /* compiled from: LookaheadScope.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/u;", "a", "()Landroidx/compose/ui/layout/u;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<u> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.node.h0 f19027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.node.h0 h0Var) {
                super(0);
                this.f19027b = h0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u invoke() {
                androidx.compose.ui.node.h0 B0 = this.f19027b.B0();
                kotlin.jvm.internal.l0.m(B0);
                return B0.d0().P0();
            }
        }

        c() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l j0 j0Var) {
            j0Var.b(new a(h0Var));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.h0 h0Var, j0 j0Var) {
            a(h0Var, j0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: LookaheadScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<i0, androidx.compose.runtime.t, Integer, k2> f19028b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19029c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.q<? super i0, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, int i4) {
            super(2);
            this.f19028b = qVar;
            this.f19029c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k0.a(this.f19028b, tVar, g3.b(this.f19029c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void a(@fg.l ld.q<? super i0, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1078066484);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1078066484, i5, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            o4.P(-492369756);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new j0(null, 1, null);
                o4.E(Q);
            }
            o4.p0();
            j0 j0Var = (j0) Q;
            a aVar = a.f19024b;
            o4.P(-692256719);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(aVar);
            } else {
                o4.C();
            }
            m5.g(o4, b.f19025b);
            m5.j(o4, j0Var, c.f19026b);
            qVar.R(j0Var, o4, Integer.valueOf(((i5 << 3) & 112) | 8));
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(qVar, i4));
        }
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar2) {
        return qVar.w3(new IntermediateLayoutElement(qVar2));
    }
}
