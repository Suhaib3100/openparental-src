package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes5.dex */
public final class e extends i0 {

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    public static final e f24562n = new e();

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ z0 f24563p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var) {
            super(1);
            this.f24563p = z0Var;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葙"));
            i0.f24581a.getClass();
            return Boolean.valueOf(i0.f24591k.containsKey(kotlin.reflect.jvm.internal.impl.load.kotlin.w.d(this.f24563p)));
        }
    }

    private e() {
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.f i(@d5.d z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("䧖"));
        i0.f24581a.getClass();
        Map map = i0.f24591k;
        String d6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.d(z0Var);
        if (d6 == null) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.name.f) map.get(d6);
    }

    public final boolean j(@d5.d z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("䧗"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.f0(z0Var) && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(z0Var, false, new a(z0Var), 1, null) != null;
    }

    public final boolean k(@d5.d z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("䧘"));
        if (l0.g(z0Var.getName().h(), ProtectedSandApp.s("䧙"))) {
            String d6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.d(z0Var);
            i0.f24581a.getClass();
            if (l0.g(d6, i0.f24589i.b())) {
                return true;
            }
        }
        return false;
    }
}
