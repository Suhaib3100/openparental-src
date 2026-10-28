package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes7.dex */
public class m<T> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final p<T> f76925a;

    /* renamed from: b, reason: collision with root package name */
    private int f76926b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private T f76927c;

    public void a() {
    }

    public void b() {
        if (this.f76927c == null) {
            this.f76926b++;
        }
    }

    public void c(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("璅\u0001"));
        d(t4);
    }

    protected final void d(@fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("璆\u0001"));
        if (this.f76927c == null) {
            if (this.f76926b > 0) {
                t4 = this.f76925a.a(kotlin.text.v.e2(ProtectedSandApp.s("璇\u0001"), this.f76926b) + this.f76925a.d(t4));
            }
            this.f76927c = t4;
        }
    }

    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l T t4) {
        l0.p(fVar, ProtectedSandApp.s("璈\u0001"));
        l0.p(t4, ProtectedSandApp.s("璆\u0001"));
        d(t4);
    }
}
