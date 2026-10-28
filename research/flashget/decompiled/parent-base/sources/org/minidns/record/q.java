package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.minidns.record.u;

/* compiled from: OPT.java */
/* loaded from: classes9.dex */
public class q extends h {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f87477e = false;

    /* renamed from: d, reason: collision with root package name */
    public final List<org.minidns.edns.b> f87478d;

    public q() {
        this(Collections.emptyList());
    }

    public static q h(DataInputStream dataInputStream, int i4) throws IOException {
        List list;
        if (i4 == 0) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(4);
            while (i4 > 0) {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort2];
                dataInputStream.read(bArr);
                arrayList.add(org.minidns.edns.b.d(readUnsignedShort, bArr));
                i4 -= readUnsignedShort2 + 4;
            }
            list = arrayList;
        }
        return new q(list);
    }

    @Override // org.minidns.record.h
    public u.c a() {
        return u.c.OPT;
    }

    @Override // org.minidns.record.h
    protected void c(DataOutputStream dataOutputStream) throws IOException {
        Iterator<org.minidns.edns.b> it = this.f87478d.iterator();
        while (it.hasNext()) {
            it.next().f(dataOutputStream);
        }
    }

    public q(List<org.minidns.edns.b> list) {
        this.f87478d = Collections.unmodifiableList(list);
    }
}
