package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.m2;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.r0;

/* compiled from: LinkedListChannel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/b0;", "E", "Lkotlinx/coroutines/channels/a;", "element", "", "G", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "H", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/q;", "Lkotlinx/coroutines/channels/j0;", "list", "Lkotlinx/coroutines/channels/w;", "closed", "Lkotlin/m2;", "j0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/w;)V", "", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "B", "isBufferAlwaysFull", "D", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class b0<E> extends a<E> {
    public b0(@d5.e q3.l<? super E, m2> lVar) {
        super(lVar);
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
        h0<?> K;
        do {
            Object G = super.G(element);
            r0 r0Var = b.f27304d;
            if (G == r0Var) {
                return r0Var;
            }
            if (G != b.f27305e) {
                if (G instanceof w) {
                    return G;
                }
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("還"), G));
            }
            K = K(element);
            if (K == null) {
                return r0Var;
            }
        } while (!(K instanceof w));
        return K;
    }

    @Override // kotlinx.coroutines.channels.c
    @d5.d
    protected Object H(E element, @d5.d kotlinx.coroutines.selects.f<?> select) {
        Object l02;
        while (true) {
            if (e0()) {
                l02 = super.H(element, select);
            } else {
                l02 = select.l0(k(element));
                if (l02 == null) {
                    l02 = b.f27304d;
                }
            }
            if (l02 == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            r0 r0Var = b.f27304d;
            if (l02 == r0Var) {
                return r0Var;
            }
            if (l02 != b.f27305e && l02 != kotlinx.coroutines.internal.c.f28690b) {
                if (l02 instanceof w) {
                    return l02;
                }
                throw new IllegalStateException(kotlinx.coroutines.r.a(ProtectedSandApp.s("邅"), l02));
            }
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean g0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.a
    protected void j0(@d5.d Object list, @d5.d w<?> closed) {
        UndeliveredElementException undeliveredElementException = null;
        if (list != null) {
            if (list instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) list;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    j0 j0Var = (j0) arrayList.get(size);
                    if (j0Var instanceof c.a) {
                        q3.l<E, m2> lVar = this.onUndeliveredElement;
                        undeliveredElementException2 = lVar != null ? kotlinx.coroutines.internal.i0.c(lVar, ((c.a) j0Var).element, undeliveredElementException2) : null;
                    } else {
                        j0Var.b1(closed);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            } else {
                j0 j0Var2 = (j0) list;
                if (j0Var2 instanceof c.a) {
                    q3.l<E, m2> lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        undeliveredElementException = kotlinx.coroutines.internal.i0.c(lVar2, ((c.a) j0Var2).element, null);
                    }
                } else {
                    j0Var2.b1(closed);
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }
}
