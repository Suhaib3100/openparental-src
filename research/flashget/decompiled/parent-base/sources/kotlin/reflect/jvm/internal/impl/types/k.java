package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes7.dex */
public final class k extends b1<k> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f78496a;

    public k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("羓\u0001"));
        this.f78496a = gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @fg.l
    public kotlin.reflect.d<? extends k> b() {
        return kotlin.jvm.internal.l1.d(k.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public k a(@fg.m k kVar) {
        return kVar == null ? this : new k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(this.f78496a, kVar.f78496a));
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e() {
        return this.f78496a;
    }

    public boolean equals(@fg.m Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l0.g(((k) obj).f78496a, this.f78496a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b1
    @fg.m
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k c(@fg.m k kVar) {
        if (kotlin.jvm.internal.l0.g(kVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f78496a.hashCode();
    }
}
