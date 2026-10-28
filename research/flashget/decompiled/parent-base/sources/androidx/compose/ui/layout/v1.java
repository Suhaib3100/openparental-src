package androidx.compose.ui.layout;

import androidx.annotation.c1;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TestModifierUpdater.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/u1;", "Lkotlin/k2;", "onAttached", "a", "(Lld/l;Landroidx/compose/runtime/t;I)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,65:1\n251#2,8:66\n259#2,2:80\n3737#3,6:74\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n55#1:66,8\n55#1:80,2\n60#1:74,6\n*E\n"})
/* loaded from: classes.dex */
public final class v1 {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f19113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f19113b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.h0, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.h0 invoke() {
            return this.f19113b.invoke();
        }
    }

    /* compiled from: TestModifierUpdater.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/h0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<u1, k2> f19114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super u1, k2> lVar) {
            super(1);
            this.f19114b = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var) {
            this.f19114b.invoke(new u1(h0Var));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: TestModifierUpdater.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<u1, k2> f19115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19116c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super u1, k2> lVar, int i4) {
            super(2);
            this.f19115b = lVar;
            this.f19116c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            v1.a(this.f19115b, tVar, g3.b(this.f19116c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TestModifierUpdater.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "<anonymous>", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;Landroidx/compose/ui/unit/b;)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class d implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f19117a = new d();

        /* compiled from: TestModifierUpdater.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f19118b = new a(1);

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

        d() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4) {
            return o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4), null, a.f19118b, 4, null);
        }
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "It is a test API, do not use it in the real applications")
    @androidx.annotation.c1({c1.a.LIBRARY})
    @androidx.compose.runtime.i
    public static final void a(@fg.l ld.l<? super u1, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1673066036);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(lVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1673066036, i5, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:49)");
            }
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            d dVar = d.f19117a;
            androidx.compose.ui.node.h0.INSTANCE.getClass();
            ld.a aVar = androidx.compose.ui.node.h0.P;
            o4.P(1886828752);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.v();
            if (o4.getInserting()) {
                o4.F(new a(aVar));
            } else {
                o4.C();
            }
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            m5.j(o4, dVar, companion.f());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            m5.g(o4, new b(lVar));
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(lVar, i4));
        }
    }
}
