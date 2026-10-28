package kotlin.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import q3.p;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* renamed from: kotlin.coroutines.c, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final CoroutineContext f23281o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final CoroutineContext.b f23282p;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* renamed from: kotlin.coroutines.c$a */
    private static final class a implements Serializable {

        /* renamed from: p, reason: collision with root package name */
        @d5.d
        public static final C0254a f23283p = new C0254a(null);

        /* renamed from: q, reason: collision with root package name */
        private static final long f23284q = 0;

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final CoroutineContext[] f23285o;

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.coroutines.c$a$a, reason: collision with other inner class name */
        public static final class C0254a {
            private C0254a() {
            }

            public C0254a(w wVar) {
            }
        }

        public a(@d5.d CoroutineContext[] coroutineContextArr) {
            l0.p(coroutineContextArr, ProtectedSandApp.s("㺖"));
            this.f23285o = coroutineContextArr;
        }

        private final Object b() {
            CoroutineContext[] coroutineContextArr = this.f23285o;
            CoroutineContext coroutineContext = EmptyCoroutineContext.f23294o;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.B(coroutineContext2);
            }
            return coroutineContext;
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public final CoroutineContext[] getF23285o() {
            return this.f23285o;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.c$b */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements p<String, CoroutineContext.b, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f23286p = new b();

        b() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String g0(@d5.d String str, @d5.d CoroutineContext.b bVar) {
            l0.p(str, ProtectedSandApp.s("綩"));
            l0.p(bVar, ProtectedSandApp.s("綪"));
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ProtectedSandApp.s("綫") + bVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.c$c */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements p<m2, CoroutineContext.b, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ CoroutineContext[] f23287p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ k1.f f23288q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CoroutineContext[] coroutineContextArr, k1.f fVar) {
            super(2);
            this.f23287p = coroutineContextArr;
            this.f23288q = fVar;
        }

        public final void a(@d5.d m2 m2Var, @d5.d CoroutineContext.b bVar) {
            l0.p(m2Var, ProtectedSandApp.s("綬"));
            l0.p(bVar, ProtectedSandApp.s("維"));
            CoroutineContext[] coroutineContextArr = this.f23287p;
            k1.f fVar = this.f23288q;
            int i5 = fVar.f23570o;
            fVar.f23570o = i5 + 1;
            coroutineContextArr[i5] = bVar;
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ m2 g0(m2 m2Var, CoroutineContext.b bVar) {
            a(m2Var, bVar);
            return m2.f23662a;
        }
    }

    public CombinedContext(@d5.d CoroutineContext coroutineContext, @d5.d CoroutineContext.b bVar) {
        l0.p(coroutineContext, ProtectedSandApp.s("㺗"));
        l0.p(bVar, ProtectedSandApp.s("㺘"));
        this.f23281o = coroutineContext;
        this.f23282p = bVar;
    }

    private final boolean f(CoroutineContext.b bVar) {
        return l0.g(b(bVar.getKey()), bVar);
    }

    private final boolean g(CombinedContext combinedContext) {
        while (f(combinedContext.f23282p)) {
            CoroutineContext coroutineContext = combinedContext.f23281o;
            if (!(coroutineContext instanceof CombinedContext)) {
                l0.n(coroutineContext, ProtectedSandApp.s("㺙"));
                return f((CoroutineContext.b) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final int h() {
        int i5 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f23281o;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i5;
            }
            i5++;
        }
    }

    private final Object i() {
        int h5 = h();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[h5];
        k1.f fVar = new k1.f();
        n(m2.f23662a, new c(coroutineContextArr, fVar));
        if (fVar.f23570o == h5) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException(ProtectedSandApp.s("㺚").toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext B(@d5.d CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar) {
        l0.p(cVar, ProtectedSandApp.s("㺛"));
        CombinedContext combinedContext = this;
        while (true) {
            E e6 = (E) combinedContext.f23282p.b(cVar);
            if (e6 != null) {
                return e6;
            }
            CoroutineContext coroutineContext = combinedContext.f23281o;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.b(cVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("㺜"));
        if (this.f23282p.b(cVar) != null) {
            return this.f23281o;
        }
        CoroutineContext c6 = this.f23281o.c(cVar);
        return c6 == this.f23281o ? this : c6 == EmptyCoroutineContext.f23294o ? this.f23282p : new CombinedContext(c6, this.f23282p);
    }

    public boolean equals(@d5.e Object other) {
        if (this != other) {
            if (other instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) other;
                if (combinedContext.h() != h() || !combinedContext.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f23282p.hashCode() + this.f23281o.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        l0.p(pVar, ProtectedSandApp.s("㺝"));
        return pVar.g0((Object) this.f23281o.n(r5, pVar), this.f23282p);
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("㺞")), (String) n("", b.f23286p), ']');
    }
}
