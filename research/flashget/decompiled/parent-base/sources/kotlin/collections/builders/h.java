package kotlin.collections.builders;

import androidx.compose.animation.core.a2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\nB\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/h;", "Ljava/io/Externalizable;", "", "collection", "", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "", "a", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Lkotlin/k2;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "b", "Ljava/util/Collection;", "c", "I", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes7.dex */
public final class h implements Externalizable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f74875e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f74876f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f74877g = 1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Collection<?> collection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int tag;

    public h() {
        this(j0.f74919b, 0);
    }

    private final Object a() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@l ObjectInput input) {
        List a5;
        l0.p(input, ProtectedSandApp.s("惺\u0001"));
        byte readByte = input.readByte();
        int i4 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(a2.a(ProtectedSandApp.s("惽\u0001"), readByte, '.'));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a2.a(ProtectedSandApp.s("惼\u0001"), readInt, '.'));
        }
        int i5 = 0;
        if (i4 == 0) {
            b bVar = new b(readInt);
            while (i5 < readInt) {
                bVar.add(input.readObject());
                i5++;
            }
            a5 = w.a(bVar);
        } else {
            if (i4 != 1) {
                throw new InvalidObjectException(a2.a(ProtectedSandApp.s("惻\u0001"), i4, '.'));
            }
            j jVar = new j(readInt);
            while (i5 < readInt) {
                jVar.add(input.readObject());
                i5++;
            }
            a5 = l1.a(jVar);
        }
        this.collection = a5;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@l ObjectOutput output) {
        l0.p(output, ProtectedSandApp.s("惾\u0001"));
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public h(@l Collection<?> collection, int i4) {
        l0.p(collection, ProtectedSandApp.s("惹\u0001"));
        this.collection = collection;
        this.tag = i4;
    }
}
