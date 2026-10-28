package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.n0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u000e\u001a\u00020\r2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "b", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "originalException", "thrownException", "c", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/n0;", "a", "(Lld/p;)Lkotlinx/coroutines/n0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* loaded from: classes7.dex */
public final class o0 {

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"kotlinx/coroutines/o0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "N", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n*L\n1#1,110:1\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements n0 {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<kotlin.coroutines.g, Throwable, kotlin.k2> f80872c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.p<? super kotlin.coroutines.g, ? super Throwable, kotlin.k2> pVar, n0.Companion companion) {
            super(companion);
            this.f80872c = pVar;
        }

        @Override // kotlinx.coroutines.n0
        public void N(@fg.l kotlin.coroutines.g context, @fg.l Throwable exception) {
            this.f80872c.invoke(context, exception);
        }
    }

    @fg.l
    public static final n0 a(@fg.l ld.p<? super kotlin.coroutines.g, ? super Throwable, kotlin.k2> pVar) {
        return new a(pVar, n0.INSTANCE);
    }

    @f2
    public static final void b(@fg.l kotlin.coroutines.g gVar, @fg.l Throwable th) {
        try {
            n0 n0Var = (n0) gVar.c(n0.INSTANCE);
            if (n0Var != null) {
                n0Var.N(gVar, th);
            } else {
                kotlinx.coroutines.internal.j.a(gVar, th);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.internal.j.a(gVar, c(th, th2));
        }
    }

    @fg.l
    public static final Throwable c(@fg.l Throwable th, @fg.l Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException(ProtectedSandApp.s("蠩\u0001"), th2);
        kotlin.o.a(runtimeException, th);
        return runtimeException;
    }
}
