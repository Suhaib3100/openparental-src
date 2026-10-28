package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composables.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0013\b\u0004\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a^\u0010(\u001a\u00020\u0019\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&H\u0087\b¢\u0006\u0004\b(\u0010)\u001a^\u0010*\u001a\u00020\u0019\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&H\u0087\b¢\u0006\u0004\b*\u0010)\u001am\u0010+\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b+\u0010,\u001am\u0010-\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b-\u0010,\u001a\u0093\u0001\u00100\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2$\b\b\u0010/\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0014¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b0\u00101\u001a\u0093\u0001\u00102\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2$\b\b\u0010/\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0014¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0004\b2\u00101\u001a\u000f\u00103\u001a\u00020\u0019H\u0001¢\u0006\u0004\b3\u00104\u001a\u000f\u00106\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107\"\u0011\u0010;\u001a\u0002088G¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0017\u0010D\u001a\u00020@8G¢\u0006\f\u0012\u0004\bC\u00104\u001a\u0004\bA\u0010B\"\u0011\u0010H\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/t0;", "calculation", "s", "(Lld/a;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "", "key1", "r", "(Ljava/lang/Object;Lld/a;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "key2", "q", "(Ljava/lang/Object;Ljava/lang/Object;Lld/a;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "key3", "p", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/a;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "", "keys", "t", "([Ljava/lang/Object;Lld/a;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "Landroidx/compose/runtime/i;", "block", "o", "([Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Ljava/lang/Object;", "key", "Lkotlin/k2;", "content", "g", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "", "active", "h", "(ZLld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/e;", "E", "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/m5;", "Lkotlin/u;", "update", "a", "(Lld/a;Lld/l;Landroidx/compose/runtime/t;I)V", "d", "b", "(Lld/a;Lld/l;Lld/p;Landroidx/compose/runtime/t;I)V", "e", "Landroidx/compose/runtime/v3;", "skippableUpdate", "c", "(Lld/a;Lld/l;Lld/q;Lld/p;Landroidx/compose/runtime/t;I)V", "f", "n", "()V", "Landroidx/compose/runtime/z;", "u", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/t;", "i", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/t;", "currentComposer", "Landroidx/compose/runtime/e3;", "m", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/e3;", "currentRecomposeScope", "Landroidx/compose/runtime/e0;", "k", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/e0;", "l", "currentCompositionLocalContext", "", "j", "(Landroidx/compose/runtime/t;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1116#2,6:485\n1116#2,6:491\n1116#2,6:497\n1116#2,6:503\n1116#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a<T> extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<T> f16866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.a<? extends T> aVar) {
            super(0);
            this.f16866b = aVar;
        }

        @Override // ld.a
        @fg.l
        public final T invoke() {
            return this.f16866b.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class b<T> extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<T> f16867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.a<? extends T> aVar) {
            super(0);
            this.f16867b = aVar;
        }

        @Override // ld.a
        @fg.l
        public final T invoke() {
            return this.f16867b.invoke();
        }
    }

    @i
    public static final <T, E extends e<?>> void a(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, t tVar, int i4) {
        tVar.P(1886828752);
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.v();
        if (tVar.l()) {
            tVar.F(new a(aVar));
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        tVar.H();
        tVar.p0();
    }

    @j(scheme = "[0[0]]")
    @i
    public static final <T, E extends e<?>> void b(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, ld.p<? super t, ? super Integer, kotlin.k2> pVar, t tVar, int i4) {
        tVar.P(-548224868);
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.v();
        if (tVar.l()) {
            tVar.F(aVar);
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        pVar.invoke(tVar, Integer.valueOf((i4 >> 6) & 14));
        tVar.H();
        tVar.p0();
    }

    @j(scheme = "[0[0][0]]")
    @i
    public static final <T, E extends e<?>> void c(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, ld.q<? super v3<T>, ? super t, ? super Integer, kotlin.k2> qVar, ld.p<? super t, ? super Integer, kotlin.k2> pVar, t tVar, int i4) {
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.v();
        if (tVar.l()) {
            tVar.F(aVar);
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        androidx.compose.animation.e.a((i4 >> 3) & 112, qVar, v3.a(tVar), tVar, 2058660585);
        pVar.invoke(tVar, Integer.valueOf((i4 >> 9) & 14));
        tVar.p0();
        tVar.H();
    }

    @i
    public static final <T, E extends e<?>> void d(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, t tVar, int i4) {
        tVar.P(1405779621);
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.W();
        if (tVar.l()) {
            tVar.F(new b(aVar));
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        tVar.H();
        tVar.p0();
    }

    @j(scheme = "[0[0]]")
    @i
    public static final <T, E extends e<?>> void e(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, ld.p<? super t, ? super Integer, kotlin.k2> pVar, t tVar, int i4) {
        tVar.P(-692256719);
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.W();
        if (tVar.l()) {
            tVar.F(aVar);
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        pVar.invoke(tVar, Integer.valueOf((i4 >> 6) & 14));
        tVar.H();
        tVar.p0();
    }

    @j(scheme = "[0[0][0]]")
    @i
    public static final <T, E extends e<?>> void f(ld.a<? extends T> aVar, ld.l<? super m5<T>, kotlin.k2> lVar, ld.q<? super v3<T>, ? super t, ? super Integer, kotlin.k2> qVar, ld.p<? super t, ? super Integer, kotlin.k2> pVar, t tVar, int i4) {
        e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.P();
        if (s4 == null) {
            n();
        }
        tVar.W();
        if (tVar.l()) {
            tVar.F(aVar);
        } else {
            tVar.C();
        }
        lVar.invoke(m5.a(tVar));
        androidx.compose.animation.e.a((i4 >> 3) & 112, qVar, v3.a(tVar), tVar, 2058660585);
        pVar.invoke(tVar, Integer.valueOf((i4 >> 9) & 14));
        tVar.p0();
        tVar.H();
    }

    @i
    public static final void g(@fg.m Object obj, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar, @fg.m t tVar, int i4) {
        tVar.P(444418301);
        tVar.Z(207, obj);
        pVar.invoke(tVar, Integer.valueOf((i4 >> 3) & 14));
        tVar.O();
        tVar.p0();
    }

    @j(scheme = "[0[0]]")
    @i
    public static final void h(boolean z4, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar, @fg.m t tVar, int i4) {
        tVar.Z(207, Boolean.valueOf(z4));
        boolean b5 = tVar.b(z4);
        if (z4) {
            pVar.invoke(tVar, Integer.valueOf((i4 >> 3) & 14));
        } else {
            tVar.m(b5);
        }
        tVar.O();
    }

    @d3
    @fg.l
    @i
    @kd.i(name = "getCurrentComposer")
    public static final t i(@fg.m t tVar, int i4) {
        if (x.b0()) {
            x.r0(-554250212, i4, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new kotlin.g0("Implemented as an intrinsic");
    }

    @i
    @kd.i(name = "getCurrentCompositeKeyHash")
    public static final int j(@fg.m t tVar, int i4) {
        if (x.b0()) {
            x.r0(524444915, i4, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int l02 = tVar.l0();
        if (x.b0()) {
            x.q0();
        }
        return l02;
    }

    @fg.l
    @i
    @kd.i(name = "getCurrentCompositionLocalContext")
    public static final e0 k(@fg.m t tVar, int i4) {
        tVar.P(-43352356);
        if (x.b0()) {
            x.r0(-43352356, i4, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        e0 e0Var = new e0(tVar.m0().f());
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return e0Var;
    }

    public static /* synthetic */ void l() {
    }

    @d3
    @fg.l
    @i
    @kd.i(name = "getCurrentRecomposeScope")
    public static final e3 m(@fg.m t tVar, int i4) {
        if (x.b0()) {
            x.r0(394957799, i4, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        e3 N = tVar.N();
        if (N == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        tVar.j0(N);
        if (x.b0()) {
            x.q0();
        }
        return N;
    }

    @kotlin.w0
    public static final void n() {
        throw new IllegalStateException("Invalid applier");
    }

    @j(scheme = "[0[0]]")
    @i
    public static final <T> T o(@fg.l Object[] objArr, @fg.l ld.p<? super t, ? super Integer, ? extends T> pVar, @fg.m t tVar, int i4) {
        tVar.P(-11941951);
        T invoke = pVar.invoke(tVar, Integer.valueOf((i4 >> 3) & 14));
        tVar.p0();
        return invoke;
    }

    @i
    public static final <T> T p(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4) {
        tVar.P(1618982084);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2) | tVar.q0(obj3);
        T t4 = (T) tVar.Q();
        if (q02 || t4 == t.INSTANCE.a()) {
            t4 = aVar.invoke();
            tVar.E(t4);
        }
        tVar.p0();
        return t4;
    }

    @i
    public static final <T> T q(@fg.m Object obj, @fg.m Object obj2, @fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4) {
        tVar.P(511388516);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2);
        T t4 = (T) tVar.Q();
        if (q02 || t4 == t.INSTANCE.a()) {
            t4 = aVar.invoke();
            tVar.E(t4);
        }
        tVar.p0();
        return t4;
    }

    @i
    public static final <T> T r(@fg.m Object obj, @fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4) {
        tVar.P(1157296644);
        boolean q02 = tVar.q0(obj);
        T t4 = (T) tVar.Q();
        if (q02 || t4 == t.INSTANCE.a()) {
            t4 = aVar.invoke();
            tVar.E(t4);
        }
        tVar.p0();
        return t4;
    }

    @i
    public static final <T> T s(@fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4) {
        tVar.P(-492369756);
        T t4 = (T) tVar.Q();
        if (t4 == t.INSTANCE.a()) {
            t4 = aVar.invoke();
            tVar.E(t4);
        }
        tVar.p0();
        return t4;
    }

    @i
    public static final <T> T t(@fg.l Object[] objArr, @fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4) {
        tVar.P(-568225417);
        boolean z4 = false;
        for (Object obj : objArr) {
            z4 |= tVar.q0(obj);
        }
        T t4 = (T) tVar.Q();
        if (z4 || t4 == t.INSTANCE.a()) {
            t4 = aVar.invoke();
            tVar.E(t4);
        }
        tVar.p0();
        return t4;
    }

    @fg.l
    @i
    public static final z u(@fg.m t tVar, int i4) {
        tVar.P(-1165786124);
        if (x.b0()) {
            x.r0(-1165786124, i4, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        z m02 = tVar.m0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return m02;
    }
}
