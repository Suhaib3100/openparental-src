package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

/* compiled from: FileEntry.java */
/* loaded from: classes4.dex */
public class e implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    static final e[] f85571j = new e[0];

    /* renamed from: b, reason: collision with root package name */
    private final e f85572b;

    /* renamed from: c, reason: collision with root package name */
    private e[] f85573c;

    /* renamed from: d, reason: collision with root package name */
    private final File f85574d;

    /* renamed from: e, reason: collision with root package name */
    private String f85575e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f85576f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f85577g;

    /* renamed from: h, reason: collision with root package name */
    private long f85578h;

    /* renamed from: i, reason: collision with root package name */
    private long f85579i;

    public e(File file) {
        this(null, file);
    }

    public e[] a() {
        e[] eVarArr = this.f85573c;
        return eVarArr != null ? eVarArr : f85571j;
    }

    public File b() {
        return this.f85574d;
    }

    public long c() {
        return this.f85578h;
    }

    public long d() {
        return this.f85579i;
    }

    public int e() {
        e eVar = this.f85572b;
        if (eVar == null) {
            return 0;
        }
        return eVar.e() + 1;
    }

    public String f() {
        return this.f85575e;
    }

    public e g() {
        return this.f85572b;
    }

    public boolean h() {
        return this.f85577g;
    }

    public boolean i() {
        return this.f85576f;
    }

    public e j(File file) {
        return new e(this, file);
    }

    public boolean k(File file) {
        boolean z4 = this.f85576f;
        long j4 = this.f85578h;
        boolean z5 = this.f85577g;
        long j5 = this.f85579i;
        this.f85575e = file.getName();
        boolean exists = file.exists();
        this.f85576f = exists;
        this.f85577g = exists ? file.isDirectory() : false;
        long j6 = 0;
        this.f85578h = this.f85576f ? file.lastModified() : 0L;
        if (this.f85576f && !this.f85577g) {
            j6 = file.length();
        }
        this.f85579i = j6;
        return (this.f85576f == z4 && this.f85578h == j4 && this.f85577g == z5 && j6 == j5) ? false : true;
    }

    public void l(e[] eVarArr) {
        this.f85573c = eVarArr;
    }

    public void m(boolean z4) {
        this.f85577g = z4;
    }

    public void n(boolean z4) {
        this.f85576f = z4;
    }

    public void o(long j4) {
        this.f85578h = j4;
    }

    public void p(long j4) {
        this.f85579i = j4;
    }

    public void q(String str) {
        this.f85575e = str;
    }

    public e(e eVar, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.f85574d = file;
        this.f85572b = eVar;
        this.f85575e = file.getName();
    }
}
