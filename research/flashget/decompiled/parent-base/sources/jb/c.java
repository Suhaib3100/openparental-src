package jb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NtpPackets.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljb/c;", "", "Ljava/nio/ByteBuffer;", "packetBuffer", "Ljb/b;", "b", "(Ljava/nio/ByteBuffer;)Ljb/b;", "packet", "a", "(Ljb/b;)Ljava/nio/ByteBuffer;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface c {

    /* compiled from: NtpPackets.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ#\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljb/c$a;", "Ljb/c;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "", "position", "", "c", "(Ljava/nio/ByteBuffer;I)D", "d", "seconds", "e", "(Ljava/nio/ByteBuffer;ID)Ljava/nio/ByteBuffer;", "f", "packetBuffer", "Ljb/b;", "b", "(Ljava/nio/ByteBuffer;)Ljb/b;", "packet", "a", "(Ljb/b;)Ljava/nio/ByteBuffer;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final int f74640b = 48;

        private final double c(ByteBuffer byteBuffer, int i4) {
            return jb.a.a(byteBuffer, i4) + jb.a.b(byteBuffer, i4 + 2);
        }

        private final double d(ByteBuffer byteBuffer, int i4) {
            return jb.a.c(byteBuffer, i4) + jb.a.d(byteBuffer, i4 + 4);
        }

        private final ByteBuffer e(ByteBuffer byteBuffer, int i4, double d5) {
            int i5 = (int) d5;
            return jb.a.f(jb.a.e(byteBuffer, i4, i5), i4 + 2, d5 - i5);
        }

        private final ByteBuffer f(ByteBuffer byteBuffer, int i4, double d5) {
            long j4 = (long) d5;
            return jb.a.h(jb.a.g(byteBuffer, i4, j4), i4 + 4, d5 - j4);
        }

        @Override // jb.c
        @l
        public ByteBuffer a(@l b packet) {
            l0.p(packet, ProtectedSandApp.s("㡉\u0001"));
            ByteBuffer put = ByteBuffer.allocate(48).put(0, (byte) ((packet.z() << 6) | (packet.s() << 3) | packet.r())).put(1, packet.x()).put(2, packet.o()).put(3, packet.q());
            l0.o(put, ProtectedSandApp.s("㡊\u0001"));
            return f(f(f(f(e(e(put, 4, packet.v()), 8, packet.w()), 16, packet.u()), 24, packet.p()), 32, packet.t()), 40, packet.y());
        }

        @Override // jb.c
        @l
        public b b(@l ByteBuffer packetBuffer) {
            l0.p(packetBuffer, ProtectedSandApp.s("㡋\u0001"));
            return new b((byte) ((packetBuffer.get(0) >> 6) & 3), (byte) ((packetBuffer.get(0) >> 3) & 7), (byte) (packetBuffer.get(0) & 7), packetBuffer.get(1), packetBuffer.get(2), packetBuffer.get(3), c(packetBuffer, 4), c(packetBuffer, 8), d(packetBuffer, 16), d(packetBuffer, 24), d(packetBuffer, 32), d(packetBuffer, 40));
        }
    }

    @l
    ByteBuffer a(@l b packet);

    @l
    b b(@l ByteBuffer packetBuffer);
}
