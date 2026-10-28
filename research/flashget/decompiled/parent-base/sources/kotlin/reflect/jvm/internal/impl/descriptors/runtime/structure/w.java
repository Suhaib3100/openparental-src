package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes7.dex */
public final class w extends p implements wd.u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f76277a;

    public w(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("漌\u0001"));
        this.f76277a = cVar;
    }

    @Override // wd.d
    public boolean E() {
        return false;
    }

    @Override // wd.u
    @fg.l
    public Collection<wd.g> F(@fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(lVar, ProtectedSandApp.s("漍\u0001"));
        return j0.f74919b;
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof w) && l0.g(this.f76277a, ((w) obj).f76277a);
    }

    @Override // wd.u
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return this.f76277a;
    }

    @Override // wd.d
    public Collection getAnnotations() {
        return j0.f74919b;
    }

    public int hashCode() {
        return this.f76277a.hashCode();
    }

    @Override // wd.d
    @fg.m
    public wd.a k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("漌\u0001"));
        return null;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(w.class, sb, ProtectedSandApp.s("漎\u0001"));
        sb.append(this.f76277a);
        return sb.toString();
    }

    @Override // wd.u
    @fg.l
    public Collection<wd.u> z() {
        return j0.f74919b;
    }

    @Override // wd.d
    @fg.l
    public List<wd.a> getAnnotations() {
        return j0.f74919b;
    }
}
