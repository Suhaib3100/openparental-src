package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u000b\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¨\u0006!"}, d2 = {"Lkotlinx/coroutines/s3;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Lkotlinx/coroutines/k2;)V", "", "state", "", "b", "(I)Ljava/lang/Void;", "f", "()V", "a", "c", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/k2;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/m1;", "d", "Lkotlinx/coroutines/m1;", "cancelHandle", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class s3 implements ld.l<Throwable, kotlin.k2> {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80942e = AtomicIntegerFieldUpdater.newUpdater(s3.class, ProtectedSandApp.s("衬\u0001"));

    @kd.x
    private volatile int _state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 job;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private m1 cancelHandle;

    public s3(@fg.l k2 k2Var) {
        this.job = k2Var;
    }

    private final Void b(int state) {
        throw new IllegalStateException((ProtectedSandApp.s("衭\u0001") + state).toString());
    }

    private final void d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final void a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80942e;
        while (true) {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i4);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f80942e.compareAndSet(this, i4, 1)) {
                m1 m1Var = this.cancelHandle;
                if (m1Var != null) {
                    m1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void c(@fg.m Throwable cause) {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f80942e;
        do {
            i4 = atomicIntegerFieldUpdater2.get(this);
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    return;
                }
                b(i4);
                throw new KotlinNothingValueException();
            }
            atomicIntegerFieldUpdater = f80942e;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 2));
        this.targetThread.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void f() {
        int i4;
        this.cancelHandle = this.job.K0(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80942e;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 2 || i4 == 3) {
                    return;
                }
                b(i4);
                throw new KotlinNothingValueException();
            }
        } while (!f80942e.compareAndSet(this, i4, 0));
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
        c(th);
        return kotlin.k2.f75408a;
    }
}
