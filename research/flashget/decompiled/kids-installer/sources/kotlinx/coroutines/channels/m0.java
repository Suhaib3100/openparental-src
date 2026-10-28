package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.m2;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/m0;", "E", "Lkotlinx/coroutines/channels/l0;", "", "S0", "Lkotlin/m2;", "d1", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "t", "Lq3/l;", "onUndeliveredElement", "pollResult", "Lkotlinx/coroutines/q;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/q;Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class m0<E> extends l0<E> {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final q3.l<E, m2> onUndeliveredElement;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(E e6, @d5.d kotlinx.coroutines.q<? super m2> qVar, @d5.d q3.l<? super E, m2> lVar) {
        super(e6, qVar);
        this.onUndeliveredElement = lVar;
    }

    @Override // kotlinx.coroutines.internal.y
    public boolean S0() {
        if (!super.S0()) {
            return false;
        }
        d1();
        return true;
    }

    @Override // kotlinx.coroutines.channels.j0
    public void d1() {
        kotlinx.coroutines.internal.i0.b(this.onUndeliveredElement, getElement(), this.cont.getF23291o());
    }
}
