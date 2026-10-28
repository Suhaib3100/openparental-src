package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.b0;

/* compiled from: KTypes.kt */
@p3.i(name = "KTypes")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/s;", "", "nullable", "c", "other", "a", "b", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class i {
    @SinceKotlin(version = "1.1")
    public static final boolean a(@d5.d KType kType, @d5.d KType kType2) {
        l0.p(kType, ProtectedSandApp.s("䌰"));
        l0.p(kType2, ProtectedSandApp.s("䌱"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.p(((b0) kType).getType(), ((b0) kType2).getType());
    }

    @SinceKotlin(version = "1.1")
    public static final boolean b(@d5.d KType kType, @d5.d KType kType2) {
        l0.p(kType, ProtectedSandApp.s("䌲"));
        l0.p(kType2, ProtectedSandApp.s("䌳"));
        return a(kType2, kType);
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final KType c(@d5.d KType kType, boolean z5) {
        l0.p(kType, ProtectedSandApp.s("䌴"));
        return ((b0) kType).z(z5);
    }
}
