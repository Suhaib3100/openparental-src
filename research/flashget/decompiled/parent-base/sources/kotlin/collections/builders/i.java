package kotlin.collections.builders;

import androidx.compose.animation.core.a2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\bB\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/i;", "Ljava/io/Externalizable;", "", "map", "<init>", "(Ljava/util/Map;)V", "()V", "", "a", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Lkotlin/k2;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "b", "Ljava/util/Map;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class i implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f74881d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<?, ?> map;

    public i(@l Map<?, ?> map) {
        l0.p(map, ProtectedSandApp.s("惿\u0001"));
        this.map = map;
    }

    private final Object a() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@l ObjectInput input) {
        l0.p(input, ProtectedSandApp.s("愀\u0001"));
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(android.support.v4.media.a.a(ProtectedSandApp.s("愂\u0001"), readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a2.a(ProtectedSandApp.s("愁\u0001"), readInt, '.'));
        }
        d dVar = new d(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            dVar.put(input.readObject(), input.readObject());
        }
        this.map = z0.d(dVar);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@l ObjectOutput output) {
        l0.p(output, ProtectedSandApp.s("愃\u0001"));
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public i() {
        this(z0.z());
    }
}
