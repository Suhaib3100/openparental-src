package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: ThrowingScope.kt */
/* loaded from: classes7.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@fg.l g gVar, @fg.l String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        l0.p(gVar, ProtectedSandApp.s("缜\u0001"));
        l0.p(strArr, ProtectedSandApp.s("缝\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("缞\u0001"));
        l0.p(bVar, ProtectedSandApp.s("缟\u0001"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("缠\u0001") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("缡\u0001"));
        l0.p(lVar, ProtectedSandApp.s("缢\u0001"));
        throw new IllegalStateException(k());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: i */
    public Set<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("缞\u0001"));
        l0.p(bVar, ProtectedSandApp.s("缟\u0001"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("缠\u0001") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    /* renamed from: j */
    public Set<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("缞\u0001"));
        l0.p(bVar, ProtectedSandApp.s("缟\u0001"));
        throw new IllegalStateException(k() + ProtectedSandApp.s("缠\u0001") + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("缞\u0001"));
        l0.p(bVar, ProtectedSandApp.s("缟\u0001"));
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.f
    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("缣\u0001")), k(), '}');
    }
}
