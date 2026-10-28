package kotlin.coroutines.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: RunSuspend.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004R-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/jvm/internal/l;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "<init>", "()V", "Lkotlin/z0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "a", "b", "Lkotlin/z0;", "()Lkotlin/z0;", "c", "(Lkotlin/z0;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class l implements kotlin.coroutines.d<k2> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private z0<k2> result;

    public final void a() {
        synchronized (this) {
            while (true) {
                try {
                    z0<k2> z0Var = this.result;
                    if (z0Var == null) {
                        l0.n(this, ProtectedSandApp.s("挾\u0001"));
                        wait();
                    } else {
                        a1.n(z0Var.getValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @fg.m
    public final z0<k2> b() {
        return this.result;
    }

    public final void c(@fg.m z0<k2> z0Var) {
        this.result = z0Var;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        return kotlin.coroutines.i.f75057b;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@fg.l Object result) {
        synchronized (this) {
            this.result = z0.a(result);
            l0.n(this, ProtectedSandApp.s("挾\u0001"));
            notifyAll();
            k2 k2Var = k2.f75408a;
        }
    }
}
