package net.time4j.history;

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
import net.time4j.engine.b0;
import net.time4j.l0;

/* loaded from: classes7.dex */
final class SPX implements Externalizable {

    /* renamed from: d, reason: collision with root package name */
    static final int f83143d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final int f83144e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final int f83145f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f83146g = new int[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private transient Object f83147b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f83148c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83149a;

        static {
            int[] iArr = new int[net.time4j.history.internal.b.values().length];
            f83149a = iArr;
            try {
                iArr[net.time4j.history.internal.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83149a[net.time4j.history.internal.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83149a[net.time4j.history.internal.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83149a[net.time4j.history.internal.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83149a[net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    private static net.time4j.history.internal.b a(int i4) throws StreamCorruptedException {
        for (net.time4j.history.internal.b bVar : net.time4j.history.internal.b.values()) {
            if (bVar.getSerialValue() == i4) {
                return bVar;
            }
        }
        throw new StreamCorruptedException(ProtectedSandApp.s("阡\u0001"));
    }

    private d b(DataInput dataInput, byte b5) throws IOException, ClassNotFoundException {
        int i4 = a.f83149a[a(b5 & com.google.common.base.c.f54871q).ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? d.F(l0.w1(dataInput.readLong(), b0.MODIFIED_JULIAN_DATE)) : d.D() : d.G() : d.f83161t : d.f83160s : d.f83159r;
    }

    private static net.time4j.history.a c(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            iArr[i4] = 1 - dataInput.readInt();
        }
        return net.time4j.history.a.f(iArr);
    }

    private void d(DataOutput dataOutput) throws IOException {
        d dVar = (d) this.f83147b;
        dataOutput.writeByte(dVar.s().getSerialValue() | (this.f83148c << 4));
        if (dVar.s() == net.time4j.history.internal.b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(dVar.p().get(0).f83186a);
        }
        int[] e4 = dVar.w() ? dVar.l().e() : f83146g;
        dataOutput.writeInt(e4.length);
        for (int i4 : e4) {
            dataOutput.writeInt(i4);
        }
        dVar.v().g(dataOutput);
        dVar.o().j(dataOutput);
    }

    private Object readResolve() throws ObjectStreamException {
        return this.f83147b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        d b5;
        byte readByte = objectInput.readByte();
        int i4 = (readByte & 255) >> 4;
        if (i4 == 1) {
            b5 = b(objectInput, readByte);
        } else if (i4 == 2) {
            d b6 = b(objectInput, readByte);
            net.time4j.history.a c5 = c(objectInput);
            b5 = c5 != null ? b6.H(c5) : b6;
        } else {
            if (i4 != 3) {
                throw new StreamCorruptedException(ProtectedSandApp.s("阢\u0001"));
            }
            d b7 = b(objectInput, readByte);
            net.time4j.history.a c6 = c(objectInput);
            if (c6 != null) {
                b7 = b7.H(c6);
            }
            b5 = b7.J(o.e(objectInput)).I(g.i(objectInput));
        }
        this.f83147b = b5;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int i4 = this.f83148c;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            throw new InvalidClassException(ProtectedSandApp.s("阢\u0001"));
        }
        d(objectOutput);
    }

    SPX(Object obj, int i4) {
        this.f83147b = obj;
        this.f83148c = i4;
    }
}
