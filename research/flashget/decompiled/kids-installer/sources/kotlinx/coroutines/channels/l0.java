package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.m2;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.z0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/l0;", "E", "Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "c1", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/channels/w;", "closed", "b1", "", "toString", "r", "Ljava/lang/Object;", "a1", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/q;", "s", "Lkotlinx/coroutines/q;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class l0<E> extends j0 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final E pollResult;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final kotlinx.coroutines.q<m2> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(E e6, @d5.d kotlinx.coroutines.q<? super m2> qVar) {
        this.pollResult = e6;
        this.cont = qVar;
    }

    @Override // kotlinx.coroutines.channels.j0
    public void Z0() {
        this.cont.v0(kotlinx.coroutines.t.f29000d);
    }

    @Override // kotlinx.coroutines.channels.j0
    /* renamed from: a1 */
    public E getElement() {
        return this.pollResult;
    }

    @Override // kotlinx.coroutines.channels.j0
    public void b1(@d5.d w<?> wVar) {
        kotlinx.coroutines.q<m2> qVar = this.cont;
        Result.a aVar = Result.f27242p;
        qVar.s(a1.a(wVar.h1()));
    }

    @Override // kotlinx.coroutines.channels.j0
    @d5.e
    public r0 c1(@d5.e y.d otherOp) {
        if (this.cont.r(m2.f23662a, otherOp != null ? otherOp.desc : null) == null) {
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
        return z0.a(this) + '@' + z0.b(this) + '(' + getElement() + ')';
    }
}
