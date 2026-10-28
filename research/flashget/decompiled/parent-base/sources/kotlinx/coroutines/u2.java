package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/h3;", "Lkotlin/coroutines/g;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lld/p;)V", "G1", "()V", "e", "Lkotlin/coroutines/d;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class u2 extends h3 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<kotlin.k2> continuation;

    public u2(@fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
        super(gVar, true, false);
        this.continuation = kotlin.coroutines.intrinsics.b.c(pVar, this, this);
    }

    @Override // kotlinx.coroutines.r2
    protected void G1() {
        me.a.c(this.continuation, this);
    }
}
