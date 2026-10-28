package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes7.dex */
public final class e extends i0 {

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    public static final e f76416o = new e();

    /* compiled from: specialBuiltinMembers.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f76417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var) {
            super(1);
            this.f76417b = z0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("炋\u0001"));
            i0.f76436a.getClass();
            return Boolean.valueOf(i0.f76446k.containsKey(kotlin.reflect.jvm.internal.impl.load.kotlin.y.d(this.f76417b)));
        }
    }

    private e() {
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.f i(@fg.l z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("炴\u0001"));
        i0.f76436a.getClass();
        Map map = i0.f76446k;
        String d5 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.d(z0Var);
        if (d5 == null) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.name.f) map.get(d5);
    }

    public final boolean j(@fg.l z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("炴\u0001"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.g0(z0Var) && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(z0Var, false, new a(z0Var), 1, null) != null;
    }

    public final boolean k(@fg.l z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("炵\u0001"));
        if (l0.g(z0Var.getName().b(), ProtectedSandApp.s("炶\u0001"))) {
            String d5 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.d(z0Var);
            i0.f76436a.getClass();
            if (l0.g(d5, i0.f76444i.d())) {
                return true;
            }
        }
        return false;
    }
}
