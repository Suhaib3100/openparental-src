package androidx.compose.material.ripple;

import androidx.compose.animation.core.h2;
import androidx.compose.animation.core.m0;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.y;

/* compiled from: RippleAnimation.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R+\u00103\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010.\u001a\u0004\b-\u00100\"\u0004\b4\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material/ripple/i;", "", "Li0/f;", "origin", "Landroidx/compose/ui/unit/h;", "radius", "", "bounded", "<init>", "(Li0/f;FZLkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "h", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "i", "f", "j", "()V", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/graphics/d2;", "color", "g", "(Landroidx/compose/ui/graphics/drawscope/f;J)V", "a", "Li0/f;", "b", "F", "c", "Z", "", "d", "Ljava/lang/Float;", "startRadius", "e", "targetRadius", "targetCenter", "Landroidx/compose/animation/core/b;", "Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/b;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/y;", "finishSignalDeferred", "<set-?>", "k", "Landroidx/compose/runtime/k2;", "l", "()Z", "n", "(Z)V", "finishedFadingIn", "m", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n137#3:201\n215#4,8:202\n262#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: m, reason: collision with root package name */
    public static final int f9319m = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.f origin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Float startRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Float targetRadius;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.f targetCenter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> animatedAlpha;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> animatedRadiusPercent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> animatedCenterPercent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y<k2> finishSignalDeferred;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 finishedFadingIn;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 finishRequested;

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f9332b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9333c;

        /* renamed from: e, reason: collision with root package name */
        int f9335e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f9333c = obj;
            this.f9335e |= Integer.MIN_VALUE;
            return i.this.f(this);
        }
    }

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9336b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9337c;

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9339b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f9340c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9340c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9340c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9339b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.animation.core.b bVar = this.f9340c.animatedAlpha;
                    Float f4 = new Float(1.0f);
                    h2 r4 = androidx.compose.animation.core.l.r(75, 0, m0.e(), 2, null);
                    this.f9339b = 1;
                    if (androidx.compose.animation.core.b.i(bVar, f4, r4, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.ripple.i$b$b, reason: collision with other inner class name */
        static final class C0204b extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9341b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f9342c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0204b(i iVar, kotlin.coroutines.d<? super C0204b> dVar) {
                super(2, dVar);
                this.f9342c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0204b(this.f9342c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9341b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.animation.core.b bVar = this.f9342c.animatedRadiusPercent;
                    Float f4 = new Float(1.0f);
                    h2 r4 = androidx.compose.animation.core.l.r(225, 0, m0.d(), 2, null);
                    this.f9341b = 1;
                    if (androidx.compose.animation.core.b.i(bVar, f4, r4, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0204b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9343b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f9344c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(i iVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f9344c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new c(this.f9344c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9343b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.animation.core.b bVar = this.f9344c.animatedCenterPercent;
                    Float f4 = new Float(1.0f);
                    h2 r4 = androidx.compose.animation.core.l.r(225, 0, m0.e(), 2, null);
                    this.f9343b = 1;
                    if (androidx.compose.animation.core.b.i(bVar, f4, r4, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = i.this.new b(dVar);
            bVar.f9337c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f9336b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            r0 r0Var = (r0) this.f9337c;
            kotlinx.coroutines.k.f(r0Var, null, null, new a(i.this, null), 3, null);
            kotlinx.coroutines.k.f(r0Var, null, null, new C0204b(i.this, null), 3, null);
            f4 = kotlinx.coroutines.k.f(r0Var, null, null, new c(i.this, null), 3, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/k2;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlinx.coroutines.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9345b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9346c;

        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9348b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f9349c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9349c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9349c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9348b;
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.compose.animation.core.b bVar = this.f9349c.animatedAlpha;
                    Float f4 = new Float(0.0f);
                    h2 r4 = androidx.compose.animation.core.l.r(150, 0, m0.e(), 2, null);
                    this.f9348b = 1;
                    if (androidx.compose.animation.core.b.i(bVar, f4, r4, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f9346c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f9345b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            f4 = kotlinx.coroutines.k.f((r0) this.f9346c, null, null, new a(i.this, null), 3, null);
            return f4;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlinx.coroutines.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public /* synthetic */ i(i0.f fVar, float f4, boolean z4, w wVar) {
        this(fVar, f4, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = s0.g(new b(null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = s0.g(new c(null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean k() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void m(boolean z4) {
        this.finishRequested.setValue(Boolean.valueOf(z4));
    }

    private final void n(boolean z4) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.i.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.i$a r0 = (androidx.compose.material.ripple.i.a) r0
            int r1 = r0.f9335e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9335e = r1
            goto L18
        L13:
            androidx.compose.material.ripple.i$a r0 = new androidx.compose.material.ripple.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9333c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f9335e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.a1.n(r7)
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f9332b
            androidx.compose.material.ripple.i r2 = (androidx.compose.material.ripple.i) r2
            kotlin.a1.n(r7)
            goto L64
        L3d:
            java.lang.Object r2 = r0.f9332b
            androidx.compose.material.ripple.i r2 = (androidx.compose.material.ripple.i) r2
            kotlin.a1.n(r7)
            goto L54
        L45:
            kotlin.a1.n(r7)
            r0.f9332b = r6
            r0.f9335e = r5
            java.lang.Object r7 = r6.h(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r6
        L54:
            r2.n(r5)
            kotlinx.coroutines.y<kotlin.k2> r7 = r2.finishSignalDeferred
            r0.f9332b = r2
            r0.f9335e = r4
            java.lang.Object r7 = r7.z(r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            r7 = 0
            r0.f9332b = r7
            r0.f9335e = r3
            java.lang.Object r7 = r2.i(r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.i.f(kotlin.coroutines.d):java.lang.Object");
    }

    public final void g(@fg.l androidx.compose.ui.graphics.drawscope.f fVar, long j4) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(j.b(fVar.e()));
        }
        if (this.targetRadius == null) {
            this.targetRadius = Float.isNaN(this.radius) ? Float.valueOf(j.a(fVar, this.bounded, fVar.e())) : Float.valueOf(fVar.v5(this.radius));
        }
        if (this.origin == null) {
            this.origin = i0.f.d(fVar.c0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = i0.f.d(i0.g.a(i0.n.t(fVar.e()) / 2.0f, i0.n.m(fVar.e()) / 2.0f));
        }
        float floatValue = (!k() || l()) ? this.animatedAlpha.v().floatValue() : 1.0f;
        Float f4 = this.startRadius;
        l0.m(f4);
        float floatValue2 = f4.floatValue();
        Float f5 = this.targetRadius;
        l0.m(f5);
        float a5 = androidx.compose.ui.util.d.a(floatValue2, f5.floatValue(), this.animatedRadiusPercent.v().floatValue());
        i0.f fVar2 = this.origin;
        l0.m(fVar2);
        float p4 = i0.f.p(fVar2.getPackedValue());
        i0.f fVar3 = this.targetCenter;
        l0.m(fVar3);
        float a6 = androidx.compose.ui.util.d.a(p4, i0.f.p(fVar3.getPackedValue()), this.animatedCenterPercent.v().floatValue());
        i0.f fVar4 = this.origin;
        l0.m(fVar4);
        float r4 = i0.f.r(fVar4.getPackedValue());
        i0.f fVar5 = this.targetCenter;
        l0.m(fVar5);
        long a7 = i0.g.a(a6, androidx.compose.ui.util.d.a(r4, i0.f.r(fVar5.getPackedValue()), this.animatedCenterPercent.v().floatValue()));
        long w4 = d2.w(j4, d2.A(j4) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            androidx.compose.ui.graphics.drawscope.f.u6(fVar, w4, a5, a7, 0.0f, null, null, 0, 120, null);
            return;
        }
        float t4 = i0.n.t(fVar.e());
        float m4 = i0.n.m(fVar.e());
        c2.INSTANCE.getClass();
        int i4 = c2.f17637d;
        androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
        long e4 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().b(0.0f, 0.0f, t4, m4, i4);
        androidx.compose.ui.graphics.drawscope.f.u6(fVar, w4, a5, a7, 0.0f, null, null, 0, 120, null);
        drawContext.i().o();
        drawContext.j(e4);
    }

    public final void j() {
        m(true);
        this.finishSignalDeferred.I(k2.f75408a);
    }

    private i(i0.f fVar, float f4, boolean z4) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.origin = fVar;
        this.radius = f4;
        this.bounded = z4;
        this.animatedAlpha = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = androidx.compose.animation.core.c.b(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = a0.b(null);
        Boolean bool = Boolean.FALSE;
        g4 = t4.g(bool, null, 2, null);
        this.finishedFadingIn = g4;
        g5 = t4.g(bool, null, 2, null);
        this.finishRequested = g5;
    }
}
