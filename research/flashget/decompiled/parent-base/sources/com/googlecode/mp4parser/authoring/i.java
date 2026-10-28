package com.googlecode.mp4parser.authoring;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.k;
import java.util.Date;

/* compiled from: TrackMetaData.java */
/* loaded from: classes6.dex */
public class i implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private long f63418c;

    /* renamed from: g, reason: collision with root package name */
    private double f63422g;

    /* renamed from: h, reason: collision with root package name */
    private double f63423h;

    /* renamed from: i, reason: collision with root package name */
    private float f63424i;

    /* renamed from: l, reason: collision with root package name */
    int f63427l;

    /* renamed from: b, reason: collision with root package name */
    private String f63417b = ProtectedSandApp.s("\u0cd8\u0001");

    /* renamed from: d, reason: collision with root package name */
    private Date f63419d = new Date();

    /* renamed from: e, reason: collision with root package name */
    private Date f63420e = new Date();

    /* renamed from: f, reason: collision with root package name */
    private k f63421f = k.f64099j;

    /* renamed from: j, reason: collision with root package name */
    private long f63425j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f63426k = 0;

    public Date b() {
        return this.f63420e;
    }

    public int c() {
        return this.f63426k;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public double d() {
        return this.f63423h;
    }

    public String e() {
        return this.f63417b;
    }

    public int f() {
        return this.f63427l;
    }

    public k g() {
        return this.f63421f;
    }

    public Date i() {
        return this.f63419d;
    }

    public long k() {
        return this.f63418c;
    }

    public long l() {
        return this.f63425j;
    }

    public float m() {
        return this.f63424i;
    }

    public double n() {
        return this.f63422g;
    }

    public void o(Date date) {
        this.f63420e = date;
    }

    public void p(int i4) {
        this.f63426k = i4;
    }

    public void q(double d5) {
        this.f63423h = d5;
    }

    public void r(String str) {
        this.f63417b = str;
    }

    public void s(int i4) {
        this.f63427l = i4;
    }

    public void t(k kVar) {
        this.f63421f = kVar;
    }

    public void u(Date date) {
        this.f63419d = date;
    }

    public void v(long j4) {
        this.f63418c = j4;
    }

    public void w(long j4) {
        this.f63425j = j4;
    }

    public void y(float f4) {
        this.f63424i = f4;
    }

    public void z(double d5) {
        this.f63422g = d5;
    }
}
