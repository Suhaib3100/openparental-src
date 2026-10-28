package m3;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* compiled from: bitwiseOperations.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f¨\u0006\u0007"}, d2 = {"and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte a(byte b6, byte b7) {
        return (byte) (b6 & b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short b(short s5, short s6) {
        return (short) (s5 & s6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte c(byte b6) {
        return (byte) (~b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short d(short s5) {
        return (short) (~s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte e(byte b6, byte b7) {
        return (byte) (b6 | b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short f(short s5, short s6) {
        return (short) (s5 | s6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte g(byte b6, byte b7) {
        return (byte) (b6 ^ b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short h(short s5, short s6) {
        return (short) (s5 ^ s6);
    }
}
