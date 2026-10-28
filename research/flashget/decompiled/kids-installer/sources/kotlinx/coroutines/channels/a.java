package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.m2;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.z0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007(VWX+FYB)\u0012 \u0010S\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Qj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`R¢\u0006\u0004\bT\u0010UJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010!J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J\u0012\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007J\u0016\u0010+\u001a\u00020\u00132\u000e\u0010'\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*J\u0019\u0010,\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000bH\u0014J/\u00105\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\n\u00104\u001a\u0006\u0012\u0002\b\u000303H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0086\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0004J\u0010\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014J\b\u0010=\u001a\u00020\u0013H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014R\u0014\u0010A\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010E\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0014\u0010H\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010@R\u0014\u0010J\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0K8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bO\u0010M\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/channels/n;", "R", "", "receiveMode", "o0", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f0;", "receive", "", "Z", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/d;", "block", "Lkotlin/m2;", "p0", "(Lkotlinx/coroutines/selects/f;ILq3/p;)V", "value", "r0", "(Lq3/p;Lkotlinx/coroutines/selects/f;ILjava/lang/Object;)V", "d0", "(Lkotlinx/coroutines/selects/f;Lq3/p;I)Z", "Lkotlinx/coroutines/q;", "cont", "q0", "m0", "n0", "N", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b0", "Lkotlinx/coroutines/channels/r;", "A", "()Ljava/lang/Object;", "", "cause", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "W", "(Ljava/lang/Throwable;)Z", "wasClosed", "i0", "Lkotlinx/coroutines/internal/q;", "Lkotlinx/coroutines/channels/j0;", "list", "Lkotlinx/coroutines/channels/w;", "closed", "j0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/w;)V", "Lkotlinx/coroutines/channels/p;", "iterator", "Lkotlinx/coroutines/channels/a$g;", "X", "Lkotlinx/coroutines/channels/h0;", "O", "l0", "k0", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "e0", "hasReceiveOrClosed", "f", "isClosedForReceive", "isEmpty", "h0", "isEmptyImpl", "Lkotlinx/coroutines/selects/d;", "h", "()Lkotlinx/coroutines/selects/d;", "onReceive", "p", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lq3/l;)V", "b", "c", "d", "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class a<E> extends kotlinx.coroutines.channels.c<E> implements n<E> {

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/a$a;", "E", "Lkotlinx/coroutines/channels/p;", "", "result", "", "e", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "next", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", "Lkotlinx/coroutines/channels/a;", "channel", "b", "Ljava/lang/Object;", "d", "g", "(Ljava/lang/Object;)V", "<init>", "(Lkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0407a<E> implements p<E> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final a<E> channel;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private Object result = kotlinx.coroutines.channels.b.f27306f;

        public C0407a(@d5.d a<E> aVar) {
            this.channel = aVar;
        }

        private final boolean e(Object result) {
            if (!(result instanceof w)) {
                return true;
            }
            w wVar = (w) result;
            if (wVar.closeCause == null) {
                return false;
            }
            throw q0.p(wVar.g1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object f(Continuation<? super Boolean> continuation) {
            Continuation e6;
            e6 = kotlin.coroutines.intrinsics.c.e(continuation);
            kotlinx.coroutines.s b6 = kotlinx.coroutines.u.b(e6);
            d dVar = new d(this, b6);
            while (true) {
                if (this.channel.Z(dVar)) {
                    this.channel.q0(b6, dVar);
                    break;
                }
                Object m02 = this.channel.m0();
                this.result = m02;
                if (m02 instanceof w) {
                    w wVar = (w) m02;
                    if (wVar.closeCause == null) {
                        Result.a aVar = Result.f27242p;
                        b6.s(Boolean.FALSE);
                    } else {
                        Result.a aVar2 = Result.f27242p;
                        b6.s(a1.a(wVar.g1()));
                    }
                } else if (m02 != kotlinx.coroutines.channels.b.f27306f) {
                    Boolean bool = Boolean.TRUE;
                    q3.l<E, m2> lVar = this.channel.onUndeliveredElement;
                    b6.y(bool, lVar != null ? kotlinx.coroutines.internal.i0.a(lVar, m02, b6.getF23291o()) : null);
                }
            }
            Object A = b6.A();
            if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return A;
        }

        @Override // kotlinx.coroutines.channels.p
        @d5.e
        public Object a(@d5.d Continuation<? super Boolean> continuation) {
            Object obj = this.result;
            r0 r0Var = kotlinx.coroutines.channels.b.f27306f;
            if (obj != r0Var) {
                return Boolean.valueOf(e(obj));
            }
            Object m02 = this.channel.m0();
            this.result = m02;
            return m02 != r0Var ? Boolean.valueOf(e(m02)) : f(continuation);
        }

        @Override // kotlinx.coroutines.channels.p
        @p3.i(name = "next")
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object b(Continuation continuation) {
            return p.a.a(this, continuation);
        }

        @d5.e
        /* renamed from: d, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final void g(@d5.e Object obj) {
            this.result = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.p
        public E next() {
            E e6 = (E) this.result;
            if (e6 instanceof w) {
                throw q0.p(((w) e6).g1());
            }
            r0 r0Var = kotlinx.coroutines.channels.b.f27306f;
            if (e6 == r0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("岢"));
            }
            this.result = r0Var;
            return e6;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/a$b;", "E", "Lkotlinx/coroutines/channels/f0;", "value", "", "c1", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "q0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/y$d;)Lkotlinx/coroutines/internal/r0;", "Lkotlin/m2;", "Z", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "", "toString", "Lkotlinx/coroutines/q;", "r", "Lkotlinx/coroutines/q;", "cont", "", "s", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/q;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static class b<E> extends f0<E> {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.q<Object> cont;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public final int receiveMode;

        public b(@d5.d kotlinx.coroutines.q<Object> qVar, int i5) {
            this.cont = qVar;
            this.receiveMode = i5;
        }

        @Override // kotlinx.coroutines.channels.h0
        public void Z(E value) {
            this.cont.v0(kotlinx.coroutines.t.f29000d);
        }

        @Override // kotlinx.coroutines.channels.f0
        public void b1(@d5.d w<?> wVar) {
            if (this.receiveMode != 1) {
                kotlinx.coroutines.q<Object> qVar = this.cont;
                Result.a aVar = Result.f27242p;
                qVar.s(a1.a(wVar.g1()));
            } else {
                kotlinx.coroutines.q<Object> qVar2 = this.cont;
                r b6 = r.b(r.INSTANCE.a(wVar.closeCause));
                Result.a aVar2 = Result.f27242p;
                qVar2.s(b6);
            }
        }

        @d5.e
        public final Object c1(E value) {
            if (this.receiveMode != 1) {
                return value;
            }
            r.INSTANCE.getClass();
            return r.b(r.c(value));
        }

        @Override // kotlinx.coroutines.channels.h0
        @d5.e
        public r0 q0(E value, @d5.e y.d otherOp) {
            if (this.cont.u(c1(value), otherOp != null ? otherOp.desc : null, a1(value)) == null) {
                return null;
            }
            if (otherOp != null) {
                otherOp.d();
            }
            return kotlinx.coroutines.t.f29000d;
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("遹") + z0.b(this) + ProtectedSandApp.s("遺") + this.receiveMode + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/a$c;", "E", "Lkotlinx/coroutines/channels/a$b;", "value", "Lkotlin/Function1;", "", "Lkotlin/m2;", "a1", "(Ljava/lang/Object;)Lq3/l;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "t", "Lq3/l;", "onUndeliveredElement", "Lkotlinx/coroutines/q;", "", "cont", "", "receiveMode", "<init>", "(Lkotlinx/coroutines/q;ILq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class c<E> extends b<E> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final q3.l<E, m2> onUndeliveredElement;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@d5.d kotlinx.coroutines.q<Object> qVar, int i5, @d5.d q3.l<? super E, m2> lVar) {
            super(qVar, i5);
            this.onUndeliveredElement = lVar;
        }

        @Override // kotlinx.coroutines.channels.f0
        @d5.e
        public q3.l<Throwable, m2> a1(E value) {
            return kotlinx.coroutines.internal.i0.a(this.onUndeliveredElement, value, this.cont.getF23291o());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/a$d;", "E", "Lkotlinx/coroutines/channels/f0;", "value", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "q0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/y$d;)Lkotlinx/coroutines/internal/r0;", "Lkotlin/m2;", "Z", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "Lkotlin/Function1;", "", "a1", "(Ljava/lang/Object;)Lq3/l;", "", "toString", "Lkotlinx/coroutines/channels/a$a;", "r", "Lkotlinx/coroutines/channels/a$a;", "iterator", "Lkotlinx/coroutines/q;", "", "s", "Lkotlinx/coroutines/q;", "cont", "<init>", "(Lkotlinx/coroutines/channels/a$a;Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static class d<E> extends f0<E> {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final C0407a<E> iterator;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.q<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@d5.d C0407a<E> c0407a, @d5.d kotlinx.coroutines.q<? super Boolean> qVar) {
            this.iterator = c0407a;
            this.cont = qVar;
        }

        @Override // kotlinx.coroutines.channels.h0
        public void Z(E value) {
            this.iterator.g(value);
            this.cont.v0(kotlinx.coroutines.t.f29000d);
        }

        @Override // kotlinx.coroutines.channels.f0
        @d5.e
        public q3.l<Throwable, m2> a1(E value) {
            q3.l<E, m2> lVar = this.iterator.channel.onUndeliveredElement;
            if (lVar != null) {
                return kotlinx.coroutines.internal.i0.a(lVar, value, this.cont.getF23291o());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.f0
        public void b1(@d5.d w<?> wVar) {
            Object b6 = wVar.closeCause == null ? q.a.b(this.cont, Boolean.FALSE, null, 2, null) : this.cont.J(wVar.g1());
            if (b6 != null) {
                this.iterator.g(wVar);
                this.cont.v0(b6);
            }
        }

        @Override // kotlinx.coroutines.channels.h0
        @d5.e
        public r0 q0(E value, @d5.e y.d otherOp) {
            if (this.cont.u(Boolean.TRUE, otherOp != null ? otherOp.desc : null, a1(value)) == null) {
                return null;
            }
            if (otherOp != null) {
                otherOp.d();
            }
            return kotlinx.coroutines.t.f29000d;
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("遻") + z0.b(this);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010)\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/channels/a$e;", "R", "E", "Lkotlinx/coroutines/channels/f0;", "Lkotlinx/coroutines/p1;", "value", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "q0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/y$d;)Lkotlinx/coroutines/internal/r0;", "Lkotlin/m2;", "Z", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "g", "Lkotlin/Function1;", "", "a1", "(Ljava/lang/Object;)Lq3/l;", "", "toString", "Lkotlinx/coroutines/channels/a;", "r", "Lkotlinx/coroutines/channels/a;", "channel", "Lkotlinx/coroutines/selects/f;", "s", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/d;", "t", "Lq3/p;", "block", "", "u", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/channels/a;Lkotlinx/coroutines/selects/f;Lq3/p;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class e<R, E> extends f0<E> implements p1 {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final a<E> channel;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.selects.f<R> select;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final q3.p<Object, Continuation<? super R>, Object> block;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public final int receiveMode;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@d5.d a<E> aVar, @d5.d kotlinx.coroutines.selects.f<? super R> fVar, @d5.d q3.p<Object, ? super Continuation<? super R>, ? extends Object> pVar, int i5) {
            this.channel = aVar;
            this.select = fVar;
            this.block = pVar;
            this.receiveMode = i5;
        }

        @Override // kotlinx.coroutines.channels.h0
        public void Z(E value) {
            Object obj;
            q3.p<Object, Continuation<? super R>, Object> pVar = this.block;
            if (this.receiveMode == 1) {
                r.INSTANCE.getClass();
                obj = r.b(r.c(value));
            } else {
                obj = value;
            }
            q4.a.e(pVar, obj, this.select.L(), a1(value));
        }

        @Override // kotlinx.coroutines.channels.f0
        @d5.e
        public q3.l<Throwable, m2> a1(E value) {
            q3.l<E, m2> lVar = this.channel.onUndeliveredElement;
            if (lVar != null) {
                return kotlinx.coroutines.internal.i0.a(lVar, value, this.select.L().getF23291o());
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.f0
        public void b1(@d5.d w<?> wVar) {
            if (this.select.t()) {
                int i5 = this.receiveMode;
                if (i5 == 0) {
                    this.select.j0(wVar.g1());
                } else {
                    if (i5 != 1) {
                        return;
                    }
                    q4.a.f(this.block, r.b(r.INSTANCE.a(wVar.closeCause)), this.select.L(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.p1
        public void g() {
            if (S0()) {
                this.channel.k0();
            }
        }

        @Override // kotlinx.coroutines.channels.h0
        @d5.e
        public r0 q0(E value, @d5.e y.d otherOp) {
            return (r0) this.select.j(otherOp);
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("遼") + z0.b(this) + '[' + this.select + ProtectedSandApp.s("遽") + this.receiveMode + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/a$f;", "Lkotlinx/coroutines/g;", "", "cause", "Lkotlin/m2;", "a", "", "toString", "Lkotlinx/coroutines/channels/f0;", "o", "Lkotlinx/coroutines/channels/f0;", "receive", "<init>", "(Lkotlinx/coroutines/channels/a;Lkotlinx/coroutines/channels/f0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private final class f extends kotlinx.coroutines.g {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final f0<?> receive;

        public f(@d5.d f0<?> f0Var) {
            this.receive = f0Var;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        @Override // kotlinx.coroutines.p
        public void a(@d5.e Throwable th) {
            if (this.receive.S0()) {
                a.this.k0();
            }
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("遾") + this.receive + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/a$g;", "E", "Lkotlinx/coroutines/internal/y$e;", "Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/y;", "affected", "", "e", "Lkotlinx/coroutines/internal/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Lkotlin/m2;", "k", "Lkotlinx/coroutines/internal/w;", "queue", "<init>", "(Lkotlinx/coroutines/internal/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    protected static final class g<E> extends y.e<j0> {
        public g(@d5.d kotlinx.coroutines.internal.w wVar) {
            super(wVar);
        }

        @Override // kotlinx.coroutines.internal.y.e, kotlinx.coroutines.internal.y.a
        @d5.e
        protected Object e(@d5.d kotlinx.coroutines.internal.y affected) {
            if (affected instanceof w) {
                return affected;
            }
            if (affected instanceof j0) {
                return null;
            }
            return kotlinx.coroutines.channels.b.f27306f;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        public Object j(@d5.d y.d prepareOp) {
            r0 c12 = ((j0) prepareOp.affected).c1(prepareOp);
            if (c12 == null) {
                return kotlinx.coroutines.internal.z.f28784a;
            }
            Object obj = kotlinx.coroutines.internal.c.f28690b;
            if (c12 == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void k(@d5.d kotlinx.coroutines.internal.y yVar) {
            ((j0) yVar).d1();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/y$f", "Lkotlinx/coroutines/internal/y$c;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h extends y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f27294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kotlinx.coroutines.internal.y yVar, a aVar) {
            super(yVar);
            this.f27294d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@d5.d kotlinx.coroutines.internal.y affected) {
            if (this.f27294d.g0()) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/a$i", "Lkotlinx/coroutines/selects/d;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "L", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class i implements kotlinx.coroutines.selects.d<E> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<E> f27295o;

        i(a<E> aVar) {
            this.f27295o = aVar;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void L(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super E, ? super Continuation<? super R>, ? extends Object> block) {
            this.f27295o.p0(select, 0, block);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/a$j", "Lkotlinx/coroutines/selects/d;", "Lkotlinx/coroutines/channels/r;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "L", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class j implements kotlinx.coroutines.selects.d<r<? extends E>> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ a<E> f27296o;

        j(a<E> aVar) {
            this.f27296o = aVar;
        }

        @Override // kotlinx.coroutines.selects.d
        public <R> void L(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super r<? extends E>, ? super Continuation<? super R>, ? extends Object> block) {
            this.f27296o.p0(select, 1, block);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    static final class k extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f27297r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ a<E> f27298s;

        /* renamed from: t, reason: collision with root package name */
        int f27299t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a<E> aVar, Continuation<? super k> continuation) {
            super(continuation);
            this.f27298s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27297r = obj;
            this.f27299t |= Integer.MIN_VALUE;
            Object E = this.f27298s.E(this);
            return E == CoroutineSingletons.COROUTINE_SUSPENDED ? E : r.b(E);
        }
    }

    public a(@d5.e q3.l<? super E, m2> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z(f0<? super E> receive) {
        boolean b02 = b0(receive);
        if (b02) {
            l0();
        }
        return b02;
    }

    private final <R> boolean d0(kotlinx.coroutines.selects.f<? super R> select, q3.p<Object, ? super Continuation<? super R>, ? extends Object> block, int receiveMode) {
        e eVar = new e(this, select, block, receiveMode);
        boolean Z = Z(eVar);
        if (Z) {
            select.t0(eVar);
        }
        return Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object o0(int i5, Continuation<? super R> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s b6 = kotlinx.coroutines.u.b(e6);
        b bVar = this.onUndeliveredElement == null ? new b(b6, i5) : new c(b6, i5, this.onUndeliveredElement);
        while (true) {
            if (Z(bVar)) {
                q0(b6, bVar);
                break;
            }
            Object m02 = m0();
            if (m02 instanceof w) {
                bVar.b1((w) m02);
                break;
            }
            if (m02 != kotlinx.coroutines.channels.b.f27306f) {
                b6.y(bVar.c1(m02), bVar.a1(m02));
                break;
            }
        }
        Object A = b6.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void p0(kotlinx.coroutines.selects.f<? super R> select, int receiveMode, q3.p<Object, ? super Continuation<? super R>, ? extends Object> block) {
        while (!select.C()) {
            if (!h0()) {
                Object n02 = n0(select);
                if (n02 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (n02 != kotlinx.coroutines.channels.b.f27306f && n02 != kotlinx.coroutines.internal.c.f28690b) {
                    r0(block, select, receiveMode, n02);
                }
            } else if (d0(select, block, receiveMode)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(kotlinx.coroutines.q<?> qVar, f0<?> f0Var) {
        qVar.K(new f(f0Var));
    }

    private final <R> void r0(q3.p<Object, ? super Continuation<? super R>, ? extends Object> pVar, kotlinx.coroutines.selects.f<? super R> fVar, int i5, Object obj) {
        Object c6;
        boolean z5 = obj instanceof w;
        if (z5) {
            if (i5 == 0) {
                throw q0.p(((w) obj).g1());
            }
            if (i5 == 1 && fVar.t()) {
                q4.b.d(pVar, r.b(r.INSTANCE.a(((w) obj).closeCause)), fVar.L());
                return;
            }
            return;
        }
        if (i5 != 1) {
            q4.b.d(pVar, obj, fVar.L());
            return;
        }
        r.Companion companion = r.INSTANCE;
        if (z5) {
            c6 = companion.a(((w) obj).closeCause);
        } else {
            companion.getClass();
            c6 = r.c(obj);
        }
        q4.b.d(pVar, r.b(c6), fVar.L());
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public final Object A() {
        Object m02 = m0();
        if (m02 == kotlinx.coroutines.channels.b.f27306f) {
            r.INSTANCE.getClass();
            return r.f27388c;
        }
        if (m02 instanceof w) {
            return r.INSTANCE.a(((w) m02).closeCause);
        }
        r.INSTANCE.getClass();
        return r.c(m02);
    }

    @Override // kotlinx.coroutines.channels.g0
    @LowPriorityInOverloadResolution
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @d5.e
    public Object C(@d5.d Continuation<? super E> continuation) {
        return g0.a.i(this, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.channels.g0
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(@d5.d kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.r<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.a.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.a$k r0 = (kotlinx.coroutines.channels.a.k) r0
            int r1 = r0.f27299t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27299t = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.a$k r0 = new kotlinx.coroutines.channels.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f27297r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27299t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L27
            kotlin.a1.n(r5)
            goto L60
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "邁"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.a1.n(r5)
            java.lang.Object r5 = r4.m0()
            kotlinx.coroutines.internal.r0 r2 = kotlinx.coroutines.channels.b.f27306f
            if (r5 == r2) goto L57
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.w
            if (r0 == 0) goto L4d
            kotlinx.coroutines.channels.r$b r0 = kotlinx.coroutines.channels.r.INSTANCE
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            java.lang.Throwable r5 = r5.closeCause
            java.lang.Object r5 = r0.a(r5)
            goto L56
        L4d:
            kotlinx.coroutines.channels.r$b r0 = kotlinx.coroutines.channels.r.INSTANCE
            r0.getClass()
            java.lang.Object r5 = kotlinx.coroutines.channels.r.c(r5)
        L56:
            return r5
        L57:
            r0.f27299t = r3
            java.lang.Object r5 = r4.o0(r3, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.r) r5
            java.lang.Object r5 = r5.getHolder()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.E(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.g0
    @d5.e
    public final Object N(@d5.d Continuation<? super E> continuation) {
        Object m02 = m0();
        return (m02 == kotlinx.coroutines.channels.b.f27306f || (m02 instanceof w)) ? o0(0, continuation) : m02;
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.e
    protected h0<E> O() {
        h0<E> O = super.O();
        if (O != null && !(O instanceof w)) {
            k0();
        }
        return O;
    }

    @Override // kotlinx.coroutines.channels.g0
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final boolean a(@d5.e Throwable cause) {
        boolean Q = Q(cause);
        i0(Q);
        return Q;
    }

    @d5.d
    protected final g<E> X() {
        return new g<>(getQueue());
    }

    protected boolean b0(@d5.d f0<? super E> receive) {
        int X0;
        kotlinx.coroutines.internal.y M0;
        if (!f0()) {
            kotlinx.coroutines.internal.y queue = getQueue();
            h hVar = new h(receive, this);
            do {
                kotlinx.coroutines.internal.y M02 = queue.M0();
                if (!(!(M02 instanceof j0))) {
                    return false;
                }
                X0 = M02.X0(receive, queue, hVar);
                if (X0 != 1) {
                }
            } while (X0 != 2);
            return false;
        }
        kotlinx.coroutines.internal.y queue2 = getQueue();
        do {
            M0 = queue2.M0();
            if (!(!(M0 instanceof j0))) {
                return false;
            }
        } while (!M0.D0(receive, queue2));
        return true;
    }

    @Override // kotlinx.coroutines.channels.g0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.channels.g0
    public final void e(@d5.e CancellationException cancellationException) {
        if (f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(z0.a(this) + ProtectedSandApp.s("邂"));
        }
        a(cancellationException);
    }

    protected final boolean e0() {
        return getQueue().L0() instanceof h0;
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean f() {
        return o() != null && g0();
    }

    protected abstract boolean f0();

    protected abstract boolean g0();

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public final kotlinx.coroutines.selects.d<E> h() {
        return new i(this);
    }

    protected final boolean h0() {
        return !(getQueue().L0() instanceof j0) && g0();
    }

    protected void i0(boolean z5) {
        w<?> r5 = r();
        if (r5 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("邃").toString());
        }
        Object obj = null;
        while (true) {
            kotlinx.coroutines.internal.y M0 = r5.M0();
            if (M0 instanceof kotlinx.coroutines.internal.w) {
                j0(obj, r5);
                return;
            } else if (M0.S0()) {
                obj = kotlinx.coroutines.internal.q.h(obj, (j0) M0);
            } else {
                M0.N0();
            }
        }
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        return h0();
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public final p<E> iterator() {
        return new C0407a(this);
    }

    protected void j0(@d5.d Object list, @d5.d w<?> closed) {
        if (list == null) {
            return;
        }
        if (!(list instanceof ArrayList)) {
            ((j0) list).b1(closed);
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((j0) arrayList.get(size)).b1(closed);
            }
        }
    }

    protected void k0() {
    }

    protected void l0() {
    }

    @d5.e
    protected Object m0() {
        while (true) {
            j0 P = P();
            if (P == null) {
                return kotlinx.coroutines.channels.b.f27306f;
            }
            if (P.c1(null) != null) {
                P.Z0();
                return P.getElement();
            }
            P.d1();
        }
    }

    @d5.e
    protected Object n0(@d5.d kotlinx.coroutines.selects.f<?> select) {
        g<E> X = X();
        Object l02 = select.l0(X);
        if (l02 != null) {
            return l02;
        }
        X.o().Z0();
        return X.o().getElement();
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public final kotlinx.coroutines.selects.d<r<E>> p() {
        return new j(this);
    }

    @Override // kotlinx.coroutines.channels.g0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @d5.e
    public E poll() {
        return (E) g0.a.h(this);
    }

    @Override // kotlinx.coroutines.channels.g0
    @d5.d
    public kotlinx.coroutines.selects.d<E> q() {
        return new g0.a.C0409a(this);
    }
}
