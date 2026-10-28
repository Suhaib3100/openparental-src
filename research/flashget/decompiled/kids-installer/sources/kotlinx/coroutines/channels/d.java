package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y1;
import kotlinx.coroutines.z0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/d;", "E", "Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/channels/f;", "", "cause", "Lkotlin/m2;", "m1", "exception", "", "U0", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/n;", "channel", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/n;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
class d<E> extends o<E> implements f<E> {
    public d(@d5.d CoroutineContext coroutineContext, @d5.d n<E> nVar, boolean z5) {
        super(coroutineContext, nVar, false, z5);
        W0((n2) coroutineContext.b(n2.INSTANCE));
    }

    @Override // kotlinx.coroutines.u2
    protected boolean U0(@d5.d Throwable exception) {
        r0.b(getContext(), exception);
        return true;
    }

    @Override // kotlinx.coroutines.u2
    protected void m1(@d5.e Throwable th) {
        n<E> K1 = K1();
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = y1.a(z0.a(this) + ProtectedSandApp.s("邋"), th);
            }
        }
        K1.e(r1);
    }
}
