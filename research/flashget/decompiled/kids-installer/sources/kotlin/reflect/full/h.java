package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperties.kt */
@p3.i(name = "KProperties")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\u0007\u001a1\u0010\u0006\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/q;", "", "a", "D", "Lkotlin/reflect/r;", "receiver", "b", "(Lkotlin/reflect/r;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class h {
    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Object a(@d5.d KProperty1<?, ?> kProperty1) {
        l0.p(kProperty1, ProtectedSandApp.s("䌮"));
        z.INSTANCE.getClass();
        return kProperty1.D(z.f26842z);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final <D> Object b(@d5.d KProperty2<D, ?, ?> kProperty2, D d6) {
        l0.p(kProperty2, ProtectedSandApp.s("䌯"));
        z.INSTANCE.getClass();
        return kProperty2.r0(d6, z.f26842z);
    }
}
