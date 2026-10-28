package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMap.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "V", "", "value", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "h", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "newPrevious", "g", "newNext", "f", "a", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "b", "d", "c", "", "()Z", "hasNext", "hasPrevious", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16329d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object previous;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object next;

    public a(V v4, @fg.m Object obj, @fg.m Object obj2) {
        this.value = v4;
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean a() {
        return this.next != f0.c.f73848a;
    }

    public final boolean b() {
        return this.previous != f0.c.f73848a;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final Object getPrevious() {
        return this.previous;
    }

    public final V e() {
        return this.value;
    }

    @fg.l
    public final a<V> f(@fg.m Object newNext) {
        return new a<>(this.value, this.previous, newNext);
    }

    @fg.l
    public final a<V> g(@fg.m Object newPrevious) {
        return new a<>(this.value, newPrevious, this.next);
    }

    @fg.l
    public final a<V> h(V newValue) {
        return new a<>(newValue, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(V r2) {
        /*
            r1 = this;
            f0.c r0 = f0.c.f73848a
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a.<init>(java.lang.Object):void");
    }

    public a(V v4, @fg.m Object obj) {
        this(v4, obj, f0.c.f73848a);
    }
}
