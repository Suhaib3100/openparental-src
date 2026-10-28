package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ByteArrayPool.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f41008e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f41009a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f41010b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f41011c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f41012d;

    /* compiled from: ByteArrayPool.java */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public h(int i4) {
        this.f41012d = i4;
    }

    private synchronized void c() {
        while (this.f41011c > this.f41012d) {
            byte[] remove = this.f41009a.remove(0);
            this.f41010b.remove(remove);
            this.f41011c -= remove.length;
        }
    }

    public synchronized byte[] a(int i4) {
        for (int i5 = 0; i5 < this.f41010b.size(); i5++) {
            byte[] bArr = this.f41010b.get(i5);
            if (bArr.length >= i4) {
                this.f41011c -= bArr.length;
                this.f41010b.remove(i5);
                this.f41009a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i4];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f41012d) {
                this.f41009a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f41010b, bArr, f41008e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f41010b.add(binarySearch, bArr);
                this.f41011c += bArr.length;
                c();
            }
        }
    }
}
