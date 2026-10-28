package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaValueParameter.kt */
@r1({"SMAP\nReflectJavaValueParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaValueParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaValueParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes7.dex */
public final class b0 extends p implements wd.b0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final z f76234a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Annotation[] f76235b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final String f76236c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76237d;

    public b0(@fg.l z zVar, @fg.l Annotation[] annotationArr, @fg.m String str, boolean z4) {
        l0.p(zVar, ProtectedSandApp.s("溋\u0001"));
        l0.p(annotationArr, ProtectedSandApp.s("溌\u0001"));
        this.f76234a = zVar;
        this.f76235b = annotationArr;
        this.f76236c = str;
        this.f76237d = z4;
    }

    @Override // wd.d
    public boolean E() {
        return false;
    }

    @fg.l
    public z O() {
        return this.f76234a;
    }

    @Override // wd.b0
    public boolean a() {
        return this.f76237d;
    }

    @Override // wd.d
    public Collection getAnnotations() {
        return i.b(this.f76235b);
    }

    @Override // wd.b0
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String str = this.f76236c;
        if (str != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.e(str);
        }
        return null;
    }

    @Override // wd.b0
    public wd.x getType() {
        return this.f76234a;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String s4 = ProtectedSandApp.s("溎\u0001");
        m2.a(b0.class, sb, s4);
        sb.append(this.f76237d ? ProtectedSandApp.s("溏\u0001") : "");
        sb.append(getName());
        sb.append(s4);
        sb.append(this.f76234a);
        return sb.toString();
    }

    @Override // wd.d
    @fg.m
    public e k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("溍\u0001"));
        return i.a(this.f76235b, cVar);
    }

    @Override // wd.d
    @fg.l
    public List<e> getAnnotations() {
        return i.b(this.f76235b);
    }
}
