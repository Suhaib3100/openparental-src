package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.k;
import androidx.compose.ui.layout.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001\u001fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J=\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0014\u001a\u00020\u000f2\u0019\u0010\u001e\u001a\u0015\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b¢\u0006\u0002\b\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/l;", "Landroidx/compose/ui/modifier/l;", "Landroidx/compose/ui/layout/c;", "Landroidx/compose/foundation/lazy/layout/n;", "state", "Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/foundation/gestures/j0;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/n;Landroidx/compose/foundation/lazy/layout/k;ZLandroidx/compose/ui/unit/w;Landroidx/compose/foundation/gestures/j0;)V", "Landroidx/compose/ui/layout/c$b;", "h", "(I)Z", "Landroidx/compose/foundation/lazy/layout/k$a;", "currentInterval", "direction", "d", "(Landroidx/compose/foundation/lazy/layout/k$a;I)Landroidx/compose/foundation/lazy/layout/k$a;", "g", "(Landroidx/compose/foundation/lazy/layout/k$a;I)Z", "i", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/c$a;", "Lkotlin/u;", "block", "b", "(ILld/l;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/n;", "c", "Landroidx/compose/foundation/lazy/layout/k;", "Z", "e", "Landroidx/compose/ui/unit/w;", "f", "Landroidx/compose/foundation/gestures/j0;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "()Landroidx/compose/ui/layout/c;", "value", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements androidx.compose.ui.modifier.l<androidx.compose.ui.layout.c>, androidx.compose.ui.layout.c {

    /* renamed from: h, reason: collision with root package name */
    public static final int f6085h = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k beyondBoundsInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.j0 orientation;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final a f6086i = new a();

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/layout/l$a", "Landroidx/compose/ui/layout/c$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements c.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        a() {
        }

        @Override // androidx.compose.ui.layout.c.a
        /* renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6093a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6093a = iArr;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/layout/l$d", "Landroidx/compose/ui/layout/c$a;", "", "a", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements c.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<k.a> f6095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6096c;

        d(k1.h<k.a> hVar, int i4) {
            this.f6095b = hVar;
            this.f6096c = i4;
        }

        @Override // androidx.compose.ui.layout.c.a
        /* renamed from: a */
        public boolean getHasMoreContent() {
            return l.this.g(this.f6095b.f75329b, this.f6096c);
        }
    }

    public l(@fg.l n nVar, @fg.l k kVar, boolean z4, @fg.l androidx.compose.ui.unit.w wVar, @fg.l androidx.compose.foundation.gestures.j0 j0Var) {
        this.state = nVar;
        this.beyondBoundsInfo = kVar;
        this.reverseLayout = z4;
        this.layoutDirection = wVar;
        this.orientation = j0Var;
    }

    private final k.a d(k.a currentInterval, int direction) {
        int f4 = currentInterval.f();
        int e4 = currentInterval.e();
        if (h(direction)) {
            e4++;
        } else {
            f4--;
        }
        return this.beyondBoundsInfo.a(f4, e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(k.a aVar, int i4) {
        if (i(i4)) {
            return false;
        }
        if (h(i4)) {
            if (aVar.e() >= this.state.b() - 1) {
                return false;
            }
        } else if (aVar.f() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean h(int i4) {
        c.b.Companion companion = c.b.INSTANCE;
        companion.getClass();
        if (c.b.j(i4, c.b.f18921c)) {
            return false;
        }
        companion.getClass();
        if (!c.b.j(i4, c.b.f18922d)) {
            companion.getClass();
            if (c.b.j(i4, c.b.f18925g)) {
                return this.reverseLayout;
            }
            companion.getClass();
            if (!c.b.j(i4, c.b.f18926h)) {
                companion.getClass();
                if (c.b.j(i4, c.b.f18923e)) {
                    int i5 = c.f6093a[this.layoutDirection.ordinal()];
                    if (i5 == 1) {
                        return this.reverseLayout;
                    }
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.reverseLayout) {
                        return false;
                    }
                } else {
                    companion.getClass();
                    if (!c.b.j(i4, c.b.f18924f)) {
                        m.c();
                        throw new KotlinNothingValueException();
                    }
                    int i6 = c.f6093a[this.layoutDirection.ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            return this.reverseLayout;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.reverseLayout) {
                        return false;
                    }
                }
            } else if (this.reverseLayout) {
                return false;
            }
        }
        return true;
    }

    private final boolean i(int i4) {
        boolean j4;
        boolean j5;
        c.b.Companion companion = c.b.INSTANCE;
        companion.getClass();
        boolean z4 = true;
        if (c.b.j(i4, c.b.f18925g)) {
            j4 = true;
        } else {
            companion.getClass();
            j4 = c.b.j(i4, c.b.f18926h);
        }
        if (!j4) {
            companion.getClass();
            if (c.b.j(i4, c.b.f18923e)) {
                j5 = true;
            } else {
                companion.getClass();
                j5 = c.b.j(i4, c.b.f18924f);
            }
            if (!j5) {
                companion.getClass();
                if (!c.b.j(i4, c.b.f18921c)) {
                    companion.getClass();
                    z4 = c.b.j(i4, c.b.f18922d);
                }
                if (!z4) {
                    m.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == androidx.compose.foundation.gestures.j0.Vertical) {
                return true;
            }
        } else if (this.orientation == androidx.compose.foundation.gestures.j0.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.c
    @fg.m
    public <T> T b(int direction, @fg.l ld.l<? super c.a, ? extends T> block) {
        if (this.state.b() <= 0 || !this.state.c()) {
            return block.invoke(f6086i);
        }
        int e4 = h(direction) ? this.state.e() : this.state.d();
        k1.h hVar = new k1.h();
        hVar.f75329b = (T) this.beyondBoundsInfo.a(e4, e4);
        T t4 = null;
        while (t4 == null && g((k.a) hVar.f75329b, direction)) {
            T t5 = (T) d((k.a) hVar.f75329b, direction);
            this.beyondBoundsInfo.e((k.a) hVar.f75329b);
            hVar.f75329b = t5;
            this.state.a();
            t4 = block.invoke(new d(hVar, direction));
        }
        this.beyondBoundsInfo.e((k.a) hVar.f75329b);
        this.state.a();
        return t4;
    }

    @fg.l
    public androidx.compose.ui.layout.c e() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.l
    @fg.l
    public androidx.compose.ui.modifier.p<androidx.compose.ui.layout.c> getKey() {
        return androidx.compose.ui.layout.d.a();
    }

    @Override // androidx.compose.ui.modifier.l
    public androidx.compose.ui.layout.c getValue() {
        return this;
    }
}
