package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: ThrowingScope.kt */
/* loaded from: classes6.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@d5.d g gVar, @d5.d String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        l0.p(gVar, ProtectedSandApp.s("褨"));
        l0.p(strArr, ProtectedSandApp.s("褩"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("褪"));
        l0.p(lVar, ProtectedSandApp.s("褫"));
        throw new IllegalStateException(k());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褬"));
        l0.p(bVar, ProtectedSandApp.s("褭"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("褮") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: i */
    public Set<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褯"));
        l0.p(bVar, ProtectedSandApp.s("褰"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("褱") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    /* renamed from: j */
    public Set<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褲"));
        l0.p(bVar, ProtectedSandApp.s("褳"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("褴") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("褵"));
        l0.p(bVar, ProtectedSandApp.s("褶"));
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("褷")), k(), '}');
    }
}
