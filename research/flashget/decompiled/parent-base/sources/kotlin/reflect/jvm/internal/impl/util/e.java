package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes7.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private c<T> f78588b;

    protected e(@fg.l c<T> cVar) {
        l0.p(cVar, ProtectedSandApp.s("緸\u0001"));
        this.f78588b = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @fg.l
    protected final c<T> b() {
        return this.f78588b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.a
    protected final void f(@fg.l String str, @fg.l T t4) {
        l0.p(str, ProtectedSandApp.s("緹\u0001"));
        l0.p(t4, ProtectedSandApp.s("緺\u0001"));
        int d5 = c().d(str);
        int b5 = this.f78588b.b();
        if (b5 == 0) {
            this.f78588b = new o(t4, d5);
            return;
        }
        if (b5 == 1) {
            c<T> cVar = this.f78588b;
            l0.n(cVar, ProtectedSandApp.s("緻\u0001"));
            o oVar = (o) cVar;
            if (oVar.f() == d5) {
                this.f78588b = new o(t4, d5);
                return;
            } else {
                d dVar = new d();
                this.f78588b = dVar;
                dVar.c(oVar.f(), oVar.h());
            }
        }
        this.f78588b.c(d5, t4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.util.i r0 = kotlin.reflect.jvm.internal.impl.util.i.f78601b
            java.lang.String r1 = "緷\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.n(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.e.<init>():void");
    }
}
