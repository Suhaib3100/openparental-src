package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u1;
import kotlin.m2;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.z0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004jklmB)\u0012 \u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J¢\u0006\u0004\bi\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR.\u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0014\u0010Z\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0014\u0010\\\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u001a\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010^R\u0011\u0010b\u001a\u0002008F¢\u0006\u0006\u001a\u0004\ba\u0010UR#\u0010f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bg\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Lkotlinx/coroutines/channels/c;", "E", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/channels/w;", "closed", "", "x", "(Lkotlinx/coroutines/channels/w;)Ljava/lang/Throwable;", "element", "w", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/w;)Ljava/lang/Throwable;", "Lkotlin/m2;", "L", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "y", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lkotlinx/coroutines/channels/w;)V", "cause", "z", "(Ljava/lang/Throwable;)V", "u", "(Lkotlinx/coroutines/channels/w;)V", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "", "block", "J", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "", "j", "()I", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "H", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/j0;", "P", "()Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/channels/h0;", "K", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/internal/y$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "k", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/y$b;", "a0", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/r;", "Y", "send", "m", "(Lkotlinx/coroutines/channels/j0;)Ljava/lang/Object;", "Q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "v", "(Lq3/l;)V", "Lkotlinx/coroutines/internal/y;", "I", "(Lkotlinx/coroutines/internal/y;)V", "O", "()Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/channels/c$d;", "l", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/c$d;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o", "Lq3/l;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/w;", "p", "Lkotlinx/coroutines/internal/w;", "s", "()Lkotlinx/coroutines/internal/w;", "queue", "F", "()Z", "isFullImpl", "t", "queueDebugStateString", "B", "isBufferAlwaysFull", "D", "isBufferFull", "r", "()Lkotlinx/coroutines/channels/w;", "closedForSend", "closedForReceive", "c0", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "M", "()Lkotlinx/coroutines/selects/e;", "onSend", "n", "bufferDebugString", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class c<E> implements k0<E> {

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27309q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, ProtectedSandApp.s("岫"));

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    protected final q3.l<E, m2> onUndeliveredElement;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.internal.w queue = new kotlinx.coroutines.internal.w();

    @d5.d
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/channels/c$a;", "E", "Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "c1", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "", "toString", "r", "Ljava/lang/Object;", "element", "", "a1", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class a<E> extends j0 {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public final E element;

        public a(E e6) {
            this.element = e6;
        }

        @Override // kotlinx.coroutines.channels.j0
        public void Z0() {
        }

        @Override // kotlinx.coroutines.channels.j0
        @d5.e
        /* renamed from: a1, reason: from getter */
        public Object getElement() {
            return this.element;
        }

        @Override // kotlinx.coroutines.channels.j0
        public void b1(@d5.d w<?> wVar) {
        }

        @Override // kotlinx.coroutines.channels.j0
        @d5.e
        public r0 c1(@d5.e y.d otherOp) {
            r0 r0Var = kotlinx.coroutines.t.f29000d;
            if (otherOp != null) {
                otherOp.d();
            }
            return r0Var;
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("邆") + z0.b(this) + '(' + this.element + ')';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/c$b;", "E", "Lkotlinx/coroutines/internal/y$b;", "Lkotlinx/coroutines/channels/c$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lkotlinx/coroutines/internal/y;", "affected", "", "e", "Lkotlinx/coroutines/internal/w;", "queue", "element", "<init>", "(Lkotlinx/coroutines/internal/w;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private static class b<E> extends y.b<a<? extends E>> {
        public b(@d5.d kotlinx.coroutines.internal.w wVar, E e6) {
            super(wVar, new a(e6));
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected Object e(@d5.d kotlinx.coroutines.internal.y affected) {
            if (affected instanceof w) {
                return affected;
            }
            if (affected instanceof h0) {
                return kotlinx.coroutines.channels.b.f27305e;
            }
            return null;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0016\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/c$c;", "E", "R", "Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "c1", "Lkotlin/m2;", "Z0", "g", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "d1", "", "toString", "r", "Ljava/lang/Object;", "a1", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/channels/c;", "s", "Lkotlinx/coroutines/channels/c;", "channel", "Lkotlinx/coroutines/selects/f;", "t", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/k0;", "Lkotlin/coroutines/d;", "", "u", "Lq3/p;", "block", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/c;Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static final class C0408c<E, R> extends j0 implements p1 {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final E pollResult;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final c<E> channel;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.selects.f<R> select;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final q3.p<k0<? super E>, Continuation<? super R>, Object> block;

        /* JADX WARN: Multi-variable type inference failed */
        public C0408c(E e6, @d5.d c<E> cVar, @d5.d kotlinx.coroutines.selects.f<? super R> fVar, @d5.d q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> pVar) {
            this.pollResult = e6;
            this.channel = cVar;
            this.select = fVar;
            this.block = pVar;
        }

        @Override // kotlinx.coroutines.channels.j0
        public void Z0() {
            q4.a.f(this.block, this.channel, this.select.L(), null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.j0
        /* renamed from: a1 */
        public E getElement() {
            return this.pollResult;
        }

        @Override // kotlinx.coroutines.channels.j0
        public void b1(@d5.d w<?> wVar) {
            if (this.select.t()) {
                this.select.j0(wVar.h1());
            }
        }

        @Override // kotlinx.coroutines.channels.j0
        @d5.e
        public r0 c1(@d5.e y.d otherOp) {
            return (r0) this.select.j(otherOp);
        }

        @Override // kotlinx.coroutines.channels.j0
        public void d1() {
            q3.l<E, m2> lVar = this.channel.onUndeliveredElement;
            if (lVar != null) {
                kotlinx.coroutines.internal.i0.b(lVar, this.pollResult, this.select.L().getContext());
            }
        }

        @Override // kotlinx.coroutines.p1
        public void g() {
            if (S0()) {
                d1();
            }
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("邈") + z0.b(this) + '(' + this.pollResult + ProtectedSandApp.s("邉") + this.channel + ProtectedSandApp.s("邊") + this.select + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/c$d;", "E", "Lkotlinx/coroutines/internal/y$e;", "Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/y;", "affected", "", "e", "Lkotlinx/coroutines/internal/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Ljava/lang/Object;", "element", "Lkotlinx/coroutines/internal/w;", "queue", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    protected static final class d<E> extends y.e<h0<? super E>> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public final E element;

        public d(E e6, @d5.d kotlinx.coroutines.internal.w wVar) {
            super(wVar);
            this.element = e6;
        }

        @Override // kotlinx.coroutines.internal.y.e, kotlinx.coroutines.internal.y.a
        @d5.e
        protected Object e(@d5.d kotlinx.coroutines.internal.y affected) {
            if (affected instanceof w) {
                return affected;
            }
            if (affected instanceof h0) {
                return null;
            }
            return kotlinx.coroutines.channels.b.f27305e;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        public Object j(@d5.d y.d prepareOp) {
            r0 q02 = ((h0) prepareOp.affected).q0(this.element, prepareOp);
            if (q02 == null) {
                return kotlinx.coroutines.internal.z.f28784a;
            }
            Object obj = kotlinx.coroutines.internal.c.f28690b;
            if (q02 == obj) {
                return obj;
            }
            return null;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/y$f", "Lkotlinx/coroutines/internal/y$c;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class e extends y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f27318d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlinx.coroutines.internal.y yVar, c cVar) {
            super(yVar);
            this.f27318d = cVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@d5.d kotlinx.coroutines.internal.y affected) {
            if (this.f27318d.D()) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/c$f", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/k0;", "R", "Lkotlinx/coroutines/selects/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "V", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements kotlinx.coroutines.selects.e<E, k0<? super E>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ c<E> f27319o;

        f(c<E> cVar) {
            this.f27319o = cVar;
        }

        @Override // kotlinx.coroutines.selects.e
        public <R> void V(@d5.d kotlinx.coroutines.selects.f<? super R> select, E param, @d5.d q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
            this.f27319o.J(select, param, block);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@d5.e q3.l<? super E, m2> lVar) {
        this.onUndeliveredElement = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F() {
        return !(this.queue.L0() instanceof h0) && D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void J(kotlinx.coroutines.selects.f<? super R> select, E element, q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
        while (!select.C()) {
            if (F()) {
                C0408c c0408c = new C0408c(element, this, select, block);
                Object m5 = m(c0408c);
                if (m5 == null) {
                    select.t0(c0408c);
                    return;
                }
                if (m5 instanceof w) {
                    throw q0.p(w(element, (w) m5));
                }
                if (m5 != kotlinx.coroutines.channels.b.f27307g && !(m5 instanceof f0)) {
                    throw new IllegalStateException((ProtectedSandApp.s("岬") + m5 + ' ').toString());
                }
            }
            Object H = H(element, select);
            if (H == kotlinx.coroutines.selects.g.d()) {
                return;
            }
            if (H != kotlinx.coroutines.channels.b.f27305e && H != kotlinx.coroutines.internal.c.f28690b) {
                if (H == kotlinx.coroutines.channels.b.f27304d) {
                    q4.b.d(block, this, select.L());
                    return;
                } else {
                    if (!(H instanceof w)) {
                        throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("岭"), H));
                    }
                    throw q0.p(w(element, (w) H));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(E e6, Continuation<? super m2> continuation) {
        Continuation e7;
        e7 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s b6 = kotlinx.coroutines.u.b(e7);
        while (true) {
            if (F()) {
                j0 l0Var = this.onUndeliveredElement == null ? new l0(e6, b6) : new m0(e6, b6, this.onUndeliveredElement);
                Object m5 = m(l0Var);
                if (m5 == null) {
                    kotlinx.coroutines.u.c(b6, l0Var);
                    break;
                }
                if (m5 instanceof w) {
                    y(b6, e6, (w) m5);
                    break;
                }
                if (m5 != kotlinx.coroutines.channels.b.f27307g && !(m5 instanceof f0)) {
                    throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("岮"), m5));
                }
            }
            Object G = G(e6);
            if (G == kotlinx.coroutines.channels.b.f27304d) {
                Result.a aVar = Result.f27242p;
                b6.s(m2.f23662a);
                break;
            }
            if (G != kotlinx.coroutines.channels.b.f27305e) {
                if (!(G instanceof w)) {
                    throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("岯"), G));
                }
                y(b6, e6, (w) G);
            }
        }
        Object A = b6.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : m2.f23662a;
    }

    private final int j() {
        kotlinx.coroutines.internal.w wVar = this.queue;
        int i5 = 0;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) wVar.K0(); !kotlin.jvm.internal.l0.g(yVar, wVar); yVar = yVar.L0()) {
            if (yVar instanceof kotlinx.coroutines.internal.y) {
                i5++;
            }
        }
        return i5;
    }

    private final String t() {
        String str;
        kotlinx.coroutines.internal.y L0 = this.queue.L0();
        if (L0 == this.queue) {
            return ProtectedSandApp.s("岰");
        }
        if (L0 instanceof w) {
            str = L0.toString();
        } else if (L0 instanceof f0) {
            str = ProtectedSandApp.s("岱");
        } else if (L0 instanceof j0) {
            str = ProtectedSandApp.s("岲");
        } else {
            str = ProtectedSandApp.s("岳") + L0;
        }
        kotlinx.coroutines.internal.y M0 = this.queue.M0();
        if (M0 == L0) {
            return str;
        }
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, ProtectedSandApp.s("岴"));
        a6.append(j());
        String sb = a6.toString();
        if (!(M0 instanceof w)) {
            return sb;
        }
        return sb + ProtectedSandApp.s("岵") + M0;
    }

    private final void u(w<?> closed) {
        Object obj = null;
        while (true) {
            kotlinx.coroutines.internal.y M0 = closed.M0();
            f0 f0Var = M0 instanceof f0 ? (f0) M0 : null;
            if (f0Var == null) {
                break;
            } else if (f0Var.S0()) {
                obj = kotlinx.coroutines.internal.q.h(obj, f0Var);
            } else {
                f0Var.N0();
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    } else {
                        ((f0) arrayList.get(size)).b1(closed);
                    }
                }
            } else {
                ((f0) obj).b1(closed);
            }
        }
        I(closed);
    }

    private final Throwable w(E element, w<?> closed) {
        UndeliveredElementException d6;
        u(closed);
        q3.l<E, m2> lVar = this.onUndeliveredElement;
        if (lVar == null || (d6 = kotlinx.coroutines.internal.i0.d(lVar, element, null, 2, null)) == null) {
            return closed.h1();
        }
        kotlin.p.a(d6, closed.h1());
        throw d6;
    }

    private final Throwable x(w<?> closed) {
        u(closed);
        return closed.h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Continuation<?> continuation, E e6, w<?> wVar) {
        UndeliveredElementException d6;
        u(wVar);
        Throwable h12 = wVar.h1();
        q3.l<E, m2> lVar = this.onUndeliveredElement;
        if (lVar == null || (d6 = kotlinx.coroutines.internal.i0.d(lVar, e6, null, 2, null)) == null) {
            Result.a aVar = Result.f27242p;
            continuation.s(a1.a(h12));
        } else {
            kotlin.p.a(d6, h12);
            Result.a aVar2 = Result.f27242p;
            continuation.s(a1.a(d6));
        }
    }

    private final void z(Throwable cause) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = kotlinx.coroutines.channels.b.f27308h) || !androidx.concurrent.futures.d.a(f27309q, this, obj, r0Var)) {
            return;
        }
        ((q3.l) u1.q(obj, 1)).N(cause);
    }

    protected abstract boolean B();

    protected abstract boolean D();

    @d5.d
    protected Object G(E element) {
        h0<E> O;
        do {
            O = O();
            if (O == null) {
                return kotlinx.coroutines.channels.b.f27305e;
            }
        } while (O.q0(element, null) == null);
        O.Z(element);
        return O.k();
    }

    @d5.d
    protected Object H(E element, @d5.d kotlinx.coroutines.selects.f<?> select) {
        d<E> l5 = l(element);
        Object l02 = select.l0(l5);
        if (l02 != null) {
            return l02;
        }
        h0<? super E> o5 = l5.o();
        o5.Z(element);
        return o5.k();
    }

    protected void I(@d5.d kotlinx.coroutines.internal.y closed) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    protected final h0<?> K(E element) {
        kotlinx.coroutines.internal.y M0;
        kotlinx.coroutines.internal.w wVar = this.queue;
        a aVar = new a(element);
        do {
            M0 = wVar.M0();
            if (M0 instanceof h0) {
                return (h0) M0;
            }
        } while (!M0.D0(aVar, wVar));
        return null;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public final kotlinx.coroutines.selects.e<E, k0<E>> M() {
        return new f(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.y] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @d5.e
    protected h0<E> O() {
        ?? r12;
        kotlinx.coroutines.internal.y V0;
        kotlinx.coroutines.internal.w wVar = this.queue;
        while (true) {
            r12 = (kotlinx.coroutines.internal.y) wVar.K0();
            if (r12 != wVar && (r12 instanceof h0)) {
                if (((((h0) r12) instanceof w) && !r12.P0()) || (V0 = r12.V0()) == null) {
                    break;
                }
                V0.O0();
            }
        }
        r12 = 0;
        return (h0) r12;
    }

    @d5.e
    protected final j0 P() {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y V0;
        kotlinx.coroutines.internal.w wVar = this.queue;
        while (true) {
            yVar = (kotlinx.coroutines.internal.y) wVar.K0();
            if (yVar != wVar && (yVar instanceof j0)) {
                if (((((j0) yVar) instanceof w) && !yVar.P0()) || (V0 = yVar.V0()) == null) {
                    break;
                }
                V0.O0();
            }
        }
        yVar = null;
        return (j0) yVar;
    }

    @Override // kotlinx.coroutines.channels.k0
    /* renamed from: Q */
    public boolean a(@d5.e Throwable cause) {
        boolean z5;
        w<?> wVar = new w<>(cause);
        kotlinx.coroutines.internal.y yVar = this.queue;
        while (true) {
            kotlinx.coroutines.internal.y M0 = yVar.M0();
            z5 = true;
            if (!(!(M0 instanceof w))) {
                z5 = false;
                break;
            }
            if (M0.D0(wVar, yVar)) {
                break;
            }
        }
        if (!z5) {
            wVar = (w) this.queue.M0();
        }
        u(wVar);
        if (z5) {
            z(cause);
        }
        return z5;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.d
    public final Object Y(E element) {
        Object G = G(element);
        if (G == kotlinx.coroutines.channels.b.f27304d) {
            r.Companion companion = r.INSTANCE;
            m2 m2Var = m2.f23662a;
            companion.getClass();
            return r.c(m2Var);
        }
        if (G != kotlinx.coroutines.channels.b.f27305e) {
            if (G instanceof w) {
                return r.INSTANCE.a(x((w) G));
            }
            throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("岶"), G));
        }
        w<?> r5 = r();
        if (r5 != null) {
            return r.INSTANCE.a(x(r5));
        }
        r.INSTANCE.getClass();
        return r.f27388c;
    }

    @Override // kotlinx.coroutines.channels.k0
    @d5.e
    public final Object a0(E e6, @d5.d Continuation<? super m2> continuation) {
        if (G(e6) == kotlinx.coroutines.channels.b.f27304d) {
            return m2.f23662a;
        }
        Object L = L(e6, continuation);
        return L == CoroutineSingletons.COROUTINE_SUSPENDED ? L : m2.f23662a;
    }

    @Override // kotlinx.coroutines.channels.k0
    public final boolean c0() {
        return r() != null;
    }

    @d5.d
    protected final y.b<?> k(E element) {
        return new b(this.queue, element);
    }

    @d5.d
    protected final d<E> l(E element) {
        return new d<>(element, this.queue);
    }

    @d5.e
    protected Object m(@d5.d j0 send) {
        boolean z5;
        kotlinx.coroutines.internal.y M0;
        if (B()) {
            kotlinx.coroutines.internal.y yVar = this.queue;
            do {
                M0 = yVar.M0();
                if (M0 instanceof h0) {
                    return M0;
                }
            } while (!M0.D0(send, yVar));
            return null;
        }
        kotlinx.coroutines.internal.y yVar2 = this.queue;
        e eVar = new e(send, this);
        while (true) {
            kotlinx.coroutines.internal.y M02 = yVar2.M0();
            if (!(M02 instanceof h0)) {
                int X0 = M02.X0(send, yVar2, eVar);
                z5 = true;
                if (X0 != 1) {
                    if (X0 == 2) {
                        z5 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return M02;
            }
        }
        if (z5) {
            return null;
        }
        return kotlinx.coroutines.channels.b.f27307g;
    }

    @d5.d
    protected String n() {
        return "";
    }

    @d5.e
    protected final w<?> o() {
        kotlinx.coroutines.internal.y L0 = this.queue.L0();
        w<?> wVar = L0 instanceof w ? (w) L0 : null;
        if (wVar == null) {
            return null;
        }
        u(wVar);
        return wVar;
    }

    @Override // kotlinx.coroutines.channels.k0
    public boolean offer(E element) {
        UndeliveredElementException d6;
        try {
            return k0.a.c(this, element);
        } catch (Throwable th) {
            q3.l<E, m2> lVar = this.onUndeliveredElement;
            if (lVar == null || (d6 = kotlinx.coroutines.internal.i0.d(lVar, element, null, 2, null)) == null) {
                throw th;
            }
            kotlin.p.a(d6, th);
            throw d6;
        }
    }

    @d5.e
    protected final w<?> r() {
        kotlinx.coroutines.internal.y M0 = this.queue.M0();
        w<?> wVar = M0 instanceof w ? (w) M0 : null;
        if (wVar == null) {
            return null;
        }
        u(wVar);
        return wVar;
    }

    @d5.d
    /* renamed from: s, reason: from getter */
    protected final kotlinx.coroutines.internal.w getQueue() {
        return this.queue;
    }

    @d5.d
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '{' + t() + '}' + n();
    }

    @Override // kotlinx.coroutines.channels.k0
    public void v(@d5.d q3.l<? super Throwable, m2> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27309q;
        if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, null, handler)) {
            w<?> r5 = r();
            if (r5 == null || !androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, handler, kotlinx.coroutines.channels.b.f27308h)) {
                return;
            }
            handler.N(r5.closeCause);
            return;
        }
        Object obj = this.onCloseHandler;
        if (obj == kotlinx.coroutines.channels.b.f27308h) {
            throw new IllegalStateException(ProtectedSandApp.s("岷"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("岸") + obj);
    }
}
