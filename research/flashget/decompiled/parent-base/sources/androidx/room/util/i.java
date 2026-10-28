package androidx.room.util;

import androidx.annotation.c1;
import fg.l;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: UUIDUtil.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "UUIDUtil")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "bytes", "Ljava/util/UUID;", "a", "([B)Ljava/util/UUID;", "uuid", "b", "(Ljava/util/UUID;)[B", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    @l
    public static final UUID a(@l byte[] bytes) {
        l0.p(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    @l
    public static final byte[] b(@l UUID uuid) {
        l0.p(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        l0.o(array, "buffer.array()");
        return array;
    }
}
