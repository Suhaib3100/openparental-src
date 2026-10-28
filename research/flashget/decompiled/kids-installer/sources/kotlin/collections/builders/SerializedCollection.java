package kotlin.collections.builders;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.p1;
import kotlin.collections.z;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.apache.commons.io.k;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "()V", "collection", "", "tag", "", "(Ljava/util/Collection;I)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* renamed from: kotlin.collections.builders.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f23114q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final long f23115r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f23116s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f23117t = 1;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private Collection<?> f23118o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23119p;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "()V", "serialVersionUID", "", "tagList", "", "tagSet", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.h$a */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public SerializedCollection() {
        this(EmptyList.f23167o, 0);
    }

    private final Object a() {
        return this.f23118o;
    }

    @Override // java.io.Externalizable
    public void readExternal(@d5.d ObjectInput input) {
        Collection<?> a6;
        l0.p(input, ProtectedSandApp.s("㞂"));
        byte readByte = input.readByte();
        int i5 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(ProtectedSandApp.s("㞅") + ((int) readByte) + k.f32026a);
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(ProtectedSandApp.s("㞄") + readInt + k.f32026a);
        }
        int i6 = 0;
        if (i5 == 0) {
            ListBuilder listBuilder = new ListBuilder(readInt);
            while (i6 < readInt) {
                listBuilder.add(input.readObject());
                i6++;
            }
            a6 = z.a(listBuilder);
        } else {
            if (i5 != 1) {
                throw new InvalidObjectException(ProtectedSandApp.s("㞃") + i5 + k.f32026a);
            }
            SetBuilder setBuilder = new SetBuilder(readInt);
            while (i6 < readInt) {
                setBuilder.add(input.readObject());
                i6++;
            }
            a6 = p1.a(setBuilder);
        }
        this.f23118o = a6;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@d5.d ObjectOutput output) {
        l0.p(output, ProtectedSandApp.s("㞆"));
        output.writeByte(this.f23119p);
        output.writeInt(this.f23118o.size());
        Iterator<?> it = this.f23118o.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection(@d5.d Collection<?> collection, int i5) {
        l0.p(collection, ProtectedSandApp.s("㞁"));
        this.f23118o = collection;
        this.f23119p = i5;
    }
}
