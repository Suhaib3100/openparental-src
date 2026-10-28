package androidx.compose.foundation.pager;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Pager.kt */
@x4
@z0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0002\u0006\bJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/g;", "", "Landroidx/compose/ui/unit/d;", "", "availableSpace", "pageSpacing", "a", "(Landroidx/compose/ui/unit/d;II)I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g {

    /* compiled from: Pager.kt */
    @z0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/pager/g$a;", "Landroidx/compose/foundation/pager/g;", "<init>", "()V", "Landroidx/compose/ui/unit/d;", "", "availableSpace", "pageSpacing", "a", "(Landroidx/compose/ui/unit/d;II)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f6787a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f6788b = 0;

        private a() {
        }

        @Override // androidx.compose.foundation.pager.g
        public int a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            return i4;
        }
    }

    /* compiled from: Pager.kt */
    @z0
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/g$b;", "Landroidx/compose/foundation/pager/g;", "Landroidx/compose/ui/unit/h;", "pageSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "", "availableSpace", "pageSpacing", "a", "(Landroidx/compose/ui/unit/d;II)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "b", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class b implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6789b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float pageSize;

        public /* synthetic */ b(float f4, kotlin.jvm.internal.w wVar) {
            this(f4);
        }

        @Override // androidx.compose.foundation.pager.g
        public int a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            return dVar.q2(this.pageSize);
        }

        /* renamed from: b, reason: from getter */
        public final float getPageSize() {
            return this.pageSize;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof b) {
                return androidx.compose.ui.unit.h.l(this.pageSize, ((b) other).pageSize);
            }
            return false;
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.n(this.pageSize);
        }

        private b(float f4) {
            this.pageSize = f4;
        }
    }

    int a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5);
}
