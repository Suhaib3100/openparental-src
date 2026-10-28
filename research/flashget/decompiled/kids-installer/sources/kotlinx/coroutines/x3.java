package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/x3;", "U", "T", "Lkotlinx/coroutines/internal/n0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/m2;", "run", "", "h1", "()Ljava/lang/String;", "", "r", "J", "time", "Lkotlin/coroutines/d;", "uCont", "<init>", "(JLkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class x3<U, T extends U> extends kotlinx.coroutines.internal.n0<T> implements Runnable {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final long time;

    public x3(long j5, @d5.d Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.time = j5;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.u2
    @d5.d
    public String h1() {
        return z0.a(this) + ProtectedSandApp.s("醐") + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        x0(y3.a(this.time, this));
    }
}
