package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: NonCancellable.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0097@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0004\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0004\u001a\u0004\b0\u0010\u0007R\u001a\u00104\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0004\u001a\u0004\b2\u0010\u0007R\u001a\u00105\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0004\u001a\u0004\b5\u0010\u0007R\u001a\u0010;\u001a\u0002078VX\u0097\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0004\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020<8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0004\u001a\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lkotlinx/coroutines/x2;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/k2;", "<init>", "()V", "", "start", "()Z", "Lkotlin/k2;", "j0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/m1;", "F", "(Lld/l;)Lkotlinx/coroutines/m1;", "onCancelling", "invokeImmediately", "K0", "(ZZLld/l;)Lkotlinx/coroutines/m1;", "b", "(Ljava/util/concurrent/CancellationException;)V", "f", "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "N0", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/String;", "message", "getParent", "()Lkotlinx/coroutines/k2;", "c1", "parent", "isActive", "e1", "l", "j1", "isCompleted", "isCancelled", "g1", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "U0", "onJoin", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "S0", "children", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class x2 extends kotlin.coroutines.a implements k2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String message = ProtectedSandApp.s("褟\u0001");

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final x2 f81199c = new x2();

    private x2() {
        super(k2.INSTANCE);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void S0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void U0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void c1() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void e1() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void g1() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void j1() {
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public k2 E(@fg.l k2 k2Var) {
        return k2Var;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public m1 F(@fg.l ld.l<? super Throwable, kotlin.k2> handler) {
        return y2.f81204b;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public m1 K0(boolean onCancelling, boolean invokeImmediately, @fg.l ld.l<? super Throwable, kotlin.k2> handler) {
        return y2.f81204b;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public v N0(@fg.l x child) {
        return y2.f81204b;
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void b(@fg.m CancellationException cause) {
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean f(Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.k2
    @fg.m
    public k2 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.k2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.k2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.k2
    @fg.m
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public Object j0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("褠\u0001"));
    }

    @Override // kotlinx.coroutines.k2
    public boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public kotlin.sequences.m<k2> o() {
        return kotlin.sequences.p.g();
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public kotlinx.coroutines.selects.e r0() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("褠\u0001"));
    }

    @Override // kotlinx.coroutines.k2
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("褡\u0001");
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public CancellationException x() {
        throw new IllegalStateException(ProtectedSandApp.s("褠\u0001"));
    }
}
