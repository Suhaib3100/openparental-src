package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kd.n;
import kotlin.jvm.internal.l0;
import kotlin.text.r;

/* compiled from: NameUtils.kt */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final g f77585a = new g();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final r f77586b = new r(ProtectedSandApp.s("瘺\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final String f77587c = ProtectedSandApp.s("瘻\u0001");

    private g() {
    }

    @l
    @n
    public static final f a(int i4) {
        f f4 = f.f(f77587c + '_' + i4);
        l0.o(f4, ProtectedSandApp.s("瘼\u0001"));
        return f4;
    }

    @l
    @n
    public static final String b(@l String str) {
        l0.p(str, ProtectedSandApp.s("瘽\u0001"));
        return f77586b.m(str, ProtectedSandApp.s("瘾\u0001"));
    }
}
