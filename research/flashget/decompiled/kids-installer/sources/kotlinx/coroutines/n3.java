package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/n3;", "Lkotlinx/coroutines/a;", "Lkotlin/m2;", "", "exception", "", "U0", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
class n3 extends a<kotlin.m2> {
    public n3(@d5.d CoroutineContext coroutineContext, boolean z5) {
        super(coroutineContext, true, z5);
    }

    @Override // kotlinx.coroutines.u2
    protected boolean U0(@d5.d Throwable exception) {
        r0.b(getContext(), exception);
        return true;
    }
}
