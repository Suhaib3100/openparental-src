package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ListUtils.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\r\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0014\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001aW\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0019\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ai\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0000¢\u0006\u0004\b#\u0010$\u001a\u007f\u0010)\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010'*\u00060%j\u0002`&*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010(\u001a\u00028\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a;\u0010,\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060%j\u0002`&2\u0006\u0010+\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001aM\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010\u0011\u001aZ\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/k2;", "action", "e", "(Ljava/util/List;Lld/l;)V", "", "n", "(Ljava/util/List;)Ljava/util/Set;", "Lkotlin/Function2;", "", "f", "(Ljava/util/List;Lld/p;)V", "R", "transform", "l", "(Ljava/util/List;Lld/l;)Ljava/util/List;", "", "predicate", "c", "(Ljava/util/List;Lld/l;)Z", "b", "K", "keySelector", "", "g", "(Ljava/util/List;Lld/l;)Ljava/util/Map;", "", "separator", "prefix", "postfix", "limit", "truncated", "", "j", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "h", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/Appendable;", "element", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lld/l;)V", "m", "Lkotlin/r0;", "name", "index", "d", "(Ljava/util/List;Lld/p;)Ljava/util/List;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t4, ld.l<? super T, ? extends CharSequence> lVar) {
        if (lVar != null) {
            appendable.append(lVar.invoke(t4));
            return;
        }
        if (t4 == 0 ? true : t4 instanceof CharSequence) {
            appendable.append((CharSequence) t4);
        } else if (t4 instanceof Character) {
            appendable.append(((Character) t4).charValue());
        } else {
            appendable.append(String.valueOf(t4));
        }
    }

    public static final <T> boolean b(@fg.l List<? extends T> list, @fg.l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!lVar.invoke(list.get(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean c(@fg.l List<? extends T> list, @fg.l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (lVar.invoke(list.get(i4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    public static final <T> List<T> d(@fg.l List<? extends T> list, @fg.l ld.p<? super Integer, ? super T, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (pVar.invoke(Integer.valueOf(i4), t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <T> void e(@fg.l List<? extends T> list, @fg.l ld.l<? super T, k2> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            lVar.invoke(list.get(i4));
        }
    }

    public static final <T> void f(@fg.l List<? extends T> list, @fg.l ld.p<? super Integer, ? super T, k2> pVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(i4), list.get(i4));
        }
    }

    @fg.l
    public static final <T, K> Map<K, List<T>> g(@fg.l List<? extends T> list, @fg.l ld.l<? super T, ? extends K> lVar) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            K invoke = lVar.invoke(t4);
            Object obj = hashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(invoke, obj);
            }
            ((ArrayList) obj).add(t4);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A h(List<? extends T> list, A a5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l<? super T, ? extends CharSequence> lVar) {
        a5.append(charSequence2);
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            T t4 = list.get(i6);
            i5++;
            if (i5 > 1) {
                a5.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            a(a5, t4, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            a5.append(charSequence4);
        }
        a5.append(charSequence3);
        return a5;
    }

    @fg.l
    public static final <T> String j(@fg.l List<? extends T> list, @fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, @fg.l CharSequence charSequence3, int i4, @fg.l CharSequence charSequence4, @fg.m ld.l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) h(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String k(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return j(list, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    @fg.l
    public static final <T, R> List<R> l(@fg.l List<? extends T> list, @fg.l ld.l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(lVar.invoke(list.get(i4)));
        }
        return arrayList;
    }

    @fg.l
    public static final <T, R> List<R> m(@fg.l List<? extends T> list, @fg.l ld.l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            R invoke = lVar.invoke(list.get(i4));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @fg.l
    public static final <T> Set<T> n(@fg.l List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            hashSet.add(list.get(i4));
        }
        return hashSet;
    }
}
