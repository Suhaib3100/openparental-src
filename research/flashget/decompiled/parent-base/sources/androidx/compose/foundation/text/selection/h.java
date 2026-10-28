package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/h;", "Landroidx/compose/ui/window/o;", "Landroidx/compose/foundation/text/selection/i;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/n;", "positionProvider", "<init>", "(Landroidx/compose/foundation/text/selection/i;Landroidx/compose/foundation/text/selection/n;)V", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/s;JLandroidx/compose/ui/unit/w;J)J", "Landroidx/compose/foundation/text/selection/i;", "b", "Landroidx/compose/foundation/text/selection/n;", "Li0/f;", "c", "J", "prevPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,327:1\n265#2:328\n179#3:329\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n276#1:328\n287#1:329\n*E\n"})
/* loaded from: classes.dex */
public final class h implements androidx.compose.ui.window.o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7981d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i handleReferencePoint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n positionProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long prevPosition;

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7985a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.TopMiddle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7985a = iArr;
        }
    }

    public h(@fg.l i iVar, @fg.l n nVar) {
        this.handleReferencePoint = iVar;
        this.positionProvider = nVar;
        i0.f.INSTANCE.getClass();
        this.prevPosition = i0.f.f74147c;
    }

    @Override // androidx.compose.ui.window.o
    public long a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, @fg.l androidx.compose.ui.unit.w layoutDirection, long popupContentSize) {
        int i4;
        long a5 = this.positionProvider.a();
        if (!i0.g.d(a5)) {
            a5 = this.prevPosition;
        }
        this.prevPosition = a5;
        int i5 = a.f7985a[this.handleReferencePoint.ordinal()];
        if (i5 == 1) {
            i4 = 0;
        } else if (i5 == 2) {
            i4 = androidx.compose.ui.unit.u.m(popupContentSize) / 2;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = androidx.compose.ui.unit.u.m(popupContentSize);
        }
        long a6 = androidx.compose.ui.unit.r.a(kotlin.math.b.L0(i0.f.p(a5)), kotlin.math.b.L0(i0.f.r(a5)));
        return androidx.compose.ui.unit.r.a((androidx.compose.ui.unit.q.m(a6) + anchorBounds.t()) - i4, anchorBounds.getTop() + ((int) (a6 & 4294967295L)));
    }
}
