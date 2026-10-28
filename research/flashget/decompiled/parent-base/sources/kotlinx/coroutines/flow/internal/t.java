package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.n2;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lkotlinx/coroutines/flow/internal/t;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "collector", "Lkotlin/coroutines/g;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "uCont", "value", "", "d", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/l;", "exception", "m", "(Lkotlinx/coroutines/flow/internal/l;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/z0;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/j;", "c", "Lkotlin/coroutines/g;", "", "I", "collectContextSize", "e", "lastEmissionContext", "f", "Lkotlin/coroutines/d;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* loaded from: classes7.dex */
public final class t<T> extends kotlin.coroutines.jvm.internal.d implements kotlinx.coroutines.flow.j<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlinx.coroutines.flow.j<T> collector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlin.coroutines.g collectContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int collectContextSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlin.coroutines.g lastEmissionContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlin.coroutines.d<? super k2> completion;

    /* compiled from: SafeCollector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lkotlin/coroutines/g$b;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<Integer, g.b, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80156b = new a(2);

        a() {
            super(2);
        }

        @fg.l
        public final Integer a(int i4, @fg.l g.b bVar) {
            return Integer.valueOf(i4 + 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.g gVar) {
        super(q.f80145b, kotlin.coroutines.i.f75057b);
        this.collector = jVar;
        this.collectContext = gVar;
        this.collectContextSize = ((Number) gVar.g(0, a.f80156b)).intValue();
    }

    private final void a(kotlin.coroutines.g currentContext, kotlin.coroutines.g previousContext, T value) {
        if (previousContext instanceof l) {
            m((l) previousContext, value);
        }
        v.a(this, currentContext);
    }

    private final Object d(kotlin.coroutines.d<? super k2> uCont, T value) {
        ld.q qVar;
        kotlin.coroutines.g context = uCont.getContext();
        n2.z(context);
        kotlin.coroutines.g gVar = this.lastEmissionContext;
        if (gVar != context) {
            a(context, gVar, value);
            this.lastEmissionContext = context;
        }
        this.completion = uCont;
        qVar = u.f80157a;
        kotlinx.coroutines.flow.j<T> jVar = this.collector;
        l0.n(jVar, ProtectedSandApp.s("蜬\u0001"));
        l0.n(this, ProtectedSandApp.s("蜭\u0001"));
        Object R = qVar.R(jVar, value, this);
        if (!l0.g(R, kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED)) {
            this.completion = null;
        }
        return R;
    }

    private final void m(l exception, Object value) {
        throw new IllegalStateException(kotlin.text.v.p(ProtectedSandApp.s("蜮\u0001") + exception.e + ProtectedSandApp.s("蜯\u0001") + value + ProtectedSandApp.s("蜰\u0001")).toString());
    }

    @Override // kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        try {
            Object d5 = d(dVar, t4);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (d5 == aVar) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return d5 == aVar ? d5 : k2.f75408a;
        } catch (Throwable th) {
            this.lastEmissionContext = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @fg.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<? super k2> dVar = this.completion;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        kotlin.coroutines.g gVar = this.lastEmissionContext;
        return gVar == null ? kotlin.coroutines.i.f75057b : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @fg.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @fg.l
    public Object invokeSuspend(@fg.l Object result) {
        Throwable e4 = z0.e(result);
        if (e4 != null) {
            this.lastEmissionContext = new l(e4, getContext());
        }
        kotlin.coroutines.d<? super k2> dVar = this.completion;
        if (dVar != null) {
            dVar.resumeWith(result);
        }
        return kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
