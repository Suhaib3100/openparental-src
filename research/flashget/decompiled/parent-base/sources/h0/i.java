package h0;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh0/f;", "Landroid/view/ViewStructure;", "root", "Lkotlin/k2;", "b", "(Lh0/f;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Lh0/f;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,231:1\n151#2,3:232\n33#2,4:235\n154#2,2:239\n38#2:241\n156#2:242\n37#3,2:243\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:232,3\n96#1:235,4\n96#1:239,2\n96#1:241\n96#1:242\n96#1:243,2\n*E\n"})
/* loaded from: classes.dex */
public final class i {
    @androidx.compose.ui.k
    @x0(26)
    public static final void a(@fg.l f fVar, @fg.l SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            AutofillValue a5 = h.a(sparseArray.get(keyAt));
            u uVar = u.f73924a;
            if (uVar.d(a5)) {
                fVar.getAutofillTree().b(keyAt, uVar.i(a5).toString());
            } else {
                if (uVar.b(a5)) {
                    throw new g0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (uVar.c(a5)) {
                    throw new g0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (uVar.e(a5)) {
                    throw new g0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @androidx.compose.ui.k
    @x0(26)
    public static final void b(@fg.l f fVar, @fg.l ViewStructure viewStructure) {
        int a5 = k.f73922a.a(viewStructure, fVar.getAutofillTree().a().size());
        for (Map.Entry<Integer, z> entry : fVar.getAutofillTree().a().entrySet()) {
            int intValue = entry.getKey().intValue();
            z value = entry.getValue();
            k kVar = k.f73922a;
            ViewStructure b5 = kVar.b(viewStructure, a5);
            if (b5 != null) {
                u uVar = u.f73924a;
                AutofillId a6 = uVar.a(viewStructure);
                l0.m(a6);
                uVar.g(b5, a6, intValue);
                kVar.d(b5, intValue, fVar.getView().getContext().getPackageName(), null, null);
                uVar.h(b5, 1);
                List<b0> c5 = value.c();
                ArrayList arrayList = new ArrayList(c5.size());
                int size = c5.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(g.b(c5.get(i4)));
                }
                uVar.f(b5, (String[]) arrayList.toArray(new String[0]));
                i0.i boundingBox = value.getBoundingBox();
                if (boundingBox != null) {
                    int L0 = kotlin.math.b.L0(boundingBox.t());
                    int L02 = kotlin.math.b.L0(boundingBox.getTop());
                    int L03 = kotlin.math.b.L0(boundingBox.x());
                    k.f73922a.c(b5, L0, L02, 0, 0, L03 - L0, kotlin.math.b.L0(boundingBox.j()) - L02);
                }
            }
            a5++;
        }
    }
}
