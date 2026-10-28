package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.r0;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/d0;", "E", "Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "value", "L1", "(Lkotlin/m2;)V", "", "cause", "", "handled", "H1", "d", "()Z", "isActive", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/n;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class d0<E> extends o<E> implements e0<E> {
    public d0(@d5.d CoroutineContext coroutineContext, @d5.d n<E> nVar) {
        super(coroutineContext, nVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void H1(@d5.d Throwable th, boolean z5) {
        if (K1().a(th) || z5) {
            return;
        }
        r0.b(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void I1(@d5.d m2 value) {
        k0.a.a(K1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.u2, kotlinx.coroutines.n2
    public boolean d() {
        return super.d();
    }

    @Override // kotlinx.coroutines.channels.e0
    public k0 g() {
        return this;
    }
}
