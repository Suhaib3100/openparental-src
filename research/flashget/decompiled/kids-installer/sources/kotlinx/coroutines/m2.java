package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R5\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/m2;", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "s", "Lq3/l;", "handler", "<init>", "(Lq3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class m2 extends t2 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.l<Throwable, kotlin.m2> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(@d5.d q3.l<? super Throwable, kotlin.m2> lVar) {
        this.handler = lVar;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        this.handler.N(th);
    }
}
