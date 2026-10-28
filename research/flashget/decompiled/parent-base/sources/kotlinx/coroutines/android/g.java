package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.i;
import kd.j;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.z0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/e;", "i", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/e;", "Landroid/os/Looper;", "", "async", "e", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "Lkotlinx/coroutines/p;", "cont", "Lkotlin/k2;", "n", "(Lkotlinx/coroutines/p;)V", "Landroid/view/Choreographer;", "choreographer", "l", "(Landroid/view/Choreographer;Lkotlinx/coroutines/p;)V", "a", "J", "MAX_DELAY", "b", "Lkotlinx/coroutines/android/e;", "k", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f79266a = 4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    @m
    @kd.f
    public static final e f79267b;

    @m
    private static volatile Choreographer choreographer;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/k2;", "run", "()V", "kotlinx/coroutines/f3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,18:1\n202#2,2:19\n*E\n"})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f79268b;

        public a(p pVar) {
            this.f79268b = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.n(this.f79268b);
        }
    }

    static {
        Object a5;
        try {
            z0.Companion companion = z0.INSTANCE;
            a5 = new d(e(Looper.getMainLooper(), true), null, 2, null);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        f79267b = (e) (z0.i(a5) ? null : a5);
    }

    @l
    @m1
    public static final Handler e(@l Looper looper, boolean z4) {
        if (!z4) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod(ProtectedSandApp.s("薣\u0001"), Looper.class).invoke(null, looper);
            l0.n(invoke, ProtectedSandApp.s("薤\u0001"));
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @m
    public static final Object f(@l kotlin.coroutines.d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return g(dVar);
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        l(choreographer2, qVar);
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(kotlin.coroutines.d<? super Long> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(qVar);
        } else {
            j1.e().S0(qVar.getF75054b(), new a(qVar));
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }

    @l
    @j
    @i(name = "from")
    public static final e h(@l Handler handler) {
        return j(handler, null, 1, null);
    }

    @l
    @j
    @i(name = "from")
    public static final e i(@l Handler handler, @m String str) {
        return new d(handler, str);
    }

    public static e j(Handler handler, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        return new d(handler, str);
    }

    @k(level = kotlin.m.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Choreographer choreographer2, final p<? super Long> pVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                g.m(p.this, j4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p pVar, long j4) {
        pVar.Z(j1.e(), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(p<? super Long> pVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            l0.m(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, pVar);
    }
}
