package androidx.compose.ui.text;

import androidx.compose.ui.text.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n235#2,3:155\n33#2,4:158\n238#2,2:162\n38#2:164\n240#2:165\n151#2,3:166\n33#2,4:169\n154#2,2:173\n38#2:175\n156#2:176\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n142#1:155,3\n142#1:158,4\n142#1:162,2\n142#1:164\n142#1:165\n142#1:166,3\n142#1:169,4\n142#1:173,2\n142#1:175\n142#1:176\n*E\n"})
/* loaded from: classes.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.b<a0>> b(List<e.b<a0>> list, int i4, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            e.b<a0> bVar = list.get(i6);
            e.b<a0> bVar2 = bVar;
            if (f.t(i4, i5, bVar2.i(), bVar2.g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            e.b bVar3 = (e.b) arrayList.get(i7);
            if (i4 > bVar3.i() || bVar3.g() > i5) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new e.b(bVar3.h(), bVar3.i() - i4, bVar3.g() - i4));
        }
        return arrayList2;
    }
}
