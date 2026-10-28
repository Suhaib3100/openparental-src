package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/b5;", "", "<init>", "()V", "Li0/i;", "a", "()Li0/i;", "bounds", "b", "c", "Landroidx/compose/ui/graphics/b5$a;", "Landroidx/compose/ui/graphics/b5$b;", "Landroidx/compose/ui/graphics/b5$c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b5 {

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/b5$a;", "Landroidx/compose/ui/graphics/b5;", "Landroidx/compose/ui/graphics/g5;", "path", "<init>", "(Landroidx/compose/ui/graphics/g5;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/graphics/g5;", "b", "()Landroidx/compose/ui/graphics/g5;", "Li0/i;", "()Li0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends b5 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final g5 path;

        public a(@fg.l g5 g5Var) {
            super(null);
            this.path = g5Var;
        }

        @Override // androidx.compose.ui.graphics.b5
        @fg.l
        /* renamed from: a */
        public i0.i getRect() {
            return this.path.getBounds();
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final g5 getPath() {
            return this.path;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && kotlin.jvm.internal.l0.g(this.path, ((a) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/b5$b;", "Landroidx/compose/ui/graphics/b5;", "Li0/i;", "rect", "<init>", "(Li0/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Li0/i;", "b", "()Li0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends b5 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.i rect;

        public b(@fg.l i0.i iVar) {
            super(null);
            this.rect = iVar;
        }

        @Override // androidx.compose.ui.graphics.b5
        @fg.l
        /* renamed from: a, reason: from getter */
        public i0.i getRect() {
            return this.rect;
        }

        @fg.l
        public final i0.i b() {
            return this.rect;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && kotlin.jvm.internal.l0.g(this.rect, ((b) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/b5$c;", "Landroidx/compose/ui/graphics/b5;", "Li0/l;", "roundRect", "<init>", "(Li0/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Li0/l;", "b", "()Li0/l;", "Landroidx/compose/ui/graphics/g5;", "Landroidx/compose/ui/graphics/g5;", "c", "()Landroidx/compose/ui/graphics/g5;", "roundRectPath", "Li0/i;", "()Li0/i;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.m1
    @kotlin.jvm.internal.r1({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
    public static final class c extends b5 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.l roundRect;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final g5 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@fg.l i0.l lVar) {
            super(0 == true ? 1 : 0);
            boolean i4;
            g5 g5Var = null;
            this.roundRect = lVar;
            i4 = c5.i(lVar);
            if (!i4) {
                g5Var = a1.a();
                g5Var.r(lVar);
            }
            this.roundRectPath = g5Var;
        }

        @Override // androidx.compose.ui.graphics.b5
        @fg.l
        /* renamed from: a */
        public i0.i getRect() {
            return i0.m.g(this.roundRect);
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final i0.l getRoundRect() {
            return this.roundRect;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final g5 getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && kotlin.jvm.internal.l0.g(this.roundRect, ((c) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ b5(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    /* renamed from: a */
    public abstract i0.i getRect();

    private b5() {
    }
}
