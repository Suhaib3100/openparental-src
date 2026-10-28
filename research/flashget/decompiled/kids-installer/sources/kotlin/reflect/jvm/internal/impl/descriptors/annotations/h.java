package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes6.dex */
public final class h implements g {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final List<c> f24117o;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@d5.d List<? extends c> list) {
        l0.p(list, ProtectedSandApp.s("脊"));
        this.f24117o = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    public c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f24117o.isEmpty();
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<c> iterator() {
        return this.f24117o.iterator();
    }

    @d5.d
    public String toString() {
        return this.f24117o.toString();
    }
}
