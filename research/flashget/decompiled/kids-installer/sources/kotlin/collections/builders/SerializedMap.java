package kotlin.collections.builders;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.apache.commons.io.k;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "()V", "map", "", "(Ljava/util/Map;)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.builders.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f23120p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    private static final long f23121q = 0;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private Map<?, ?> f23122o;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.i$a */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public SerializedMap(@d5.d Map<?, ?> map) {
        l0.p(map, ProtectedSandApp.s("㞇"));
        this.f23122o = map;
    }

    private final Object a() {
        return this.f23122o;
    }

    @Override // java.io.Externalizable
    public void readExternal(@d5.d ObjectInput input) {
        Map<?, ?> d6;
        l0.p(input, ProtectedSandApp.s("㞈"));
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(s.a(ProtectedSandApp.s("㞊"), readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(ProtectedSandApp.s("㞉") + readInt + k.f32026a);
        }
        MapBuilder mapBuilder = new MapBuilder(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        d6 = e1.d(mapBuilder);
        this.f23122o = d6;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@d5.d ObjectOutput output) {
        l0.p(output, ProtectedSandApp.s("㞋"));
        output.writeByte(0);
        output.writeInt(this.f23122o.size());
        for (Map.Entry<?, ?> entry : this.f23122o.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializedMap() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.c1.z()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedMap.<init>():void");
    }
}
