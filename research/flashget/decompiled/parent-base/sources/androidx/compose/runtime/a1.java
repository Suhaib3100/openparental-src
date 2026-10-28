package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.coroutines.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a<\u0010\u0010\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0013\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0017\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0015\"\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a8\u0010\u001d\u001a\u00020\u00012'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aB\u0010\u001f\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aL\u0010!\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b!\u0010\"\u001aV\u0010#\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b#\u0010$\u001aP\u0010%\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0015\"\u0004\u0018\u00010\u000b2'\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010+\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,\u001a%\u0010/\u001a\u00020\u001a2\u0013\b\u0006\u0010.\u001a\r\u0012\u0004\u0012\u00020'0\u0000¢\u0006\u0002\b-H\u0087\b¢\u0006\u0004\b/\u00100\"\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101\"\u0014\u00105\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u00104\"\u0014\u00106\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u00104¨\u00067"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "effect", "k", "(Lld/a;Landroidx/compose/runtime/t;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "Lkotlin/u;", "d", "(Lld/l;Landroidx/compose/runtime/t;I)V", "", "key1", "c", "(Ljava/lang/Object;Lld/l;Landroidx/compose/runtime/t;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lld/l;Landroidx/compose/runtime/t;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/l;Landroidx/compose/runtime/t;I)V", "", "keys", "e", "([Ljava/lang/Object;Lld/l;Landroidx/compose/runtime/t;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "block", "i", "(Lld/p;Landroidx/compose/runtime/t;I)V", "h", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "g", "(Ljava/lang/Object;Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "j", "([Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/compose/runtime/t;", "composer", "m", "(Lkotlin/coroutines/g;Landroidx/compose/runtime/t;)Lkotlinx/coroutines/r0;", "Landroidx/compose/runtime/t0;", "getContext", "n", "(Lld/a;Landroidx/compose/runtime/t;II)Lkotlinx/coroutines/r0;", "Landroidx/compose/runtime/w0;", "InternalDisposableEffectScope", "", "Ljava/lang/String;", "DisposableEffectNoParamError", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,497:1\n36#2:498\n50#2:505\n49#2:506\n67#2,3:513\n66#2:516\n83#2,3:523\n36#2:532\n50#2:539\n49#2:540\n67#2,3:547\n66#2:550\n83#2,3:557\n25#2:566\n1116#3,6:499\n1116#3,6:507\n1116#3,6:517\n1116#3,6:526\n1116#3,6:533\n1116#3,6:541\n1116#3,6:551\n1116#3,6:560\n1116#3,6:567\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n157#1:498\n197#1:505\n197#1:506\n238#1:513,3\n238#1:516\n278#1:523,3\n340#1:532\n363#1:539\n363#1:540\n387#1:547,3\n387#1:550\n420#1:557,3\n490#1:566\n157#1:499,6\n197#1:507,6\n238#1:517,6\n278#1:526,6\n340#1:533,6\n363#1:541,6\n387#1:551,6\n420#1:560,6\n490#1:567,6\n*E\n"})
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f15901b = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f15902c = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final w0 f15900a = new w0();

    /* compiled from: Effects.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> f15903b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, int i4) {
            super(2);
            this.f15903b = pVar;
            this.f15904c = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            a1.i(this.f15903b, tVar, g3.b(this.f15904c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Effects.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,497:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.coroutines.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15905b = new b(0);

        public b() {
            super(0);
        }

        @fg.l
        public final kotlin.coroutines.i a() {
            return kotlin.coroutines.i.f75057b;
        }

        @Override // ld.a
        public kotlin.coroutines.i invoke() {
            return kotlin.coroutines.i.f75057b;
        }
    }

    @i
    public static final void a(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.l<? super w0, ? extends v0> lVar, @fg.m t tVar, int i4) {
        tVar.P(-1239538271);
        if (x.b0()) {
            x.r0(-1239538271, i4, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        tVar.P(1618982084);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2) | tVar.q0(obj3);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new u0(lVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void b(@fg.m Object obj, @fg.m Object obj2, @fg.l ld.l<? super w0, ? extends v0> lVar, @fg.m t tVar, int i4) {
        tVar.P(1429097729);
        if (x.b0()) {
            x.r0(1429097729, i4, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        tVar.P(511388516);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new u0(lVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void c(@fg.m Object obj, @fg.l ld.l<? super w0, ? extends v0> lVar, @fg.m t tVar, int i4) {
        tVar.P(-1371986847);
        if (x.b0()) {
            x.r0(-1371986847, i4, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(obj);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new u0(lVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    @i
    public static final void d(@fg.l ld.l<? super w0, ? extends v0> lVar, @fg.m t tVar, int i4) {
        tVar.P(-904483903);
        if (x.b0()) {
            x.r0(-904483903, i4, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException("DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    @i
    public static final void e(@fg.l Object[] objArr, @fg.l ld.l<? super w0, ? extends v0> lVar, @fg.m t tVar, int i4) {
        tVar.P(-1307627122);
        if (x.b0()) {
            x.r0(-1307627122, i4, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        tVar.P(-568225417);
        boolean z4 = false;
        for (Object obj : copyOf) {
            z4 |= tVar.q0(obj);
        }
        Object Q = tVar.Q();
        if (z4 || Q == t.INSTANCE.a()) {
            tVar.E(new u0(lVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void f(@fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(-54093371);
        if (x.b0()) {
            x.r0(-54093371, i4, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        kotlin.coroutines.g A = tVar.A();
        tVar.P(1618982084);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2) | tVar.q0(obj3);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new w1(A, pVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void g(@fg.m Object obj, @fg.m Object obj2, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(590241125);
        if (x.b0()) {
            x.r0(590241125, i4, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        kotlin.coroutines.g A = tVar.A();
        tVar.P(511388516);
        boolean q02 = tVar.q0(obj) | tVar.q0(obj2);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new w1(A, pVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void h(@fg.m Object obj, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(1179185413);
        if (x.b0()) {
            x.r0(1179185413, i4, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        kotlin.coroutines.g A = tVar.A();
        tVar.P(1157296644);
        boolean q02 = tVar.q0(obj);
        Object Q = tVar.Q();
        if (q02 || Q == t.INSTANCE.a()) {
            tVar.E(new w1(A, pVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    @i
    public static final void i(@fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        t o4 = tVar.o(-805415771);
        if ((i4 & 1) != 0 || !o4.p()) {
            if (x.b0()) {
                x.r0(-805415771, i4, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
            }
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
        }
        o4.d0();
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(pVar, i4));
        }
    }

    @i
    public static final void j(@fg.l Object[] objArr, @fg.l ld.p<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(-139560008);
        if (x.b0()) {
            x.r0(-139560008, i4, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        kotlin.coroutines.g A = tVar.A();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        tVar.P(-568225417);
        boolean z4 = false;
        for (Object obj : copyOf) {
            z4 |= tVar.q0(obj);
        }
        Object Q = tVar.Q();
        if (z4 || Q == t.INSTANCE.a()) {
            tVar.E(new w1(A, pVar));
        }
        tVar.p0();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
    }

    @i
    public static final void k(@fg.l ld.a<kotlin.k2> aVar, @fg.m t tVar, int i4) {
        if (x.b0()) {
            x.r0(-1288466761, i4, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        tVar.r(aVar);
        if (x.b0()) {
            x.q0();
        }
    }

    @fg.l
    @kotlin.w0
    public static final kotlinx.coroutines.r0 m(@fg.l kotlin.coroutines.g gVar, @fg.l t tVar) {
        kotlinx.coroutines.b0 c5;
        k2.Companion companion = kotlinx.coroutines.k2.INSTANCE;
        if (gVar.c(companion) == null) {
            kotlin.coroutines.g A = tVar.A();
            return kotlinx.coroutines.s0.a(A.O(new kotlinx.coroutines.m2((kotlinx.coroutines.k2) A.c(companion))).O(gVar));
        }
        c5 = kotlinx.coroutines.p2.c(null, 1, null);
        c5.e(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return kotlinx.coroutines.s0.a(c5);
    }

    @fg.l
    @i
    public static final kotlinx.coroutines.r0 n(@fg.m ld.a<? extends kotlin.coroutines.g> aVar, @fg.m t tVar, int i4, int i5) {
        tVar.P(773894976);
        if ((i5 & 1) != 0) {
            aVar = b.f15905b;
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = new j0(m(aVar.invoke(), tVar));
            tVar.E(Q);
        }
        tVar.p0();
        kotlinx.coroutines.r0 coroutineScope = ((j0) Q).getCoroutineScope();
        tVar.p0();
        return coroutineScope;
    }
}
