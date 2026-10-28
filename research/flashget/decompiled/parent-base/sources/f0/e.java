package f0;

import androidx.collection.n1;
import androidx.compose.foundation.text.q;
import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Collection;
import java.util.Iterator;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ListImplementation.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lf0/e;", "", "<init>", "()V", "", "index", "size", "Lkotlin/k2;", "a", "(II)V", "b", "fromIndex", "toIndex", "c", "(III)V", "", "e", "(Ljava/util/Collection;)I", "other", "", "d", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final e f73850a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final int f73851b = 0;

    private e() {
    }

    @n
    public static final void a(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(q.a("index: ", index, ", size: ", size));
        }
    }

    @n
    public static final void b(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(q.a("index: ", index, ", size: ", size));
        }
    }

    @n
    public static final void c(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0 || toIndex > size) {
            StringBuilder a5 = n1.a("fromIndex: ", fromIndex, ", toIndex: ", toIndex, ", size: ");
            a5.append(size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(q.a("fromIndex: ", fromIndex, " > toIndex: ", toIndex));
        }
    }

    @n
    public static final boolean d(@l Collection<?> c5, @l Collection<?> other) {
        if (c5.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c5.iterator();
        while (it2.hasNext()) {
            if (!l0.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @n
    public static final int e(@l Collection<?> c5) {
        Iterator<?> it = c5.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = (i4 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i4;
    }
}
