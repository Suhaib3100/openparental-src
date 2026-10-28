package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes7.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final List<c> f75914b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l List<? extends c> list) {
        l0.p(list, ProtectedSandApp.s("欁\u0001"));
        this.f75914b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f75914b.isEmpty();
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<c> iterator() {
        return this.f75914b.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @fg.m
    public c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    @fg.l
    public String toString() {
        return this.f75914b.toString();
    }
}
