package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/jvm/internal/y;", "Lkotlin/jvm/internal/c1;", "", "", "size", "<init>", "(I)V", "i", "([D)I", "", "value", "Lkotlin/k2;", "h", "(D)V", "j", "()[D", "d", "[D", "values", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class y extends c1<double[]> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final double[] values;

    public y(int i4) {
        super(i4);
        this.values = new double[i4];
    }

    public final void h(double value) {
        double[] dArr = this.values;
        int position = getPosition();
        e(position + 1);
        dArr[position] = value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.c1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@fg.l double[] dArr) {
        l0.p(dArr, ProtectedSandApp.s("敹\u0001"));
        return dArr.length;
    }

    @fg.l
    public final double[] j() {
        return g(this.values, new double[f()]);
    }
}
