package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.calls.f;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/z$a;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/e;", "b", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "g", "", "f", "(Lkotlin/reflect/jvm/internal/z$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class a0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.e<?> b(kotlin.reflect.jvm.internal.z.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.a0.b(kotlin.reflect.jvm.internal.z$a, boolean):kotlin.reflect.jvm.internal.calls.e");
    }

    private static final kotlin.reflect.jvm.internal.calls.f<Field> c(z.a<?, ?> aVar, boolean z5, Field field) {
        kotlin.reflect.jvm.internal.calls.f<Field> aVar2;
        if (g(aVar.G0().F0()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z5) {
                aVar2 = aVar.E0() ? new f.g.a(field, e(aVar), f(aVar)) : new f.g.c(field, e(aVar));
            } else {
                if (!aVar.E0()) {
                    return new f.AbstractC0265f.c(field);
                }
                aVar2 = new f.AbstractC0265f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z5) {
                return aVar.E0() ? new f.AbstractC0265f.b(field) : new f.AbstractC0265f.d(field);
            }
            aVar2 = aVar.E0() ? new f.g.b(field, e(aVar)) : new f.g.d(field, e(aVar));
        } else {
            if (z5) {
                return new f.AbstractC0265f.e(field);
            }
            aVar2 = new f.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(z.a<?, ?> aVar) {
        return aVar.G0().F0().getAnnotations().O0(n0.j());
    }

    private static final boolean e(z.a<?, ?> aVar) {
        return !t1.l(aVar.G0().F0().getType());
    }

    @d5.e
    public static final Object f(@d5.d z.a<?, ?> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("䍗"));
        return aVar.G0().H0();
    }

    private static final boolean g(u0 u0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = u0Var.b();
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("䍘"));
        if (!kotlin.reflect.jvm.internal.impl.resolve.e.x(b6)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b7 = b6.b();
        return !(kotlin.reflect.jvm.internal.impl.resolve.e.C(b7) || kotlin.reflect.jvm.internal.impl.resolve.e.t(b7)) || ((u0Var instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) && kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) u0Var).n1()));
    }
}
