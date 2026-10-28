package net.time4j.calendar.hindu;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;

/* loaded from: classes7.dex */
final class SPX implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    static final int f82493d = 20;

    /* renamed from: e, reason: collision with root package name */
    static final int f82494e = 21;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f82495b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f82496c;

    public SPX() {
    }

    private d a(ObjectInput objectInput) throws IOException {
        j e4 = j.e(objectInput.readUTF());
        return e4.f().e(objectInput.readLong());
    }

    private j b(ObjectInput objectInput) throws IOException {
        return j.e(objectInput.readUTF());
    }

    private void c(ObjectOutput objectOutput) throws IOException {
        d dVar = (d) this.f82495b;
        objectOutput.writeUTF(dVar.getVariant());
        objectOutput.writeLong(dVar.b());
    }

    private void d(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(((j) this.f82495b).getVariant());
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f82495b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        if (readByte == 20) {
            this.f82495b = a(objectInput);
        } else {
            if (readByte != 21) {
                throw new InvalidObjectException(ProtectedSandApp.s("邀\u0001"));
            }
            this.f82495b = b(objectInput);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f82496c);
        int i4 = this.f82496c;
        if (i4 == 20) {
            c(objectOutput);
        } else {
            if (i4 != 21) {
                throw new InvalidClassException(ProtectedSandApp.s("邁\u0001"));
            }
            d(objectOutput);
        }
    }

    SPX(Object obj, int i4) {
        this.f82495b = obj;
        this.f82496c = i4;
    }
}
