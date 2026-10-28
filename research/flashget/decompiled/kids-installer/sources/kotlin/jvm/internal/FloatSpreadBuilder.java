package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/FloatSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "size", "", "(I)V", "values", "add", "", "value", "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.b0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final float[] f23535d;

    public FloatSpreadBuilder(int i5) {
        super(i5);
        this.f23535d = new float[i5];
    }

    public final void h(float f6) {
        float[] fArr = this.f23535d;
        int f23542b = getF23542b();
        e(f23542b + 1);
        fArr[f23542b] = f6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@d5.d float[] fArr) {
        l0.p(fArr, ProtectedSandApp.s("䅒"));
        return fArr.length;
    }

    @d5.d
    public final float[] j() {
        return g(this.f23535d, new float[f()]);
    }
}
