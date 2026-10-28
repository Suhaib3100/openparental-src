package org.minidns.dnssec;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.minidns.dnslabel.DnsLabel;
import org.minidns.dnssec.d;
import org.minidns.record.h;
import org.minidns.record.i;
import org.minidns.record.m;
import org.minidns.record.o;
import org.minidns.record.s;
import org.minidns.record.u;

/* compiled from: Verifier.java */
/* loaded from: classes5.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final org.minidns.dnssec.algorithms.a f87298a = org.minidns.dnssec.algorithms.a.f87254e;

    /* compiled from: Verifier.java */
    class a implements Comparator<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87299b;

        a(int i4) {
            this.f87299b = i4;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            for (int i4 = this.f87299b; i4 < bArr.length && i4 < bArr2.length; i4++) {
                byte b5 = bArr[i4];
                byte b6 = bArr2[i4];
                if (b5 != b6) {
                    length = b5 & 255;
                    length2 = b6 & 255;
                    break;
                }
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    f() {
    }

    static byte[] a(s sVar, List<u<? extends h>> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            sVar.m(dataOutputStream);
            org.minidns.dnsname.a aVar = list.get(0).f87493a;
            if (!aVar.B()) {
                if (aVar.s() < sVar.f87483g) {
                    throw new DnssecValidationFailedException("Invalid RRsig record");
                }
                int s4 = aVar.s();
                byte b5 = sVar.f87483g;
                if (s4 > b5) {
                    aVar = org.minidns.dnsname.a.j(DnsLabel.f87153g, aVar.N(b5));
                }
            }
            org.minidns.dnsname.a aVar2 = aVar;
            ArrayList arrayList = new ArrayList(list.size());
            for (u<? extends h> uVar : list) {
                arrayList.add(new u(aVar2, uVar.f87494b, uVar.f87496d, sVar.f87484h, uVar.f87498f).l());
            }
            Collections.sort(arrayList, new a(aVar2.M() + 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dataOutputStream.write((byte[]) it.next());
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    static byte[] b(org.minidns.dnssec.a aVar, m mVar, org.minidns.dnsname.a aVar2, int i4) {
        return c(aVar, mVar.m(), aVar2.n(), i4);
    }

    static byte[] c(org.minidns.dnssec.a aVar, byte[] bArr, byte[] bArr2, int i4) {
        while (true) {
            int i5 = i4 - 1;
            if (i4 < 0) {
                return bArr2;
            }
            byte[] bArr3 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, bArr2.length, bArr.length);
            bArr2 = aVar.a(bArr3);
            i4 = i5;
        }
    }

    static boolean d(String str, String str2, String str3) {
        return e(org.minidns.dnsname.a.h(str), org.minidns.dnsname.a.h(str2), org.minidns.dnsname.a.h(str3));
    }

    static boolean e(org.minidns.dnsname.a aVar, org.minidns.dnsname.a aVar2, org.minidns.dnsname.a aVar3) {
        int s4 = aVar2.s();
        int s5 = aVar3.s();
        int s6 = aVar.s();
        if (s6 > s4 && !aVar.z(aVar2) && aVar.N(s4).compareTo(aVar2) < 0) {
            return false;
        }
        if (s6 <= s4 && aVar.compareTo(aVar2.N(s6)) < 0) {
            return false;
        }
        if (s6 <= s5 || aVar.z(aVar3) || aVar.N(s5).compareTo(aVar3) <= 0) {
            return s6 > s5 || aVar.compareTo(aVar3.N(s6)) < 0;
        }
        return false;
    }

    public static d f(List<u<? extends h>> list, s sVar, org.minidns.record.f fVar) throws IOException {
        e c5 = f87298a.c(sVar.f87481e);
        if (c5 == null) {
            return new d.b(sVar.f87482f, sVar.a(), list.get(0));
        }
        if (c5.a(a(sVar, list), sVar, fVar)) {
            return null;
        }
        throw new DnssecValidationFailedException(list, "Signature is invalid.");
    }

    public static d g(u<org.minidns.record.f> uVar, i iVar) throws DnssecValidationFailedException {
        org.minidns.record.f fVar = uVar.f87498f;
        org.minidns.dnssec.a a5 = f87298a.a(iVar.f87438g);
        if (a5 == null) {
            return new d.b(iVar.f87439h, iVar.a(), uVar);
        }
        byte[] e4 = fVar.e();
        byte[] n4 = uVar.f87493a.n();
        byte[] bArr = new byte[n4.length + e4.length];
        System.arraycopy(n4, 0, bArr, 0, n4.length);
        System.arraycopy(e4, 0, bArr, n4.length, e4.length);
        try {
            if (iVar.h(a5.a(bArr))) {
                return null;
            }
            throw new DnssecValidationFailedException(uVar, "SEP is not properly signed by parent DS!");
        } catch (Exception e5) {
            return new d.a(iVar.f87438g, "DS", uVar, e5);
        }
    }

    public static d h(u<o> uVar, org.minidns.dnsmessage.b bVar) {
        o oVar = uVar.f87498f;
        if ((!uVar.f87493a.equals(bVar.f87207a) || oVar.f87474f.contains(bVar.f87208b)) && !e(bVar.f87207a, uVar.f87493a, oVar.f87472d)) {
            return new d.C1354d(bVar, uVar);
        }
        return null;
    }

    public static d i(org.minidns.dnsname.a aVar, u<m> uVar, org.minidns.dnsmessage.b bVar) {
        m mVar = uVar.f87498f;
        org.minidns.dnssec.a b5 = f87298a.b(mVar.f87455d);
        if (b5 == null) {
            return new d.b(mVar.f87456e, mVar.a(), uVar);
        }
        String a5 = org.minidns.util.a.a(b(b5, mVar, bVar.f87207a, mVar.f87458g));
        if (uVar.f87493a.equals(org.minidns.dnsname.a.h(a5 + "." + ((Object) aVar)))) {
            if (mVar.f87462k.contains(bVar.f87208b)) {
                return new d.C1354d(bVar, uVar);
            }
            return null;
        }
        if (d(a5, uVar.f87493a.p(), org.minidns.util.a.a(mVar.j()))) {
            return null;
        }
        return new d.C1354d(bVar, uVar);
    }
}
