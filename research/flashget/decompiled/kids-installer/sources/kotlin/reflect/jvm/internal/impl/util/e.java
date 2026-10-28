package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KClass;

/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes6.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private c<T> f26580o;

    protected e(@d5.d c<T> cVar) {
        l0.p(cVar, ProtectedSandApp.s("裡"));
        this.f26580o = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @d5.d
    protected final c<T> b() {
        return this.f26580o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.a
    protected final void g(@d5.d KClass<? extends K> kClass, @d5.d T t5) {
        l0.p(kClass, ProtectedSandApp.s("裢"));
        l0.p(t5, ProtectedSandApp.s("裣"));
        int d6 = f().d(kClass);
        int b6 = this.f26580o.b();
        if (b6 == 0) {
            this.f26580o = new o(t5, d6);
            return;
        }
        if (b6 == 1) {
            c<T> cVar = this.f26580o;
            l0.n(cVar, ProtectedSandApp.s("裤"));
            o oVar = (o) cVar;
            if (oVar.g() == d6) {
                this.f26580o = new o(t5, d6);
                return;
            } else {
                d dVar = new d();
                this.f26580o = dVar;
                dVar.f(oVar.g(), oVar.h());
            }
        }
        this.f26580o.f(d6, t5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.util.i r0 = kotlin.reflect.jvm.internal.impl.util.i.f26593o
            java.lang.String r1 = "裠"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.n(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.e.<init>():void");
    }
}
