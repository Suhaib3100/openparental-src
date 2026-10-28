package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.m;
import androidx.compose.ui.semantics.p;
import androidx.compose.ui.semantics.t;
import androidx.core.view.accessibility.h0;
import fg.l;
import i0.f;
import i0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: CollectionInfo.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/p;", "node", "Landroidx/core/view/accessibility/h0;", "info", "Lkotlin/k2;", "d", "(Landroidx/compose/ui/semantics/p;Landroidx/core/view/accessibility/h0;)V", "e", "", "b", "(Landroidx/compose/ui/semantics/p;)Z", "", "items", "a", "(Ljava/util/List;)Z", "Landroidx/compose/ui/semantics/b;", "Landroidx/core/view/accessibility/h0$f;", "kotlin.jvm.PlatformType", "f", "(Landroidx/compose/ui/semantics/b;)Landroidx/core/view/accessibility/h0$f;", "Landroidx/compose/ui/semantics/c;", "itemNode", "Landroidx/core/view/accessibility/h0$g;", "g", "(Landroidx/compose/ui/semantics/c;Landroidx/compose/ui/semantics/p;)Landroidx/core/view/accessibility/h0$g;", "c", "(Landroidx/compose/ui/semantics/b;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n33#2,6:155\n33#2,6:161\n340#2,11:167\n372#2,7:178\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:155,6\n87#1:161,6\n122#1:167,11\n130#1:178,7\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: CollectionInfo.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.accessibility.a$a, reason: collision with other inner class name */
    static final class C0364a extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0364a f19771b = new C0364a(0);

        C0364a() {
            super(0);
        }

        @l
        public final Boolean a() {
            return Boolean.FALSE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: CollectionInfo.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19772b = new b(0);

        b() {
            super(0);
        }

        @l
        public final Boolean a() {
            return Boolean.FALSE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List list2;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = j0.f74919b;
        } else {
            list2 = new ArrayList();
            p pVar = list.get(0);
            int J = w.J(list);
            int i4 = 0;
            while (i4 < J) {
                i4++;
                p pVar2 = list.get(i4);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                list2.add(f.d(g.a(Math.abs(f.p(pVar4.j().o()) - f.p(pVar3.j().o())), Math.abs(f.r(pVar4.j().o()) - f.r(pVar3.j().o())))));
                pVar = pVar2;
            }
        }
        if (list2.size() == 1) {
            packedValue = ((f) w.B2(list2)).getPackedValue();
        } else {
            if (list2.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object B2 = w.B2(list2);
            int J2 = w.J(list2);
            if (1 <= J2) {
                int i5 = 1;
                while (true) {
                    B2 = f.d(f.v(((f) B2).getPackedValue(), ((f) list2.get(i5)).getPackedValue()));
                    if (i5 == J2) {
                        break;
                    }
                    i5++;
                }
            }
            packedValue = ((f) B2).getPackedValue();
        }
        return f.r(packedValue) < f.e(packedValue);
    }

    public static final boolean b(@l p pVar) {
        androidx.compose.ui.semantics.l n4 = pVar.n();
        t tVar = t.f20369a;
        return (m.a(n4, tVar.a()) == null && m.a(pVar.n(), tVar.y()) == null) ? false : true;
    }

    private static final boolean c(androidx.compose.ui.semantics.b bVar) {
        return bVar.getRowCount() < 0 || bVar.getColumnCount() < 0;
    }

    public static final void d(@l p pVar, @l h0 h0Var) {
        androidx.compose.ui.semantics.l n4 = pVar.n();
        t tVar = t.f20369a;
        androidx.compose.ui.semantics.b bVar = (androidx.compose.ui.semantics.b) m.a(n4, tVar.a());
        if (bVar != null) {
            h0Var.l1(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.n(), tVar.y()) != null) {
            List<p> w4 = pVar.w();
            int size = w4.size();
            for (int i4 = 0; i4 < size; i4++) {
                p pVar2 = w4.get(i4);
                if (pVar2.n().f(t.f20369a.z())) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean a5 = a(arrayList);
        h0Var.l1(h0.f.h(a5 ? 1 : arrayList.size(), a5 ? arrayList.size() : 1, false, 0));
    }

    public static final void e(@l p pVar, @l h0 h0Var) {
        androidx.compose.ui.semantics.l n4 = pVar.n();
        t tVar = t.f20369a;
        c cVar = (c) m.a(n4, tVar.b());
        if (cVar != null) {
            h0Var.m1(g(cVar, pVar));
        }
        p t4 = pVar.t();
        if (t4 == null || m.a(t4.n(), tVar.y()) == null) {
            return;
        }
        androidx.compose.ui.semantics.b bVar = (androidx.compose.ui.semantics.b) m.a(t4.n(), tVar.a());
        if ((bVar == null || !c(bVar)) && pVar.n().f(tVar.z())) {
            ArrayList arrayList = new ArrayList();
            List<p> w4 = t4.w();
            int size = w4.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                p pVar2 = w4.get(i5);
                if (pVar2.n().f(t.f20369a.z())) {
                    arrayList.add(pVar2);
                    if (pVar2.getLayoutNode().C0() < pVar.getLayoutNode().C0()) {
                        i4++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean a5 = a(arrayList);
            h0.g j4 = h0.g.j(a5 ? 0 : i4, 1, a5 ? i4 : 0, 1, false, ((Boolean) pVar.n().l(t.f20369a.z(), C0364a.f19771b)).booleanValue());
            if (j4 != null) {
                h0Var.m1(j4);
            }
        }
    }

    private static final h0.f f(androidx.compose.ui.semantics.b bVar) {
        return h0.f.h(bVar.getRowCount(), bVar.getColumnCount(), false, 0);
    }

    private static final h0.g g(c cVar, p pVar) {
        return h0.g.j(cVar.getRowIndex(), cVar.getRowSpan(), cVar.getColumnIndex(), cVar.getColumnSpan(), false, ((Boolean) pVar.n().l(t.f20369a.z(), b.f19772b)).booleanValue());
    }
}
