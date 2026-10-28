package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s;
import p3.i;
import p3.j;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/e;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/e;", "Landroid/os/Looper;", "", "async", "d", "", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q;", "cont", "Lkotlin/m2;", "l", "Landroid/view/Choreographer;", "choreographer", "j", "a", "J", "MAX_DELAY", "b", "Lkotlinx/coroutines/android/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f27271a = 4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    @p3.f
    public static final e f27272b;

    @d5.e
    private static volatile Choreographer choreographer;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/m2;", "run", "()V", "kotlinx/coroutines/j3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q f27273o;

        public a(q qVar) {
            this.f27273o = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.l(this.f27273o);
        }
    }

    static {
        Object a6;
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(new d(d(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = a1.a(th);
        }
        f27272b = (e) (Result.i(a6) ? null : a6);
    }

    @m1
    @d5.d
    public static final Handler d(@d5.d Looper looper, boolean z5) {
        if (!z5) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod(ProtectedSandApp.s("岟"), Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException(ProtectedSandApp.s("岠"));
    }

    @d5.e
    public static final Object e(@d5.d Continuation<? super Long> continuation) {
        Continuation e6;
        Continuation e7;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            e7 = kotlin.coroutines.intrinsics.c.e(continuation);
            s sVar = new s(e7, 1);
            sVar.X();
            j(choreographer2, sVar);
            Object A = sVar.A();
            if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
                h.c(continuation);
            }
            return A;
        }
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar2 = new s(e6, 1);
        sVar2.X();
        kotlinx.coroutines.m1.e().y0(EmptyCoroutineContext.f23294o, new a(sVar2));
        Object A2 = sVar2.A();
        if (A2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            h.c(continuation);
        }
        return A2;
    }

    @i(name = "from")
    @d5.d
    @j
    public static final e f(@d5.d Handler handler) {
        return h(handler, null, 1, null);
    }

    @i(name = "from")
    @d5.d
    @j
    public static final e g(@d5.d Handler handler, @d5.e String str) {
        return new d(handler, str);
    }

    public static e h(Handler handler, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        return new d(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Choreographer choreographer2, final q<? super Long> qVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                g.k(q.this, j5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(q qVar, long j5) {
        qVar.W(kotlinx.coroutines.m1.e(), Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(q<? super Long> qVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            l0.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, qVar);
    }
}
