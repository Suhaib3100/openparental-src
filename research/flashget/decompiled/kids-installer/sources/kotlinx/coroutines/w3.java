package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lkotlinx/coroutines/w3;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "b", "(I)Ljava/lang/Void;", "d", "()V", "a", "c", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/n2;", "o", "Lkotlinx/coroutines/n2;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "p", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/p1;", "q", "Lkotlinx/coroutines/p1;", "cancelHandle", "<init>", "(Lkotlinx/coroutines/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class w3 implements q3.l<Throwable, kotlin.m2> {

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29057r = AtomicIntegerFieldUpdater.newUpdater(w3.class, ProtectedSandApp.s("醎"));

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final n2 job;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private p1 cancelHandle;

    @d5.d
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    public w3(@d5.d n2 n2Var) {
        this.job = n2Var;
    }

    private final Void b(int state) {
        throw new IllegalStateException((ProtectedSandApp.s("醏") + state).toString());
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        c(th);
        return kotlin.m2.f23662a;
    }

    public final void a() {
        while (true) {
            int i5 = this._state;
            if (i5 != 0) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i5);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f29057r.compareAndSet(this, i5, 1)) {
                p1 p1Var = this.cancelHandle;
                if (p1Var != null) {
                    p1Var.g();
                    return;
                }
                return;
            }
        }
    }

    public void c(@d5.e Throwable cause) {
        int i5;
        do {
            i5 = this._state;
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    return;
                }
                b(i5);
                throw new KotlinNothingValueException();
            }
        } while (!f29057r.compareAndSet(this, i5, 2));
        this.targetThread.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i5;
        this.cancelHandle = this.job.P(true, true, this);
        do {
            i5 = this._state;
            if (i5 != 0) {
                if (i5 == 2 || i5 == 3) {
                    return;
                }
                b(i5);
                throw new KotlinNothingValueException();
            }
        } while (!f29057r.compareAndSet(this, i5, 0));
    }
}
