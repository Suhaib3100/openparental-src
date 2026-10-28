package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes7.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f75902a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f75903b;

    /* renamed from: c, reason: collision with root package name */
    private final a1 f75904c;

    public d(@fg.l h0 h0Var, @fg.l Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map, @fg.l a1 a1Var) {
        if (h0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (a1Var == null) {
            b(2);
        }
        this.f75902a = h0Var;
        this.f75903b = map;
        this.f75904c = a1Var;
    }

    private static /* synthetic */ void b(int i4) {
        String s4 = (i4 == 3 || i4 == 4 || i4 == 5) ? ProtectedSandApp.s("櫛\u0001") : ProtectedSandApp.s("櫚\u0001");
        Object[] objArr = new Object[(i4 == 3 || i4 == 4 || i4 == 5) ? 2 : 3];
        String s5 = ProtectedSandApp.s("櫜\u0001");
        if (i4 == 1) {
            objArr[0] = ProtectedSandApp.s("櫟\u0001");
        } else if (i4 == 2) {
            objArr[0] = ProtectedSandApp.s("櫞\u0001");
        } else if (i4 == 3 || i4 == 4 || i4 == 5) {
            objArr[0] = s5;
        } else {
            objArr[0] = ProtectedSandApp.s("櫝\u0001");
        }
        if (i4 == 3) {
            objArr[1] = ProtectedSandApp.s("櫢\u0001");
        } else if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("櫡\u0001");
        } else if (i4 != 5) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("櫠\u0001");
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            objArr[2] = ProtectedSandApp.s("櫣\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f75903b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public a1 f() {
        a1 a1Var = this.f75904c;
        if (a1Var == null) {
            b(5);
        }
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.m
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public h0 getType() {
        h0 h0Var = this.f75902a;
        if (h0Var == null) {
            b(3);
        }
        return h0Var;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f77798g.t(this, null);
    }
}
