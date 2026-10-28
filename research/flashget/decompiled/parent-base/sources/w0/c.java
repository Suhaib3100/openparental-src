package w0;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: FontScaleConverterTable.android.kt */
@u(parameters = 0)
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lw0/c;", "Lw0/a;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "dp", "a", "(F)F", "sp", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "c", "()[F", "d", "()V", "mFromSpValues", "e", "f", "mToDpValues", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    public static final int f92862d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final float[] mFromSpValues;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final float[] mToDpValues;

    /* compiled from: FontScaleConverterTable.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw0/c$a;", "", "<init>", "()V", "", "sourceValue", "", "sourceValues", "targetValues", "b", "(F[F[F)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w0.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float sourceValue, float[] sourceValues, float[] targetValues) {
            float f4;
            float f5;
            float f6;
            float a5;
            float abs = Math.abs(sourceValue);
            float signum = Math.signum(sourceValue);
            int binarySearch = Arrays.binarySearch(sourceValues, abs);
            if (binarySearch >= 0) {
                a5 = targetValues[binarySearch];
            } else {
                int i4 = -(binarySearch + 1);
                int i5 = i4 - 1;
                float f7 = 0.0f;
                if (i5 >= sourceValues.length - 1) {
                    float f10 = sourceValues[sourceValues.length - 1];
                    float f11 = targetValues[sourceValues.length - 1];
                    if (f10 == 0.0f) {
                        return 0.0f;
                    }
                    return (f11 / f10) * sourceValue;
                }
                if (i5 == -1) {
                    float f12 = sourceValues[0];
                    f6 = targetValues[0];
                    f5 = f12;
                    f4 = 0.0f;
                } else {
                    float f13 = sourceValues[i5];
                    float f14 = sourceValues[i4];
                    f4 = targetValues[i5];
                    f7 = f13;
                    f5 = f14;
                    f6 = targetValues[i4];
                }
                a5 = d.f92865a.a(f4, f6, f7, f5, abs);
            }
            return signum * a5;
        }

        public Companion(w wVar) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public c(@l float[] fArr, @l float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @m1
    public static /* synthetic */ void d() {
    }

    @m1
    public static /* synthetic */ void f() {
    }

    @Override // w0.a
    public float a(float dp) {
        return INSTANCE.b(dp, this.mToDpValues, this.mFromSpValues);
    }

    @Override // w0.a
    public float b(float sp) {
        return INSTANCE.b(sp, this.mFromSpValues, this.mToDpValues);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Arrays.equals(this.mFromSpValues, cVar.mFromSpValues) && Arrays.equals(this.mToDpValues, cVar.mToDpValues);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mToDpValues) + (Arrays.hashCode(this.mFromSpValues) * 31);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        l0.o(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        l0.o(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
