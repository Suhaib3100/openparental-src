package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/DoubleSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "size", "", "(I)V", "values", "add", "", "value", "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.y, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final double[] f23657d;

    public DoubleSpreadBuilder(int i5) {
        super(i5);
        this.f23657d = new double[i5];
    }

    public final void h(double d6) {
        double[] dArr = this.f23657d;
        int f23542b = getF23542b();
        e(f23542b + 1);
        dArr[f23542b] = d6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@d5.d double[] dArr) {
        l0.p(dArr, ProtectedSandApp.s("䆕"));
        return dArr.length;
    }

    @d5.d
    public final double[] j() {
        return g(this.f23657d, new double[f()]);
    }
}
