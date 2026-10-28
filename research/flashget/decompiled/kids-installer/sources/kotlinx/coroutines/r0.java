package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p0;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/m2;", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/p0;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class r0 {

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/r0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/p0;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/m2;", "n0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class a extends AbstractCoroutineContextElement implements p0 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p<CoroutineContext, Throwable, kotlin.m2> f28833p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.p<? super CoroutineContext, ? super Throwable, kotlin.m2> pVar, p0.Companion companion) {
            super(companion);
            this.f28833p = pVar;
        }

        @Override // kotlinx.coroutines.p0
        public void n0(@d5.d CoroutineContext coroutineContext, @d5.d Throwable th) {
            this.f28833p.g0(coroutineContext, th);
        }
    }

    @d5.d
    public static final p0 a(@d5.d q3.p<? super CoroutineContext, ? super Throwable, kotlin.m2> pVar) {
        return new a(pVar, p0.INSTANCE);
    }

    @i2
    public static final void b(@d5.d CoroutineContext coroutineContext, @d5.d Throwable th) {
        try {
            p0 p0Var = (p0) coroutineContext.b(p0.INSTANCE);
            if (p0Var != null) {
                p0Var.n0(coroutineContext, th);
            } else {
                q0.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            q0.a(coroutineContext, c(th, th2));
        }
    }

    @d5.d
    public static final Throwable c(@d5.d Throwable th, @d5.d Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException(ProtectedSandApp.s("帘"), th2);
        kotlin.p.a(runtimeException, th);
        return runtimeException;
    }
}
