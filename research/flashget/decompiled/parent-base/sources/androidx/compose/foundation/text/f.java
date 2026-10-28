package androidx.compose.foundation.text;

import androidx.compose.runtime.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ClickableText.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001av\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008c\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0019\u001a\u00020\u0006*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/text/v0;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "onClick", "b", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;ZIILld/l;Lld/l;Landroidx/compose/runtime/t;II)V", "onHover", "a", "(Landroidx/compose/ui/text/e;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;ZIILld/l;Lld/l;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/text/o;", "Li0/f;", "positionOffset", "e", "(Landroidx/compose/ui/text/o;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n25#2:197\n25#2:216\n25#2:227\n1116#3,6:198\n1116#3,6:204\n1116#3,6:210\n1116#3,6:217\n1116#3,3:228\n1119#3,3:234\n1116#3,6:238\n487#4,4:223\n491#4,2:231\n495#4:237\n487#5:233\n1#6:244\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:197\n157#1:216\n158#1:227\n80#1:198,6\n81#1:204,6\n96#1:210,6\n157#1:217,6\n158#1:228,3\n158#1:234,3\n187#1:238,6\n158#1:223,4\n158#1:231,2\n158#1:237\n158#1:233\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7324b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/n0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/n0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar) {
            super(1);
            this.f7325b = k2Var;
            this.f7326c = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
            this.f7325b.setValue(n0Var);
            this.f7326c.invoke(n0Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            a(n0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7327b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7328c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7329d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7330e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7331f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7332g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7333h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7334i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7335j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7336k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, boolean z4, int i4, int i5, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, ld.l<? super Integer, k2> lVar2, int i6, int i7) {
            super(2);
            this.f7327b = eVar;
            this.f7328c = qVar;
            this.f7329d = v0Var;
            this.f7330e = z4;
            this.f7331f = i4;
            this.f7332g = i5;
            this.f7333h = lVar;
            this.f7334i = lVar2;
            this.f7335j = i6;
            this.f7336k = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f.b(this.f7327b, this.f7328c, this.f7329d, this.f7330e, this.f7331f, this.f7332g, this.f7333h, this.f7334i, tVar, g3.b(this.f7335j | 1), this.f7336k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f7337b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/n0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/n0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7338b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar) {
            super(1);
            this.f7338b = k2Var;
            this.f7339c = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
            this.f7338b.setValue(n0Var);
            this.f7339c.invoke(n0Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            a(n0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$f, reason: collision with other inner class name */
    static final class C0134f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7340b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7341c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7342d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7343e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7344f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7345g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7346h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7347i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7348j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7349k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7350l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0134f(androidx.compose.ui.text.e eVar, ld.l<? super Integer, k2> lVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, boolean z4, int i4, int i5, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, ld.l<? super Integer, k2> lVar3, int i6, int i7) {
            super(2);
            this.f7340b = eVar;
            this.f7341c = lVar;
            this.f7342d = qVar;
            this.f7343e = v0Var;
            this.f7344f = z4;
            this.f7345g = i4;
            this.f7346h = i5;
            this.f7347i = lVar2;
            this.f7348j = lVar3;
            this.f7349k = i6;
            this.f7350l = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f.a(this.f7340b, this.f7341c, this.f7342d, this.f7343e, this.f7344f, this.f7345g, this.f7346h, this.f7347i, this.f7348j, tVar, g3.b(this.f7349k | 1), this.f7350l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7351b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f7352c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f7353d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7354e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7355f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7356g;

        /* compiled from: ClickableText.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", i = {}, l = {SyslogAppender.LOG_LOCAL5}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7357b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7358c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.l<Integer, k2> f7359d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7360e;

            /* compiled from: ClickableText.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "pos", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.f$g$a$a, reason: collision with other inner class name */
            static final class C0135a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ k1.h<Integer> f7361b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.l<Integer, k2> f7362c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7363d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0135a(k1.h<Integer> hVar, ld.l<? super Integer, k2> lVar, androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var) {
                    super(1);
                    this.f7361b = hVar;
                    this.f7362c = lVar;
                    this.f7363d = k2Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Integer, java.lang.Object] */
                public final void a(long j4) {
                    ?? c5 = f.c(this.f7363d, j4);
                    if (kotlin.jvm.internal.l0.g(this.f7361b.f75329b, c5)) {
                        return;
                    }
                    this.f7361b.f75329b = c5;
                    this.f7362c.invoke(c5);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
                    a(fVar.getPackedValue());
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.ui.input.pointer.k0 k0Var, ld.l<? super Integer, k2> lVar, androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f7358c = k0Var;
                this.f7359d = lVar;
                this.f7360e = k2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f7358c, this.f7359d, this.f7360e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f7357b;
                if (i4 == 0) {
                    k1.h a5 = androidx.compose.foundation.text.g.a(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f7358c;
                    androidx.compose.ui.input.pointer.r rVar = androidx.compose.ui.input.pointer.r.Main;
                    C0135a c0135a = new C0135a(a5, this.f7359d, this.f7360e);
                    this.f7357b = 1;
                    if (i0.a(k0Var, rVar, c0135a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: ClickableText.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "pos", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<Integer, k2> f7364b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7365c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.l<? super Integer, k2> lVar, androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var) {
                super(1);
                this.f7364b = lVar;
                this.f7365c = k2Var;
            }

            public final void a(long j4) {
                Integer c5 = f.c(this.f7365c, j4);
                if (c5 != null) {
                    this.f7364b.invoke(c5);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.r0 r0Var, ld.l<? super Integer, k2> lVar, androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, ld.l<? super Integer, k2> lVar2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f7353d = r0Var;
            this.f7354e = lVar;
            this.f7355f = k2Var;
            this.f7356g = lVar2;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f7353d, this.f7354e, this.f7355f, this.f7356g, dVar);
            gVar.f7352c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7351b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f7352c;
                kotlinx.coroutines.k.f(this.f7353d, null, null, new a(k0Var, this.f7354e, this.f7355f, null), 3, null);
                b bVar = new b(this.f7356g, this.f7355f);
                this.f7351b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, null, bVar, this, 7, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: ClickableText.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7366b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f7367c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7368d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, k2> f7369e;

        /* compiled from: ClickableText.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "pos", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.n0> f7370b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<Integer, k2> f7371c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, ld.l<? super Integer, k2> lVar) {
                super(1);
                this.f7370b = k2Var;
                this.f7371c = lVar;
            }

            public final void a(long j4) {
                androidx.compose.ui.text.n0 value = this.f7370b.getValue();
                if (value != null) {
                    this.f7371c.invoke(Integer.valueOf(value.x(j4)));
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, ld.l<? super Integer, k2> lVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f7368d = k2Var;
            this.f7369e = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((h) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f7368d, this.f7369e, dVar);
            hVar.f7367c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7366b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f7367c;
                a aVar2 = new a(this.f7368d, this.f7369e);
                this.f7366b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, null, aVar2, this, 7, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a8  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.text.e r25, @fg.l ld.l<? super java.lang.Integer, kotlin.k2> r26, @fg.m androidx.compose.ui.q r27, @fg.m androidx.compose.ui.text.v0 r28, boolean r29, int r30, int r31, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r32, @fg.l ld.l<? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.f.a(androidx.compose.ui.text.e, ld.l, androidx.compose.ui.q, androidx.compose.ui.text.v0, boolean, int, int, ld.l, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0087  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.ui.text.e r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.ui.text.v0 r26, boolean r27, int r28, int r29, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r30, @fg.l ld.l<? super java.lang.Integer, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.f.b(androidx.compose.ui.text.e, androidx.compose.ui.q, androidx.compose.ui.text.v0, boolean, int, int, ld.l, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer c(androidx.compose.runtime.k2<androidx.compose.ui.text.n0> k2Var, long j4) {
        androidx.compose.ui.text.o multiParagraph;
        androidx.compose.ui.text.n0 value = k2Var.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!e(multiParagraph, j4)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.A(j4));
        }
        return null;
    }

    private static final boolean e(androidx.compose.ui.text.o oVar, long j4) {
        float e4 = i0.f.e(j4);
        float r4 = i0.f.r(j4);
        return e4 > 0.0f && r4 >= 0.0f && e4 <= oVar.getWidth() && r4 <= oVar.getHeight();
    }
}
