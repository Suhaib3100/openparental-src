package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: Ser.java */
/* loaded from: classes9.dex */
final class o implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f88294d = -7683839454370182990L;

    /* renamed from: e, reason: collision with root package name */
    static final byte f88295e = 1;

    /* renamed from: f, reason: collision with root package name */
    static final byte f88296f = 2;

    /* renamed from: g, reason: collision with root package name */
    static final byte f88297g = 3;

    /* renamed from: h, reason: collision with root package name */
    static final byte f88298h = 4;

    /* renamed from: i, reason: collision with root package name */
    static final byte f88299i = 5;

    /* renamed from: j, reason: collision with root package name */
    static final byte f88300j = 6;

    /* renamed from: k, reason: collision with root package name */
    static final byte f88301k = 7;

    /* renamed from: l, reason: collision with root package name */
    static final byte f88302l = 8;

    /* renamed from: m, reason: collision with root package name */
    static final byte f88303m = 64;

    /* renamed from: n, reason: collision with root package name */
    static final byte f88304n = 66;

    /* renamed from: o, reason: collision with root package name */
    static final byte f88305o = 67;

    /* renamed from: p, reason: collision with root package name */
    static final byte f88306p = 68;

    /* renamed from: q, reason: collision with root package name */
    static final byte f88307q = 69;

    /* renamed from: b, reason: collision with root package name */
    private byte f88308b;

    /* renamed from: c, reason: collision with root package name */
    private Object f88309c;

    public o() {
    }

    static Object a(DataInput dataInput) throws IOException {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b5, DataInput dataInput) throws IOException {
        if (b5 == 64) {
            return k.E(dataInput);
        }
        switch (b5) {
            case 1:
                return e.Z(dataInput);
            case 2:
                return f.U(dataInput);
            case 3:
                return g.J0(dataInput);
            case 4:
                return h.R0(dataInput);
            case 5:
                return i.e0(dataInput);
            case 6:
                return u.T0(dataInput);
            case 7:
                return t.u(dataInput);
            case 8:
                return s.C(dataInput);
            default:
                switch (b5) {
                    case 66:
                        return m.a0(dataInput);
                    case 67:
                        return p.S(dataInput);
                    case 68:
                        return q.Y(dataInput);
                    case 69:
                        return l.u0(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    static void c(byte b5, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b5);
        if (b5 == 64) {
            ((k) obj).M(dataOutput);
            return;
        }
        switch (b5) {
            case 1:
                ((e) obj).o0(dataOutput);
                return;
            case 2:
                ((f) obj).b0(dataOutput);
                return;
            case 3:
                ((g) obj).V0(dataOutput);
                return;
            case 4:
                ((h) obj).f1(dataOutput);
                return;
            case 5:
                ((i) obj).s0(dataOutput);
                return;
            case 6:
                ((u) obj).s1(dataOutput);
                return;
            case 7:
                ((t) obj).v(dataOutput);
                return;
            case 8:
                ((s) obj).J(dataOutput);
                return;
            default:
                switch (b5) {
                    case 66:
                        ((m) obj).p0(dataOutput);
                        return;
                    case 67:
                        ((p) obj).V(dataOutput);
                        return;
                    case 68:
                        ((q) obj).e0(dataOutput);
                        return;
                    case 69:
                        ((l) obj).U0(dataOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f88309c;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.f88308b = readByte;
        this.f88309c = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.f88308b, this.f88309c, objectOutput);
    }

    o(byte b5, Object obj) {
        this.f88308b = b5;
        this.f88309c = obj;
    }
}
