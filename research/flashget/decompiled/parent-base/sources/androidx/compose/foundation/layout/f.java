package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/f;", "", "<init>", "()V", "Landroidx/compose/ui/layout/i1;", "placeable", "", "a", "(Landroidx/compose/ui/layout/i1;)I", "b", "Landroidx/compose/foundation/layout/f$a;", "Landroidx/compose/foundation/layout/f$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5007a = 0;

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/f$a;", "Landroidx/compose/foundation/layout/f;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/p0;", "", "lineProviderBlock", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/layout/i1;", "placeable", "a", "(Landroidx/compose/ui/layout/i1;)I", "b", "()Lld/l;", "c", "(Lld/l;)Landroidx/compose/foundation/layout/f$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lld/l;", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5008c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.l<androidx.compose.ui.layout.p0, Integer> lineProviderBlock;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar) {
            super(null);
            this.lineProviderBlock = lVar;
        }

        public static a d(a aVar, ld.l lVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                lVar = aVar.lineProviderBlock;
            }
            aVar.getClass();
            return new a(lVar);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(@fg.l androidx.compose.ui.layout.i1 placeable) {
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        @fg.l
        public final ld.l<androidx.compose.ui.layout.p0, Integer> b() {
            return this.lineProviderBlock;
        }

        @fg.l
        public final a c(@fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lineProviderBlock) {
            return new a(lineProviderBlock);
        }

        @fg.l
        public final ld.l<androidx.compose.ui.layout.p0, Integer> e() {
            return this.lineProviderBlock;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && kotlin.jvm.internal.l0.g(this.lineProviderBlock, ((a) other).lineProviderBlock);
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        @fg.l
        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/f$b;", "Landroidx/compose/foundation/layout/f;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/a;)V", "Landroidx/compose/ui/layout/i1;", "placeable", "", "a", "(Landroidx/compose/ui/layout/i1;)I", "b", "()Landroidx/compose/ui/layout/a;", "c", "(Landroidx/compose/ui/layout/a;)Landroidx/compose/foundation/layout/f$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/a;", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5010c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.layout.a alignmentLine;

        public b(@fg.l androidx.compose.ui.layout.a aVar) {
            super(null);
            this.alignmentLine = aVar;
        }

        public static b d(b bVar, androidx.compose.ui.layout.a aVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                aVar = bVar.alignmentLine;
            }
            bVar.getClass();
            return new b(aVar);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(@fg.l androidx.compose.ui.layout.i1 placeable) {
            return placeable.q(this.alignmentLine);
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final androidx.compose.ui.layout.a getAlignmentLine() {
            return this.alignmentLine;
        }

        @fg.l
        public final b c(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            return new b(alignmentLine);
        }

        @fg.l
        public final androidx.compose.ui.layout.a e() {
            return this.alignmentLine;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && kotlin.jvm.internal.l0.g(this.alignmentLine, ((b) other).alignmentLine);
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        @fg.l
        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    public /* synthetic */ f(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract int a(@fg.l androidx.compose.ui.layout.i1 placeable);

    private f() {
    }
}
