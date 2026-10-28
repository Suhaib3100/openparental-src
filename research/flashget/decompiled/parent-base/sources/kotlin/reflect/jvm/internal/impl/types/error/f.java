package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.compose.foundation.layout.f3;
import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: ErrorScope.kt */
/* loaded from: classes7.dex */
public class f implements kotlin.reflect.jvm.internal.impl.resolve.scopes.h {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final g f78401b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final String f78402c;

    public f(@fg.l g gVar, @fg.l String... strArr) {
        l0.p(gVar, ProtectedSandApp.s("繁\u0001"));
        l0.p(strArr, ProtectedSandApp.s("繂\u0001"));
        this.f78401b = gVar;
        String debugMessage = gVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f78402c = s3.a(copyOf, copyOf.length, debugMessage, ProtectedSandApp.s("繃\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("繄\u0001"));
        l0.p(bVar, ProtectedSandApp.s("繅\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("繄\u0001"));
        l0.p(bVar, ProtectedSandApp.s("繅\u0001"));
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{fVar}, 1));
        l0.o(format, ProtectedSandApp.s("繃\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f i4 = kotlin.reflect.jvm.internal.impl.name.f.i(format);
        l0.o(i4, ProtectedSandApp.s("繆\u0001"));
        return new a(i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("繇\u0001"));
        l0.p(lVar, ProtectedSandApp.s("繈\u0001"));
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("繄\u0001"));
        l0.p(bVar, ProtectedSandApp.s("繅\u0001"));
        return l1.f(new c(k.f78413a.h()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("繄\u0001"));
        l0.p(bVar, ProtectedSandApp.s("繅\u0001"));
        return k.f78413a.j();
    }

    @fg.l
    protected final String k() {
        return this.f78402c;
    }

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("繉\u0001")), this.f78402c, '}');
    }
}
