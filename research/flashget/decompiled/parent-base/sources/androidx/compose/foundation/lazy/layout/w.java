package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.layout.s1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aL\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0010\u001a\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measurePolicy", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/layout/s;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/layout/d0;Lld/p;Landroidx/compose/runtime/t;II)V", "Lkotlin/Function0;", "b", "(Lld/a;Landroidx/compose/ui/q;Landroidx/compose/foundation/lazy/layout/d0;Lld/p;Landroidx/compose/runtime/t;II)V", "", "I", "MaxItemsToRetainForReuse", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n1116#2,6:159\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n54#1:159,6\n*E\n"})
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6138a = 7;

    /* compiled from: LazyLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "a", "()Landroidx/compose/foundation/lazy/layout/s;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f6139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(0);
            this.f6139b = sVar;
        }

        @fg.l
        public final s a() {
            return this.f6139b;
        }

        @Override // ld.a
        public s invoke() {
            return this.f6139b;
        }
    }

    /* compiled from: LazyLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f6140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6141c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f6142d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> f6143e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6144f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6145g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(s sVar, androidx.compose.ui.q qVar, d0 d0Var, ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar, int i4, int i5) {
            super(2);
            this.f6140b = sVar;
            this.f6141c = qVar;
            this.f6142d = d0Var;
            this.f6143e = pVar;
            this.f6144f = i4;
            this.f6145g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w.a(this.f6140b, this.f6141c, this.f6142d, this.f6143e, tVar, g3.b(this.f6144f | 1), this.f6145g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazyLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/f;", "saveableStateHolder", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n25#2:159\n25#2:166\n50#2:173\n49#2:174\n1116#3,6:160\n1116#3,6:167\n1116#3,6:175\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n*L\n82#1:159\n85#1:166\n99#1:173\n99#1:174\n82#1:160,6\n85#1:167,6\n99#1:175,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.runtime.saveable.f, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f6146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> f6148d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b5<ld.a<s>> f6149e;

        /* compiled from: LazyLayout.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f6150b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> f6151c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q qVar, ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar) {
                super(2);
                this.f6150b = qVar;
                this.f6151c = pVar;
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l s1 s1Var, long j4) {
                return this.f6151c.invoke(new y(this.f6150b, s1Var), androidx.compose.ui.unit.b.b(j4));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(s1 s1Var, androidx.compose.ui.unit.b bVar) {
                return a(s1Var, bVar.getValue());
            }
        }

        /* compiled from: LazyLayout.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "a", "()Landroidx/compose/foundation/lazy/layout/s;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<s> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<ld.a<s>> f6152b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(b5<? extends ld.a<? extends s>> b5Var) {
                super(0);
                this.f6152b = b5Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s invoke() {
                return this.f6152b.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d0 d0Var, androidx.compose.ui.q qVar, ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar, b5<? extends ld.a<? extends s>> b5Var) {
            super(3);
            this.f6146b = d0Var;
            this.f6147c = qVar;
            this.f6148d = pVar;
            this.f6149e = b5Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(androidx.compose.runtime.saveable.f fVar, androidx.compose.runtime.t tVar, Integer num) {
            a(fVar, tVar, num.intValue());
            return k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.runtime.saveable.f fVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1488997347, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
            }
            b5<ld.a<s>> b5Var = this.f6149e;
            tVar.P(-492369756);
            Object Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = new q(fVar, new b(b5Var));
                tVar.E(Q);
            }
            tVar.p0();
            q qVar = (q) Q;
            tVar.P(-492369756);
            Object Q2 = tVar.Q();
            if (Q2 == companion.a()) {
                Q2 = new androidx.compose.ui.layout.r1(new u(qVar));
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.layout.r1 r1Var = (androidx.compose.ui.layout.r1) Q2;
            d0 d0Var = this.f6146b;
            tVar.P(-1523807258);
            if (d0Var != null) {
                f0.a(this.f6146b, qVar, r1Var, tVar, (androidx.compose.ui.layout.r1.f19092f << 6) | 64);
                k2 k2Var = k2.f75408a;
            }
            tVar.p0();
            androidx.compose.ui.q qVar2 = this.f6147c;
            ld.p<x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> pVar = this.f6148d;
            tVar.P(511388516);
            boolean q02 = tVar.q0(qVar) | tVar.q0(pVar);
            Object Q3 = tVar.Q();
            if (q02 || Q3 == companion.a()) {
                Q3 = new a(qVar, pVar);
                tVar.E(Q3);
            }
            tVar.p0();
            q1.b(r1Var, qVar2, (ld.p) Q3, tVar, androidx.compose.ui.layout.r1.f19092f, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: LazyLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<s> f6153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f6154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d0 f6155d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<x, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> f6156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6157f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6158g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<? extends s> aVar, androidx.compose.ui.q qVar, d0 d0Var, ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar, int i4, int i5) {
            super(2);
            this.f6153b = aVar;
            this.f6154c = qVar;
            this.f6155d = d0Var;
            this.f6156e = pVar;
            this.f6157f = i4;
            this.f6158g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w.b(this.f6153b, this.f6154c, this.f6155d, this.f6156e, tVar, g3.b(this.f6157f | 1), this.f6158g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @kotlin.k(message = "Use an overload accepting a lambda prodicing an item provider instead", replaceWith = @x0(expression = "LazyLayout({ itemProvider }, modifier, prefetchState, measurePolicy)", imports = {}))
    @androidx.compose.runtime.i
    public static final void a(@fg.l s sVar, @fg.m androidx.compose.ui.q qVar, @fg.m d0 d0Var, @fg.l ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(852831187);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(sVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.q0(d0Var) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                d0Var = null;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(852831187, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            o4.P(-2142411538);
            boolean q02 = o4.q0(sVar);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(sVar);
                o4.E(Q);
            }
            o4.p0();
            b((ld.a) Q, qVar, d0Var, pVar, o4, i6 & 8176, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        d0 d0Var2 = d0Var;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(sVar, qVar2, d0Var2, pVar, i4, i5));
        }
    }

    @z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.l ld.a<? extends s> aVar, @fg.m androidx.compose.ui.q qVar, @fg.m d0 d0Var, @fg.l ld.p<? super x, ? super androidx.compose.ui.unit.b, ? extends androidx.compose.ui.layout.n0> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(2002163445);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.S(aVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.q0(d0Var) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                d0Var = null;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2002163445, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:77)");
            }
            j0.a(androidx.compose.runtime.internal.c.b(o4, -1488997347, true, new c(d0Var, qVar, pVar, o4.u(aVar, o4, i6 & 14))), o4, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        d0 d0Var2 = d0Var;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(aVar, qVar2, d0Var2, pVar, i4, i5));
        }
    }
}
