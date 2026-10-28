package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.b3;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.y2;
import q3.l;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lkotlinx/coroutines/android/d;", "Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/e1;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "T0", "", "B0", "y0", "", "timeMillis", "Lkotlinx/coroutines/q;", "continuation", "g", "Lkotlinx/coroutines/p1;", "b0", "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", "q", "Landroid/os/Handler;", "handler", "r", "Ljava/lang/String;", "name", "s", "Z", "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/d;", "t", "U0", "()Lkotlinx/coroutines/android/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class d extends e implements e1 {

    @d5.e
    private volatile d _immediate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Handler handler;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String name;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d immediate;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/m2;", "run", "()V", "kotlinx/coroutines/j3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q f27266o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f27267p;

        public a(q qVar, d dVar) {
            this.f27266o = qVar;
            this.f27267p = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27266o.W(this.f27267p, m2.f23662a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements l<Throwable, m2> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Runnable f27269q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f27269q = runnable;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            d.this.handler.removeCallbacks(this.f27269q);
        }
    }

    private d(Handler handler, String str, boolean z5) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z5;
        this._immediate = z5 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.immediate = dVar;
    }

    private final void T0(CoroutineContext coroutineContext, Runnable runnable) {
        q2.f(coroutineContext, new CancellationException(ProtectedSandApp.s("遵") + this + ProtectedSandApp.s("遶")));
        m1.c().y0(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(d dVar, Runnable runnable) {
        dVar.handler.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.o0
    public boolean B0(@d5.d CoroutineContext context) {
        return (this.invokeImmediately && l0.g(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.y2
    public y2 J0() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.android.e
    public e N0() {
        return this.immediate;
    }

    @d5.d
    /* renamed from: U0, reason: from getter */
    public d getImmediate() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.android.e, kotlinx.coroutines.e1
    @d5.d
    public p1 b0(long timeMillis, @d5.d final Runnable block, @d5.d CoroutineContext context) {
        Handler handler = this.handler;
        if (timeMillis > kotlin.time.g.f27205c) {
            timeMillis = 4611686018427387903L;
        }
        if (handler.postDelayed(block, timeMillis)) {
            return new p1() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.p1
                public final void g() {
                    d.b1(d.this, block);
                }
            };
        }
        T0(context, block);
        return b3.f27276o;
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof d) && ((d) other).handler == this.handler;
    }

    @Override // kotlinx.coroutines.e1
    public void g(long j5, @d5.d q<? super m2> qVar) {
        a aVar = new a(qVar, this);
        Handler handler = this.handler;
        if (j5 > kotlin.time.g.f27205c) {
            j5 = 4611686018427387903L;
        }
        if (handler.postDelayed(aVar, j5)) {
            qVar.K(new b(aVar));
        } else {
            T0(qVar.getF23291o(), aVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.y2, kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        String M0 = M0();
        if (M0 != null) {
            return M0;
        }
        String str = this.name;
        if (str == null) {
            str = this.handler.toString();
        }
        return this.invokeImmediately ? androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("遷")) : str;
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        T0(coroutineContext, runnable);
    }

    public d(@d5.d Handler handler, @d5.e String str) {
        this(handler, str, false);
    }

    public d(Handler handler, String str, int i5, w wVar) {
        this(handler, (i5 & 2) != 0 ? null : str, false);
    }
}
