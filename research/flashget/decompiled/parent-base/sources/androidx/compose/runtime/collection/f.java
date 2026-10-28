package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: ActualIntMap.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/collection/f;", "E", "", "Landroid/util/SparseArray;", "sparseArray", "<init>", "(Landroid/util/SparseArray;)V", "", "initialCapacity", "(I)V", "key", "", "b", "(I)Z", "c", "(I)Ljava/lang/Object;", "valueIfAbsent", "d", "(ILjava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "g", "(ILjava/lang/Object;)V", "f", "a", "()V", "Landroid/util/SparseArray;", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<E> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16130b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final SparseArray<E> sparseArray;

    private f(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public final void a() {
        this.sparseArray.clear();
    }

    public final boolean b(int key) {
        return this.sparseArray.indexOfKey(key) >= 0;
    }

    @m
    public final E c(int key) {
        return this.sparseArray.get(key);
    }

    public final E d(int key, E valueIfAbsent) {
        return this.sparseArray.get(key, valueIfAbsent);
    }

    public final int e() {
        return this.sparseArray.size();
    }

    public final void f(int key) {
        this.sparseArray.remove(key);
    }

    public final void g(int key, E value) {
        this.sparseArray.put(key, value);
    }

    public f(int i4) {
        this(new SparseArray(i4));
    }

    public /* synthetic */ f(int i4, int i5, w wVar) {
        this((i5 & 1) != 0 ? 10 : i4);
    }
}
