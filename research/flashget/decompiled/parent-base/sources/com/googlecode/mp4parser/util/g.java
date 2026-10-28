package com.googlecode.mp4parser.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: JuliLogger.java */
/* loaded from: classes6.dex */
public class g extends i {

    /* renamed from: a, reason: collision with root package name */
    Logger f64093a;

    public g(String str) {
        this.f64093a = Logger.getLogger(str);
    }

    @Override // com.googlecode.mp4parser.util.i
    public void b(String str) {
        this.f64093a.log(Level.FINE, str);
    }

    @Override // com.googlecode.mp4parser.util.i
    public void c(String str) {
        this.f64093a.log(Level.SEVERE, str);
    }

    @Override // com.googlecode.mp4parser.util.i
    public void d(String str) {
        this.f64093a.log(Level.WARNING, str);
    }
}
