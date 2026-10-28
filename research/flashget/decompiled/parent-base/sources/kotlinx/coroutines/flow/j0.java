package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.m1;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001BB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0019\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u00010\u001a2\u0006\u00106\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J3\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0014\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001eH\u0002¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020A2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0096@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bD\u0010\u0011J\u001b\u0010E\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\bE\u0010%J\u000f\u0010F\u001a\u00020\u0016H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0006\u0010H\u001a\u00020\u0016H\u0000¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0003H\u0014¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010M\u001a\u00020\u0007H\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010\u0015J-\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010NR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010]\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u0014R\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0014R\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010NR\u0016\u0010d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010NR\u0014\u0010f\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010GR\u0014\u0010i\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0014\u0010m\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010GR\u0014\u0010n\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010GR\u001a\u0010r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0015\u001a\u0004\bo\u0010pR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006w"}, d2 = {"Lkotlinx/coroutines/flow/j0;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/p;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/i;)V", "value", "", "X", "(Ljava/lang/Object;)Z", "Y", "Lkotlin/k2;", "J", "()V", "", "newHead", "G", "(J)V", "", "item", "M", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "W", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "L", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j0$a;", "emitter", "D", "(Lkotlinx/coroutines/flow/j0$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "b0", "(JJJJ)V", "E", "slot", "a0", "(Lkotlinx/coroutines/flow/l0;)Ljava/lang/Object;", "Z", "(Lkotlinx/coroutines/flow/l0;)J", "index", "S", "(J)Ljava/lang/Object;", "C", "(Lkotlinx/coroutines/flow/l0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "resumesIn", "N", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "Lkotlinx/coroutines/flow/j;", "collector", "", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "emit", "d0", "()J", "oldIndex", "c0", "(J)[Lkotlin/coroutines/d;", "H", "()Lkotlinx/coroutines/flow/l0;", "size", "I", "(I)[Lkotlinx/coroutines/flow/l0;", "j", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/flow/i;", "d", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/i;", "f", "g", "h", "Lkotlinx/coroutines/channels/i;", "i", "[Ljava/lang/Object;", "buffer", "replayIndex", "k", "minCollectorIndex", "l", "bufferSize", "m", "queueSize", "P", "head", "U", "()I", "replaySize", "V", "totalSize", "O", "bufferEndIndex", "queueEndIndex", "Q", "()Ljava/lang/Object;", "R", "lastReplayedLocked", "", "e", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
/* loaded from: classes7.dex */
public class j0<T> extends kotlinx.coroutines.flow.internal.a<l0> implements d0<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.i onBufferOverflow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object[] buffer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/j0$a;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/flow/j0;", "flow", "", "index", "", "value", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "cont", "<init>", "(Lkotlinx/coroutines/flow/j0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "dispose", "()V", "b", "Lkotlinx/coroutines/flow/j0;", "c", "J", "d", "Ljava/lang/Object;", "e", "Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements m1 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final j0<?> flow;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public long index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final Object value;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final kotlin.coroutines.d<k2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l j0<?> j0Var, long j4, @fg.m Object obj, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.flow = j0Var;
            this.index = j4;
            this.value = obj;
            this.cont = dVar;
        }

        @Override // kotlinx.coroutines.m1
        public void dispose() {
            this.flow.D(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80185a;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.i.values().length];
            try {
                iArr[kotlinx.coroutines.channels.i.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.i.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.i.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80185a = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {372, 379, 382}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80186b;

        /* renamed from: c, reason: collision with root package name */
        Object f80187c;

        /* renamed from: d, reason: collision with root package name */
        Object f80188d;

        /* renamed from: e, reason: collision with root package name */
        Object f80189e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j0<T> f80191g;

        /* renamed from: h, reason: collision with root package name */
        int f80192h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0<T> j0Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f80191g = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80190f = obj;
            this.f80192h |= Integer.MIN_VALUE;
            return j0.F(this.f80191g, null, this);
        }
    }

    public j0(int i4, int i5, @fg.l kotlinx.coroutines.channels.i iVar) {
        this.replay = i4;
        this.bufferCapacity = i5;
        this.onBufferOverflow = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(l0 l0Var, kotlin.coroutines.d<? super k2> dVar) {
        k2 k2Var;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        synchronized (this) {
            try {
                if (Z(l0Var) < 0) {
                    l0Var.cont = qVar;
                } else {
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    qVar.resumeWith(k2.f75408a);
                }
                k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : k2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(a emitter) {
        Object f4;
        synchronized (this) {
            if (emitter.index < P()) {
                return;
            }
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            f4 = k0.f(objArr, emitter.index);
            if (f4 != emitter) {
                return;
            }
            k0.g(objArr, emitter.index, k0.f80194a);
            E();
            k2 k2Var = k2.f75408a;
        }
    }

    private final void E() {
        Object f4;
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            while (this.queueSize > 0) {
                f4 = k0.f(objArr, (P() + V()) - 1);
                if (f4 != k0.f80194a) {
                    return;
                }
                this.queueSize--;
                k0.g(objArr, P() + V(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> java.lang.Object F(kotlinx.coroutines.flow.j0<T> r8, kotlinx.coroutines.flow.j<? super T> r9, kotlin.coroutines.d<?> r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.F(kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = ((kotlinx.coroutines.flow.internal.a) r8).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(long r9) {
        /*
            r8 = this;
            int r0 = kotlinx.coroutines.flow.internal.a.f(r8)
            if (r0 == 0) goto L27
            kotlinx.coroutines.flow.internal.c[] r0 = kotlinx.coroutines.flow.internal.a.g(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.G(long):void");
    }

    private final void J() {
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        k0.g(objArr, P(), null);
        this.bufferSize--;
        long P = P() + 1;
        if (this.replayIndex < P) {
            this.replayIndex = P;
        }
        if (this.minCollectorIndex < P) {
            G(P);
        }
    }

    static <T> Object K(j0<T> j0Var, T t4, kotlin.coroutines.d<? super k2> dVar) {
        if (j0Var.b(t4)) {
            return k2.f75408a;
        }
        Object L = j0Var.L(t4, dVar);
        return L == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? L : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(T t4, kotlin.coroutines.d<? super k2> dVar) {
        kotlin.coroutines.d<k2>[] dVarArr;
        a aVar;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        kotlin.coroutines.d<k2>[] dVarArr2 = kotlinx.coroutines.flow.internal.b.f80026a;
        synchronized (this) {
            try {
                if (X(t4)) {
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    qVar.resumeWith(k2.f75408a);
                    dVarArr = N(dVarArr2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, V() + P(), t4, qVar);
                    M(aVar2);
                    this.queueSize++;
                    if (this.bufferCapacity == 0) {
                        dVarArr2 = N(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            kotlinx.coroutines.s.a(qVar, aVar);
        }
        for (kotlin.coroutines.d<k2> dVar2 : dVarArr) {
            if (dVar2 != null) {
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                dVar2.resumeWith(k2.f75408a);
            }
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar3) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar3 ? y4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Object item) {
        int V = V();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = W(null, 0, 2);
        } else if (V >= objArr.length) {
            objArr = W(objArr, V, objArr.length * 2);
        }
        k0.g(objArr, P() + V, item);
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
    public final kotlin.coroutines.d<kotlin.k2>[] N(kotlin.coroutines.d<kotlin.k2>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = kotlinx.coroutines.flow.internal.a.f(r10)
            if (r1 == 0) goto L4b
            kotlinx.coroutines.flow.internal.c[] r1 = kotlinx.coroutines.flow.internal.a.g(r10)
            if (r1 == 0) goto L4b
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            if (r4 == 0) goto L48
            kotlinx.coroutines.flow.l0 r4 = (kotlinx.coroutines.flow.l0) r4
            kotlin.coroutines.d<? super kotlin.k2> r5 = r4.cont
            if (r5 != 0) goto L1c
            goto L48
        L1c:
            long r6 = r10.Z(r4)
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
            java.lang.String r6 = "蜼\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            kotlin.jvm.internal.l0.o(r11, r6)
        L3d:
            r6 = r11
            kotlin.coroutines.d[] r6 = (kotlin.coroutines.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.cont = r0
            r0 = r7
        L48:
            int r3 = r3 + 1
            goto Lf
        L4b:
            kotlin.coroutines.d[] r11 = (kotlin.coroutines.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.N(kotlin.coroutines.d[]):kotlin.coroutines.d[]");
    }

    private final long O() {
        return P() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    protected static /* synthetic */ void R() {
    }

    private final Object S(long index) {
        Object f4;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        f4 = k0.f(objArr, index);
        return f4 instanceof a ? ((a) f4).value : f4;
    }

    private final long T() {
        return P() + this.bufferSize + this.queueSize;
    }

    private final int U() {
        return (int) ((P() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] W(Object[] curBuffer, int curSize, int newSize) {
        Object f4;
        if (newSize <= 0) {
            throw new IllegalStateException(ProtectedSandApp.s("蜽\u0001"));
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long P = P();
        for (int i4 = 0; i4 < curSize; i4++) {
            long j4 = i4 + P;
            f4 = k0.f(curBuffer, j4);
            k0.g(objArr, j4, f4);
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X(T value) {
        if (getNCollectors() == 0) {
            return Y(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i4 = b.f80185a[this.onBufferOverflow.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2) {
                return true;
            }
        }
        M(value);
        int i5 = this.bufferSize + 1;
        this.bufferSize = i5;
        if (i5 > this.bufferCapacity) {
            J();
        }
        if (U() > this.replay) {
            b0(this.replayIndex + 1, this.minCollectorIndex, O(), T());
        }
        return true;
    }

    private final boolean Y(T value) {
        if (this.replay == 0) {
            return true;
        }
        M(value);
        int i4 = this.bufferSize + 1;
        this.bufferSize = i4;
        if (i4 > this.replay) {
            J();
        }
        this.minCollectorIndex = P() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Z(l0 slot) {
        long j4 = slot.index;
        if (j4 < O()) {
            return j4;
        }
        if (this.bufferCapacity <= 0 && j4 <= P() && this.queueSize != 0) {
            return j4;
        }
        return -1L;
    }

    private final Object a0(l0 slot) {
        Object obj;
        kotlin.coroutines.d<k2>[] dVarArr = kotlinx.coroutines.flow.internal.b.f80026a;
        synchronized (this) {
            try {
                long Z = Z(slot);
                if (Z < 0) {
                    obj = k0.f80194a;
                } else {
                    long j4 = slot.index;
                    Object S = S(Z);
                    slot.index = Z + 1;
                    dVarArr = c0(j4);
                    obj = S;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d<k2> dVar : dVarArr) {
            if (dVar != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                dVar.resumeWith(k2.f75408a);
            }
        }
        return obj;
    }

    private final void b0(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long min = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long P = P(); P < min; P++) {
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            k0.g(objArr, P, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - min);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @fg.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public l0 k() {
        return new l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @fg.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public l0[] l(int size) {
        return new l0[size];
    }

    protected final T Q() {
        Object f4;
        Object[] objArr = this.buffer;
        kotlin.jvm.internal.l0.m(objArr);
        f4 = k0.f(objArr, (this.replayIndex + U()) - 1);
        return (T) f4;
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @fg.m
    public Object a(@fg.l j<? super T> jVar, @fg.l kotlin.coroutines.d<?> dVar) {
        return F(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean b(T value) {
        int i4;
        boolean z4;
        kotlin.coroutines.d<k2>[] dVarArr = kotlinx.coroutines.flow.internal.b.f80026a;
        synchronized (this) {
            if (X(value)) {
                dVarArr = N(dVarArr);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (kotlin.coroutines.d<k2> dVar : dVarArr) {
            if (dVar != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                dVar.resumeWith(k2.f75408a);
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r4 = ((kotlinx.coroutines.flow.internal.a) r21).slots;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.d<kotlin.k2>[] c0(long r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j0.c0(long):kotlin.coroutines.d[]");
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @fg.l
    public i<T> d(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return k0.e(this, context, capacity, onBufferOverflow);
    }

    public final long d0() {
        long j4 = this.replayIndex;
        if (j4 < this.minCollectorIndex) {
            this.minCollectorIndex = j4;
        }
        return j4;
    }

    @Override // kotlinx.coroutines.flow.i0
    @fg.l
    public List<T> e() {
        Object f4;
        synchronized (this) {
            int U = U();
            if (U == 0) {
                return kotlin.collections.j0.f74919b;
            }
            ArrayList arrayList = new ArrayList(U);
            Object[] objArr = this.buffer;
            kotlin.jvm.internal.l0.m(objArr);
            for (int i4 = 0; i4 < U; i4++) {
                f4 = k0.f(objArr, this.replayIndex + i4);
                arrayList.add(f4);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return K(this, t4, dVar);
    }

    @Override // kotlinx.coroutines.flow.d0
    public void j() {
        synchronized (this) {
            b0(O(), this.minCollectorIndex, O(), T());
            k2 k2Var = k2.f75408a;
        }
    }
}
