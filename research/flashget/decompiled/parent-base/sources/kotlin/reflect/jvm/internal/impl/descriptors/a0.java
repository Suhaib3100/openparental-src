package kotlin.reflect.jvm.internal.impl.descriptors;

import ce.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.r1;

/* compiled from: InlineClassRepresentation.kt */
@r1({"SMAP\nInlineClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/InlineClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes7.dex */
public final class a0<Type extends ce.j> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f f75898a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Type f75899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Type type) {
        super(null);
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("櫑\u0001"));
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("櫒\u0001"));
        this.f75898a = fVar;
        this.f75899b = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    public boolean a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("櫓\u0001"));
        return kotlin.jvm.internal.l0.g(this.f75898a, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h1
    @fg.l
    public List<kotlin.q0<kotlin.reflect.jvm.internal.impl.name.f, Type>> b() {
        return kotlin.collections.w.k(new kotlin.q0(this.f75898a, this.f75899b));
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f d() {
        return this.f75898a;
    }

    @fg.l
    public final Type e() {
        return this.f75899b;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("櫔\u0001") + this.f75898a + ProtectedSandApp.s("櫕\u0001") + this.f75899b + ')';
    }
}
