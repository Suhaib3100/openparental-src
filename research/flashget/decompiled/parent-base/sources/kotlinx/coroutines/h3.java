package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/h3;", "Lkotlinx/coroutines/a;", "Lkotlin/k2;", "Lkotlin/coroutines/g;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "", "exception", "j1", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
class h3 extends a<kotlin.k2> {
    public h3(@fg.l kotlin.coroutines.g gVar, boolean z4) {
        super(gVar, true, z4);
    }

    @Override // kotlinx.coroutines.r2
    protected boolean j1(@fg.l Throwable exception) {
        o0.b(getContext(), exception);
        return true;
    }
}
