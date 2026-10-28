package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.sequences.v;

/* compiled from: Annotations.kt */
/* loaded from: classes6.dex */
public final class k implements g {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final List<g> f24123o;

    /* compiled from: Annotations.kt */
    static final class a extends Lambda implements q3.l<g, c> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f24124p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f24124p = cVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c N(@d5.d g gVar) {
            l0.p(gVar, ProtectedSandApp.s("脋"));
            return gVar.e(this.f24124p);
        }
    }

    /* compiled from: Annotations.kt */
    static final class b extends Lambda implements q3.l<g, Sequence<? extends c>> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24125p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence<c> N(@d5.d g gVar) {
            Sequence<c> A1;
            l0.p(gVar, ProtectedSandApp.s("脌"));
            A1 = j0.A1(gVar);
            return A1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@d5.d List<? extends g> list) {
        l0.p(list, ProtectedSandApp.s("脍"));
        this.f24123o = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Sequence A1;
        l0.p(cVar, ProtectedSandApp.s("脏"));
        A1 = j0.A1(this.f24123o);
        Iterator it = A1.iterator();
        while (it.hasNext()) {
            if (((g) it.next()).O0(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    public c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Sequence A1;
        Sequence p12;
        Object F0;
        l0.p(cVar, ProtectedSandApp.s("脐"));
        A1 = j0.A1(this.f24123o);
        p12 = v.p1(A1, new a(cVar));
        F0 = v.F0(p12);
        return (c) F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        List<g> list = this.f24123o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<c> iterator() {
        Sequence A1;
        Sequence H0;
        A1 = j0.A1(this.f24123o);
        H0 = v.H0(A1, b.f24125p);
        return H0.iterator();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "脎"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.util.List r2 = kotlin.collections.l.Jy(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.annotations.k.<init>(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[]):void");
    }
}
