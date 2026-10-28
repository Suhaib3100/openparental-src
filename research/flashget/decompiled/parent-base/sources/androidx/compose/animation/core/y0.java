package androidx.compose.animation.core;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import org.apache.http.HttpStatus;

/* compiled from: InfiniteTransition.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R#\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/animation/core/y0;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "Lkotlin/k2;", "k", "(J)V", "Landroidx/compose/animation/core/y0$a;", "animation", "f", "(Landroidx/compose/animation/core/y0$a;)V", "l", "m", "(Landroidx/compose/runtime/t;I)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/g;", "b", "Landroidx/compose/runtime/collection/g;", "_animations", "", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "i", "()Z", "n", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "j", "o", "isRunning", "", "g", "()Ljava/util/List;", "animations", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1208#2:365\n1187#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n25#4:374\n1116#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2998f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a<?, ?>> _animations = new androidx.compose.runtime.collection.g<>(new a[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 refreshChildNeeded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTimeNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isRunning;

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R+\u0010/\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103RB\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/animation/core/y0$a;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/runtime/b5;", "initialValue", "targetValue", "Landroidx/compose/animation/core/i2;", "typeConverter", "Landroidx/compose/animation/core/k;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/y0;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/i2;Landroidx/compose/animation/core/k;Ljava/lang/String;)V", "Lkotlin/k2;", "S", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/k;)V", "", "playTimeNanos", "A", "(J)V", "R", "()V", "D", "b", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "H", "(Ljava/lang/Object;)V", "c", "q", "K", "d", "Landroidx/compose/animation/core/i2;", "s", "()Landroidx/compose/animation/core/i2;", "e", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "<set-?>", "f", "Landroidx/compose/runtime/k2;", "getValue", "Q", "value", "g", "Landroidx/compose/animation/core/k;", "i", "()Landroidx/compose/animation/core/k;", "Landroidx/compose/animation/core/d2;", "h", "Landroidx/compose/animation/core/d2;", "a", "()Landroidx/compose/animation/core/d2;", "F", "(Landroidx/compose/animation/core/d2;)V", "animation", "", "Z", "y", "()Z", "G", "(Z)V", "isFinished", "j", "startOnTheNextFrame", "k", "J", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class a<T, V extends s> implements b5<T> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T initialValue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T targetValue;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i2<T, V> typeConverter;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String label;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.k2 value;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private k<T> animationSpec;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private d2<T, V> animation;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long playTimeNanosOffset;

        public a(T t4, T t5, @fg.l i2<T, V> i2Var, @fg.l k<T> kVar, @fg.l String str) {
            androidx.compose.runtime.k2 g4;
            this.initialValue = t4;
            this.targetValue = t5;
            this.typeConverter = i2Var;
            this.label = str;
            g4 = t4.g(t4, null, 2, null);
            this.value = g4;
            this.animationSpec = kVar;
            this.animation = new d2<>(this.animationSpec, i2Var, this.initialValue, this.targetValue, (s) null, 16, (kotlin.jvm.internal.w) null);
        }

        public final void A(long playTimeNanos) {
            y0.this.n(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j4 = playTimeNanos - this.playTimeNanosOffset;
            Q(this.animation.f(j4));
            this.isFinished = this.animation.c(j4);
        }

        public final void D() {
            this.startOnTheNextFrame = true;
        }

        public final void F(@fg.l d2<T, V> d2Var) {
            this.animation = d2Var;
        }

        public final void G(boolean z4) {
            this.isFinished = z4;
        }

        public final void H(T t4) {
            this.initialValue = t4;
        }

        public final void K(T t4) {
            this.targetValue = t4;
        }

        public void Q(T t4) {
            this.value.setValue(t4);
        }

        public final void R() {
            Q(this.animation.g());
            this.startOnTheNextFrame = true;
        }

        public final void S(T initialValue, T targetValue, @fg.l k<T> animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new d2<>(animationSpec, this.typeConverter, initialValue, targetValue, (s) null, 16, (kotlin.jvm.internal.w) null);
            y0.this.n(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        @fg.l
        public final d2<T, V> a() {
            return this.animation;
        }

        @Override // androidx.compose.runtime.b5
        public T getValue() {
            return this.value.getValue();
        }

        @fg.l
        public final k<T> i() {
            return this.animationSpec;
        }

        public final T l() {
            return this.initialValue;
        }

        @fg.l
        /* renamed from: m, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final T q() {
            return this.targetValue;
        }

        @fg.l
        public final i2<T, V> s() {
            return this.typeConverter;
        }

        /* renamed from: y, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {181, HttpStatus.SC_RESET_CONTENT}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f3015b;

        /* renamed from: c, reason: collision with root package name */
        int f3016c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f3017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<b5<Long>> f3018e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f3019f;

        /* compiled from: InfiniteTransition.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<b5<Long>> f3020b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y0 f3021c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.e f3022d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f3023e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.k2<b5<Long>> k2Var, y0 y0Var, k1.e eVar, kotlinx.coroutines.r0 r0Var) {
                super(1);
                this.f3020b = k2Var;
                this.f3021c = y0Var;
                this.f3022d = eVar;
                this.f3023e = r0Var;
            }

            public final void a(long j4) {
                b5<Long> value = this.f3020b.getValue();
                long longValue = value != null ? value.getValue().longValue() : j4;
                int i4 = 0;
                if (this.f3021c.startTimeNanos == Long.MIN_VALUE || this.f3022d.f75326b != c2.q(this.f3023e.getCoroutineContext())) {
                    this.f3021c.startTimeNanos = j4;
                    androidx.compose.runtime.collection.g gVar = this.f3021c._animations;
                    int size = gVar.getSize();
                    if (size > 0) {
                        Object[] L = gVar.L();
                        int i5 = 0;
                        do {
                            ((a) L[i5]).D();
                            i5++;
                        } while (i5 < size);
                    }
                    this.f3022d.f75326b = c2.q(this.f3023e.getCoroutineContext());
                }
                if (this.f3022d.f75326b != 0.0f) {
                    this.f3021c.k((long) ((longValue - this.f3021c.startTimeNanos) / this.f3022d.f75326b));
                    return;
                }
                androidx.compose.runtime.collection.g gVar2 = this.f3021c._animations;
                int size2 = gVar2.getSize();
                if (size2 > 0) {
                    Object[] L2 = gVar2.L();
                    do {
                        ((a) L2[i4]).R();
                        i4++;
                    } while (i4 < size2);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: InfiniteTransition.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.animation.core.y0$b$b, reason: collision with other inner class name */
        static final class C0042b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f3024b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0042b(kotlinx.coroutines.r0 r0Var) {
                super(0);
                this.f3024b = r0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(c2.q(this.f3024b.getCoroutineContext()));
            }
        }

        /* compiled from: InfiniteTransition.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<Float, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3025b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ float f3026c;

            c(kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
            }

            @fg.m
            public final Object a(float f4, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((c) create(Float.valueOf(f4), dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                c cVar = new c(2, dVar);
                cVar.f3026c = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(Float f4, kotlin.coroutines.d<? super Boolean> dVar) {
                return a(f4.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f3025b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return Boolean.valueOf(this.f3026c > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.k2<b5<Long>> k2Var, y0 y0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f3018e = k2Var;
            this.f3019f = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f3018e, this.f3019f, dVar);
            bVar.f3017d = obj;
            return bVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0053 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x003e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0074 -> B:6:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f3016c
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L2e
                if (r1 == r2) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r1 = r7.f3015b
                kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
                java.lang.Object r4 = r7.f3017d
                kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                kotlin.a1.n(r8)
                r8 = r4
                goto L3e
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f3015b
                kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
                java.lang.Object r4 = r7.f3017d
                kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                kotlin.a1.n(r8)
                r8 = r4
                goto L54
            L2e:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f3017d
                kotlinx.coroutines.r0 r8 = (kotlinx.coroutines.r0) r8
                kotlin.jvm.internal.k1$e r1 = new kotlin.jvm.internal.k1$e
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f75326b = r4
            L3e:
                androidx.compose.animation.core.y0$b$a r4 = new androidx.compose.animation.core.y0$b$a
                androidx.compose.runtime.k2<androidx.compose.runtime.b5<java.lang.Long>> r5 = r7.f3018e
                androidx.compose.animation.core.y0 r6 = r7.f3019f
                r4.<init>(r5, r6, r1, r8)
                r7.f3017d = r8
                r7.f3015b = r1
                r7.f3016c = r2
                java.lang.Object r4 = androidx.compose.animation.core.w0.c(r4, r7)
                if (r4 != r0) goto L54
                return r0
            L54:
                float r4 = r1.f75326b
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L3e
                androidx.compose.animation.core.y0$b$b r4 = new androidx.compose.animation.core.y0$b$b
                r4.<init>(r8)
                kotlinx.coroutines.flow.i r4 = androidx.compose.runtime.o4.w(r4)
                androidx.compose.animation.core.y0$b$c r5 = new androidx.compose.animation.core.y0$b$c
                r6 = 0
                r5.<init>(r3, r6)
                r7.f3017d = r8
                r7.f3015b = r1
                r7.f3016c = r3
                java.lang.Object r4 = kotlinx.coroutines.flow.k.v0(r4, r5, r7)
                if (r4 != r0) goto L3e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.y0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4) {
            super(2);
            this.f3028c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            y0.this.m(tVar, g3.b(this.f3028c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    public y0(@fg.l String str) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.label = str;
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        this.refreshChildNeeded = g4;
        this.startTimeNanos = Long.MIN_VALUE;
        g5 = t4.g(Boolean.TRUE, null, 2, null);
        this.isRunning = g5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(long playTimeNanos) {
        boolean z4;
        androidx.compose.runtime.collection.g<a<?, ?>> gVar = this._animations;
        int size = gVar.getSize();
        if (size > 0) {
            a<?, ?>[] L = gVar.L();
            z4 = true;
            int i4 = 0;
            do {
                a<?, ?> aVar = L[i4];
                if (!aVar.getIsFinished()) {
                    aVar.A(playTimeNanos);
                }
                if (!aVar.getIsFinished()) {
                    z4 = false;
                }
                i4++;
            } while (i4 < size);
        } else {
            z4 = true;
        }
        o(!z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean z4) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z4));
    }

    private final void o(boolean z4) {
        this.isRunning.setValue(Boolean.valueOf(z4));
    }

    public final void f(@fg.l a<?, ?> animation) {
        this._animations.b(animation);
        n(true);
    }

    @fg.l
    public final List<a<?, ?>> g() {
        return this._animations.l();
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final void l(@fg.l a<?, ?> animation) {
        this._animations.j0(animation);
    }

    @androidx.compose.runtime.i
    public final void m(@fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-318043801);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-318043801, i4, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        o4.P(-492369756);
        Object Q = o4.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = t4.g(null, null, 2, null);
            o4.E(Q);
        }
        o4.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        if (j() || i()) {
            androidx.compose.runtime.a1.h(this, new b(k2Var, this, null), o4, 72);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(i4));
        }
    }
}
