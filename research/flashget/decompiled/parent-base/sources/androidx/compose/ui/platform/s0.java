package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.u;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Landroidx/compose/ui/platform/q2;", "Lkotlinx/coroutines/r0;", "Landroid/view/View;", "view", "Landroidx/compose/ui/text/input/b1;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/b1;Lkotlinx/coroutines/r0;)V", "Landroidx/compose/ui/platform/l2;", "request", "", "b", "(Landroidx/compose/ui/platform/l2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "d", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "c", "Landroidx/compose/ui/text/input/b1;", "Lkotlinx/coroutines/r0;", "Landroidx/compose/ui/u;", "Landroidx/compose/ui/platform/v1;", "e", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "", "()Z", "isReadyForConnection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 implements q2, kotlinx.coroutines.r0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20108f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final View view;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.b1 textInputService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 coroutineScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<u.a<Object>> methodSessionMutex = androidx.compose.ui.u.b();

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {69}, m = "startInputMethod", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20113b;

        /* renamed from: d, reason: collision with root package name */
        int f20115d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20113b = obj;
            this.f20115d |= Integer.MIN_VALUE;
            return s0.this.b(null, this);
        }
    }

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/r0;", "coroutineScope", "Landroidx/compose/ui/platform/v1;", "a", "(Lkotlinx/coroutines/r0;)Landroidx/compose/ui/platform/v1;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<kotlinx.coroutines.r0, v1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l2 f20116b;

        /* compiled from: AndroidPlatformTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f20117b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.r0 r0Var) {
                super(0);
                this.f20117b = r0Var;
            }

            public final void a() {
                kotlinx.coroutines.s0.f(this.f20117b, null, 1, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l2 l2Var) {
            super(1);
            this.f20116b = l2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v1 invoke(@fg.l kotlinx.coroutines.r0 r0Var) {
            return new v1(this.f20116b, new a(r0Var));
        }
    }

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {158}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/v1;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/v1;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,157:1\n314#2,11:158\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n77#1:158,11\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<v1, kotlin.coroutines.d<?>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f20118b;

        /* renamed from: c, reason: collision with root package name */
        int f20119c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f20120d;

        /* compiled from: AndroidPlatformTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v1 f20122b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s0 f20123c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v1 v1Var, s0 s0Var) {
                super(1);
                this.f20122b = v1Var;
                this.f20123c = s0Var;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                this.f20122b.b();
                this.f20123c.textInputService.f();
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l v1 v1Var, @fg.m kotlin.coroutines.d<?> dVar) {
            return ((c) create(v1Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = s0.this.new c(dVar);
            cVar.f20120d = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20119c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                v1 v1Var = (v1) this.f20120d;
                s0 s0Var = s0.this;
                this.f20120d = v1Var;
                this.f20118b = s0Var;
                this.f20119c = 1;
                kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(this), 1);
                qVar.e0();
                s0Var.textInputService.e();
                qVar.k0(new a(v1Var, s0Var));
                Object y4 = qVar.y();
                if (y4 == aVar) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y4 == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public s0(@fg.l View view, @fg.l androidx.compose.ui.text.input.b1 b1Var, @fg.l kotlinx.coroutines.r0 r0Var) {
        this.view = view;
        this.textInputService = b1Var;
        this.coroutineScope = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.platform.o2
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@fg.l androidx.compose.ui.platform.l2 r6, @fg.l kotlin.coroutines.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.s0.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.s0$a r0 = (androidx.compose.ui.platform.s0.a) r0
            int r1 = r0.f20115d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20115d = r1
            goto L18
        L13:
            androidx.compose.ui.platform.s0$a r0 = new androidx.compose.ui.platform.s0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20113b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20115d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.a1.n(r7)
            goto L48
        L2f:
            kotlin.a1.n(r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.u$a<java.lang.Object>> r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.s0$b r2 = new androidx.compose.ui.platform.s0$b
            r2.<init>(r6)
            androidx.compose.ui.platform.s0$c r6 = new androidx.compose.ui.platform.s0$c
            r4 = 0
            r6.<init>(r4)
            r0.f20115d = r3
            java.lang.Object r6 = androidx.compose.ui.u.j(r7, r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s0.b(androidx.compose.ui.platform.l2, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final InputConnection d(@fg.l EditorInfo outAttrs) {
        v1 v1Var = (v1) androidx.compose.ui.u.f(this.methodSessionMutex);
        if (v1Var != null) {
            return v1Var.a(outAttrs);
        }
        return null;
    }

    public final boolean e() {
        v1 v1Var = (v1) androidx.compose.ui.u.f(this.methodSessionMutex);
        return v1Var != null && v1Var.c();
    }

    @Override // androidx.compose.ui.platform.o2
    @fg.l
    public View getView() {
        return this.view;
    }

    @Override // kotlinx.coroutines.r0
    @fg.l
    /* renamed from: q */
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }
}
