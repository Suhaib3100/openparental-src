package kb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: Udp.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\b\nJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkb/b;", "", "Ljava/net/SocketAddress;", "address", "Ljava/nio/ByteBuffer;", "request", "response", "Lkb/b$b;", "a", "(Ljava/net/SocketAddress;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Lkb/b$b;", "b", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: Udp.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkb/b$a;", "Lkb/b;", "<init>", "()V", "Ljava/net/SocketAddress;", "address", "Ljava/nio/ByteBuffer;", "request", "response", "Lkb/b$b;", "a", "(Ljava/net/SocketAddress;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Lkb/b$b;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f74813b = (int) TimeUnit.SECONDS.toMillis(3);

        @Override // kb.b
        @l
        public EnumC1045b a(@l SocketAddress address, @l ByteBuffer request, @l ByteBuffer response) {
            l0.p(address, ProtectedSandApp.s("㡎\u0001"));
            l0.p(request, ProtectedSandApp.s("㡏\u0001"));
            l0.p(response, ProtectedSandApp.s("㡐\u0001"));
            DatagramPacket datagramPacket = new DatagramPacket(request.array(), request.capacity(), address);
            DatagramPacket datagramPacket2 = new DatagramPacket(response.array(), response.capacity());
            try {
                DatagramSocket datagramSocket = new DatagramSocket();
                try {
                    datagramSocket.setSoTimeout(f74813b);
                    datagramSocket.send(datagramPacket);
                    datagramSocket.receive(datagramPacket2);
                    k2 k2Var = k2.f75408a;
                    kotlin.io.b.a(datagramSocket, null);
                    return EnumC1045b.Success;
                } finally {
                }
            } catch (Exception unused) {
                return EnumC1045b.Failure;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Udp.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkb/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "Failure", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kb.b$b, reason: collision with other inner class name */
    public static final class EnumC1045b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnumC1045b[] $VALUES;
        public static final EnumC1045b Success = new EnumC1045b(ProtectedSandApp.s("㡑\u0001"), 0);
        public static final EnumC1045b Failure = new EnumC1045b(ProtectedSandApp.s("㡒\u0001"), 1);

        private static final /* synthetic */ EnumC1045b[] $values() {
            return new EnumC1045b[]{Success, Failure};
        }

        static {
            EnumC1045b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private EnumC1045b(String str, int i4) {
        }

        @l
        public static kotlin.enums.a<EnumC1045b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC1045b valueOf(String str) {
            return (EnumC1045b) Enum.valueOf(EnumC1045b.class, str);
        }

        public static EnumC1045b[] values() {
            return (EnumC1045b[]) $VALUES.clone();
        }
    }

    @l
    EnumC1045b a(@l SocketAddress address, @l ByteBuffer request, @l ByteBuffer response);
}
