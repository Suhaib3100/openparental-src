package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import h4.k;
import java.util.List;
import kotlin.Pair;

/* compiled from: InlineClassRepresentation.kt */
/* loaded from: classes5.dex */
public final class a0<Type extends h4.k> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f f24101a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Type f24102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Type type) {
        super(null);
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("䛑"));
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("䛒"));
        this.f24101a = fVar;
        this.f24102b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    @d5.d
    public List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a() {
        List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> k5;
        k5 = kotlin.collections.z.k(new Pair(this.f24101a, this.f24102b));
        return k5;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return this.f24101a;
    }

    @d5.d
    public final Type d() {
        return this.f24102b;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䛓") + this.f24101a + ProtectedSandApp.s("䛔") + this.f24102b + ')';
    }
}
