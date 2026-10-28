package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: AndroidUiDispatcher.android.kt */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/u0;", "Lkotlinx/coroutines/m0;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "L1", "()Ljava/lang/Runnable;", "Lkotlin/k2;", "S1", "()V", "", "frameTimeNanos", "M1", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "T1", "(Landroid/view/Choreographer$FrameCallback;)V", "W1", "Lkotlin/coroutines/g;", "context", "block", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "d", "Landroid/view/Choreographer;", "H1", "()Landroid/view/Choreographer;", "e", "Landroid/os/Handler;", "", "f", "Ljava/lang/Object;", "lock", "Lkotlin/collections/k;", "g", "Lkotlin/collections/k;", "toRunTrampolined", "", "h", "Ljava/util/List;", "toRunOnFrame", "i", "spareToRunOnFrame", "", "j", "Z", "scheduledTrampolineDispatch", "k", "scheduledFrameDispatch", "androidx/compose/ui/platform/u0$d", "l", "Landroidx/compose/ui/platform/u0$d;", "dispatchCallback", "Landroidx/compose/runtime/a2;", "m", "Landroidx/compose/runtime/a2;", "K1", "()Landroidx/compose/runtime/a2;", "frameClock", "n", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n35#2:192\n35#2:193\n35#2:194\n35#2:195\n35#2:196\n35#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* loaded from: classes.dex */
public final class u0 extends kotlinx.coroutines.m0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f20167o = 8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Choreographer choreographer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Handler handler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.collections.k<Runnable> toRunTrampolined;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d dispatchCallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.a2 frameClock;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final kotlin.b0<kotlin.coroutines.g> f20168p = kotlin.c0.c(a.f20180b);

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final ThreadLocal<kotlin.coroutines.g> f20169q = new b();

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/g;", "a", "()Lkotlin/coroutines/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.coroutines.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20180b = new a(0);

        /* compiled from: AndroidUiDispatcher.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.u0$a$a, reason: collision with other inner class name */
        static final class C0367a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super Choreographer>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f20181b;

            C0367a(kotlin.coroutines.d<? super C0367a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0367a(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f20181b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                return Choreographer.getInstance();
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super Choreographer> dVar) {
                return ((C0367a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.g invoke() {
            boolean b5;
            b5 = v0.b();
            u0 u0Var = new u0(b5 ? Choreographer.getInstance() : (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.j1.e(), new C0367a(2, null)), androidx.core.os.k.a(Looper.getMainLooper()), null);
            return g.b.a.d(u0Var, u0Var.getFrameClock());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/u0$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/g;", "a", "()Lkotlin/coroutines/g;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class b extends ThreadLocal<kotlin.coroutines.g> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.coroutines.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            u0 u0Var = new u0(choreographer, androidx.core.os.k.a(myLooper), null);
            return g.b.a.d(u0Var, u0Var.getFrameClock());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/u0$c;", "", "<init>", "()V", "Lkotlin/coroutines/g;", "Main$delegate", "Lkotlin/b0;", "b", "()Lkotlin/coroutines/g;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final kotlin.coroutines.g a() {
            boolean b5;
            b5 = v0.b();
            if (b5) {
                return b();
            }
            kotlin.coroutines.g gVar = (kotlin.coroutines.g) u0.f20169q.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        @fg.l
        public final kotlin.coroutines.g b() {
            return (kotlin.coroutines.g) u0.f20168p.getValue();
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/u0$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Lkotlin/k2;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n35#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            u0.this.handler.removeCallbacks(this);
            u0.this.S1();
            u0.this.M1(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.S1();
            Object obj = u0.this.lock;
            u0 u0Var = u0.this;
            synchronized (obj) {
                try {
                    if (u0Var.toRunOnFrame.isEmpty()) {
                        u0Var.getChoreographer().removeFrameCallback(this);
                        u0Var.scheduledFrameDispatch = false;
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ u0(Choreographer choreographer, Handler handler, kotlin.jvm.internal.w wVar) {
        this(choreographer, handler);
    }

    private final Runnable L1() {
        Runnable A;
        synchronized (this.lock) {
            A = this.toRunTrampolined.A();
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.get(i4).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        boolean z4;
        do {
            Runnable L1 = L1();
            while (L1 != null) {
                L1.run();
                L1 = L1();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z4 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z4 = true;
                }
            }
        } while (z4);
    }

    @fg.l
    /* renamed from: H1, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @fg.l
    /* renamed from: K1, reason: from getter */
    public final androidx.compose.runtime.a2 getFrameClock() {
        return this.frameClock;
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T1(@fg.l Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W1(@fg.l Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    private u0(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new kotlin.collections.k<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new d();
        this.frameClock = new w0(choreographer, this);
    }
}
