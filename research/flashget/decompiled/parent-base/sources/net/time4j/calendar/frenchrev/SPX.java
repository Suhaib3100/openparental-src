package net.time4j.calendar.frenchrev;

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
    static final int f82453d = 18;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f82454b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f82455c;

    public SPX() {
    }

    private c a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        int readInt = objectInput.readInt();
        short readShort = objectInput.readShort();
        if (readShort > 360) {
            return c.Q0(readInt, f.valueOf(readShort - 360));
        }
        int i4 = readShort - 1;
        return c.O0(readInt, (i4 / 30) + 1, (i4 % 30) + 1);
    }

    private void b(ObjectOutput objectOutput) throws IOException {
        c cVar = (c) this.f82454b;
        objectOutput.writeInt(cVar.o());
        objectOutput.writeShort(cVar.A0());
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f82454b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        if (objectInput.readByte() != 18) {
            throw new InvalidObjectException(ProtectedSandApp.s("踊\u0001"));
        }
        this.f82454b = a(objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f82455c);
        if (this.f82455c != 18) {
            throw new InvalidClassException(ProtectedSandApp.s("踋\u0001"));
        }
        b(objectOutput);
    }

    SPX(Object obj, int i4) {
        this.f82454b = obj;
        this.f82455c = i4;
    }
}
