package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f;

/* compiled from: ReflectJavaAnnotation.kt */
@r1({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11065#2:44\n11400#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
/* loaded from: classes7.dex */
public final class e extends p implements wd.a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Annotation f76251a;

    public e(@fg.l Annotation annotation) {
        l0.p(annotation, ProtectedSandApp.s("滁\u0001"));
        this.f76251a = annotation;
    }

    @Override // wd.a
    public boolean H() {
        return false;
    }

    @fg.l
    public final Annotation O() {
        return this.f76251a;
    }

    @Override // wd.a
    @fg.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public l y() {
        return new l(kd.b.e(kd.b.a(this.f76251a)));
    }

    @Override // wd.a
    @fg.l
    public Collection<wd.b> c() {
        Method[] declaredMethods = kd.b.e(kd.b.a(this.f76251a)).getDeclaredMethods();
        l0.o(declaredMethods, ProtectedSandApp.s("滂\u0001"));
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f76252b;
            Object invoke = method.invoke(this.f76251a, null);
            l0.o(invoke, ProtectedSandApp.s("滃\u0001"));
            arrayList.add(aVar.a(invoke, kotlin.reflect.jvm.internal.impl.name.f.f(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof e) && this.f76251a == ((e) obj).f76251a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f76251a);
    }

    @Override // wd.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.b m() {
        return d.a(kd.b.e(kd.b.a(this.f76251a)));
    }

    @Override // wd.a
    public boolean n() {
        return false;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(e.class, sb, ProtectedSandApp.s("滄\u0001"));
        sb.append(this.f76251a);
        return sb.toString();
    }
}
