package kotlin.collections;

import androidx.collection.q2;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u0007\u001a&\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a7\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00152\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\n\u001aJ\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aJ\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010\"\u001aM\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010$2\u001f\b\u0001\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020%0\u001c¢\u0006\u0002\b&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b(\u0010)\u001aU\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010$2\u0006\u0010*\u001a\u00020\u001a2\u001f\b\u0001\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020%0\u001c¢\u0006\u0002\b&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b+\u0010\"\u001a \u0010-\u001a\u00020,\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b-\u0010.\u001a3\u0010/\u001a\u00020,\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b/\u0010.\u001a(\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b0\u00101\u001a(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0087\b¢\u0006\u0004\b2\u00103\u001a=\u00106\u001a\u00028\u0001\"\u0010\b\u0000\u0010+*\u0006\u0012\u0002\b\u00030\u0002*\u00028\u0001\"\u0004\b\u0001\u0010\r*\u00028\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000104H\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a3\u00109\u001a\u00020,\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b8*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b9\u0010:\u001a-\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\u0000\u00103\u001aG\u0010C\u001a\u00020\u001a\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000@*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a¢\u0006\u0004\bC\u0010D\u001aU\u0010H\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0016\u001a\u00028\u00002\u001a\u0010G\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`F2\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a¢\u0006\u0004\bH\u0010I\u001ai\u0010L\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u00106*\b\u0012\u0004\u0012\u00028\u00010@*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010J\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a2\u0016\b\u0004\u0010K\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001aE\u0010O\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\u0004\bO\u0010P\u001a'\u0010Q\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001aH\u0002¢\u0006\u0004\bQ\u0010R\u001a\u000f\u0010S\u001a\u00020%H\u0001¢\u0006\u0004\bS\u0010T\u001a\u000f\u0010U\u001a\u00020%H\u0001¢\u0006\u0004\bU\u0010T\u001a#\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00012\n\u0010V\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b$\u0010W\u001a5\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\u0010V\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\bY\u0010Z\"\u0019\u0010^\u001a\u00020[*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\\\u0010]\"!\u0010a\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"T", "", "", "t", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "H", "()Ljava/util/List;", "elements", "O", "([Ljava/lang/Object;)Ljava/util/List;", "N", "", "R", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "r", "()Ljava/util/ArrayList;", "S", "s", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "P", "(Ljava/lang/Object;)Ljava/util/List;", "Q", "", "size", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "index", "init", "p", "(ILld/l;)Ljava/util/List;", "q", "E", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "D", "(Lld/l;)Ljava/util/List;", "capacity", "C", "", "L", "(Ljava/util/Collection;)Z", "M", "U", "(Ljava/util/Collection;)Ljava/util/Collection;", "V", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function0;", "defaultValue", "K", "(Ljava/util/Collection;Lld/a;)Ljava/lang/Object;", "Lkotlin/internal/j;", "G", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "", "Lkotlin/random/f;", "random", "X", "(Ljava/lang/Iterable;Lkotlin/random/f;)Ljava/util/List;", "", "fromIndex", "toIndex", "v", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "key", "selector", "A", "(Ljava/util/List;Ljava/lang/Comparable;IILld/l;)I", "comparison", "u", "(Ljava/util/List;IILld/l;)I", "W", "(III)V", "Z", "()V", "Y", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "F", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/ranges/l;", "I", "(Ljava/util/Collection;)Lkotlin/ranges/l;", "indices", "J", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@kotlin.jvm.internal.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,522:1\n1#2:523\n26#3:524\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n484#1:524\n*E\n"})
/* loaded from: classes7.dex */
public class y extends x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    /* compiled from: Collections.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    @kotlin.jvm.internal.r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,522:1\n*E\n"})
    public static final class a<T> extends kotlin.jvm.internal.n0 implements ld.l<T, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, K> f75006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparable f75007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lld/l<-TT;+TK;>;TK;)V */
        public a(ld.l lVar, Comparable comparable) {
            super(1);
            this.f75006b = lVar;
            this.f75007c = comparable;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(T t4) {
            return Integer.valueOf(kotlin.comparisons.a.l((Comparable) this.f75006b.invoke(t4), this.f75007c));
        }
    }

    public static final <T, K extends Comparable<? super K>> int A(@fg.l List<? extends T> list, @fg.m K k4, int i4, int i5, @fg.l ld.l<? super T, ? extends K> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("患\u0001"));
        return u(list, i4, i5, new a(lVar, k4));
    }

    public static /* synthetic */ int B(List list, Comparable comparable, int i4, int i5, ld.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("患\u0001"));
        return u(list, i4, i5, new a(lVar, comparable));
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <E> List<E> C(int i4, @InterfaceC1469b ld.l<? super List<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悤\u0001"));
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(i4);
        lVar.invoke(bVar);
        return x.a(bVar);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <E> List<E> D(@InterfaceC1469b ld.l<? super List<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悤\u0001"));
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        lVar.invoke(bVar);
        return x.a(bVar);
    }

    @fg.l
    public static final Object[] E(@fg.l Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悥\u0001"));
        int i4 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return objArr;
    }

    @fg.l
    public static final <T> T[] F(@fg.l Collection<?> collection, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悥\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悦\u0001"));
        int i4 = 0;
        if (collection.isEmpty()) {
            return (T[]) x.n(0, tArr);
        }
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < collection.size()) {
            objArr = (T[]) m.a(tArr, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return (T[]) x.n(collection.size(), objArr);
    }

    @kotlin.internal.f
    private static final <T> boolean G(Collection<? extends T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("悧\u0001"));
        return collection.containsAll(collection2);
    }

    @fg.l
    public static <T> List<T> H() {
        return j0.f74919b;
    }

    @fg.l
    public static kotlin.ranges.l I(@fg.l Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悢\u0001"));
        return new kotlin.ranges.l(0, collection.size() - 1, 1);
    }

    public static <T> int J(@fg.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lld/a<+TR;>;)TR; */
    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final Object K(Collection collection, ld.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("您\u0001"));
        return collection.isEmpty() ? aVar.invoke() : collection;
    }

    @kotlin.internal.f
    private static final <T> boolean L(Collection<? extends T> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悢\u0001"));
        return !collection.isEmpty();
    }

    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> boolean M(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @kotlin.internal.f
    private static final <T> List<T> N() {
        return j0.f74919b;
    }

    @fg.l
    public static <T> List<T> O(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悧\u0001"));
        return tArr.length > 0 ? o.t(tArr) : j0.f74919b;
    }

    @fg.l
    public static <T> List<T> P(@fg.m T t4) {
        return t4 != null ? x.k(t4) : j0.f74919b;
    }

    @fg.l
    public static <T> List<T> Q(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悧\u0001"));
        return r.Ta(tArr);
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> R() {
        return new ArrayList();
    }

    @fg.l
    public static <T> List<T> S(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悧\u0001"));
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new j(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <T> List<T> T(@fg.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        int size = list.size();
        return size != 0 ? size != 1 ? list : x.k(list.get(0)) : j0.f74919b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Collection<T> U(Collection<? extends T> collection) {
        return collection == 0 ? j0.f74919b : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> List<T> V(List<? extends T> list) {
        return list == 0 ? j0.f74919b : list;
    }

    private static final void W(int i4, int i5, int i6) {
        String s4 = ProtectedSandApp.s("悩\u0001");
        String s5 = ProtectedSandApp.s("悪\u0001");
        if (i5 > i6) {
            throw new IllegalArgumentException(q2.a(s5, i5, ProtectedSandApp.s("悮\u0001"), i6, s4));
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(r2.a(s5, i5, ProtectedSandApp.s("悭\u0001")));
        }
        if (i6 > i4) {
            throw new IndexOutOfBoundsException(q2.a(ProtectedSandApp.s("悫\u0001"), i6, ProtectedSandApp.s("悬\u0001"), i4, s4));
        }
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    public static final <T> List<T> X(@fg.l Iterable<? extends T> iterable, @fg.l kotlin.random.f fVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("悯\u0001"));
        List<T> X5 = g0.X5(iterable);
        g0.e5(X5, fVar);
        return X5;
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static void Y() {
        throw new ArithmeticException(ProtectedSandApp.s("悰\u0001"));
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static void Z() {
        throw new ArithmeticException(ProtectedSandApp.s("悱\u0001"));
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> p(int i4, ld.l<? super Integer, ? extends T> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悲\u0001"));
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> List<T> q(int i4, ld.l<? super Integer, ? extends T> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悲\u0001"));
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> ArrayList<T> r() {
        return new ArrayList<>();
    }

    @fg.l
    public static <T> ArrayList<T> s(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悧\u0001"));
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    @fg.l
    public static final <T> Collection<T> t(@fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悢\u0001"));
        return new j(tArr, false);
    }

    public static <T> int u(@fg.l List<? extends T> list, int i4, int i5, @fg.l ld.l<? super T, Integer> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悳\u0001"));
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int intValue = lVar.invoke(list.get(i7)).intValue();
            if (intValue < 0) {
                i4 = i7 + 1;
            } else {
                if (intValue <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final <T extends Comparable<? super T>> int v(@fg.l List<? extends T> list, @fg.m T t4, int i4, int i5) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int l4 = kotlin.comparisons.a.l(list.get(i7), t4);
            if (l4 < 0) {
                i4 = i7 + 1;
            } else {
                if (l4 <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final <T> int w(@fg.l List<? extends T> list, T t4, @fg.l Comparator<? super T> comparator, int i4, int i5) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悢\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("悴\u0001"));
        W(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int compare = comparator.compare(list.get(i7), t4);
            if (compare < 0) {
                i4 = i7 + 1;
            } else {
                if (compare <= 0) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int x(List list, int i4, int i5, ld.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = list.size();
        }
        return u(list, i4, i5, lVar);
    }

    public static /* synthetic */ int y(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return v(list, comparable, i4, i5);
    }

    public static /* synthetic */ int z(List list, Object obj, Comparator comparator, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = list.size();
        }
        return w(list, obj, comparator, i4, i5);
    }
}
