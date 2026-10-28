package net.time4j.tz.model;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.e0;
import net.time4j.g1;
import net.time4j.m0;
import net.time4j.tz.p;
import net.time4j.tz.q;
import okio.r0;

/* loaded from: classes7.dex */
final class SPX implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    static final int f83582d = 120;

    /* renamed from: e, reason: collision with root package name */
    static final int f83583e = 121;

    /* renamed from: f, reason: collision with root package name */
    static final int f83584f = 122;

    /* renamed from: g, reason: collision with root package name */
    static final int f83585g = 125;

    /* renamed from: h, reason: collision with root package name */
    static final int f83586h = 126;

    /* renamed from: i, reason: collision with root package name */
    static final int f83587i = 127;

    /* renamed from: j, reason: collision with root package name */
    private static final long f83588j = -4575744000L;

    /* renamed from: k, reason: collision with root package name */
    private static final long f83589k = 22642848000L;

    /* renamed from: l, reason: collision with root package name */
    private static final long f83590l = 15040511099L;

    /* renamed from: m, reason: collision with root package name */
    private static final int f83591m = 0;
    private static final long serialVersionUID = 6526945678752534989L;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f83592b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f83593c;

    public SPX() {
    }

    private static Object a(ObjectInput objectInput) throws IOException {
        return new a(j(objectInput), false, false);
    }

    private static Object b(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        List<q> j4 = j(objectInput);
        return l.p(p.o(j4.get(0).f()), j4, h(objectInput), false, false);
    }

    private static d c(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        e0 valueOf = e0.valueOf((readByte & 255) >>> 4);
        int i4 = readByte & com.google.common.base.c.f54871q;
        i iVar = i.VALUES[i4 % 3];
        int i5 = i(i4);
        byte readByte2 = dataInput.readByte();
        int i6 = (readByte2 & 255) >>> 3;
        g1 valueOf2 = g1.valueOf(readByte2 & 7);
        byte readByte3 = dataInput.readByte();
        boolean z4 = ((readByte3 & 255) >>> 7) == 1;
        int i7 = readByte3 & r0.f85265a;
        if (i5 == -1) {
            i5 = f(dataInput);
        }
        return new c(valueOf, i6, valueOf2, i7 == 63 ? dataInput.readInt() : i7 * 1800, iVar, i5, z4);
    }

    private static d d(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        int i4 = (readByte & 255) >>> 4;
        int i5 = readByte & com.google.common.base.c.f54871q;
        i iVar = i.VALUES[i5 % 3];
        int i6 = i(i5);
        byte readByte2 = dataInput.readByte();
        int i7 = (readByte2 & 255) >>> 3;
        int n4 = n(readByte2 & 7);
        if (i6 == -1) {
            i6 = f(dataInput);
        }
        return new f(e0.valueOf(i4), i7, n4 == -1 ? dataInput.readInt() : n4, iVar, i6);
    }

    private static d e(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        e0 valueOf = e0.valueOf((readByte & 255) >>> 4);
        int i4 = readByte & com.google.common.base.c.f54871q;
        i iVar = i.VALUES[i4 % 3];
        int i5 = i(i4);
        byte readByte2 = dataInput.readByte();
        g1 valueOf2 = g1.valueOf((readByte2 & 255) >>> 5);
        int i6 = readByte2 & com.google.common.base.c.I;
        if (i5 == -1) {
            i5 = f(dataInput);
        }
        return new h(valueOf, valueOf2, i6 == 31 ? dataInput.readInt() : i6 * MMKV.ExpireInHour, iVar, i5);
    }

    private static int f(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? dataInput.readInt() : readByte * 900;
    }

    private static Object g(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        long readByte;
        if ((objectInput.readByte() & 255) == 255) {
            readByte = objectInput.readLong();
        } else {
            readByte = (((r0 << 16) + ((objectInput.readByte() & 255) << 8) + (255 & objectInput.readByte())) * 900) + f83588j;
        }
        return new j(new q(readByte, f(objectInput), f(objectInput), f(objectInput)), h(objectInput), false);
    }

    private static List<d> h(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        d d5;
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readByte);
        d dVar = null;
        int i4 = 0;
        while (i4 < readByte) {
            switch (objectInput.readByte()) {
                case 120:
                    d5 = d(objectInput);
                    break;
                case 121:
                    d5 = c(objectInput);
                    break;
                case 122:
                    d5 = e(objectInput);
                    break;
                default:
                    d5 = (d) objectInput.readObject();
                    break;
            }
            if (dVar != null && k.INSTANCE.compare(dVar, d5) >= 0) {
                throw new InvalidObjectException(ProtectedSandApp.s("飮\u0001"));
            }
            arrayList.add(d5);
            i4++;
            dVar = d5;
        }
        return arrayList;
    }

    private static int i(int i4) {
        int i5 = i4 / 3;
        if (i5 == 0) {
            return 0;
        }
        if (i5 != 1) {
            return i5 != 2 ? i5 != 3 ? -1 : 7200 : MMKV.ExpireInHour;
        }
        return 1800;
    }

    private static List<q> j(ObjectInput objectInput) throws IOException {
        int i4;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readInt);
        int f4 = f(objectInput);
        long j4 = Long.MIN_VALUE;
        int i5 = f4;
        int i6 = 0;
        while (i6 < readInt) {
            byte readByte = objectInput.readByte();
            boolean z4 = readByte < 0;
            int i7 = (readByte >>> 5) & 3;
            int o4 = o((readByte >>> 2) & 7);
            long readLong = o4 == -1 ? objectInput.readLong() : ((((((((readByte & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255)) * 86400) + f83588j) + o4) - 7200) - f4;
            if (readLong <= j4) {
                throw new StreamCorruptedException(ProtectedSandApp.s("飯\u0001"));
            }
            if (i7 != 1) {
                i4 = i7 != 2 ? i7 != 3 ? f(objectInput) : 7200 : MMKV.ExpireInHour;
            } else {
                i4 = 0;
            }
            if (z4) {
                f4 = f(objectInput);
            }
            int i10 = f4 + (i4 == Integer.MAX_VALUE ? 0 : i4);
            arrayList.add(new q(readLong, i5, i10, i4));
            i6++;
            i5 = i10;
            j4 = readLong;
        }
        return arrayList;
    }

    private static int k(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 3600) {
            return 2;
        }
        if (i4 == 7200) {
            return 3;
        }
        if (i4 == 10800) {
            return 4;
        }
        if (i4 == 79200) {
            return 5;
        }
        if (i4 != 82800) {
            return i4 != 86400 ? 0 : 7;
        }
        return 6;
    }

    private static int l(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 60) {
            return 2;
        }
        if (i4 == 3600) {
            return 3;
        }
        if (i4 == 7200) {
            return 4;
        }
        if (i4 == 10800) {
            return 5;
        }
        if (i4 != 14400) {
            return i4 != 18000 ? 0 : 7;
        }
        return 6;
    }

    private static int m(g gVar) {
        return net.time4j.base.c.g(gVar.c() * 86400) + gVar.f().l(m0.D);
    }

    private static int n(int i4) {
        switch (i4) {
            case 1:
                return 0;
            case 2:
                return MMKV.ExpireInHour;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return MMKV.ExpireInDay;
            default:
                return -1;
        }
    }

    private static int o(int i4) {
        switch (i4) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return MMKV.ExpireInHour;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    private static void p(Object obj, ObjectOutput objectOutput) throws IOException {
        ((a) obj).E(objectOutput);
    }

    private static void q(Object obj, ObjectOutput objectOutput) throws IOException {
        b bVar = (b) obj;
        bVar.u(objectOutput);
        x(bVar.t(), objectOutput);
    }

    private static void r(Object obj, DataOutput dataOutput) throws IOException {
        int i4;
        c cVar = (c) obj;
        boolean u4 = u(cVar, dataOutput);
        dataOutput.writeByte(((cVar.v() << 3) | cVar.w()) & 255);
        boolean z4 = false;
        int i5 = cVar.x() ? 128 : 0;
        int m4 = m(cVar);
        if (m4 % 1800 == 0) {
            i4 = i5 | (m4 / 1800);
            z4 = true;
        } else {
            i4 = i5 | 63;
        }
        dataOutput.writeByte(i4 & 255);
        if (!u4) {
            v(dataOutput, cVar.e());
        }
        if (z4) {
            return;
        }
        dataOutput.writeInt(m4);
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f83592b;
    }

    private static void s(Object obj, DataOutput dataOutput) throws IOException {
        f fVar = (f) obj;
        boolean u4 = u(fVar, dataOutput);
        int v4 = fVar.v() << 3;
        int m4 = m(fVar);
        int k4 = k(m4);
        dataOutput.writeByte((v4 | k4) & 255);
        if (!u4) {
            v(dataOutput, fVar.e());
        }
        if (k4 == 0) {
            dataOutput.writeInt(m4);
        }
    }

    private static void t(Object obj, DataOutput dataOutput) throws IOException {
        int i4;
        boolean z4;
        h hVar = (h) obj;
        boolean u4 = u(hVar, dataOutput);
        int v4 = hVar.v() << 5;
        int m4 = m(hVar);
        if (m4 % MMKV.ExpireInHour == 0) {
            i4 = v4 | (m4 / MMKV.ExpireInHour);
            z4 = true;
        } else {
            i4 = v4 | 31;
            z4 = false;
        }
        dataOutput.writeByte(i4 & 255);
        if (!u4) {
            v(dataOutput, hVar.e());
        }
        if (z4) {
            return;
        }
        dataOutput.writeInt(m4);
    }

    private static boolean u(g gVar, DataOutput dataOutput) throws IOException {
        int i4;
        int l4 = gVar.l() << 4;
        int ordinal = gVar.d().ordinal();
        int e4 = gVar.e();
        boolean z4 = true;
        if (e4 != 0) {
            if (e4 == 1800) {
                ordinal += 3;
            } else if (e4 == 3600) {
                ordinal += 6;
            } else {
                if (e4 != 7200) {
                    i4 = l4 | (ordinal + 12);
                    z4 = false;
                    dataOutput.writeByte(i4 & 255);
                    return z4;
                }
                ordinal += 9;
            }
        }
        i4 = l4 | ordinal;
        dataOutput.writeByte(i4 & 255);
        return z4;
    }

    private static void v(DataOutput dataOutput, int i4) throws IOException {
        if (i4 % w.b.f22438j == 0) {
            dataOutput.writeByte(i4 / w.b.f22438j);
        } else {
            dataOutput.writeByte(127);
            dataOutput.writeInt(i4);
        }
    }

    private static void w(Object obj, ObjectOutput objectOutput) throws IOException {
        j jVar = (j) obj;
        q u4 = jVar.u();
        long e4 = u4.e();
        if (e4 < f83588j || e4 >= 10464767099L || e4 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(u4.e());
        } else {
            int i4 = (int) ((e4 - f83588j) / 900);
            objectOutput.writeByte((i4 >>> 16) & 255);
            objectOutput.writeByte((i4 >>> 8) & 255);
            objectOutput.writeByte(i4 & 255);
        }
        v(objectOutput, u4.f());
        v(objectOutput, u4.i());
        v(objectOutput, u4.d());
        x(jVar.w(), objectOutput);
    }

    private static void x(List<d> list, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(list.size());
        for (d dVar : list) {
            objectOutput.writeByte(dVar.g());
            switch (dVar.g()) {
                case 120:
                    s(dVar, objectOutput);
                    break;
                case 121:
                    r(dVar, objectOutput);
                    break;
                case 122:
                    t(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    private static int y(q qVar, int i4, DataOutput dataOutput) throws IOException {
        int h4 = qVar.h();
        int i5 = 0;
        boolean z4 = h4 != i4;
        byte b5 = z4 ? (byte) 128 : (byte) 0;
        int d5 = qVar.d();
        int i6 = d5 != 0 ? d5 != 3600 ? d5 != 7200 ? 0 : 3 : 2 : 1;
        byte b6 = (byte) (b5 | (i6 << 5));
        long e4 = qVar.e() + i4;
        long j4 = 7200 + e4;
        if (j4 >= f83588j && j4 < 18067104000L) {
            i5 = l(net.time4j.base.c.d(j4, MMKV.ExpireInDay));
        }
        byte b7 = (byte) ((i5 << 2) | b6);
        if (i5 == 0) {
            dataOutput.writeByte(b7);
            dataOutput.writeLong(qVar.e());
        } else {
            int i7 = (int) ((e4 + 4575751200L) / 86400);
            dataOutput.writeByte((byte) (b7 | ((byte) ((i7 >>> 16) & 3))));
            dataOutput.writeByte((i7 >>> 8) & 255);
            dataOutput.writeByte(i7 & 255);
        }
        if (i6 == 0) {
            v(dataOutput, d5);
        }
        if (z4) {
            v(dataOutput, h4);
        }
        return h4;
    }

    static void z(q[] qVarArr, int i4, DataOutput dataOutput) throws IOException {
        int min = Math.min(i4, qVarArr.length);
        dataOutput.writeInt(min);
        if (min > 0) {
            int f4 = qVarArr[0].f();
            v(dataOutput, f4);
            for (int i5 = 0; i5 < min; i5++) {
                f4 = y(qVarArr[i5], f4, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (objectInput.readByte()) {
            case 120:
                this.f83592b = d(objectInput);
                return;
            case 121:
                this.f83592b = c(objectInput);
                return;
            case 122:
                this.f83592b = e(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException(ProtectedSandApp.s("飰\u0001"));
            case 125:
                this.f83592b = g(objectInput);
                return;
            case 126:
                this.f83592b = a(objectInput);
                return;
            case Byte.MAX_VALUE:
                this.f83592b = b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f83593c);
        switch (this.f83593c) {
            case 120:
                s(this.f83592b, objectOutput);
                return;
            case 121:
                r(this.f83592b, objectOutput);
                return;
            case 122:
                t(this.f83592b, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException(ProtectedSandApp.s("飰\u0001"));
            case 125:
                w(this.f83592b, objectOutput);
                return;
            case 126:
                p(this.f83592b, objectOutput);
                return;
            case 127:
                q(this.f83592b, objectOutput);
                return;
        }
    }

    SPX(Object obj, int i4) {
        this.f83592b = obj;
        this.f83593c = i4;
    }
}
