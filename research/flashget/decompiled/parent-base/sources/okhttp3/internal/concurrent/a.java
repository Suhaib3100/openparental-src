package okhttp3.internal.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000fR\"\u0010\u001c\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0012\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/internal/concurrent/a;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "f", "()J", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/k2;", "e", "(Lokhttp3/internal/concurrent/c;)V", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/internal/concurrent/c;", "d", "()Lokhttp3/internal/concurrent/c;", "h", "b", "J", "c", "g", "(J)V", "nextExecuteNanoTime", "Ljava/lang/String;", "Z", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private c queue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long nextExecuteNanoTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean cancelable;

    public a(@l String str, boolean z4) {
        l0.p(str, ProtectedSandApp.s("ꀤ\u0001"));
        this.name = str;
        this.cancelable = z4;
        this.nextExecuteNanoTime = -1L;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    @m
    /* renamed from: d, reason: from getter */
    public final c getQueue() {
        return this.queue;
    }

    public final void e(@l c queue) {
        l0.p(queue, ProtectedSandApp.s("ꀥ\u0001"));
        c cVar = this.queue;
        if (cVar == queue) {
            return;
        }
        if (!(cVar == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꀦ\u0001"));
        }
        this.queue = queue;
    }

    public abstract long f();

    public final void g(long j4) {
        this.nextExecuteNanoTime = j4;
    }

    public final void h(@m c cVar) {
        this.queue = cVar;
    }

    @l
    public String toString() {
        return this.name;
    }

    public /* synthetic */ a(String str, boolean z4, int i4, w wVar) {
        this(str, (i4 & 2) != 0 ? true : z4);
    }
}
