package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.y1;
import androidx.compose.animation.core.z2;
import androidx.compose.animation.m;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import androidx.compose.ui.layout.i1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000x\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¶\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182>\b\u0002\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0\u0011¢\u0006\u0004\b \u0010!\u001a\u001c\u0010%\u001a\u00020\u0006*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0006*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0087\u0004¢\u0006\u0004\b'\u0010&\u001a®\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"S", "targetState", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/k;", "Landroidx/compose/animation/x;", "Lkotlin/u;", "transitionSpec", "Landroidx/compose/ui/c;", "contentAlignment", "", "label", "Lkotlin/r0;", "name", "", "contentKey", "Lkotlin/Function2;", "Landroidx/compose/animation/i;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/q;Lld/l;Landroidx/compose/ui/c;Ljava/lang/String;Lld/l;Lld/r;Landroidx/compose/runtime/t;II)V", "", "clip", "Landroidx/compose/ui/unit/u;", "initialSize", "targetSize", "Landroidx/compose/animation/core/p0;", "sizeAnimationSpec", "Landroidx/compose/animation/w0;", "c", "(ZLld/p;)Landroidx/compose/animation/w0;", "Landroidx/compose/animation/f0;", "Landroidx/compose/animation/h0;", "exit", "e", "(Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;)Landroidx/compose/animation/x;", "f", "Landroidx/compose/animation/core/e2;", "a", "(Landroidx/compose/animation/core/e2;Landroidx/compose/ui/q;Lld/l;Landroidx/compose/ui/c;Lld/l;Lld/r;Landroidx/compose/runtime/t;II)V", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,831:1\n74#2:832\n36#3:833\n36#3:840\n36#3:847\n50#3:867\n49#3:868\n25#3:875\n456#3,8:893\n464#3,3:907\n467#3,3:916\n1116#4,6:834\n1116#4,6:841\n1116#4,6:848\n1116#4,6:869\n1116#4,6:876\n350#5,7:854\n33#6,6:861\n33#6,6:910\n79#7,11:882\n92#7:919\n3737#8,6:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n667#1:832\n668#1:833\n672#1:840\n673#1:847\n761#1:867\n761#1:868\n772#1:875\n763#1:893,8\n763#1:907,3\n763#1:916,3\n668#1:834,6\n672#1:841,6\n673#1:848,6\n761#1:869,6\n772#1:876,6\n699#1:854,7\n708#1:861,6\n766#1:910,6\n763#1:882,11\n763#1:919\n763#1:901,6\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<S> extends kotlin.jvm.internal.n0 implements ld.l<k<S>, x> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3125b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x invoke(@fg.l k<S> kVar) {
            return f.e(d0.q(androidx.compose.animation.core.l.r(220, 90, null, 4, null), 0.0f, 2, null).c(d0.w(androidx.compose.animation.core.l.r(220, 90, null, 4, null), 0.92f, 0L, 4, null)), d0.s(androidx.compose.animation.core.l.r(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<S> extends kotlin.jvm.internal.n0 implements ld.l<S, S> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3126b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        public final S invoke(S s4) {
            return s4;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f3127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<k<S>, x> f3129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.c f3130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f3131f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<S, Object> f3132g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.r<i, S, androidx.compose.runtime.t, Integer, k2> f3133h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3134i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3135j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(S s4, androidx.compose.ui.q qVar, ld.l<? super k<S>, x> lVar, androidx.compose.ui.c cVar, String str, ld.l<? super S, ? extends Object> lVar2, ld.r<? super i, ? super S, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, int i4, int i5) {
            super(2);
            this.f3127b = s4;
            this.f3128c = qVar;
            this.f3129d = lVar;
            this.f3130e = cVar;
            this.f3131f = str;
            this.f3132g = lVar2;
            this.f3133h = rVar;
            this.f3134i = i4;
            this.f3135j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f.b(this.f3127b, this.f3128c, this.f3129d, this.f3130e, this.f3131f, this.f3132g, this.f3133h, tVar, g3.b(this.f3134i | 1), this.f3135j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d<S> extends kotlin.jvm.internal.n0 implements ld.l<k<S>, x> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f3136b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x invoke(@fg.l k<S> kVar) {
            return f.e(d0.q(androidx.compose.animation.core.l.r(220, 90, null, 4, null), 0.0f, 2, null).c(d0.w(androidx.compose.animation.core.l.r(220, 90, null, 4, null), 0.92f, 0L, 4, null)), d0.s(androidx.compose.animation.core.l.r(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e<S> extends kotlin.jvm.internal.n0 implements ld.l<S, S> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f3137b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        public final S invoke(S s4) {
            return s4;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,831:1\n25#2:832\n36#2:839\n25#2:846\n1116#3,6:833\n1116#3,6:840\n1116#3,6:847\n1116#3,6:854\n1#4:853\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n*L\n710#1:832\n714#1:839\n721#1:846\n710#1:833,6\n714#1:840,6\n721#1:847,6\n739#1:854,6\n*E\n"})
    /* renamed from: androidx.compose.animation.f$f, reason: collision with other inner class name */
    static final class C0043f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f3138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f3139c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<k<S>, x> f3140d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<S> f3141e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.snapshots.b0<S> f3142f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.r<i, S, androidx.compose.runtime.t, Integer, k2> f3143g;

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"S", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.f$f$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f3144b;

            /* compiled from: AnimatedContent.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.animation.f$f$a$a, reason: collision with other inner class name */
            static final class C0044a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i1 f3145b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ x f3146c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0044a(i1 i1Var, x xVar) {
                    super(1);
                    this.f3145b = i1Var;
                    this.f3146c = xVar;
                }

                public final void a(@fg.l i1.a aVar) {
                    aVar.f(this.f3145b, 0, 0, this.f3146c.d());
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                    a(aVar);
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar) {
                super(3);
                this.f3144b = xVar;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
                return a(o0Var, l0Var, bVar.getValue());
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
                i1 m02 = l0Var.m0(j4);
                return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new C0044a(m02, this.f3144b), 4, null);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.f$f$b */
        static final class b<S> extends kotlin.jvm.internal.n0 implements ld.l<S, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S f3147b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S s4) {
                super(1);
                this.f3147b = s4;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S s4) {
                return Boolean.valueOf(kotlin.jvm.internal.l0.g(s4, this.f3147b));
            }
        }

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Landroidx/compose/animation/b0;", "currentState", "targetState", "", "a", "(Landroidx/compose/animation/b0;Landroidx/compose/animation/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.f$f$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<b0, b0, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f3148b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h0 h0Var) {
                super(2);
                this.f3148b = h0Var;
            }

            @Override // ld.p
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l b0 b0Var, @fg.l b0 b0Var2) {
                b0 b0Var3 = b0.PostExit;
                return Boolean.valueOf(b0Var == b0Var3 && b0Var2 == b0Var3 && !this.f3148b.getData().l());
            }
        }

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,831:1\n25#2:832\n1116#3,6:833\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5\n*L\n754#1:832\n754#1:833,6\n*E\n"})
        /* renamed from: androidx.compose.animation.f$f$d */
        static final class d extends kotlin.jvm.internal.n0 implements ld.q<s, androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m<S> f3149b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f3150c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.snapshots.b0<S> f3151d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.r<i, S, androidx.compose.runtime.t, Integer, k2> f3152e;

            /* compiled from: AnimatedContent.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,831:1\n64#2,5:832\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1\n*L\n747#1:832,5\n*E\n"})
            /* renamed from: androidx.compose.animation.f$f$d$a */
            static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.snapshots.b0<S> f3153b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ S f3154c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ m<S> f3155d;

                /* compiled from: Effects.kt */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1\n*L\n1#1,497:1\n748#2,3:498\n*E\n"})
                /* renamed from: androidx.compose.animation.f$f$d$a$a, reason: collision with other inner class name */
                public static final class C0045a implements androidx.compose.runtime.v0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.snapshots.b0 f3156a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Object f3157b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ m f3158c;

                    public C0045a(androidx.compose.runtime.snapshots.b0 b0Var, Object obj, m mVar) {
                        this.f3156a = b0Var;
                        this.f3157b = obj;
                        this.f3158c = mVar;
                    }

                    @Override // androidx.compose.runtime.v0
                    public void dispose() {
                        this.f3156a.remove(this.f3157b);
                        this.f3158c.v().remove(this.f3157b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(androidx.compose.runtime.snapshots.b0<S> b0Var, S s4, m<S> mVar) {
                    super(1);
                    this.f3153b = b0Var;
                    this.f3154c = s4;
                    this.f3155d = mVar;
                }

                @Override // ld.l
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
                    return new C0045a(this.f3153b, this.f3154c, this.f3155d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(m<S> mVar, S s4, androidx.compose.runtime.snapshots.b0<S> b0Var, ld.r<? super i, ? super S, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
                super(3);
                this.f3149b = mVar;
                this.f3150c = s4;
                this.f3151d = b0Var;
                this.f3152e = rVar;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ k2 R(s sVar, androidx.compose.runtime.t tVar, Integer num) {
                a(sVar, tVar, num.intValue());
                return k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 14) == 0) {
                    i4 |= tVar.q0(sVar) ? 4 : 2;
                }
                if ((i4 & 91) == 18 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-616195562, i4, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)");
                }
                androidx.compose.runtime.a1.c(sVar, new a(this.f3151d, this.f3150c, this.f3149b), tVar, i4 & 14);
                Map v4 = this.f3149b.v();
                S s4 = this.f3150c;
                kotlin.jvm.internal.l0.n(sVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                v4.put(s4, ((t) sVar).a());
                tVar.P(-492369756);
                Object Q = tVar.Q();
                if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new j(sVar);
                    tVar.E(Q);
                }
                tVar.p0();
                this.f3152e.i((j) Q, this.f3150c, tVar, 0);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0043f(e2<S> e2Var, S s4, ld.l<? super k<S>, x> lVar, m<S> mVar, androidx.compose.runtime.snapshots.b0<S> b0Var, ld.r<? super i, ? super S, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
            super(2);
            this.f3138b = e2Var;
            this.f3139c = s4;
            this.f3140d = lVar;
            this.f3141e = mVar;
            this.f3142f = b0Var;
            this.f3143g = rVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            Object initialContentExit;
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(885640742, i4, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
            }
            ld.l<k<S>, x> lVar = this.f3140d;
            k kVar = this.f3141e;
            tVar.P(-492369756);
            x Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = lVar.invoke(kVar);
                tVar.E(Q);
            }
            tVar.p0();
            x xVar = (x) Q;
            Object valueOf = Boolean.valueOf(kotlin.jvm.internal.l0.g(this.f3138b.m().f(), this.f3139c));
            e2<S> e2Var = this.f3138b;
            S s4 = this.f3139c;
            ld.l<k<S>, x> lVar2 = this.f3140d;
            k kVar2 = this.f3141e;
            tVar.P(1157296644);
            boolean q02 = tVar.q0(valueOf);
            Object Q2 = tVar.Q();
            if (q02 || Q2 == companion.a()) {
                if (kotlin.jvm.internal.l0.g(e2Var.m().f(), s4)) {
                    h0.INSTANCE.getClass();
                    initialContentExit = h0.f3180c;
                } else {
                    initialContentExit = lVar2.invoke(kVar2).getInitialContentExit();
                }
                Q2 = initialContentExit;
                tVar.E(Q2);
            }
            tVar.p0();
            h0 h0Var = (h0) Q2;
            S s5 = this.f3139c;
            e2<S> e2Var2 = this.f3138b;
            tVar.P(-492369756);
            Object Q3 = tVar.Q();
            if (Q3 == companion.a()) {
                Q3 = new m.a(kotlin.jvm.internal.l0.g(s5, e2Var2.o()));
                tVar.E(Q3);
            }
            tVar.p0();
            m.a aVar = (m.a) Q3;
            f0 targetContentEnter = xVar.getTargetContentEnter();
            androidx.compose.ui.q a5 = androidx.compose.ui.layout.d0.a(androidx.compose.ui.q.INSTANCE, new a(xVar));
            aVar.g(kotlin.jvm.internal.l0.g(this.f3139c, this.f3138b.o()));
            androidx.compose.ui.q w32 = a5.w3(aVar);
            e2<S> e2Var3 = this.f3138b;
            b bVar = new b(this.f3139c);
            tVar.P(664245165);
            boolean q03 = tVar.q0(h0Var);
            Object Q4 = tVar.Q();
            if (q03 || Q4 == companion.a()) {
                Q4 = new c(h0Var);
                tVar.E(Q4);
            }
            tVar.p0();
            q.a(e2Var3, bVar, w32, targetContentEnter, h0Var, (ld.p) Q4, null, androidx.compose.runtime.internal.c.b(tVar, -616195562, true, new d(this.f3141e, this.f3139c, this.f3142f, this.f3143g)), tVar, 12582912, 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<S> f3159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3160c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<k<S>, x> f3161d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.c f3162e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<S, Object> f3163f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.r<i, S, androidx.compose.runtime.t, Integer, k2> f3164g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3165h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3166i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(e2<S> e2Var, androidx.compose.ui.q qVar, ld.l<? super k<S>, x> lVar, androidx.compose.ui.c cVar, ld.l<? super S, ? extends Object> lVar2, ld.r<? super i, ? super S, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, int i4, int i5) {
            super(2);
            this.f3159b = e2Var;
            this.f3160c = qVar;
            this.f3161d = lVar;
            this.f3162e = cVar;
            this.f3163f = lVar2;
            this.f3164g = rVar;
            this.f3165h = i4;
            this.f3166i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f.a(this.f3159b, this.f3160c, this.f3161d, this.f3162e, this.f3163f, this.f3164g, tVar, g3.b(this.f3165h | 1), this.f3166i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/u;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Landroidx/compose/animation/core/y1;", "a", "(JJ)Landroidx/compose/animation/core/y1;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, y1<androidx.compose.ui.unit.u>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f3167b = new h(2);

        h() {
            super(2);
        }

        @fg.l
        public final y1<androidx.compose.ui.unit.u> a(long j4, long j5) {
            return androidx.compose.animation.core.l.p(0.0f, 400.0f, androidx.compose.ui.unit.u.b(z2.e(androidx.compose.ui.unit.u.INSTANCE)), 1, null);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ y1<androidx.compose.ui.unit.u> invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.u uVar2) {
            return a(uVar.getPackedValue(), uVar2.getPackedValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d A[LOOP:2: B:129:0x023b->B:130:0x023d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void a(@fg.l androidx.compose.animation.core.e2<S> r19, @fg.m androidx.compose.ui.q r20, @fg.m ld.l<? super androidx.compose.animation.k<S>, androidx.compose.animation.x> r21, @fg.m androidx.compose.ui.c r22, @fg.m ld.l<? super S, ? extends java.lang.Object> r23, @fg.l ld.r<? super androidx.compose.animation.i, ? super S, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.a(androidx.compose.animation.core.e2, androidx.compose.ui.q, ld.l, androidx.compose.ui.c, ld.l, ld.r, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0048  */
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void b(S r18, @fg.m androidx.compose.ui.q r19, @fg.m ld.l<? super androidx.compose.animation.k<S>, androidx.compose.animation.x> r20, @fg.m androidx.compose.ui.c r21, @fg.m java.lang.String r22, @fg.m ld.l<? super S, ? extends java.lang.Object> r23, @fg.l ld.r<? super androidx.compose.animation.i, ? super S, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.b(java.lang.Object, androidx.compose.ui.q, ld.l, androidx.compose.ui.c, java.lang.String, ld.l, ld.r, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    public static final w0 c(boolean z4, @fg.l ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, ? extends androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> pVar) {
        return new x0(z4, pVar);
    }

    public static w0 d(boolean z4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            pVar = h.f3167b;
        }
        return new x0(z4, pVar);
    }

    @fg.l
    public static final x e(@fg.l f0 f0Var, @fg.l h0 h0Var) {
        return new x(f0Var, h0Var, 0.0f, null, 12, null);
    }

    @fg.l
    @kotlin.k(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @kotlin.x0(expression = "togetherWith(exit)", imports = {}))
    @j0
    public static final x f(@fg.l f0 f0Var, @fg.l h0 h0Var) {
        return new x(f0Var, h0Var, 0.0f, null, 12, null);
    }
}
