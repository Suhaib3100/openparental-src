package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/g;Lq3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/g;Lq3/a;)Ljava/lang/Object;", "", "a", "I", "WORKING", "FINISHED", "c", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28786a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f28787b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f28788c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f28789d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Interruptible.kt */
    @DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a<T> extends SuspendLambda implements q3.p<u0, Continuation<? super T>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28790s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28791t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ q3.a<T> f28792u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q3.a<? extends T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28792u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f28790s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("酄"));
            }
            kotlin.a1.n(obj);
            return j2.d(((u0) this.f28791t).getCoroutineContext(), this.f28792u);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super T> continuation) {
            return ((a) c(u0Var, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f28792u, continuation);
            aVar.f28791t = obj;
            return aVar;
        }
    }

    @d5.e
    public static final <T> Object b(@d5.d CoroutineContext coroutineContext, @d5.d q3.a<? extends T> aVar, @d5.d Continuation<? super T> continuation) {
        return l.g(coroutineContext, new a(aVar, null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, q3.a aVar, Continuation continuation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        return b(coroutineContext, aVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(CoroutineContext coroutineContext, q3.a<? extends T> aVar) {
        try {
            w3 w3Var = new w3(s2.z(coroutineContext));
            w3Var.d();
            try {
                return aVar.n();
            } finally {
                w3Var.a();
            }
        } catch (InterruptedException e6) {
            throw new CancellationException(ProtectedSandApp.s("帏")).initCause(e6);
        }
    }
}
