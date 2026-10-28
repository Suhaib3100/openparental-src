package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/l3;", "T", "R", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/selects/f;", "s", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "t", "Lq3/p;", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class l3<T, R> extends t2 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.selects.f<R> select;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<T, Continuation<? super R>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public l3(@d5.d kotlinx.coroutines.selects.f<? super R> fVar, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        this.select = fVar;
        this.block = pVar;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
        Z0(th);
        return kotlin.m2.f23662a;
    }

    @Override // kotlinx.coroutines.h0
    public void Z0(@d5.e Throwable th) {
        if (this.select.t()) {
            a1().t1(this.select, this.block);
        }
    }
}
