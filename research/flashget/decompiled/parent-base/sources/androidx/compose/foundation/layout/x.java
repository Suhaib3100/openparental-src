package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00132\u00020\u0001:\u0007\u0013\u0014\u0015\u000b\r\u0010\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/x;", "", "<init>", "()V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "e", "(Landroidx/compose/ui/layout/i1;)Ljava/lang/Integer;", "", "f", "()Z", "isRelative", "a", "b", "c", "g", "Landroidx/compose/foundation/layout/x$a;", "Landroidx/compose/foundation/layout/x$b;", "Landroidx/compose/foundation/layout/x$d;", "Landroidx/compose/foundation/layout/x$e;", "Landroidx/compose/foundation/layout/x$f;", "Landroidx/compose/foundation/layout/x$g;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5394b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final x f5395c = b.f5399f;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final x f5396d = f.f5402f;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final x f5397e = d.f5400f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/x$a;", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/foundation/layout/f;", "alignmentLineProvider", "<init>", "(Landroidx/compose/foundation/layout/f;)V", "Landroidx/compose/ui/layout/i1;", "placeable", "", "e", "(Landroidx/compose/ui/layout/i1;)Ljava/lang/Integer;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "f", "Landroidx/compose/foundation/layout/f;", "g", "()Landroidx/compose/foundation/layout/f;", "", "()Z", "isRelative", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a extends x {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.foundation.layout.f alignmentLineProvider;

        public a(@fg.l androidx.compose.foundation.layout.f fVar) {
            super(null);
            this.alignmentLineProvider = fVar;
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            int a5 = this.alignmentLineProvider.a(placeable);
            if (a5 == Integer.MIN_VALUE) {
                return 0;
            }
            int i4 = beforeCrossAxisAlignmentLine - a5;
            return layoutDirection == androidx.compose.ui.unit.w.Rtl ? size - i4 : i4;
        }

        @Override // androidx.compose.foundation.layout.x
        @fg.l
        public Integer e(@fg.l androidx.compose.ui.layout.i1 placeable) {
            return Integer.valueOf(this.alignmentLineProvider.a(placeable));
        }

        @Override // androidx.compose.foundation.layout.x
        public boolean f() {
            return true;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final androidx.compose.foundation.layout.f getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/x$b;", "Landroidx/compose/foundation/layout/x;", "<init>", "()V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends x {

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        public static final b f5399f = new b(null);

        private b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            return size / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0018R \u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/x$c;", "", "<init>", "()V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/foundation/layout/x;", "a", "(Landroidx/compose/ui/layout/a;)Landroidx/compose/foundation/layout/x;", "Landroidx/compose/foundation/layout/f;", "alignmentLineProvider", "b", "(Landroidx/compose/foundation/layout/f;)Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/c$c;", "vertical", "j", "(Landroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/c$b;", "horizontal", "i", "(Landroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/x;", "Center", "Landroidx/compose/foundation/layout/x;", "c", "()Landroidx/compose/foundation/layout/x;", "d", "Start", "g", "h", "End", "e", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.x$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        @x4
        public static /* synthetic */ void h() {
        }

        @fg.l
        public final x a(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            return new a(new f.b(alignmentLine));
        }

        @fg.l
        public final x b(@fg.l androidx.compose.foundation.layout.f alignmentLineProvider) {
            return new a(alignmentLineProvider);
        }

        @fg.l
        public final x c() {
            return x.f5395c;
        }

        @fg.l
        public final x e() {
            return x.f5397e;
        }

        @fg.l
        public final x g() {
            return x.f5396d;
        }

        @fg.l
        public final x i(@fg.l c.b horizontal) {
            return new e(horizontal);
        }

        @fg.l
        public final x j(@fg.l c.InterfaceC0326c vertical) {
            return new g(vertical);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/x$d;", "Landroidx/compose/foundation/layout/x;", "<init>", "()V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d extends x {

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        public static final d f5400f = new d(null);

        private d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == androidx.compose.ui.unit.w.Ltr) {
                return size;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/x$e;", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/c$b;", "horizontal", "<init>", "(Landroidx/compose/ui/c$b;)V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "g", "()Landroidx/compose/ui/c$b;", "h", "(Landroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/x$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Landroidx/compose/ui/c$b;", "j", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class e extends x {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c.b horizontal;

        public e(@fg.l c.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        public static e i(e eVar, c.b bVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                bVar = eVar.horizontal;
            }
            eVar.getClass();
            return new e(bVar);
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(0, size, layoutDirection);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && kotlin.jvm.internal.l0.g(this.horizontal, ((e) other).horizontal);
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final c.b getHorizontal() {
            return this.horizontal;
        }

        @fg.l
        public final e h(@fg.l c.b horizontal) {
            return new e(horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        @fg.l
        public final c.b j() {
            return this.horizontal;
        }

        @fg.l
        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/x$f;", "Landroidx/compose/foundation/layout/x;", "<init>", "()V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class f extends x {

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        public static final f f5402f = new f(null);

        private f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == androidx.compose.ui.unit.w.Ltr) {
                return 0;
            }
            return size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/x$g;", "Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/c$c;", "vertical", "<init>", "(Landroidx/compose/ui/c$c;)V", "", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/layout/i1;", "placeable", "beforeCrossAxisAlignmentLine", "d", "(ILandroidx/compose/ui/unit/w;Landroidx/compose/ui/layout/i1;I)I", "g", "()Landroidx/compose/ui/c$c;", "h", "(Landroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/x$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Landroidx/compose/ui/c$c;", "j", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class g extends x {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c.InterfaceC0326c vertical;

        public g(@fg.l c.InterfaceC0326c interfaceC0326c) {
            super(null);
            this.vertical = interfaceC0326c;
        }

        public static g i(g gVar, c.InterfaceC0326c interfaceC0326c, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                interfaceC0326c = gVar.vertical;
            }
            gVar.getClass();
            return new g(interfaceC0326c);
        }

        @Override // androidx.compose.foundation.layout.x
        public int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(0, size);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && kotlin.jvm.internal.l0.g(this.vertical, ((g) other).vertical);
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final c.InterfaceC0326c getVertical() {
            return this.vertical;
        }

        @fg.l
        public final g h(@fg.l c.InterfaceC0326c vertical) {
            return new g(vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        @fg.l
        public final c.InterfaceC0326c j() {
            return this.vertical;
        }

        @fg.l
        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }
    }

    public /* synthetic */ x(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract int d(int size, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.layout.i1 placeable, int beforeCrossAxisAlignmentLine);

    @fg.m
    public Integer e(@fg.l androidx.compose.ui.layout.i1 placeable) {
        return null;
    }

    public boolean f() {
        return false;
    }

    private x() {
    }
}
