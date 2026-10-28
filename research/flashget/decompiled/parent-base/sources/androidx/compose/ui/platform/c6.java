package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: WeakCache.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/c6;", "T", "", "<init>", "()V", "Lkotlin/k2;", "a", "element", "d", "(Ljava/lang/Object;)V", "c", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/g;", "Ljava/lang/ref/Reference;", "Landroidx/compose/runtime/collection/g;", "values", "Ljava/lang/ref/ReferenceQueue;", "b", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class c6<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19790c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<Reference<T>> values = new androidx.compose.runtime.collection.g<>(new Reference[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.j0(poll);
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.values.getSize();
    }

    @fg.m
    public final T c() {
        a();
        while (this.values.V()) {
            T t4 = (T) ((Reference) androidx.compose.foundation.gestures.i.a(this.values, 1)).get();
            if (t4 != null) {
                return t4;
            }
        }
        return null;
    }

    public final void d(T element) {
        a();
        this.values.b(new WeakReference(element, this.referenceQueue));
    }
}
