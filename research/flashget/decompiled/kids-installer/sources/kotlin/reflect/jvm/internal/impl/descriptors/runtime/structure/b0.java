package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaValueParameter.kt */
/* loaded from: classes6.dex */
public final class b0 extends p implements b4.b0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final z f24384a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Annotation[] f24385b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final String f24386c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24387d;

    public b0(@d5.d z zVar, @d5.d Annotation[] annotationArr, @d5.e String str, boolean z5) {
        l0.p(zVar, ProtectedSandApp.s("荙"));
        l0.p(annotationArr, ProtectedSandApp.s("荚"));
        this.f24384a = zVar;
        this.f24385b = annotationArr;
        this.f24386c = str;
        this.f24387d = z5;
    }

    @d5.d
    public z U() {
        return this.f24384a;
    }

    @Override // b4.b0
    public boolean b() {
        return this.f24387d;
    }

    @Override // b4.b0
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String str = this.f24386c;
        if (str != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.o(str);
        }
        return null;
    }

    @Override // b4.b0
    public b4.x getType() {
        return this.f24384a;
    }

    @Override // b4.d
    public boolean o() {
        return false;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0.class.getName());
        String s5 = ProtectedSandApp.s("荜");
        sb.append(s5);
        sb.append(this.f24387d ? ProtectedSandApp.s("荝") : "");
        sb.append(getName());
        sb.append(s5);
        sb.append(this.f24384a);
        return sb.toString();
    }

    @Override // b4.d
    @d5.e
    public e e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("荛"));
        return i.a(this.f24385b, cVar);
    }

    @Override // b4.d
    @d5.d
    public List<e> getAnnotations() {
        return i.b(this.f24385b);
    }
}
