package org.apache.tools.zip;

import androidx.collection.r2;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.ZipException;

/* compiled from: ExtraFieldUtils.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Hashtable f86731a = new Hashtable();

    static {
        e(a.class);
        e(c.class);
    }

    public static g a(k kVar) throws InstantiationException, IllegalAccessException {
        Class cls = (Class) f86731a.get(kVar);
        if (cls != null) {
            return (g) cls.newInstance();
        }
        e eVar = new e();
        eVar.h(kVar);
        return eVar;
    }

    public static byte[] b(g[] gVarArr) {
        int length = gVarArr.length * 4;
        for (g gVar : gVarArr) {
            length += gVar.e().c();
        }
        byte[] bArr = new byte[length];
        int i4 = 0;
        for (int i5 = 0; i5 < gVarArr.length; i5++) {
            System.arraycopy(gVarArr[i5].b().b(), 0, bArr, i4, 2);
            System.arraycopy(gVarArr[i5].e().b(), 0, bArr, i4 + 2, 2);
            byte[] d5 = gVarArr[i5].d();
            System.arraycopy(d5, 0, bArr, i4 + 4, d5.length);
            i4 += d5.length + 4;
        }
        return bArr;
    }

    public static byte[] c(g[] gVarArr) {
        int length = gVarArr.length * 4;
        for (g gVar : gVarArr) {
            length += gVar.f().c();
        }
        byte[] bArr = new byte[length];
        int i4 = 0;
        for (int i5 = 0; i5 < gVarArr.length; i5++) {
            System.arraycopy(gVarArr[i5].b().b(), 0, bArr, i4, 2);
            System.arraycopy(gVarArr[i5].f().b(), 0, bArr, i4 + 2, 2);
            byte[] c5 = gVarArr[i5].c();
            System.arraycopy(c5, 0, bArr, i4 + 4, c5.length);
            i4 += c5.length + 4;
        }
        return bArr;
    }

    public static g[] d(byte[] bArr) throws ZipException {
        Vector vector = new Vector();
        int i4 = 0;
        while (i4 <= bArr.length - 4) {
            k kVar = new k(bArr, i4);
            int c5 = new k(bArr, i4 + 2).c();
            int i5 = i4 + 4;
            if (i5 + c5 > bArr.length) {
                throw new ZipException(r2.a("data starting at ", i4, " is in unknown format"));
            }
            try {
                g a5 = a(kVar);
                a5.g(bArr, i5, c5);
                vector.addElement(a5);
                i4 += c5 + 4;
            } catch (IllegalAccessException e4) {
                throw new ZipException(e4.getMessage());
            } catch (InstantiationException e5) {
                throw new ZipException(e5.getMessage());
            }
        }
        if (i4 != bArr.length) {
            throw new ZipException(r2.a("data starting at ", i4, " is in unknown format"));
        }
        g[] gVarArr = new g[vector.size()];
        vector.copyInto(gVarArr);
        return gVarArr;
    }

    public static void e(Class cls) {
        try {
            f86731a.put(((g) cls.newInstance()).b(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }
}
