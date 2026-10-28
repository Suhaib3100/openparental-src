package c4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* compiled from: readPackageFragment.kt */
/* loaded from: classes5.dex */
public final class c {
    @d
    public static final Pair<a.m, a> a(@d InputStream inputStream) {
        a.m mVar;
        l0.p(inputStream, ProtectedSandApp.s("㎤"));
        try {
            a a6 = a.f10673g.a(inputStream);
            if (a6.h()) {
                f d6 = f.d();
                b.a(d6);
                mVar = a.m.W(inputStream, d6);
            } else {
                mVar = null;
            }
            Pair<a.m, a> pair = new Pair<>(mVar, a6);
            kotlin.io.b.a(inputStream, null);
            return pair;
        } finally {
        }
    }
}
