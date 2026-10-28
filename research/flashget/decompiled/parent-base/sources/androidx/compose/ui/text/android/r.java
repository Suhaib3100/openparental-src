package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ListUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007\"\u0010\b\u0002\u0010\t*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00028\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/k2;", "action", "a", "(Ljava/util/List;Lld/l;)V", "R", "", "C", "destination", "transform", "b", "(Ljava/util/List;Ljava/util/Collection;Lld/l;)Ljava/util/Collection;", "Lkotlin/Function2;", "c", "(Ljava/util/List;Lld/p;)Ljava/util/List;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n1#1,86:1\n33#1,6:87\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n55#1:87,6\n*E\n"})
/* loaded from: classes.dex */
public final class r {
    public static final <T> void a(@fg.l List<? extends T> list, @fg.l ld.l<? super T, k2> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            lVar.invoke(list.get(i4));
        }
    }

    @fg.l
    public static final <T, R, C extends Collection<? super R>> C b(@fg.l List<? extends T> list, @fg.l C c5, @fg.l ld.l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            c5.add(lVar.invoke(list.get(i4)));
        }
        return c5;
    }

    @fg.l
    public static final <T, R> List<R> c(@fg.l List<? extends T> list, @fg.l ld.p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() == 0 || list.size() == 1) {
            return kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        a0.c cVar = list.get(0);
        int J = kotlin.collections.w.J(list);
        while (i4 < J) {
            i4++;
            T t4 = list.get(i4);
            arrayList.add(pVar.invoke(cVar, t4));
            cVar = t4;
        }
        return arrayList;
    }
}
