package net.time4j.calendar.bahai;

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
    static final int f82371d = 19;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f82372b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f82373c;

    public SPX() {
    }

    private a a(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        byte readByte3 = objectInput.readByte();
        byte readByte4 = objectInput.readByte();
        return a.d1(readByte, readByte2, readByte3, readByte4 == 0 ? d.AYYAM_I_HA : e.valueOf(readByte4), objectInput.readByte());
    }

    private void b(ObjectOutput objectOutput) throws IOException {
        a aVar = (a) this.f82372b;
        objectOutput.writeByte(aVar.L0());
        objectOutput.writeByte(aVar.R0());
        objectOutput.writeByte(aVar.T0());
        objectOutput.writeByte(aVar.U0() ? aVar.O0().getValue() : 0);
        objectOutput.writeByte(aVar.F0());
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f82372b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readByte() != 19) {
            throw new InvalidObjectException(ProtectedSandApp.s("贁\u0001"));
        }
        this.f82372b = a(objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f82373c);
        if (this.f82373c != 19) {
            throw new InvalidClassException(ProtectedSandApp.s("贂\u0001"));
        }
        b(objectOutput);
    }

    SPX(Object obj, int i4) {
        this.f82372b = obj;
        this.f82373c = i4;
    }
}
