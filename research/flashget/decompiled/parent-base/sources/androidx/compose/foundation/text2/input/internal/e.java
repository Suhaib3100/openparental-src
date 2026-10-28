package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.o;
import androidx.compose.foundation.w1;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ChangeTracker.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010#\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e;", "Landroidx/compose/foundation/text2/input/o$a;", "initialChanges", "<init>", "(Landroidx/compose/foundation/text2/input/internal/e;)V", "Landroidx/compose/foundation/text2/input/internal/e$a;", "mergedOverlappingChange", "", "preMin", "preMax", "postDelta", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/text2/input/internal/e$a;III)V", "preStart", "preEnd", "postLength", "f", "(III)V", "e", "()V", "changeIndex", "Landroidx/compose/ui/text/t0;", "c", "(I)J", "b", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/g;", "a", "Landroidx/compose/runtime/collection/g;", "_changes", "_changesTemp", "()I", "changeCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text2/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1208#2:197\n1187#2,2:198\n1208#2:200\n1187#2,2:201\n460#3,7:203\n728#3,2:210\n467#3,4:212\n523#3:216\n728#3,2:217\n523#3:219\n523#3:221\n476#3,11:222\n728#3,2:233\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text2/input/internal/ChangeTracker\n*L\n34#1:197\n34#1:198,2\n35#1:200\n35#1:201,2\n38#1:203,7\n39#1:210,2\n38#1:212,4\n81#1:216\n110#1:217,2\n132#1:219\n135#1:221\n139#1:222,11\n186#1:233,2\n*E\n"})
/* loaded from: classes.dex */
public final class e implements o.a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8620c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.collection.g<a> _changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.collection.g<a> _changesTemp;

    /* compiled from: ChangeTracker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text2/input/internal/e$a;", "", "", "preStart", "preEnd", "originalStart", "originalEnd", "<init>", "(IIII)V", "a", "()I", "b", "c", "d", "e", "(IIII)Landroidx/compose/foundation/text2/input/internal/e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "j", "n", "(I)V", "i", "m", "h", "l", "g", "k", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int preStart;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int preEnd;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int originalStart;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int originalEnd;

        public a(int i4, int i5, int i6, int i7) {
            this.preStart = i4;
            this.preEnd = i5;
            this.originalStart = i6;
            this.originalEnd = i7;
        }

        public static a f(a aVar, int i4, int i5, int i6, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i4 = aVar.preStart;
            }
            if ((i10 & 2) != 0) {
                i5 = aVar.preEnd;
            }
            if ((i10 & 4) != 0) {
                i6 = aVar.originalStart;
            }
            if ((i10 & 8) != 0) {
                i7 = aVar.originalEnd;
            }
            aVar.getClass();
            return new a(i4, i5, i6, i7);
        }

        /* renamed from: a, reason: from getter */
        public final int getPreStart() {
            return this.preStart;
        }

        /* renamed from: b, reason: from getter */
        public final int getPreEnd() {
            return this.preEnd;
        }

        /* renamed from: c, reason: from getter */
        public final int getOriginalStart() {
            return this.originalStart;
        }

        /* renamed from: d, reason: from getter */
        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        @fg.l
        public final a e(int preStart, int preEnd, int originalStart, int originalEnd) {
            return new a(preStart, preEnd, originalStart, originalEnd);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.preStart == aVar.preStart && this.preEnd == aVar.preEnd && this.originalStart == aVar.originalStart && this.originalEnd == aVar.originalEnd;
        }

        public final int g() {
            return this.originalEnd;
        }

        public final int h() {
            return this.originalStart;
        }

        public int hashCode() {
            return Integer.hashCode(this.originalEnd) + w1.a(this.originalStart, w1.a(this.preEnd, Integer.hashCode(this.preStart) * 31, 31), 31);
        }

        public final int i() {
            return this.preEnd;
        }

        public final int j() {
            return this.preStart;
        }

        public final void k(int i4) {
            this.originalEnd = i4;
        }

        public final void l(int i4) {
            this.originalStart = i4;
        }

        public final void m(int i4) {
            this.preEnd = i4;
        }

        public final void n(int i4) {
            this.preStart = i4;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.preStart);
            sb.append(", preEnd=");
            sb.append(this.preEnd);
            sb.append(", originalStart=");
            sb.append(this.originalStart);
            sb.append(", originalEnd=");
            return androidx.view.e.a(sb, this.originalEnd, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void d(a mergedOverlappingChange, int preMin, int preMax, int postDelta) {
        int i4;
        if (this._changesTemp.U()) {
            i4 = 0;
        } else {
            a W = this._changesTemp.W();
            i4 = W.i() - W.g();
        }
        if (mergedOverlappingChange == null) {
            int i5 = preMin - i4;
            mergedOverlappingChange = new a(preMin, preMax + postDelta, i5, (preMax - preMin) + i5);
        } else {
            if (mergedOverlappingChange.j() > preMin) {
                mergedOverlappingChange.n(preMin);
                mergedOverlappingChange.l(preMin);
            }
            if (preMax > mergedOverlappingChange.i()) {
                int i6 = mergedOverlappingChange.i() - mergedOverlappingChange.g();
                mergedOverlappingChange.m(preMax);
                mergedOverlappingChange.k(preMax - i6);
            }
            mergedOverlappingChange.m(mergedOverlappingChange.i() + postDelta);
        }
        this._changesTemp.b(mergedOverlappingChange);
    }

    @Override // androidx.compose.foundation.text2.input.o.a
    public int a() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text2.input.o.a
    public long b(int changeIndex) {
        a aVar = this._changes.L()[changeIndex];
        return u0.b(aVar.h(), aVar.g());
    }

    @Override // androidx.compose.foundation.text2.input.o.a
    public long c(int changeIndex) {
        a aVar = this._changes.L()[changeIndex];
        return u0.b(aVar.j(), aVar.i());
    }

    public final void e() {
        this._changes.m();
    }

    public final void f(int preStart, int preEnd, int postLength) {
        int i4;
        if (preStart == preEnd && postLength == 0) {
            return;
        }
        int min = Math.min(preStart, preEnd);
        int max = Math.max(preStart, preEnd);
        int i5 = postLength - (max - min);
        a aVar = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < this._changes.getSize(); i6++) {
            a aVar2 = this._changes.L()[i6];
            int j4 = aVar2.j();
            if ((min > j4 || j4 > max) && (min > (i4 = aVar2.i()) || i4 > max)) {
                if (aVar2.j() > max && !z4) {
                    d(aVar, min, max, i5);
                    z4 = true;
                }
                if (z4) {
                    aVar2.n(aVar2.j() + i5);
                    aVar2.m(aVar2.i() + i5);
                }
                this._changesTemp.b(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.m(aVar2.i());
                aVar.k(aVar2.g());
            }
        }
        if (!z4) {
            d(aVar, min, max, i5);
        }
        androidx.compose.runtime.collection.g<a> gVar = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = gVar;
        gVar.m();
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        androidx.compose.runtime.collection.g<a> gVar = this._changes;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                a aVar = L[i4];
                sb.append("(" + aVar.h() + ',' + aVar.g() + ")->(" + aVar.j() + ',' + aVar.i() + ')');
                if (i4 < this._changes.getSize() - 1) {
                    sb.append(", ");
                }
                i4++;
            } while (i4 < size);
        }
        sb.append("])");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public e(@fg.m e eVar) {
        androidx.compose.runtime.collection.g<a> gVar;
        int size;
        int i4 = 0;
        this._changes = new androidx.compose.runtime.collection.g<>(new a[16], 0);
        this._changesTemp = new androidx.compose.runtime.collection.g<>(new a[16], 0);
        if (eVar == null || (gVar = eVar._changes) == null || (size = gVar.getSize()) <= 0) {
            return;
        }
        a[] L = gVar.L();
        do {
            a aVar = L[i4];
            this._changes.b(new a(aVar.j(), aVar.i(), aVar.h(), aVar.g()));
            i4++;
        } while (i4 < size);
    }

    public /* synthetic */ e(e eVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : eVar);
    }
}
