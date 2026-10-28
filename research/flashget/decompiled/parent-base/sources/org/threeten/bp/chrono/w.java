package org.threeten.bp.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: Ser.java */
/* loaded from: classes9.dex */
final class w implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f88047d = 7857518227608961174L;

    /* renamed from: e, reason: collision with root package name */
    static final byte f88048e = 1;

    /* renamed from: f, reason: collision with root package name */
    static final byte f88049f = 2;

    /* renamed from: g, reason: collision with root package name */
    static final byte f88050g = 3;

    /* renamed from: h, reason: collision with root package name */
    static final byte f88051h = 4;

    /* renamed from: i, reason: collision with root package name */
    static final byte f88052i = 5;

    /* renamed from: j, reason: collision with root package name */
    static final byte f88053j = 6;

    /* renamed from: k, reason: collision with root package name */
    static final byte f88054k = 7;

    /* renamed from: l, reason: collision with root package name */
    static final byte f88055l = 8;

    /* renamed from: m, reason: collision with root package name */
    static final byte f88056m = 11;

    /* renamed from: n, reason: collision with root package name */
    static final byte f88057n = 12;

    /* renamed from: o, reason: collision with root package name */
    static final byte f88058o = 13;

    /* renamed from: b, reason: collision with root package name */
    private byte f88059b;

    /* renamed from: c, reason: collision with root package name */
    private Object f88060c;

    public w() {
    }

    static Object a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return b(objectInput.readByte(), objectInput);
    }

    private static Object b(byte b5, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b5) {
            case 1:
                return r.u0(objectInput);
            case 2:
                return s.p(objectInput);
            case 3:
                return m.X0(objectInput);
            case 4:
                return n.readExternal(objectInput);
            case 5:
                return u.s0(objectInput);
            case 6:
                return v.readExternal(objectInput);
            case 7:
                return y.s0(objectInput);
            case 8:
                return z.readExternal(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return j.C(objectInput);
            case 12:
                return e.U(objectInput);
            case 13:
                return i.V(objectInput);
        }
    }

    private static void c(byte b5, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                ((r) obj).A0(objectOutput);
                return;
            case 2:
                ((s) obj).u(objectOutput);
                return;
            case 3:
                ((m) obj).b1(objectOutput);
                return;
            case 4:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((u) obj).w0(objectOutput);
                return;
            case 6:
                ((v) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((y) obj).w0(objectOutput);
                return;
            case 8:
                ((z) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((j) obj).K(objectOutput);
                return;
            case 12:
                ((e) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((i) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.f88060c;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.f88059b = readByte;
        this.f88060c = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.f88059b, this.f88060c, objectOutput);
    }

    w(byte b5, Object obj) {
        this.f88059b = b5;
        this.f88060c = obj;
    }
}
