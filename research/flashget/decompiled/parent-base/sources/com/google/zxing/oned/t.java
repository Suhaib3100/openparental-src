package com.google.zxing.oned;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* compiled from: UPCAReader.java */
/* loaded from: classes6.dex */
public final class t extends y {

    /* renamed from: k, reason: collision with root package name */
    private final y f63144k = new i();

    private static com.google.zxing.n s(com.google.zxing.n nVar) throws FormatException {
        String g4 = nVar.g();
        if (g4.charAt(0) != '0') {
            throw FormatException.a();
        }
        com.google.zxing.n nVar2 = new com.google.zxing.n(g4.substring(1), null, nVar.f(), com.google.zxing.a.UPC_A);
        if (nVar.e() != null) {
            nVar2.i(nVar.e());
        }
        return nVar2;
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public com.google.zxing.n a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        return s(this.f63144k.a(cVar, map));
    }

    @Override // com.google.zxing.oned.y, com.google.zxing.oned.r
    public com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return s(this.f63144k.b(i4, aVar, map));
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.m
    public com.google.zxing.n c(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return s(this.f63144k.c(cVar));
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.f63144k.l(aVar, iArr, sb);
    }

    @Override // com.google.zxing.oned.y
    public com.google.zxing.n m(int i4, com.google.zxing.common.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return s(this.f63144k.m(i4, aVar, iArr, map));
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_A;
    }
}
