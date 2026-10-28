package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.k2;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u000fJ\"\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J*\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00104\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b6\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010TR \u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010W\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/layout/c3;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/h;", "windowInsets", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/b2;", "sideCalculator", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/foundation/layout/h;Landroid/view/View;Landroidx/compose/foundation/layout/b2;Landroidx/compose/ui/unit/d;)V", "Lkotlin/k2;", "r", "()V", "Landroid/view/WindowInsetsAnimationController;", "m", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Li0/f;", "available", "", "scrollAmount", "s", "(JF)J", "Landroidx/compose/ui/unit/c0;", "flingAmount", "", "towardShown", "l", "(JFZLkotlin/coroutines/d;)Ljava/lang/Object;", "inset", "i", "(F)V", "j", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "i5", "(JI)J", "consumed", "H2", "(JJI)J", "F5", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "w0", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "controller", "", "types", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "k", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", "b", "Landroidx/compose/foundation/layout/h;", "q", "()Landroidx/compose/foundation/layout/h;", "c", "Landroid/view/View;", "p", "()Landroid/view/View;", "d", "Landroidx/compose/foundation/layout/b2;", "o", "()Landroidx/compose/foundation/layout/b2;", "e", "Landroidx/compose/ui/unit/d;", "n", "()Landroidx/compose/ui/unit/d;", "f", "Landroid/view/WindowInsetsAnimationController;", "animationController", "g", "Z", "isControllerRequested", "Landroid/os/CancellationSignal;", "h", "Landroid/os/CancellationSignal;", "cancellationSignal", "F", "partialConsumption", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/k2;", "animationJob", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/p;", "continuation", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(30)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,725:1\n314#2,11:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n213#1:726,11\n*E\n"})
/* loaded from: classes.dex */
final class c3 implements androidx.compose.ui.input.nestedscroll.a, WindowInsetsAnimationControlListener {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h windowInsets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b2 sideCalculator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private WindowInsetsAnimationController animationController;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isControllerRequested;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CancellationSignal cancellationSignal = new CancellationSignal();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float partialConsumption;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 animationJob;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.p<? super WindowInsetsAnimationController> continuation;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4924b = new a(1);

        a() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.l Throwable th) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(Throwable th) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f4925b = new b(1);

        b() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.l Throwable th) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(Throwable th) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {320, 346, 371}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f4926b;

        /* renamed from: c, reason: collision with root package name */
        Object f4927c;

        /* renamed from: d, reason: collision with root package name */
        long f4928d;

        /* renamed from: e, reason: collision with root package name */
        float f4929e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4930f;

        /* renamed from: h, reason: collision with root package name */
        int f4932h;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f4930f = obj;
            this.f4932h |= Integer.MIN_VALUE;
            return c3.this.l(0L, 0.0f, false, this);
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4933b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4934c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4936e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f4937f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h2 f4938g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4939h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f4940i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ k1.e f4941j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f4942k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f4943l;

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4944b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4945c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f4946d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h2 f4947e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f4948f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f4949g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c3 f4950h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ k1.e f4951i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ WindowInsetsAnimationController f4952j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f4953k;

            /* compiled from: WindowInsetsConnection.android.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "velocity", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.layout.c3$d$a$a, reason: collision with other inner class name */
            static final class C0091a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f4954b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f4955c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ c3 f4956d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ k1.e f4957e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ WindowInsetsAnimationController f4958f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f4959g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0091a(int i4, int i5, c3 c3Var, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4) {
                    super(2);
                    this.f4954b = i4;
                    this.f4955c = i5;
                    this.f4956d = c3Var;
                    this.f4957e = eVar;
                    this.f4958f = windowInsetsAnimationController;
                    this.f4959g = z4;
                }

                public final void a(float f4, float f5) {
                    float f6 = this.f4954b;
                    if (f4 <= this.f4955c && f6 <= f4) {
                        this.f4956d.i(f4);
                        return;
                    }
                    this.f4957e.f75326b = f5;
                    this.f4958f.finish(this.f4959g);
                    this.f4956d.animationController = null;
                    kotlinx.coroutines.k2 k2Var = this.f4956d.animationJob;
                    if (k2Var != null) {
                        k2Var.b(new o2());
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4, Float f5) {
                    a(f4.floatValue(), f5.floatValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i4, float f4, h2 h2Var, int i5, int i6, c3 c3Var, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4945c = i4;
                this.f4946d = f4;
                this.f4947e = h2Var;
                this.f4948f = i5;
                this.f4949g = i6;
                this.f4950h = c3Var;
                this.f4951i = eVar;
                this.f4952j = windowInsetsAnimationController;
                this.f4953k = z4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f4945c, this.f4946d, this.f4947e, this.f4948f, this.f4949g, this.f4950h, this.f4951i, this.f4952j, this.f4953k, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4944b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    float f4 = this.f4945c;
                    float f5 = this.f4946d;
                    h2 h2Var = this.f4947e;
                    C0091a c0091a = new C0091a(this.f4948f, this.f4949g, this.f4950h, this.f4951i, this.f4952j, this.f4953k);
                    this.f4944b = 1;
                    if (androidx.compose.animation.core.c2.i(f4, f5, h2Var, c0091a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, float f4, h2 h2Var, int i5, int i6, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f4936e = i4;
            this.f4937f = f4;
            this.f4938g = h2Var;
            this.f4939h = i5;
            this.f4940i = i6;
            this.f4941j = eVar;
            this.f4942k = windowInsetsAnimationController;
            this.f4943l = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = c3.this.new d(this.f4936e, this.f4937f, this.f4938g, this.f4939h, this.f4940i, this.f4941j, this.f4942k, this.f4943l, dVar);
            dVar2.f4934c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4933b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f4934c;
                c3 c3Var = c3.this;
                f4 = kotlinx.coroutines.k.f(r0Var, null, null, new a(this.f4936e, this.f4937f, this.f4938g, this.f4939h, this.f4940i, c3Var, this.f4941j, this.f4942k, this.f4943l, null), 3, null);
                c3Var.animationJob = f4;
                kotlinx.coroutines.k2 k2Var = c3.this.animationJob;
                if (k2Var != null) {
                    this.f4933b = 1;
                    if (k2Var.j0(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            c3.this.animationJob = null;
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4960b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4961c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4963e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4964f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f4965g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f4966h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f4967i;

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4968b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4969c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f4970d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f4971e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ WindowInsetsAnimationController f4972f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f4973g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c3 f4974h;

            /* compiled from: WindowInsetsConnection.android.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/b;", "", "Landroidx/compose/animation/core/o;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.layout.c3$e$a$a, reason: collision with other inner class name */
            static final class C0092a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o>, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c3 f4975b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0092a(c3 c3Var) {
                    super(1);
                    this.f4975b = c3Var;
                }

                public final void a(@fg.l androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar) {
                    this.f4975b.i(bVar.v().floatValue());
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar) {
                    a(bVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i4, int i5, float f4, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, c3 c3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4969c = i4;
                this.f4970d = i5;
                this.f4971e = f4;
                this.f4972f = windowInsetsAnimationController;
                this.f4973g = z4;
                this.f4974h = c3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f4969c, this.f4970d, this.f4971e, this.f4972f, this.f4973g, this.f4974h, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4968b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.animation.core.b b5 = androidx.compose.animation.core.c.b(this.f4969c, 0.0f, 2, null);
                    Float f4 = new Float(this.f4970d);
                    Float f5 = new Float(this.f4971e);
                    C0092a c0092a = new C0092a(this.f4974h);
                    this.f4968b = 1;
                    if (androidx.compose.animation.core.b.i(b5, f4, null, f5, c0092a, this, 2, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                this.f4972f.finish(this.f4973g);
                this.f4974h.animationController = null;
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i4, int i5, float f4, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f4963e = i4;
            this.f4964f = i5;
            this.f4965g = f4;
            this.f4966h = windowInsetsAnimationController;
            this.f4967i = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = c3.this.new e(this.f4963e, this.f4964f, this.f4965g, this.f4966h, this.f4967i, dVar);
            eVar.f4961c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.k2 f4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4960b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f4961c;
            c3 c3Var = c3.this;
            f4 = kotlinx.coroutines.k.f(r0Var, null, null, new a(this.f4963e, this.f4964f, this.f4965g, this.f4966h, this.f4967i, c3Var, null), 3, null);
            c3Var.animationJob = f4;
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f4976b = new f(1);

        f() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.l Throwable th) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(Throwable th) {
            return kotlin.k2.f75408a;
        }
    }

    public c3(@fg.l h hVar, @fg.l View view, @fg.l b2 b2Var, @fg.l androidx.compose.ui.unit.d dVar) {
        this.windowInsets = hVar;
        this.view = view;
        this.sideCalculator = b2Var;
        this.density = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(float inset) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.c(currentInsets, kotlin.math.b.L0(inset)), 1.0f, 0.0f);
        }
    }

    private final void j() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.g());
            }
        }
        this.animationController = null;
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.W(null, a.f4924b);
        }
        this.continuation = null;
        kotlinx.coroutines.k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2Var.b(new o2());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r26, float r28, boolean r29, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r30) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.c3.l(long, float, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(kotlin.coroutines.d<? super WindowInsetsAnimationController> dVar) {
        Object obj = this.animationController;
        if (obj == null) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            qVar.e0();
            this.continuation = qVar;
            r();
            obj = qVar.y();
            if (obj == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        WindowInsetsController windowInsetsController;
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, v2.a(this));
        }
    }

    private final long s(long available, float scrollAmount) {
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        kotlinx.coroutines.k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2Var.b(new o2());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.g() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    r();
                    return this.sideCalculator.f(available);
                }
                b2 b2Var = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                int e4 = b2Var.e(hiddenStateInsets);
                b2 b2Var2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                int e5 = b2Var2.e(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int e6 = this.sideCalculator.e(currentInsets);
                if (e6 == (scrollAmount > 0.0f ? e5 : e4)) {
                    this.partialConsumption = 0.0f;
                    i0.f.INSTANCE.getClass();
                    return i0.f.f74147c;
                }
                float f4 = e6 + scrollAmount + this.partialConsumption;
                int I = kotlin.ranges.s.I(kotlin.math.b.L0(f4), e4, e5);
                this.partialConsumption = f4 - kotlin.math.b.L0(f4);
                if (I != e6) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.c(currentInsets, I), 1.0f, 0.0f);
                }
                return this.sideCalculator.f(available);
            }
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    public Object F5(long j4, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return l(j4, this.sideCalculator.d(androidx.compose.ui.unit.c0.l(j4), androidx.compose.ui.unit.c0.n(j4)), false, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long H2(long consumed, long available, int source) {
        return s(available, this.sideCalculator.a(i0.f.p(available), i0.f.r(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long i5(long available, int source) {
        return s(available, this.sideCalculator.d(i0.f.p(available), i0.f.r(available)));
    }

    public final void k() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.W(null, b.f4925b);
        }
        kotlinx.coroutines.k2 k2Var = this.animationJob;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.l0.g(currentInsets, hiddenStateInsets));
        }
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final b2 getSideCalculator() {
        return this.sideCalculator;
    }

    public void onCancelled(@fg.m WindowInsetsAnimationController controller) {
        j();
    }

    public void onFinished(@fg.l WindowInsetsAnimationController controller) {
        j();
    }

    public void onReady(@fg.l WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.W(controller, f.f4976b);
        }
        this.continuation = null;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final h getWindowInsets() {
        return this.windowInsets;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @fg.m
    public Object w0(long j4, long j5, @fg.l kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return l(j5, this.sideCalculator.a(androidx.compose.ui.unit.c0.l(j5), androidx.compose.ui.unit.c0.n(j5)), true, dVar);
    }
}
