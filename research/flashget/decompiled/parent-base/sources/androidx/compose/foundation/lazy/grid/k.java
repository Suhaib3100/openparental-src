package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: LazyGridItemInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\t8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007\u0082\u0001\u0001\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k;", "", "", "getIndex", "()I", "index", "getKey", "()Ljava/lang/Object;", "key", "Landroidx/compose/ui/unit/q;", "b", "()J", "offset", "d", "row", "a", "column", "Landroidx/compose/ui/unit/u;", "c", "size", "getContentType", "contentType", "Landroidx/compose/foundation/lazy/grid/x;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f5720a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5718b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5719c = -1;

    /* compiled from: LazyGridItemInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k$a;", "", "<init>", "()V", "", "b", "I", "UnknownRow", "c", "UnknownColumn", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5720a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int UnknownRow = -1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int UnknownColumn = -1;

        private Companion() {
        }
    }

    int a();

    long b();

    long c();

    int d();

    @fg.m
    Object getContentType();

    int getIndex();

    @fg.l
    Object getKey();
}
