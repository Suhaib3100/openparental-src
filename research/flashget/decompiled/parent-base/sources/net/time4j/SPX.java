package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.n0;
import net.time4j.n;

/* loaded from: classes7.dex */
final class SPX implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    static final int f81801d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final int f81802e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final int f81803f = 3;

    /* renamed from: g, reason: collision with root package name */
    static final int f81804g = 4;

    /* renamed from: h, reason: collision with root package name */
    static final int f81805h = 5;

    /* renamed from: i, reason: collision with root package name */
    static final int f81806i = 6;

    /* renamed from: j, reason: collision with root package name */
    static final int f81807j = 7;

    /* renamed from: k, reason: collision with root package name */
    static final int f81808k = 8;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f81809b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f81810c;

    public SPX() {
    }

    private l0 a(DataInput dataInput, byte b5) throws IOException {
        int readByte;
        int i4 = b5 & com.google.common.base.c.f54871q;
        byte readByte2 = dataInput.readByte();
        int i5 = (readByte2 >> 5) & 3;
        int i6 = readByte2 & com.google.common.base.c.I;
        if (i5 == 1) {
            readByte = dataInput.readByte() + 1978;
        } else if (i5 == 2) {
            readByte = dataInput.readShort();
        } else {
            if (i5 != 3) {
                throw new StreamCorruptedException(ProtectedSandApp.s("襲\u0001"));
            }
            readByte = dataInput.readInt();
        }
        return l0.v1(readByte, e0.valueOf(i4), i6);
    }

    private Object b(ObjectInput objectInput, byte b5) throws IOException, ClassNotFoundException {
        boolean z4 = (b5 & 1) == 1;
        if ((b5 & 2) == 2) {
            return new n.b(z4, n.v((Map) objectInput.readObject()));
        }
        String readUTF = objectInput.readUTF();
        String readUTF2 = objectInput.readUTF();
        int indexOf = readUTF.indexOf(ProtectedSandApp.s("襳\u0001"));
        return new n.b(z4, indexOf == -1 ? new Locale(readUTF) : new Locale(readUTF.substring(0, indexOf), readUTF.substring(indexOf + 1)), readUTF2);
    }

    private Object c(ObjectInput objectInput, byte b5) throws IOException, ClassNotFoundException {
        boolean z4 = (b5 & com.google.common.base.c.f54871q) == 1;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return p.f0();
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(n0.a.c(z4 ? objectInput.readLong() : objectInput.readInt(), (z) objectInput.readObject()));
        }
        return new p(arrayList, objectInput.readBoolean());
    }

    private Object d(ObjectInput objectInput, byte b5) throws IOException {
        net.time4j.scale.f fVar = (b5 & 1) == 1 ? net.time4j.scale.f.UTC : net.time4j.scale.f.POSIX;
        long readLong = objectInput.readLong();
        int readInt = (b5 & 2) == 2 ? objectInput.readInt() : 0;
        return fVar == net.time4j.scale.f.UTC ? b0.E(readLong, readInt) : b0.A(readLong, readInt);
    }

    private Object e(DataInput dataInput, byte b5) throws IOException {
        return d0.b1(dataInput, (b5 & 1) != 0, ((b5 & 2) >>> 1) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private m0 f(DataInput dataInput) throws IOException {
        int readInt;
        byte readByte = dataInput.readByte();
        if (readByte < 0) {
            return m0.a1(~readByte);
        }
        int readByte2 = dataInput.readByte();
        byte b5 = 0;
        if (readByte2 < 0) {
            readByte2 = ~readByte2;
            readInt = 0;
        } else {
            byte readByte3 = dataInput.readByte();
            if (readByte3 < 0) {
                b5 = ~readByte3;
                readInt = 0;
            } else {
                readInt = dataInput.readInt();
                b5 = readByte3;
            }
        }
        return m0.d1(readByte, readByte2, b5, readInt);
    }

    private Object g(DataInput dataInput, byte b5) throws IOException {
        return n0.B0(a(dataInput, b5), f(dataInput));
    }

    private Object h(DataInput dataInput, byte b5) throws IOException {
        byte readByte = dataInput.readByte();
        g1 valueOf = g1.valueOf(readByte >> 4);
        int i4 = readByte & com.google.common.base.c.f54871q;
        g1 g1Var = g1.SATURDAY;
        g1 g1Var2 = g1.SUNDAY;
        if ((b5 & com.google.common.base.c.f54871q) == 1) {
            byte readByte2 = dataInput.readByte();
            g1Var = g1.valueOf(readByte2 >> 4);
            g1Var2 = g1.valueOf(readByte2 & com.google.common.base.c.f54871q);
        }
        return i1.m(valueOf, i4, g1Var, g1Var2);
    }

    private void i(DataOutput dataOutput) throws IOException {
        j((l0) this.f81809b, 1, dataOutput);
    }

    private static void j(l0 l0Var, int i4, DataOutput dataOutput) throws IOException {
        int o4 = l0Var.o();
        int i5 = (o4 < 1850 || o4 > 2100) ? Math.abs(o4) < 10000 ? 2 : 3 : 1;
        dataOutput.writeByte((i4 << 4) | l0Var.q());
        dataOutput.writeByte(l0Var.t() | (i5 << 5));
        if (i5 == 1) {
            dataOutput.writeByte(o4 - 1978);
        } else if (i5 == 2) {
            dataOutput.writeShort(o4);
        } else {
            dataOutput.writeInt(o4);
        }
    }

    private void k(ObjectOutput objectOutput) throws IOException {
        n.b bVar = (n.b) n.b.class.cast(this.f81809b);
        Locale H = bVar.H();
        int i4 = bVar.M() ? 113 : 112;
        if (H == null) {
            i4 |= 2;
        }
        objectOutput.writeByte(i4);
        if (H == null) {
            objectOutput.writeObject(bVar.D());
            return;
        }
        String language = H.getLanguage();
        if (!H.getCountry().isEmpty()) {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(language, ProtectedSandApp.s("襳\u0001"));
            a5.append(H.getCountry());
            language = a5.toString();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(bVar.z());
    }

    private void l(ObjectOutput objectOutput) throws IOException {
        boolean z4;
        p pVar = (p) p.class.cast(this.f81809b);
        int size = pVar.f().size();
        int min = Math.min(size, 6);
        int i4 = 0;
        while (true) {
            if (i4 >= min) {
                z4 = false;
                break;
            } else {
                if (((n0.a) pVar.f().get(i4)).a() >= 1000) {
                    z4 = true;
                    break;
                }
                i4++;
            }
        }
        objectOutput.writeByte(z4 ? 97 : 96);
        objectOutput.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            n0.a aVar = (n0.a) pVar.f().get(i5);
            if (z4) {
                objectOutput.writeLong(aVar.a());
            } else {
                objectOutput.writeInt((int) aVar.a());
            }
            objectOutput.writeObject(aVar.b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(pVar.d());
        }
    }

    private void m(ObjectOutput objectOutput) throws IOException {
        b0 b0Var = (b0) b0.class.cast(this.f81809b);
        int i4 = b0Var.m() == net.time4j.scale.f.UTC ? 81 : 80;
        if (b0Var.l() == 0) {
            objectOutput.writeByte(i4);
            objectOutput.writeLong(b0Var.n());
        } else {
            objectOutput.writeByte(i4 | 2);
            objectOutput.writeLong(b0Var.n());
            objectOutput.writeInt(b0Var.l());
        }
    }

    private void n(DataOutput dataOutput) throws IOException {
        ((d0) this.f81809b).o1(dataOutput);
    }

    private void o(DataOutput dataOutput) throws IOException {
        m0 m0Var = (m0) this.f81809b;
        dataOutput.writeByte(32);
        p(m0Var, dataOutput);
    }

    private static void p(m0 m0Var, DataOutput dataOutput) throws IOException {
        if (m0Var.a() != 0) {
            dataOutput.writeByte(m0Var.u());
            dataOutput.writeByte(m0Var.m());
            dataOutput.writeByte(m0Var.h());
            dataOutput.writeInt(m0Var.a());
            return;
        }
        if (m0Var.h() != 0) {
            dataOutput.writeByte(m0Var.u());
            dataOutput.writeByte(m0Var.m());
            dataOutput.writeByte(~m0Var.h());
        } else if (m0Var.m() == 0) {
            dataOutput.writeByte(~m0Var.u());
        } else {
            dataOutput.writeByte(m0Var.u());
            dataOutput.writeByte(~m0Var.m());
        }
    }

    private void q(DataOutput dataOutput) throws IOException {
        n0 n0Var = (n0) this.f81809b;
        j(n0Var.k0(), 8, dataOutput);
        p(n0Var.m0(), dataOutput);
    }

    private void r(DataOutput dataOutput) throws IOException {
        i1 i1Var = (i1) this.f81809b;
        boolean z4 = i1Var.i() == g1.SATURDAY && i1Var.e() == g1.SUNDAY;
        dataOutput.writeByte(!z4 ? 49 : 48);
        dataOutput.writeByte((i1Var.f().getValue() << 4) | i1Var.h());
        if (z4) {
            return;
        }
        dataOutput.writeByte(i1Var.e().getValue() | (i1Var.i().getValue() << 4));
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f81809b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 1:
                this.f81809b = a(objectInput, readByte);
                return;
            case 2:
                this.f81809b = f(objectInput);
                return;
            case 3:
                this.f81809b = h(objectInput, readByte);
                return;
            case 4:
                this.f81809b = e(objectInput, readByte);
                return;
            case 5:
                this.f81809b = d(objectInput, readByte);
                return;
            case 6:
                this.f81809b = c(objectInput, readByte);
                return;
            case 7:
                this.f81809b = b(objectInput, readByte);
                return;
            case 8:
                this.f81809b = g(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException(ProtectedSandApp.s("襴\u0001"));
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        switch (this.f81810c) {
            case 1:
                i(objectOutput);
                return;
            case 2:
                o(objectOutput);
                return;
            case 3:
                r(objectOutput);
                return;
            case 4:
                n(objectOutput);
                return;
            case 5:
                m(objectOutput);
                return;
            case 6:
                l(objectOutput);
                return;
            case 7:
                k(objectOutput);
                return;
            case 8:
                q(objectOutput);
                return;
            default:
                throw new InvalidClassException(ProtectedSandApp.s("襴\u0001"));
        }
    }

    SPX(Object obj, int i4) {
        this.f81809b = obj;
        this.f81810c = i4;
    }
}
