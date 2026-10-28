package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l0;

/* compiled from: Annotations.kt */
/* loaded from: classes6.dex */
public final class l implements g {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final g f24126o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f24127p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> f24128q;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@d5.d g gVar, boolean z5, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> lVar) {
        l0.p(gVar, ProtectedSandApp.s("脓"));
        l0.p(lVar, ProtectedSandApp.s("脔"));
        this.f24126o = gVar;
        this.f24127p = z5;
        this.f24128q = lVar;
    }

    private final boolean b(c cVar) {
        kotlin.reflect.jvm.internal.impl.name.c f6 = cVar.f();
        return f6 != null && this.f24128q.N(f6).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("脕"));
        if (this.f24128q.N(cVar).booleanValue()) {
            return this.f24126o.O0(cVar);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    public c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("脖"));
        if (this.f24128q.N(cVar).booleanValue()) {
            return this.f24126o.e(cVar);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        boolean z5;
        g gVar = this.f24126o;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator<c> it = gVar.iterator();
            while (it.hasNext()) {
                if (b(it.next())) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        return this.f24127p ? !z5 : z5;
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<c> iterator() {
        g gVar = this.f24126o;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (b(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@d5.d g gVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> lVar) {
        this(gVar, false, lVar);
        l0.p(gVar, ProtectedSandApp.s("脑"));
        l0.p(lVar, ProtectedSandApp.s("脒"));
    }
}
