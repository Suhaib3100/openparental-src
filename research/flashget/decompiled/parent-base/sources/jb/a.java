package jb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.g2;
import kotlin.jvm.internal.l0;

/* compiled from: ByteBuffer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0007\u001a#\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Ljava/nio/ByteBuffer;", "", "position", "a", "(Ljava/nio/ByteBuffer;I)I", "", "b", "(Ljava/nio/ByteBuffer;I)D", "value", "e", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "f", "(Ljava/nio/ByteBuffer;ID)Ljava/nio/ByteBuffer;", "", "c", "(Ljava/nio/ByteBuffer;I)J", "d", "g", "(Ljava/nio/ByteBuffer;IJ)Ljava/nio/ByteBuffer;", "h", "kronos-java"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {
    public static final int a(@l ByteBuffer byteBuffer, int i4) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return byteBuffer.getShort(i4) & g2.f75095e;
    }

    public static final double b(@l ByteBuffer byteBuffer, int i4) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return a(byteBuffer, i4) / 65536;
    }

    public static final long c(@l ByteBuffer byteBuffer, int i4) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return byteBuffer.getInt(i4) & 4294967295L;
    }

    public static final double d(@l ByteBuffer byteBuffer, int i4) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return c(byteBuffer, i4) / 4294967296L;
    }

    @l
    public static final ByteBuffer e(@l ByteBuffer byteBuffer, int i4, int i5) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        ByteBuffer putShort = byteBuffer.putShort(i4, (short) i5);
        l0.o(putShort, ProtectedSandApp.s("㠪\u0001"));
        return putShort;
    }

    @l
    public static final ByteBuffer f(@l ByteBuffer byteBuffer, int i4, double d5) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return e(byteBuffer, i4, (int) (d5 * 65536));
    }

    @l
    public static final ByteBuffer g(@l ByteBuffer byteBuffer, int i4, long j4) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        ByteBuffer putInt = byteBuffer.putInt(i4, (int) j4);
        l0.o(putInt, ProtectedSandApp.s("㠫\u0001"));
        return putInt;
    }

    @l
    public static final ByteBuffer h(@l ByteBuffer byteBuffer, int i4, double d5) {
        l0.p(byteBuffer, ProtectedSandApp.s("㠩\u0001"));
        return g(byteBuffer, i4, (long) (d5 * 4294967296L));
    }
}
