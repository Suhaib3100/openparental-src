package kotlinx.coroutines.debug.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.q;
import kotlin.sequences.v;
import q3.p;

/* compiled from: DebugCoroutineInfoImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082Pø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/debug/internal/f;", "", "", "Ljava/lang/StackTraceElement;", "b", "Lkotlin/sequences/o;", "Lkotlin/coroutines/jvm/internal/e;", "frame", "Lkotlin/m2;", "k", "(Lkotlin/sequences/o;Lkotlin/coroutines/jvm/internal/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "", "state", "Lkotlin/coroutines/d;", "j", "(Ljava/lang/String;Lkotlin/coroutines/d;)V", "toString", "Lkotlinx/coroutines/debug/internal/n;", "a", "Lkotlinx/coroutines/debug/internal/n;", "d", "()Lkotlinx/coroutines/debug/internal/n;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/g;", "c", "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "lastObservedThread", "f", "_lastObservedFrame", "()Lkotlin/coroutines/g;", "context", "()Ljava/util/List;", "creationStackTrace", "g", "()Ljava/lang/String;", "value", "()Lkotlin/coroutines/jvm/internal/e;", "i", "(Lkotlin/coroutines/jvm/internal/e;)V", "lastObservedFrame", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/debug/internal/n;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final n creationStackBottom;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final long sequenceNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final WeakReference<CoroutineContext> _context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private String _state = ProtectedSandApp.s("峼");

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public Thread lastObservedThread;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private WeakReference<CoroutineStackFrame> _lastObservedFrame;

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Ljava/lang/StackTraceElement;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends RestrictedSuspendLambda implements p<SequenceScope<? super StackTraceElement>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f27662q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f27663r;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f27665t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27665t = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27662q;
            if (i5 == 0) {
                a1.n(obj);
                SequenceScope sequenceScope = (SequenceScope) this.f27663r;
                f fVar = f.this;
                CoroutineStackFrame callerFrame = this.f27665t.getCallerFrame();
                this.f27662q = 1;
                if (fVar.k(sequenceScope, callerFrame, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郉"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super StackTraceElement> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = f.this.new a(this.f27665t, continuation);
            aVar.f27663r = obj;
            return aVar;
        }
    }

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27666r;

        /* renamed from: s, reason: collision with root package name */
        Object f27667s;

        /* renamed from: t, reason: collision with root package name */
        Object f27668t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27669u;

        /* renamed from: w, reason: collision with root package name */
        int f27671w;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27669u = obj;
            this.f27671w |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    public f(@d5.e CoroutineContext coroutineContext, @d5.e n nVar, long j5) {
        this.creationStackBottom = nVar;
        this.sequenceNumber = j5;
        this._context = new WeakReference<>(coroutineContext);
    }

    private final List<StackTraceElement> b() {
        Sequence b6;
        n nVar = this.creationStackBottom;
        if (nVar == null) {
            return EmptyList.f23167o;
        }
        b6 = q.b(new a(nVar, null));
        return v.c3(b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:11:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.f.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.f$b r0 = (kotlinx.coroutines.debug.internal.f.b) r0
            int r1 = r0.f27671w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27671w = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.f$b r0 = new kotlinx.coroutines.debug.internal.f$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27669u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27671w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f27668t
            kotlin.coroutines.jvm.internal.e r6 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r6
            java.lang.Object r7 = r0.f27667s
            kotlin.sequences.o r7 = (kotlin.sequences.SequenceScope) r7
            java.lang.Object r2 = r0.f27666r
            kotlinx.coroutines.debug.internal.f r2 = (kotlinx.coroutines.debug.internal.f) r2
            kotlin.a1.n(r8)
            goto L60
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峽"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.a1.n(r8)
            r2 = r5
        L43:
            if (r7 != 0) goto L48
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        L48:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L63
            r0.f27666r = r2
            r0.f27667s = r6
            r0.f27668t = r7
            r0.f27671w = r3
            java.lang.Object r8 = r6.f(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r4 = r7
            r7 = r6
            r6 = r4
        L60:
            r4 = r7
            r7 = r6
            r6 = r4
        L63:
            kotlin.coroutines.jvm.internal.e r7 = r7.getCallerFrame()
            if (r7 == 0) goto L6a
            goto L43
        L6a:
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.f.k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.e
    public final CoroutineContext c() {
        return this._context.get();
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final n getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @d5.d
    public final List<StackTraceElement> e() {
        return b();
    }

    @d5.e
    public final CoroutineStackFrame f() {
        WeakReference<CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @d5.d
    /* renamed from: g, reason: from getter */
    public final String get_state() {
        return this._state;
    }

    @d5.d
    public final List<StackTraceElement> h() {
        CoroutineStackFrame f6 = f();
        if (f6 == null) {
            return EmptyList.f23167o;
        }
        ArrayList arrayList = new ArrayList();
        while (f6 != null) {
            StackTraceElement stackTraceElement = f6.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f6 = f6.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@d5.e CoroutineStackFrame coroutineStackFrame) {
        this._lastObservedFrame = coroutineStackFrame != null ? new WeakReference<>(coroutineStackFrame) : null;
    }

    public final void j(@d5.d String state, @d5.d Continuation<?> frame) {
        if (l0.g(this._state, state) && l0.g(state, ProtectedSandApp.s("峾")) && f() != null) {
            return;
        }
        this._state = state;
        i(frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null);
        this.lastObservedThread = l0.g(state, ProtectedSandApp.s("峿")) ? Thread.currentThread() : null;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("崀") + this._state + ProtectedSandApp.s("崁") + c() + ')';
    }
}
