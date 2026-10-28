package com.google.firebase.crashlytics.ndk;

import androidx.annotation.q0;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.File;

/* compiled from: SessionFiles.java */
/* loaded from: classes6.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public final c f59585a;

    /* renamed from: b, reason: collision with root package name */
    public final File f59586b;

    /* renamed from: c, reason: collision with root package name */
    public final File f59587c;

    /* renamed from: d, reason: collision with root package name */
    public final File f59588d;

    /* renamed from: e, reason: collision with root package name */
    public final File f59589e;

    /* renamed from: f, reason: collision with root package name */
    public final File f59590f;

    /* renamed from: g, reason: collision with root package name */
    public final File f59591g;

    /* compiled from: SessionFiles.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private c f59592a;

        /* renamed from: b, reason: collision with root package name */
        private File f59593b;

        /* renamed from: c, reason: collision with root package name */
        private File f59594c;

        /* renamed from: d, reason: collision with root package name */
        private File f59595d;

        /* renamed from: e, reason: collision with root package name */
        private File f59596e;

        /* renamed from: f, reason: collision with root package name */
        private File f59597f;

        /* renamed from: g, reason: collision with root package name */
        private File f59598g;

        b() {
        }

        b h(File file) {
            this.f59596e = file;
            return this;
        }

        b i(File file) {
            this.f59593b = file;
            return this;
        }

        k j() {
            return new k(this);
        }

        b k(File file) {
            this.f59597f = file;
            return this;
        }

        b l(File file) {
            this.f59594c = file;
            return this;
        }

        b m(c cVar) {
            this.f59592a = cVar;
            return this;
        }

        b n(File file) {
            this.f59598g = file;
            return this;
        }

        b o(File file) {
            this.f59595d = file;
            return this;
        }
    }

    /* compiled from: SessionFiles.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        @q0
        public final File f59599a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        public final g0.a f59600b;

        c(@q0 File file, @q0 g0.a aVar) {
            this.f59599a = file;
            this.f59600b = aVar;
        }

        boolean a() {
            File file = this.f59599a;
            return (file != null && file.exists()) || this.f59600b != null;
        }
    }

    private k(b bVar) {
        this.f59585a = bVar.f59592a;
        this.f59586b = bVar.f59593b;
        this.f59587c = bVar.f59594c;
        this.f59588d = bVar.f59595d;
        this.f59589e = bVar.f59596e;
        this.f59590f = bVar.f59597f;
        this.f59591g = bVar.f59598g;
    }
}
