package kotlinx.coroutines.android;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.k2;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.v2;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/v2;", "Lkotlinx/coroutines/b1;", "<init>", "()V", "l1", "()Lkotlinx/coroutines/android/e;", "immediate", "Lkotlinx/coroutines/android/d;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e extends v2 implements b1 {
    public /* synthetic */ e(w wVar) {
        this();
    }

    @l
    public abstract e l1();

    @l
    public m1 q(long j4, @l Runnable runnable, @l kotlin.coroutines.g gVar) {
        return b1.a.b(this, j4, runnable, gVar);
    }

    @Override // kotlinx.coroutines.b1
    @m
    @k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object q0(long j4, @l kotlin.coroutines.d<? super k2> dVar) {
        return b1.a.a(this, j4, dVar);
    }

    private e() {
    }
}
