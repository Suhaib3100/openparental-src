package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001fH\u0080\u0010¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010#\"\u001a\u0010'\u001a\u0004\u0018\u00010\"*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "e", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "addedContext", "d", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "", "c", "(Lkotlin/coroutines/g;)Z", "originalContext", "appendContext", "isNewCoroutine", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Z)Lkotlin/coroutines/g;", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "i", "(Lkotlin/coroutines/g;Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "continuation", "h", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/w3;", "g", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;Ljava/lang/Object;)Lkotlinx/coroutines/w3;", "Lkotlin/coroutines/jvm/internal/e;", "f", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlinx/coroutines/w3;", "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "b", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f80857a = ProtectedSandApp.s("蠢\u0001");

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<kotlin.coroutines.g, g.b, kotlin.coroutines.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80858b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.g invoke(@fg.l kotlin.coroutines.g gVar, @fg.l g.b bVar) {
            return bVar instanceof j0 ? gVar.O(((j0) bVar).G()) : gVar.O(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<kotlin.coroutines.g, g.b, kotlin.coroutines.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<kotlin.coroutines.g> f80859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f80860c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h<kotlin.coroutines.g> hVar, boolean z4) {
            super(2);
            this.f80859b = hVar;
            this.f80860c = z4;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.g] */
        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.g invoke(@fg.l kotlin.coroutines.g gVar, @fg.l g.b bVar) {
            if (!(bVar instanceof j0)) {
                return gVar.O(bVar);
            }
            g.b c5 = this.f80859b.f75329b.c(bVar.getKey());
            if (c5 != null) {
                k1.h<kotlin.coroutines.g> hVar = this.f80859b;
                hVar.f75329b = hVar.f75329b.d(bVar.getKey());
                return gVar.O(((j0) bVar).n(c5));
            }
            j0 j0Var = (j0) bVar;
            if (this.f80860c) {
                j0Var = j0Var.G();
            }
            return gVar.O(j0Var);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/g$b;", "it", "a", "(ZLkotlin/coroutines/g$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<Boolean, g.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f80861b = new c(2);

        c() {
            super(2);
        }

        @fg.l
        public final Boolean a(boolean z4, @fg.l g.b bVar) {
            return Boolean.valueOf(z4 || (bVar instanceof j0));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.g a(kotlin.coroutines.g gVar, kotlin.coroutines.g gVar2, boolean z4) {
        boolean c5 = c(gVar);
        boolean c6 = c(gVar2);
        if (!c5 && !c6) {
            return gVar.O(gVar2);
        }
        k1.h hVar = new k1.h();
        hVar.f75329b = gVar2;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.f75057b;
        kotlin.coroutines.g gVar3 = (kotlin.coroutines.g) gVar.g(iVar, new b(hVar, z4));
        if (c6) {
            hVar.f75329b = ((kotlin.coroutines.g) hVar.f75329b).g(iVar, a.f80858b);
        }
        return gVar3.O((kotlin.coroutines.g) hVar.f75329b);
    }

    @fg.m
    public static final String b(@fg.l kotlin.coroutines.g gVar) {
        return null;
    }

    private static final boolean c(kotlin.coroutines.g gVar) {
        return ((Boolean) gVar.g(Boolean.FALSE, c.f80861b)).booleanValue();
    }

    @fg.l
    @f2
    public static final kotlin.coroutines.g d(@fg.l kotlin.coroutines.g gVar, @fg.l kotlin.coroutines.g gVar2) {
        return !c(gVar2) ? gVar.O(gVar2) : a(gVar, gVar2, false);
    }

    @fg.l
    @z1
    public static final kotlin.coroutines.g e(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar) {
        kotlin.coroutines.g a5 = a(r0Var.getCoroutineContext(), gVar, true);
        return (a5 == j1.a() || a5.c(kotlin.coroutines.e.INSTANCE) != null) ? a5 : a5.O(j1.a());
    }

    @fg.m
    public static final w3<?> f(@fg.l kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof f1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof w3) {
                return (w3) eVar;
            }
        }
        return null;
    }

    @fg.m
    public static final w3<?> g(@fg.l kotlin.coroutines.d<?> dVar, @fg.l kotlin.coroutines.g gVar, @fg.m Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.c(x3.f81201b) == null) {
            return null;
        }
        w3<?> f4 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f4 != null) {
            f4.c2(gVar, obj);
        }
        return f4;
    }

    public static final <T> T h(@fg.l kotlin.coroutines.d<?> dVar, @fg.m Object obj, @fg.l ld.a<? extends T> aVar) {
        kotlin.coroutines.g context = dVar.getContext();
        Object c5 = kotlinx.coroutines.internal.y0.c(context, obj);
        w3<?> g4 = c5 != kotlinx.coroutines.internal.y0.f80834a ? g(dVar, context, c5) : null;
        try {
            return aVar.invoke();
        } finally {
            if (g4 == null || g4.b2()) {
                kotlinx.coroutines.internal.y0.a(context, c5);
            }
        }
    }

    public static final <T> T i(@fg.l kotlin.coroutines.g gVar, @fg.m Object obj, @fg.l ld.a<? extends T> aVar) {
        Object c5 = kotlinx.coroutines.internal.y0.c(gVar, obj);
        try {
            return aVar.invoke();
        } finally {
            kotlinx.coroutines.internal.y0.a(gVar, c5);
        }
    }
}
