package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b5\u0010\u001a\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070:8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lkotlinx/coroutines/flow/u0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "h", "value", "b", "(Ljava/lang/Object;)Z", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "()V", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "q", "()Lkotlinx/coroutines/flow/w0;", "", "size", "", "r", "(I)[Lkotlinx/coroutines/flow/w0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "f", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "s", "", "e", "()Ljava/util/List;", "replayCache", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* loaded from: classes7.dex */
final class u0<T> extends kotlinx.coroutines.flow.internal.a<w0> implements e0<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80471g = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, ProtectedSandApp.s("螌\u0001"));

    @fg.m
    @kd.x
    private volatile Object _state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int sequence;

    /* compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80473b;

        /* renamed from: c, reason: collision with root package name */
        Object f80474c;

        /* renamed from: d, reason: collision with root package name */
        Object f80475d;

        /* renamed from: e, reason: collision with root package name */
        Object f80476e;

        /* renamed from: f, reason: collision with root package name */
        Object f80477f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80478g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u0<T> f80479h;

        /* renamed from: i, reason: collision with root package name */
        int f80480i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0<T> u0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f80479h = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80478g = obj;
            this.f80480i |= Integer.MIN_VALUE;
            return this.f80479h.a(null, this);
        }
    }

    public u0(@fg.l Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void s() {
    }

    private final boolean t(Object expectedState, Object newState) {
        int i4;
        w0[] p4;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80471g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (expectedState != null && !kotlin.jvm.internal.l0.g(obj, expectedState)) {
                return false;
            }
            if (kotlin.jvm.internal.l0.g(obj, newState)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, newState);
            int i5 = this.sequence;
            if ((i5 & 1) != 0) {
                this.sequence = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.sequence = i6;
            w0[] p5 = p();
            k2 k2Var = k2.f75408a;
            while (true) {
                w0[] w0VarArr = p5;
                if (w0VarArr != null) {
                    for (w0 w0Var : w0VarArr) {
                        if (w0Var != null) {
                            w0Var.h();
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.sequence;
                    if (i4 == i6) {
                        this.sequence = i6 + 1;
                        return true;
                    }
                    p4 = p();
                    k2 k2Var2 = k2.f75408a;
                }
                p5 = p4;
                i6 = i4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (kotlin.jvm.internal.l0.g(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00ad, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0062, B:40:0x0075, B:41:0x009e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00ad, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0062, B:40:0x0075, B:41:0x009e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00ad, B:16:0x00b5, B:18:0x00ba, B:20:0x00db, B:22:0x00e1, B:26:0x00c0, B:29:0x00c7, B:38:0x0062, B:40:0x0075, B:41:0x009e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00df -> B:14:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f1 -> B:14:0x00ad). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r11, @fg.l kotlin.coroutines.d<?> r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u0.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean b(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @fg.l
    public i<T> d(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return v0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.i0
    @fg.l
    public List<T> e() {
        return kotlin.collections.w.k(getValue());
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        setValue(t4);
        return k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0
    public T getValue() {
        kotlinx.coroutines.internal.s0 s0Var = kotlinx.coroutines.flow.internal.s.f80148a;
        T t4 = (T) f80471g.get(this);
        if (t4 == s0Var) {
            return null;
        }
        return t4;
    }

    @Override // kotlinx.coroutines.flow.e0
    public boolean h(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlinx.coroutines.flow.internal.s.f80148a;
        }
        if (update == null) {
            update = (T) kotlinx.coroutines.flow.internal.s.f80148a;
        }
        return t(expect, update);
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("螎\u0001"));
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public w0 k() {
        return new w0();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public w0[] l(int i4) {
        return new w0[i4];
    }

    @fg.l
    protected w0 q() {
        return new w0();
    }

    @fg.l
    protected w0[] r(int size) {
        return new w0[size];
    }

    @Override // kotlinx.coroutines.flow.e0
    public void setValue(T t4) {
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.s.f80148a;
        }
        t(null, t4);
    }
}
