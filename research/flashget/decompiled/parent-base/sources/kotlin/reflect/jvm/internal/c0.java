package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.calls.f;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/b0$a;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/e;", "b", "(Lkotlin/reflect/jvm/internal/b0$a;Z)Lkotlin/reflect/jvm/internal/calls/e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u0;)Z", "", "f", "(Lkotlin/reflect/jvm/internal/b0$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes7.dex */
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.e<?> b(kotlin.reflect.jvm.internal.b0.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.c0.b(kotlin.reflect.jvm.internal.b0$a, boolean):kotlin.reflect.jvm.internal.calls.e");
    }

    private static final kotlin.reflect.jvm.internal.calls.f<Field> c(b0.a<?, ?> aVar, boolean z4, Field field) {
        kotlin.reflect.jvm.internal.calls.f<Field> aVar2;
        if (g(aVar.u0().t0()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z4) {
                aVar2 = aVar.s0() ? new f.g.a(field, e(aVar), f(aVar)) : new f.g.c(field, e(aVar));
            } else {
                if (!aVar.s0()) {
                    return new f.AbstractC1068f.c(field);
                }
                aVar2 = new f.AbstractC1068f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z4) {
                return aVar.s0() ? new f.AbstractC1068f.b(field) : new f.AbstractC1068f.d(field);
            }
            aVar2 = aVar.s0() ? new f.g.b(field, e(aVar)) : new f.g.d(field, e(aVar));
        } else {
            if (z4) {
                return new f.AbstractC1068f.e(field);
            }
            aVar2 = new f.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(b0.a<?, ?> aVar) {
        return aVar.u0().t0().getAnnotations().o3(p0.l());
    }

    private static final boolean e(b0.a<?, ?> aVar) {
        return !t1.l(aVar.u0().t0().getType());
    }

    @fg.m
    public static final Object f(@fg.l b0.a<?, ?> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("暜\u0001"));
        return aVar.u0().v0();
    }

    private static final boolean g(u0 u0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = u0Var.c();
        kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("暝\u0001"));
        if (!kotlin.reflect.jvm.internal.impl.resolve.f.x(c5)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c6 = c5.c();
        return !(kotlin.reflect.jvm.internal.impl.resolve.f.C(c6) || kotlin.reflect.jvm.internal.impl.resolve.f.t(c6)) || ((u0Var instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) && kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) u0Var).h1()));
    }
}
