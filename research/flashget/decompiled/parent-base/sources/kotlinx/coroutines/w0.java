package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.z0;

/* compiled from: DebugStrings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlin/coroutines/d;", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes7.dex */
public final class w0 {
    @fg.l
    public static final String a(@fg.l Object obj) {
        return obj.getClass().getSimpleName();
    }

    @fg.l
    public static final String b(@fg.l Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @fg.l
    public static final String c(@fg.l kotlin.coroutines.d<?> dVar) {
        Object a5;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            return dVar.toString();
        }
        try {
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            a5 = kotlin.a1.a(th);
        }
        if (kotlin.z0.e(a5) != null) {
            a5 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) a5;
    }
}
