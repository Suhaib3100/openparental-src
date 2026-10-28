package kotlinx.coroutines.android;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.y2;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/e1;", "N0", "()Lkotlinx/coroutines/android/e;", "immediate", "<init>", "()V", "Lkotlinx/coroutines/android/d;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class e extends y2 implements e1 {
    public /* synthetic */ e(w wVar) {
        this();
    }

    @d5.d
    public abstract e N0();

    @d5.d
    public p1 b0(long j5, @d5.d Runnable runnable, @d5.d CoroutineContext coroutineContext) {
        return e1.a.b(this, j5, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @d5.e
    public Object e0(long j5, @d5.d Continuation<? super m2> continuation) {
        return e1.a.a(this, j5, continuation);
    }

    private e() {
    }
}
