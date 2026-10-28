package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes5.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f24105a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f24106b;

    /* renamed from: c, reason: collision with root package name */
    private final a1 f24107c;

    public d(@d5.d h0 h0Var, @d5.d Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map, @d5.d a1 a1Var) {
        if (h0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (a1Var == null) {
            b(2);
        }
        this.f24105a = h0Var;
        this.f24106b = map;
        this.f24107c = a1Var;
    }

    private static /* synthetic */ void b(int i5) {
        String s5 = (i5 == 3 || i5 == 4 || i5 == 5) ? ProtectedSandApp.s("䛠") : ProtectedSandApp.s("䛟");
        Object[] objArr = new Object[(i5 == 3 || i5 == 4 || i5 == 5) ? 2 : 3];
        String s6 = ProtectedSandApp.s("䛡");
        if (i5 == 1) {
            objArr[0] = ProtectedSandApp.s("䛤");
        } else if (i5 == 2) {
            objArr[0] = ProtectedSandApp.s("䛣");
        } else if (i5 == 3 || i5 == 4 || i5 == 5) {
            objArr[0] = s6;
        } else {
            objArr[0] = ProtectedSandApp.s("䛢");
        }
        if (i5 == 3) {
            objArr[1] = ProtectedSandApp.s("䛧");
        } else if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("䛦");
        } else if (i5 != 5) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("䛥");
        }
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            objArr[2] = ProtectedSandApp.s("䛨");
        }
        String format = String.format(s5, objArr);
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f24106b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.e
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public h0 getType() {
        h0 h0Var = this.f24105a;
        if (h0Var == null) {
            b(3);
        }
        return h0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public a1 k() {
        a1 a1Var = this.f24107c;
        if (a1Var == null) {
            b(5);
        }
        return a1Var;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f25816g.t(this, null);
    }
}
