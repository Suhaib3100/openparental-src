package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/collections/b;", "T", "", "<init>", "()V", "", "e", "()Z", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "b", "value", "d", "(Ljava/lang/Object;)V", "c", "Lkotlin/collections/r1;", "Lkotlin/collections/r1;", "state", "Ljava/lang/Object;", "nextValue", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b<T> implements Iterator<T>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private r1 state = r1.NotReady;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private T nextValue;

    /* compiled from: AbstractIterator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74832a;

        static {
            int[] iArr = new int[r1.values().length];
            try {
                iArr[r1.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r1.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f74832a = iArr;
        }
    }

    private final boolean e() {
        this.state = r1.Failed;
        b();
        return this.state == r1.Ready;
    }

    protected abstract void b();

    protected final void c() {
        this.state = r1.Done;
    }

    protected final void d(T value) {
        this.nextValue = value;
        this.state = r1.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        r1 r1Var = this.state;
        if (r1Var == r1.Failed) {
            throw new IllegalArgumentException(ProtectedSandApp.s("惍\u0001"));
        }
        int i4 = a.f74832a[r1Var.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = r1.NotReady;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("惎\u0001"));
    }
}
