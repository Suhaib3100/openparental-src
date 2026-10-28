package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.o0;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/a0;", "E", "Lkotlinx/coroutines/channels/m;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/l;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;)V", "Lkotlin/k2;", "value", "c2", "(Lkotlin/k2;)V", "", "cause", "", "handled", "Y1", "(Ljava/lang/Throwable;Z)V", "isActive", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class a0<E> extends m<E> implements b0<E> {
    public a0(@fg.l kotlin.coroutines.g gVar, @fg.l l<E> lVar) {
        super(gVar, lVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void Y1(@fg.l Throwable cause, boolean handled) {
        if (b2().b0(cause) || handled) {
            return;
        }
        o0.b(getContext(), cause);
    }

    @Override // kotlinx.coroutines.channels.b0
    public e0 a() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void Z1(@fg.l k2 value) {
        e0.a.a(b2(), null, 1, null);
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.r2, kotlinx.coroutines.k2
    public boolean isActive() {
        return super.isActive();
    }
}
