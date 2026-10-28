package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.p0;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.unit.q;
import com.android.internal.telephony.cdma.UserData;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.r0;

/* compiled from: LazyLayoutAnimation.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010,\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R(\u00102\u001a\u00020\t8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\fR \u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000208038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R1\u0010<\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b:\u00100\"\u0004\b;\u0010\fR+\u0010B\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010I\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00060C¢\u0006\u0002\bE8\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bG\u0010HR(\u0010L\u001a\u00020\t8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\bJ\u00100\"\u0004\bK\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h;", "", "Lkotlinx/coroutines/r0;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Lkotlin/k2;", "j", "()V", "Landroidx/compose/ui/unit/q;", "delta", "i", "(J)V", "h", "C", "a", "Lkotlinx/coroutines/r0;", "l", "()Lkotlinx/coroutines/r0;", "Landroidx/compose/animation/core/p0;", "", "b", "Landroidx/compose/animation/core/p0;", "k", "()Landroidx/compose/animation/core/p0;", "v", "(Landroidx/compose/animation/core/p0;)V", "appearanceSpec", "c", "p", "z", "placementSpec", "", "<set-?>", "d", "Landroidx/compose/runtime/k2;", "t", "()Z", "x", "(Z)V", "isPlacementAnimationInProgress", "e", "s", "u", "isAppearanceAnimationInProgress", "f", "J", "q", "()J", "A", "rawOffset", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/p;", "g", "Landroidx/compose/animation/core/b;", "placementDeltaAnimation", "Landroidx/compose/animation/core/o;", "visibilityAnimation", "o", "y", "placementDelta", "Landroidx/compose/runtime/h2;", "r", "()F", "B", "(F)V", "visibility", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "Lld/l;", "m", "()Lld/l;", "layerBlock", "n", "w", "lookaheadOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n81#2:208\n107#2,2:209\n81#2:211\n107#2,2:212\n81#2:214\n107#2,2:215\n76#3:217\n109#3,2:218\n79#4:220\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n*L\n50#1:208\n50#1:209,2\n56#1:211\n56#1:212,2\n76#1:214\n76#1:215,2\n79#1:217\n79#1:218,2\n110#1:220\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final int f6000n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r0 coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p0<Float> appearanceSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p0<androidx.compose.ui.unit.q> placementSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isPlacementAnimationInProgress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isAppearanceAnimationInProgress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long rawOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> placementDeltaAnimation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> visibilityAnimation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 placementDelta;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 visibility;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<q4, kotlin.k2> layerBlock;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: o, reason: collision with root package name */
    private static final long f6001o = androidx.compose.ui.unit.r.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a;", "", "<init>", "()V", "Landroidx/compose/ui/unit/q;", "NotInitialized", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return h.f6001o;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1", f = "LazyLayoutAnimation.kt", i = {}, l = {155, 156}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6014b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0<Float> f6016d;

        /* compiled from: LazyLayoutAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f6017b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f6017b = hVar;
            }

            public final void a(@fg.l androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar) {
                this.f6017b.B(bVar.v().floatValue());
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar) {
                a(bVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p0<Float> p0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f6016d = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new b(this.f6016d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6014b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.animation.core.b bVar = h.this.visibilityAnimation;
                    Float f4 = new Float(0.0f);
                    this.f6014b = 1;
                    if (bVar.C(f4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                        h.this.u(false);
                        return kotlin.k2.f75408a;
                    }
                    a1.n(obj);
                }
                androidx.compose.animation.core.b bVar2 = h.this.visibilityAnimation;
                Float f5 = new Float(1.0f);
                p0<Float> p0Var = this.f6016d;
                a aVar2 = new a(h.this);
                this.f6014b = 2;
                if (androidx.compose.animation.core.b.i(bVar2, f5, p0Var, null, aVar2, this, 4, null) == aVar) {
                    return aVar;
                }
                h.this.u(false);
                return kotlin.k2.f75408a;
            } catch (Throwable th) {
                h.this.u(false);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", f = "LazyLayoutAnimation.kt", i = {0}, l = {127, UserData.IS91_MSG_TYPE_SHORT_MESSAGE}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n79#2:208\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n*L\n132#1:208\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f6018b;

        /* renamed from: c, reason: collision with root package name */
        int f6019c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p0<androidx.compose.ui.unit.q> f6021e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f6022f;

        /* compiled from: LazyLayoutAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/b;", "Landroidx/compose/ui/unit/q;", "Landroidx/compose/animation/core/p;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/b;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n79#2:208\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1$1\n*L\n135#1:208\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.b<androidx.compose.ui.unit.q, androidx.compose.animation.core.p>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f6023b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f6024c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, long j4) {
                super(1);
                this.f6023b = hVar;
                this.f6024c = j4;
            }

            public final void a(@fg.l androidx.compose.animation.core.b<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> bVar) {
                h hVar = this.f6023b;
                long packedValue = bVar.v().getPackedValue();
                long j4 = this.f6024c;
                hVar.y(androidx.compose.ui.unit.r.a(((int) (packedValue >> 32)) - ((int) (j4 >> 32)), ((int) (packedValue & 4294967295L)) - ((int) (j4 & 4294967295L))));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.b<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> bVar) {
                a(bVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p0<androidx.compose.ui.unit.q> p0Var, long j4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f6021e = p0Var;
            this.f6022f = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new c(this.f6021e, this.f6022f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            p0 p0Var;
            p0 p0Var2;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6019c;
            if (i4 == 0) {
                a1.n(obj);
                if (h.this.placementDeltaAnimation.y()) {
                    p0<androidx.compose.ui.unit.q> p0Var3 = this.f6021e;
                    p0Var = p0Var3 instanceof y1 ? (y1) p0Var3 : i.f6053a;
                } else {
                    p0Var = this.f6021e;
                }
                p0Var2 = p0Var;
                if (!h.this.placementDeltaAnimation.y()) {
                    androidx.compose.animation.core.b bVar = h.this.placementDeltaAnimation;
                    androidx.compose.ui.unit.q b5 = androidx.compose.ui.unit.q.b(this.f6022f);
                    this.f6018b = p0Var2;
                    this.f6019c = 1;
                    if (bVar.C(b5, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                    h.this.x(false);
                    return kotlin.k2.f75408a;
                }
                p0Var2 = (p0) this.f6018b;
                a1.n(obj);
            }
            p0 p0Var4 = p0Var2;
            long packedValue = ((androidx.compose.ui.unit.q) h.this.placementDeltaAnimation.v()).getPackedValue();
            long j4 = this.f6022f;
            long a5 = androidx.compose.ui.unit.r.a(((int) (packedValue >> 32)) - ((int) (j4 >> 32)), ((int) (packedValue & 4294967295L)) - ((int) (j4 & 4294967295L)));
            androidx.compose.animation.core.b bVar2 = h.this.placementDeltaAnimation;
            androidx.compose.ui.unit.q b6 = androidx.compose.ui.unit.q.b(a5);
            a aVar2 = new a(h.this, a5);
            this.f6018b = null;
            this.f6019c = 2;
            if (androidx.compose.animation.core.b.i(bVar2, b6, p0Var4, null, aVar2, this, 4, null) == aVar) {
                return aVar;
            }
            h.this.x(false);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1", f = "LazyLayoutAnimation.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6025b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6025b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = h.this.placementDeltaAnimation;
                androidx.compose.ui.unit.q.INSTANCE.getClass();
                androidx.compose.ui.unit.q b5 = androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.q.f21519c);
                this.f6025b = 1;
                if (bVar.C(b5, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            h hVar = h.this;
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            hVar.y(androidx.compose.ui.unit.q.f21519c);
            h.this.x(false);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<q4, kotlin.k2> {
        e() {
            super(1);
        }

        public final void a(@fg.l q4 q4Var) {
            q4Var.k(h.this.r());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$1", f = "LazyLayoutAnimation.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6028b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6028b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = h.this.placementDeltaAnimation;
                this.f6028b = 1;
                if (bVar.D(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$2", f = "LazyLayoutAnimation.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6030b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return h.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6030b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.b bVar = h.this.visibilityAnimation;
                this.f6030b = 1;
                if (bVar.D(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public h(@fg.l r0 r0Var) {
        k2 g4;
        k2 g5;
        k2 g6;
        this.coroutineScope = r0Var;
        Boolean bool = Boolean.FALSE;
        g4 = t4.g(bool, null, 2, null);
        this.isPlacementAnimationInProgress = g4;
        g5 = t4.g(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = g5;
        long j4 = f6001o;
        this.rawOffset = j4;
        q.Companion companion = androidx.compose.ui.unit.q.INSTANCE;
        companion.getClass();
        this.placementDeltaAnimation = new androidx.compose.animation.core.b<>(androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.q.f21519c), androidx.compose.animation.core.k2.d(companion), null, null, 12, null);
        this.visibilityAnimation = new androidx.compose.animation.core.b<>(Float.valueOf(1.0f), androidx.compose.animation.core.k2.i(kotlin.jvm.internal.a0.f75283a), null, null, 12, null);
        companion.getClass();
        g6 = t4.g(androidx.compose.ui.unit.q.b(androidx.compose.ui.unit.q.f21519c), null, 2, null);
        this.placementDelta = g6;
        this.visibility = androidx.compose.runtime.b.b(1.0f);
        this.layerBlock = new e();
        this.lookaheadOffset = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(float f4) {
        this.visibility.E(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean z4) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(boolean z4) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j4) {
        this.placementDelta.setValue(androidx.compose.ui.unit.q.b(j4));
    }

    public final void A(long j4) {
        this.rawOffset = j4;
    }

    public final void C() {
        if (t()) {
            x(false);
            kotlinx.coroutines.k.f(this.coroutineScope, null, null, new f(null), 3, null);
        }
        if (s()) {
            u(false);
            kotlinx.coroutines.k.f(this.coroutineScope, null, null, new g(null), 3, null);
        }
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        y(androidx.compose.ui.unit.q.f21519c);
        this.rawOffset = f6001o;
        B(1.0f);
    }

    public final void h() {
        p0<Float> p0Var = this.appearanceSpec;
        if (s() || p0Var == null) {
            return;
        }
        u(true);
        B(0.0f);
        kotlinx.coroutines.k.f(this.coroutineScope, null, null, new b(p0Var, null), 3, null);
    }

    public final void i(long delta) {
        p0<androidx.compose.ui.unit.q> p0Var = this.placementSpec;
        if (p0Var == null) {
            return;
        }
        long o4 = o();
        long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(o4) - ((int) (delta >> 32)), ((int) (o4 & 4294967295L)) - ((int) (delta & 4294967295L)));
        y(a5);
        x(true);
        kotlinx.coroutines.k.f(this.coroutineScope, null, null, new c(p0Var, a5, null), 3, null);
    }

    public final void j() {
        if (t()) {
            kotlinx.coroutines.k.f(this.coroutineScope, null, null, new d(null), 3, null);
        }
    }

    @fg.m
    public final p0<Float> k() {
        return this.appearanceSpec;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @fg.l
    public final ld.l<q4, kotlin.k2> m() {
        return this.layerBlock;
    }

    /* renamed from: n, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o() {
        return ((androidx.compose.ui.unit.q) this.placementDelta.getValue()).getPackedValue();
    }

    @fg.m
    public final p0<androidx.compose.ui.unit.q> p() {
        return this.placementSpec;
    }

    /* renamed from: q, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    public final float r() {
        return this.visibility.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    public final void v(@fg.m p0<Float> p0Var) {
        this.appearanceSpec = p0Var;
    }

    public final void w(long j4) {
        this.lookaheadOffset = j4;
    }

    public final void z(@fg.m p0<androidx.compose.ui.unit.q> p0Var) {
        this.placementSpec = p0Var;
    }
}
