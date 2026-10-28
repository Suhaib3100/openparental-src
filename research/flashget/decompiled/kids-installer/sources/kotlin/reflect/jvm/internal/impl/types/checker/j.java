package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes6.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final l1 f26351a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private q3.a<? extends List<? extends w1>> f26352b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final j f26353c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final f1 f26354d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final Lazy f26355e;

    /* compiled from: NewCapturedType.kt */
    static final class a extends Lambda implements q3.a<List<? extends w1>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<w1> f26356p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends w1> list) {
            super(0);
            this.f26356p = list;
        }

        @d5.d
        public final List<w1> a() {
            return this.f26356p;
        }

        @Override // q3.a
        public List<? extends w1> n() {
            return this.f26356p;
        }
    }

    /* compiled from: NewCapturedType.kt */
    static final class b extends Lambda implements q3.a<List<? extends w1>> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<w1> n() {
            q3.a aVar = j.this.f26352b;
            if (aVar != null) {
                return (List) aVar.n();
            }
            return null;
        }
    }

    /* compiled from: NewCapturedType.kt */
    static final class c extends Lambda implements q3.a<List<? extends w1>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<w1> f26358p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends w1> list) {
            super(0);
            this.f26358p = list;
        }

        @d5.d
        public final List<w1> a() {
            return this.f26358p;
        }

        @Override // q3.a
        public List<? extends w1> n() {
            return this.f26358p;
        }
    }

    /* compiled from: NewCapturedType.kt */
    static final class d extends Lambda implements q3.a<List<? extends w1>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f26360q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f26360q = gVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<w1> n() {
            int b02;
            List<w1> m5 = j.this.m();
            g gVar = this.f26360q;
            b02 = b0.b0(m5, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = m5.iterator();
            while (it.hasNext()) {
                arrayList.add(((w1) it.next()).e1(gVar));
            }
            return arrayList;
        }
    }

    public j(@d5.d l1 l1Var, @d5.e q3.a<? extends List<? extends w1>> aVar, @d5.e j jVar, @d5.e f1 f1Var) {
        Lazy b6;
        l0.p(l1Var, ProtectedSandApp.s("袣"));
        this.f26351a = l1Var;
        this.f26352b = aVar;
        this.f26353c = jVar;
        this.f26354d = f1Var;
        b6 = d0.b(LazyThreadSafetyMode.PUBLICATION, new b());
        this.f26355e = b6;
    }

    private final List<w1> h() {
        return (List) this.f26355e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        h0 type = this.f26351a.getType();
        l0.o(type, ProtectedSandApp.s("袤"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
    @d5.d
    public l1 e() {
        return this.f26351a;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l0.g(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l0.n(obj, ProtectedSandApp.s("袥"));
        j jVar = (j) obj;
        j jVar2 = this.f26353c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f26353c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<w1> m() {
        List<w1> h5 = h();
        return h5 == null ? EmptyList.f23167o : h5;
    }

    public int hashCode() {
        j jVar = this.f26353c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    public final void i(@d5.d List<? extends w1> list) {
        l0.p(list, ProtectedSandApp.s("袦"));
        this.f26352b = new c(list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j a(@d5.d g gVar) {
        l0.p(gVar, ProtectedSandApp.s("袧"));
        l1 a6 = this.f26351a.a(gVar);
        l0.o(a6, ProtectedSandApp.s("袨"));
        d dVar = this.f26352b != null ? new d(gVar) : null;
        j jVar = this.f26353c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(a6, dVar, jVar, this.f26354d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("袩") + this.f26351a + ')';
    }

    public /* synthetic */ j(l1 l1Var, q3.a aVar, j jVar, f1 f1Var, int i5, kotlin.jvm.internal.w wVar) {
        this(l1Var, (i5 & 2) != 0 ? null : aVar, (i5 & 4) != 0 ? null : jVar, (i5 & 8) != 0 ? null : f1Var);
    }

    public /* synthetic */ j(l1 l1Var, List list, j jVar, int i5, kotlin.jvm.internal.w wVar) {
        this(l1Var, list, (i5 & 4) != 0 ? null : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@d5.d l1 l1Var, @d5.d List<? extends w1> list, @d5.e j jVar) {
        this(l1Var, new a(list), jVar, null, 8, null);
        l0.p(l1Var, ProtectedSandApp.s("袡"));
        l0.p(list, ProtectedSandApp.s("袢"));
    }
}
