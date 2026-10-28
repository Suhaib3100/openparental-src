package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.ranges.s;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.v2;
import kotlinx.coroutines.y2;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00104\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lkotlinx/coroutines/android/d;", "Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/b1;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "y1", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "c1", "(Lkotlin/coroutines/g;)Z", "S0", "", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "a", "(JLkotlinx/coroutines/p;)V", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Landroid/os/Handler;", "e", "Ljava/lang/String;", "f", "Z", "_immediate", "Lkotlinx/coroutines/android/d;", "g", "B1", "()Lkotlinx/coroutines/android/d;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
/* loaded from: classes7.dex */
public final class d extends e implements b1 {

    @m
    private volatile d _immediate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Handler handler;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final String name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final d immediate;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/k2;", "run", "()V", "kotlinx/coroutines/f3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n148#2:19\n149#2:21\n1#3:20\n*E\n"})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f79261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f79262c;

        public a(p pVar, d dVar) {
            this.f79261b = pVar;
            this.f79262c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f79261b.Z(this.f79262c, k2.f75408a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f79264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f79264c = runnable;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            d.this.handler.removeCallbacks(this.f79264c);
        }
    }

    private d(Handler handler, String str, boolean z4) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z4;
        this._immediate = z4 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.immediate = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(d dVar, Runnable runnable) {
        dVar.handler.removeCallbacks(runnable);
    }

    private final void y1(kotlin.coroutines.g context, Runnable block) {
        n2.f(context, new CancellationException(ProtectedSandApp.s("薠\u0001") + this + ProtectedSandApp.s("薡\u0001")));
        j1.c().S0(context, block);
    }

    @l
    /* renamed from: B1, reason: from getter */
    public d getImmediate() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@l kotlin.coroutines.g context, @l Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        y1(context, block);
    }

    @Override // kotlinx.coroutines.b1
    public void a(long timeMillis, @l p<? super k2> continuation) {
        a aVar = new a(continuation, this);
        if (this.handler.postDelayed(aVar, s.C(timeMillis, kotlin.time.g.f79218c))) {
            continuation.k0(new b(aVar));
        } else {
            y1(continuation.getF75054b(), aVar);
        }
    }

    @Override // kotlinx.coroutines.m0
    public boolean c1(@l kotlin.coroutines.g context) {
        return (this.invokeImmediately && l0.g(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public boolean equals(@m Object other) {
        return (other instanceof d) && ((d) other).handler == this.handler;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.v2
    public v2 j1() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.android.e
    public e l1() {
        return this.immediate;
    }

    @Override // kotlinx.coroutines.android.e, kotlinx.coroutines.b1
    @l
    public m1 q(long timeMillis, @l final Runnable block, @l kotlin.coroutines.g context) {
        if (this.handler.postDelayed(block, s.C(timeMillis, kotlin.time.g.f79218c))) {
            return new m1() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.m1
                public final void dispose() {
                    d.D1(d.this, block);
                }
            };
        }
        y1(context, block);
        return y2.f81204b;
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.m0
    @l
    public String toString() {
        String k12 = k1();
        if (k12 != null) {
            return k12;
        }
        String str = this.name;
        if (str == null) {
            str = this.handler.toString();
        }
        return this.invokeImmediately ? j.a(str, ProtectedSandApp.s("薢\u0001")) : str;
    }

    public d(@l Handler handler, @m String str) {
        this(handler, str, false);
    }

    public d(Handler handler, String str, int i4, w wVar) {
        this(handler, (i4 & 2) != 0 ? null : str, false);
    }
}
