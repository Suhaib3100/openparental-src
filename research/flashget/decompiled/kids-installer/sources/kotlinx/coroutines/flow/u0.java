package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b8\u00101J!\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010,R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0017\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lkotlinx/coroutines/flow/u0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "", "expectedState", "newState", "", "v", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "g", "value", "k", "(Ljava/lang/Object;)Z", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "()V", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "()Lkotlinx/coroutines/flow/w0;", "", "size", "", "s", "(I)[Lkotlinx/coroutines/flow/w0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)Lkotlinx/coroutines/flow/i;", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "c", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class u0<T> extends kotlinx.coroutines.flow.internal.a<w0> implements e0<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    @d5.d
    private volatile /* synthetic */ Object _state;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int sequence;

    /* compiled from: StateFlow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28427r;

        /* renamed from: s, reason: collision with root package name */
        Object f28428s;

        /* renamed from: t, reason: collision with root package name */
        Object f28429t;

        /* renamed from: u, reason: collision with root package name */
        Object f28430u;

        /* renamed from: v, reason: collision with root package name */
        Object f28431v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f28432w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ u0<T> f28433x;

        /* renamed from: y, reason: collision with root package name */
        int f28434y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0<T> u0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f28433x = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28432w = obj;
            this.f28434y |= Integer.MIN_VALUE;
            return this.f28433x.a(null, this);
        }
    }

    public u0(@d5.d Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void u() {
    }

    private final boolean v(Object expectedState, Object newState) {
        int i5;
        w0[] p5;
        p();
        synchronized (this) {
            Object obj = this._state;
            if (expectedState != null && !kotlin.jvm.internal.l0.g(obj, expectedState)) {
                return false;
            }
            if (kotlin.jvm.internal.l0.g(obj, newState)) {
                return true;
            }
            this._state = newState;
            int i6 = this.sequence;
            if ((i6 & 1) != 0) {
                this.sequence = i6 + 2;
                return true;
            }
            int i7 = i6 + 1;
            this.sequence = i7;
            w0[] p6 = p();
            m2 m2Var = m2.f23662a;
            while (true) {
                w0[] w0VarArr = p6;
                if (w0VarArr != null) {
                    for (w0 w0Var : w0VarArr) {
                        if (w0Var != null) {
                            w0Var.f();
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.sequence;
                    if (i5 == i7) {
                        this.sequence = i7 + 1;
                        return true;
                    }
                    p5 = p();
                    m2 m2Var2 = m2.f23662a;
                }
                p6 = p5;
                i7 = i5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        if (kotlin.jvm.internal.l0.g(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:13:0x003c, B:14:0x00a8, B:16:0x00ac, B:18:0x00b1, B:20:0x00d2, B:22:0x00d8, B:26:0x00b7, B:29:0x00be, B:38:0x005e, B:40:0x0071, B:41:0x0099), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:13:0x003c, B:14:0x00a8, B:16:0x00ac, B:18:0x00b1, B:20:0x00d2, B:22:0x00d8, B:26:0x00b7, B:29:0x00be, B:38:0x005e, B:40:0x0071, B:41:0x0099), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:13:0x003c, B:14:0x00a8, B:16:0x00ac, B:18:0x00b1, B:20:0x00d2, B:22:0x00d8, B:26:0x00b7, B:29:0x00be, B:38:0x005e, B:40:0x0071, B:41:0x0099), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d6 -> B:14:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e8 -> B:14:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@d5.d kotlinx.coroutines.flow.j<? super T> r11, @d5.d kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u0.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
        setValue(t5);
        return m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.i0
    @d5.d
    public List<T> c() {
        List<T> k5;
        k5 = kotlin.collections.z.k(getValue());
        return k5;
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @d5.d
    public i<T> d(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return v0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.e0
    public boolean g(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlinx.coroutines.flow.internal.s.f28115a;
        }
        if (update == null) {
            update = (T) kotlinx.coroutines.flow.internal.s.f28115a;
        }
        return v(expect, update);
    }

    @Override // kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0
    public T getValue() {
        kotlinx.coroutines.internal.r0 r0Var = kotlinx.coroutines.flow.internal.s.f28115a;
        T t5 = (T) this._state;
        if (t5 == r0Var) {
            return null;
        }
        return t5;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public w0 i() {
        return new w0();
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("鄢"));
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean k(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public w0[] l(int i5) {
        return new w0[i5];
    }

    @d5.d
    protected w0 r() {
        return new w0();
    }

    @d5.d
    protected w0[] s(int size) {
        return new w0[size];
    }

    @Override // kotlinx.coroutines.flow.e0
    public void setValue(T t5) {
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.s.f28115a;
        }
        v(null, t5);
    }
}
