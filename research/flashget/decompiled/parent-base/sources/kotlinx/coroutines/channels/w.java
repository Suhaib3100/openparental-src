package kotlinx.coroutines.channels;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.y3;

/* compiled from: ConflatedBufferedChannel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0090@ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0017J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0015J%\u0010\u001d\u001a\u00020\b2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 \u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/channels/w;", "E", "Lkotlinx/coroutines/channels/j;", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/i;Lld/l;)V", "element", "", "isSendOp", "Lkotlinx/coroutines/channels/p;", "N1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "L1", "M1", "(Ljava/lang/Object;)Ljava/lang/Object;", "f0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o1", "M", "Lkotlinx/coroutines/selects/m;", "select", "", "i1", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "v1", "()Z", "n", "I", "o", "Lkotlinx/coroutines/channels/i;", "B0", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* loaded from: classes7.dex */
public class w<E> extends j<E> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i onBufferOverflow;

    public /* synthetic */ w(int i4, i iVar, ld.l lVar, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, iVar, (i5 & 4) != 0 ? null : lVar);
    }

    static /* synthetic */ <E> Object J1(w<E> wVar, E e4, kotlin.coroutines.d<? super k2> dVar) {
        UndeliveredElementException d5;
        Object N1 = wVar.N1(e4, true);
        if (!(N1 instanceof p.a)) {
            return k2.f75408a;
        }
        p.f(N1);
        ld.l<E, k2> lVar = wVar.onUndeliveredElement;
        if (lVar == null || (d5 = j0.d(lVar, e4, null, 2, null)) == null) {
            throw wVar.p0();
        }
        kotlin.o.a(d5, wVar.p0());
        throw d5;
    }

    static <E> Object K1(w<E> wVar, E e4, kotlin.coroutines.d<? super Boolean> dVar) {
        Object N1 = wVar.N1(e4, true);
        if (N1 instanceof p.c) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    private final Object L1(E element, boolean isSendOp) {
        ld.l<E, k2> lVar;
        UndeliveredElementException d5;
        Object M = super.M(element);
        if (p.m(M) || (M instanceof p.a)) {
            return M;
        }
        if (isSendOp && (lVar = this.onUndeliveredElement) != null && (d5 = j0.d(lVar, element, null, 2, null)) != null) {
            throw d5;
        }
        p.Companion companion = p.INSTANCE;
        k2 k2Var = k2.f75408a;
        companion.getClass();
        return p.c(k2Var);
    }

    private final Object M1(E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        q qVar;
        int E1;
        q Z;
        Object obj = k.f79369f;
        atomicReferenceFieldUpdater = j.f79327i;
        q qVar2 = (q) atomicReferenceFieldUpdater.get(this);
        while (true) {
            atomicLongFieldUpdater = j.f79323e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean l4 = j.l(this, andIncrement);
            int i4 = k.f79365b;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (qVar2.id != j5) {
                Z = Z(j5, qVar2);
                if (Z != null) {
                    qVar = Z;
                } else if (l4) {
                    break;
                }
            } else {
                qVar = qVar2;
            }
            E1 = E1(qVar, i5, element, j4, obj, l4);
            if (E1 == 0) {
                qVar.b();
                p.Companion companion = p.INSTANCE;
                k2 k2Var = k2.f75408a;
                companion.getClass();
                return p.c(k2Var);
            }
            if (E1 == 1) {
                p.Companion companion2 = p.INSTANCE;
                k2 k2Var2 = k2.f75408a;
                companion2.getClass();
                return p.c(k2Var2);
            }
            if (E1 != 2) {
                if (E1 == 3) {
                    throw new IllegalStateException(ProtectedSandApp.s("蘌\u0001"));
                }
                if (E1 != 4) {
                    if (E1 == 5) {
                        qVar.b();
                    }
                    qVar2 = qVar;
                } else if (j4 < o0()) {
                    qVar.b();
                }
            } else {
                if (!l4) {
                    y3 y3Var = obj instanceof y3 ? (y3) obj : null;
                    if (y3Var != null) {
                        V0(y3Var, qVar, i5);
                    }
                    S((qVar.id * i4) + i5);
                    p.Companion companion3 = p.INSTANCE;
                    k2 k2Var3 = k2.f75408a;
                    companion3.getClass();
                    return p.c(k2Var3);
                }
                qVar.r();
            }
        }
        return p.INSTANCE.a(p0());
    }

    private final Object N1(E element, boolean isSendOp) {
        return this.onBufferOverflow == i.DROP_LATEST ? L1(element, isSendOp) : M1(element);
    }

    @Override // kotlinx.coroutines.channels.j
    protected boolean B0() {
        return this.onBufferOverflow == i.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    @fg.l
    public Object M(E element) {
        return N1(element, false);
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return J1(this, e4, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.j
    protected void i1(@fg.l kotlinx.coroutines.selects.m<?> select, @fg.m Object element) {
        Object M = M(element);
        if (!(M instanceof p.c)) {
            select.d(k2.f75408a);
        } else {
            if (!(M instanceof p.a)) {
                throw new IllegalStateException(ProtectedSandApp.s("蘍\u0001"));
            }
            p.f(M);
            select.d(k.z());
        }
    }

    @Override // kotlinx.coroutines.channels.j
    @fg.m
    public Object o1(E e4, @fg.l kotlin.coroutines.d<? super Boolean> dVar) {
        return K1(this, e4, dVar);
    }

    @Override // kotlinx.coroutines.channels.j
    public boolean v1() {
        return false;
    }

    public w(int i4, @fg.l i iVar, @fg.m ld.l<? super E, k2> lVar) {
        super(i4, lVar);
        this.capacity = i4;
        this.onBufferOverflow = iVar;
        if (iVar != i.SUSPEND) {
            if (i4 < 1) {
                throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("蘈\u0001"), i4, ProtectedSandApp.s("蘉\u0001")).toString());
            }
        } else {
            throw new IllegalArgumentException((ProtectedSandApp.s("蘊\u0001") + l1.d(j.class).W() + ProtectedSandApp.s("蘋\u0001")).toString());
        }
    }
}
