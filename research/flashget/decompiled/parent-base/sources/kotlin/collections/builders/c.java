package kotlin.collections.builders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001e\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"E", "", "size", "", "d", "(I)[Ljava/lang/Object;", "T", "offset", "length", "", "thisCollection", "", "j", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "i", "([Ljava/lang/Object;II)I", "", "other", "", "h", "([Ljava/lang/Object;IILjava/util/List;)Z", "newSize", "e", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "Lkotlin/k2;", "f", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "g", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes7.dex */
public final class c {
    @l
    public static final <E> E[] d(int i4) {
        if (i4 >= 0) {
            return (E[]) new Object[i4];
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("惗\u0001"));
    }

    @l
    public static final <T> T[] e(@l T[] tArr, int i4) {
        l0.p(tArr, ProtectedSandApp.s("惘\u0001"));
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i4);
        l0.o(tArr2, ProtectedSandApp.s("惙\u0001"));
        return tArr2;
    }

    public static final <E> void f(@l E[] eArr, int i4) {
        l0.p(eArr, ProtectedSandApp.s("惘\u0001"));
        eArr[i4] = null;
    }

    public static final <E> void g(@l E[] eArr, int i4, int i5) {
        l0.p(eArr, ProtectedSandApp.s("惘\u0001"));
        while (i4 < i5) {
            f(eArr, i4);
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i4, int i5, List<?> list) {
        if (i5 != list.size()) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!l0.g(tArr[i4 + i6], list.get(i6))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i4, int i5) {
        int i6 = 1;
        for (int i7 = 0; i7 < i5; i7++) {
            T t4 = tArr[i4 + i7];
            i6 = (i6 * 31) + (t4 != null ? t4.hashCode() : 0);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i4, int i5, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append(ProtectedSandApp.s("惚\u0001"));
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(ProtectedSandApp.s("惛\u0001"));
            }
            T t4 = tArr[i4 + i6];
            if (t4 == collection) {
                sb.append(ProtectedSandApp.s("惜\u0001"));
            } else {
                sb.append(t4);
            }
        }
        sb.append(ProtectedSandApp.s("惝\u0001"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("惞\u0001"));
        return sb2;
    }
}
