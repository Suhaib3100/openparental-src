package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlinx.coroutines.p1;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010J\u001a\u00020\u0016\u0012\u0006\u0010L\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bn\u0010oJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0010R\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0010R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010=R\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010=R\u0016\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0010R\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010\u0010R\u0014\u0010[\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u00109R\u0014\u0010^\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0014\u0010b\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u00109R\u0014\u0010d\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u00109R\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001a\u0010m\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006p"}, d2 = {"Lkotlinx/coroutines/flow/j0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "value", "", "Z", "(Ljava/lang/Object;)Z", "a0", "Lkotlin/m2;", "L", "", "newHead", "I", "", "item", "O", "", "curBuffer", "", "curSize", "newSize", "Y", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "N", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j0$a;", "emitter", "F", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "d0", "G", "slot", "c0", "b0", "index", "U", "E", "(Lkotlinx/coroutines/flow/l0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "resumesIn", "P", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "b", "f0", "()J", "oldIndex", "e0", "(J)[Lkotlin/coroutines/d;", "J", "size", "K", "(I)[Lkotlinx/coroutines/flow/l0;", "j", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "s", "replay", "t", "bufferCapacity", "u", "Lkotlinx/coroutines/channels/m;", "v", "[Ljava/lang/Object;", "buffer", "w", "replayIndex", "x", "minCollectorIndex", "y", "bufferSize", "z", "queueSize", "R", "head", "W", "()I", "replaySize", "X", "totalSize", "Q", "bufferEndIndex", "V", "queueEndIndex", "", "c", "()Ljava/util/List;", "replayCache", "S", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class j0<T> extends kotlinx.coroutines.flow.internal.a<l0> implements d0<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.channels.m onBufferOverflow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private Object[] buffer;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/j0$a;", "Lkotlinx/coroutines/p1;", "Lkotlin/m2;", "g", "Lkotlinx/coroutines/flow/j0;", "o", "Lkotlinx/coroutines/flow/j0;", "flow", "", "p", "J", "index", "", "q", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/d;", "r", "Lkotlin/coroutines/d;", "cont", "<init>", "(Lkotlinx/coroutines/flow/j0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class a implements p1 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final j0<?> flow;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public long index;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final Object value;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final Continuation<m2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d j0<?> j0Var, long j5, @d5.e Object obj, @d5.d Continuation<? super m2> continuation) {
            this.flow = j0Var;
            this.index = j5;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.p1
        public void g() {
            this.flow.F(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28152a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.m.values().length];
            iArr[kotlinx.coroutines.channels.m.SUSPEND.ordinal()] = 1;
            iArr[kotlinx.coroutines.channels.m.DROP_LATEST.ordinal()] = 2;
            iArr[kotlinx.coroutines.channels.m.DROP_OLDEST.ordinal()] = 3;
            f28152a = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    static final class c extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28153r;

        /* renamed from: s, reason: collision with root package name */
        Object f28154s;

        /* renamed from: t, reason: collision with root package name */
        Object f28155t;

        /* renamed from: u, reason: collision with root package name */
        Object f28156u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f28157v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ j0<T> f28158w;

        /* renamed from: x, reason: collision with root package name */
        int f28159x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0<T> j0Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f28158w = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28157v = obj;
            this.f28159x |= Integer.MIN_VALUE;
            return j0.H(this.f28158w, null, this);
        }
    }

    public j0(int i5, int i6, @d5.d kotlinx.coroutines.channels.m mVar) {
        this.replay = i5;
        this.bufferCapacity = i6;
        this.onBufferOverflow = mVar;
    }

    public static final int A(j0 j0Var) {
        return j0Var.bufferSize + j0Var.queueSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(l0 l0Var, Continuation<? super m2> continuation) {
        Continuation e6;
        m2 m2Var;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.X();
        synchronized (this) {
            if (b0(l0Var) < 0) {
                l0Var.cont = sVar;
            } else {
                Result.a aVar = Result.f27242p;
                sVar.s(m2.f23662a);
            }
            m2Var = m2.f23662a;
        }
        Object A = sVar.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : m2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(a aVar) {
        Object f6;
        synchronized (this) {
            if (aVar.index < R()) {
                return;
            }
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            f6 = k0.f(objArr, aVar.index);
            if (f6 != aVar) {
                return;
            }
            k0.h(objArr, aVar.index, k0.f28161a);
            G();
            m2 m2Var = m2.f23662a;
        }
    }

    private final void G() {
        Object f6;
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            while (this.queueSize > 0) {
                f6 = k0.f(objArr, (R() + (this.bufferSize + this.queueSize)) - 1);
                if (f6 != k0.f28161a) {
                    return;
                }
                this.queueSize--;
                k0.h(objArr, R() + this.bufferSize + this.queueSize, null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object H(kotlinx.coroutines.flow.j0 r8, kotlinx.coroutines.flow.j r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.H(kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = ((kotlinx.coroutines.flow.internal.a) r8).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(long r9) {
        /*
            r8 = this;
            int r0 = kotlinx.coroutines.flow.internal.a.e(r8)
            if (r0 == 0) goto L27
            kotlinx.coroutines.flow.internal.c[] r0 = kotlinx.coroutines.flow.internal.a.f(r8)
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            if (r3 == 0) goto L24
            kotlinx.coroutines.flow.l0 r3 = (kotlinx.coroutines.flow.l0) r3
            long r4 = r3.index
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L24
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L24
            r3.index = r9
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            r8.minCollectorIndex = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.I(long):void");
    }

    private final void L() {
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        k0.h(objArr, R(), null);
        this.bufferSize--;
        long R = R() + 1;
        if (this.replayIndex < R) {
            this.replayIndex = R;
        }
        if (this.minCollectorIndex < R) {
            I(R);
        }
    }

    static Object M(j0 j0Var, Object obj, Continuation continuation) {
        if (j0Var.k(obj)) {
            return m2.f23662a;
        }
        Object N = j0Var.N(obj, continuation);
        return N == CoroutineSingletons.COROUTINE_SUSPENDED ? N : m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(T t5, Continuation<? super m2> continuation) {
        Continuation e6;
        Continuation<m2>[] continuationArr;
        a aVar;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s sVar = new kotlinx.coroutines.s(e6, 1);
        sVar.X();
        Continuation<m2>[] continuationArr2 = kotlinx.coroutines.flow.internal.b.f27995a;
        synchronized (this) {
            if (Z(t5)) {
                Result.a aVar2 = Result.f27242p;
                sVar.s(m2.f23662a);
                continuationArr = P(continuationArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, this.bufferSize + this.queueSize + R(), t5, sVar);
                O(aVar3);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArr2 = P(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.u.a(sVar, aVar);
        }
        for (Continuation<m2> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.a aVar4 = Result.f27242p;
                continuation2.s(m2.f23662a);
            }
        }
        Object A = sVar.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Object obj) {
        int i5 = this.bufferSize + this.queueSize;
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = Y(null, 0, 2);
        } else if (i5 >= objArr.length) {
            objArr = Y(objArr, i5, objArr.length * 2);
        }
        k0.h(objArr, R() + i5, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = ((kotlinx.coroutines.flow.internal.a) r10).slots;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.Continuation<kotlin.m2>[] P(kotlin.coroutines.Continuation<kotlin.m2>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = kotlinx.coroutines.flow.internal.a.e(r10)
            if (r1 == 0) goto L4b
            kotlinx.coroutines.flow.internal.c[] r1 = kotlinx.coroutines.flow.internal.a.f(r10)
            if (r1 == 0) goto L4b
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            if (r4 == 0) goto L48
            kotlinx.coroutines.flow.l0 r4 = (kotlinx.coroutines.flow.l0) r4
            kotlin.coroutines.d<? super kotlin.m2> r5 = r4.cont
            if (r5 != 0) goto L1c
            goto L48
        L1c:
            long r6 = r10.b0(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L48
            int r6 = r11.length
            if (r0 < r6) goto L3d
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "鄌"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r11, r6)
        L3d:
            r6 = r11
            kotlin.coroutines.d[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.cont = r0
            r0 = r7
        L48:
            int r3 = r3 + 1
            goto Lf
        L4b:
            kotlin.coroutines.d[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.P(kotlin.coroutines.d[]):kotlin.coroutines.d[]");
    }

    private final long Q() {
        return R() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long R() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    protected static /* synthetic */ void T() {
    }

    private final Object U(long index) {
        Object f6;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        f6 = k0.f(objArr, index);
        return f6 instanceof a ? ((a) f6).value : f6;
    }

    private final long V() {
        return R() + this.bufferSize + this.queueSize;
    }

    private final int W() {
        return (int) ((R() + this.bufferSize) - this.replayIndex);
    }

    private final int X() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] Y(Object[] curBuffer, int curSize, int newSize) {
        Object f6;
        if (!(newSize > 0)) {
            throw new IllegalStateException(ProtectedSandApp.s("鄍").toString());
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long R = R();
        for (int i5 = 0; i5 < curSize; i5++) {
            long j5 = i5 + R;
            f6 = k0.f(curBuffer, j5);
            k0.h(objArr, j5, f6);
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(T value) {
        if (getNCollectors() == 0) {
            return a0(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i5 = b.f28152a[this.onBufferOverflow.ordinal()];
            if (i5 == 1) {
                return false;
            }
            if (i5 == 2) {
                return true;
            }
        }
        O(value);
        int i6 = this.bufferSize + 1;
        this.bufferSize = i6;
        if (i6 > this.bufferCapacity) {
            L();
        }
        if (W() > this.replay) {
            d0(this.replayIndex + 1, this.minCollectorIndex, Q(), V());
        }
        return true;
    }

    private final boolean a0(T value) {
        if (this.replay == 0) {
            return true;
        }
        O(value);
        int i5 = this.bufferSize + 1;
        this.bufferSize = i5;
        if (i5 > this.replay) {
            L();
        }
        this.minCollectorIndex = R() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b0(l0 slot) {
        long j5 = slot.index;
        if (j5 < Q()) {
            return j5;
        }
        if (this.bufferCapacity <= 0 && j5 <= R() && this.queueSize != 0) {
            return j5;
        }
        return -1L;
    }

    private final Object c0(l0 slot) {
        Object obj;
        Continuation<m2>[] continuationArr = kotlinx.coroutines.flow.internal.b.f27995a;
        synchronized (this) {
            long b02 = b0(slot);
            if (b02 < 0) {
                obj = k0.f28161a;
            } else {
                long j5 = slot.index;
                Object U = U(b02);
                slot.index = b02 + 1;
                continuationArr = e0(j5);
                obj = U;
            }
        }
        for (Continuation<m2> continuation : continuationArr) {
            if (continuation != null) {
                Result.a aVar = Result.f27242p;
                continuation.s(m2.f23662a);
            }
        }
        return obj;
    }

    private final void d0(long j5, long j6, long j7, long j8) {
        long min = Math.min(j6, j5);
        for (long R = R(); R < min; R++) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            k0.h(objArr, R, null);
        }
        this.replayIndex = j5;
        this.minCollectorIndex = j6;
        this.bufferSize = (int) (j7 - min);
        this.queueSize = (int) (j8 - j7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @d5.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public l0 i() {
        return new l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @d5.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public l0[] l(int size) {
        return new l0[size];
    }

    protected final T S() {
        Object f6;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        f6 = k0.f(objArr, (this.replayIndex + W()) - 1);
        return (T) f6;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<?> continuation) {
        return H(this, jVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
        return M(this, t5, continuation);
    }

    @Override // kotlinx.coroutines.flow.i0
    @d5.d
    public List<T> c() {
        Object f6;
        synchronized (this) {
            int W = W();
            if (W == 0) {
                return EmptyList.f23167o;
            }
            ArrayList arrayList = new ArrayList(W);
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            for (int i5 = 0; i5 < W; i5++) {
                f6 = k0.f(objArr, this.replayIndex + i5);
                arrayList.add(f6);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @d5.d
    public i<T> d(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return k0.e(this, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r4 = ((kotlinx.coroutines.flow.internal.a) r21).slots;
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.Continuation<kotlin.m2>[] e0(long r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.e0(long):kotlin.coroutines.d[]");
    }

    public final long f0() {
        long j5 = this.replayIndex;
        if (j5 < this.minCollectorIndex) {
            this.minCollectorIndex = j5;
        }
        return j5;
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        synchronized (this) {
            d0(Q(), this.minCollectorIndex, Q(), V());
            m2 m2Var = m2.f23662a;
        }
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean k(T value) {
        int i5;
        boolean z5;
        Continuation<m2>[] continuationArr = kotlinx.coroutines.flow.internal.b.f27995a;
        synchronized (this) {
            if (Z(value)) {
                continuationArr = P(continuationArr);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (Continuation<m2> continuation : continuationArr) {
            if (continuation != null) {
                Result.a aVar = Result.f27242p;
                continuation.s(m2.f23662a);
            }
        }
        return z5;
    }
}
