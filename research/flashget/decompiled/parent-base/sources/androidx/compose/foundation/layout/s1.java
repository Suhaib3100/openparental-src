package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: RowColumnMeasurementHelper.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/s1;", "", "", "crossAxisSize", "mainAxisSize", "startIndex", "endIndex", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "<init>", "(IIIII[I)V", "a", "I", "b", "()I", "e", "c", "f", "d", "[I", "()[I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f5312g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int beforeCrossAxisAlignmentLine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] mainAxisPositions;

    public s1(int i4, int i5, int i6, int i7, int i10, @fg.l int[] iArr) {
        this.crossAxisSize = i4;
        this.mainAxisSize = i5;
        this.startIndex = i6;
        this.endIndex = i7;
        this.beforeCrossAxisAlignmentLine = i10;
        this.mainAxisPositions = iArr;
    }

    /* renamed from: a, reason: from getter */
    public final int getBeforeCrossAxisAlignmentLine() {
        return this.beforeCrossAxisAlignmentLine;
    }

    /* renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: c, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final int[] getMainAxisPositions() {
        return this.mainAxisPositions;
    }

    /* renamed from: e, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: f, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }
}
