package xd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.InputStream;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* compiled from: readPackageFragment.kt */
@r1({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: classes8.dex */
public final class c {
    @l
    public static final q0<a.m, a> a(@l InputStream inputStream) {
        a.m mVar;
        l0.p(inputStream, ProtectedSandApp.s("ꍋ\u0001"));
        try {
            a a5 = a.f92951g.a(inputStream);
            if (a5.h()) {
                f d5 = f.d();
                b.a(d5);
                mVar = a.m.X(inputStream, d5);
            } else {
                mVar = null;
            }
            q0<a.m, a> q0Var = new q0<>(mVar, a5);
            kotlin.io.b.a(inputStream, null);
            return q0Var;
        } finally {
        }
    }
}
