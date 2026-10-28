package androidx.compose.foundation.text;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R(\u0010,\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/z0;", "", "Landroidx/compose/foundation/gestures/j0;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/j0;F)V", "()V", "orientation", "Li0/i;", "cursorRect", "", "containerSize", "textFieldSize", "Lkotlin/k2;", "l", "(Landroidx/compose/foundation/gestures/j0;Li0/i;II)V", "cursorStart", "cursorEnd", "b", "(FFI)V", "Landroidx/compose/ui/text/t0;", "selection", "e", "(J)I", "<set-?>", "a", "Landroidx/compose/runtime/h2;", "d", "()F", "i", "(F)V", "offset", "c", "h", "maximum", "Li0/i;", "previousCursorRect", "J", "g", "()J", "k", "(J)V", "previousSelection", "Landroidx/compose/runtime/k2;", "f", "()Landroidx/compose/foundation/gestures/j0;", "j", "(Landroidx/compose/foundation/gestures/j0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n76#2:372\n109#2,2:373\n76#2:375\n109#2,2:376\n81#3:378\n107#3,2:379\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:372\n254#1:373,2\n260#1:375\n260#1:376,2\n275#1:378\n275#1:379,2\n*E\n"})
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8337g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 offset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 maximum;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private i0.i previousCursorRect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 orientation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<z0, Object> f8338h = androidx.compose.runtime.saveable.a.a(a.f8344b, b.f8345b);

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/text/z0;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/text/z0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, z0, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8344b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l z0 z0Var) {
            return kotlin.collections.w.O(Float.valueOf(z0Var.d()), Boolean.valueOf(z0Var.f() == androidx.compose.foundation.gestures.j0.Vertical));
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "restored", "Landroidx/compose/foundation/text/z0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/text/z0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Object>, z0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8345b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(@fg.l List<? extends Object> list) {
            Object obj = list.get(1);
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
            androidx.compose.foundation.gestures.j0 j0Var = ((Boolean) obj).booleanValue() ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new z0(j0Var, ((Float) obj2).floatValue());
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/z0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text/z0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.z0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<z0, Object> a() {
            return z0.f8338h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public z0(@fg.l androidx.compose.foundation.gestures.j0 j0Var, float f4) {
        this.offset = androidx.compose.runtime.b.b(f4);
        this.maximum = androidx.compose.runtime.b.b(0.0f);
        i0.i.INSTANCE.getClass();
        this.previousCursorRect = i0.i.f74153g;
        androidx.compose.ui.text.t0.INSTANCE.getClass();
        this.previousSelection = androidx.compose.ui.text.t0.f21417c;
        this.orientation = androidx.compose.runtime.b.e(j0Var, o4.x());
    }

    private final void h(float f4) {
        this.maximum.E(f4);
    }

    public final void b(float cursorStart, float cursorEnd, int containerSize) {
        float b5 = this.offset.b();
        float f4 = containerSize;
        float f5 = b5 + f4;
        i(this.offset.b() + ((cursorEnd <= f5 && (cursorStart >= b5 || cursorEnd - cursorStart <= f4)) ? (cursorStart >= b5 || cursorEnd - cursorStart > f4) ? 0.0f : cursorStart - b5 : cursorEnd - f5));
    }

    public final float c() {
        return this.maximum.b();
    }

    public final float d() {
        return this.offset.b();
    }

    public final int e(long selection) {
        int n4 = androidx.compose.ui.text.t0.n(selection);
        long j4 = this.previousSelection;
        if (n4 != ((int) (j4 >> 32))) {
            return (int) (selection >> 32);
        }
        int i4 = (int) (selection & 4294967295L);
        return i4 != ((int) (j4 & 4294967295L)) ? i4 : androidx.compose.ui.text.t0.l(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final androidx.compose.foundation.gestures.j0 f() {
        return (androidx.compose.foundation.gestures.j0) this.orientation.getValue();
    }

    /* renamed from: g, reason: from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    public final void i(float f4) {
        this.offset.E(f4);
    }

    public final void j(@fg.l androidx.compose.foundation.gestures.j0 j0Var) {
        this.orientation.setValue(j0Var);
    }

    public final void k(long j4) {
        this.previousSelection = j4;
    }

    public final void l(@fg.l androidx.compose.foundation.gestures.j0 orientation, @fg.l i0.i cursorRect, int containerSize, int textFieldSize) {
        float f4 = textFieldSize - containerSize;
        h(f4);
        if (cursorRect.t() != this.previousCursorRect.t() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z4 = orientation == androidx.compose.foundation.gestures.j0.Vertical;
            b(z4 ? cursorRect.getTop() : cursorRect.t(), z4 ? cursorRect.j() : cursorRect.x(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        i(kotlin.ranges.s.H(this.offset.b(), 0.0f, f4));
    }

    public /* synthetic */ z0(androidx.compose.foundation.gestures.j0 j0Var, float f4, int i4, kotlin.jvm.internal.w wVar) {
        this(j0Var, (i4 & 2) != 0 ? 0.0f : f4);
    }

    public z0() {
        this(androidx.compose.foundation.gestures.j0.Vertical, 0.0f, 2, null);
    }
}
