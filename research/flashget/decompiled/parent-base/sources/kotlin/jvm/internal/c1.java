package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0006R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/jvm/internal/c1;", "", "T", "", "size", "<init>", "(I)V", "c", "(Ljava/lang/Object;)I", "spreadArgument", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V", "f", "()I", "values", "result", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "I", "b", "e", "position", "", "[Ljava/lang/Object;", "d", "()V", "spreads", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T[] spreads;

    public c1(int i4) {
        this.size = i4;
        this.spreads = (T[]) new Object[i4];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@fg.l T spreadArgument) {
        l0.p(spreadArgument, ProtectedSandApp.s("擔\u0001"));
        T[] tArr = this.spreads;
        int i4 = this.position;
        this.position = i4 + 1;
        tArr[i4] = spreadArgument;
    }

    /* renamed from: b, reason: from getter */
    protected final int getPosition() {
        return this.position;
    }

    protected abstract int c(@fg.l T t4);

    protected final void e(int i4) {
        this.position = i4;
    }

    protected final int f() {
        int i4 = 0;
        kotlin.collections.u0 it = new kotlin.ranges.l(0, this.size - 1, 1).iterator();
        while (it.hasNext()) {
            T t4 = this.spreads[it.c()];
            i4 += t4 != null ? c(t4) : 1;
        }
        return i4;
    }

    @fg.l
    protected final T g(@fg.l T values, @fg.l T result) {
        l0.p(values, ProtectedSandApp.s("擕\u0001"));
        l0.p(result, ProtectedSandApp.s("擖\u0001"));
        kotlin.collections.u0 it = new kotlin.ranges.l(0, this.size - 1, 1).iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            int c5 = it.c();
            T t4 = this.spreads[c5];
            if (t4 != null) {
                if (i4 < c5) {
                    int i6 = c5 - i4;
                    System.arraycopy(values, i4, result, i5, i6);
                    i5 += i6;
                }
                int c6 = c(t4);
                System.arraycopy(t4, 0, result, i5, c6);
                i5 += c6;
                i4 = c5 + 1;
            }
        }
        int i7 = this.size;
        if (i4 < i7) {
            System.arraycopy(values, i4, result, i5, i7 - i4);
        }
        return result;
    }
}
