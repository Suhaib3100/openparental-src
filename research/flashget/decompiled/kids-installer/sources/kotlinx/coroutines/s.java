package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.n2;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000p\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010X\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bZ\u0010\u001fJ#\u0010[\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010TJ\u001b\u0010e\u001a\u00020\u000e*\u00020d2\u0006\u0010U\u001a\u00028\u0000H\u0016¢\u0006\u0004\be\u0010fJ\u001b\u0010\u0001\u001a\u00020\u000e*\u00020d2\u0006\u0010_\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0001\u0010gJ\u001f\u0010h\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bj\u0010kJ\u000f\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020lH\u0014¢\u0006\u0004\bo\u0010nR \u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010q\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010v\u001a\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010zR\u0014\u0010}\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010nR\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010BR\u0015\u0010\u0080\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\bR\u0016\u0010\u0082\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\bR\u0016\u0010\u0083\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0086\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/s;", "T", "Lkotlinx/coroutines/j1;", "Lkotlinx/coroutines/q;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "E", "()Z", "", "cause", "t", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lkotlin/m2;", "block", "p", "(Lq3/a;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "o", "(Lq3/l;Ljava/lang/Throwable;)V", "U", "R", "Lkotlinx/coroutines/p1;", "D", "()Lkotlinx/coroutines/p1;", "M", "()V", "", "state", "G", "(Lq3/l;Ljava/lang/Object;)V", "Lkotlinx/coroutines/o;", "F", "(Lq3/l;)Lkotlinx/coroutines/o;", "", "mode", "x", "(I)V", "Lkotlinx/coroutines/c3;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "Q", "(Lkotlinx/coroutines/c3;Ljava/lang/Object;ILq3/l;Ljava/lang/Object;)Ljava/lang/Object;", "O", "(Ljava/lang/Object;ILq3/l;)V", "Lkotlinx/coroutines/internal/r0;", "S", "(Ljava/lang/Object;Ljava/lang/Object;Lq3/l;)Lkotlinx/coroutines/internal/r0;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "w", "X", "N", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", "j", "()Ljava/lang/Object;", "takenState", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "a", "L", "(Ljava/lang/Throwable;)V", "n", "(Lkotlinx/coroutines/o;Ljava/lang/Throwable;)V", "q", "Lkotlinx/coroutines/n2;", "parent", "z", "(Lkotlinx/coroutines/n2;)Ljava/lang/Throwable;", "A", "Lkotlin/z0;", "result", "s", "(Ljava/lang/Object;)V", "value", "y", "(Ljava/lang/Object;Lq3/l;)V", "K", "(Lq3/l;)V", "v", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "u", "(Ljava/lang/Object;Ljava/lang/Object;Lq3/l;)Ljava/lang/Object;", "exception", "J", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "v0", "Lkotlinx/coroutines/o0;", "W", "(Lkotlinx/coroutines/o0;Ljava/lang/Object;)V", "(Lkotlinx/coroutines/o0;Ljava/lang/Throwable;)V", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "H", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "e", "()Lkotlin/coroutines/d;", "delegate", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "l", "()Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/p1;", "parentHandle", "C", "stateDebugRepresentation", "B", "d", "isActive", "m", "isCompleted", "isCancelled", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes6.dex */
public class s<T> extends j1<T> implements q<T>, CoroutineStackFrame {

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28835u = AtomicIntegerFieldUpdater.newUpdater(s.class, ProtectedSandApp.s("酏"));

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28836v = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, ProtectedSandApp.s("酐"));

    @d5.d
    private volatile /* synthetic */ int _decision;

    @d5.d
    private volatile /* synthetic */ Object _state;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Continuation<T> delegate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext context;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private p1 parentHandle;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@d5.d Continuation<? super T> continuation, int i5) {
        super(i5);
        this.delegate = continuation;
        this.context = continuation.getF23508o();
        this._decision = 0;
        this._state = d.f27620o;
    }

    private final String C() {
        Object obj = get_state();
        return obj instanceof c3 ? ProtectedSandApp.s("酑") : obj instanceof v ? ProtectedSandApp.s("酒") : ProtectedSandApp.s("酓");
    }

    private final p1 D() {
        n2 n2Var = (n2) getF23508o().b(n2.INSTANCE);
        if (n2Var == null) {
            return null;
        }
        p1 f6 = n2.a.f(n2Var, true, false, new w(this), 2, null);
        this.parentHandle = f6;
        return f6;
    }

    private final boolean E() {
        return k1.d(this.resumeMode) && ((kotlinx.coroutines.internal.l) this.delegate).t();
    }

    private final o F(q3.l<? super Throwable, kotlin.m2> handler) {
        return handler instanceof o ? (o) handler : new k2(handler);
    }

    private final void G(q3.l<? super Throwable, kotlin.m2> handler, Object state) {
        throw new IllegalStateException((ProtectedSandApp.s("酔") + handler + ProtectedSandApp.s("酕") + state).toString());
    }

    private final void M() {
        Throwable B;
        Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        if (lVar == null || (B = lVar.B(this)) == null) {
            return;
        }
        v();
        a(B);
    }

    private final void O(Object proposedUpdate, int resumeMode, q3.l<? super Throwable, kotlin.m2> onCancellation) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof c3)) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (vVar.c()) {
                        if (onCancellation != null) {
                            q(onCancellation, vVar.cause);
                            return;
                        }
                        return;
                    }
                }
                k(proposedUpdate);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.d.a(f28836v, this, obj, Q((c3) obj, proposedUpdate, resumeMode, onCancellation, null)));
        w();
        x(resumeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void P(s sVar, Object obj, int i5, q3.l lVar, int i6, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("酖"));
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        sVar.O(obj, i5, lVar);
    }

    private final Object Q(c3 state, Object proposedUpdate, int resumeMode, q3.l<? super Throwable, kotlin.m2> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof f0) {
            return proposedUpdate;
        }
        if (!k1.c(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation != null || (((state instanceof o) && !(state instanceof g)) || idempotent != null)) {
            return new e0(proposedUpdate, state instanceof o ? (o) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    private final boolean R() {
        do {
            int i5 = this._decision;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("酗").toString());
            }
        } while (!f28835u.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.r0 S(Object proposedUpdate, Object idempotent, q3.l<? super Throwable, kotlin.m2> onCancellation) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof c3)) {
                if ((obj instanceof e0) && idempotent != null && ((e0) obj).idempotentResume == idempotent) {
                    return t.f29000d;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.d.a(f28836v, this, obj, Q((c3) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        w();
        return t.f29000d;
    }

    private final boolean U() {
        do {
            int i5 = this._decision;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException(ProtectedSandApp.s("酘").toString());
            }
        } while (!f28835u.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void k(Object proposedUpdate) {
        throw new IllegalStateException(r.a(ProtectedSandApp.s("酙"), proposedUpdate));
    }

    private final void o(q3.l<? super Throwable, kotlin.m2> handler, Throwable cause) {
        try {
            handler.N(cause);
        } catch (Throwable th) {
            r0.b(getF23508o(), new CompletionHandlerException(ProtectedSandApp.s("酚") + this, th));
        }
    }

    private final void p(q3.a<kotlin.m2> block) {
        try {
            block.n();
        } catch (Throwable th) {
            r0.b(getF23508o(), new CompletionHandlerException(ProtectedSandApp.s("酛") + this, th));
        }
    }

    private final boolean t(Throwable cause) {
        if (E()) {
            return ((kotlinx.coroutines.internal.l) this.delegate).v(cause);
        }
        return false;
    }

    private final void w() {
        if (E()) {
            return;
        }
        v();
    }

    private final void x(int mode) {
        if (R()) {
            return;
        }
        k1.a(this, mode);
    }

    @d5.e
    @PublishedApi
    public final Object A() {
        n2 n2Var;
        boolean E = E();
        if (U()) {
            if (this.parentHandle == null) {
                D();
            }
            if (E) {
                M();
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (E) {
            M();
        }
        Object obj = get_state();
        if (obj instanceof f0) {
            throw ((f0) obj).cause;
        }
        if (!k1.c(this.resumeMode) || (n2Var = (n2) getF23508o().b(n2.INSTANCE)) == null || n2Var.d()) {
            return g(obj);
        }
        CancellationException O = n2Var.O();
        c(obj, O);
        throw O;
    }

    @d5.e
    /* renamed from: B, reason: from getter */
    public final Object get_state() {
        return this._state;
    }

    @d5.d
    protected String H() {
        return ProtectedSandApp.s("酜");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: I */
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.q
    @d5.e
    public Object J(@d5.d Throwable exception) {
        return S(new f0(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.q
    public void K(@d5.d q3.l<? super Throwable, kotlin.m2> handler) {
        o F = F(handler);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.d.a(f28836v, this, obj, F)) {
                    return;
                }
            } else if (obj instanceof o) {
                G(handler, obj);
            } else {
                boolean z5 = obj instanceof f0;
                if (z5) {
                    f0 f0Var = (f0) obj;
                    if (!f0Var.b()) {
                        G(handler, obj);
                    }
                    if (obj instanceof v) {
                        if (!z5) {
                            f0Var = null;
                        }
                        o(handler, f0Var != null ? f0Var.cause : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof e0) {
                    e0 e0Var = (e0) obj;
                    if (e0Var.cancelHandler != null) {
                        G(handler, obj);
                    }
                    if (F instanceof g) {
                        return;
                    }
                    if (e0Var.h()) {
                        o(handler, e0Var.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.d.a(f28836v, this, obj, e0.g(e0Var, null, F, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (F instanceof g) {
                        return;
                    }
                    if (androidx.concurrent.futures.d.a(f28836v, this, obj, new e0(obj, F, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void L(@d5.d Throwable cause) {
        if (t(cause)) {
            return;
        }
        a(cause);
        w();
    }

    @p3.i(name = "resetStateReusable")
    public final boolean N() {
        Object obj = this._state;
        if ((obj instanceof e0) && ((e0) obj).idempotentResume != null) {
            v();
            return false;
        }
        this._decision = 0;
        this._state = d.f27620o;
        return true;
    }

    @Override // kotlinx.coroutines.q
    public void T(@d5.d o0 o0Var, @d5.d Throwable th) {
        Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        P(this, new f0(th, false, 2, null), (lVar != null ? lVar.dispatcher : null) == o0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.q
    public void W(@d5.d o0 o0Var, T t5) {
        Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.l lVar = continuation instanceof kotlinx.coroutines.internal.l ? (kotlinx.coroutines.internal.l) continuation : null;
        P(this, t5, (lVar != null ? lVar.dispatcher : null) == o0Var ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.q
    public void X() {
        p1 D = D();
        if (D != null && m()) {
            D.g();
            this.parentHandle = b3.f27276o;
        }
    }

    @Override // kotlinx.coroutines.q
    public boolean a(@d5.e Throwable cause) {
        Object obj;
        boolean z5;
        do {
            obj = this._state;
            if (!(obj instanceof c3)) {
                return false;
            }
            z5 = obj instanceof o;
        } while (!androidx.concurrent.futures.d.a(f28836v, this, obj, new v(this, cause, z5)));
        o oVar = z5 ? (o) obj : null;
        if (oVar != null) {
            n(oVar, cause);
        }
        w();
        x(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.j1
    public void c(@d5.e Object takenState, @d5.d Throwable cause) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof c3) {
                throw new IllegalStateException(ProtectedSandApp.s("酞").toString());
            }
            if (obj instanceof f0) {
                return;
            }
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!(!e0Var.h())) {
                    throw new IllegalStateException(ProtectedSandApp.s("酝").toString());
                }
                if (androidx.concurrent.futures.d.a(f28836v, this, obj, e0.g(e0Var, null, null, null, null, cause, 15, null))) {
                    e0Var.i(this, cause);
                    return;
                }
            } else if (androidx.concurrent.futures.d.a(f28836v, this, obj, new e0(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.q
    public boolean d() {
        return get_state() instanceof c3;
    }

    @Override // kotlinx.coroutines.j1
    @d5.d
    public final Continuation<T> e() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.j1
    @d5.e
    public Throwable f(@d5.e Object state) {
        Throwable f6 = super.f(state);
        if (f6 != null) {
            return f6;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.j1
    public <T> T g(@d5.e Object state) {
        return state instanceof e0 ? (T) ((e0) state).result : state;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i */
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.q
    public boolean isCancelled() {
        return get_state() instanceof v;
    }

    @Override // kotlinx.coroutines.j1
    @d5.e
    public Object j() {
        return get_state();
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l, reason: from getter */
    public CoroutineContext getF23508o() {
        return this.context;
    }

    @Override // kotlinx.coroutines.q
    public boolean m() {
        return !(get_state() instanceof c3);
    }

    public final void n(@d5.d o handler, @d5.e Throwable cause) {
        try {
            handler.a(cause);
        } catch (Throwable th) {
            r0.b(getF23508o(), new CompletionHandlerException(ProtectedSandApp.s("酟") + this, th));
        }
    }

    public final void q(@d5.d q3.l<? super Throwable, kotlin.m2> onCancellation, @d5.d Throwable cause) {
        try {
            onCancellation.N(cause);
        } catch (Throwable th) {
            r0.b(getF23508o(), new CompletionHandlerException(ProtectedSandApp.s("酠") + this, th));
        }
    }

    @Override // kotlinx.coroutines.q
    @d5.e
    public Object r(T value, @d5.e Object idempotent) {
        return S(value, idempotent, null);
    }

    @Override // kotlin.coroutines.Continuation
    public void s(@d5.d Object result) {
        P(this, k0.b(result, this), this.resumeMode, null, 4, null);
    }

    @d5.d
    public String toString() {
        return H() + '(' + z0.c(this.delegate) + ProtectedSandApp.s("酡") + C() + ProtectedSandApp.s("酢") + z0.b(this);
    }

    @Override // kotlinx.coroutines.q
    @d5.e
    public Object u(T value, @d5.e Object idempotent, @d5.e q3.l<? super Throwable, kotlin.m2> onCancellation) {
        return S(value, idempotent, onCancellation);
    }

    public final void v() {
        p1 p1Var = this.parentHandle;
        if (p1Var == null) {
            return;
        }
        p1Var.g();
        this.parentHandle = b3.f27276o;
    }

    @Override // kotlinx.coroutines.q
    public void v0(@d5.d Object token) {
        x(this.resumeMode);
    }

    @Override // kotlinx.coroutines.q
    public void y(T value, @d5.e q3.l<? super Throwable, kotlin.m2> onCancellation) {
        O(value, this.resumeMode, onCancellation);
    }

    @d5.d
    public Throwable z(@d5.d n2 parent) {
        return parent.O();
    }
}
