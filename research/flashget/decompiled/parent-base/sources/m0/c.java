package m0;

import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;

/* compiled from: VelocityTracker.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u0006/"}, d2 = {"Lm0/c;", "", "", "isDataDifferential", "Lm0/c$a;", "strategy", "<init>", "(ZLm0/c$a;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "Lkotlin/k2;", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "f", "()V", "Z", "e", "()Z", "Lm0/c$a;", "I", "minSampleSize", "", "Lm0/a;", "[Lm0/a;", "samples", "index", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final int f81470i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final a strategy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final m0.a[] samples;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final float[] reusableDataPointsArray;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final float[] reusableTimeArray;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final float[] reusableVelocityCoefficients;

    /* compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lm0/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        Lsq2,
        Impulse
    }

    /* compiled from: VelocityTracker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81479a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81479a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return e.n(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i4 = (this.index + 1) % 20;
        this.index = i4;
        e.p(this.samples, i4, timeMillis, dataPoint);
    }

    public final float c() {
        float g4;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i4 = this.index;
        m0.a aVar = this.samples[i4];
        if (aVar == null) {
            return 0.0f;
        }
        int i5 = 0;
        m0.a aVar2 = aVar;
        while (true) {
            m0.a aVar3 = this.samples[i4];
            if (aVar3 != null) {
                float f4 = aVar.f() - aVar3.f();
                float abs = Math.abs(aVar3.f() - aVar2.f());
                if (f4 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i5] = aVar3.e();
                fArr2[i5] = -f4;
                if (i4 == 0) {
                    i4 = 20;
                }
                i4--;
                i5++;
                if (i5 >= 20) {
                    break;
                }
                aVar2 = aVar3;
            } else {
                break;
            }
        }
        if (i5 < this.minSampleSize) {
            return 0.0f;
        }
        int i6 = b.f81479a[this.strategy.ordinal()];
        if (i6 == 1) {
            g4 = e.g(fArr, fArr2, i5, this.isDataDifferential);
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g4 = b(fArr, fArr2, i5);
        }
        return g4 * 1000;
    }

    public final float d(float maximumVelocity) {
        if (maximumVelocity <= 0.0f) {
            throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + maximumVelocity).toString());
        }
        float c5 = c();
        if (c5 == 0.0f) {
            return 0.0f;
        }
        return c5 > 0.0f ? s.A(c5, maximumVelocity) : s.t(c5, -maximumVelocity);
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDataDifferential() {
        return this.isDataDifferential;
    }

    public final void f() {
        kotlin.collections.l.V1(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public c(boolean z4, @l a aVar) {
        this.isDataDifferential = z4;
        this.strategy = aVar;
        if (z4 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i4 = b.f81479a[aVar.ordinal()];
        int i5 = 2;
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = 3;
        }
        this.minSampleSize = i5;
        this.samples = new m0.a[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ c(boolean z4, a aVar, int i4, w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? a.Lsq2 : aVar);
    }

    public c(boolean z4) {
        this(z4, a.Impulse);
    }
}
