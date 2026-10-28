package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.r3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "b", "countOrElement", "c", "oldState", "Lkotlin/m2;", "a", "Lkotlinx/coroutines/internal/r0;", "Lkotlinx/coroutines/internal/r0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "Lq3/p;", "countAll", "Lkotlinx/coroutines/r3;", "findOne", "Lkotlinx/coroutines/internal/c1;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f28753a = new r0(ProtectedSandApp.s("帄"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final q3.p<Object, CoroutineContext.b, Object> f28754b = a.f28757p;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final q3.p<r3<?>, CoroutineContext.b, r3<?>> f28755c = b.f28758p;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final q3.p<c1, CoroutineContext.b, c1> f28756d = c.f28759p;

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/g$b;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/g$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.p<Object, CoroutineContext.b, Object> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f28757p = new a();

        a() {
            super(2);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.e Object obj, @d5.d CoroutineContext.b bVar) {
            if (!(bVar instanceof r3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r3;", "found", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/r3;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/r3;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.p<r3<?>, CoroutineContext.b, r3<?>> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f28758p = new b();

        b() {
            super(2);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r3<?> g0(@d5.e r3<?> r3Var, @d5.d CoroutineContext.b bVar) {
            if (r3Var != null) {
                return r3Var;
            }
            if (bVar instanceof r3) {
                return (r3) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/c1;", "state", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/internal/c1;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/internal/c1;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.p<c1, CoroutineContext.b, c1> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f28759p = new c();

        c() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c1 g0(@d5.d c1 c1Var, @d5.d CoroutineContext.b bVar) {
            if (bVar instanceof r3) {
                r3<?> r3Var = (r3) bVar;
                c1Var.a(r3Var, r3Var.o0(c1Var.context));
            }
            return c1Var;
        }
    }

    public static final void a(@d5.d CoroutineContext coroutineContext, @d5.e Object obj) {
        if (obj == f28753a) {
            return;
        }
        if (obj instanceof c1) {
            ((c1) obj).b(coroutineContext);
            return;
        }
        Object n5 = coroutineContext.n(null, f28755c);
        if (n5 == null) {
            throw new NullPointerException(ProtectedSandApp.s("帅"));
        }
        ((r3) n5).f0(coroutineContext, obj);
    }

    @d5.d
    public static final Object b(@d5.d CoroutineContext coroutineContext) {
        Object n5 = coroutineContext.n(0, f28754b);
        kotlin.jvm.internal.l0.m(n5);
        return n5;
    }

    @d5.e
    public static final Object c(@d5.d CoroutineContext coroutineContext, @d5.e Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f28753a : obj instanceof Integer ? coroutineContext.n(new c1(coroutineContext, ((Number) obj).intValue()), f28756d) : ((r3) obj).o0(coroutineContext);
    }
}
