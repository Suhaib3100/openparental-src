package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/j0;", "<init>", "()V", "flow", "", "c", "(Lkotlinx/coroutines/flow/j0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "d", "(Lkotlinx/coroutines/flow/j0;)[Lkotlin/coroutines/d;", "", "a", "J", "index", "b", "Lkotlin/coroutines/d;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes7.dex */
public final class l0 extends kotlinx.coroutines.flow.internal.c<j0<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public long index = -1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public kotlin.coroutines.d<? super k2> cont;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@fg.l j0<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.d0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<k2>[] b(@fg.l j0<?> flow) {
        long j4 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.c0(j4);
    }
}
