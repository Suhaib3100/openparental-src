package androidx.compose.ui.layout;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.node.g;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0014\u001a8\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measurePolicy", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/layout/r1;", "state", "b", "(Landroidx/compose/ui/layout/r1;Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "", "maxSlotsToRetainForReuse", "Landroidx/compose/ui/layout/t1;", "c", "(I)Landroidx/compose/ui/layout/t1;", "androidx/compose/ui/layout/q1$a", "Landroidx/compose/ui/layout/q1$a;", "ReusedSlotId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,987:1\n25#2:988\n286#2,8:995\n294#2,2:1009\n1116#3,6:989\n3737#4,6:1003\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n77#1:988\n114#1:995,8\n114#1:1009,2\n77#1:989,6\n123#1:1003,6\n*E\n"})
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a f19076a = new a();

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/q1$a", "", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        a() {
        }

        @fg.l
        public String toString() {
            return "ReusedSlotId";
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f19077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ld.a aVar) {
            super(0);
            this.f19077b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.h0, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.h0 invoke() {
            return this.f19077b.invoke();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f19078b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<s1, androidx.compose.ui.unit.b, n0> f19079c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19080d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19081e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar, int i4, int i5) {
            super(2);
            this.f19078b = qVar;
            this.f19079c = pVar;
            this.f19080d = i4;
            this.f19081e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q1.a(this.f19078b, this.f19079c, tVar, g3.b(this.f19080d | 1), this.f19081e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r1 f19082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r1 r1Var) {
            super(0);
            this.f19082b = r1Var;
        }

        public final void a() {
            this.f19082b.d();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r1 f19083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f19084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<s1, androidx.compose.ui.unit.b, n0> f19085d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19086e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f19087f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(r1 r1Var, androidx.compose.ui.q qVar, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar, int i4, int i5) {
            super(2);
            this.f19083b = r1Var;
            this.f19084c = qVar;
            this.f19085d = pVar;
            this.f19086e = i4;
            this.f19087f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q1.b(this.f19083b, this.f19084c, this.f19085d, tVar, g3.b(this.f19086e | 1), this.f19087f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.l ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1298353104);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1298353104, i6, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)");
            }
            o4.P(-492369756);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new r1();
                o4.E(Q);
            }
            o4.p0();
            r1 r1Var = (r1) Q;
            int i10 = i6 << 3;
            b(r1Var, qVar, pVar, o4, (i10 & 112) | 8 | (i10 & 896), 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(qVar, pVar, i4, i5));
        }
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void b(@fg.l r1 r1Var, @fg.m androidx.compose.ui.q qVar, @fg.l ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        androidx.compose.runtime.t o4 = tVar.o(-511989831);
        if ((i5 & 2) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        androidx.compose.ui.q qVar2 = qVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-511989831, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)");
        }
        int j4 = androidx.compose.runtime.p.j(o4, 0);
        androidx.compose.runtime.z u4 = androidx.compose.runtime.p.u(o4, 0);
        androidx.compose.ui.q l4 = androidx.compose.ui.i.l(o4, qVar2);
        androidx.compose.runtime.g0 B = o4.B();
        androidx.compose.ui.node.h0.INSTANCE.getClass();
        ld.a aVar = androidx.compose.ui.node.h0.P;
        o4.P(1405779621);
        if (o4.s() == null) {
            androidx.compose.runtime.p.n();
        }
        o4.W();
        if (o4.getInserting()) {
            o4.F(new b(aVar));
        } else {
            o4.C();
        }
        m5.j(o4, r1Var, r1Var.g());
        m5.j(o4, u4, r1Var.e());
        m5.j(o4, pVar, r1Var.f());
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        m5.j(o4, B, companion.h());
        m5.j(o4, l4, companion.g());
        ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
        if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, o4, j4, b5);
        }
        o4.H();
        o4.p0();
        if (!o4.p()) {
            androidx.compose.runtime.a1.k(new d(r1Var), o4, 0);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e(r1Var, qVar2, pVar, i4, i5));
        }
    }

    @fg.l
    public static final t1 c(int i4) {
        return new i(i4);
    }
}
