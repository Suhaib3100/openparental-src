package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0010*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "", "iterator", "", "a0", "(Lld/a;)Ljava/lang/Iterable;", "", "c0", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "b0", "(Ljava/lang/Iterable;I)I", "", "d0", "(Ljava/lang/Iterable;)Ljava/util/List;", "R", "Lkotlin/q0;", "e0", "(Ljava/lang/Iterable;)Lkotlin/q0;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
public class z extends y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/z$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class a<T> implements Iterable<T>, md.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Iterator<T>> f75010b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.a<? extends Iterator<? extends T>> aVar) {
            this.f75010b = aVar;
        }

        @Override // java.lang.Iterable
        @fg.l
        public Iterator<T> iterator() {
            return this.f75010b.invoke();
        }
    }

    @kotlin.internal.f
    private static final <T> Iterable<T> a0(ld.a<? extends Iterator<? extends T>> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悵\u0001"));
        return new a(aVar);
    }

    @kotlin.w0
    public static <T> int b0(@fg.l Iterable<? extends T> iterable, int i4) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悶\u0001"));
        return iterable instanceof Collection ? ((Collection) iterable).size() : i4;
    }

    @fg.m
    @kotlin.w0
    public static final <T> Integer c0(@fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悶\u0001"));
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @fg.l
    public static <T> List<T> d0(@fg.l Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悶\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            d0.q0(arrayList, it.next());
        }
        return arrayList;
    }

    @fg.l
    public static final <T, R> kotlin.q0<List<T>, List<R>> e0(@fg.l Iterable<? extends kotlin.q0<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悶\u0001"));
        int b02 = b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        ArrayList arrayList2 = new ArrayList(b02);
        for (kotlin.q0<? extends T, ? extends R> q0Var : iterable) {
            arrayList.add(q0Var.e());
            arrayList2.add(q0Var.f());
        }
        return new kotlin.q0<>(arrayList, arrayList2);
    }
}
