package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionLayout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020%0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010<R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0016\u0010A\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/text/selection/e0;", "", "Li0/f;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/u;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/q;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/u;ZLandroidx/compose/foundation/text/selection/q;Ljava/util/Comparator;Lkotlin/jvm/internal/w;)V", "", "slot", "Landroidx/compose/foundation/text/selection/f;", "xPositionDirection", "yPositionDirection", "i", "(ILandroidx/compose/foundation/text/selection/f;Landroidx/compose/foundation/text/selection/f;)I", "Landroidx/compose/foundation/text/selection/d0;", "b", "()Landroidx/compose/foundation/text/selection/d0;", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/p;", "a", "(JILandroidx/compose/foundation/text/selection/f;Landroidx/compose/foundation/text/selection/f;ILandroidx/compose/foundation/text/selection/f;Landroidx/compose/foundation/text/selection/f;ILandroidx/compose/ui/text/n0;)Landroidx/compose/foundation/text/selection/p;", "J", "d", "()J", "e", "c", "Landroidx/compose/ui/layout/u;", "()Landroidx/compose/ui/layout/u;", "Z", "h", "()Z", "Landroidx/compose/foundation/text/selection/q;", "f", "()Landroidx/compose/foundation/text/selection/q;", "Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "", "Ljava/util/Map;", "selectableIdToInfoListIndex", "", "Ljava/util/List;", "infoList", "I", "startSlot", "j", "endSlot", "k", "currentSlot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f7942l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long currentPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long previousHandlePosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.u containerCoordinates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final q previousSelection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Comparator<Long> selectableIdOrderingComparator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Long, Integer> selectableIdToInfoListIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<p> infoList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int startSlot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int endSlot;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7954a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7954a = iArr;
        }
    }

    public /* synthetic */ e0(long j4, long j5, androidx.compose.ui.layout.u uVar, boolean z4, q qVar, Comparator comparator, kotlin.jvm.internal.w wVar) {
        this(j4, j5, uVar, z4, qVar, comparator);
    }

    private final int i(int slot, f xPositionDirection, f yPositionDirection) {
        if (slot != -1) {
            return slot;
        }
        int i4 = a.f7954a[f0.f(xPositionDirection, yPositionDirection).ordinal()];
        if (i4 == 1) {
            return this.currentSlot - 1;
        }
        if (i4 == 2) {
            return this.currentSlot;
        }
        if (i4 == 3) {
            return slot;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public final p a(long selectableId, int rawStartHandleOffset, @fg.l f startXHandleDirection, @fg.l f startYHandleDirection, int rawEndHandleOffset, @fg.l f endXHandleDirection, @fg.l f endYHandleDirection, int rawPreviousHandleOffset, @fg.l androidx.compose.ui.text.n0 textLayoutResult) {
        this.currentSlot += 2;
        p pVar = new p(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = i(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = i(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.put(Long.valueOf(selectableId), Integer.valueOf(this.infoList.size()));
        this.infoList.add(pVar);
        return pVar;
    }

    @fg.l
    public final d0 b() {
        int i4 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size == 1) {
            p pVar = (p) kotlin.collections.w.h5(this.infoList);
            int i5 = this.startSlot;
            int i6 = i5 == -1 ? i4 : i5;
            int i7 = this.endSlot;
            return new q0(this.isStartHandle, i6, i7 == -1 ? i4 : i7, this.previousSelection, pVar);
        }
        Map<Long, Integer> map = this.selectableIdToInfoListIndex;
        List<p> list = this.infoList;
        int i10 = this.startSlot;
        int i11 = i10 == -1 ? i4 : i10;
        int i12 = this.endSlot;
        return new k(map, list, i11, i12 == -1 ? i4 : i12, this.isStartHandle, this.previousSelection);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.layout.u getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: d, reason: from getter */
    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: e, reason: from getter */
    public final long getPreviousHandlePosition() {
        return this.previousHandlePosition;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final q getPreviousSelection() {
        return this.previousSelection;
    }

    @fg.l
    public final Comparator<Long> g() {
        return this.selectableIdOrderingComparator;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    private e0(long j4, long j5, androidx.compose.ui.layout.u uVar, boolean z4, q qVar, Comparator<Long> comparator) {
        this.currentPosition = j4;
        this.previousHandlePosition = j5;
        this.containerCoordinates = uVar;
        this.isStartHandle = z4;
        this.previousSelection = qVar;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = new LinkedHashMap();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }
}
