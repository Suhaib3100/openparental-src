package com.github.gzuliyujiang.oaid.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: DefaultImpl.java */
/* loaded from: classes3.dex */
class d implements com.github.gzuliyujiang.oaid.f {
    d() {
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        return false;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        if (getter == null) {
            return;
        }
        getter.b(new OAIDException(ProtectedSandApp.s("ỿ")));
    }
}
