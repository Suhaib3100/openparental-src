package kotlin.coroutines;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+¨\u0006,"}, d2 = {"Lkotlin/coroutines/c;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/g$b;", "element", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)V", "", "p", "()I", "", "a", "(Lkotlin/coroutines/g$b;)Z", "context", "j", "(Lkotlin/coroutines/c;)Z", "", "q", "()Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "g", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.3")
@r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes7.dex */
public final class c implements g, Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final g left;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.b element;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/c$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/g;", "elements", "<init>", "([Lkotlin/coroutines/g;)V", "", "b", "()Ljava/lang/Object;", "[Lkotlin/coroutines/g;", "a", "()[Lkotlin/coroutines/g;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    private static final class a implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f75047d = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final g[] elements;

        public a(@l g[] gVarArr) {
            l0.p(gVarArr, ProtectedSandApp.s("拳\u0001"));
            this.elements = gVarArr;
        }

        private final Object b() {
            g[] gVarArr = this.elements;
            g gVar = i.f75057b;
            for (g gVar2 : gVarArr) {
                gVar = gVar.O(gVar2);
            }
            return gVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final g[] getElements() {
            return this.elements;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lkotlin/coroutines/g$b;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/g$b;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements p<String, g.b, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75049b = new b(2);

        b() {
            super(2);
        }

        @Override // ld.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@l String str, @l g.b bVar) {
            l0.p(str, ProtectedSandApp.s("拴\u0001"));
            l0.p(bVar, ProtectedSandApp.s("拵\u0001"));
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ProtectedSandApp.s("拶\u0001") + bVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/k2;", "<anonymous parameter 0>", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/k2;Lkotlin/coroutines/g$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.coroutines.c$c, reason: collision with other inner class name */
    static final class C1054c extends n0 implements p<k2, g.b, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g[] f75050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.f f75051c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1054c(g[] gVarArr, k1.f fVar) {
            super(2);
            this.f75050b = gVarArr;
            this.f75051c = fVar;
        }

        public final void a(@l k2 k2Var, @l g.b bVar) {
            l0.p(k2Var, ProtectedSandApp.s("拷\u0001"));
            l0.p(bVar, ProtectedSandApp.s("拸\u0001"));
            g[] gVarArr = this.f75050b;
            k1.f fVar = this.f75051c;
            int i4 = fVar.f75327b;
            fVar.f75327b = i4 + 1;
            gVarArr[i4] = bVar;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(k2 k2Var, g.b bVar) {
            a(k2Var, bVar);
            return k2.f75408a;
        }
    }

    public c(@l g gVar, @l g.b bVar) {
        l0.p(gVar, ProtectedSandApp.s("拹\u0001"));
        l0.p(bVar, ProtectedSandApp.s("拺\u0001"));
        this.left = gVar;
        this.element = bVar;
    }

    private final boolean a(g.b element) {
        return l0.g(c(element.getKey()), element);
    }

    private final boolean j(c context) {
        while (a(context.element)) {
            g gVar = context.left;
            if (!(gVar instanceof c)) {
                l0.n(gVar, ProtectedSandApp.s("拻\u0001"));
                return a((g.b) gVar);
            }
            context = (c) gVar;
        }
        return false;
    }

    private final int p() {
        int i4 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.left;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i4;
            }
            i4++;
        }
    }

    private final Object q() {
        int p4 = p();
        g[] gVarArr = new g[p4];
        k1.f fVar = new k1.f();
        g(k2.f75408a, new C1054c(gVarArr, fVar));
        if (fVar.f75327b == p4) {
            return new a(gVarArr);
        }
        throw new IllegalStateException(ProtectedSandApp.s("拼\u0001"));
    }

    @Override // kotlin.coroutines.g
    @l
    public g O(@l g gVar) {
        return g.a.a(this, gVar);
    }

    @Override // kotlin.coroutines.g
    @m
    public <E extends g.b> E c(@l g.c<E> key) {
        l0.p(key, ProtectedSandApp.s("拽\u0001"));
        c cVar = this;
        while (true) {
            E e4 = (E) cVar.element.c(key);
            if (e4 != null) {
                return e4;
            }
            g gVar = cVar.left;
            if (!(gVar instanceof c)) {
                return (E) gVar.c(key);
            }
            cVar = (c) gVar;
        }
    }

    @Override // kotlin.coroutines.g
    @l
    public g d(@l g.c<?> key) {
        l0.p(key, ProtectedSandApp.s("拽\u0001"));
        if (this.element.c(key) != null) {
            return this.left;
        }
        g d5 = this.left.d(key);
        return d5 == this.left ? this : d5 == i.f75057b ? this.element : new c(d5, this.element);
    }

    public boolean equals(@m Object other) {
        if (this != other) {
            if (other instanceof c) {
                c cVar = (c) other;
                if (cVar.p() != p() || !cVar.j(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.g
    public <R> R g(R initial, @l p<? super R, ? super g.b, ? extends R> operation) {
        l0.p(operation, ProtectedSandApp.s("拾\u0001"));
        return operation.invoke((Object) this.left.g(initial, operation), this.element);
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("拿\u0001")), (String) g("", b.f75049b), ']');
    }
}
