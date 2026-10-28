package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/collections/s0;", "T", "", "Lkotlin/collections/r0;", "Lkotlin/Function0;", "", "iteratorFactory", "<init>", "(Lld/a;)V", "iterator", "()Ljava/util/Iterator;", "b", "Lld/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s0<T> implements Iterable<r0<? extends T>>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Iterator<T>> iteratorFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@fg.l ld.a<? extends Iterator<? extends T>> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("成\u0001"));
        this.iteratorFactory = aVar;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<r0<T>> iterator() {
        return new t0(this.iteratorFactory.invoke());
    }
}
