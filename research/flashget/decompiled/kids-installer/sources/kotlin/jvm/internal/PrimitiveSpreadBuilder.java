package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.c1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class PrimitiveSpreadBuilder<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f23541a;

    /* renamed from: b, reason: collision with root package name */
    private int f23542b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final T[] f23543c;

    public PrimitiveSpreadBuilder(int i5) {
        this.f23541a = i5;
        this.f23543c = (T[]) new Object[i5];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@d5.d T t5) {
        l0.p(t5, ProtectedSandApp.s("䅏"));
        T[] tArr = this.f23543c;
        int i5 = this.f23542b;
        this.f23542b = i5 + 1;
        tArr[i5] = t5;
    }

    /* renamed from: b, reason: from getter */
    protected final int getF23542b() {
        return this.f23542b;
    }

    protected abstract int c(@d5.d T t5);

    protected final void e(int i5) {
        this.f23542b = i5;
    }

    protected final int f() {
        int i5 = 0;
        IntIterator it = new IntRange(0, this.f23541a - 1).iterator();
        while (it.hasNext()) {
            T t5 = this.f23543c[it.nextInt()];
            i5 += t5 != null ? c(t5) : 1;
        }
        return i5;
    }

    @d5.d
    protected final T g(@d5.d T t5, @d5.d T t6) {
        l0.p(t5, ProtectedSandApp.s("䅐"));
        l0.p(t6, ProtectedSandApp.s("䅑"));
        IntIterator it = new IntRange(0, this.f23541a - 1).iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t7 = this.f23543c[nextInt];
            if (t7 != null) {
                if (i5 < nextInt) {
                    int i7 = nextInt - i5;
                    System.arraycopy(t5, i5, t6, i6, i7);
                    i6 += i7;
                }
                int c6 = c(t7);
                System.arraycopy(t7, 0, t6, i6, c6);
                i6 += c6;
                i5 = nextInt + 1;
            }
        }
        int i8 = this.f23541a;
        if (i5 < i8) {
            System.arraycopy(t5, i5, t6, i6, i8 - i5);
        }
        return t6;
    }
}
