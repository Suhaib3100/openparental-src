package kotlinx.coroutines.debug.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.sequences.o;
import kotlin.w0;
import ld.p;

/* compiled from: DebugCoroutineInfoImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082Pø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b$\u00100R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b1\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR(\u00109\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/debug/internal/e;", "", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/debug/internal/m;", "creationStackBottom", "", "sequenceNumber", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/debug/internal/m;J)V", "", "Ljava/lang/StackTraceElement;", "b", "()Ljava/util/List;", "Lkotlin/sequences/o;", "Lkotlin/coroutines/jvm/internal/e;", "frame", "Lkotlin/k2;", "k", "(Lkotlin/sequences/o;Lkotlin/coroutines/jvm/internal/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "state", "Lkotlin/coroutines/d;", "", "shouldBeMatched", "j", "(Ljava/lang/String;Lkotlin/coroutines/d;Z)V", "h", "toString", "()Ljava/lang/String;", "a", "Lkotlinx/coroutines/debug/internal/m;", "d", "()Lkotlinx/coroutines/debug/internal/m;", "J", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "_context", "_state", "Ljava/lang/String;", "", "I", "unmatchedResume", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "_lastObservedFrame", "()Lkotlin/coroutines/g;", "e", "creationStackTrace", "g", "value", "f", "()Lkotlin/coroutines/jvm/internal/e;", "i", "(Lkotlin/coroutines/jvm/internal/e;)V", "lastObservedFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
@r1({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: classes7.dex */
public final class e {

    @fg.m
    @kd.f
    public volatile WeakReference<kotlin.coroutines.jvm.internal.e> _lastObservedFrame;

    @fg.l
    @kd.f
    public volatile String _state = ProtectedSandApp.s("蚔\u0001");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final m creationStackBottom;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long sequenceNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WeakReference<kotlin.coroutines.g> _context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int unmatchedResume;

    @fg.m
    @kd.f
    public volatile Thread lastObservedThread;

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Ljava/lang/StackTraceElement;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements p<o<? super StackTraceElement>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f79687c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f79688d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f79690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f79690f = mVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l o<? super StackTraceElement> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = e.this.new a(this.f79690f, dVar);
            aVar.f79688d = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79687c;
            if (i4 == 0) {
                a1.n(obj);
                o oVar = (o) this.f79688d;
                e eVar = e.this;
                kotlin.coroutines.jvm.internal.e callerFrame = this.f79690f.getCallerFrame();
                this.f79687c = 1;
                if (eVar.k(oVar, callerFrame, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蚓\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {171}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79691b;

        /* renamed from: c, reason: collision with root package name */
        Object f79692c;

        /* renamed from: d, reason: collision with root package name */
        Object f79693d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79694e;

        /* renamed from: g, reason: collision with root package name */
        int f79696g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79694e = obj;
            this.f79696g |= Integer.MIN_VALUE;
            return e.this.k(null, null, this);
        }
    }

    public e(@fg.m kotlin.coroutines.g gVar, @fg.m m mVar, long j4) {
        this.creationStackBottom = mVar;
        this.sequenceNumber = j4;
        this._context = new WeakReference<>(gVar);
    }

    private final List<StackTraceElement> b() {
        m mVar = this.creationStackBottom;
        return mVar == null ? j0.f74919b : kotlin.sequences.p.c3(kotlin.sequences.p.b(new a(mVar, null)));
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
    public final java.lang.Object k(kotlin.sequences.o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.e r7, kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.e.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.e$b r0 = (kotlinx.coroutines.debug.internal.e.b) r0
            int r1 = r0.f79696g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79696g = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.e$b r0 = new kotlinx.coroutines.debug.internal.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79694e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79696g
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f79693d
            kotlin.coroutines.jvm.internal.e r6 = (kotlin.coroutines.jvm.internal.e) r6
            java.lang.Object r7 = r0.f79692c
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            java.lang.Object r2 = r0.f79691b
            kotlinx.coroutines.debug.internal.e r2 = (kotlinx.coroutines.debug.internal.e) r2
            kotlin.a1.n(r8)
            goto L60
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "蚕\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.a1.n(r8)
            r2 = r5
        L43:
            if (r7 != 0) goto L48
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        L48:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L63
            r0.f79691b = r2
            r0.f79692c = r6
            r0.f79693d = r7
            r0.f79696g = r3
            java.lang.Object r8 = r6.b(r8, r0)
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
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.e.k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final kotlin.coroutines.g c() {
        return this._context.get();
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final m getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @fg.l
    public final List<StackTraceElement> e() {
        return b();
    }

    @fg.m
    public final kotlin.coroutines.jvm.internal.e f() {
        WeakReference<kotlin.coroutines.jvm.internal.e> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String get_state() {
        return this._state;
    }

    @fg.l
    public final List<StackTraceElement> h() {
        kotlin.coroutines.jvm.internal.e f4 = f();
        if (f4 == null) {
            return j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        while (f4 != null) {
            StackTraceElement stackTraceElement = f4.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f4 = f4.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@fg.m kotlin.coroutines.jvm.internal.e eVar) {
        this._lastObservedFrame = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public final synchronized void j(@fg.l String state, @fg.l kotlin.coroutines.d<?> frame, boolean shouldBeMatched) {
        try {
            if (l0.g(this._state, ProtectedSandApp.s("蚖\u0001")) && l0.g(state, ProtectedSandApp.s("蚖\u0001")) && shouldBeMatched) {
                this.unmatchedResume++;
            } else if (this.unmatchedResume > 0 && l0.g(state, ProtectedSandApp.s("蚗\u0001"))) {
                this.unmatchedResume--;
                return;
            }
            if (l0.g(this._state, state) && l0.g(state, ProtectedSandApp.s("蚗\u0001")) && f() != null) {
                return;
            }
            this._state = state;
            i(frame instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) frame : null);
            this.lastObservedThread = l0.g(state, ProtectedSandApp.s("蚖\u0001")) ? Thread.currentThread() : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蚘\u0001") + this._state + ProtectedSandApp.s("蚙\u0001") + c() + ')';
    }
}
