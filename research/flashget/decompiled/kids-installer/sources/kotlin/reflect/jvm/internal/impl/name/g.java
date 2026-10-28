package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.text.Regex;
import p3.n;

/* compiled from: NameUtils.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final g f25603a = new g();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Regex f25604b = new Regex(ProtectedSandApp.s("亣"));

    private g() {
    }

    @d5.d
    @n
    public static final String a(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("交"));
        return f25604b.m(str, ProtectedSandApp.s("亥"));
    }
}
