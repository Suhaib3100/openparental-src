package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.s;

/* compiled from: Ser.java */
/* loaded from: classes9.dex */
final class a implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f88408d = -8885321777449118786L;

    /* renamed from: e, reason: collision with root package name */
    static final byte f88409e = 1;

    /* renamed from: f, reason: collision with root package name */
    static final byte f88410f = 2;

    /* renamed from: g, reason: collision with root package name */
    static final byte f88411g = 3;

    /* renamed from: b, reason: collision with root package name */
    private byte f88412b;

    /* renamed from: c, reason: collision with root package name */
    private Object f88413c;

    public a() {
    }

    static Object a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return c(dataInput.readByte(), dataInput);
    }

    static long b(DataInput dataInput) throws IOException {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    private static Object c(byte b5, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b5 == 1) {
            return b.t(dataInput);
        }
        if (b5 == 2) {
            return d.n(dataInput);
        }
        if (b5 == 3) {
            return e.m(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static s d(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? s.A(dataInput.readInt()) : s.A(readByte * 900);
    }

    static void e(Object obj, DataOutput dataOutput) throws IOException {
        g((byte) 1, obj, dataOutput);
    }

    static void f(long j4, DataOutput dataOutput) throws IOException {
        if (j4 < -4575744000L || j4 >= 10413792000L || j4 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j4);
        } else {
            int i4 = (int) ((j4 + 4575744000L) / 900);
            dataOutput.writeByte((i4 >>> 16) & 255);
            dataOutput.writeByte((i4 >>> 8) & 255);
            dataOutput.writeByte(i4 & 255);
        }
    }

    private static void g(byte b5, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b5);
        if (b5 == 1) {
            ((b) obj).u(dataOutput);
        } else if (b5 == 2) {
            ((d) obj).p(dataOutput);
        } else {
            if (b5 != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((e) obj).n(dataOutput);
        }
    }

    static void h(s sVar, DataOutput dataOutput) throws IOException {
        int v4 = sVar.v();
        int i4 = v4 % w.b.f22438j == 0 ? v4 / w.b.f22438j : 127;
        dataOutput.writeByte(i4);
        if (i4 == 127) {
            dataOutput.writeInt(v4);
        }
    }

    private Object readResolve() {
        return this.f88413c;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.f88412b = readByte;
        this.f88413c = c(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        g(this.f88412b, this.f88413c, objectOutput);
    }

    a(byte b5, Object obj) {
        this.f88412b = b5;
        this.f88413c = obj;
    }
}
