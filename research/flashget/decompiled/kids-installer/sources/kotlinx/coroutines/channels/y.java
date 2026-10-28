package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.m2;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.r0;

/* compiled from: ConflatedChannel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010,j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Lkotlinx/coroutines/channels/y;", "E", "Lkotlinx/coroutines/channels/a;", "", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "s0", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "H", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "m0", "n0", "", "wasClosed", "Lkotlin/m2;", "i0", "Lkotlinx/coroutines/channels/f0;", "receive", "b0", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "r", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "s", "Ljava/lang/Object;", "value", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "B", "isBufferAlwaysFull", "D", "isBufferFull", "isEmpty", "", "n", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class y<E> extends a<E> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ReentrantLock lock;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private Object value;

    public y(@d5.e q3.l<? super E, m2> lVar) {
        super(lVar);
        this.lock = new ReentrantLock();
        this.value = b.f27303c;
    }

    private final UndeliveredElementException s0(Object element) {
        q3.l<E, m2> lVar;
        Object obj = this.value;
        UndeliveredElementException undeliveredElementException = null;
        if (obj != b.f27303c && (lVar = this.onUndeliveredElement) != null) {
            undeliveredElementException = kotlinx.coroutines.internal.i0.d(lVar, obj, null, 2, null);
        }
        this.value = element;
        return undeliveredElementException;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean B() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object G(E element) {
        h0<E> O;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            if (this.value == b.f27303c) {
                do {
                    O = O();
                    if (O != null) {
                        if (O instanceof w) {
                            return O;
                        }
                        kotlin.jvm.internal.l0.m(O);
                    }
                } while (O.q0(element, null) == null);
                m2 m2Var = m2.f23662a;
                reentrantLock.unlock();
                O.Z(element);
                return O.k();
            }
            UndeliveredElementException s02 = s0(element);
            if (s02 == null) {
                return b.f27304d;
            }
            throw s02;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object H(E element, @d5.d kotlinx.coroutines.selects.f<?> select) {
        Object l02;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            w<?> r5 = r();
            if (r5 != null) {
                return r5;
            }
            if (this.value == b.f27303c) {
                do {
                    c.d<E> l5 = l(element);
                    l02 = select.l0(l5);
                    if (l02 == null) {
                        h0<? super E> o5 = l5.o();
                        m2 m2Var = m2.f23662a;
                        reentrantLock.unlock();
                        kotlin.jvm.internal.l0.m(o5);
                        h0<? super E> h0Var = o5;
                        h0Var.Z(element);
                        return h0Var.k();
                    }
                    if (l02 != b.f27305e) {
                    }
                } while (l02 == kotlinx.coroutines.internal.c.f28690b);
                if (l02 != kotlinx.coroutines.selects.g.d() && !(l02 instanceof w)) {
                    throw new IllegalStateException((ProtectedSandApp.s("邵") + l02).toString());
                }
                return l02;
            }
            if (!select.t()) {
                return kotlinx.coroutines.selects.g.d();
            }
            UndeliveredElementException s02 = s0(element);
            if (s02 == null) {
                return b.f27304d;
            }
            throw s02;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected boolean b0(@d5.d f0<? super E> receive) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.b0(receive);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean f0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean g0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.value == b.f27303c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected void i0(boolean z5) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            UndeliveredElementException s02 = s0(b.f27303c);
            m2 m2Var = m2.f23662a;
            reentrantLock.unlock();
            super.i0(z5);
            if (s02 != null) {
                throw s02;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.a, kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    @d5.e
    protected Object m0() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object obj = this.value;
            r0 r0Var = b.f27303c;
            if (obj != r0Var) {
                this.value = r0Var;
                m2 m2Var = m2.f23662a;
                return obj;
            }
            Object r5 = r();
            if (r5 == null) {
                r5 = b.f27306f;
            }
            return r5;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected String n() {
        String s5 = ProtectedSandApp.s("邶");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return s5 + this.value + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    @d5.e
    protected Object n0(@d5.d kotlinx.coroutines.selects.f<?> select) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object obj = this.value;
            r0 r0Var = b.f27303c;
            if (obj == r0Var) {
                Object r5 = r();
                if (r5 == null) {
                    r5 = b.f27306f;
                }
                return r5;
            }
            if (!select.t()) {
                return kotlinx.coroutines.selects.g.d();
            }
            Object obj2 = this.value;
            this.value = r0Var;
            m2 m2Var = m2.f23662a;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
