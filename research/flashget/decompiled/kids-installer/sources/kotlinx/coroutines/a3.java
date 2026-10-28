package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.sequences.Sequence;

/* compiled from: NonCancellable.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b6\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#R\u001a\u0010*\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\u001a\u00100\u001a\u00020,8VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0002018VX\u0097\u0004¢\u0006\f\u0012\u0004\b4\u0010%\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/a3;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n2;", "", "start", "Lkotlin/m2;", "H", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "O", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/p1;", "m0", "onCancelling", "invokeImmediately", "P", "e", "a", "Lkotlinx/coroutines/z;", "child", "Lkotlinx/coroutines/x;", "p0", "", "toString", "q", "Ljava/lang/String;", "message", "d", "()Z", "isActive$annotations", "()V", "isActive", "m", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlinx/coroutines/selects/c;", "g0", "()Lkotlinx/coroutines/selects/c;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/m;", "F", "()Lkotlin/sequences/m;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a3 extends AbstractCoroutineContextElement implements n2 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final String message = ProtectedSandApp.s("運");

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a3 f27257p = new a3();

    private a3() {
        super(n2.INSTANCE);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void A0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void B0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void E0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void F0() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void y0() {
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public Sequence<n2> F() {
        return kotlin.sequences.p.g();
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @d5.e
    public Object H(@d5.d Continuation<? super kotlin.m2> continuation) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("遌"));
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @d5.d
    public CancellationException O() {
        throw new IllegalStateException(ProtectedSandApp.s("遍"));
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @d5.d
    public p1 P(boolean z5, boolean z6, @d5.d q3.l<? super Throwable, kotlin.m2> lVar) {
        return b3.f27276o;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @d5.d
    public n2 Z(@d5.d n2 n2Var) {
        return n2Var;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.n2
    public boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void e(@d5.e CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public kotlinx.coroutines.selects.c g0() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("過"));
    }

    @Override // kotlinx.coroutines.n2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    public boolean m() {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @d5.d
    public p1 m0(@d5.d q3.l<? super Throwable, kotlin.m2> lVar) {
        return b3.f27276o;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @d5.d
    public x p0(@d5.d z child) {
        return b3.f27276o;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("遏");
    }
}
