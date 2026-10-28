package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.k1;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a6\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a:\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020\u001aH\u0080\u0010\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/coroutines/g;", "context", "e", "addedContext", "d", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "i", "(Lkotlin/coroutines/g;Ljava/lang/Object;Lq3/a;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "continuation", "h", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lq3/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/a4;", "g", "Lkotlin/coroutines/jvm/internal/e;", "f", "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "b", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final String f28817a = ProtectedSandApp.s("帐");

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.p<CoroutineContext, CoroutineContext.b, CoroutineContext> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f28818p = new a();

        a() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext g0(@d5.d CoroutineContext coroutineContext, @d5.d CoroutineContext.b bVar) {
            return bVar instanceof l0 ? coroutineContext.B(((l0) bVar).d0()) : coroutineContext.B(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.p<CoroutineContext, CoroutineContext.b, CoroutineContext> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.h<CoroutineContext> f28819p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f28820q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h<CoroutineContext> hVar, boolean z5) {
            super(2);
            this.f28819p = hVar;
            this.f28820q = z5;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.g] */
        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext g0(@d5.d CoroutineContext coroutineContext, @d5.d CoroutineContext.b bVar) {
            if (!(bVar instanceof l0)) {
                return coroutineContext.B(bVar);
            }
            CoroutineContext.b b6 = this.f28819p.f23572o.b(bVar.getKey());
            if (b6 != null) {
                k1.h<CoroutineContext> hVar = this.f28819p;
                hVar.f23572o = hVar.f23572o.c(bVar.getKey());
                return coroutineContext.B(((l0) bVar).z(b6));
            }
            l0 l0Var = (l0) bVar;
            if (this.f28820q) {
                l0Var = l0Var.d0();
            }
            return coroutineContext.B(l0Var);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/g$b;", "it", "a", "(ZLkotlin/coroutines/g$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.p<Boolean, CoroutineContext.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f28821p = new c();

        c() {
            super(2);
        }

        @d5.d
        public final Boolean a(boolean z5, @d5.d CoroutineContext.b bVar) {
            return Boolean.valueOf(z5 || (bVar instanceof l0));
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ Boolean g0(Boolean bool, CoroutineContext.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z5) {
        boolean c6 = c(coroutineContext);
        boolean c7 = c(coroutineContext2);
        if (!c6 && !c7) {
            return coroutineContext.B(coroutineContext2);
        }
        k1.h hVar = new k1.h();
        hVar.f23572o = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23294o;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.n(emptyCoroutineContext, new b(hVar, z5));
        if (c7) {
            hVar.f23572o = ((CoroutineContext) hVar.f23572o).n(emptyCoroutineContext, a.f28818p);
        }
        return coroutineContext3.B((CoroutineContext) hVar.f23572o);
    }

    @d5.e
    public static final String b(@d5.d CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.n(Boolean.FALSE, c.f28821p)).booleanValue();
    }

    @d5.d
    @i2
    public static final CoroutineContext d(@d5.d CoroutineContext coroutineContext, @d5.d CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.B(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @c2
    @d5.d
    public static final CoroutineContext e(@d5.d u0 u0Var, @d5.d CoroutineContext coroutineContext) {
        CoroutineContext a6 = a(u0Var.getCoroutineContext(), coroutineContext, true);
        return (a6 == m1.a() || a6.b(ContinuationInterceptor.f23289d) != null) ? a6 : a6.B(m1.a());
    }

    @d5.e
    public static final a4<?> f(@d5.d CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof i1) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof a4) {
                return (a4) coroutineStackFrame;
            }
        }
        return null;
    }

    @d5.e
    public static final a4<?> g(@d5.d Continuation<?> continuation, @d5.d CoroutineContext coroutineContext, @d5.e Object obj) {
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.b(b4.f27277o) != null)) {
            return null;
        }
        a4<?> f6 = f((CoroutineStackFrame) continuation);
        if (f6 != null) {
            f6.M1(coroutineContext, obj);
        }
        return f6;
    }

    public static final <T> T h(@d5.d Continuation<?> continuation, @d5.e Object obj, @d5.d q3.a<? extends T> aVar) {
        CoroutineContext context = continuation.getContext();
        Object c6 = kotlinx.coroutines.internal.w0.c(context, obj);
        a4<?> g5 = c6 != kotlinx.coroutines.internal.w0.f28753a ? g(continuation, context, c6) : null;
        try {
            return aVar.n();
        } finally {
            if (g5 == null || g5.L1()) {
                kotlinx.coroutines.internal.w0.a(context, c6);
            }
        }
    }

    public static final <T> T i(@d5.d CoroutineContext coroutineContext, @d5.e Object obj, @d5.d q3.a<? extends T> aVar) {
        Object c6 = kotlinx.coroutines.internal.w0.c(coroutineContext, obj);
        try {
            return aVar.n();
        } finally {
            kotlinx.coroutines.internal.w0.a(coroutineContext, c6);
        }
    }
}
