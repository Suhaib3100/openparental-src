package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Visibility.kt */
/* loaded from: classes5.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f24351a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24352b;

    protected o1(@d5.d String str, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("䟽"));
        this.f24351a = str;
        this.f24352b = z5;
    }

    @d5.e
    public Integer a(@d5.d o1 o1Var) {
        kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("䟾"));
        return n1.f24339a.a(this, o1Var);
    }

    @d5.d
    public String b() {
        return this.f24351a;
    }

    public final boolean c() {
        return this.f24352b;
    }

    @d5.d
    public o1 d() {
        return this;
    }

    @d5.d
    public final String toString() {
        return b();
    }
}
