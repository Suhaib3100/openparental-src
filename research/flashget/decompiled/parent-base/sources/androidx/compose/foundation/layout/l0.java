package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/l0;", "", "", "mainAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/foundation/layout/s1;", "items", "<init>", "(IILandroidx/compose/runtime/collection/g;)V", "a", "I", "c", "()I", "b", "Landroidx/compose/runtime/collection/g;", "()Landroidx/compose/runtime/collection/g;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5185d = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisTotalSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisTotalSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<s1> items;

    public l0(int i4, int i5, @fg.l androidx.compose.runtime.collection.g<s1> gVar) {
        this.mainAxisTotalSize = i4;
        this.crossAxisTotalSize = i5;
        this.items = gVar;
    }

    /* renamed from: a, reason: from getter */
    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<s1> b() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }
}
