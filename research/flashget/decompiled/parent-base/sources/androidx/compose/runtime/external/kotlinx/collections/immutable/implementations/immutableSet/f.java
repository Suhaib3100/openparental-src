package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentHashSetIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0004J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/f;", "E", "", "<init>", "()V", "", "buffer", "", "index", "Lkotlin/k2;", "h", "([Ljava/lang/Object;I)V", "", "c", "()Z", "f", "d", "a", "()Ljava/lang/Object;", "g", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "b", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "[Ljava/lang/Object;", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<E> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16321c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    public f() {
        e.INSTANCE.getClass();
        this.buffer = e.f16317f.getBuffer();
    }

    public static void i(f fVar, Object[] objArr, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        fVar.buffer = objArr;
        fVar.index = i4;
    }

    public final E a() {
        d();
        return (E) this.buffer[this.index];
    }

    @l
    public final e<? extends E> b() {
        e();
        Object obj = this.buffer[this.index];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (e) obj;
    }

    public final boolean c() {
        return this.index < this.buffer.length;
    }

    public final boolean d() {
        return c() && !(this.buffer[this.index] instanceof e);
    }

    public final boolean e() {
        return c() && (this.buffer[this.index] instanceof e);
    }

    public final void f() {
        c();
        this.index++;
    }

    public final E g() {
        d();
        Object[] objArr = this.buffer;
        int i4 = this.index;
        this.index = i4 + 1;
        return (E) objArr[i4];
    }

    public final void h(@l Object[] buffer, int index) {
        this.buffer = buffer;
        this.index = index;
    }
}
