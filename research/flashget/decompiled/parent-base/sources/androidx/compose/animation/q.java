package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h1;
import androidx.compose.foundation.layout.x1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y2;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0013\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u0016\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ac\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\f*\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\u001e\u001a\u00020\f*\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001ao\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\"\u0010#\u001aL\u0010&\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00002\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\f0%¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b&\u0010'\u001am\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b)\u0010*\u001a\u0093\u0001\u00100\u001a\u00020\f\"\u0004\b\u0000\u0010 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00000+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b0\u00101\u001a;\u00103\u001a\u00020,\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u00102\u001a\u00028\u0000H\u0003¢\u0006\u0004\b3\u00104\"\u001e\u00107\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020,0!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:²\u0006$\u00108\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00000+\"\u0004\b\u0000\u0010 8\nX\u008a\u0084\u0002²\u0006\u0012\u00109\u001a\u00020\u0000\"\u0004\b\u0000\u0010 8\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/animation/f0;", "enter", "Landroidx/compose/animation/h0;", "exit", "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/s;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "j", "(ZLandroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/x1;", "i", "(Landroidx/compose/foundation/layout/x1;ZLandroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/u;", "g", "(Landroidx/compose/foundation/layout/u;ZLandroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/animation/core/h1;", "visibleState", "d", "(Landroidx/compose/animation/core/h1;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "h", "(Landroidx/compose/foundation/layout/x1;Landroidx/compose/animation/core/h1;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "f", "(Landroidx/compose/foundation/layout/u;Landroidx/compose/animation/core/h1;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "T", "Landroidx/compose/animation/core/e2;", "e", "(Landroidx/compose/animation/core/e2;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Lld/q;Landroidx/compose/runtime/t;II)V", "initiallyVisible", "Lkotlin/Function0;", "k", "(ZLandroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;ZLld/p;Landroidx/compose/runtime/t;II)V", "transition", "l", "(Landroidx/compose/animation/core/e2;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Lld/q;Landroidx/compose/runtime/t;I)V", "Lkotlin/Function2;", "Landroidx/compose/animation/b0;", "shouldDisposeBlock", "Landroidx/compose/animation/r0;", "onLookaheadMeasured", "a", "(Landroidx/compose/animation/core/e2;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Lld/p;Landroidx/compose/animation/r0;Lld/q;Landroidx/compose/runtime/t;II)V", "targetState", "p", "(Landroidx/compose/animation/core/e2;Lld/l;Ljava/lang/Object;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/b0;", "o", "(Landroidx/compose/animation/core/e2;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,919:1\n25#2:920\n36#2:935\n36#2:951\n25#2:958\n456#2,8:976\n464#2,6:990\n25#2:997\n1116#3,6:921\n1116#3,6:928\n1116#3,6:936\n1116#3,6:945\n1116#3,6:952\n1116#3,6:959\n1116#3,6:998\n1#4:927\n1011#5:934\n1012#5,3:942\n79#6,11:965\n92#6:996\n3737#7,6:984\n81#8:1004\n81#8:1005\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n716#1:920\n789#1:935\n816#1:951\n834#1:958\n817#1:976,8\n817#1:990,6\n903#1:997\n716#1:921,6\n744#1:928,6\n789#1:936,6\n800#1:945,6\n816#1:952,6\n834#1:959,6\n903#1:998,6\n789#1:934\n789#1:942,3\n817#1:965,11\n817#1:996\n817#1:984,6\n793#1:1004\n795#1:1005\n*E\n"})
/* loaded from: classes.dex */
public final class q {

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f3244b;

        /* compiled from: AnimatedVisibility.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.q$a$a, reason: collision with other inner class name */
        static final class C0048a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1 f3245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0048a(i1 i1Var) {
                super(1);
                this.f3245b = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f3245b, 0, 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r0 r0Var) {
            super(3);
            this.f3244b = r0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            i1 m02 = l0Var.m0(j4);
            r0 r0Var = this.f3244b;
            if (o0Var.E1()) {
                r0Var.a(androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight()));
            }
            return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new C0048a(m02), 4, null);
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Boolean> f3247c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3248d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3249e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3250f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<b0, b0, Boolean> f3251g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ r0 f3252h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3253i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3254j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f3255k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e2<T> e2Var, ld.l<? super T, Boolean> lVar, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, ld.p<? super b0, ? super b0, Boolean> pVar, r0 r0Var, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3246b = e2Var;
            this.f3247c = lVar;
            this.f3248d = qVar;
            this.f3249e = f0Var;
            this.f3250f = h0Var;
            this.f3251g = pVar;
            this.f3252h = r0Var;
            this.f3253i = qVar2;
            this.f3254j = i4;
            this.f3255k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.a(this.f3246b, this.f3247c, this.f3248d, this.f3249e, this.f3250f, this.f3251g, this.f3252h, this.f3253i, tVar, g3.b(this.f3254j | 1), this.f3255k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {803}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/runtime/y2;", "", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/runtime/y2;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<y2<Boolean>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3256b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e2<b0> f3258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b5<ld.p<b0, b0, Boolean>> f3259e;

        /* compiled from: AnimatedVisibility.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e2<b0> f3260b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e2<b0> e2Var) {
                super(0);
                this.f3260b = e2Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(q.o(this.f3260b));
            }
        }

        /* compiled from: AnimatedVisibility.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "a", "(ZLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y2<Boolean> f3261b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e2<b0> f3262c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b5<ld.p<b0, b0, Boolean>> f3263d;

            /* JADX WARN: Multi-variable type inference failed */
            b(y2<Boolean> y2Var, e2<b0> e2Var, b5<? extends ld.p<? super b0, ? super b0, Boolean>> b5Var) {
                this.f3261b = y2Var;
                this.f3262c = e2Var;
                this.f3263d = b5Var;
            }

            @fg.m
            public final Object a(boolean z4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                this.f3261b.setValue(Boolean.valueOf(z4 ? ((Boolean) this.f3263d.getValue().invoke(this.f3262c.h(), this.f3262c.o())).booleanValue() : false));
                return k2.f75408a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e2<b0> e2Var, b5<? extends ld.p<? super b0, ? super b0, Boolean>> b5Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f3258d = e2Var;
            this.f3259e = b5Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l y2<Boolean> y2Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(y2Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f3258d, this.f3259e, dVar);
            cVar.f3257c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3256b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                y2 y2Var = (y2) this.f3257c;
                kotlinx.coroutines.flow.i w4 = o4.w(new a(this.f3258d));
                b bVar = new b(y2Var, this.f3258d, this.f3259e);
                this.f3256b = 1;
                if (w4.a(bVar, this) == aVar) {
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

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x1 f3264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1<Boolean> f3265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3266d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3267e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f3269g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3270h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3271i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3272j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(x1 x1Var, h1<Boolean> h1Var, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3264b = x1Var;
            this.f3265c = h1Var;
            this.f3266d = qVar;
            this.f3267e = f0Var;
            this.f3268f = h0Var;
            this.f3269g = str;
            this.f3270h = qVar2;
            this.f3271i = i4;
            this.f3272j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.h(this.f3264b, this.f3265c, this.f3266d, this.f3267e, this.f3268f, this.f3269g, this.f3270h, tVar, g3.b(this.f3271i | 1), this.f3272j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f3273b = new e(1);

        e() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.u f3274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1<Boolean> f3275c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3276d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3277e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f3279g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3280h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3281i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3282j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.foundation.layout.u uVar, h1<Boolean> h1Var, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3274b = uVar;
            this.f3275c = h1Var;
            this.f3276d = qVar;
            this.f3277e = f0Var;
            this.f3278f = h0Var;
            this.f3279g = str;
            this.f3280h = qVar2;
            this.f3281i = i4;
            this.f3282j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.f(this.f3274b, this.f3275c, this.f3276d, this.f3277e, this.f3278f, this.f3279g, this.f3280h, tVar, g3.b(this.f3281i | 1), this.f3282j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Boolean> f3284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3286e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3288g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3289h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3290i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(e2<T> e2Var, ld.l<? super T, Boolean> lVar, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3283b = e2Var;
            this.f3284c = lVar;
            this.f3285d = qVar;
            this.f3286e = f0Var;
            this.f3287f = h0Var;
            this.f3288g = qVar2;
            this.f3289h = i4;
            this.f3290i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.e(this.f3283b, this.f3284c, this.f3285d, this.f3286e, this.f3287f, this.f3288g, tVar, g3.b(this.f3289h | 1), this.f3290i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f3291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(3);
            this.f3291b = pVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(androidx.compose.animation.s sVar, androidx.compose.runtime.t tVar, Integer num) {
            a(sVar, tVar, num.intValue());
            return k2.f75408a;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.animation.s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 81) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1996320812, i4, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:721)");
            }
            if (androidx.compose.animation.r.a(0, this.f3291b, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f3294d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f3295e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3296f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f3297g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3298h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3299i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(boolean z4, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f3292b = z4;
            this.f3293c = qVar;
            this.f3294d = f0Var;
            this.f3295e = h0Var;
            this.f3296f = z5;
            this.f3297g = pVar;
            this.f3298h = i4;
            this.f3299i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.k(this.f3292b, this.f3293c, this.f3294d, this.f3295e, this.f3296f, this.f3297g, tVar, g3.b(this.f3298h | 1), this.f3299i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f3300b = new j(1);

        j() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3302c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f3303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f3304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f3305f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3306g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3307h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3308i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(boolean z4, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3301b = z4;
            this.f3302c = qVar;
            this.f3303d = f0Var;
            this.f3304e = h0Var;
            this.f3305f = str;
            this.f3306g = qVar2;
            this.f3307h = i4;
            this.f3308i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.j(this.f3301b, this.f3302c, this.f3303d, this.f3304e, this.f3305f, this.f3306g, tVar, g3.b(this.f3307h | 1), this.f3308i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f3309b = new l(1);

        l() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x1 f3310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3313e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f3315g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3316h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3317i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3318j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(x1 x1Var, boolean z4, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3310b = x1Var;
            this.f3311c = z4;
            this.f3312d = qVar;
            this.f3313e = f0Var;
            this.f3314f = h0Var;
            this.f3315g = str;
            this.f3316h = qVar2;
            this.f3317i = i4;
            this.f3318j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.i(this.f3310b, this.f3311c, this.f3312d, this.f3313e, this.f3314f, this.f3315g, this.f3316h, tVar, g3.b(this.f3317i | 1), this.f3318j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f3319b = new n(1);

        n() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.u f3320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3322d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3323e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3324f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f3325g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3326h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3327i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3328j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(androidx.compose.foundation.layout.u uVar, boolean z4, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3320b = uVar;
            this.f3321c = z4;
            this.f3322d = qVar;
            this.f3323e = f0Var;
            this.f3324f = h0Var;
            this.f3325g = str;
            this.f3326h = qVar2;
            this.f3327i = i4;
            this.f3328j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.g(this.f3320b, this.f3321c, this.f3322d, this.f3323e, this.f3324f, this.f3325g, this.f3326h, tVar, g3.b(this.f3327i | 1), this.f3328j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f3329b = new p(1);

        p() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.q$q, reason: collision with other inner class name */
    static final class C0049q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1<Boolean> f3330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f3332d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0 f3333e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f3334f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3335g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3336h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0049q(h1<Boolean> h1Var, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, String str, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3330b = h1Var;
            this.f3331c = qVar;
            this.f3332d = f0Var;
            this.f3333e = h0Var;
            this.f3334f = str;
            this.f3335g = qVar2;
            this.f3336h = i4;
            this.f3337i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.d(this.f3330b, this.f3331c, this.f3332d, this.f3333e, this.f3334f, this.f3335g, tVar, g3.b(this.f3336h | 1), this.f3337i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f3338b = new r(1);

        r() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,919:1\n56#2:920\n59#2:921\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n*L\n747#1:920\n746#1:921\n*E\n"})
    static final class s extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Boolean> f3339b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2<T> f3340c;

        /* compiled from: AnimatedVisibility.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1 f3341b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1 i1Var) {
                super(1);
                this.f3341b = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.g(aVar, this.f3341b, 0, 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(ld.l<? super T, Boolean> lVar, e2<T> e2Var) {
            super(3);
            this.f3339b = lVar;
            this.f3340c = e2Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            long a5;
            i1 m02 = l0Var.m0(j4);
            if (!o0Var.E1() || this.f3339b.invoke(this.f3340c.o()).booleanValue()) {
                a5 = androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight());
            } else {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                a5 = androidx.compose.ui.unit.u.f21529c;
            }
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.u.m(a5), (int) (a5 & 4294967295L), null, new a(m02), 4, null);
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/b0;", "current", "target", "", "a", "(Landroidx/compose/animation/b0;Landroidx/compose/animation/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<b0, b0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f3342b = new t(2);

        t() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l b0 b0Var, @fg.l b0 b0Var2) {
            return Boolean.valueOf(b0Var == b0Var2 && b0Var2 == b0.PostExit);
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Boolean> f3344c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3345d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f3346e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0 f3347f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, k2> f3348g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3349h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(e2<T> e2Var, ld.l<? super T, Boolean> lVar, androidx.compose.ui.q qVar, f0 f0Var, h0 h0Var, ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4) {
            super(2);
            this.f3343b = e2Var;
            this.f3344c = lVar;
            this.f3345d = qVar;
            this.f3346e = f0Var;
            this.f3347f = h0Var;
            this.f3348g = qVar2;
            this.f3349h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.l(this.f3343b, this.f3344c, this.f3345d, this.f3346e, this.f3347f, this.f3348g, tVar, g3.b(this.f3349h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c3  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void a(@fg.l androidx.compose.animation.core.e2<T> r20, @fg.l ld.l<? super T, java.lang.Boolean> r21, @fg.l androidx.compose.ui.q r22, @fg.l androidx.compose.animation.f0 r23, @fg.l androidx.compose.animation.h0 r24, @fg.l ld.p<? super androidx.compose.animation.b0, ? super androidx.compose.animation.b0, java.lang.Boolean> r25, @fg.m androidx.compose.animation.r0 r26, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.a(androidx.compose.animation.core.e2, ld.l, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, ld.p, androidx.compose.animation.r0, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    private static final ld.p<b0, b0, Boolean> b(b5<? extends ld.p<? super b0, ? super b0, Boolean>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    private static final boolean c(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0048  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l androidx.compose.animation.core.h1<java.lang.Boolean> r23, @fg.m androidx.compose.ui.q r24, @fg.m androidx.compose.animation.f0 r25, @fg.m androidx.compose.animation.h0 r26, @fg.m java.lang.String r27, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m androidx.compose.runtime.t r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.d(androidx.compose.animation.core.h1, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004f  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.animation.j0
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void e(@fg.l androidx.compose.animation.core.e2<T> r23, @fg.l ld.l<? super T, java.lang.Boolean> r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.animation.f0 r26, @fg.m androidx.compose.animation.h0 r27, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m androidx.compose.runtime.t r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.e(androidx.compose.animation.core.e2, ld.l, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004a  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l androidx.compose.foundation.layout.u r23, @fg.l androidx.compose.animation.core.h1<java.lang.Boolean> r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.animation.f0 r26, @fg.m androidx.compose.animation.h0 r27, @fg.m java.lang.String r28, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.f(androidx.compose.foundation.layout.u, androidx.compose.animation.core.h1, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@fg.l androidx.compose.foundation.layout.u r23, boolean r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.animation.f0 r26, @fg.m androidx.compose.animation.h0 r27, @fg.m java.lang.String r28, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.g(androidx.compose.foundation.layout.u, boolean, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004a  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@fg.l androidx.compose.foundation.layout.x1 r23, @fg.l androidx.compose.animation.core.h1<java.lang.Boolean> r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.animation.f0 r26, @fg.m androidx.compose.animation.h0 r27, @fg.m java.lang.String r28, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.h(androidx.compose.foundation.layout.x1, androidx.compose.animation.core.h1, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(@fg.l androidx.compose.foundation.layout.x1 r23, boolean r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.animation.f0 r26, @fg.m androidx.compose.animation.h0 r27, @fg.m java.lang.String r28, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.i(androidx.compose.foundation.layout.x1, boolean, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004d  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(boolean r23, @fg.m androidx.compose.ui.q r24, @fg.m androidx.compose.animation.f0 r25, @fg.m androidx.compose.animation.h0 r26, @fg.m java.lang.String r27, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, @fg.m androidx.compose.runtime.t r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.j(boolean, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @kotlin.k(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @kotlin.x0(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @androidx.compose.animation.j0
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(boolean r17, @fg.m androidx.compose.ui.q r18, @fg.l androidx.compose.animation.f0 r19, @fg.l androidx.compose.animation.h0 r20, boolean r21, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r22, @fg.m androidx.compose.runtime.t r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.q.k(boolean, androidx.compose.ui.q, androidx.compose.animation.f0, androidx.compose.animation.h0, boolean, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final <T> void l(@fg.l e2<T> e2Var, @fg.l ld.l<? super T, Boolean> lVar, @fg.l androidx.compose.ui.q qVar, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l ld.q<? super androidx.compose.animation.s, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(429978603);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(e2Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.S(lVar) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.q0(qVar) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= o4.q0(f0Var) ? 2048 : 1024;
        }
        if ((i4 & 57344) == 0) {
            i5 |= o4.q0(h0Var) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= o4.S(qVar2) ? 131072 : 65536;
        }
        if ((374491 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(429978603, i5, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            o4.P(1276591712);
            boolean S = o4.S(lVar) | o4.q0(e2Var);
            Object Q = o4.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new s(lVar, e2Var);
                o4.E(Q);
            }
            o4.p0();
            a(e2Var, lVar, androidx.compose.ui.layout.d0.a(qVar, (ld.q) Q), f0Var, h0Var, t.f3342b, null, qVar2, o4, 196608 | (i5 & 14) | (i5 & 112) | (i5 & 7168) | (57344 & i5) | ((i5 << 6) & 29360128), 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new u(e2Var, lVar, qVar, f0Var, h0Var, qVar2, i4));
        }
    }

    public static final ld.p m(b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(e2<b0> e2Var) {
        b0 h4 = e2Var.h();
        b0 b0Var = b0.PostExit;
        return h4 == b0Var && e2Var.o() == b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.i
    private static final <T> b0 p(e2<T> e2Var, ld.l<? super T, Boolean> lVar, T t4, androidx.compose.runtime.t tVar, int i4) {
        b0 b0Var;
        tVar.P(361571134);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(361571134, i4, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)");
        }
        tVar.U(-721835388, e2Var);
        if (e2Var.t()) {
            b0Var = lVar.invoke(t4).booleanValue() ? b0.Visible : lVar.invoke(e2Var.h()).booleanValue() ? b0.PostExit : b0.PreEnter;
        } else {
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = t4.g(Boolean.FALSE, null, 2, null);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
            if (lVar.invoke(e2Var.h()).booleanValue()) {
                k2Var.setValue(Boolean.TRUE);
            }
            b0Var = lVar.invoke(t4).booleanValue() ? b0.Visible : ((Boolean) k2Var.getValue()).booleanValue() ? b0.PostExit : b0.PreEnter;
        }
        tVar.o0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return b0Var;
    }
}
