package com.github.gzuliyujiang.oaid.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;

/* compiled from: DefaultImpl.java */
/* loaded from: classes5.dex */
class d implements com.github.gzuliyujiang.oaid.h {
    d() {
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        return false;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        if (getter == null) {
            return;
        }
        getter.b(new OAIDException(ProtectedSandApp.s("썿")));
    }
}
