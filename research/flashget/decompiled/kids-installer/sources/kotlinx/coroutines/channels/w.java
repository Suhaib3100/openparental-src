package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.z0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lkotlinx/coroutines/channels/w;", "E", "Lkotlinx/coroutines/channels/j0;", "Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/r0;", "c1", "Lkotlin/m2;", "Z0", "value", "q0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/y$d;)Lkotlinx/coroutines/internal/r0;", "Z", "(Ljava/lang/Object;)V", "closed", "b1", "", "toString", "", "r", "Ljava/lang/Throwable;", "closeCause", "h1", "()Ljava/lang/Throwable;", "sendException", "g1", "receiveException", "e1", "()Lkotlinx/coroutines/channels/w;", "offerResult", "f1", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class w<E> extends j0 implements h0<E> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Throwable closeCause;

    public w(@d5.e Throwable th) {
        this.closeCause = th;
    }

    @Override // kotlinx.coroutines.channels.h0
    public void Z(E value) {
    }

    @Override // kotlinx.coroutines.channels.j0
    public void Z0() {
    }

    @Override // kotlinx.coroutines.channels.j0
    public Object a1() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.j0
    public void b1(@d5.d w<?> wVar) {
    }

    @Override // kotlinx.coroutines.channels.j0
    @d5.d
    public r0 c1(@d5.e y.d otherOp) {
        r0 r0Var = kotlinx.coroutines.t.f29000d;
        if (otherOp != null) {
            otherOp.d();
        }
        return r0Var;
    }

    @d5.d
    public w<E> e1() {
        return this;
    }

    @d5.d
    public w<E> f1() {
        return this;
    }

    @d5.d
    public final Throwable g1() {
        Throwable th = this.closeCause;
        return th == null ? new ClosedReceiveChannelException(ProtectedSandApp.s("邲")) : th;
    }

    @d5.d
    public final Throwable h1() {
        Throwable th = this.closeCause;
        return th == null ? new ClosedSendChannelException(ProtectedSandApp.s("邳")) : th;
    }

    @Override // kotlinx.coroutines.channels.h0
    public Object k() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.h0
    @d5.d
    public r0 q0(E value, @d5.e y.d otherOp) {
        r0 r0Var = kotlinx.coroutines.t.f29000d;
        if (otherOp != null) {
            otherOp.d();
        }
        return r0Var;
    }

    @Override // kotlinx.coroutines.internal.y
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("邴") + z0.b(this) + '[' + this.closeCause + ']';
    }
}
