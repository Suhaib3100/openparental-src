package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes5.dex */
public class k<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final n<T> f25043a;

    /* renamed from: b, reason: collision with root package name */
    private int f25044b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private T f25045c;

    public void a() {
    }

    public void b() {
        if (this.f25045c == null) {
            this.f25044b++;
        }
    }

    public void c(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("䲕"));
        d(t5);
    }

    protected final void d(@d5.d T t5) {
        String e22;
        l0.p(t5, ProtectedSandApp.s("䲖"));
        if (this.f25045c == null) {
            if (this.f25044b > 0) {
                n<T> nVar = this.f25043a;
                StringBuilder sb = new StringBuilder();
                e22 = e0.e2(ProtectedSandApp.s("䲗"), this.f25044b);
                sb.append(e22);
                sb.append(this.f25043a.a(t5));
                t5 = nVar.b(sb.toString());
            }
            this.f25045c = t5;
        }
    }

    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d T t5) {
        l0.p(fVar, ProtectedSandApp.s("䲘"));
        l0.p(t5, ProtectedSandApp.s("䲙"));
        d(t5);
    }
}
