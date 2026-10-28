package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes6.dex */
final class c implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24831o;

    public c(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("薍"));
        this.f24831o = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("薎"));
        if (l0.g(cVar, this.f24831o)) {
            return b.f24830a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        EmptyList.f23167o.getClass();
        return EmptyIterator.f23163o;
    }
}
