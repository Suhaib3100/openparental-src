package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.StreamCorruptedException;

/* loaded from: classes7.dex */
final class SPX implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    static final int f83545d = 12;

    /* renamed from: e, reason: collision with root package name */
    static final int f83546e = 13;

    /* renamed from: f, reason: collision with root package name */
    static final int f83547f = 14;

    /* renamed from: g, reason: collision with root package name */
    static final int f83548g = 15;
    private static final long serialVersionUID = -1000776907354520172L;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f83549b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f83550c;

    public SPX() {
    }

    private Object a(ObjectInput objectInput, byte b5) throws IOException, ClassNotFoundException {
        return new a((k) objectInput.readObject(), (l) objectInput.readObject());
    }

    private Object b(ObjectInput objectInput, byte b5) throws IOException {
        return p.p(objectInput.readInt(), (b5 & com.google.common.base.c.f54871q) == 1 ? objectInput.readInt() : 0);
    }

    private Object c(byte b5) {
        int i4 = b5 & com.google.common.base.c.f54871q;
        return n.e(b.values()[i4 / 2], g.values()[i4 % 2]);
    }

    private Object d(ObjectInput objectInput, byte b5) throws IOException, ClassNotFoundException {
        k kVar = (k) objectInput.readObject();
        m mVar = (m) objectInput.readObject();
        o oVar = l.f83557e;
        if ((b5 & com.google.common.base.c.f54871q) == 1) {
            oVar = (o) objectInput.readObject();
        }
        return new c(kVar, mVar, oVar);
    }

    private void e(ObjectOutput objectOutput) throws IOException {
        a aVar = (a) this.f83549b;
        objectOutput.writeByte(192);
        objectOutput.writeObject(aVar.G());
        objectOutput.writeObject(aVar.i0());
    }

    private void f(ObjectOutput objectOutput) throws IOException {
        p pVar = (p) this.f83549b;
        boolean z4 = pVar.h() != 0;
        objectOutput.writeByte(z4 ? 241 : 240);
        objectOutput.writeInt(pVar.i());
        if (z4) {
            objectOutput.writeInt(pVar.h());
        }
    }

    private void g(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(((n) this.f83549b).d() | 208);
    }

    private void h(ObjectOutput objectOutput) throws IOException {
        c cVar = (c) this.f83549b;
        boolean z4 = cVar.O() != l.f83557e;
        objectOutput.writeByte(z4 ? 225 : 224);
        objectOutput.writeObject(cVar.G());
        objectOutput.writeObject(cVar.F());
        if (z4) {
            objectOutput.writeObject(cVar.O());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f83549b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 12:
                this.f83549b = a(objectInput, readByte);
                return;
            case 13:
                this.f83549b = c(readByte);
                return;
            case 14:
                this.f83549b = d(objectInput, readByte);
                return;
            case 15:
                this.f83549b = b(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException(ProtectedSandApp.s("顪\u0001"));
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        switch (this.f83550c) {
            case 12:
                e(objectOutput);
                return;
            case 13:
                g(objectOutput);
                return;
            case 14:
                h(objectOutput);
                return;
            case 15:
                f(objectOutput);
                return;
            default:
                throw new InvalidClassException(ProtectedSandApp.s("顪\u0001"));
        }
    }

    SPX(Object obj, int i4) {
        this.f83549b = obj;
        this.f83550c = i4;
    }
}
