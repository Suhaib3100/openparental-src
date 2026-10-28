package androidx.compose.runtime.collection;

import androidx.collection.m1;
import androidx.collection.q2;
import androidx.collection.r2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import ld.l;

/* compiled from: MutableVector.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\n\u0018\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\n\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0014\b\b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\n\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\n\u0018\u00012\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "", "index", "Lkotlin/k2;", "f", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "g", "(Ljava/util/List;II)V", "T", "capacity", "Landroidx/compose/runtime/collection/g;", "a", "(I)Landroidx/compose/runtime/collection/g;", "size", "Lkotlin/Function1;", "init", "b", "(ILld/l;)Landroidx/compose/runtime/collection/g;", "h", "()Landroidx/compose/runtime/collection/g;", "", "elements", "i", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/g;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
/* loaded from: classes.dex */
public final class h {
    public static final <T> g<T> a(int i4) {
        l0.P();
        return new g<>(new Object[i4], 0);
    }

    public static final <T> g<T> b(int i4, l<? super Integer, ? extends T> lVar) {
        l0.P();
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = lVar.invoke(Integer.valueOf(i5));
        }
        return new g<>(objArr, i4);
    }

    public static g c(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 16;
        }
        l0.P();
        return new g(new Object[i4], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List<?> list, int i4) {
        int size = list.size();
        if (i4 < 0 || i4 >= size) {
            throw new IndexOutOfBoundsException(q2.a("Index ", i4, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(List<?> list, int i4, int i5) {
        int size = list.size();
        if (i4 > i5) {
            throw new IllegalArgumentException(q2.a("Indices are out of order. fromIndex (", i4, ") is greater than toIndex (", i5, ")."));
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a("fromIndex (", i4, ") is less than 0."));
        }
        if (i5 > size) {
            throw new IndexOutOfBoundsException(m1.a("toIndex (", i5, ") is more than than the list size (", size, ')'));
        }
    }

    public static final <T> g<T> h() {
        l0.P();
        return new g<>(new Object[16], 0);
    }

    public static final /* synthetic */ <T> g<T> i(T... tArr) {
        return new g<>(tArr, tArr.length);
    }
}
