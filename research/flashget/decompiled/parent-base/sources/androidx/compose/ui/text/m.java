package androidx.compose.ui.text;

import androidx.compose.ui.text.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.l1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;

/* compiled from: JvmAnnotatedString.jvm.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/e;", "Lkotlin/Function3;", "", "", "transform", "b", "(Landroidx/compose/ui/text/e;Lld/q;)Landroidx/compose/ui/text/e;", "", "Landroidx/compose/ui/text/e$b;", "ranges", "Ljava/util/SortedSet;", "target", "Lkotlin/k2;", "a", "(Ljava/util/List;Ljava/util/SortedSet;)V", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* compiled from: JvmAnnotatedString.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "<name for destructuring parameter 0>", "a", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Integer>, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<String> f21172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<String, Integer, Integer, String> f21173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f21174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map<Integer, Integer> f21175e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(k1.h<String> hVar, ld.q<? super String, ? super Integer, ? super Integer, String> qVar, e eVar, Map<Integer, Integer> map) {
            super(1);
            this.f21172b = hVar;
            this.f21173c = qVar;
            this.f21174d = eVar;
            this.f21175e = map;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l List<Integer> list) {
            int intValue = list.get(0).intValue();
            int intValue2 = list.get(1).intValue();
            this.f21172b.f75329b = this.f21172b.f75329b + this.f21173c.R(this.f21174d.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
            return this.f21175e.put(Integer.valueOf(intValue2), Integer.valueOf(this.f21172b.f75329b.length()));
        }
    }

    private static final void a(List<? extends e.b<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e.b<?> bVar = list.get(i4);
                sortedSet.add(Integer.valueOf(bVar.i()));
                sortedSet.add(Integer.valueOf(bVar.g()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final e b(@fg.l e eVar, @fg.l ld.q<? super String, ? super Integer, ? super Integer, String> qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeSet h4 = l1.h(0, Integer.valueOf(eVar.getText().length()));
        a(eVar.j(), h4);
        a(eVar.h(), h4);
        a(eVar.e(), h4);
        k1.h hVar = new k1.h();
        hVar.f75329b = "";
        Map j02 = kotlin.collections.z0.j0(new kotlin.q0(0, 0));
        kotlin.collections.w.g6(h4, 2, 0, false, new a(hVar, qVar, eVar, j02), 6, null);
        List<e.b<i0>> j4 = eVar.j();
        ArrayList arrayList3 = null;
        if (j4 != null) {
            arrayList = new ArrayList(j4.size());
            int size = j4.size();
            for (int i4 = 0; i4 < size; i4++) {
                e.b<i0> bVar = j4.get(i4);
                i0 h5 = bVar.h();
                Object obj = j02.get(Integer.valueOf(bVar.i()));
                kotlin.jvm.internal.l0.m(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = j02.get(Integer.valueOf(bVar.g()));
                kotlin.jvm.internal.l0.m(obj2);
                arrayList.add(new e.b(h5, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<e.b<y>> h6 = eVar.h();
        if (h6 != null) {
            arrayList2 = new ArrayList(h6.size());
            int size2 = h6.size();
            for (int i5 = 0; i5 < size2; i5++) {
                e.b<y> bVar2 = h6.get(i5);
                y h7 = bVar2.h();
                Object obj3 = j02.get(Integer.valueOf(bVar2.i()));
                kotlin.jvm.internal.l0.m(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = j02.get(Integer.valueOf(bVar2.g()));
                kotlin.jvm.internal.l0.m(obj4);
                arrayList2.add(new e.b(h7, intValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<e.b<? extends Object>> e4 = eVar.e();
        if (e4 != null) {
            arrayList3 = new ArrayList(e4.size());
            int size3 = e4.size();
            for (int i6 = 0; i6 < size3; i6++) {
                e.b<? extends Object> bVar3 = e4.get(i6);
                Object h10 = bVar3.h();
                Object obj5 = j02.get(Integer.valueOf(bVar3.i()));
                kotlin.jvm.internal.l0.m(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = j02.get(Integer.valueOf(bVar3.g()));
                kotlin.jvm.internal.l0.m(obj6);
                arrayList3.add(new e.b(h10, intValue3, ((Number) obj6).intValue()));
            }
        }
        return new e((String) hVar.f75329b, arrayList, arrayList2, arrayList3);
    }
}
