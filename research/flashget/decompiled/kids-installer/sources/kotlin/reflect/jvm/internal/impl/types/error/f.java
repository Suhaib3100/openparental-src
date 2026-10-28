package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.p1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: ErrorScope.kt */
/* loaded from: classes6.dex */
public class f implements kotlin.reflect.jvm.internal.impl.resolve.scopes.h {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final g f26392b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final String f26393c;

    public f(@d5.d g gVar, @d5.d String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("褉"));
        l0.p(strArr, ProtectedSandApp.s("褊"));
        this.f26392b = gVar;
        String debugMessage = gVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        l0.o(format, ProtectedSandApp.s("褋"));
        this.f26393c = format;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褌"));
        l0.p(bVar, ProtectedSandApp.s("褍"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("褎"));
        l0.p(lVar, ProtectedSandApp.s("褏"));
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褐"));
        l0.p(bVar, ProtectedSandApp.s("褑"));
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{fVar}, 1));
        l0.o(format, ProtectedSandApp.s("褒"));
        kotlin.reflect.jvm.internal.impl.name.f s5 = kotlin.reflect.jvm.internal.impl.name.f.s(format);
        l0.o(s5, ProtectedSandApp.s("褓"));
        return new a(s5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        Set<z0> f6;
        l0.p(fVar, ProtectedSandApp.s("褔"));
        l0.p(bVar, ProtectedSandApp.s("褕"));
        f6 = p1.f(new c(k.f26404a.h()));
        return f6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褖"));
        l0.p(bVar, ProtectedSandApp.s("褗"));
        return k.f26404a.j();
    }

    @d5.d
    protected final String k() {
        return this.f26393c;
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("褘")), this.f26393c, '}');
    }
}
