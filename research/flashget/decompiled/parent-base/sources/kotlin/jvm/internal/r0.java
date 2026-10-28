package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: PrimitiveSpreadBuilders.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/jvm/internal/r0;", "Lkotlin/jvm/internal/c1;", "", "", "size", "<init>", "(I)V", "i", "([J)I", "", "value", "Lkotlin/k2;", "h", "(J)V", "j", "()[J", "d", "[J", "values", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r0 extends c1<long[]> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final long[] values;

    public r0(int i4) {
        super(i4);
        this.values = new long[i4];
    }

    public final void h(long value) {
        long[] jArr = this.values;
        int position = getPosition();
        e(position + 1);
        jArr[position] = value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.c1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@fg.l long[] jArr) {
        l0.p(jArr, ProtectedSandApp.s("擾\u0001"));
        return jArr.length;
    }

    @fg.l
    public final long[] j() {
        return g(this.values, new long[f()]);
    }
}
