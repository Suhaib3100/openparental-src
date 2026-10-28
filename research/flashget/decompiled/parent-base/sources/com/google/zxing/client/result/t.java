package com.google.zxing.client.result;

/* compiled from: ProductResultParser.java */
/* loaded from: classes6.dex */
public final class t extends u {
    @Override // com.google.zxing.client.result.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public s k(com.google.zxing.n nVar) {
        com.google.zxing.a b5 = nVar.b();
        if (b5 != com.google.zxing.a.UPC_A && b5 != com.google.zxing.a.UPC_E && b5 != com.google.zxing.a.EAN_8 && b5 != com.google.zxing.a.EAN_13) {
            return null;
        }
        String c5 = u.c(nVar);
        if (u.d(c5, c5.length())) {
            return new s(c5, (b5 == com.google.zxing.a.UPC_E && c5.length() == 8) ? com.google.zxing.oned.a0.s(c5) : c5);
        }
        return null;
    }
}
