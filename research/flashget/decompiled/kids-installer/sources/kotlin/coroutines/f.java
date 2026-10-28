package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.a1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import org.apache.log4j.net.SyslogAppender;
import q3.l;
import q3.p;

/* compiled from: Continuation.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00012\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0087\bø\u0001\u0000\u001a=\u0010\u000e\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0004\u0012\u00020\r0\u000bH\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007¢\u0006\u0002\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001b\u001a\u0002H\bH\u0087\b¢\u0006\u0002\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\b\u001a;\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007¢\u0006\u0002\u0010!\u001aT\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007¢\u0006\u0002\u0010\"\"\u001b\u0010\u0000\u001a\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Continuation", "Lkotlin/coroutines/Continuation;", "T", "context", "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resume", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", "exception", "", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Continuation.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class a<T> implements Continuation<T> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f23291o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<Result<? extends T>, m2> f23292p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, l<? super Result<? extends T>, m2> lVar) {
            this.f23291o = coroutineContext;
            this.f23292p = lVar;
        }

        @Override // kotlin.coroutines.Continuation
        @d5.d
        /* renamed from: l, reason: from getter */
        public CoroutineContext getF23291o() {
            return this.f23291o;
        }

        @Override // kotlin.coroutines.Continuation
        public void s(@d5.d Object obj) {
            this.f23292p.N(Result.a(obj));
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Continuation<T> a(CoroutineContext coroutineContext, l<? super Result<? extends T>, m2> lVar) {
        l0.p(coroutineContext, ProtectedSandApp.s("㺥"));
        l0.p(lVar, ProtectedSandApp.s("㺦"));
        return new a(coroutineContext, lVar);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final <T> Continuation<m2> b(@d5.d l<? super Continuation<? super T>, ? extends Object> lVar, @d5.d Continuation<? super T> continuation) {
        Continuation b6;
        Continuation e6;
        l0.p(lVar, ProtectedSandApp.s("㺧"));
        l0.p(continuation, ProtectedSandApp.s("㺨"));
        b6 = kotlin.coroutines.intrinsics.c.b(lVar, continuation);
        e6 = kotlin.coroutines.intrinsics.c.e(b6);
        return new SafeContinuation(e6, CoroutineSingletons.COROUTINE_SUSPENDED);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final <R, T> Continuation<m2> c(@d5.d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d5.d Continuation<? super T> continuation) {
        Continuation c6;
        Continuation e6;
        l0.p(pVar, ProtectedSandApp.s("㺩"));
        l0.p(continuation, ProtectedSandApp.s("㺪"));
        c6 = kotlin.coroutines.intrinsics.c.c(pVar, r5, continuation);
        e6 = kotlin.coroutines.intrinsics.c.e(c6);
        return new SafeContinuation(e6, CoroutineSingletons.COROUTINE_SUSPENDED);
    }

    private static final CoroutineContext d() {
        throw new NotImplementedError(ProtectedSandApp.s("㺫"));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static /* synthetic */ void e() {
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void f(Continuation<? super T> continuation, T t5) {
        l0.p(continuation, ProtectedSandApp.s("㺬"));
        Result.a aVar = Result.f27242p;
        continuation.s(t5);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void g(Continuation<? super T> continuation, Throwable th) {
        l0.p(continuation, ProtectedSandApp.s("㺭"));
        l0.p(th, ProtectedSandApp.s("㺮"));
        Result.a aVar = Result.f27242p;
        continuation.s(a1.a(th));
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void h(@d5.d l<? super Continuation<? super T>, ? extends Object> lVar, @d5.d Continuation<? super T> continuation) {
        Continuation b6;
        Continuation e6;
        l0.p(lVar, ProtectedSandApp.s("㺯"));
        l0.p(continuation, ProtectedSandApp.s("㺰"));
        b6 = kotlin.coroutines.intrinsics.c.b(lVar, continuation);
        e6 = kotlin.coroutines.intrinsics.c.e(b6);
        Result.a aVar = Result.f27242p;
        e6.s(m2.f23662a);
    }

    @SinceKotlin(version = "1.3")
    public static final <R, T> void i(@d5.d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d5.d Continuation<? super T> continuation) {
        Continuation c6;
        Continuation e6;
        l0.p(pVar, ProtectedSandApp.s("㺱"));
        l0.p(continuation, ProtectedSandApp.s("㺲"));
        c6 = kotlin.coroutines.intrinsics.c.c(pVar, r5, continuation);
        e6 = kotlin.coroutines.intrinsics.c.e(c6);
        Result.a aVar = Result.f27242p;
        e6.s(m2.f23662a);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object j(l<? super Continuation<? super T>, m2> lVar, Continuation<? super T> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        SafeContinuation safeContinuation = new SafeContinuation(e6);
        lVar.N(safeContinuation);
        Object b6 = safeContinuation.b();
        if (b6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return b6;
    }
}
