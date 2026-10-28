package fe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: addToStdlib.kt */
@r1({"SMAP\naddToStdlib.kt\nKotlin\n*S Kotlin\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n20#1,2:353\n289#1,16:359\n327#1,13:375\n3792#2:355\n4307#2,2:356\n1#3:358\n*S KotlinDebug\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n66#1:353,2\n281#1:359,16\n343#1:375,13\n132#1:355\n132#1:356,2\n*E\n"})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final ConcurrentHashMap<ld.a<?>, Object> f73887a = new ConcurrentHashMap<>();

    @l
    public static final Void a(@l String str) {
        l0.p(str, ProtectedSandApp.s("恋\u0001"));
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void b(String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("恌\u0001");
        }
        return a(str);
    }
}
