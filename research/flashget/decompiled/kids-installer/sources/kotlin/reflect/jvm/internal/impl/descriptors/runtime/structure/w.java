package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes6.dex */
public final class w extends p implements b4.u {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24427a;

    public w(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("获"));
        this.f24427a = cVar;
    }

    @Override // b4.u
    @d5.d
    public Collection<b4.g> D(@d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(lVar, ProtectedSandApp.s("莸"));
        return EmptyList.f23167o;
    }

    @Override // b4.u
    @d5.d
    public Collection<b4.u> F() {
        return EmptyList.f23167o;
    }

    @Override // b4.d
    @d5.e
    public b4.a e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("莹"));
        return null;
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof w) && l0.g(this.f24427a, ((w) obj).f24427a);
    }

    @Override // b4.u
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return this.f24427a;
    }

    @Override // b4.d
    public Collection getAnnotations() {
        return EmptyList.f23167o;
    }

    public int hashCode() {
        return this.f24427a.hashCode();
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @d5.d
    public String toString() {
        return w.class.getName() + ProtectedSandApp.s("莺") + this.f24427a;
    }

    @Override // b4.d
    @d5.d
    public List<b4.a> getAnnotations() {
        return EmptyList.f23167o;
    }
}
