package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Interruptible.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/g;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/g;Lld/a;)Ljava/lang/Object;", "", "a", "I", "WORKING", "FINISHED", "c", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80705a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f80706b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f80707c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f80708d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Interruptible.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80709b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<T> f80711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<? extends T> aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80711d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80711d, dVar);
            aVar.f80710c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f80709b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("蟂\u0001"));
            }
            kotlin.a1.n(obj);
            return g2.d(((r0) this.f80710c).getCoroutineContext(), this.f80711d);
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super T> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    @fg.m
    public static final <T> Object b(@fg.l kotlin.coroutines.g gVar, @fg.l ld.a<? extends T> aVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return k.g(gVar, new a(aVar, null), dVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.g gVar, ld.a aVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        return b(gVar, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(kotlin.coroutines.g gVar, ld.a<? extends T> aVar) {
        try {
            s3 s3Var = new s3(p2.z(gVar));
            s3Var.f();
            try {
                return aVar.invoke();
            } finally {
                s3Var.a();
            }
        } catch (InterruptedException e4) {
            throw new CancellationException(ProtectedSandApp.s("蟃\u0001")).initCause(e4);
        }
    }
}
