package okhttp3.internal.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c¨\u0006 "}, d2 = {"Lokhttp3/internal/concurrent/a;", "", "", "f", "Lokhttp3/internal/concurrent/c;", "queue", "Lkotlin/m2;", "e", "(Lokhttp3/internal/concurrent/c;)V", "", "toString", "a", "Lokhttp3/internal/concurrent/c;", "d", "()Lokhttp3/internal/concurrent/c;", "h", "b", "J", "c", "()J", "g", "(J)V", "nextExecuteNanoTime", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "", "Z", "()Z", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @e
    private c queue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long nextExecuteNanoTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean cancelable;

    public a(@d5.d String str, boolean z5) {
        l0.p(str, ProtectedSandApp.s("愎"));
        this.name = str;
        this.cancelable = z5;
        this.nextExecuteNanoTime = -1L;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    @e
    /* renamed from: d, reason: from getter */
    public final c getQueue() {
        return this.queue;
    }

    public final void e(@d5.d c queue) {
        l0.p(queue, ProtectedSandApp.s("意"));
        c cVar = this.queue;
        if (cVar == queue) {
            return;
        }
        if (!(cVar == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("愐").toString());
        }
        this.queue = queue;
    }

    public abstract long f();

    public final void g(long j5) {
        this.nextExecuteNanoTime = j5;
    }

    public final void h(@e c cVar) {
        this.queue = cVar;
    }

    @d5.d
    public String toString() {
        return this.name;
    }

    public /* synthetic */ a(String str, boolean z5, int i5, w wVar) {
        this(str, (i5 & 2) != 0 ? true : z5);
    }
}
