package com.tencent.beacon.a.c;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* compiled from: DeviceInfo.java */
/* loaded from: classes6.dex */
class d implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f71093a;

    d(e eVar) {
        this.f71093a = eVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches(ProtectedSandApp.s("〾\u0001"), file.getName());
    }
}
