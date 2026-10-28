package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.d0;
import kotlin.reflect.s;

/* compiled from: KTypes.kt */
@kd.i(name = "KTypes")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/reflect/s;", "", "nullable", "c", "(Lkotlin/reflect/s;Z)Lkotlin/reflect/s;", "other", "a", "(Lkotlin/reflect/s;Lkotlin/reflect/s;)Z", "b", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {
    @c1(version = "1.1")
    public static final boolean a(@l s sVar, @l s sVar2) {
        l0.p(sVar, ProtectedSandApp.s("晎\u0001"));
        l0.p(sVar2, ProtectedSandApp.s("晏\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(((d0) sVar).getType(), ((d0) sVar2).getType());
    }

    @c1(version = "1.1")
    public static final boolean b(@l s sVar, @l s sVar2) {
        l0.p(sVar, ProtectedSandApp.s("晎\u0001"));
        l0.p(sVar2, ProtectedSandApp.s("晏\u0001"));
        return a(sVar2, sVar);
    }

    @l
    @c1(version = "1.1")
    public static final s c(@l s sVar, boolean z4) {
        l0.p(sVar, ProtectedSandApp.s("晎\u0001"));
        return ((d0) sVar).o(z4);
    }
}
