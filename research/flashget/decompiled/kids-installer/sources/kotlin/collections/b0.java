package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "flatten", "", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class b0 extends a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class a<T> implements Iterable<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<Iterator<T>> f23078o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.a<? extends Iterator<? extends T>> aVar) {
            this.f23078o = aVar;
        }

        @Override // java.lang.Iterable
        @d5.d
        public Iterator<T> iterator() {
            return this.f23078o.n();
        }
    }

    @InlineOnly
    private static final <T> Iterable<T> a0(q3.a<? extends Iterator<? extends T>> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("殅"));
        return new a(aVar);
    }

    @PublishedApi
    public static <T> int b0(@d5.d Iterable<? extends T> iterable, int i5) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("殆"));
        return iterable instanceof Collection ? ((Collection) iterable).size() : i5;
    }

    @d5.e
    @PublishedApi
    public static final <T> Integer c0(@d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("殇"));
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @d5.d
    public static <T> List<T> d0(@d5.d Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("殈"));
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            f0.q0(arrayList, it.next());
        }
        return arrayList;
    }

    @d5.d
    public static final <T, R> Pair<List<T>, List<R>> e0(@d5.d Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("殉"));
        int b02 = b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        ArrayList arrayList2 = new ArrayList(b02);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
