package hd;

import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.f;

/* compiled from: bitwiseOperations.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0007\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0001\u001a\u00020\bH\u0087\f¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\u0001\u001a\u00020\bH\u0087\f¢\u0006\u0004\b\u000b\u0010\n\u001a\u001c\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\u0001\u001a\u00020\bH\u0087\f¢\u0006\u0004\b\f\u0010\n\u001a\u0014\u0010\r\u001a\u00020\b*\u00020\bH\u0087\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "other", "a", "(BB)B", "e", "g", "c", "(B)B", "", "b", "(SS)S", "f", "h", "d", "(S)S", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    @c1(version = "1.1")
    @f
    private static final byte a(byte b5, byte b6) {
        return (byte) (b5 & b6);
    }

    @c1(version = "1.1")
    @f
    private static final short b(short s4, short s5) {
        return (short) (s4 & s5);
    }

    @c1(version = "1.1")
    @f
    private static final byte c(byte b5) {
        return (byte) (~b5);
    }

    @c1(version = "1.1")
    @f
    private static final short d(short s4) {
        return (short) (~s4);
    }

    @c1(version = "1.1")
    @f
    private static final byte e(byte b5, byte b6) {
        return (byte) (b5 | b6);
    }

    @c1(version = "1.1")
    @f
    private static final short f(short s4, short s5) {
        return (short) (s4 | s5);
    }

    @c1(version = "1.1")
    @f
    private static final byte g(byte b5, byte b6) {
        return (byte) (b5 ^ b6);
    }

    @c1(version = "1.1")
    @f
    private static final short h(short s4, short s5) {
        return (short) (s4 ^ s5);
    }
}
