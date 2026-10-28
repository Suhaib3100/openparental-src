package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.m2;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/j0;", "flow", "", "c", "", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "d", "(Lkotlinx/coroutines/flow/j0;)[Lkotlin/coroutines/d;", "", "a", "J", "index", "b", "Lkotlin/coroutines/d;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class l0 extends kotlinx.coroutines.flow.internal.c<j0<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public long index = -1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public Continuation<? super m2> cont;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@d5.d j0<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.f0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation<m2>[] b(@d5.d j0<?> flow) {
        long j5 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.e0(j5);
    }
}
