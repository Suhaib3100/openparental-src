package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;

/* compiled from: boxing.kt */
@p3.i(name = "Boxing")
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\fH\u0001\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0012H\u0001\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0015H\u0001\u001a\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0018H\u0001¨\u0006\u0019"}, d2 = {"boxBoolean", "Ljava/lang/Boolean;", "primitive", "", "boxByte", "Ljava/lang/Byte;", "", "boxChar", "Ljava/lang/Character;", "", "boxDouble", "Ljava/lang/Double;", "", "boxFloat", "Ljava/lang/Float;", "", "boxInt", "Ljava/lang/Integer;", "", "boxLong", "Ljava/lang/Long;", "", "boxShort", "Ljava/lang/Short;", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Boolean a(boolean z5) {
        return Boolean.valueOf(z5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Byte b(byte b6) {
        return Byte.valueOf(b6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Character c(char c6) {
        return new Character(c6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Double d(double d6) {
        return new Double(d6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Float e(float f6) {
        return new Float(f6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Integer f(int i5) {
        return new Integer(i5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Long g(long j5) {
        return new Long(j5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static final Short h(short s5) {
        return new Short(s5);
    }
}
