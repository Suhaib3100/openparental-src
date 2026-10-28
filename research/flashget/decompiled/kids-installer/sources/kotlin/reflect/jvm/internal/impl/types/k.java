package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.KClass;

/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes5.dex */
public final class k extends b1<k> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f26487a;

    public k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("坷"));
        this.f26487a = gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @d5.d
    public KClass<? extends k> b() {
        return kotlin.jvm.internal.l1.d(k.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public k a(@d5.e k kVar) {
        return kVar == null ? this : new k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(this.f26487a, kVar.f26487a));
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e() {
        return this.f26487a;
    }

    public boolean equals(@d5.e Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l0.g(((k) obj).f26487a, this.f26487a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @d5.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k c(@d5.e k kVar) {
        if (kotlin.jvm.internal.l0.g(kVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f26487a.hashCode();
    }
}
