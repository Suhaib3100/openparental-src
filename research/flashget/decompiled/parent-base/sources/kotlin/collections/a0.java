package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IteratorsJVM.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Ljava/util/Enumeration;", "", "f0", "(Ljava/util/Enumeration;)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
public class a0 extends z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IteratorsJVM.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/a0$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration<T> f74829b;

        a(Enumeration<T> enumeration) {
            this.f74829b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f74829b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f74829b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("悖\u0001"));
        }
    }

    @fg.l
    public static <T> Iterator<T> f0(@fg.l Enumeration<T> enumeration) {
        kotlin.jvm.internal.l0.p(enumeration, ProtectedSandApp.s("悷\u0001"));
        return new a(enumeration);
    }
}
