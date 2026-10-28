package androidx.compose.material3;

import androidx.compose.material3.u6;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: MenuPosition.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/vb;", "", "<init>", "()V", "a", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final vb f15208a = new vb();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15209b = 0;

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/material3/vb$a;", "Landroidx/compose/material3/u6$a;", "Landroidx/compose/ui/c$b;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/c$b;I)V", "b", "()Landroidx/compose/ui/c$b;", "c", "()I", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "menuWidth", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(Landroidx/compose/ui/unit/s;JILandroidx/compose/ui/unit/w;)I", "d", "(Landroidx/compose/ui/c$b;I)Landroidx/compose/material3/vb$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/c$b;", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a implements u6.a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f15210c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c.b alignment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int margin;

        public a(@fg.l c.b bVar, int i4) {
            this.alignment = bVar;
            this.margin = i4;
        }

        /* renamed from: b, reason: from getter */
        private final c.b getAlignment() {
            return this.alignment;
        }

        /* renamed from: c, reason: from getter */
        private final int getMargin() {
            return this.margin;
        }

        public static a e(a aVar, c.b bVar, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                bVar = aVar.alignment;
            }
            if ((i5 & 2) != 0) {
                i4 = aVar.margin;
            }
            aVar.getClass();
            return new a(bVar, i4);
        }

        @Override // androidx.compose.material3.u6.a
        public int a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, int menuWidth, @fg.l androidx.compose.ui.unit.w layoutDirection) {
            if (menuWidth >= androidx.compose.ui.unit.u.m(windowSize) - (this.margin * 2)) {
                return androidx.compose.ui.c.INSTANCE.m().a(menuWidth, (int) (windowSize >> 32), layoutDirection);
            }
            int i4 = (int) (windowSize >> 32);
            int a5 = this.alignment.a(menuWidth, i4, layoutDirection);
            int i5 = this.margin;
            return kotlin.ranges.s.I(a5, i5, (i4 - i5) - menuWidth);
        }

        @fg.l
        public final a d(@fg.l c.b alignment, int margin) {
            return new a(alignment, margin);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.l0.g(this.alignment, aVar.alignment) && this.margin == aVar.margin;
        }

        public int hashCode() {
            return Integer.hashCode(this.margin) + (this.alignment.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            return androidx.view.e.a(sb, this.margin, ')');
        }
    }

    /* compiled from: MenuPosition.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/vb$b;", "Landroidx/compose/material3/u6$b;", "Landroidx/compose/ui/c$c;", "alignment", "", "margin", "<init>", "(Landroidx/compose/ui/c$c;I)V", "b", "()Landroidx/compose/ui/c$c;", "c", "()I", "Landroidx/compose/ui/unit/s;", "anchorBounds", "Landroidx/compose/ui/unit/u;", "windowSize", "menuHeight", "a", "(Landroidx/compose/ui/unit/s;JI)I", "d", "(Landroidx/compose/ui/c$c;I)Landroidx/compose/material3/vb$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/c$c;", "I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements u6.b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f15213c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c.InterfaceC0326c alignment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int margin;

        public b(@fg.l c.InterfaceC0326c interfaceC0326c, int i4) {
            this.alignment = interfaceC0326c;
            this.margin = i4;
        }

        /* renamed from: b, reason: from getter */
        private final c.InterfaceC0326c getAlignment() {
            return this.alignment;
        }

        /* renamed from: c, reason: from getter */
        private final int getMargin() {
            return this.margin;
        }

        public static b e(b bVar, c.InterfaceC0326c interfaceC0326c, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                interfaceC0326c = bVar.alignment;
            }
            if ((i5 & 2) != 0) {
                i4 = bVar.margin;
            }
            bVar.getClass();
            return new b(interfaceC0326c, i4);
        }

        @Override // androidx.compose.material3.u6.b
        public int a(@fg.l androidx.compose.ui.unit.s anchorBounds, long windowSize, int menuHeight) {
            if (menuHeight >= androidx.compose.ui.unit.u.j(windowSize) - (this.margin * 2)) {
                return androidx.compose.ui.c.INSTANCE.q().a(menuHeight, (int) (windowSize & 4294967295L));
            }
            int i4 = (int) (windowSize & 4294967295L);
            int a5 = this.alignment.a(menuHeight, i4);
            int i5 = this.margin;
            return kotlin.ranges.s.I(a5, i5, (i4 - i5) - menuHeight);
        }

        @fg.l
        public final b d(@fg.l c.InterfaceC0326c alignment, int margin) {
            return new b(alignment, margin);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.alignment, bVar.alignment) && this.margin == bVar.margin;
        }

        public int hashCode() {
            return Integer.hashCode(this.margin) + (this.alignment.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Vertical(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            return androidx.view.e.a(sb, this.margin, ')');
        }
    }

    private vb() {
    }
}
