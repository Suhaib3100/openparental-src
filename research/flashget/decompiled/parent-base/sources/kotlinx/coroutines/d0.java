package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/d0;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "b", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f79644b = AtomicIntegerFieldUpdater.newUpdater(d0.class, ProtectedSandApp.s("蚈\u0001"));

    @kd.x
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Throwable cause;

    public d0(@fg.l Throwable th, boolean z4) {
        this.cause = th;
        this._handled = z4 ? 1 : 0;
    }

    public final boolean a() {
        return f79644b.get(this) != 0;
    }

    public final boolean b() {
        return f79644b.compareAndSet(this, 0, 1);
    }

    @fg.l
    public String toString() {
        return w0.a(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ d0(Throwable th, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(th, (i4 & 2) != 0 ? false : z4);
    }
}
