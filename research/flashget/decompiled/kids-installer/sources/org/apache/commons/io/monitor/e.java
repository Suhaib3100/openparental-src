package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

/* compiled from: FileEntry.java */
/* loaded from: classes5.dex */
public class e implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    static final e[] f32050w = new e[0];

    /* renamed from: o, reason: collision with root package name */
    private final e f32051o;

    /* renamed from: p, reason: collision with root package name */
    private e[] f32052p;

    /* renamed from: q, reason: collision with root package name */
    private final File f32053q;

    /* renamed from: r, reason: collision with root package name */
    private String f32054r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f32055s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f32056t;

    /* renamed from: u, reason: collision with root package name */
    private long f32057u;

    /* renamed from: v, reason: collision with root package name */
    private long f32058v;

    public e(File file) {
        this(null, file);
    }

    public e[] a() {
        e[] eVarArr = this.f32052p;
        return eVarArr != null ? eVarArr : f32050w;
    }

    public File b() {
        return this.f32053q;
    }

    public long c() {
        return this.f32057u;
    }

    public long d() {
        return this.f32058v;
    }

    public int e() {
        e eVar = this.f32051o;
        if (eVar == null) {
            return 0;
        }
        return eVar.e() + 1;
    }

    public String f() {
        return this.f32054r;
    }

    public e g() {
        return this.f32051o;
    }

    public boolean h() {
        return this.f32056t;
    }

    public boolean i() {
        return this.f32055s;
    }

    public e j(File file) {
        return new e(this, file);
    }

    public boolean k(File file) {
        boolean z5 = this.f32055s;
        long j5 = this.f32057u;
        boolean z6 = this.f32056t;
        long j6 = this.f32058v;
        this.f32054r = file.getName();
        boolean exists = file.exists();
        this.f32055s = exists;
        this.f32056t = exists ? file.isDirectory() : false;
        long j7 = 0;
        this.f32057u = this.f32055s ? file.lastModified() : 0L;
        if (this.f32055s && !this.f32056t) {
            j7 = file.length();
        }
        this.f32058v = j7;
        return (this.f32055s == z5 && this.f32057u == j5 && this.f32056t == z6 && j7 == j6) ? false : true;
    }

    public void l(e[] eVarArr) {
        this.f32052p = eVarArr;
    }

    public void m(boolean z5) {
        this.f32056t = z5;
    }

    public void n(boolean z5) {
        this.f32055s = z5;
    }

    public void o(long j5) {
        this.f32057u = j5;
    }

    public void p(long j5) {
        this.f32058v = j5;
    }

    public void q(String str) {
        this.f32054r = str;
    }

    public e(e eVar, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.f32053q = file;
        this.f32051o = eVar;
        this.f32054r = file.getName();
    }
}
