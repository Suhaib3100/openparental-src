package androidx.compose.ui.window;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: Popup.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/window/a;", "Landroidx/compose/ui/window/o;", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/unit/q;", "offset", "<init>", "(Landroidx/compose/ui/c;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "popupContentSize", "a", "(Landroidx/compose/ui/unit/s;JLandroidx/compose/ui/unit/w;J)J", "Landroidx/compose/ui/c;", "b", "()Landroidx/compose/ui/c;", "J", "c", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,89:1\n92#2:90\n86#2:91\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n73#1:90\n83#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21632c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    public /* synthetic */ a(androidx.compose.ui.c cVar, long j4, w wVar) {
        this(cVar, j4);
    }

    @Override // androidx.compose.ui.window.o
    public long a(@fg.l s anchorBounds, long windowSize, @fg.l androidx.compose.ui.unit.w layoutDirection, long popupContentSize) {
        androidx.compose.ui.c cVar = this.alignment;
        u.Companion companion = androidx.compose.ui.unit.u.INSTANCE;
        companion.getClass();
        long a5 = cVar.a(androidx.compose.ui.unit.u.f21529c, anchorBounds.z(), layoutDirection);
        androidx.compose.ui.c cVar2 = this.alignment;
        companion.getClass();
        long a6 = cVar2.a(androidx.compose.ui.unit.u.f21529c, popupContentSize, layoutDirection);
        long a7 = androidx.compose.ui.unit.r.a(-androidx.compose.ui.unit.q.m(a6), -((int) (a6 & 4294967295L)));
        long j4 = this.offset;
        long a8 = androidx.compose.ui.unit.r.a(((int) (j4 >> 32)) * (layoutDirection == androidx.compose.ui.unit.w.Ltr ? 1 : -1), (int) (j4 & 4294967295L));
        long E = anchorBounds.E();
        long a10 = androidx.compose.ui.unit.r.a(((int) (E >> 32)) + ((int) (a5 >> 32)), ((int) (E & 4294967295L)) + ((int) (a5 & 4294967295L)));
        long a11 = androidx.compose.ui.unit.r.a(((int) (a10 >> 32)) + ((int) (a7 >> 32)), ((int) (a10 & 4294967295L)) + ((int) (a7 & 4294967295L)));
        return androidx.compose.ui.unit.r.a(((int) (a11 >> 32)) + ((int) (a8 >> 32)), ((int) (a11 & 4294967295L)) + ((int) (a8 & 4294967295L)));
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* renamed from: c, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    private a(androidx.compose.ui.c cVar, long j4) {
        this.alignment = cVar;
        this.offset = j4;
    }
}
