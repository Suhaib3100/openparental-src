package androidx.compose.animation.core;

import androidx.compose.animation.core.y0;
import androidx.compose.animation.core.y0.a;
import androidx.compose.runtime.b5;
import kotlin.Metadata;

/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "label", "Landroidx/compose/animation/core/y0;", "f", "(Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/animation/core/y0;", "T", "Landroidx/compose/animation/core/s;", "V", "initialValue", "targetValue", "Landroidx/compose/animation/core/i2;", "typeConverter", "Landroidx/compose/animation/core/x0;", "animationSpec", "Landroidx/compose/runtime/b5;", "d", "(Landroidx/compose/animation/core/y0;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/x0;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "", "b", "(Landroidx/compose/animation/core/y0;FFLandroidx/compose/animation/core/x0;Ljava/lang/String;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "e", "(Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/y0;", "c", "(Landroidx/compose/animation/core/y0;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/x0;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "a", "(Landroidx/compose/animation/core/y0;FFLandroidx/compose/animation/core/x0;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n25#2:372\n1116#3,6:366\n1116#3,6:373\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365\n263#1:372\n46#1:366,6\n263#1:373,6\n*E\n"})
/* loaded from: classes.dex */
public final class z0 {

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f3038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0.a<T, V> f3039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f3040d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x0<T> f3041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t4, y0.a<T, V> aVar, T t5, x0<T> x0Var) {
            super(0);
            this.f3038b = t4;
            this.f3039c = aVar;
            this.f3040d = t5;
            this.f3041e = x0Var;
        }

        public final void a() {
            if (kotlin.jvm.internal.l0.g(this.f3038b, this.f3039c.l()) && kotlin.jvm.internal.l0.g(this.f3040d, this.f3039c.q())) {
                return;
            }
            this.f3039c.S(this.f3038b, this.f3040d, this.f3041e);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n64#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n283#1:365,5\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f3042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0.a<T, V> f3043c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n1#1,497:1\n284#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y0 f3044a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0.a f3045b;

            public a(y0 y0Var, y0.a aVar) {
                this.f3044a = y0Var;
                this.f3045b = aVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f3044a.l(this.f3045b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, y0.a<T, V> aVar) {
            super(1);
            this.f3042b = y0Var;
            this.f3043c = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            this.f3042b.f(this.f3043c);
            return new a(this.f3042b, this.f3043c);
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 a(y0 y0Var, float f4, float f5, x0 x0Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(469472752);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(469472752, i4, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        b5<Float> b5 = b(y0Var, f4, f5, x0Var, "FloatAnimation", tVar, (i4 & 112) | 24584 | (i4 & 896) | (i4 & 7168), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<Float> b(@fg.l y0 y0Var, float f4, float f5, @fg.l x0<Float> x0Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-644770905);
        String str2 = (i5 & 8) != 0 ? "FloatAnimation" : str;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-644770905, i4, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i6 = i4 << 3;
        b5<Float> d5 = d(y0Var, Float.valueOf(f4), Float.valueOf(f5), k2.i(kotlin.jvm.internal.a0.f75283a), x0Var, str2, tVar, (i4 & 112) | 8 | (i4 & 896) | (57344 & i6) | (i6 & 458752), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ b5 c(y0 y0Var, Object obj, Object obj2, i2 i2Var, x0 x0Var, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1695411770);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1695411770, i4, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:337)");
        }
        int i5 = (i4 >> 3) & 8;
        b5 d5 = d(y0Var, obj, obj2, i2Var, x0Var, "ValueAnimation", tVar, (i5 << 6) | (i5 << 3) | 196616 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d5;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T, V extends s> b5<T> d(@fg.l y0 y0Var, T t4, T t5, @fg.l i2<T, V> i2Var, @fg.l x0<T> x0Var, @fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1062847727);
        String str2 = (i5 & 16) != 0 ? "ValueAnimation" : str;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1062847727, i4, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = y0Var.new a(t4, t5, i2Var, x0Var, str2);
            tVar.E(Q);
        }
        tVar.p0();
        y0.a aVar = (y0.a) Q;
        androidx.compose.runtime.a1.k(new a(t4, aVar, t5, x0Var), tVar, 0);
        androidx.compose.runtime.a1.c(aVar, new b(y0Var, aVar), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ y0 e(androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-840193660);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-840193660, i4, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        y0 f4 = f("InfiniteTransition", tVar, 6, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return f4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final y0 f(@fg.m String str, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1013651573);
        if ((i5 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1013651573, i4, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new y0(str);
            tVar.E(Q);
        }
        tVar.p0();
        y0 y0Var = (y0) Q;
        y0Var.m(tVar, 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return y0Var;
    }
}
