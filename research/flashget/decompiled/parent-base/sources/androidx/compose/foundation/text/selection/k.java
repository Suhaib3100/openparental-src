package androidx.compose.foundation.text.selection;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001a\u001a\u00020\u0019*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b0\u0010?R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0014\u0010H\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010GR\u0014\u0010K\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010N\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010JR\u0014\u0010O\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010JR\u0014\u0010P\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010J¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/text/selection/k;", "Landroidx/compose/foundation/text/selection/d0;", "", "", "", "selectableIdToInfoListIndex", "", "Landroidx/compose/foundation/text/selection/p;", "infoList", "startSlot", "endSlot", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/q;", "previousSelection", "<init>", "(Ljava/util/Map;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/q;)V", "other", "s", "(Landroidx/compose/foundation/text/selection/k;)Z", "", "selection", "info", "minOffset", "maxOffset", "Lkotlin/k2;", "o", "(Ljava/util/Map;Landroidx/compose/foundation/text/selection/q;Landroidx/compose/foundation/text/selection/p;II)V", "slot", "isStartSlot", "u", "(IZ)I", "isMinimumSlot", "t", "id", "q", "(J)I", "Lkotlin/Function1;", "block", "k", "(Lld/l;)V", "i", "(Landroidx/compose/foundation/text/selection/d0;)Z", "h", "(Landroidx/compose/foundation/text/selection/q;)Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "b", "Ljava/util/List;", "p", "()Ljava/util/List;", "c", "I", "m", "()I", "d", "e", "Z", "()Z", "f", "Landroidx/compose/foundation/text/selection/q;", "g", "()Landroidx/compose/foundation/text/selection/q;", "getSize", "size", "Landroidx/compose/foundation/text/selection/e;", "()Landroidx/compose/foundation/text/selection/e;", "crossStatus", "l", "()Landroidx/compose/foundation/text/selection/p;", "startInfo", "j", "endInfo", "currentInfo", "firstInfo", "lastInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,714:1\n1#2:715\n69#3,6:716\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n263#1:716,6\n*E\n"})
/* loaded from: classes.dex */
final class k implements d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Long, Integer> selectableIdToInfoListIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<p> infoList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final q previousSelection;

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8046a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8046a = iArr;
        }
    }

    /* compiled from: SelectionLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/p;", "info", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<p, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<Long, q> f8048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f8049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map<Long, q> map, q qVar) {
            super(1);
            this.f8048c = map;
            this.f8049d = qVar;
        }

        public final void a(@fg.l p pVar) {
            k.this.o(this.f8048c, this.f8049d, pVar, 0, pVar.l());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(p pVar) {
            a(pVar);
            return k2.f75408a;
        }
    }

    public k(@fg.l Map<Long, Integer> map, @fg.l List<p> list, int i4, int i5, boolean z4, @fg.m q qVar) {
        this.selectableIdToInfoListIndex = map;
        this.infoList = list;
        this.startSlot = i4;
        this.endSlot = i5;
        this.isStartHandle = z4;
        this.previousSelection = qVar;
        if (list.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Map<Long, q> map, q qVar, p pVar, int i4, int i5) {
        q m4 = qVar.g() ? pVar.m(i5, i4) : pVar.m(i4, i5);
        if (i4 <= i5) {
            map.put(Long.valueOf(pVar.getSelectableId()), m4);
        } else {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + m4).toString());
        }
    }

    private final int q(long id2) {
        Integer num = this.selectableIdToInfoListIndex.get(Long.valueOf(id2));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(androidx.collection.p0.a("Invalid selectableId: ", id2).toString());
    }

    private final boolean s(k other) {
        if (this.infoList.size() != other.infoList.size()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.infoList.get(i4).n(other.infoList.get(i4))) {
                return true;
            }
        }
        return false;
    }

    private final int t(int slot, boolean isMinimumSlot) {
        return (slot - (!isMinimumSlot ? 1 : 0)) / 2;
    }

    private final int u(int slot, boolean isStartSlot) {
        int i4 = a.f8046a[f().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (isStartSlot) {
                    isStartSlot = false;
                }
            }
            return t(slot, isStartSlot);
        }
        isStartSlot = true;
        return t(slot, isStartSlot);
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    /* renamed from: b */
    public p getInfo() {
        return f() == e.CROSSED ? l() : j();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p c() {
        return this.isStartHandle ? l() : j();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p d() {
        return f() == e.CROSSED ? j() : l();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: e, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public e f() {
        int i4 = this.startSlot;
        int i5 = this.endSlot;
        return i4 < i5 ? e.NOT_CROSSED : i4 > i5 ? e.CROSSED : this.infoList.get(i4 / 2).d();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.m
    /* renamed from: g, reason: from getter */
    public q getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public Map<Long, q> h(@fg.l q selection) {
        if (selection.h().h() != selection.f().h()) {
            kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
            o(dVar, selection, d(), (selection.g() ? selection.f() : selection.h()).g(), d().l());
            k(new b(dVar, selection));
            o(dVar, selection, getInfo(), 0, (selection.g() ? selection.h() : selection.f()).g());
            return kotlin.collections.z0.d(dVar);
        }
        if ((selection.g() && selection.h().g() >= selection.f().g()) || (!selection.g() && selection.h().g() <= selection.f().g())) {
            return kotlin.collections.z0.k(new kotlin.q0(Long.valueOf(selection.h().h()), selection));
        }
        throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public boolean i(@fg.m d0 other) {
        if (this.previousSelection != null && other != null && (other instanceof k)) {
            k kVar = (k) other;
            if (this.isStartHandle == kVar.isStartHandle && this.startSlot == kVar.startSlot && this.endSlot == kVar.endSlot && !s(kVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p j() {
        return this.infoList.get(u(this.endSlot, false));
    }

    @Override // androidx.compose.foundation.text.selection.d0
    public void k(@fg.l ld.l<? super p, k2> block) {
        int q4 = q(d().getSelectableId());
        int q5 = q(getInfo().getSelectableId());
        int i4 = q4 + 1;
        if (i4 >= q5) {
            return;
        }
        while (i4 < q5) {
            block.invoke(this.infoList.get(i4));
            i4++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.d0
    @fg.l
    public p l() {
        return this.infoList.get(u(this.startSlot, true));
    }

    @Override // androidx.compose.foundation.text.selection.d0
    /* renamed from: m, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    @fg.l
    public final List<p> p() {
        return this.infoList;
    }

    @fg.l
    public final Map<Long, Integer> r() {
        return this.selectableIdToInfoListIndex;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.isStartHandle);
        sb.append(", startPosition=");
        boolean z4 = true;
        float f4 = 2;
        sb.append((this.startSlot + 1) / f4);
        sb.append(", endPosition=");
        sb.append((this.endSlot + 1) / f4);
        sb.append(", crossed=");
        sb.append(f());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<p> list = this.infoList;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            p pVar = list.get(i4);
            if (z4) {
                z4 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i4++;
            sb3.append(i4);
            sb3.append(" -> ");
            sb3.append(pVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String sb4 = sb2.toString();
        kotlin.jvm.internal.l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }
}
