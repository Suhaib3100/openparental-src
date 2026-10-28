package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.f2;
import androidx.compose.animation.k;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002!%B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0004¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JK\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0011H\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R1\u0010@\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R,\u0010G\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0B0A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010R\u001a\u00020O*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0018\u0010T\u001a\u00020O*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u001a\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bU\u0010=R\u0014\u0010X\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006[²\u0006\u0014\u0010Z\u001a\u00020O\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/m;", "S", "Landroidx/compose/animation/k;", "Landroidx/compose/animation/core/e2;", "transition", "Landroidx/compose/ui/c;", "contentAlignment", "Landroidx/compose/ui/unit/w;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/e2;Landroidx/compose/ui/c;Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/unit/u;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/q;", "n", "(JJ)J", "Landroidx/compose/animation/x;", "Landroidx/compose/animation/w0;", "sizeTransform", "h", "(Landroidx/compose/animation/x;Landroidx/compose/animation/w0;)Landroidx/compose/animation/x;", "Landroidx/compose/animation/k$a;", "towards", "Landroidx/compose/animation/core/p0;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/f0;", "a", "(ILandroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/f0;", "targetOffset", "Landroidx/compose/animation/h0;", "b", "(ILandroidx/compose/animation/core/p0;Lld/l;)Landroidx/compose/animation/h0;", "contentTransform", "Landroidx/compose/ui/q;", "o", "(Landroidx/compose/animation/x;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/e2;", "w", "()Landroidx/compose/animation/core/e2;", "Landroidx/compose/ui/c;", "k", "()Landroidx/compose/ui/c;", "A", "(Landroidx/compose/ui/c;)V", "c", "Landroidx/compose/ui/unit/w;", "t", "()Landroidx/compose/ui/unit/w;", "B", "(Landroidx/compose/ui/unit/w;)V", "<set-?>", "d", "Landroidx/compose/runtime/k2;", "u", "()J", "C", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/b5;", "e", "Ljava/util/Map;", "v", "()Ljava/util/Map;", "targetSizeMap", "f", "Landroidx/compose/runtime/b5;", "r", "()Landroidx/compose/runtime/b5;", "z", "(Landroidx/compose/runtime/b5;)V", "animatedSize", "", "x", "(I)Z", "isLeft", "y", "isRight", "s", "i", "()Ljava/lang/Object;", "initialState", "targetState", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,831:1\n81#2:832\n107#2,2:833\n81#2:849\n107#2,2:850\n36#3:835\n36#3:842\n1116#4,6:836\n1116#4,6:843\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n528#1:832\n528#1:833,2\n540#1:849\n540#1:850,2\n540#1:835\n552#1:842\n540#1:836,6\n552#1:843,6\n*E\n"})
/* loaded from: classes.dex */
public final class m<S> implements k<S> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f3197g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e2<S> transition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.c contentAlignment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 measuredSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<S, b5<androidx.compose.ui.unit.u>> targetSizeMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b5<androidx.compose.ui.unit.u> animatedSize;

    /* compiled from: AnimatedContent.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u0005¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/m$a;", "Landroidx/compose/ui/layout/f1;", "", "isTarget", "<init>", "(Z)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Z", "c", "(Z)Landroidx/compose/animation/m$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "g", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a implements androidx.compose.ui.layout.f1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f3204c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isTarget;

        public a(boolean z4) {
            this.isTarget = z4;
        }

        public static a d(a aVar, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z4 = aVar.isTarget;
            }
            aVar.getClass();
            return new a(z4);
        }

        @Override // androidx.compose.ui.layout.f1
        @fg.l
        public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
            return this;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        @fg.l
        public final a c(boolean isTarget) {
            return new a(isTarget);
        }

        public final boolean e() {
            return this.isTarget;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isTarget == ((a) other).isTarget;
        }

        public final void g(boolean z4) {
            this.isTarget = z4;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTarget);
        }

        @fg.l
        public String toString() {
            return l.a(new StringBuilder("ChildData(isTarget="), this.isTarget, ')');
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B5\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/m$b;", "Landroidx/compose/animation/q0;", "Landroidx/compose/animation/core/e2$a;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/animation/core/p;", "Landroidx/compose/animation/core/e2;", "sizeAnimation", "Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/w0;", "sizeTransform", "<init>", "(Landroidx/compose/animation/m;Landroidx/compose/animation/core/e2$a;Landroidx/compose/runtime/b5;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "c", "Landroidx/compose/animation/core/e2$a;", "b", "()Landroidx/compose/animation/core/e2$a;", "d", "Landroidx/compose/runtime/b5;", "()Landroidx/compose/runtime/b5;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends q0 {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final e2<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> sizeAnimation;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b5<w0> sizeTransform;

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1 f3209b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f3210c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1 i1Var, long j4) {
                super(1);
                this.f3209b = i1Var;
                this.f3210c = j4;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.i(aVar, this.f3209b, this.f3210c, 0.0f, 2, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/unit/u;", "a", "(Landroidx/compose/animation/core/e2$b;)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.m$b$b, reason: collision with other inner class name */
        static final class C0047b extends kotlin.jvm.internal.n0 implements ld.l<e2.b<S>, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m<S> f3211b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m<S>.b f3212c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0047b(m<S> mVar, m<S>.b bVar) {
                super(1);
                this.f3211b = mVar;
                this.f3212c = bVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> invoke(@fg.l e2.b<S> bVar) {
                long j4;
                long j5;
                androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> k4;
                b5<androidx.compose.ui.unit.u> b5Var = this.f3211b.v().get(bVar.i());
                if (b5Var != null) {
                    j4 = b5Var.getValue().getPackedValue();
                } else {
                    androidx.compose.ui.unit.u.INSTANCE.getClass();
                    j4 = androidx.compose.ui.unit.u.f21529c;
                }
                b5<androidx.compose.ui.unit.u> b5Var2 = this.f3211b.v().get(bVar.f());
                if (b5Var2 != null) {
                    j5 = b5Var2.getValue().getPackedValue();
                } else {
                    androidx.compose.ui.unit.u.INSTANCE.getClass();
                    j5 = androidx.compose.ui.unit.u.f21529c;
                }
                w0 value = this.f3212c.c().getValue();
                return (value == null || (k4 = value.k(j4, j5)) == null) ? androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null) : k4;
            }
        }

        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "Landroidx/compose/ui/unit/u;", "a", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<S, androidx.compose.ui.unit.u> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m<S> f3213b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m<S> mVar) {
                super(1);
                this.f3213b = mVar;
            }

            public final long a(S s4) {
                b5<androidx.compose.ui.unit.u> b5Var = this.f3213b.v().get(s4);
                if (b5Var != null) {
                    return b5Var.getValue().getPackedValue();
                }
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                return androidx.compose.ui.unit.u.f21529c;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(Object obj) {
                return androidx.compose.ui.unit.u.b(a(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@fg.l e2<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar, @fg.l b5<? extends w0> b5Var) {
            this.sizeAnimation = aVar;
            this.sizeTransform = b5Var;
        }

        @fg.l
        public final e2<S>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> b() {
            return this.sizeAnimation;
        }

        @fg.l
        public final b5<w0> c() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.b0
        @fg.l
        public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            i1 m02 = l0Var.m0(j4);
            b5<androidx.compose.ui.unit.u> a5 = this.sizeAnimation.a(new C0047b(m.this, this), new c(m.this));
            m.this.z(a5);
            return androidx.compose.ui.layout.o0.x2(o0Var, (int) (a5.getValue().getPackedValue() >> 32), (int) (a5.getValue().getPackedValue() & 4294967295L), null, new a(m02, m.this.getContentAlignment().a(androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight()), a5.getValue().getPackedValue(), androidx.compose.ui.unit.w.Ltr)), 4, null);
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<S> f3215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super Integer, Integer> lVar, m<S> mVar) {
            super(1);
            this.f3214b = lVar;
            this.f3215c = mVar;
        }

        @fg.l
        public final Integer a(int i4) {
            return this.f3214b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(this.f3215c.s()) - androidx.compose.ui.unit.q.m(this.f3215c.n(androidx.compose.ui.unit.v.a(i4, i4), this.f3215c.s()))));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<S> f3217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super Integer, Integer> lVar, m<S> mVar) {
            super(1);
            this.f3216b = lVar;
            this.f3217c = mVar;
        }

        @fg.l
        public final Integer a(int i4) {
            return this.f3216b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.m(this.f3217c.n(androidx.compose.ui.unit.v.a(i4, i4), this.f3217c.s()))) - i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3218b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<S> f3219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.l<? super Integer, Integer> lVar, m<S> mVar) {
            super(1);
            this.f3218b = lVar;
            this.f3219c = mVar;
        }

        @fg.l
        public final Integer a(int i4) {
            return this.f3218b.invoke(Integer.valueOf(androidx.compose.ui.unit.u.j(this.f3219c.s()) - androidx.compose.ui.unit.q.o(this.f3219c.n(androidx.compose.ui.unit.v.a(i4, i4), this.f3219c.s()))));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<S> f3221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ld.l<? super Integer, Integer> lVar, m<S> mVar) {
            super(1);
            this.f3220b = lVar;
            this.f3221c = mVar;
        }

        @fg.l
        public final Integer a(int i4) {
            return this.f3220b.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.o(this.f3221c.n(androidx.compose.ui.unit.v.a(i4, i4), this.f3221c.s()))) - i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<S> f3222b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(m<S> mVar, ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3222b = mVar;
            this.f3223c = lVar;
        }

        @fg.l
        public final Integer a(int i4) {
            long j4;
            b5<androidx.compose.ui.unit.u> b5Var = this.f3222b.v().get(this.f3222b.w().o());
            if (b5Var != null) {
                j4 = b5Var.getValue().getPackedValue();
            } else {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                j4 = androidx.compose.ui.unit.u.f21529c;
            }
            return this.f3223c.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.m(this.f3222b.n(androidx.compose.ui.unit.v.a(i4, i4), j4))) - i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<S> f3224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(m<S> mVar, ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3224b = mVar;
            this.f3225c = lVar;
        }

        @fg.l
        public final Integer a(int i4) {
            long j4;
            b5<androidx.compose.ui.unit.u> b5Var = this.f3224b.v().get(this.f3224b.w().o());
            if (b5Var != null) {
                j4 = b5Var.getValue().getPackedValue();
            } else {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                j4 = androidx.compose.ui.unit.u.f21529c;
            }
            return this.f3225c.invoke(Integer.valueOf(androidx.compose.ui.unit.u.m(j4) + (-androidx.compose.ui.unit.q.m(this.f3224b.n(androidx.compose.ui.unit.v.a(i4, i4), j4)))));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<S> f3226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m<S> mVar, ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3226b = mVar;
            this.f3227c = lVar;
        }

        @fg.l
        public final Integer a(int i4) {
            long j4;
            b5<androidx.compose.ui.unit.u> b5Var = this.f3226b.v().get(this.f3226b.w().o());
            if (b5Var != null) {
                j4 = b5Var.getValue().getPackedValue();
            } else {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                j4 = androidx.compose.ui.unit.u.f21529c;
            }
            return this.f3227c.invoke(Integer.valueOf((-androidx.compose.ui.unit.q.o(this.f3226b.n(androidx.compose.ui.unit.v.a(i4, i4), j4))) - i4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<S> f3228b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, Integer> f3229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(m<S> mVar, ld.l<? super Integer, Integer> lVar) {
            super(1);
            this.f3228b = mVar;
            this.f3229c = lVar;
        }

        @fg.l
        public final Integer a(int i4) {
            long j4;
            b5<androidx.compose.ui.unit.u> b5Var = this.f3228b.v().get(this.f3228b.w().o());
            if (b5Var != null) {
                j4 = b5Var.getValue().getPackedValue();
            } else {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                j4 = androidx.compose.ui.unit.u.f21529c;
            }
            return this.f3229c.invoke(Integer.valueOf(androidx.compose.ui.unit.u.j(j4) + (-androidx.compose.ui.unit.q.o(this.f3228b.n(androidx.compose.ui.unit.v.a(i4, i4), j4)))));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public m(@fg.l e2<S> e2Var, @fg.l androidx.compose.ui.c cVar, @fg.l androidx.compose.ui.unit.w wVar) {
        k2 g4;
        this.transition = e2Var;
        this.contentAlignment = cVar;
        this.layoutDirection = wVar;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        g4 = t4.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f21529c), null, 2, null);
        this.measuredSize = g4;
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n(long fullSize, long currentSize) {
        return this.contentAlignment.a(fullSize, currentSize, androidx.compose.ui.unit.w.Ltr);
    }

    private static final boolean p(k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    private static final void q(k2<Boolean> k2Var, boolean z4) {
        k2Var.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s() {
        b5<androidx.compose.ui.unit.u> b5Var = this.animatedSize;
        return b5Var != null ? b5Var.getValue().getPackedValue() : u();
    }

    private final boolean x(int i4) {
        k.a.Companion companion = k.a.INSTANCE;
        companion.getClass();
        if (!k.a.j(i4, k.a.f3185c)) {
            companion.getClass();
            if (!k.a.j(i4, k.a.f3189g) || this.layoutDirection != androidx.compose.ui.unit.w.Ltr) {
                companion.getClass();
                if (!k.a.j(i4, k.a.f3190h) || this.layoutDirection != androidx.compose.ui.unit.w.Rtl) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean y(int i4) {
        k.a.Companion companion = k.a.INSTANCE;
        companion.getClass();
        if (!k.a.j(i4, k.a.f3186d)) {
            companion.getClass();
            if (!k.a.j(i4, k.a.f3189g) || this.layoutDirection != androidx.compose.ui.unit.w.Rtl) {
                companion.getClass();
                if (!k.a.j(i4, k.a.f3190h) || this.layoutDirection != androidx.compose.ui.unit.w.Ltr) {
                    return false;
                }
            }
        }
        return true;
    }

    public void A(@fg.l androidx.compose.ui.c cVar) {
        this.contentAlignment = cVar;
    }

    public final void B(@fg.l androidx.compose.ui.unit.w wVar) {
        this.layoutDirection = wVar;
    }

    public final void C(long j4) {
        this.measuredSize.setValue(androidx.compose.ui.unit.u.b(j4));
    }

    @Override // androidx.compose.animation.k
    @fg.l
    public f0 a(int towards, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec, @fg.l ld.l<? super Integer, Integer> initialOffset) {
        if (x(towards)) {
            return d0.H(animationSpec, new c(initialOffset, this));
        }
        if (y(towards)) {
            return d0.H(animationSpec, new d(initialOffset, this));
        }
        k.a.Companion companion = k.a.INSTANCE;
        companion.getClass();
        if (k.a.j(towards, k.a.f3187e)) {
            return d0.J(animationSpec, new e(initialOffset, this));
        }
        companion.getClass();
        if (k.a.j(towards, k.a.f3188f)) {
            return d0.J(animationSpec, new f(initialOffset, this));
        }
        f0.INSTANCE.getClass();
        return f0.f3170c;
    }

    @Override // androidx.compose.animation.k
    @fg.l
    public h0 b(int towards, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.q> animationSpec, @fg.l ld.l<? super Integer, Integer> targetOffset) {
        if (x(towards)) {
            return d0.N(animationSpec, new g(this, targetOffset));
        }
        if (y(towards)) {
            return d0.N(animationSpec, new h(this, targetOffset));
        }
        k.a.Companion companion = k.a.INSTANCE;
        companion.getClass();
        if (k.a.j(towards, k.a.f3187e)) {
            return d0.P(animationSpec, new i(this, targetOffset));
        }
        companion.getClass();
        if (k.a.j(towards, k.a.f3188f)) {
            return d0.P(animationSpec, new j(this, targetOffset));
        }
        h0.INSTANCE.getClass();
        return h0.f3180c;
    }

    @Override // androidx.compose.animation.core.e2.b
    public S f() {
        return this.transition.m().f();
    }

    @Override // androidx.compose.animation.k
    @fg.l
    public x h(@fg.l x xVar, @fg.m w0 w0Var) {
        xVar.e(w0Var);
        return xVar;
    }

    @Override // androidx.compose.animation.core.e2.b
    public S i() {
        return this.transition.m().i();
    }

    @Override // androidx.compose.animation.k
    @fg.l
    /* renamed from: k, reason: from getter */
    public androidx.compose.ui.c getContentAlignment() {
        return this.contentAlignment;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.ui.q o(@fg.l x xVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.ui.q qVar;
        tVar.P(93755870);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(93755870, i4, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        tVar.P(1157296644);
        boolean q02 = tVar.q0(this);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = t4.g(Boolean.FALSE, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        b5 u4 = o4.u(xVar.getSizeTransform(), tVar, 0);
        if (kotlin.jvm.internal.l0.g(this.transition.h(), this.transition.o())) {
            q(k2Var, false);
        } else if (u4.getValue() != null) {
            q(k2Var, true);
        }
        if (p(k2Var)) {
            e2.a l4 = f2.l(this.transition, androidx.compose.animation.core.k2.e(androidx.compose.ui.unit.u.INSTANCE), null, tVar, 64, 2);
            tVar.P(1157296644);
            boolean q03 = tVar.q0(l4);
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                w0 w0Var = (w0) u4.getValue();
                Q2 = ((w0Var == null || w0Var.getClip()) ? androidx.compose.ui.draw.h.b(androidx.compose.ui.q.INSTANCE) : androidx.compose.ui.q.INSTANCE).w3(new b(l4, u4));
                tVar.E(Q2);
            }
            tVar.p0();
            qVar = (androidx.compose.ui.q) Q2;
        } else {
            this.animatedSize = null;
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return qVar;
    }

    @fg.m
    public final b5<androidx.compose.ui.unit.u> r() {
        return this.animatedSize;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((androidx.compose.ui.unit.u) this.measuredSize.getValue()).getPackedValue();
    }

    @fg.l
    public final Map<S, b5<androidx.compose.ui.unit.u>> v() {
        return this.targetSizeMap;
    }

    @fg.l
    public final e2<S> w() {
        return this.transition;
    }

    public final void z(@fg.m b5<androidx.compose.ui.unit.u> b5Var) {
        this.animatedSize = b5Var;
    }
}
